
package conections;

/**
 *
 * @author serho
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author serho
 */
public class ShowData {
    
    private int nColumn; 
    private List<String> column= new ArrayList<>();
    private static ShowData showdata;
    private String nombreTabla;
    
    
    private ShowData(){
        this.nColumn = nColumn;
        this.column = column;
        this.nombreTabla = nombreTabla;
    }
    
        public void mostrarDatos (String nombreTabla, JTable visor, int nColumn, List<String> column) {
        String sql = "Select * from " + nombreTabla;
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        
        for(int i= 0; i<column.size(); i++)
        {
            model.addColumn(column.get(i));
        }
        
        visor.setModel(model);
        
        String [] dato = new String[nColumn];
        try{
            st = ConnectionSQL.getConnectionSQL().Conexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                for(int i = 0; i<nColumn; i++) {
                    dato[i] = rs.getString(i+1);
                }
                
                model.addRow(dato);
            }
        }catch(SQLException e) 
        {
            e.getMessage();
        }
    }
        public synchronized static ShowData getShowData()
        {
            if(showdata == null)
            {
                showdata = new ShowData();
            }
            return showdata;
        }
}

