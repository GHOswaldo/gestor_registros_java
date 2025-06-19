/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author arman
 */
public class Conexion {

    //useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
    Connection con;

    public Connection conecta() {

        try {
            // Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestor_tienda?", "root", "");

        }/*catch (ClassNotFoundException err) {
            System.out.println("error en la conexion" + err);
        } */ catch (SQLException er) {
            System.out.println("ERROR  SQL" + er);
        }
        return con;
    }
}
