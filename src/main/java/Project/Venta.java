package Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Venta extends javax.swing.JFrame {

    /**
     * Creates new form Venta
     */
    BD.Lista_Productos productos = new BD.Lista_Productos();
    BD.Conexion_DB bd = new BD.Conexion_DB();
    BD.Venta_productos ven_prod = new BD.Venta_productos();

    public Venta() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        productos.ver_comidas_registradas(jTable_Comidas);
        productos.ver_bebidas_registradas(jTable_Bebidas);
        Deshabilitar();
    }

    void Deshabilitar() {
        jButton_Añadir_Comidas.setEnabled(false);
        jButton_Añadir_Bebidas.setEnabled(false);
    }

    /*int Suma_Productos(JTable tabla) {
        int valor1 = 0;
        int valor2 = 0;

        for (int i = 0; i < jTable_Pedido.getRowCount(); i++) {
            valor2 = Integer.parseInt(jTable_Pedido.getValueAt(i, 3).toString());
            valor1 += valor2;
        }
        jButton_Pago.setText("El T: " + valor1);
        return valor1;
    }

    int Valor_compra(JTable tabla) {
        int valor1 = 0;
        int valor2 = 0;

        for (int i = 0; i < jTable_Pedido.getRowCount(); i++) {
            valor2 = Integer.parseInt(jTable_Pedido.getValueAt(i, 4).toString());
            valor1 += valor2;
        }
        return valor1;
    }/*

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane_Comidas = new javax.swing.JScrollPane();
        jTable_Comidas = new javax.swing.JTable();
        jSpinner_Cantidad_Comidas = new javax.swing.JSpinner();
        jLabel_Cantidad_Comidas = new javax.swing.JLabel();
        jButton_Añadir_Comidas = new javax.swing.JButton();
        jScrollPane_Bebidas = new javax.swing.JScrollPane();
        jTable_Bebidas = new javax.swing.JTable();
        jLabel_Cantidad_Bebidas = new javax.swing.JLabel();
        jSpinner_Cantidad_Bebidas = new javax.swing.JSpinner();
        jSeparator_Divisor = new javax.swing.JSeparator();
        jButton_Añadir_Bebidas = new javax.swing.JButton();
        jScrollPane_Pedido = new javax.swing.JScrollPane();
        jTable_Pedido = new javax.swing.JTable();
        jButton_Borrar = new javax.swing.JButton();
        jButton_Pago = new javax.swing.JButton();
        jButton_Recargar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton_Inicio = new javax.swing.JButton();
        jButton_Salir = new javax.swing.JButton();
        jButton_Historial = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Comidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Precio", "Peso", "Stock"
            }
        ));
        jTable_Comidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ComidasMouseClicked(evt);
            }
        });
        jScrollPane_Comidas.setViewportView(jTable_Comidas);

        getContentPane().add(jScrollPane_Comidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 202, 200));

        jSpinner_Cantidad_Comidas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        getContentPane().add(jSpinner_Cantidad_Comidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 80, 30));

        jLabel_Cantidad_Comidas.setText("Cantidad:");
        getContentPane().add(jLabel_Cantidad_Comidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 80, 20));

        jButton_Añadir_Comidas.setText("Añadir");
        jButton_Añadir_Comidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Añadir_ComidasActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Añadir_Comidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 80, 30));

        jTable_Bebidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Precio", "Peso", "Stock"
            }
        ));
        jTable_Bebidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_BebidasMouseClicked(evt);
            }
        });
        jScrollPane_Bebidas.setViewportView(jTable_Bebidas);

        getContentPane().add(jScrollPane_Bebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 202, 180));

        jLabel_Cantidad_Bebidas.setText("Cantidad:");
        getContentPane().add(jLabel_Cantidad_Bebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 80, 20));

        jSpinner_Cantidad_Bebidas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        getContentPane().add(jSpinner_Cantidad_Bebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 80, 30));

        jSeparator_Divisor.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator_Divisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 79, 11, 580));

        jButton_Añadir_Bebidas.setText("Añadir");
        jButton_Añadir_Bebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Añadir_BebidasActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Añadir_Bebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 80, 30));

        jTable_Pedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Valor Unitario", "Cantidad", "Total"
            }
        ));
        jScrollPane_Pedido.setViewportView(jTable_Pedido);

        getContentPane().add(jScrollPane_Pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, 450));

        jButton_Borrar.setText("Borrar");
        jButton_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BorrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 570, -1, 31));

        jButton_Pago.setText("Pago");
        jButton_Pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PagoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, 83, 31));

        jButton_Recargar.setText("Recargar");
        jButton_Recargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RecargarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Recargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, 30));

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VENTAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 80));

        jLabel2.setText("Comidas:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel3.setText("Bebidas:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jButton_Inicio.setText("Inicio");
        jButton_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, -1, 30));

        jButton_Salir.setText("Salir");
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, -1, 30));

        jButton_Historial.setText("Historial");
        jButton_Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HistorialActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, -1, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 870, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Añadir_ComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Añadir_ComidasActionPerformed
        // TODO add your handling code here:
        try {
            bd.ConectarBasedeDatos();
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = bd.Conectando();
            int fila = jTable_Comidas.getSelectedRow();
            int Cantidad = (Integer) jSpinner_Cantidad_Comidas.getValue();
            String sql = "Select id_prod, nombre_prod, precio_prod, stock_prod, (precio_prod * " + Cantidad + ") As Total_prod FROM productos WHERE id_prod=" + jTable_Comidas.getValueAt(fila, 0);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            rs.next();
            int Stock = rs.getInt("stock_prod");
            if (Stock < Cantidad) {
                JOptionPane.showMessageDialog(null, "No hay suficientes unidades", "ALERTA", JOptionPane.ERROR_MESSAGE);
            } else if (Stock <= 0) {
                JOptionPane.showMessageDialog(null, "Producto Agotado", "ALERTA", JOptionPane.ERROR_MESSAGE);
            } else {
                DefaultTableModel modelo = (DefaultTableModel) jTable_Pedido.getModel();
                Object[] filas = new Object[5];

                filas[0] = rs.getString("id_prod");
                filas[1] = rs.getString("nombre_prod");
                filas[2] = rs.getInt("precio_prod");
                filas[3] = jSpinner_Cantidad_Comidas.getValue();
                filas[4] = rs.getInt("Total_prod");

                modelo.addRow(filas);

                jTable_Pedido.setModel(modelo);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
        jButton_Añadir_Comidas.setEnabled(false);

    }//GEN-LAST:event_jButton_Añadir_ComidasActionPerformed

    private void jButton_Añadir_BebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Añadir_BebidasActionPerformed
        // TODO add your handling code here:
        try {
            bd.ConectarBasedeDatos();
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = bd.Conectando();
            int fila = jTable_Bebidas.getSelectedRow();
            int Cantidad = (Integer) jSpinner_Cantidad_Bebidas.getValue();
            String sql = "Select id_prod, nombre_prod, precio_prod, stock_prod, (precio_prod * " + Cantidad + ") As Total_prod FROM productos WHERE id_prod=" + jTable_Bebidas.getValueAt(fila, 0);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            rs.next();
            int Stock = rs.getInt("stock_prod");
            if (Stock < Cantidad) {
                JOptionPane.showMessageDialog(null, "No hay suficientes unidades", "ALERTA", JOptionPane.ERROR_MESSAGE);
            } else if (Stock <= 0) {
                JOptionPane.showMessageDialog(null, "Producto Agotado", "ALERTA", JOptionPane.ERROR_MESSAGE);
            } else {
                DefaultTableModel modelo = (DefaultTableModel) jTable_Pedido.getModel();
                Object[] filas = new Object[5];

                filas[0] = rs.getString("id_prod");
                filas[1] = rs.getString("nombre_prod");
                filas[2] = rs.getInt("precio_prod");
                filas[3] = jSpinner_Cantidad_Bebidas.getValue();
                filas[4] = rs.getInt("Total_prod");

                modelo.addRow(filas);

                jTable_Pedido.setModel(modelo);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
        jButton_Añadir_Bebidas.setEnabled(false);

    }//GEN-LAST:event_jButton_Añadir_BebidasActionPerformed

    private void jTable_ComidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ComidasMouseClicked
        // TODO add your handling code here:
        jButton_Añadir_Comidas.setEnabled(true);
    }//GEN-LAST:event_jTable_ComidasMouseClicked

    private void jTable_BebidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_BebidasMouseClicked
        // TODO add your handling code here:
        jButton_Añadir_Bebidas.setEnabled(true);
    }//GEN-LAST:event_jTable_BebidasMouseClicked

    private void jButton_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BorrarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jTable_Pedido.getModel();
        int fila = jTable_Pedido.getSelectedRow();
        if (fila >= 0) {
            modelo.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione primero la fila que desea eliminar", "ALERTA", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButton_BorrarActionPerformed

    private void jButton_PagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PagoActionPerformed
        // TODO add your handling code here:

        if (jTable_Pedido.getRowCount() > 0) {

            LocalDateTime fecha_de_creacion = LocalDateTime.now();

            int id_prod = 0;
            int cant = 0;
            int Total = 0;

            for (int i = 0; i < jTable_Pedido.getRowCount(); i++) {
                id_prod = Integer.parseInt(jTable_Pedido.getValueAt(i, 0).toString());
                cant = Integer.parseInt(jTable_Pedido.getValueAt(i, 3).toString());
                Total = Integer.parseInt(jTable_Pedido.getValueAt(i, 4).toString());
                ven_prod.registrar_venta(cant, Total, fecha_de_creacion, id_prod);
                ven_prod.Update_stock(id_prod, cant);
            }
            JOptionPane.showMessageDialog(null, "La Venta fue exitosa", ".::INFORMACIÓN::.", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "No hay pedidos", "ALERTA", JOptionPane.ERROR_MESSAGE);
        }
        productos.ver_comidas_registradas(jTable_Comidas);
        productos.ver_bebidas_registradas(jTable_Bebidas);
        Deshabilitar();
        DefaultTableModel modelo = (DefaultTableModel) jTable_Pedido.getModel();
        int filas = jTable_Pedido.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
        }
        jSpinner_Cantidad_Comidas.setValue(1);
        jSpinner_Cantidad_Bebidas.setValue(1);
        
    }//GEN-LAST:event_jButton_PagoActionPerformed

    private void jButton_RecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RecargarActionPerformed
        // TODO add your handling code here:
        productos.ver_comidas_registradas(jTable_Comidas);
        productos.ver_bebidas_registradas(jTable_Bebidas);
        Deshabilitar();
        DefaultTableModel modelo = (DefaultTableModel) jTable_Pedido.getModel();
        int filas = jTable_Pedido.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
        }
        jSpinner_Cantidad_Comidas.setValue(1);
        jSpinner_Cantidad_Bebidas.setValue(1);
    }//GEN-LAST:event_jButton_RecargarActionPerformed

    private void jButton_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InicioActionPerformed
        // TODO add your handling code here:
        Inicio pasar = new Inicio();
        pasar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_InicioActionPerformed

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_SalirActionPerformed

    private void jButton_HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HistorialActionPerformed
        // TODO add your handling code here:
        Historial_Ventas pasar = new Historial_Ventas();
        pasar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_HistorialActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Añadir_Bebidas;
    private javax.swing.JButton jButton_Añadir_Comidas;
    private javax.swing.JButton jButton_Borrar;
    private javax.swing.JButton jButton_Historial;
    private javax.swing.JButton jButton_Inicio;
    private javax.swing.JButton jButton_Pago;
    private javax.swing.JButton jButton_Recargar;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Cantidad_Bebidas;
    private javax.swing.JLabel jLabel_Cantidad_Comidas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane_Bebidas;
    private javax.swing.JScrollPane jScrollPane_Comidas;
    private javax.swing.JScrollPane jScrollPane_Pedido;
    private javax.swing.JSeparator jSeparator_Divisor;
    private javax.swing.JSpinner jSpinner_Cantidad_Bebidas;
    private javax.swing.JSpinner jSpinner_Cantidad_Comidas;
    private javax.swing.JTable jTable_Bebidas;
    private javax.swing.JTable jTable_Comidas;
    private javax.swing.JTable jTable_Pedido;
    // End of variables declaration//GEN-END:variables
}