package com.shawntime.designpattern.chain;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class RecommendSeriesService implements IRecommendSeriesService {

    @Resource
    private List<AbstractBaseSeriesRecommendService> seriesRecommendServiceList;

    @Override
    public List<SeriesRecommendOut> getPopWindowRecommendSeriesList(SeriesRecommendIn in) {
        List<SeriesRecommendTypeEnum> seriesRecommendTypeEnums = new ArrayList<>();
        seriesRecommendTypeEnums.add(SeriesRecommendTypeEnum.USER_PORTRAIT);
        seriesRecommendTypeEnums.add(SeriesRecommendTypeEnum.COMPETING_SERIES);
        seriesRecommendTypeEnums.add(SeriesRecommendTypeEnum.LEADS_COUNT);
        seriesRecommendTypeEnums.add(SeriesRecommendTypeEnum.CURR_ACTIVITY);
        SeriesRecommendChain chain = new SeriesRecommendChain();
        chain.addSeriesRecommendService(seriesRecommendServiceList, seriesRecommendTypeEnums);
        return chain.getRecommendSeriesList(in);
    }

    @Override
    public List<SeriesRecommendOut> getSubjectPageSeriesRecommendSeriesList(SeriesRecommendIn in) {
        List<SeriesRecommendTypeEnum> seriesRecommendTypeEnums = new ArrayList<>();
        seriesRecommendTypeEnums.add(SeriesRecommendTypeEnum.TOP_SERIES);
        seriesRecommendTypeEnums.add(SeriesRecommendTypeEnum.COMPETING_SERIES);
        seriesRecommendTypeEnums.add(SeriesRecommendTypeEnum.USER_PORTRAIT_COMPETING_SERIES);
        SeriesRecommendChain chain = new SeriesRecommendChain();
        chain.addSeriesRecommendService(seriesRecommendServiceList, seriesRecommendTypeEnums);
        return chain.getRecommendSeriesList(in);
    }
}
