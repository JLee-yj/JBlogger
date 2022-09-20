package com.lee.blog.domain.metrics.appquality;

import com.lee.blog.domain.metrics.MainMetric;
import com.lee.blog.domain.metrics.MainMetricType;
import com.lee.blog.domain.metrics.devquality.BugMetric;
import com.lee.blog.domain.user.UserProfile;

public class AppQualityMetric extends MainMetric {

    private AppMetric appMetric;

    public AppQualityMetric(UserProfile metricOwner){
        this.metricOwner = metricOwner;
        metricOwner.setAppQualityMetric(this);
        this.metricMainType = MainMetricType.APP_QUALITY;
    }

    @Override
    public double getWeight() {
        return metricOwner.getWeight().getAppQualityWeight();
    }
}
