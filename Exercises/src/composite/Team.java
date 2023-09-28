package composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
  private List<Component> components = new ArrayList<>();

  public void add(Component resource) {
    components.add(resource);
  }

  public void deploy() {
    for (var component : components)
      component.deploy();
  }
}