import java.sql.*;

public class TestLog {

    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver");
        Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
        Statement stmt = con.createStatement();

        String createSql = "DROP TABLE TEST; CREATE TABLE TEST(ID INT AUTO_INCREMENT PRIMARY KEY, NAME VARCHAR(255));";

        String insertSql = "INSERT INTO TEST VALUES('Hello');\n" +
                "INSERT INTO TEST VALUES('World');\n";

        stmt.execute(createSql);
        stmt.execute(insertSql);

        String sql = "SELECT * FROM TEST";

        ResultSet rd = stmt.executeQuery(sql);
        while(rd.next()) {
            System.out.println(rd.getInt(1) + " - " +rd.getString(2));
        }
    }
}