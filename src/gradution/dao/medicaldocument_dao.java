
package gradution.dao;

import gradution.db.database;
import gradution.model.medicaldocument;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;


public class medicaldocument_dao {
    
    public boolean addDocument(medicaldocument d) {
    String sql = "{call document_pkg.add_document(?,?,?,?,?)}";
    try (Connection conn = database.getConnection();
         CallableStatement cs = conn.prepareCall(sql)) {

        cs.setInt(1, d.getPatientId());
        cs.setInt(2, d.getDoctorId());
        cs.setString(3, d.getDocumentType());
        cs.setString(4, d.getDescription());
        cs.setString(5, d.getFilePath());

        return cs.execute();
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

}
