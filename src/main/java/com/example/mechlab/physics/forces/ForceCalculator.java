package com.example.mechlab.physics.forces;

import com.example.mechlab.physics.Particle;
import com.example.mechlab.physics.Vector2D;

public interface ForceCalculator {
    Vector2D calculateForce();
    void assignParticle(Particle particle);
    void removeParticle(Particle particle);
}
