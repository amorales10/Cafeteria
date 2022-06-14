package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Categorias {

    BD.Conexion_DB bd = new BD.Conexion_DB();
    private int id_cate;
    private String nombre_cate;

    public int getId_cate() {
        return id_cate;
    }

    public void setId_cate(int id_cate) {
        this.id_cate = id_cate;
    }

    public String getNombre_cate() {
        return nombre_cate;
    }

    public void setNombre_cate(String nombre_cate) {
        this.nombre_cate = nombre_cate;
    }

    public String toString() {
        return this.nombre_cate;
    }

    public Vector<Categorias> mostrar_Categorias() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = bd.Conectando();
        Vector<Categorias> datos = new Vector<Categorias>();
        Categorias data = null;

        try {
            String sql = "SELECT * FROM categorias";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            data = new Categorias();
            data.setId_cate(0);
            data.setNombre_cate("Seleccione...");
            datos.add(data);

            while (rs.next()) {
                data = new Categorias();
                data.setId_cate(rs.getInt("id_cate"));
                data.setNombre_cate(rs.getString("nombre_cate"));
                datos.add(data);
            }
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "THIS NOT WORK", JOptionPane.ERROR_MESSAGE);
        }
        return datos;
    }

}
