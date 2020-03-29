package com.shawntime.designpattern.chain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;

/**
 * @author mashaohua
 */
public class SeriesRecommendChain {

    private List<AbstractBaseSeriesRecommendService> filterSeriesRecommendServiceList;

    public void addSeriesRecommendService(List<AbstractBaseSeriesRecommendService> seriesRecommendServiceList,
                                          List<SeriesRecommendTypeEnum> seriesRecommendTypeEnums) {
        for (SeriesRecommendTypeEnum seriesRecommendTypeEnum : seriesRecommendTypeEnums) {
            addSeriesRecommendService(seriesRecommendServiceList, seriesRecommendTypeEnum);
        }
    }

    public void addSeriesRecommendService(List<AbstractBaseSeriesRecommendService> seriesRecommendServiceList,
                                          SeriesRecommendTypeEnum seriesRecommendTypeEnum) {
        if (filterSeriesRecommendServiceList == null) {
            filterSeriesRecommendServiceList = new ArrayList<>();
        }
        if (CollectionUtils.isEmpty(seriesRecommendServiceList)) {
            return;
        }
        Optional<AbstractBaseSeriesRecommendService> optional = seriesRecommendServiceList.stream()
                .filter(service -> service.getSeriesRecommendTypeEnum() == seriesRecommendTypeEnum)
                .findFirst();
        if (optional.isPresent()) {
            filterSeriesRecommendServiceList.add(optional.get());
        }
    }

    public List<SeriesRecommendOut> getRecommendSeriesList(SeriesRecommendIn in) {
        if (CollectionUtils.isEmpty(filterSeriesRecommendServiceList)) {
            return null;
        }
        List<SeriesRecommendOut> seriesRecommendOuts = new ArrayList<>();
        for (AbstractBaseSeriesRecommendService seriesRecommendService : filterSeriesRecommendServiceList) {
            List<TuanActivities> singleTuanActivitiesList =
                    seriesRecommendService.getRecommendSeriesList(in);
            if (singleTuanActivitiesList == null) {
                singleTuanActivitiesList = new ArrayList<>();
            }
            int num = Math.min(singleTuanActivitiesList.size(), in.getTopNum());
            in.setTopNum(Math.max(in.getTopNum() - singleTuanActivitiesList.size(), 0));
            List<TuanActivities> tuanActivitiesList = singleTuanActivitiesList.subList(0, num);
            tuanActivitiesList.forEach(tuanActivities -> {
                SeriesRecommendOut out = new SeriesRecommendOut();
                out.setTuanActivities(tuanActivities);
                out.setSeriesRecommendTypeEnum(seriesRecommendService.getSeriesRecommendTypeEnum());
                seriesRecommendOuts.add(out);
            });
            Set<Integer> filterSeriesIdList = getFilterSeriesIdList(seriesRecommendOuts);
            in.setFilterSeriesIdList(filterSeriesIdList);
            if (in.getTopNum() <= 0) {
                break;
            }
        }
        return seriesRecommendOuts;
    }

    private Set<Integer> getFilterSeriesIdList(List<SeriesRecommendOut> seriesRecommendOuts) {
        if (seriesRecommendOuts == null) {
            return new HashSet<>();
        }
        return seriesRecommendOuts.stream()
                .map(out -> out.getTuanActivities().getSeriesId())
                .collect(Collectors.toSet());
    }
}
