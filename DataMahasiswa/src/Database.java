/*Saya Nur Ainun 2202046 mengerjakan TUGAS PRAKTIKUM 2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

import java.sql.*;

public class Database
{
    private Connection connection;

    private Statement statement;

    // Constructor
    public Database()
    {
        try
        {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_mahasiswa", "root", "");
            statement = connection.createStatement();
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    // Digunakan untuk SELECT
    public ResultSet selectQuery(String sql)
    {
        try
        {
            statement.executeQuery(sql);
            return statement.getResultSet();
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    // Digunakan untuk INSERT, UPDATE, dan DELETE
    public int insertUpdateDeleteQuery(String sql)
    {
        try
        {
            return statement.executeUpdate(sql);
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    // Getter
    public Statement getStatement()
    {
        return statement;
    }
}