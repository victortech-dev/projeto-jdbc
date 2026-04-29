package application;

<<<<<<< HEAD

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {
        // RECUPERAR DADOS NO BANCO DE DADOS OU BUSCAR DADOS
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("select * from department");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "," + rs.getString("name"));
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
            // tratar exceçoes st e rs
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();

        }
        System.out.println();


=======
import db.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[]args){

        Connection conn = DB.getConnection();
        DB.closeConnection();
>>>>>>> 07e1396162cedad1ff719b06d5a95088459f63f6
    }

}
