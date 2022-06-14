
package BD;

import java.security.Principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Conexion_DB {
   public static Connection conectar;
    public Statement sentencia;
    private Principal prin;
    public ResultSet resultado;
    
    public void ConectarBasedeDatos()
    {
    try
    {
     final String CONTROLADOR="org.postgresql.Driver";
     
     Class.forName(CONTROLADOR);
     conectar=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Cafeteria", "postgres", "12345");
     
     
     sentencia=(Statement)conectar.createStatement();
    }
    catch(ClassNotFoundException ex1)
    {
    ex1.printStackTrace();
    javax.swing.JOptionPane.showMessageDialog(null,"Error al Cargar el Driver");
    
    System.exit(1);
    }
    catch(SQLException ex)
    {
    ex.printStackTrace();
    javax.swing.JOptionPane.showMessageDialog(null, "Error al crear el Statement");
    
    System.exit(1);
    }
    }
    
    public void DesconectarBasedeDatos(){
    try{
    if(conectar!=null)
    {
    if(sentencia!=null)
    {
    sentencia.close();
    }
    conectar.close();
    }
    }catch(SQLException ex){
    ex.getMessage();
    }
    }
    private Connection con=null;
    public Connection Conectando() {
        
        try{
            Class.forName("org.postgresql.Driver");
            
            con =(Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/Cafeteria", "postgres", "12345");
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),".::THIS NOT WORK",JOptionPane.ERROR_MESSAGE);
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),".::THIS NOT WORK",JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
}
