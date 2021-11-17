/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author monge
 */
public class ConsultarPedidosRealizados extends javax.swing.JDialog {

    /**
     * Creates new form ConsultarPedidosRealizados
     */
    public ConsultarPedidosRealizados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        encabezado_consultarPedido = new javax.swing.JLabel();
        titulo_pedidosRealizados = new javax.swing.JLabel();
        boton_buscarPedidoRealizado = new javax.swing.JButton();
        textBox_buscarPedidoRealizado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_PedidosRealizados = new javax.swing.JTable();
        boton_salirConsultarPedidos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        encabezado_consultarPedido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        encabezado_consultarPedido.setText("Consultar Pedido");

        titulo_pedidosRealizados.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        titulo_pedidosRealizados.setText("Pedidos realizados hasta este momento");

        boton_buscarPedidoRealizado.setText("BUSCAR");
        boton_buscarPedidoRealizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscarPedidoRealizadoActionPerformed(evt);
            }
        });

        textBox_buscarPedidoRealizado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jTable_PedidosRealizados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre Cliente", "Fecha Pedido", "Total Pagado", "Calorías Totales", "Ver Detalle"
            }
        ));
        jScrollPane1.setViewportView(jTable_PedidosRealizados);

        boton_salirConsultarPedidos.setText("SALIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(encabezado_consultarPedido)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 139, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textBox_buscarPedidoRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_buscarPedidoRealizado))
                            .addComponent(titulo_pedidosRealizados))
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton_salirConsultarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(encabezado_consultarPedido)
                .addGap(34, 34, 34)
                .addComponent(titulo_pedidosRealizados)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_buscarPedidoRealizado)
                    .addComponent(textBox_buscarPedidoRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(boton_salirConsultarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_buscarPedidoRealizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscarPedidoRealizadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_buscarPedidoRealizadoActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarPedidosRealizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarPedidosRealizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarPedidosRealizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarPedidosRealizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsultarPedidosRealizados dialog = new ConsultarPedidosRealizados(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_buscarPedidoRealizado;
    private javax.swing.JButton boton_salirConsultarPedidos;
    private javax.swing.JLabel encabezado_consultarPedido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_PedidosRealizados;
    private javax.swing.JTextField textBox_buscarPedidoRealizado;
    private javax.swing.JLabel titulo_pedidosRealizados;
    // End of variables declaration//GEN-END:variables
}
