//package session11_objects_association;
//
//public class Detective
//{
//  private String name;
//  private String badgeNumber;
//  private Case currentCase;
//
//  public Detective(String name, String badgeNumber)
//  {
//    this.name = name;
//    this.badgeNumber = badgeNumber;
//  }
//
//  public void takeCase(Case newCase)
//  {
//    this.currentCase = newCase;
//    newCase.setStatus("Under investigation");
//  }
//
//  public void takeOffCase(Case currentCase)
//  {
//    this.currentCase = null;
//  }
//
//  public void solveCase(Case caseToSolve)
//  {
//    caseToSolve.setStatus("SOLVED");
//  }
//
//  public void closeCase(Case caseToClose)
//  {
//    caseToClose.setStatus("CLOSED");
//  }
//
//  @Override
//  public String toString()
//  {
//    return "Detective " + name + ", " + badgeNumber + ", working on case: " + currentCase.getCaseNumber() + ", " + currentCase.getCrimeType() + ", " + currentCase.getStatus();
//  }
//}
