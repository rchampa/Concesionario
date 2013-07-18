/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Excepciones.UsuarioIncorrecto;
import concesionario.Empleado;
import concesionario.GestorUsuarios;
import concesionario.Usuario;
import concesionario.Utilidades;
import java.awt.Image;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class VentanaAltaBajaUsuarios extends javax.swing.JDialog {

    private final int ALTO_FOTO = 150;
    private final int ANCHO_FOTO = 160;
    private String ruta;
    private GestorUsuarios gestorUsuarios;
    //private DefaultListModel<Usuario> modeloListaUsuarios;//Version 1.7 Parametrizada
    private DefaultListModel modeloListaUsuarios;
    
    
    public VentanaAltaBajaUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        gestorUsuarios = GestorUsuarios.getInstance();
        initComponents();
        
        //modeloListaUsuarios = new DefaultListModel<Usuario>();//Version 1.7 Parametrizada
        modeloListaUsuarios = new DefaultListModel();
        
        String codigo;
        Usuario user;
        Iterator<String> codigos = gestorUsuarios.getIteradorClaves();
        
        while(codigos.hasNext()){
            codigo = codigos.next();
            try {
                user = gestorUsuarios.obtenerUsuario(codigo);
                if(user instanceof Empleado)//Solo se anaden a la lista los empleados y no los administradores
                    modeloListaUsuarios.addElement(user);
            } catch (UsuarioIncorrecto ex) {
                
            }
        }
        
        listaUsuariosJL.setModel(modeloListaUsuarios);
        nombreConcesionarioLB.setText(Utilidades.getNombreConcesionario());
        fechaLB.setText(Utilidades.getFechaHoy());
        this.setVisible(true);
        
    }

    private void limpiarAlta(){
        codigoTF.setText("");
        nombreTF.setText("");
        contrasenaPF.setText("");
        ruta = "";
        fotoLB.setIcon(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombreConcesionarioLB = new javax.swing.JLabel();
        fechaLB = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        codigoTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        contrasenaPF = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        nombreTF = new javax.swing.JTextField();
        fotoJB = new javax.swing.JButton();
        fotoLB = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        bajaJB = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaUsuariosJL = new javax.swing.JList();
        altaJB = new javax.swing.JButton();
        limpiarAltaJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        nombreConcesionarioLB.setText("Concesionario X");
        jPanel1.add(nombreConcesionarioLB);

        fechaLB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fechaLB.setText("FECHA");
        jPanel1.add(fechaLB);

        getContentPane().add(jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Alta"));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Código de nuevo usuario");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Contraseña");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nombre de nuevo usuario");

        fotoJB.setText("Elegir foto");
        fotoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotoJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(fotoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fotoLB, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(codigoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(contrasenaPF))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(nombreTF))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contrasenaPF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(fotoJB)
                        .addGap(0, 117, Short.MAX_VALUE))
                    .addComponent(fotoLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        bajaJB.setText("Baja");
        bajaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaJBActionPerformed(evt);
            }
        });
        jPanel4.add(bajaJB);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Baja"));
        jPanel5.setLayout(new java.awt.GridLayout(1, 2, 20, 20));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Lista de Usuarios");
        jPanel5.add(jLabel7);

        listaUsuariosJL.setVisibleRowCount(4);
        jScrollPane1.setViewportView(listaUsuariosJL);

        jPanel5.add(jScrollPane1);

        altaJB.setText("Alta");
        altaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaJBActionPerformed(evt);
            }
        });

        limpiarAltaJB.setText("Limpiar");
        limpiarAltaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarAltaJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(altaJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpiarAltaJB)
                        .addGap(225, 225, 225))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altaJB)
                    .addComponent(limpiarAltaJB))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bajaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaJBActionPerformed
        
        
        try {
            Usuario user = (Usuario)modeloListaUsuarios.get(listaUsuariosJL.getSelectedIndex());
            gestorUsuarios.elminarUsuario(user);
            modeloListaUsuarios.removeElement(user);
            JOptionPane.showMessageDialog(this, "El empleado se ha eliminado correctamente.", "Baja completada", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "No has seleccionado ningun empleado.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (UsuarioIncorrecto ex) {
            JOptionPane.showMessageDialog(this, "Error al intentar dar de baja al usuario.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_bajaJBActionPerformed

    private void altaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaJBActionPerformed
        
        
         try {
            String codigo = codigoTF.getText();
            String nombre = nombreTF.getText();
            String contrasena = new String(contrasenaPF.getPassword());
             System.out.println("Pass: " + contrasena);
            
            if(ruta == null || "".equals(ruta))
                throw new NullPointerException();
            
            ImageIcon imagen = new ImageIcon(ruta);
            Usuario user = new Empleado(codigo, contrasena, nombre, imagen);
       
            gestorUsuarios.anadirUsuario(user);
            JOptionPane.showMessageDialog(this, "El empleado se ha añadido correctamente.", "Alta completada", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
            limpiarAlta();
        
            modeloListaUsuarios.addElement(user);
            
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Deves completar correctamente todos los campos.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (UsuarioIncorrecto ex) {
            JOptionPane.showMessageDialog(this, "Error al intentar añadir el usuario", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_altaJBActionPerformed

    private void limpiarAltaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarAltaJBActionPerformed
        
        limpiarAlta();
        
    }//GEN-LAST:event_limpiarAltaJBActionPerformed

    private void fotoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotoJBActionPerformed
        
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
                Image imagen = new ImageIcon(ruta).getImage().getScaledInstance(ANCHO_FOTO, ALTO_FOTO, Image.SCALE_AREA_AVERAGING);
                fotoLB.setIcon(new ImageIcon(imagen));
                
            } else {
                //El archivo seleccionado no tiene extensión jpg.
                fotoLB.setIcon(null);
                JOptionPane.showMessageDialog(this, "Error: El archivo seleccionado no tiene extensión jpg.", "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            fotoLB.setText("");
        }
        
    }//GEN-LAST:event_fotoJBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton altaJB;
    private javax.swing.JButton bajaJB;
    private javax.swing.JTextField codigoTF;
    private javax.swing.JPasswordField contrasenaPF;
    private javax.swing.JLabel fechaLB;
    private javax.swing.JButton fotoJB;
    private javax.swing.JLabel fotoLB;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiarAltaJB;
    private javax.swing.JList listaUsuariosJL;
    private javax.swing.JLabel nombreConcesionarioLB;
    private javax.swing.JTextField nombreTF;
    // End of variables declaration//GEN-END:variables
}