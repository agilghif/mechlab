package com.example.mechlab.physics.forces;

import com.example.mechlab.physics.Particle;
import com.example.mechlab.physics.Spring;
import com.example.mechlab.physics.Vector2D;

import java.util.ArrayList;

public class SpringForce implements ForceCalculator{
    private ArrayList<Spring> springs = new ArrayList<Spring>();

    @Override
    public Vector2D calculateForce() {
        return null;
    }

    @Override
    public void assignParticle(Particle particle) {

    }

    @Override
    public void removeParticle(Particle particle) {

    }
}
