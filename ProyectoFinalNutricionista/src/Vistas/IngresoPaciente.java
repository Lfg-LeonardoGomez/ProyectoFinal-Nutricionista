/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.DietaData;
import AccesoADatos.PacienteData;
import Entidades.Dieta;
import Entidades.Paciente;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/**
 *
 * @author edgar
 */
public class IngresoPaciente extends javax.swing.JInternalFrame {

    private Paciente paciente = null;
    private Dieta dieta = null;
    private PacienteData paData= new PacienteData();
    private DietaData dieData = new DietaData();
    /**
     * Creates new form IngresoPaciente
     */
    public IngresoPaciente() {
        initComponents();
        paData= new PacienteData();
        dieData = new DietaData();
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
        jLDocumento = new javax.swing.JLabel();
        jTDocumento = new javax.swing.JTextField();
        jLNombre = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLApellido = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jLDomicilio = new javax.swing.JLabel();
        jTDomicilio = new javax.swing.JTextField();
        jLTelefono = new javax.swing.JLabel();
        jTTelefono = new javax.swing.JTextField();
        jLDieta = new javax.swing.JLabel();
        jTDieta = new javax.swing.JTextField();
        jLInicio = new javax.swing.JLabel();
        jDCInicio = new com.toedter.calendar.JDateChooser();
        jLFinal = new javax.swing.JLabel();
        jDCFinal = new com.toedter.calendar.JDateChooser();
        jLInicial = new javax.swing.JLabel();
        jTInicial = new javax.swing.JTextField();
        jLBuscado = new javax.swing.JLabel();
        jTActual = new javax.swing.JTextField();
        jLPesoFinal = new javax.swing.JLabel();
        jTBuscado = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLDocumento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLDocumento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDocumento.setText("Documento:");

        jTDocumento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDocumentoFocusLost(evt);
            }
        });
        jTDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDocumentoActionPerformed(evt);
            }
        });
        jTDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTDocumentoKeyReleased(evt);
            }
        });

        jLNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLNombre.setText("Nombre:");

        jTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreActionPerformed(evt);
            }
        });
        jTNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTNombreKeyReleased(evt);
            }
        });

        jLApellido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLApellido.setText("Apellido:");

        jTApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTApellidoActionPerformed(evt);
            }
        });
        jTApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTApellidoKeyReleased(evt);
            }
        });

        jLDomicilio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLDomicilio.setText("Domicilio:");

        jTDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTDomicilioKeyReleased(evt);
            }
        });

        jLTelefono.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLTelefono.setText("Telefono:");

        jTTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTTelefonoKeyReleased(evt);
            }
        });

        jLDieta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLDieta.setText("Nombre de Dieta:");

        jTDieta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTDietaKeyReleased(evt);
            }
        });

        jLInicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLInicio.setText("Fecha de Inicio:");

        jLFinal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLFinal.setText("Fecha de Final:");

        jLInicial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLInicial.setText("Peso Incial:");

        jTInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTInicialKeyReleased(evt);
            }
        });

        jLBuscado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLBuscado.setText("Peso Actual:");

        jTActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTActualKeyReleased(evt);
            }
        });

        jLPesoFinal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLPesoFinal.setText("Peso Buscado:");

        jTBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBuscadoActionPerformed(evt);
            }
        });
        jTBuscado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscadoKeyReleased(evt);
            }
        });

        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/disco-flexible.png"))); // NOI18N
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nuevo-documento.png"))); // NOI18N
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPTitulo.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Formulario Paciente");

        javax.swing.GroupLayout jPTituloLayout = new javax.swing.GroupLayout(jPTitulo);
        jPTitulo.setLayout(jPTituloLayout);
        jPTituloLayout.setHorizontalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPTituloLayout.setVerticalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDocumento)
                    .addComponent(jLApellido)
                    .addComponent(jLTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDomicilio)
                    .addComponent(jLNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDieta)
                            .addComponent(jLInicio)
                            .addComponent(jLInicial)
                            .addComponent(jLPesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTBuscado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTInicial)
                            .addComponent(jDCInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLBuscado))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDCFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(jTActual)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jBNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(jBGuardar)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDocumento)
                    .addComponent(jTDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombre)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLApellido)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDomicilio)
                    .addComponent(jTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTelefono))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDieta)
                    .addComponent(jTDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLInicio)
                    .addComponent(jDCInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDCFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLFinal))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLInicial)
                    .addComponent(jTActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLBuscado)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPesoFinal)
                    .addComponent(jTBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBNuevo)
                    .addComponent(jBGuardar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
        paciente=null;
        dieta=null;
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:
        try{
            Integer dni= Integer.parseInt(this.jTDocumento.getText());
            String nombre = this.jTNombre.getText();
            String apellido = this.jTApellido.getText();
            String domicilio = this.jTDomicilio.getText();
            if(nombre.isEmpty() || apellido.isEmpty() || domicilio.isEmpty()){
                JOptionPane.showMessageDialog(null, "No pueden haber campos vacios");
                return;
            }
            Integer telefono= Integer.parseInt(jTTelefono.getText());
            String nombreDieta= this.jTDieta.getText();
            if(nombreDieta.isEmpty()){
                JOptionPane.showMessageDialog(null, "No pueden haber campos vacios");
                return;
            }
            Date fecha=this.jDCInicio.getDate();
            LocalDate  fechaInicio=fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            fecha=this.jDCFinal.getDate();
            LocalDate fechaFinal=fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Double pesoInicial= Double.parseDouble(this.jTInicial.getText());
            Double pesoActual= Double.parseDouble(this.jTActual.getText());
            Double pesoBuscado = Double.parseDouble(this.jTBuscado.getText());
            boolean estado= true;
            if(paciente==null && dieta==null){
                paciente= new Paciente(nombre, apellido, domicilio, dni, telefono, estado);
                dieta= new Dieta(paciente, nombreDieta, fechaInicio, fechaFinal, pesoInicial, pesoActual, pesoBuscado, estado);
                paData.guardarPaciente(paciente);
                dieData.guardarDieta(dieta);
            }else{
                paciente.setDni(dni);
                paciente.setNombre(nombre);
                paciente.setApellido(apellido);
                paciente.setDomicilio(domicilio);
                paciente.setTelefono(telefono);
                dieta.setNombre(nombre);
                dieta.setPaciente(paciente);
                dieta.setFechaInicio(fechaInicio);
                dieta.setFechaFinal(fechaFinal);
                dieta.setPesoInicial(pesoInicial);
                dieta.setPesoBuscado(pesoBuscado);
                dieta.setPesoActual(pesoActual);
                paData.modificarPaciente(paciente);
                dieData.modificarDieta(dieta);
            }
          limpiarCampos();
//  JOptionPane.showMessageDialog(null, "Paciente ingresado exitosamente");
        }catch(NumberFormatException ex){
            System.out.println(ex.getLocalizedMessage());
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero valido" +ex.getMessage());
        }

    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscadoActionPerformed

    private void jTApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTApellidoActionPerformed

    private void jTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreActionPerformed

    private void jTDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDocumentoActionPerformed

    private void jTNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombreKeyReleased
        // TODO add your handling code here:
       Pattern patron=Pattern.compile("[a-zA-Z_ \\t\\n\\x0B\\f\\r]+");
       String nro = this.jTNombre.getText();
       Matcher m= patron.matcher(nro);
       if(!m.matches() && nro.length()>0){
           JOptionPane.showMessageDialog(this, "No es una letra");
           this.jTNombre.setText(nro.substring(0, nro.length()-1));
           this.jTNombre.requestFocus();
       }
    }//GEN-LAST:event_jTNombreKeyReleased

    private void jTDocumentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDocumentoFocusLost
        // TODO add your handling code here:
        try{
            if(jTDocumento.getText()!=""){
            Integer dni = Integer.parseInt(jTDocumento.getText());
            paciente=paData.buscarPorDocumento(dni);
            if(paciente != null){
                dieta=dieData.buscarDietaPorIDPaciente(paciente.getIdPaciente());
                if(dieta != null){
                    this.jTNombre.setText(paciente.getNombre());
                    this.jTApellido.setText(paciente.getApellido());
                    this.jTDomicilio.setText(paciente.getDomicilio());
                    this.jTTelefono.setText(Integer.toString(paciente.getTelefono()));
                    this.jTDieta.setText(dieta.getNombre());
                    LocalDate lc= dieta.getFechaInicio();
                    Date date=java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
                    jDCInicio.setDate(date);
                    lc= dieta.getFechaFinal();
                    date=java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
                    jDCFinal.setDate(date);
                    this.jTInicial.setText(Double.toString( dieta.getPesoInicial()));
                    this.jTActual.setText(Double.toString( dieta.getPesoActual()));
                    this.jTBuscado.setText(Double.toString(dieta.getPesoBuscado()));
                       JOptionPane.showMessageDialog(null, "Paciente ya registrado");
                }  
            }
         
            }
        }catch(NumberFormatException ex){
          //  JOptionPane.showMessageDialog(null, "Debe ingresar un numero valido");
        }
    }//GEN-LAST:event_jTDocumentoFocusLost

    private void jTDocumentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDocumentoKeyReleased
        // TODO add your handling code here:
       Pattern patron=Pattern.compile("[0-9]+");
       String nro = this.jTDocumento.getText();
       Matcher m= patron.matcher(nro);
       if(!m.matches() && nro.length()>0){
           JOptionPane.showMessageDialog(this, "No es un numero");
           this.jTDocumento.setText(nro.substring(0, nro.length()-1));
           this.jTDocumento.requestFocus();
       }
    }//GEN-LAST:event_jTDocumentoKeyReleased

    private void jTTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTelefonoKeyReleased
        // TODO add your handling code here:
       Pattern patron=Pattern.compile("[0-9]+");
       String nro = this.jTTelefono.getText();
       Matcher m= patron.matcher(nro);
       if(!m.matches() && nro.length()>0){
           JOptionPane.showMessageDialog(this, "No es un numero");
           this.jTTelefono.setText(nro.substring(0, nro.length()-1));
           this.jTTelefono.requestFocus();
       }
    }//GEN-LAST:event_jTTelefonoKeyReleased

    private void jTInicialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTInicialKeyReleased
        // TODO add your handling code here:
       Pattern patron=Pattern.compile("[0-9_.]+");
       String nro = this.jTInicial.getText();
       Matcher m= patron.matcher(nro);
       if(!m.matches() && nro.length()>0){
           JOptionPane.showMessageDialog(this, "No es un numero");
           this.jTInicial.setText(nro.substring(0, nro.length()-1));
           this.jTInicial.requestFocus();
       }
    }//GEN-LAST:event_jTInicialKeyReleased

    private void jTApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTApellidoKeyReleased
        // TODO add your handling code here:
       Pattern patron=Pattern.compile("[a-zA-Z_ \\t\\n\\x0B\\f\\r]+");
       String nro = this.jTApellido.getText();
       Matcher m= patron.matcher(nro);
       if(!m.matches() && nro.length()>0){
           JOptionPane.showMessageDialog(this, "No es una letra");
           this.jTApellido.setText(nro.substring(0, nro.length()-1));
           this.jTApellido.requestFocus();
       }
    }//GEN-LAST:event_jTApellidoKeyReleased

    private void jTDomicilioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDomicilioKeyReleased
        // TODO add your handling code here:
         Pattern patron=Pattern.compile("[a-zA-Z_0-9_ \\t\\n\\x0B\\f\\r]+");
       String nro = this.jTDomicilio.getText();
       Matcher m= patron.matcher(nro);
       if(!m.matches() && nro.length()>0){
           JOptionPane.showMessageDialog(this, "No es una letra");
           this.jTDomicilio.setText(nro.substring(0, nro.length()-1));
           this.jTDomicilio.requestFocus();
       }
    }//GEN-LAST:event_jTDomicilioKeyReleased

    private void jTActualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTActualKeyReleased
        // TODO add your handling code here:
        Pattern patron=Pattern.compile("[0-9_.]+");
       String nro = this.jTActual.getText();
       Matcher m= patron.matcher(nro);
       if(!m.matches() && nro.length()>0){
           JOptionPane.showMessageDialog(this, "No es un numero");
           this.jTActual.setText(nro.substring(0, nro.length()-1));
           this.jTActual.requestFocus();
       }
    }//GEN-LAST:event_jTActualKeyReleased

    private void jTBuscadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscadoKeyReleased
        // TODO add your handling code here:
       Pattern patron=Pattern.compile("[0-9_.]+");
       String nro = this.jTBuscado.getText();
       Matcher m= patron.matcher(nro);
       if(!m.matches() && nro.length()>0){
           JOptionPane.showMessageDialog(this, "No es un numero");
           this.jTBuscado.setText(nro.substring(0, nro.length()-1));
           this.jTBuscado.requestFocus();
       }
    }//GEN-LAST:event_jTBuscadoKeyReleased

    private void jTDietaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDietaKeyReleased
        // TODO add your handling code here:
        Pattern patron=Pattern.compile("[a-zA-Z_ \\t\\n\\x0B\\f\\r]+");
       String nro = this.jTDieta.getText();
       Matcher m= patron.matcher(nro);
       if(!m.matches() && nro.length()>0){
           JOptionPane.showMessageDialog(this, "No es una letra");
           this.jTDieta.setText(nro.substring(0, nro.length()-1));
           this.jTDieta.requestFocus();
       }
    }//GEN-LAST:event_jTDietaKeyReleased

    private void limpiarCampos(){
        this.jTDocumento.setText("");
        this.jTNombre.setText("");
        this.jTApellido.setText("");
        this.jTDomicilio.setText("");
        this.jTTelefono.setText("");
        this.jDCInicio.setDate(new Date());
        this.jDCFinal.setDate(new Date());
        this.jTDieta.setText("");
        this.jTInicial.setText("");
        this.jTActual.setText("");
        this.jTBuscado.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(IngresoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private com.toedter.calendar.JDateChooser jDCFinal;
    private com.toedter.calendar.JDateChooser jDCInicio;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLBuscado;
    private javax.swing.JLabel jLDieta;
    private javax.swing.JLabel jLDocumento;
    private javax.swing.JLabel jLDomicilio;
    private javax.swing.JLabel jLFinal;
    private javax.swing.JLabel jLInicial;
    private javax.swing.JLabel jLInicio;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPesoFinal;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTActual;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTBuscado;
    private javax.swing.JTextField jTDieta;
    private javax.swing.JTextField jTDocumento;
    private javax.swing.JTextField jTDomicilio;
    private javax.swing.JTextField jTInicial;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTTelefono;
    // End of variables declaration//GEN-END:variables
}
