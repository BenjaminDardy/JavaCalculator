package models;

import java.util.regex.Pattern;

public class CalculatorModel {
    private float result;
    private String operations = "";


    public String combineNumber(String clickButton){
        this.operations = this.operations + clickButton;
        return operations;
    }

    public float calculate(){
        System.out.println(operations);
        String REGEX = "(-|\\+|\\*)";
        Pattern pattern = Pattern.compile(REGEX);
        String[] parts = pattern.split(operations);
        for(String data:parts){
            System.out.println(data);
        }
        //result = (float) operations;
        return result;
    }

//  GETTERS AND SETTERS
    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }



}
