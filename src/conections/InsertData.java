package conections;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import conections.ShowData;

import javax.swing.JOptionPane;

/**
 *
 * @author serho
 */
public class InsertData {

    private String nombreTabla;
    private String nombreColumnas;
    private List<String> interrogaciones = new ArrayList<>();
    private List<String> campos = new ArrayList<>();
    private static InsertData insert;
    private int index = 0;

    private InsertData() {
        this.nombreTabla = nombreTabla;
        this.nombreColumnas = nombreColumnas;
        this.interrogaciones = interrogaciones;
        this.campos = campos;

    }

    public void insertarDatos(String nombreTabla, List<String> interrogacion, List<String> column, String nombreColumnas, List<String> campos) {
        for (int i = 0; i < column.size(); i++) {
            interrogacion.add("?");
        }
        String interrogaciones = interrogacion.toString().replace("[", "").replace("]", "");
        interrogacion.clear();
        String sql = "INSERT INTO " + nombreTabla + "(" + nombreColumnas + ")VALUES(" + interrogaciones + ")";
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

    /*
    String a = "INSERT INTO cat_prod (cod_cat_prod, nombre)VALUES(?,?)";
        try{
            PreparedStatement pps = con.Conexion().prepareStatement(sql);
            pps.setString(1, fldCodCatProd.getText());
            pps.setString(2, fldNomCatProd.getText());
            pps.executeUpdate();
            if(fldCodCatProd.getText() != null && fldNomCatProd.getText() != null)
            {
            JOptionPane.showMessageDialog(null, "Guardado con éxito");
            mostrarDatos();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Los datos ingresados están vacíos...");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
}
*/
