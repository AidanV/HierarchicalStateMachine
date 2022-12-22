interface State{
  State getParent();
  void Enter();
  void Leave();
  void Periodic();
}