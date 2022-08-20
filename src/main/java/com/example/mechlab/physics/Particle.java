package com.example.mechlab.physics;

import com.example.mechlab.physics.constraints.Constraint;
import com.example.mechlab.physics.forces.ForceCalculator;

import java.util.ArrayList;

public class Particle {
    // Particle Params
    Vector2D position = new Vector2D(0,0);
    Vector2D velocity = new Vector2D(0,0);
    private Vector2D force = new Vector2D(0,0);

    private double mass = 1; // kilogram
    private double charge = 0; // coulomb
    private double radius = 10; // pixel

    private ArrayList<ForceCalculator> forceCalculators = new ArrayList<ForceCalculator>();
    private Constraint constraint = null;

    // Static elements
    private static World mainWorld = null;

    // Constructors
    public Particle() {

    }

    // Simulation Methods
    public void calculateForces() {
        // swap cache and force, and then empty cache
        force.setValues(0,0);

        // sum all of the forces
        for (ForceCalculator forceCalculator : forceCalculators) {
            force.add(forceCalculator.calculateForce());
        }
    }

    public void updatePosition(double dt) {
        // Use eulerian integration
        velocity.add(force, dt);
        position.add(velocity, dt);
    }

    public void setConstraint(Constraint constraint) {
        this.constraint = constraint;
    }


    // Extra Force Adders
    public void addSpring(Spring spring) {

    }

    // Setter and Getters
    public static void setWorld(World world) { // to keep refrence of world to the particle
        mainWorld = world;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setCharge(double charge) {
        if (charge != 0)
            mainWorld.getElectricalForce().assignParticle(this);
        else if (this.charge != 0)
            mainWorld.getElectricalForce().removeParticle(this);

        this.charge = charge;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getCharge() {
        return charge;
    }

    public double getRadius() {
        return radius;
    }
}
