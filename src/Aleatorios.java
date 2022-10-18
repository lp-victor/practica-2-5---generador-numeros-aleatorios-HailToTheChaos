
import java.io.File;
import java.util.ArrayList;
import javax.swing.*;


public class Aleatorios extends javax.swing.JFrame {

    private ArrayList<String> historial = new ArrayList();
    DefaultListModel modeloLista = new DefaultListModel();

    public Aleatorios() {
        initComponents();
        lista_historial.setModel(modeloLista);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialog_historial = new javax.swing.JDialog();
        panel_dialog = new javax.swing.JPanel();
        etiqueta_historial = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_historial = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        etiqueta_desc = new javax.swing.JLabel();
        etiqueta_n1 = new javax.swing.JLabel();
        spinner_n1 = new javax.swing.JSpinner();
        etiqueta_n2 = new javax.swing.JLabel();
        spinner_n2 = new javax.swing.JSpinner();
        textField_resultado = new javax.swing.JTextField();
        boton_generar = new javax.swing.JButton();
        checkBox_primos = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_fichero = new javax.swing.JMenu();
        menuItem_salir = new javax.swing.JMenuItem();
        menuItem_guardar = new javax.swing.JMenuItem();
        menu_edicion = new javax.swing.JMenu();
        menuItem_borrar = new javax.swing.JMenuItem();
        menuItem_historial = new javax.swing.JMenuItem();

        dialog_historial.setSize(new java.awt.Dimension(175, 311));

        etiqueta_historial.setText("Ultimos números generados");

        jScrollPane1.setViewportView(lista_historial);

        javax.swing.GroupLayout panel_dialogLayout = new javax.swing.GroupLayout(panel_dialog);
        panel_dialog.setLayout(panel_dialogLayout);
        panel_dialogLayout.setHorizontalGroup(
            panel_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqueta_historial, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panel_dialogLayout.setVerticalGroup(
            panel_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqueta_historial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialog_historialLayout = new javax.swing.GroupLayout(dialog_historial.getContentPane());
        dialog_historial.getContentPane().setLayout(dialog_historialLayout);
        dialog_historialLayout.setHorizontalGroup(
            dialog_historialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_dialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialog_historialLayout.setVerticalGroup(
            dialog_historialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_dialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        etiqueta_desc.setText("Generador de números aleatorios en el rango indicado:");

        etiqueta_n1.setText("número 1");

        etiqueta_n2.setText("número 2");

        spinner_n2.setValue(10);

        textField_resultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        boton_generar.setText("Generar");
        boton_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_generarActionPerformed(evt);
            }
        });

        checkBox_primos.setText("Números primos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(etiqueta_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(textField_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(boton_generar)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiqueta_n2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiqueta_n1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinner_n1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinner_n2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(checkBox_primos, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(etiqueta_desc)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta_n1)
                    .addComponent(spinner_n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta_n2)
                    .addComponent(spinner_n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(textField_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_generar)
                    .addComponent(checkBox_primos))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        menu_fichero.setText("Fichero");

        menuItem_salir.setText("Salir");
        menuItem_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_salirActionPerformed(evt);
            }
        });
        menu_fichero.add(menuItem_salir);

        menuItem_guardar.setText("Guardar");
        menuItem_guardar.setEnabled(false);
        menuItem_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_guardarActionPerformed(evt);
            }
        });
        menu_fichero.add(menuItem_guardar);

        jMenuBar1.add(menu_fichero);

        menu_edicion.setText("Edición");

        menuItem_borrar.setText("Borrar");
        menuItem_borrar.setEnabled(false);
        menuItem_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_borrarActionPerformed(evt);
            }
        });
        menu_edicion.add(menuItem_borrar);

        menuItem_historial.setText("Historial");
        menuItem_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_historialActionPerformed(evt);
            }
        });
        menu_edicion.add(menuItem_historial);

        jMenuBar1.add(menu_edicion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_generarActionPerformed
        int n1 = Integer.parseInt(spinner_n1.getValue().toString());
        int n2 = Integer.parseInt(spinner_n2.getValue().toString());
        String nRandom = Integer.toString(numeroRandom(n1, n2));

        historial.add(nRandom);
        textField_resultado.setText(nRandom);
        menuItem_guardar.setEnabled(true);
        menuItem_borrar.setEnabled(true);
    }//GEN-LAST:event_boton_generarActionPerformed

    private void menuItem_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItem_salirActionPerformed

    private void menuItem_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_borrarActionPerformed
        spinner_n1.setValue(0);
        spinner_n2.setValue(10);
        textField_resultado.setText(null);
        menuItem_borrar.setEnabled(false);
        historial.clear();
        modeloLista.clear();
    }//GEN-LAST:event_menuItem_borrarActionPerformed

    private void menuItem_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_guardarActionPerformed
        JFileChooser fchooser = new JFileChooser();
        fchooser.setVisible(true);
        int seleccion = fchooser.showOpenDialog(fchooser);
        boolean append = false;

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = new File(fchooser.getSelectedFile().getPath() + ".txt");
            if (fichero.exists()) {
                int dialogButton = JOptionPane.showConfirmDialog(null, "El fichero ya existe,¿desea sobreescribirlo?", "WARNING", JOptionPane.YES_NO_OPTION);
                if (dialogButton == JOptionPane.NO_OPTION) {
                    append = true;
                }
            }
            Metodos.guardarEnFichero(historial, fichero, append);
        }
        menuItem_guardar.setEnabled(false);
    }//GEN-LAST:event_menuItem_guardarActionPerformed

    private void menuItem_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_historialActionPerformed
        dialog_historial.setLocationRelativeTo(null);
        dialog_historial.setVisible(true);
        modeloLista.clear();
        
        for (int i = 0; i < historial.size(); i++) {
            modeloLista.addElement(historial.get(i));
        }
    }//GEN-LAST:event_menuItem_historialActionPerformed

    private int numeroRandom(int min, int max) {
        int numeroRandom = Metodos.generarNumero(min, max);
        int contExit = 0;
        if (checkBox_primos.isSelected()) {
            while (!(Metodos.esPrimo(numeroRandom) || contExit == max)) {
                contExit++;
                numeroRandom = Metodos.generarNumero(min, max);
            }
        }

        if (contExit == max) {
            JOptionPane.showMessageDialog(null, "No existen números primos entre los dos valores.", "Error", JOptionPane.WARNING_MESSAGE);
            return 0;
        }

        return numeroRandom;
    }

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
            java.util.logging.Logger.getLogger(Aleatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aleatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aleatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aleatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aleatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_generar;
    private javax.swing.JCheckBox checkBox_primos;
    private javax.swing.JDialog dialog_historial;
    private javax.swing.JLabel etiqueta_desc;
    private javax.swing.JLabel etiqueta_historial;
    private javax.swing.JLabel etiqueta_n1;
    private javax.swing.JLabel etiqueta_n2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista_historial;
    private javax.swing.JMenuItem menuItem_borrar;
    private javax.swing.JMenuItem menuItem_guardar;
    private javax.swing.JMenuItem menuItem_historial;
    private javax.swing.JMenuItem menuItem_salir;
    private javax.swing.JMenu menu_edicion;
    private javax.swing.JMenu menu_fichero;
    private javax.swing.JPanel panel_dialog;
    private javax.swing.JSpinner spinner_n1;
    private javax.swing.JSpinner spinner_n2;
    private javax.swing.JTextField textField_resultado;
    // End of variables declaration//GEN-END:variables
}
