package com.shawntime.designpattern.chain;

import java.util.List;

/**
 * @author mashaohua
 */
public abstract class AbstractBaseSeriesRecommendService {

    protected abstract List<TuanActivities> getRecommendSeriesList(SeriesRecommendIn in);

    protected abstract SeriesRecommendTypeEnum getSeriesRecommendTypeEnum();

}
