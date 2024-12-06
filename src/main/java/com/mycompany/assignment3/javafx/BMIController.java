package com.mycompany.assignment3.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class BMIController {
    @FXML
    private TextField weightField;

    @FXML
    private TextField heightField;

    @FXML
    private RadioButton metricRadio;

    @FXML
    private RadioButton imperialRadio;

    @FXML
    private Label resultLabel;

    @FXML
    private ToggleGroup unitGroup;

    @FXML
    public void initialize() {
        metricRadio.setSelected(true);
    }

    @FXML
    private void calculateBMI() {
        try {
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());
            boolean isImperial = imperialRadio.isSelected();

            BMIModel bmiModel = new BMIModel(weight, height, isImperial);
            double bmi = bmiModel.calculateBMI();
            String interpretation = bmiModel.interpretBMI();

            resultLabel.setText(String.format("BMI: %.2f\nCategory: %s", bmi, interpretation));
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input. Please enter numbers.");
        }
    }
}
