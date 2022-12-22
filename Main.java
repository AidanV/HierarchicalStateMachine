class Main{
  
  public static void main(String[] args) {
    Root r = new Root(null);
    MiddleRight mr = new MiddleRight(null);
    BottomRight br = new BottomRight(mr);
    MiddleLeft ml = new MiddleLeft(r);
    BottomLeft bl = new BottomLeft(ml);
    StateMachine sm = new StateMachine();
    sm.startRobot(bl);
    sm.periodic();
    sm.setState(br);
    sm.periodic();
  }
}


