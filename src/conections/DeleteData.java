/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conections;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author serho
 */
public class DeleteData {
    
    private void eliminarTablaId(Integer id, String table, String column){
        
        String sql = "DELETE from "+table+"WHERE "+column+"="+id;
        Statement st;
        ConnectionSQL con = new ConnectionSQL();
        try
        {
            st = con.Conexion().createStatement();
            int rs = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente.");
        }catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            
        } 
    }
    
        public void eliminarTablaCod(String table, String column, String cod){
        
        String sql = "delete from "+table+" where "+column+" = "+cod;
            System.out.println(sql);
        Statement st;
        ConnectionSQL con = new ConnectionSQL();
        try
        {
            st = con.Conexion().createStatement();
            int rs = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente.");
        }catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        } 
    }
}
