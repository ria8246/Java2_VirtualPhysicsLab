/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balls.model;

/**
 *
 * @author n0g3
 */
public class Model {
    
    private final int START = 0;
    private final int FREE_FALL = 1;
    private final int ON_GROUND = 2;
    private final int REBOUND = 3;
    
    private float weight;
    private float acceleration;
    private float radius;
    private float velocity;
    private float distance;
    private int time;
    private int state;
    private float gravity;

    public Model() {
    }

    public Model(float weight, float acceleration, float radius, float velocity, float distance, int time, float gravity) {
        this.weight = weight;
        this.acceleration = acceleration;
        this.radius = radius;
        this.velocity = velocity;
        this.distance = distance;
        this.time = time;
        this.state = START;
        this.gravity = gravity;
    }

    

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the acceleration
     */
    public float getAcceleration() {
        return acceleration;
    }

    /**
     * @param acceleration the acceleration to set
     */
    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    /**
     * @return the radius
     */
    public float getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(float radius) {
        this.radius = radius;
    }

    /**
     * @return the velocity
     */
    public float getVelocity() {
        return velocity;
    }

    /**
     * @param velocity the velocity to set
     */
    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    /**
     * @return the distance
     */
    public float getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(float distance) {
        this.distance = distance;
    }

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * @return the state
     */
    public int getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(int state) {
        this.state = state;
    }

    /**
     * @return the gravity
     */
    public float getGravity() {
        return gravity;
    }

    /**
     * @param gravity the gravity to set
     */
    public void setGravity(float gravity) {
        this.gravity = gravity;
    }
}
