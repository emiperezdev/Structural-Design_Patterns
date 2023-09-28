package decorator;

public class ErrorDecorator implements AbstractArtefact{
  private AbstractArtefact artefact;

  public ErrorDecorator(AbstractArtefact artefact) {
    this.artefact = artefact;
  }

  @Override
  public String render() {
    var mainIcon = artefact.render();
    return mainIcon + " [Error]";
  }
}
