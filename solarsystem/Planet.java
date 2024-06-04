package assignmenttwo.solarsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * class for planet in solarsystem.
 */
public class Planet extends HeavenlyBody {
  
  private double avgOrbitRadiusInKm;
  private List<Moon> moons;

  public Planet(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
  }

  /**
   * name, radius orbit.
   */
  protected Planet(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    super(name, avgRadiusInKm);
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name can not be null or empty");
    }
    if (avgRadiusInKm < 2000 || avgRadiusInKm > 200000) {
      throw new IllegalArgumentException("Radius must be between 2000 and 200000 km");
    }
    if (avgOrbitRadiusInKm < 18000) {
      throw new IllegalArgumentException("Orbit radius must be more than 18000 km");
    }
    this.avgOrbitRadiusInKm = avgOrbitRadiusInKm;
    this.moons = new ArrayList<>();
  }

  /**
   * moon method.
   */
  public Moon addMoon(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    if (avgRadiusInKm > (getAvgRadiusInKm() / 2)) {
      throw new IllegalArgumentException("Planet can not have more than half the radius of the planet");
    }
    if (avgRadiusInKm < 6 || avgRadiusInKm > 10000) {
      throw new IllegalArgumentException("Radius must be between 6 and 10 000 km");
    }
    if (avgOrbitRadiusInKm < 60) {
      throw new IllegalArgumentException("Orbit radius must be more than 60 km");
    }
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name must not be null or empty");
    }
    
    Moon moon = new Moon(name, avgRadiusInKm, avgOrbitRadiusInKm);
    moons.add(moon);
    return moon;
  }

  /**
   * return orbit radius.
   */
  public double getAvgOrbitRadiusInKm() {
    return avgOrbitRadiusInKm;
  }

  @Override
  protected void checkAvgRadiusInKm(int radius) {
    if (radius < 2000 || radius > 200000) {
      throw new IllegalArgumentException("Radius should be between 2 000 and 200 000 km");
    }
  }

  /**
   * return array list.
   */
  public HeavenlyBody[] getHeavenlyBodies() {
    List<HeavenlyBody> heavenlyBodies = new ArrayList<>();
    heavenlyBodies.add(new Planet(getName(), getAvgRadiusInKm(), avgOrbitRadiusInKm));
    for (Moon moon : moons) {
      heavenlyBodies.add(new Moon(moon.getName(), moon.getAvgRadiusInKm(), moon.getAvgOrbitRadiusInKm()));
    }
    return heavenlyBodies.toArray(new HeavenlyBody[0]);
  }

  /**
   * string.
   */

  public String toString() {
    return "Planet: " + super.toString() + " average orbit radius " + avgOrbitRadiusInKm + " km";
  }

  public String printHeavenlyBodies() {
    return "Heavenly Body: " + getName() + ", average radius " + getAvgRadiusInKm() + " Km ";
  }
}
