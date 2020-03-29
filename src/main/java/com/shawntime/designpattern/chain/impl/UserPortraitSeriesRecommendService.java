package com.shawntime.designpattern.chain.impl;

import java.util.ArrayList;
import java.util.List;

import com.shawntime.designpattern.chain.AbstractBaseSeriesRecommendService;
import com.shawntime.designpattern.chain.SeriesRecommendIn;
import com.shawntime.designpattern.chain.SeriesRecommendTypeEnum;
import com.shawntime.designpattern.chain.TuanActivities;
import org.springframework.stereotype.Service;

/**
 * @author mashaohua
 * 用户画像偏好车系
 */
@Service
public class UserPortraitSeriesRecommendService extends AbstractBaseSeriesRecommendService {

    @Override
    protected List<TuanActivities> getRecommendSeriesList(SeriesRecommendIn in) {
        if (in.getSeriesId() <= 0) {
            return new ArrayList<>();
        }
        List<TuanActivities> seriesList = new ArrayList<>();
        // 用户画像偏好车系
        return seriesList;
    }

    @Override
    protected SeriesRecommendTypeEnum getSeriesRecommendTypeEnum() {
        return SeriesRecommendTypeEnum.USER_PORTRAIT;
    }
}
