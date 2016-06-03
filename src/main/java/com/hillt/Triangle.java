package com.hillt;

/**
 * Created by thill on 6/1/16.
 */
public class Triangle extends Shape {

    private Double height = 0.0;
    private Double length = 0.0;

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Triangle(Double height, Double length) {
        setHeight(height);
        setLength(length);
    }

    @Override
    public Double getArea() {
        return getHeight() * getLength() * 0.5;
    }
}
