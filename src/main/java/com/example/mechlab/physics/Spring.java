package com.example.mechlab.physics;

public class Spring {
    private Particle pHead;
    private Particle pTail;

    private double elasticity = 1000; // N/m
    private double restLength;

    // Static elements
    private static World mainWorld = null;

    // Constructors
    public Spring(Particle pHead, Particle pTail) {
        this.pHead = pHead;
        this.pTail = pTail;

        restLength = Vector2D.distance(
                pHead.position, pTail.position
        );
    }
    // TODO : Make implementation for another spring instantiation that is good for the GUI

    // Setter and Getter
    public static void setWorld(World world) {  // to keep refrence of world to the particle
        mainWorld = world;
    }

    public void setElasticity(double elasticity) {
        this.elasticity = elasticity;
    }

    public void setRestLength(double restLength) {
        this.restLength = restLength;
    }
}
