

package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectionSQL {
    Connection Conectar = null;
    private static ConnectionSQL con; //objeto con
    
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/formain","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de conexion " + e.getMessage());
        }
        return Conectar;
    }
    
    //metodo constructor en privado
    private ConnectionSQL()
    {
        Conexion();
    }
    
    
    //Singleton
    public synchronized static ConnectionSQL getConnectionSQL()
    {
        if(con==null)
        {
            con = new ConnectionSQL();            
        }
        return con;
    }
    
}
