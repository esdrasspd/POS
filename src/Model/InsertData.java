package Model;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import Model.ShowData;

import javax.swing.JOptionPane;

/**
 *
 * @author serho
 */
public class InsertData {
    
    private String nombreTabla;
    private String nombreColumnas;
    private List<String> interrogacion = new ArrayList<>();
    private List<String> campos = new ArrayList<>();
    private static InsertData insert;

    private InsertData() {
        this.nombreTabla = nombreTabla;
        this.nombreColumnas = nombreColumnas;
        this.interrogacion = interrogacion;
        this.campos = campos;

    }

    public void insertarDatos(String nombreTabla, List<String> interrogacion, List<String> column, List<String> nombreColumnas, List<String> campos) {
        for (int i = 1; i < column.size(); i++) {
            interrogacion.add("?");
        }
        String interrogaciones = interrogacion.toString().replace("[", "").replace("]", "");
        String nombreColumna = nombreColumnas.toString().replace("[", "").replace("]", "");
        interrogacion.clear();
        
        String sql = "INSERT INTO " + nombreTabla + "(" + nombreColumna + ")VALUES(" + interrogaciones + ")";
        try {
            PreparedStatement pps = ConnectionSQL.getConnectionSQL().Conexion().prepareStatement(sql);
            for (int i = 0; i < campos.size(); i++) {
                pps.setString(i + 1, campos.get(i));
            }
            pps.executeUpdate();
            campos.clear();
            System.out.println(sql);
            JOptionPane.showMessageDialog(null, "Guardado con éxito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(sql);
        }
    }

    public synchronized static InsertData getInsertData() {
        if (insert == null) {
            insert = new InsertData();
        }
        return insert;
    }
}
