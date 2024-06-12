package com.limits.model;

public class Limits {
    private  int maximum;
    private  int minimum;

    public Limits(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public Limits() {
    }

    @Override
    public String toString() {
        return "Limits{" +
                "maximum=" + maximum +
                ", minimum=" + minimum +
                '}';
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

}
