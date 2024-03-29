/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Excepciones.*;
import concesionario.*;
import java.awt.Image;
import java.util.Collection;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class VentanaVenta extends javax.swing.JDialog {

    private Concesionario concesionario;
    private JFrame parent;
    //private DefaultListModel<Vehiculo> modeloListaVehiculos;//Version 1.7 Parametrizada
    private DefaultListModel modeloListaVehiculos;
    
    
    public VentanaVenta(JFrame parent, boolean modal) {
        super(parent, modal);
        this.parent = parent;
        concesionario = Concesionario.getInstance();
        initComponents();
       
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nombreConcesionarioLB = new javax.swing.JLabel();
        fechaLB = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tipovehiculoCB = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaVehiculosJL = new javax.swing.JList();
        jPanel13 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        marcaLB = new javax.swing.JLabel();
        modeloLB = new javax.swing.JLabel();
        colorLB = new javax.swing.JLabel();
        kmLB = new javax.swing.JLabel();
        intervaloLB = new javax.swing.JLabel();
        precioLB = new javax.swing.JLabel();
        fechaDGLB = new javax.swing.JLabel();
        campo1LB = new javax.swing.JLabel();
        campo2LB = new javax.swing.JLabel();
        campo3LB = new javax.swing.JLabel();
        campo4LB = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        observacionesJB = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        fotoLB = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        fecha_compra = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Matricula = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        propietario = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        dnicif = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        venderJB = new javax.swing.JButton();
        cancelarJB = new javax.swing.JButton();
        limpiarJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        nombreConcesionarioLB.setText("Concesionario X");
        jPanel1.add(nombreConcesionarioLB);

        fechaLB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fechaLB.setText("FECHA");
        jPanel1.add(fechaLB);

        jPanel2.add(jPanel1);

        jLabel4.setText("ELIGE TIPO VEHICULO:");

        tipovehiculoCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccionar tipo>", "Camiones", "Autocares", "Furgonetas" }));
        tipovehiculoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipovehiculoCBActionPerformed(evt);
            }
        });

        jLabel1.setText("ELIGE EL VEHICULO: ");

        listaVehiculosJL.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaVehiculosJL.setToolTipText("Seleccione un vehiculo");
        listaVehiculosJL.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaVehiculosJLValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaVehiculosJL);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Venta de Vehiculos");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tipovehiculoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tipovehiculoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addContainerGap())))
        );

        jPanel2.add(jPanel7);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Generales del Vehiculo"));
        jPanel4.setLayout(new java.awt.GridLayout(7, 2, 5, 0));
        jPanel4.add(marcaLB);
        jPanel4.add(modeloLB);
        jPanel4.add(colorLB);
        jPanel4.add(kmLB);
        jPanel4.add(intervaloLB);
        jPanel4.add(precioLB);
        jPanel4.add(fechaDGLB);
        jPanel4.add(campo1LB);
        jPanel4.add(campo2LB);
        jPanel4.add(campo3LB);
        jPanel4.add(campo4LB);
        jPanel4.add(jLabel24);
        jPanel4.add(jLabel25);

        observacionesJB.setText("Observaciones");
        observacionesJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacionesJBActionPerformed(evt);
            }
        });
        jPanel4.add(observacionesJB);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagen del vehiculo"));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fotoLB, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fotoLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la venta"));
        jPanel5.setLayout(new java.awt.GridLayout(4, 2, 0, 10));

        jLabel17.setText("Fecha de compra");
        jPanel5.add(jLabel17);
        jPanel5.add(fecha_compra);

        jLabel18.setText("Matricula");
        jPanel5.add(jLabel18);
        jPanel5.add(Matricula);

        jLabel19.setText("Propietario");
        jPanel5.add(jLabel19);
        jPanel5.add(propietario);

        jLabel20.setText("Dni o Cif");
        jPanel5.add(jLabel20);
        jPanel5.add(dnicif);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel8);

        venderJB.setText("Vender");
        venderJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderJBActionPerformed(evt);
            }
        });
        jPanel3.add(venderJB);

        cancelarJB.setText("Cancelar");
        cancelarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarJBActionPerformed(evt);
            }
        });
        jPanel3.add(cancelarJB);

        limpiarJB.setText("Limpiar");
        limpiarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarJBActionPerformed(evt);
            }
        });
        jPanel3.add(limpiarJB);

        jPanel2.add(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaVehiculosJLValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaVehiculosJLValueChanged

        int seleccionado = listaVehiculosJL.getSelectedIndex();
        
        if(seleccionado!=-1){
            Vehiculo v = (Vehiculo)modeloListaVehiculos.get(seleccionado);
            fotoLB.setIcon(v.getFoto());
            marcaLB.setText("Marca: "+v.getMarca());
            modeloLB.setText("Modelo: "+v.getModelo());
            colorLB.setText("Color: "+v.getColor());
            kmLB.setText("KM: "+v.getKilometros());
            intervaloLB.setText("Intervalo: "+v.getIntervalo_revisiones());
            precioLB.setText("Precio: "+v.getPrecio()+" €");
            fechaDGLB.setText("Fecha: "+v.getFecha());

            Image imagen = v.getFoto().getImage().getScaledInstance(Utilidades.ANCHO_FOTO+100, Utilidades.ALTO_FOTO, Image.SCALE_AREA_AVERAGING);
            fotoLB.setIcon(new ImageIcon(imagen));
            
            if(v instanceof Camion){
            Camion c = (Camion)v;
            campo1LB.setText("Carga Max: "+c.getCargaMaxima());
            campo2LB.setText("Tara: "+c.getTara());
            campo3LB.setText("Nº ruedas: "+c.getNumRuedas());
            }
            else if(v instanceof Furgoneta){
                Furgoneta f = (Furgoneta)v;
                campo1LB.setText("Volumen de carga: "+f.getVolumenCarga());
                campo2LB.setText("Longitud de carga: "+f.getLongitudCarga());
                campo3LB.setText("");
            }
            else if(v instanceof Autobus){
                Autobus a = (Autobus)v;
                campo1LB.setText("Nº pasajeros: "+a.getNumPasajeros());
                campo2LB.setText("Nº ruedas: "+a.getNumRuedas());
                campo3LB.setText("Video disponible: "+ (a.isVideoDisponible()? "Si" : "No"));
            }
        }
        
    }//GEN-LAST:event_listaVehiculosJLValueChanged

    private void observacionesJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacionesJBActionPerformed

        int seleccionado = listaVehiculosJL.getSelectedIndex();
        
        if(seleccionado!=-1){
            Vehiculo v = (Vehiculo)modeloListaVehiculos.get(seleccionado);
            JOptionPane.showMessageDialog(this, v.getObservaciones(), "Observaciones", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_observacionesJBActionPerformed

    private void venderJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderJBActionPerformed

        try {
            DniCif dni = new DniCif(dnicif.getText());
            Utilidades.validarMatricula(Matricula.getText());
            
            if(concesionario.comprobarVenta(Matricula.getText()))
                throw new MatriculaExistente();
            
            Utilidades.validarFecha(fecha_compra.getText());
            
            int seleccionado = listaVehiculosJL.getSelectedIndex();
        
            if(seleccionado!=-1){
                Vehiculo v = (Vehiculo)modeloListaVehiculos.get(seleccionado);
                concesionario.ventaVehiculo(dni, Matricula.getText(), v);
            } 

            JOptionPane.showMessageDialog(this, "Vehiculo vendido.", "Venta", JOptionPane.INFORMATION_MESSAGE);
            
            this.setVisible(false);
            this.dispose();
        } catch (NullPointerException h) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un vehiculo", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (MatriculaInvalida h) {
            JOptionPane.showMessageDialog(this, h.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (FechaInvalida h) {
            JOptionPane.showMessageDialog(this, h.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (DniInvalido h) {
            JOptionPane.showMessageDialog(this, h.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (CifInvalido h) {
            JOptionPane.showMessageDialog(this, h.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (MatriculaExistente v) {
            JOptionPane.showMessageDialog(this, v.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (FormatoInvalido v) {
            JOptionPane.showMessageDialog(this, v.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception v) {
            JOptionPane.showMessageDialog(this, "error, un campo o mas son invalidos");
        }
    }//GEN-LAST:event_venderJBActionPerformed

    private void cancelarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarJBActionPerformed
// TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelarJBActionPerformed

    private void limpiarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarJBActionPerformed
// TODO add your handling code here:
        fecha_compra.setText("");
        dnicif.setText("");
        Matricula.setText("");
        propietario.setText("");
    }//GEN-LAST:event_limpiarJBActionPerformed

    private void tipovehiculoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipovehiculoCBActionPerformed
       
        
        String eleccion = (String) tipovehiculoCB.getSelectedItem();
        
        Iterator<Integer> it = concesionario.getNumRegistrosExposicion();
        int numRegistro=-1;
        

        if (eleccion.equals("Camiones")) {
            
            //modeloListaVehiculos = new DefaultListModel<Vehiculo>();//Version 1.7 Parametrizada
            modeloListaVehiculos = new DefaultListModel();
            
            while(it.hasNext()){
                numRegistro = it.next();
                Vehiculo v = concesionario.getVehiculoExposicion(numRegistro);
                if(v instanceof Camion)
                   modeloListaVehiculos.addElement(v);
                
            }

            listaVehiculosJL.setModel(modeloListaVehiculos);
        } 
        else if (eleccion.equals("Furgonetas")) {
           
            //modeloListaVehiculos = new DefaultListModel<Vehiculo>();//Version 1.7 Parametrizada
            modeloListaVehiculos = new DefaultListModel();
            
            while(it.hasNext()){
                numRegistro = it.next();
                Vehiculo v = concesionario.getVehiculoExposicion(numRegistro);
                if(v instanceof Furgoneta)
                   modeloListaVehiculos.addElement(v);
                
            }

            listaVehiculosJL.setModel(modeloListaVehiculos);
            
        } else if (eleccion.equals("Autocares")) {
            //modeloListaVehiculos = new DefaultListModel<Vehiculo>();//Version 1.7 Parametrizada
            modeloListaVehiculos = new DefaultListModel();
            
            while(it.hasNext()){
                numRegistro = it.next();
                Vehiculo v = concesionario.getVehiculoExposicion(numRegistro);
                if(v instanceof Autobus)
                   modeloListaVehiculos.addElement(v);
                
            }

            listaVehiculosJL.setModel(modeloListaVehiculos);
            
        } else {
            // En caso de que el usuario eliga <seleccionar tipo> le mostraremos todos los vehiculos de la exposicion
            //modeloListaVehiculos = new DefaultListModel<Vehiculo>();//Version 1.7 Parametrizada
            modeloListaVehiculos = new DefaultListModel();
            
            while(it.hasNext()){
                numRegistro = it.next();
                Vehiculo v = concesionario.getVehiculoExposicion(numRegistro);
                modeloListaVehiculos.addElement(v);
                
            }

            listaVehiculosJL.setModel(modeloListaVehiculos);
        } 
         
         
        
        
    }//GEN-LAST:event_tipovehiculoCBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Matricula;
    private javax.swing.JLabel campo1LB;
    private javax.swing.JLabel campo2LB;
    private javax.swing.JLabel campo3LB;
    private javax.swing.JLabel campo4LB;
    private javax.swing.JButton cancelarJB;
    private javax.swing.JLabel colorLB;
    private javax.swing.JTextField dnicif;
    private javax.swing.JLabel fechaDGLB;
    private javax.swing.JLabel fechaLB;
    private javax.swing.JTextField fecha_compra;
    private javax.swing.JLabel fotoLB;
    private javax.swing.JLabel intervaloLB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kmLB;
    private javax.swing.JButton limpiarJB;
    private javax.swing.JList listaVehiculosJL;
    private javax.swing.JLabel marcaLB;
    private javax.swing.JLabel modeloLB;
    private javax.swing.JLabel nombreConcesionarioLB;
    private javax.swing.JButton observacionesJB;
    private javax.swing.JLabel precioLB;
    private javax.swing.JTextField propietario;
    private javax.swing.JComboBox tipovehiculoCB;
    private javax.swing.JButton venderJB;
    // End of variables declaration//GEN-END:variables
}
