
package gradution.model;

import java.util.Date;

/**
 *
 * @author SMART
 */
public class medicaldocument {
    private int mdId;
    private int patientId;
    private int doctorId;
    private String documentType;
    private String description;
    private String filePath;
    private Date uploadDate;
    
    public int getMdId() {return mdId;}
    public void setMdId(int mdId) {this.mdId = mdId;}

    public int getPatientId() {return patientId;}
    public void setPatientId(int patientId) {this.patientId = patientId;}

    public int getDoctorId() {return doctorId;}
    public void setDoctorId(int doctorId) {this.doctorId = doctorId;}

    public String getDocumentType() {return documentType;}
    public void setDocumentType(String documentType) {this.documentType = documentType;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public String getFilePath() {return filePath;}
    public void setFilePath(String filePath) {this.filePath = filePath;}

    public Date getUploadDate() {return uploadDate;}
    public void setUploadDate(Date uploadDate) {this.uploadDate = uploadDate;}
    
}
