
package gradution.dao;

import gradution.db.database;
import gradution.model.appointment;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class appointment_dao {
    
    public boolean addAppointment(appointment a) {
    String sql = "{call appointment_pkg.add_appointment(?,?,?,?,?)}";
    try (Connection conn = database.getConnection();
         CallableStatement cs = conn.prepareCall(sql)) {

        cs.setInt(1, a.getPatientId());
        cs.setInt(2, a.getDoctorId());
        cs.setString(3, a.getTreatmentType());
        cs.setDate(4, new java.sql.Date(a.getaDate().getTime()));
        cs.setTime(5, new java.sql.Time(a.getaTime().getTime()));

        return cs.execute();
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

}
