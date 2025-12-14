
package gradution.dao;

import gradution.db.database;
import gradution.model.users;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class users_dao {
    // إضافة مستخدم
    public boolean addUser(users u) {
    String sql = "{call user_pkg.add_user(?,?,?,?,?)}";
    try (Connection con = database.getConnection();
         CallableStatement cs = con.prepareCall(sql)) {

        cs.setString(1, u.getUName());
        cs.setString(2, u.getPassword());
        cs.setString(3, u.getEmail());
        cs.setString(4, u.getPhoneNum());
        cs.setInt(5, u.getTypeId());

        return cs.execute();
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
}
