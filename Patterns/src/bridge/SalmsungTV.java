package bridge;

public class SalmsungTV implements Device {
  @Override
  public void turnOn() {
    System.out.println("Samung: turn on");
  }

  @Override
  public void turnOff() {
    System.out.println("Samung: turn off");
  }

  @Override
  public void setChannel(int number) {
    System.out.println("Samung: set channel");
  }
}
