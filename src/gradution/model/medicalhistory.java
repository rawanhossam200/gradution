
package gradution.model;

import java.util.Date;

/**
 *
 * @author SMART
 */
public class medicalhistory {
    private int mId;
    private int doctorId;
    private int patientId;
    private Date historyDate;
    private String medicalNotes;
    private String reportType;
    private String treatmentDetails;
    
    public int getmId() { return mId;}
    public void setmId(int mId) { this.mId = mId;}

    public int getDoctorId() {return doctorId;}
    public void setDoctorId(int doctorId) {this.doctorId = doctorId;}

    public int getPatientId() {return patientId;}
    public void setPatientId(int patientId) {this.patientId = patientId;}

    public Date getHistoryDate() {return historyDate;}
    public void setHistoryDate(Date historyDate) {this.historyDate = historyDate;}

    public String getMedicalNotes() {return medicalNotes;}
    public void setMedicalNotes(String medicalNotes) {this.medicalNotes = medicalNotes;}

    public String getReportType() {return reportType;}
    public void setReportType(String reportType) {this.reportType = reportType;}

    public String getTreatmentDetails() {return treatmentDetails;}
    public void setTreatmentDetails(String treatmentDetails) {this.treatmentDetails = treatmentDetails;}
    
}
