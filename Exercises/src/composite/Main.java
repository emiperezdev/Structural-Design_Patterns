package composite;

public class Main {
  public static void main(String[] args) {
    var team1 = new Team();
    var team2 = new Team();

    var truck1 = new Truck();
    var truck2 = new Truck();
    var humanResource1 = new HumanResource();
    var humanResource2 = new HumanResource();

    team1.add(truck1);
    team1.add(humanResource1);
    team1.add(humanResource2);

    team1.deploy();

    System.out.println("Other team");

    team2.add(truck1);
    team2.add(truck2);
    team2.add(humanResource1);

    team2.deploy();
  }
}
