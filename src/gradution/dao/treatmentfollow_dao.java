package gradution.dao;

import gradution.db.database;
import gradution.model.treatmentfollow;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;


public class treatmentfollow_dao {

    public boolean addFollow(treatmentfollow t) {
    String sql = "{call treatment_pkg.add_follow(?,?,?,?,?)}";
    try (Connection conn = database.getConnection();
         CallableStatement cs = conn.prepareCall(sql)) {

        cs.setInt(1, t.getPatientId());
        cs.setString(2, t.getTreatmentType());
        cs.setString(3, t.getStatusUpdate());
        cs.setString(4, t.getActionTaken());
        cs.setString(5, t.getMedicalType());

        return cs.execute();
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

}
