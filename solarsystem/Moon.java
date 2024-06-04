package assignmenttwo.solarsystem;

/**
 * moon class for solarsystem.
 */
public class Moon extends HeavenlyBody {
  private double avgOrbitRadiusInKm;

  public Moon(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
  }

  /**
   * name radius, orbit of the moon.
   */
  protected Moon(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    super(name, avgRadiusInKm);
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name can not be null or empty");
    }
    if (avgOrbitRadiusInKm < 60) {
      throw new IllegalArgumentException("Orbit radius can not be less than 60");
    }
    if (avgRadiusInKm < 6 || avgRadiusInKm > 10000) {
      throw new IllegalArgumentException("Radius must be between 6 and 10 000 km");
    }
    this.avgOrbitRadiusInKm = avgOrbitRadiusInKm;
  }

  public double getAvgOrbitRadiusInKm() {
    return avgOrbitRadiusInKm;
  }

  public String toString() {
    return "Moon: " + super.toString() + " average orbit radius " + avgOrbitRadiusInKm + "km";
  }

  public String printHeavenlyBodies() {
    return "Heavenly Body: " + getName() + ", average radius " + getAvgRadiusInKm() + " Km ";
  }

  @Override
  protected void checkAvgRadiusInKm(int radius) {
    if (radius < 6 || radius > 10000) {
      throw new IllegalArgumentException("Radius must be between 6 and 10 000 km");
    }
  }
}
