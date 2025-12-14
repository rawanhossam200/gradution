
package gradution;

import java.util.Date;

/**
 *
 * @author SMART
 */
public class appointment {
    private int aId;
    private int patientId;
    private int doctorId;
    private String treatmentType;
    private Date aDate;
    private Date aTime;
    
    public int getaId() {return aId;}
    public void setaId(int aId) {this.aId = aId;}

    public int getPatientId() {return patientId;}
    public void setPatientId(int patientId) {this.patientId = patientId;}

    public int getDoctorId() {return doctorId;}
    public void setDoctorId(int doctorId) {this.doctorId = doctorId;}

    public String getTreatmentType() {return treatmentType;}
    public void setTreatmentType(String treatmentType) {this.treatmentType = treatmentType;}

    public Date getaDate() {return aDate;}
    public void setaDate(Date aDate) {this.aDate = aDate;}

    public Date getaTime() {return aTime;}
    public void setaTime(Date aTime) {this.aTime = aTime;}

}
