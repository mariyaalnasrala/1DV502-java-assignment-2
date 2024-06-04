package assignmenttwo.solarsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Star class for solarsystem.
 */

public class Star extends HeavenlyBody {

  private List<Planet> planets;
  private List<HeavenlyBody> heavenlyBodies;

  /**
   * name and radius for stas.
   */

  public Star(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name can not be null or empty");
    }
    if (avgRadiusInKm < 16700) {
      throw new IllegalArgumentException("Radius must be between 2000 and 200000 km");
    }
    this.planets = new ArrayList<>();
    this.heavenlyBodies = new ArrayList<>();
  }

  /**
   * add planet to star.
   */
  public Planet addPlanet(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name can not be null or empty");
    }
    if (avgRadiusInKm < 2000 || avgRadiusInKm > 200000) {
      throw new IllegalArgumentException("Radius must be larger than 16 700 km");
    }
    if (avgOrbitRadiusInKm < 18000) {
      throw new IllegalArgumentException("Orbit radius must be more than 18000 km");
    }
    Planet planet = new Planet(name, avgRadiusInKm, avgOrbitRadiusInKm);
    planets.add(planet);
    heavenlyBodies.add(planet);
    return planet;
  }

  @Override
  protected void checkAvgRadiusInKm(int radius) {
    if (radius < 16700) {
      throw new IllegalArgumentException("Stars can not be smaller than 16 700 km");
    }
  }

  /**
   * return array.
   */

  public HeavenlyBody[] getHeavenlyBodies() {
    List<HeavenlyBody> heavenlyBodies = new ArrayList<>();
    heavenlyBodies.add(new Star(getName(), getAvgRadiusInKm()));
    for (Planet planet : planets) {
      heavenlyBodies.addAll(Arrays.asList(planet.getHeavenlyBodies()));
    }
    return heavenlyBodies.toArray(new HeavenlyBody[0]);
  }

  public String toString() {
    return "Star: " + super.toString();
  }

  public String printHeavenlyBodies() {
    return "Heavenly Body: " + getName() + ", average radius " + getAvgRadiusInKm() + " Km ";
  }
}
