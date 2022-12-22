class Root implements State{
  
  private State parent;
  public Root (State parent){
    this.parent = parent;
  }
  public State getParent(){
    return parent;
  }
  public void Enter(){
    System.out.println("started root");
  }
  public void Leave(){
    System.out.println("stopped root");
  }
  public void Periodic(){
    System.out.println("root");
  }
}

class MiddleRight implements State{
  private State parent;
  public MiddleRight (State parent){
    this.parent = parent;
  }
  public State getParent(){
    return parent;
  }
  public void Enter(){
    System.out.println("started middle right");
  }
  public void Leave(){
    System.out.println("stopped middle right");
  }
  public void Periodic(){
    System.out.println("middle right");
  }
}

class BottomRight implements State{
  private State parent;
  public BottomRight (State parent){
    this.parent = parent;
  }
  public State getParent(){
    return parent;
  }
  public void Enter(){
    System.out.println("started bottom right");
  }
  public void Leave(){
    System.out.println("stopped bottom right");
  }
  public void Periodic(){
    System.out.println("bottom right");
  }
}

class MiddleLeft implements State{
  private State parent;
  public MiddleLeft (State parent){
    this.parent = parent;
  }
  public State getParent(){
    return parent;
  }
  public void Enter(){
    System.out.println("started middle left");
  }
  public void Leave(){
    System.out.println("stopped middle left");
  }
  public void Periodic(){
    System.out.println("middle left");
  }
}

class BottomLeft implements State{
  private State parent;
  public BottomLeft (State parent){
    this.parent = parent;
  }
  public State getParent(){
    return parent;
  }
  public void Enter(){
    System.out.println("started bottom left");
  }
  public void Leave(){
    System.out.println("stopped bottom left");
  }
  public void Periodic(){
    System.out.println("bottom left");
  }
}
