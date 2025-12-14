
package gradution;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author SMART
 */
public class database {
    
        private static final String url =
        "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String user = "hr";
    private static final String pass = "hr";
    
      public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(url, user, pass);
     
    }
    
}
