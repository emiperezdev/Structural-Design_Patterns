package composite;

public class Truck implements Component {
  @Override
  public void deploy() {
    System.out.println("Deploying a truck");
  }
}
