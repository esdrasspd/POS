
package conections;

/**
 *
 * @author serho
 */
import java.sql.Connection;
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
    
    private final int nColumn; 
    private List<String> column= new ArrayList<>();
    
    
    
    public ShowData(int nColumn, List<String> column){
        this.nColumn = nColumn;
        this.column = column;
    }
    
        public void fillTables (String table, JTable visor) {
        String sql = "Select * from " + table;
        Statement st;
        ConnectionSQL con = new ConnectionSQL();
        Connection ConnectionSQL = con.Conexion();
        DefaultTableModel model = new DefaultTableModel();
        
        for(int i= 0; i<column.size(); i++)
        {
            model.addColumn(column.get(i));
        }
        
        visor.setModel(model);
        
        String [] dato = new String[nColumn];
        try{
            st = ConnectionSQL.createStatement();
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
            e.printStackTrace();
        }
    }
    
}

