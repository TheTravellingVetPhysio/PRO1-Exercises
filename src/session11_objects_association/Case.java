//package session11_objects_association;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Case
//{
//  private String caseNumber;
//  private String crimeType;
//  private String status = "OPEN";
//  private List<Evidence> evidenceList = new ArrayList<>();
//
//  public Case(String caseNumber, String crimeType)
//  {
//    this.caseNumber = caseNumber;
//    this.crimeType = crimeType;
//  }
//
//  public String getCaseNumber()
//  {
//    return caseNumber;
//  }
//
//  public String getCrimeType()
//  {
//    return crimeType;
//  }
//
//  public void setStatus(String status)
//  {
//  this.status = status;
//  }
//
//  public String getStatus()
//  {
//    return status;
//  }
//
//  public void addEvidence(Evidence evidence)  {
//    evidenceList.add(evidence);
//  }
//
//  public List<Evidence> getEvidenceList()
//  {
//    return evidenceList;
//  }
//
//  @Override
//  public String toString()
//  {
//    return "CASE " + getCaseNumber() + ", " + getCrimeType() + ": " + getStatus() + ".\nEvidence found: " + getEvidence();
//  }
//}
//
