
/**
 * Project title: 05.05 Constructors with Parameters.

 *
 */
public class LightV3 {
  boolean isOn;
  public LightV3(){
 
   }
  void turnOn() {
    isOn = true;
    System.out.println("Is the Light on? " + isOn);
  }
  void turnOff() {
    isOn = false;
    System.out.println("Is the Light on? " + isOn);
  }
}


class Main {
  public static void main(String[] args) {
    // create objects
    LightV3 led = new LightV3();
    LightV3 christmasLights = new LightV3();
    led.turnOn();
    christmasLights.turnOff();
  }
}
