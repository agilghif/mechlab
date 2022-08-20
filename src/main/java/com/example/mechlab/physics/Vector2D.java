package com.example.mechlab.physics;

public class Vector2D {
    public double x;
    public double y;

    // Constructors
    public Vector2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }


    // setter getter
    public void setValues(double x, double y) {
        this.x = x;
        this.y = y;
    }


    // Vector Operations
    public static Vector2D add(Vector2D v1, Vector2D v2) {
        return new Vector2D(v1.x + v2.x, v1.y + v2.y);
    }

    public void add(Vector2D v) {
        x += v.x;
        y += v.y;
    }

    public void add(Vector2D v, double scale) {
        x += v.x * scale;
        y += v.y * scale;
    }

    public void add(int vx, int vy) {
        x += vx;
        y += vy;
    }

    public static Vector2D scale(Vector2D v1, double factor) {
        return new Vector2D(v1.x * factor, v1.y * factor);
    }

    public void scale(double factor) {
        x *= factor;
        y *= factor;
    }

    public static double dot(Vector2D v1, Vector2D v2) {
        return v1.x * v2.x + v1.y * v2.y;
    }

    public double dot(Vector2D v) {
        return x * v.x + y*v.y;
    }

    public static double cross(Vector2D v1, Vector2D v2) {
        return v1.x * v2.y - v1.y * v2.x;
    }

    public double cross(Vector2D v) {
        return x * v.y - y * v.x;
    }


    // Methods
    public double magnitude() {
        return Math.sqrt(x*x + y*y);
    }

    public static double distance(Vector2D v1, Vector2D v2) {
        double dx = v1.x - v2.x;
        double dy = v1.y - v2.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public double direction() {
        return Math.atan2(y, x);
    }

    public Vector2D projectionVectorTo(Vector2D v) {
        return Vector2D.scale(
                v,
                Vector2D.dot(this, v) / Vector2D.dot(v, v)
                );
    }

    public Vector2D unitVector() {
        double magnitude = magnitude();
        return new Vector2D(x / magnitude, y / magnitude);
    }


}
