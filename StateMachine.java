import java.util.ArrayList;

class StateMachine{
  private State currentState;
  public StateMachine(){
    currentState = null;
  }
  void setState (State targetState){
    State ancestor = findCommonAncestor(targetState, currentState);
    leaveTo(currentState, ancestor);
    enterTo(ancestor, targetState);
    currentState = targetState;
  }

  void startRobot(State startState){
    currentState = startState;
    enterTo(null, currentState);
  }
  
  void periodic(){
    State loopingState = currentState;
    while(true){
      if(loopingState==null)break;
      loopingState.Periodic();
      loopingState = loopingState.getParent();
    }
  }
  
  private State findCommonAncestor(State A, State B){
    State candidateA = A;
    while(true){
      if(candidateA==null)break;
      State candidateB = B;
      while(true){
        if(candidateB==null)break;
        if(candidateA==candidateB)return candidateA;
        candidateB = candidateB.getParent();
      }
      candidateA = candidateA.getParent();
    }
    return null;
  }

  //iterate upwards and stop function
  private void leaveTo(State child, State ancestor){
    while(true){
      if(child == null) break;
      child.Leave();
      if(child.getParent()==ancestor)break;
      child = child.getParent();
    }
  }

  private void enterTo(State ancestor, State child){
    ArrayList<State> lineage = new ArrayList<State>();
    while(true){
      if(child == ancestor) break;
      lineage.add(0, child);
      child = child.getParent();
      
    }
    for(State s:lineage){
      s.Enter();
    }
  }
  //iterate downwards and start function
}