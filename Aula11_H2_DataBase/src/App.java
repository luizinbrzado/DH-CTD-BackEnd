import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver");
        Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
        Statement stmt = con.createStatement();

        String createSql = "DROP TABLE IF EXISTS animal;" +
                "CREATE TABLE animal(id INT AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(32), tipo VARCHAR(16));";

        String insertSql = "INSERT INTO animal (nome, tipo) VALUES('Meg','Cachorro')," +
                "('Mingau', 'Gato'), ('Dumbo', 'Elefante'), ('Pup', 'Cachorro'), ('Pé de pano', 'Cavalo');";

        String deleteSql = "DELETE FROM animal WHERE id = 2";

        stmt.execute(createSql);
        stmt.execute(insertSql);
        stmt.execute(deleteSql);

        String sql = "SELECT * FROM animal";

        ResultSet rd = stmt.executeQuery(sql);
        while(rd.next()) {
            System.out.println(rd.getInt(1) + " - " +rd.getString(2));
        }
    }
}
