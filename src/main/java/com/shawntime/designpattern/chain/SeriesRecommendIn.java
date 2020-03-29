package com.shawntime.designpattern.chain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author mashaohua
 */
public class SeriesRecommendIn {

    private int subjectId;

    private int cityId;

    private int activityId;

    private int seriesId;

    private int topNum;

    private List<Integer> userPortraitSeriesIdList;

    private Set<Integer> filterSeriesIdList = new HashSet<>();

    private int userPortraitBuySeriesId;

    private String userMobile;

    private boolean isFilterHasGiftTicket;

    private List<Integer> filterActivityIdList = new ArrayList<>();

    private int brandId;

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public int getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }

    public int getTopNum() {
        return topNum;
    }

    public void setTopNum(int topNum) {
        this.topNum = topNum;
    }

    public List<Integer> getUserPortraitSeriesIdList() {
        return userPortraitSeriesIdList;
    }

    public void setUserPortraitSeriesIdList(List<Integer> userPortraitSeriesIdList) {
        this.userPortraitSeriesIdList = userPortraitSeriesIdList;
    }

    public Set<Integer> getFilterSeriesIdList() {
        return filterSeriesIdList;
    }

    public void setFilterSeriesIdList(Set<Integer> filterSeriesIdList) {
        this.filterSeriesIdList = filterSeriesIdList;
    }

    public int getUserPortraitBuySeriesId() {
        return userPortraitBuySeriesId;
    }

    public void setUserPortraitBuySeriesId(int userPortraitBuySeriesId) {
        this.userPortraitBuySeriesId = userPortraitBuySeriesId;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public boolean isFilterHasGiftTicket() {
        return isFilterHasGiftTicket;
    }

    public void setFilterHasGiftTicket(boolean filterHasGiftTicket) {
        isFilterHasGiftTicket = filterHasGiftTicket;
    }

    public List<Integer> getFilterActivityIdList() {
        return filterActivityIdList;
    }

    public void setFilterActivityIdList(List<Integer> filterActivityIdList) {
        this.filterActivityIdList = filterActivityIdList;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }
}
