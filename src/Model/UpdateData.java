
package Model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author serho
 */
public class UpdateData {
    private static UpdateData actualizarDatos;
    private String nombreTabla;
    private List<String> nombreColumnas;
    private List<String> campos;
    
    
    private UpdateData()
    {
        this.nombreTabla = nombreTabla;
        this.nombreColumnas = nombreColumnas;
        this.campos = campos;
    }
    
    public void actualizarDatos(String nombreTabla, List<String> nombreColumnas, List<String> campos, String column, String id)
    {
        String nombreColumna = nombreColumnas.toString().replace("[", "").replace("]", "");
        List<String> listaParteSQL = new ArrayList<>();
        
        for(int i= 0; i<nombreColumnas.size(); i++)
        {
            listaParteSQL.add(nombreColumnas.get(i).replace("[", "").replace("]", "")+" ="+" '"+campos.get(i)+"'");
        }
        String parteSQL = listaParteSQL.toString().replace("[", "").replace("]", "");
        String sql = " UPDATE "+nombreTabla+" SET "+parteSQL+" WHERE "+column+" = "+id;
        try
        {
            PreparedStatement pps = ConnectionSQL.getConnectionSQL().Conexion().prepareStatement(sql);
            pps.executeUpdate();
            listaParteSQL.clear();
            campos.clear();
            JOptionPane.showMessageDialog(null, "Se han actualizado los datos correctamente");
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error: " +e.getMessage());
        }
    }
    
    
    public synchronized static UpdateData getUpdateData()
    {
        if(actualizarDatos == null)
        {
            actualizarDatos = new UpdateData();
        }
        return actualizarDatos;
    }
}
