package com.shawntime.designpattern.chain;

public class SeriesRecommendOut {

    private TuanActivities tuanActivities;

    private SeriesRecommendTypeEnum seriesRecommendTypeEnum;

    public TuanActivities getTuanActivities() {
        return tuanActivities;
    }

    public void setTuanActivities(TuanActivities tuanActivities) {
        this.tuanActivities = tuanActivities;
    }

    public SeriesRecommendTypeEnum getSeriesRecommendTypeEnum() {
        return seriesRecommendTypeEnum;
    }

    public void setSeriesRecommendTypeEnum(SeriesRecommendTypeEnum seriesRecommendTypeEnum) {
        this.seriesRecommendTypeEnum = seriesRecommendTypeEnum;
    }
}
