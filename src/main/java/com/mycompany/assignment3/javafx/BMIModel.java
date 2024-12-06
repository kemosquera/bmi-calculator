package com.mycompany.assignment3.javafx;

public class BMIModel {
    private double weight;
    private double height;
    private boolean isImperial;

    public BMIModel(double weight, double height, boolean isImperial) {
        this.weight = weight;
        this.height = height;
        this.isImperial = isImperial;
    }

    public double calculateBMI() {
        double adjustedWeight = isImperial ? weight / 2.205 : weight;
        double adjustedHeight = isImperial ? height / 39.37 : height;
        return adjustedWeight / (adjustedHeight * adjustedHeight);
    }

    public String interpretBMI() {
        double bmi = calculateBMI();
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal weight";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }
}
