package com.mghelas.internship_playground.oop.inheritance;

public class Headphone extends AudioDevice {
    private String type;
    private String connectionType;

    public Headphone(Integer power, Double weight, String type, String connectionType) {
        super(power, weight);
        this.type = type;
        this.connectionType = connectionType;
    }

    @Override
    public String toString() {
        return "Headphone{" +
                "impedance=" + getImpedance() +
                ", weight=" + getWeight() +
                ", type='" + type + '\'' +
                ", connectionType='" + connectionType + '\'' +
                '}';
    }
}
