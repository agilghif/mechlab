package com.example.mechlab.physics.forces;

import com.example.mechlab.physics.Particle;
import com.example.mechlab.physics.Vector2D;

import java.util.ArrayList;

public class ElectricalForce implements ForceCalculator{
    // fields
    private ArrayList<Particle> chargedParticle = new ArrayList<Particle>();

    // Constructors
    public ElectricalForce() {

    }

    @Override
    public Vector2D calculateForce() {
        return null;
    }

    @Override
    public void assignParticle(Particle particle) {
        chargedParticle.add(particle);
    }

    @Override
    public void removeParticle(Particle particle) {
        chargedParticle.remove(particle);
    }
}
