

package conections;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectionSQL {
    Connection Conectar = null;
    
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/formain","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de conexion " + e.getMessage());
        }
        return Conectar;
    }
    
    
}
