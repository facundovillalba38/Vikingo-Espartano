package edu.utn.dataaccess;

import java.sql.PreparedStatement;
import java.util.ResourceBundle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataAccess {

    //ResourceBundle reader = ResourceBundle.getBundle("./resources/dbconfig.properties");
    //reader.getString("db.url");
    //reader.getString("db.username");
    //reader.getString("db.password");


    public DataAccess() {}

    public void insertWinner(String nombre_ganador, int bebida_en_cuerpo) throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String myUrl = "jdbc:mysql://localhost:3306/vikings_espartans";
            conn = DriverManager.getConnection(myUrl,"root","boca1212");

            // the mysql insert statement
            String query = " insert into winners (w_name, bebida_en_cuerpo) values (?, ?);";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, nombre_ganador);
            preparedStmt.setInt(2, bebida_en_cuerpo);

            // execute the preparedstatement
            preparedStmt.execute();
        }catch (Exception ex){
            System.out.println(ex.toString());
        }finally {
            conn.close();
        }
    }



}
