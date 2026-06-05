package com.selinarslan.demoproject.limits_service.Entity;

public class Limits {
    private Integer minimum;
    private Integer maximum;

    public Limits() {
    }

    public Limits(Integer maximum, Integer minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public Integer getMinimum() {
        return minimum;
    }

    public Integer getMaximum() {
        return maximum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }
}
