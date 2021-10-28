import java.sql.*;

public class App {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS figura;" +
            "CREATE TABLE figura(id INT AUTO_INCREMENT PRIMARY KEY, figura VARCHAR(16), cor VARCHAR(16));";

    private static final String sqlInsert = "INSERT INTO figura (figura, cor) VALUES('Círculo','Vermelho')," +
            "('Quadrado', 'Preto'), ('Quadrado', 'Azul'), ('Quadrado', 'Vermelho'), ('Círculo', 'Amarelo'), ('Círculo','Vermelho');";

    public static void main(String[] args) throws Exception {

        Class.forName("org.h2.Driver");
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", ""
            );
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);
            statement.execute(sqlInsert);

            ShowFigura(connection);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (connection == null)
                return;

            try {
                connection.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void ShowFigura(Connection connection) throws SQLException {
        String sqlQuery = "SELECT * FROM figura WHERE figura = 'Círculo' AND cor = 'Vermelho';";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        while (rs.next()) {
            System.out.println("("+rs.getInt(1)
                    +") Figura: "+ rs.getString(2)
                    +" - Cor: "+ rs.getString(3));
        }
    }
}