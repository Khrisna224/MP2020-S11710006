package com.multiplatform;

public class Car {
    private String model;

    //Setter
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("agya")||validModel.equals("xenia")) this.model = model;
        else this.model = "Unknown";
    }

    //Getter

    public String getModel() {
        return this.model;
    }
}
