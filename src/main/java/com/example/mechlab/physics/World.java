package com.example.mechlab.physics;

import com.example.mechlab.physics.forces.AirDrag;
import com.example.mechlab.physics.forces.ElectricalForce;
import com.example.mechlab.physics.forces.Gravity;
import com.example.mechlab.physics.forces.SpringForce;

import java.util.ArrayList;

public class World {
    // Fields
    ArrayList<Particle> particles = new ArrayList<Particle>();
    ArrayList<Spring> springs = new ArrayList<Spring>();

    // Force Field
    private AirDrag airDrag = new AirDrag();
    private ElectricalForce electricalForce = new ElectricalForce();
    private Gravity gravity = new Gravity();
    private SpringForce springForce = new SpringForce();

    // Constructors
    public World() {
        // Initialisation : set world for Particles and Springs
        Particle.setWorld(this);
        Spring.setWorld(this);
    }

    // Methods
    void addParticle(Particle particle) {
        particles.add(particle);
    }

    void addSpring(Spring spring) {
        springs.add(spring);
    }

    void removeParticle(Particle particle) {
        particles.remove(particle);

        // Remove from forces
        electricalForce.removeParticle(particle);

        // Remove from springs
    }

    // Setter and Getter
    public AirDrag getAirDrag() {
        return airDrag;
    }

    public ElectricalForce getElectricalForce() {
        return electricalForce;
    }

    public Gravity getGravity() {
        return gravity;
    }
}
