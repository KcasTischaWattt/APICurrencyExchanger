package com.myroj.coollok4.models;

public class Currency {

    private String code;
    private double evaluation;

    public Currency() {
    }

    public Currency(String code, String name, double evaluation) {
        this.code = code;
        this.evaluation = evaluation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(double evaluation) {
        this.evaluation = evaluation;
    }

    @Override
    public String toString() {
        return code;
    }
}
