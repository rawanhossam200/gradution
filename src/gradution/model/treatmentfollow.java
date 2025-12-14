
package gradution.model;

import java.util.Date;

/**
 *
 * @author SMART
 */
public class treatmentfollow {
    private int tId;
    private int patientId;
    private String treatmentType;
    private String statusUpdate;
    private String actionTaken;
    private String medicalType;
    private Date startDate;
    
    public int gettId() {return tId;}
    public void settId(int tId) {this.tId = tId;}

    public int getPatientId() {return patientId;}
    public void setPatientId(int patientId) {this.patientId = patientId;}

    public String getTreatmentType() {return treatmentType;}
    public void setTreatmentType(String treatmentType) {this.treatmentType = treatmentType;}

    public String getStatusUpdate() {return statusUpdate;}
    public void setStatusUpdate(String statusUpdate) {this.statusUpdate = statusUpdate;}

    public String getActionTaken() {return actionTaken;}
    public void setActionTaken(String actionTaken) {this.actionTaken = actionTaken;}

    public String getMedicalType() {return medicalType;}
    public void setMedicalType(String medicalType) {this.medicalType = medicalType;}

    public Date getStartDate() {return startDate;}
    public void setStartDate(Date startDate) {this.startDate = startDate;}
}
