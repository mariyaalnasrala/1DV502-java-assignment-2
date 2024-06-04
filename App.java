/*
* This Java source file was generated by the Gradle 'init' task.
*/

package assignmenttwo;

import assignmenttwo.solarsystem.HeavenlyBody;
import java.util.Arrays;
import java.util.List;


/**
 * This is the generated Hello World Greeting App.
 */
public class App {

  private void sunPlanetMoon() {
    System.out.println("Solar System: ");
    assignmenttwo.solitares.Star sun = new assignmenttwo.solitares.Star("Sun ", 696342);
    System.out.println(sun);

    System.out.println("Planets: ");
    assignmenttwo.solitares.Planet[] planets = new assignmenttwo.solitares.Planet[8];
    planets[0] = new assignmenttwo.solitares.Planet("Mercury", 2439);
    planets[1] = new assignmenttwo.solitares.Planet("Venus", 6051);
    planets[2] = new assignmenttwo.solitares.Planet("Earth", 6371);
    planets[3] = new assignmenttwo.solitares.Planet("Mars", 3389);
    planets[4] = new assignmenttwo.solitares.Planet("Jupiter", 69911);
    planets[5] = new assignmenttwo.solitares.Planet("Saturn", 58232);
    planets[6] = new assignmenttwo.solitares.Planet("Uranus", 25362);
    planets[7] = new assignmenttwo.solitares.Planet("Neptune", 24622);

    for (int i = 0; i < planets.length; i++) {
      System.out.println(planets[i]);
    }
    System.out.println("Some moons: ");
    assignmenttwo.solitares.Moon[] moons = new assignmenttwo.solitares.Moon[12];
    moons[0] = new assignmenttwo.solitares.Moon("Moon", 1737);
    moons[1] = new assignmenttwo.solitares.Moon("Phobos", 12);
    moons[2] = new assignmenttwo.solitares.Moon("Io", 1821);
    moons[3] = new assignmenttwo.solitares.Moon("Europa", 1560);
    moons[4] = new assignmenttwo.solitares.Moon("Ganymede", 2634);
    moons[5] = new assignmenttwo.solitares.Moon("Callisto", 2410);
    moons[6] = new assignmenttwo.solitares.Moon("Mimas", 198);
    moons[7] = new assignmenttwo.solitares.Moon("Enceladus", 252);
    moons[8] = new assignmenttwo.solitares.Moon("Tethys", 533);
    moons[9] = new assignmenttwo.solitares.Moon("Dione", 561);
    moons[10] = new assignmenttwo.solitares.Moon("Rhea", 764);
    moons[11] = new assignmenttwo.solitares.Moon("Titan", 2575);

    for (int i = 0; i < moons.length; i++) {
      System.out.println(moons[i]);
    }
  }

  private void heavenlyBody() {
    System.out.println("Solar System: ");
    assignmenttwo.refactoredsolitares.Star sun = new assignmenttwo.refactoredsolitares.Star("Sun ", 696342);
    System.out.println(sun);

    System.out.println("Planets: ");
    assignmenttwo.refactoredsolitares.Planet[] planet = new assignmenttwo.refactoredsolitares.Planet[8];
    planet[0] = new assignmenttwo.refactoredsolitares.Planet("Mercury", 2439);
    planet[1] = new assignmenttwo.refactoredsolitares.Planet("Venus", 6051);
    planet[2] = new assignmenttwo.refactoredsolitares.Planet("Earth", 6371);
    planet[3] = new assignmenttwo.refactoredsolitares.Planet("Mars", 3389);
    planet[4] = new assignmenttwo.refactoredsolitares.Planet("Jupiter", 69911);
    planet[5] = new assignmenttwo.refactoredsolitares.Planet("Saturn", 58232);
    planet[6] = new assignmenttwo.refactoredsolitares.Planet("Uranus", 25362);
    planet[7] = new assignmenttwo.refactoredsolitares.Planet("Neptune", 24622);

    for (int i = 0; i < planet.length; i++) {
      System.out.println(planet[i]);
    }

    System.out.println("Some moons: ");
    assignmenttwo.refactoredsolitares.Moon[] moons = new assignmenttwo.refactoredsolitares.Moon[12];
    moons[0] = new assignmenttwo.refactoredsolitares.Moon("Moon", 1737);
    moons[1] = new assignmenttwo.refactoredsolitares.Moon("Phobos", 12);
    moons[2] = new assignmenttwo.refactoredsolitares.Moon("Io", 1821);
    moons[3] = new assignmenttwo.refactoredsolitares.Moon("Europa", 1560);
    moons[4] = new assignmenttwo.refactoredsolitares.Moon("Ganymede", 2634);
    moons[5] = new assignmenttwo.refactoredsolitares.Moon("Callisto", 2410);
    moons[6] = new assignmenttwo.refactoredsolitares.Moon("Mimas", 198);
    moons[7] = new assignmenttwo.refactoredsolitares.Moon("Enceladus", 252);
    moons[8] = new assignmenttwo.refactoredsolitares.Moon("Tethys", 533);
    moons[9] = new assignmenttwo.refactoredsolitares.Moon("Dione", 561);
    moons[10] = new assignmenttwo.refactoredsolitares.Moon("Rhea", 764);
    moons[11] = new assignmenttwo.refactoredsolitares.Moon("Titan", 2575);

    for (int i = 0; i < moons.length; i++) {
      System.out.println(moons[i]);
    }

  }

  private void solarsystem() {
    assignmenttwo.solarsystem.Star sun = new assignmenttwo.solarsystem.Star("Sun", 696342);
    assignmenttwo.solarsystem.Planet earth = sun.addPlanet("Earth", 6371, 63710.00);
    earth.addMoon("Moon", 1737, 17370.00);
    assignmenttwo.solarsystem.Planet mars = sun.addPlanet("Mars", 3389, 33890.00);
    mars.addMoon("Phobos", 12, 120.00);
    mars.addMoon("Deimos", 6, 60.00);
    assignmenttwo.solarsystem.Planet jupiter = sun.addPlanet("Jupiter", 69911, 69110.00);
    jupiter.addMoon("Io", 1821, 18210.00);
    jupiter.addMoon("Europa", 1560, 15600.00);
    jupiter.addMoon("Ganymede", 2634, 26340.00);
    jupiter.addMoon("Callisto", 2410, 24100.00);
    assignmenttwo.solarsystem.Planet saturn = sun.addPlanet("Saturn", 58232, 582320.00);
    saturn.addMoon("Mimas", 198, 1980.00);
    saturn.addMoon("Enceladus", 252, 2520.00);
    saturn.addMoon("Tethys", 533, 5330.00);
    saturn.addMoon("Dione", 561, 5610.00);
    saturn.addMoon("Rhea", 764, 7640.00);
    saturn.addMoon("Titan", 2575, 25750.00);

    List<HeavenlyBody> heavenlyBodies = List.of(sun.getHeavenlyBodies());
    for (assignmenttwo.solarsystem.HeavenlyBody body : heavenlyBodies) {
      System.out.println(body);
    }
  }

  /**
   * The orderInHeaven method.
   */
  public void orderInHeaven() {
    assignmenttwo.solarsystem.HeavenlyBody[] heavenlyBodies = new assignmenttwo.solarsystem.HeavenlyBody[18];
    
    heavenlyBodies[0] = new assignmenttwo.solarsystem.Star("sun", 696342);
    heavenlyBodies[1] = new assignmenttwo.solarsystem.Moon("phobos", 12);
    heavenlyBodies[2] = new assignmenttwo.solarsystem.Moon("mimas", 198);
    heavenlyBodies[3] = new assignmenttwo.solarsystem.Moon("enceladus", 252);
    heavenlyBodies[4] = new assignmenttwo.solarsystem.Moon("tethys", 533);
    heavenlyBodies[5] = new assignmenttwo.solarsystem.Moon("dione", 561);
    heavenlyBodies[6] = new assignmenttwo.solarsystem.Moon("rhea", 764);
    heavenlyBodies[7] = new assignmenttwo.solarsystem.Moon("europa", 1560);
    heavenlyBodies[8] = new assignmenttwo.solarsystem.Moon("moon", 1737);
    heavenlyBodies[9] = new assignmenttwo.solarsystem.Moon("io", 1821);
    heavenlyBodies[10] = new assignmenttwo.solarsystem.Moon("callisto", 2410);
    heavenlyBodies[11] = new assignmenttwo.solarsystem.Moon("titan", 2575);
    heavenlyBodies[12] = new assignmenttwo.solarsystem.Moon("ganymede", 2634);
    heavenlyBodies[13] = new assignmenttwo.solarsystem.Planet("mars", 3389);
    heavenlyBodies[14] = new assignmenttwo.solarsystem.Planet("earth", 6371);
    heavenlyBodies[15] = new assignmenttwo.solarsystem.Planet("saturn", 58232);
    heavenlyBodies[16] = new assignmenttwo.solarsystem.Planet("jupiter", 69911);
    heavenlyBodies[17] = new assignmenttwo.solarsystem.Moon("deimos", 6);

    Arrays.sort(heavenlyBodies);
    for (assignmenttwo.solarsystem.HeavenlyBody body : heavenlyBodies) {
      System.out.println(body.printHeavenlyBodies());
    }
  }

  /**
   * The App starting point.
   *
   * @param args Unused program arguments.
   */
  public static void main(String[] args) {
    App theApp = new App();
    theApp.sunPlanetMoon();
    theApp.heavenlyBody();
    theApp.solarsystem();
    theApp.orderInHeaven();
  }
}
