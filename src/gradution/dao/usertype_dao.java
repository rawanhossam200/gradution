
package gradution.dao;

import gradution.db.database;
import gradution.model.usertype;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class usertype_dao {
    
       public List<usertype> getAllTypes() {
        List<usertype> list = new ArrayList<>();
        String sql = "SELECT * FROM user_type";

        try (Connection con = database.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                usertype ut = new usertype();
                ut.setTypeId(rs.getInt("type_id"));
                ut.setTypeName(rs.getString("type_name"));
                list.add(ut);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    } 
}
