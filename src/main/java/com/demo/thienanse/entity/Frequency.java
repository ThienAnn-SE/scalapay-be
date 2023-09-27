package com.demo.thienanse.entity;

public class Frequency {
    private Integer number;
    private String frequencyType;

    public Frequency(Integer number, String frequencyType) {
        this.number = number;
        this.frequencyType = frequencyType;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getFrequencyType() {
        return frequencyType;
    }

    public void setFrequencyType(String frequencyType) {
        this.frequencyType = frequencyType;
    }
}
