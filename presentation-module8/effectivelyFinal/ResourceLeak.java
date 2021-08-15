package effectivelyFinal;

import java.sql.*;

public class ResourceLeak {

    public void leak(String url, String sql, int id) throws SQLException {
        Connection con =
                DriverManager.getConnection(url);
        PreparedStatement ps =
                con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        try (con; ps; rs) {
            while (rs.next()) {
                // process result set
            }
        }

    }
}
