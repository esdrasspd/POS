/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author serho
 */
public class DeleteData {
    private static DeleteData delete;
    
    private DeleteData()
    {
        
    }
    
        public void eliminarTablaCod(String table, String column, String id){
        
        String sql = "delete from "+table+" where "+column+" = "+id;
        System.out.println(sql);
        Statement st;
        try
        {
            PreparedStatement pps = ConnectionSQL.getConnectionSQL().Conexion().prepareStatement(sql);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente.");
        }catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        } 
    }
        public synchronized static DeleteData getDeleteData()
        {
            if(delete == null)
            {
                delete = new DeleteData();
            }
            return delete;
        }
}
