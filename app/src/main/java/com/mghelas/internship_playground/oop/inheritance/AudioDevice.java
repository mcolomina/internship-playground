package com.mghelas.internship_playground.oop.inheritance;

public class AudioDevice {
    private Integer impedance;
    private Double weight;

    public AudioDevice() {
    }

    public AudioDevice(Integer impedance, Double weight) {
        this.impedance = impedance;
        this.weight = weight;
    }

    public Integer getImpedance() {
        return impedance;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "AudioDevice{" +
                "impedance=" + impedance +
                ", weight=" + weight +
                '}';
    }
}
