package assignmenttwo.solarsystem;

/**
 * abstract clarr for solarsystem.
 */
public abstract class HeavenlyBody implements Comparable<HeavenlyBody> {

  // implements Comparable<HeavenlyBody>
  private String name;
  private int avgRadiusInKm;

  /**
   * name and radius.
   */
  protected HeavenlyBody(String name, int avgRadiusInKm) {
    setName(name);
    setAvgRadiusInKm(avgRadiusInKm);
    checkAvgRadiusInKm(avgRadiusInKm);
  }

  public String getName() {
    return name;
  }

  private void setName(String newName) {
    if (newName == null || newName.isEmpty()) {
      throw new IllegalArgumentException("Name can not be null or empty");
    }
    this.name = newName;
  }

  public int getAvgRadiusInKm() {
    return avgRadiusInKm;
  }

  private void setAvgRadiusInKm(int radius) {
    checkAvgRadiusInKm(radius);
    this.avgRadiusInKm = radius;
  }

  protected abstract void checkAvgRadiusInKm(int radius);

  public String toString() {
    return name + ", average radius " + avgRadiusInKm + " Km ";
  }

  public String printHeavenlyBodies() {
    return "Heavenly Body: " + name + ", average radius " + avgRadiusInKm + " Km ";
  }

  /**
   * compare heavenly bodies.
   */
  public int compareTo(HeavenlyBody o) {
    if (this.getAvgRadiusInKm() > o.getAvgRadiusInKm()) {
      return 1;
    } else if (this.getAvgRadiusInKm() < o.getAvgRadiusInKm()) {
      return -1;
    } else {
      return 0;
    }
  }

  protected final void finalize() {
  }

}
