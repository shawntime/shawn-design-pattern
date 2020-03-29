package com.shawntime.designpattern.chain;

import java.util.List;

public interface IRecommendSeriesService {

    List<SeriesRecommendOut> getPopWindowRecommendSeriesList(SeriesRecommendIn in);

    List<SeriesRecommendOut> getSubjectPageSeriesRecommendSeriesList(SeriesRecommendIn in);
}
