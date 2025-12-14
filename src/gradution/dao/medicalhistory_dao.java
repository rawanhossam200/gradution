
package gradution.dao;

import gradution.db.database;
import gradution.model.medicalhistory;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;


public class medicalhistory_dao {
    
    public boolean addHistory(medicalhistory h) {
    String sql = "{call medical_pkg.add_history(?,?,?,?,?)}";
    try (Connection conn = database.getConnection();
         CallableStatement cs = conn.prepareCall(sql)) {

        cs.setInt(1, h.getDoctorId());
        cs.setInt(2, h.getPatientId());
        cs.setString(3, h.getMedicalNotes());
        cs.setString(4, h.getReportType());
        cs.setString(5, h.getTreatmentDetails());

        return cs.execute();
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

}
