
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Usuario {
    String Rut;
    String Nombre;
    String ApellidoP;
    String ApellidoM;
    String Telefono;
    Connection conn;
    Statement state;
    ResultSet res;

    public boolean InsertarUsuario(){
        try {
            String query = "insert into cliente values ('"+Rut+"','"+Nombre+"', '"+ApellidoP+"', '"+ApellidoM+"', '"+Telefono+"')";
            int saber = 0;
            state = conn.createStatement();
            saber = state.executeUpdate(query);
            if(saber == 1){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    
    
    
}
