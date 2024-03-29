/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Excepciones.FechaInvalida;
import Excepciones.FormatoInvalido;
import Excepciones.NoFoto;
import concesionario.*;
import Ventanas.ExampleFileFilter;
import javax.swing.*;


public class VentanaAdmision extends javax.swing.JDialog {

    private Concesionario concesionario;
    private JFrame parent;
    private JCheckBox check1=new JCheckBox(" Indique si el autobus posee video");
    private String ruta; //Ruta de la foto del nuevo vehiculo
    
    public VentanaAdmision(JFrame parent, boolean modal) {
        super(parent, modal);
        this.parent = parent;
        concesionario = Concesionario.getInstance();
        initComponents();
        
        this.numRegLB.setText(""+concesionario.getNuevoNumeroRegistro());
        nombreConcesionarioLB.setText(Utilidades.getNombreConcesionario());
        fechaLB.setText(Utilidades.getFechaHoy());
        
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ficha = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        numRegLB = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        marcaTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        modeloTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        colorTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fechaTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        kilometrosTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        intervaloTF = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        insertarJB = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        precioTF = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        observaciones1TF = new javax.swing.JTextField();
        etiquetaInd1 = new javax.swing.JLabel();
        campo1TF = new javax.swing.JTextField();
        etiquetaInd2 = new javax.swing.JLabel();
        campo2TF = new javax.swing.JTextField();
        etiquetaInd3 = new javax.swing.JLabel();
        campo3TF = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        nombreConcesionarioLB = new javax.swing.JLabel();
        fechaLB = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tipoVehiculoCB = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        admisionJB = new javax.swing.JButton();
        limpiarJB = new javax.swing.JButton();
        cancelarJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ficha.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos a completar para la adquision de un vehiculo"));
        ficha.setLayout(new java.awt.GridLayout(13, 2, 10, 10));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText(" Número de registro");
        ficha.add(jLabel5);

        numRegLB.setToolTipText("Numero de registro asignado por el concesionario");
        ficha.add(numRegLB);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText(" Marca");
        ficha.add(jLabel6);

        marcaTF.setToolTipText("Marca del vehiculo");
        ficha.add(marcaTF);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText(" Modelo");
        ficha.add(jLabel7);

        modeloTF.setToolTipText("modelo del vehiculo");
        ficha.add(modeloTF);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText(" Color de la carroceria");
        ficha.add(jLabel8);
        ficha.add(colorTF);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText(" Fecha de fabricación");
        ficha.add(jLabel9);

        fechaTF.setToolTipText("Fecha en la que el vehiculo sale de fabrica");
        ficha.add(fechaTF);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText(" Kilómetros");
        ficha.add(jLabel10);

        kilometrosTF.setToolTipText("Lo que  mida el cuentakilometros");
        ficha.add(kilometrosTF);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText(" Intervalo de revisiones");
        ficha.add(jLabel11);

        intervaloTF.setToolTipText("Numero de kilometros indicados por el fabricante que deben transcurrir entra una revision y otra");
        ficha.add(intervaloTF);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText(" Fotografia");
        ficha.add(jLabel15);

        insertarJB.setText("Insertar Imagen");
        insertarJB.setToolTipText("Imagen del catalo del fabricante");
        insertarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarJBActionPerformed(evt);
            }
        });
        ficha.add(insertarJB);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText(" Precio");
        ficha.add(jLabel16);
        ficha.add(precioTF);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Observaciones");
        ficha.add(jLabel17);

        observaciones1TF.setToolTipText("Introducir otros datos de interes");
        ficha.add(observaciones1TF);

        etiquetaInd1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ficha.add(etiquetaInd1);
        ficha.add(campo1TF);

        etiquetaInd2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ficha.add(etiquetaInd2);
        ficha.add(campo2TF);

        etiquetaInd3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ficha.add(etiquetaInd3);
        ficha.add(campo3TF);

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        nombreConcesionarioLB.setText("Concesionario X");
        jPanel1.add(nombreConcesionarioLB);

        fechaLB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fechaLB.setText("FECHA");
        jPanel1.add(fechaLB);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADMISION DE VEHICULOS");

        tipoVehiculoCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccionar una>", "Camiones", "Autocares", "Furgonetas" }));
        tipoVehiculoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoVehiculoCBActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo de vehiculo");

        admisionJB.setText("Admision");
        admisionJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admisionJBActionPerformed(evt);
            }
        });
        jPanel2.add(admisionJB);

        limpiarJB.setText("Limpiar");
        limpiarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarJBActionPerformed(evt);
            }
        });
        jPanel2.add(limpiarJB);

        cancelarJB.setText("Cancelar");
        cancelarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarJBActionPerformed(evt);
            }
        });
        jPanel2.add(cancelarJB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel4)
                                .addGap(42, 42, 42)
                                .addComponent(tipoVehiculoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ficha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tipoVehiculoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarJBActionPerformed

        JFileChooser chooser = new JFileChooser();
        ExampleFileFilter filter = new ExampleFileFilter();
        filter.addExtension("jpg");
        filter.setDescription("JPG Imagenes");
        chooser.setFileFilter(filter);
        chooser.setAcceptAllFileFilterUsed(false);


        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String path = chooser.getSelectedFile().getAbsolutePath();
            //Si el fichero tiene extensión jpg se carga.
            String extension = path.substring(path.lastIndexOf('.') + 1).toUpperCase();
            if (extension.equalsIgnoreCase("JPG")) {
                //Se carga la imagen.
                ruta = path;
            } else {
                //El archivo seleccionado no tiene extensión jpg.
                javax.swing.JOptionPane.showMessageDialog(this, "Error: El archivo seleccionado no tiene extensión jpg.", "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_insertarJBActionPerformed

    private void tipoVehiculoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoVehiculoCBActionPerformed
// TODO add your handling code here:


        String eleccion = (String) tipoVehiculoCB.getSelectedItem();
        if (eleccion.equals("Camiones")) {
            ficha.remove(check1);
            ficha.add(campo3TF);
            campo3TF.setVisible(true);
            ficha.setVisible(true);
            jPanel2.setVisible(true);
            etiquetaInd1.setText(" Tara");
            etiquetaInd2.setText(" Carga maxima autorizada");
            etiquetaInd3.setText(" Numero de ruedas");
        } else if (eleccion.equals("Autocares")) {
            ficha.remove(campo3TF);
            ficha.add(check1);
            ficha.setVisible(true);
            jPanel2.setVisible(true);
            etiquetaInd1.setText(" Numero de pasajeros");
            etiquetaInd2.setText(" Numero de ruedas");
            etiquetaInd3.setText(" Video");

        } else if (eleccion.equals("Furgonetas")) {
            ficha.remove(check1);
            ficha.add(campo3TF);
            ficha.setVisible(true);
            jPanel2.setVisible(true);
            etiquetaInd1.setText(" Volumen de carga");
            etiquetaInd2.setText(" Longitud de carga");
            etiquetaInd3.setText("");
            campo3TF.setVisible(false);

        } else {
            ficha.setVisible(false);
            jPanel2.setVisible(false);
        }
    }//GEN-LAST:event_tipoVehiculoCBActionPerformed

    private void admisionJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admisionJBActionPerformed

        String eleccion = (String) tipoVehiculoCB.getSelectedItem();
        Vehiculo nuevoVehiculo = null;
        int nuevoNumeroRegistro = Concesionario.getNuevoNumeroRegistro();
        ImageIcon imagen;
        
       try {
            Utilidades.validarFecha(fechaTF.getText());
            if (ruta == null)
                throw new NoFoto();
            else
                imagen = new ImageIcon(ruta);
            
            
            if (eleccion.equals("Camiones")) 
                nuevoVehiculo= new Camion(nuevoNumeroRegistro, imagen, Integer.parseInt(kilometrosTF.getText()), Integer.parseInt(intervaloTF.getText()), Double.parseDouble(precioTF.getText()), marcaTF.getText(), modeloTF.getText(), colorTF.getText(), fechaTF.getText(), observaciones1TF.getText(), Double.parseDouble(campo1TF.getText()), Double.parseDouble(campo2TF.getText()), Integer.parseInt(campo3TF.getText()));
                
            else if (eleccion.equals("Autocares")) 
                nuevoVehiculo = new Autobus(nuevoNumeroRegistro, imagen, Integer.parseInt(kilometrosTF.getText()), Integer.parseInt(intervaloTF.getText()), Double.parseDouble(precioTF.getText()), marcaTF.getText(), modeloTF.getText(), colorTF.getText(), fechaTF.getText(), observaciones1TF.getText(), Integer.parseInt(campo1TF.getText()), Integer.parseInt(campo2TF.getText()), check1.isSelected());
                
            else if (eleccion.equals("Furgonetas")) 
                nuevoVehiculo = new Furgoneta(nuevoNumeroRegistro, imagen, Integer.parseInt(kilometrosTF.getText()), Integer.parseInt(intervaloTF.getText()), Double.parseDouble(precioTF.getText()), marcaTF.getText(), modeloTF.getText(), colorTF.getText(), fechaTF.getText(), observaciones1TF.getText(), Double.parseDouble(campo1TF.getText()), Double.parseDouble(campo2TF.getText()));
            
            concesionario.anadirVehiculoExposicion(nuevoVehiculo);
            
            this.setVisible(false);
            this.dispose();
        } catch (FechaInvalida e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (FormatoInvalido e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NoFoto e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Uno o mas campos no son validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_admisionJBActionPerformed

    private void limpiarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarJBActionPerformed
// TODO add your handling code here:
        campo1TF.setText("");
        campo2TF.setText("");
        campo3TF.setText("");
        colorTF.setText("");
        fechaTF.setText("");
        intervaloTF.setText("");
        kilometrosTF.setText("");
        marcaTF.setText("");
        modeloTF.setText("");
        observaciones1TF.setText("");
        precioTF.setText("");


    }//GEN-LAST:event_limpiarJBActionPerformed

    private void cancelarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarJBActionPerformed
// TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelarJBActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admisionJB;
    private javax.swing.JTextField campo1TF;
    private javax.swing.JTextField campo2TF;
    private javax.swing.JTextField campo3TF;
    private javax.swing.JButton cancelarJB;
    private javax.swing.JTextField colorTF;
    private javax.swing.JLabel etiquetaInd1;
    private javax.swing.JLabel etiquetaInd2;
    private javax.swing.JLabel etiquetaInd3;
    private javax.swing.JLabel fechaLB;
    private javax.swing.JTextField fechaTF;
    private javax.swing.JPanel ficha;
    private javax.swing.JButton insertarJB;
    private javax.swing.JTextField intervaloTF;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField kilometrosTF;
    private javax.swing.JButton limpiarJB;
    private javax.swing.JTextField marcaTF;
    private javax.swing.JTextField modeloTF;
    private javax.swing.JLabel nombreConcesionarioLB;
    private javax.swing.JLabel numRegLB;
    private javax.swing.JTextField observaciones1TF;
    private javax.swing.JTextField precioTF;
    private javax.swing.JComboBox tipoVehiculoCB;
    // End of variables declaration//GEN-END:variables
}
