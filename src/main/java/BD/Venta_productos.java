package BD;

import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class Venta_productos {

    BD.Conexion_DB bd = new BD.Conexion_DB();

    public void registrar_venta(int cantidad, int venta, LocalDateTime creation, int id) {

        try {
            bd.ConectarBasedeDatos();

            bd.sentencia.execute("Insert Into ventas(cantidad_venta, total_venta, fecha_venta, id_prod) Values ('" + cantidad + "','" + venta + "','" + creation + "','" + id + "')");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), ".::THIS NOT WORK::.", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void Update_stock(int id, int cantidad) {

        try {
            bd.ConectarBasedeDatos();

            bd.sentencia.execute("UPDATE productos SET stock_prod= (stock_prod - '" + cantidad + "') WHERE id_prod ="+id);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), ".::THIS NOT WORK::.", JOptionPane.ERROR_MESSAGE);
        }

    }
}
