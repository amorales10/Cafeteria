package BD;

import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class Guardar_Registros {

    BD.Conexion_DB bd = new BD.Conexion_DB();

    public void registrar_prod(String name, String reference, int price, int weight, int stock, LocalDateTime creation, int category) {

        try {
            bd.ConectarBasedeDatos();

            int answer=JOptionPane.showConfirmDialog(null, "¿Realmente desea registar el producto?", "Confirmar Registro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (answer == JOptionPane.YES_OPTION) {
                bd.sentencia.execute("Insert Into productos(nombre_prod, referencia_prod, precio_prod, peso_prod, stock_prod, fecha_creacion_prod, id_cate) Values ('" + name + "','" + reference + "','" + price + "','" + weight + "','" + stock + "','" + creation + "','" + category + "')");

                JOptionPane.showMessageDialog(null, "El Producto: " + name + " ha sido registrado Correctamente", ".::INFORMACIÓN::.", JOptionPane.INFORMATION_MESSAGE);
            } else if (answer == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Intente de nuevo", ".::INFORMACIÓN::.", JOptionPane.INFORMATION_MESSAGE);
            }


        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), ".::THIS NOT WORK::.", JOptionPane.ERROR_MESSAGE);
        }

    }

}
