package com.hillt;

/**
 * Created by thill on 6/1/16.
 */
public class Circle extends Shape {

    private Double radius = 0.0;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Circle(Double radius) {
        setRadius(radius);
    }

    @Override
    public Double getArea() {
        return Math.pow(getRadius(),2) * Math.PI;
    }
}
