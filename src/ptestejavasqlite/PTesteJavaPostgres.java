/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptestejavasqlite;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author franz
 */
public class PTesteJavaPostgres {

    static Connection conexao = null;
    static PreparedStatement pst = null;
    static ResultSet rs = null;

  public static void conectar() {

        Connection conn = null;

        try {

           Class.forName("org.postgresql.Driver");

            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AgendaEscolar_teste","postgres", "postgres" );

            System.out.println("Conexão estabelecida!");

            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        conectar();
    }
}
