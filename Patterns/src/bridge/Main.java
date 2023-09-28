package bridge;

public class Main {
  public static void main(String[] args) {
    var remoteControl = new AdvanceRemoteControl(new SalmsungTV());
    remoteControl.turnOn();
  }
}
