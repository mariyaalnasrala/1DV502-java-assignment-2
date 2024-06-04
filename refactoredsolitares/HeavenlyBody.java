package assignmenttwo.refactoredsolitares;

/**
 * abstract class.
 */
public abstract class HeavenlyBody {
  private String name;
  private int avgRadiusInKm;

  /**
   * name and radius.
   */
  protected HeavenlyBody(String name, int avgRadiusInKm) {
    setName(name);
    setAvgRadiusInKm(avgRadiusInKm);
  }

  /**
   * get name.
   */
  public String getName() {
    return name;
  }

  /**
   * set name.
   */
  private void setName(String newName) {
    this.name = newName;
  }

  /**
   * get radius.
   */
  public int getAvgRadiusInKm() {
    return avgRadiusInKm;
  }
  
  /**
   * set radius.
   */
  protected void setAvgRadiusInKm(int radius) {
    this.avgRadiusInKm = radius;
  }

  /**
   * check the radius.
   */
  protected abstract void checkAvgRadiusInKm(int radius);
  
  @Override
  public String toString() {
    return name + " average radius " + avgRadiusInKm + "km";
  }

  protected final void finalize() {
  }
}
