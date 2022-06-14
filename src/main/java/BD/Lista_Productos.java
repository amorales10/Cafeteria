package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Lista_Productos {

    BD.Conexion_DB bd = new BD.Conexion_DB();

    public void ver_productos_registrados(JTable tabla_productos) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = bd.Conectando();
        try {
            DefaultTableModel modelo = new DefaultTableModel();;
            tabla_productos.setModel(modelo);
            String sql = "Select id_prod, nombre_prod, precio_prod, peso_prod, stock_prod, nombre_cate from productos join categorias on productos.id_cate=categorias.id_cate ORDER BY id_prod ASC";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmt = rs.getMetaData();
            int cantidadcolumnas = rsmt.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio ($)");
            modelo.addColumn("Peso (gr)");
            modelo.addColumn("Stock");
            modelo.addColumn("Categoria");

            int[] anchos = {50, 200, 90, 90, 80, 180};

            for (int x = 0; x < cantidadcolumnas; x++) {
                tabla_productos.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
            }
            while (rs.next()) {
                Object[] filas = new Object[cantidadcolumnas];
                for (int i = 0; i < cantidadcolumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            
            tabla_productos.setModel(modelo);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "NOT WORK", JOptionPane.ERROR_MESSAGE);
        } catch (Exception xe) {
            JOptionPane.showMessageDialog(null, xe.getMessage(), "NOT WORK", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void ver_comidas_registradas(JTable tabla_productos) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = bd.Conectando();
        try {
            DefaultTableModel modelo = new DefaultTableModel();;
            tabla_productos.setModel(modelo);
            String sql = "Select id_prod, nombre_prod, precio_prod, peso_prod, stock_prod from productos join categorias on productos.id_cate=categorias.id_cate Where categorias.nombre_cate='"+"Comidas"+"' ORDER BY id_prod ASC";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmt = rs.getMetaData();
            int cantidadcolumnas = rsmt.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio ($)");
            modelo.addColumn("Peso (gr)");
            modelo.addColumn("Stock");

            int[] anchos = {50, 200, 90, 90, 80};

            for (int x = 0; x < cantidadcolumnas; x++) {
                tabla_productos.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
            }
            while (rs.next()) {
                Object[] filas = new Object[cantidadcolumnas];
                for (int i = 0; i < cantidadcolumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            
            tabla_productos.setModel(modelo);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "NOT WORK", JOptionPane.ERROR_MESSAGE);
        } catch (Exception xe) {
            JOptionPane.showMessageDialog(null, xe.getMessage(), "NOT WORK", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void ver_bebidas_registradas(JTable tabla_productos) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = bd.Conectando();
        try {
            DefaultTableModel modelo = new DefaultTableModel();;
            tabla_productos.setModel(modelo);
            String sql = "Select id_prod, nombre_prod, precio_prod, peso_prod, stock_prod from productos join categorias on productos.id_cate=categorias.id_cate Where categorias.nombre_cate='"+"Bebidas"+"' ORDER BY id_prod ASC";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmt = rs.getMetaData();
            int cantidadcolumnas = rsmt.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio ($)");
            modelo.addColumn("Peso (gr)");
            modelo.addColumn("Stock");

            int[] anchos = {50, 200, 90, 90, 80};

            for (int x = 0; x < cantidadcolumnas; x++) {
                tabla_productos.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
            }
            while (rs.next()) {
                Object[] filas = new Object[cantidadcolumnas];
                for (int i = 0; i < cantidadcolumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            
            tabla_productos.setModel(modelo);
            
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "NOT WORK", JOptionPane.ERROR_MESSAGE);
        } catch (Exception xe) {
            JOptionPane.showMessageDialog(null, xe.getMessage(), "NOT WORK", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void historial_de_ventas(JTable tabla_productos) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = bd.Conectando();
        try {
            DefaultTableModel modelo = new DefaultTableModel();;
            tabla_productos.setModel(modelo);
            String sql = "Select id_ventas,nombre_prod, cantidad_venta, total_venta  from ventas join productos on ventas.id_prod=productos.id_prod ORDER BY id_ventas ASC";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmt = rs.getMetaData();
            int cantidadcolumnas = rsmt.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("Producto");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Total $");

            int[] anchos = {50, 200, 90, 90};

            for (int x = 0; x < cantidadcolumnas; x++) {
                tabla_productos.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
            }
            while (rs.next()) {
                Object[] filas = new Object[cantidadcolumnas];
                for (int i = 0; i < cantidadcolumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            
            tabla_productos.setModel(modelo);
            
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "NOT WORK", JOptionPane.ERROR_MESSAGE);
        } catch (Exception xe) {
            JOptionPane.showMessageDialog(null, xe.getMessage(), "NOT WORK", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void Mayor_Stock(JTable tabla_stock) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = bd.Conectando();
        try {
            DefaultTableModel modelo = new DefaultTableModel();;
            tabla_stock.setModel(modelo);
            String sql = "select id_prod, nombre_prod, stock_prod from productos where stock_prod = (select max(stock_prod) from productos) Order By nombre_prod ASC";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmt = rs.getMetaData();
            int cantidadcolumnas = rsmt.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("Producto");
            modelo.addColumn("Stock");

            int[] anchos = {50, 200, 90};

            for (int x = 0; x < cantidadcolumnas; x++) {
                tabla_stock.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
            }
            while (rs.next()) {
                Object[] filas = new Object[cantidadcolumnas];
                for (int i = 0; i < cantidadcolumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            
            tabla_stock.setModel(modelo);
            
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "NOT WORK", JOptionPane.ERROR_MESSAGE);
        } catch (Exception xe) {
            JOptionPane.showMessageDialog(null, xe.getMessage(), "NOT WORK", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Mas_vendido(JTable tabla_stock) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = bd.Conectando();
        try {
            DefaultTableModel modelo = new DefaultTableModel();;
            tabla_stock.setModel(modelo);
            String sql = "select ventas.id_prod, nombre_prod, cantidad_venta from ventas join productos on ventas.id_prod=productos.id_prod where cantidad_venta = (select max(cantidad_venta) from ventas) Order By nombre_prod ASC";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmt = rs.getMetaData();
            int cantidadcolumnas = rsmt.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("Producto");
            modelo.addColumn("Cantidad");

            int[] anchos = {50, 200, 90};

            for (int x = 0; x < cantidadcolumnas; x++) {
                tabla_stock.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
            }
            while (rs.next()) {
                Object[] filas = new Object[cantidadcolumnas];
                for (int i = 0; i < cantidadcolumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            
            tabla_stock.setModel(modelo);
            
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "NOT WORK", JOptionPane.ERROR_MESSAGE);
        } catch (Exception xe) {
            JOptionPane.showMessageDialog(null, xe.getMessage(), "NOT WORK", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
