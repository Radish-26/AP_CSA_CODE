
import java.lang.Math;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


public class PlanetGravity
{
  //Surface gravity of the planet
  public static double[] surfaceGravity(double[] masses, double[] diameters)
  {
    double [] gravities = new double[8];
    double grav = 6.67e-11;
    double rad = 0;

    for (int i = 0; i < 2; i++){
      rad = (diameters[i] * 1000) / 2.0;
      gravities[i] = (grav * masses[i]) / Math.pow(rad, 2);
    }
    return gravities;
  }
  public static void displayOutput(String[] planetNames, double[] diameters, double[] masses, double[] gravities) throws IOException
  {
    PrintWriter fileOut = new PrintWriter(new File("planetfile.txt"));
    System.out.println("                      Planet Data");
    System.out.println("  Planet      Diameter(km)      Mass(kg)      g(m/s^2)  ");
    System.out.println("------------------------------------------------------");
    for(int i = 0; i < 2; i++)
    {
      System.out.printf("%-8s       %6.0f           %-3.2E        %-3.2f%n", planetNames[i], diameters[i], masses[i], gravities[i]);
      fileOut.printf("%-8s       %6.0f           %-3.2E        %-3.2f%n", planetNames[i], diameters[i], masses[i], gravities[i]);
    }
    fileOut.close();
  }

  //Main method
  public static void main(String[ ] args) throws IOException
  {
    String [] planetNames = {"Mercury", "Earth"};
    double [] diameters = {4880, 12756.3};
    double [] masses = {3.30e23, 5.972e24};
    double [] gravities = surfaceGravity(masses, diameters);

    displayOutput(planetNames, diameters, masses, gravities);

  }

}
