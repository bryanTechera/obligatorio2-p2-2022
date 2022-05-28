/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Controlador.Sistema;
import Dominio.Cliente;
import Dominio.Deposito;
import Dominio.Empleado;
import java.awt.Color;
import java.awt.Component;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class RegistroContrato extends javax.swing.JFrame implements Observer {

    private HashMap<String, Empleado> empleados;
    private HashMap<String, Cliente> clientes;
    private HashMap<Integer, Deposito> depositos;
    private Sistema sistema;

    /**
     * Creates new form RegistroContrato
     */
    public RegistroContrato(Sistema sistema) {
        this.sistema = sistema;
        this.empleados = sistema.getEmpleados();
        this.clientes = sistema.getClientes();
        this.depositos = sistema.getDepositos();
        initComponents();
        cargarListas();
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
        String opcion = (String) arg;
        if (opcion.equals("empleado")) {
            empleados = sistema.getEmpleados();
        } else if (opcion.equals("deposito")) {
            depositos = sistema.getDepositos();
        } else if (opcion.equals("cliente")) {
            clientes = sistema.getClientes();
        }
    }

    private void cargarListas() {
        //LISTA EMPLEADOS
        DefaultListModel modeloDeListaEmpl = new DefaultListModel();
        modeloDeListaEmpl.addAll(this.empleados.values());
        this.listEmleados.setModel(modeloDeListaEmpl);
        this.Empleados.repaint();
        //LISTA CLIENTES
        DefaultListModel modeloDeListaClie = new DefaultListModel();
        modeloDeListaClie.addAll(this.clientes.values());
        this.listClientes.setModel(modeloDeListaClie);
    }

    private void cargarDepositos(int tamMinimo, int tamMaximo, boolean noRelevanteEstan, boolean noRelevanteRefri, boolean conEstan, boolean conRefri) {

        Collection<Deposito> coleccionDeDepositos = this.depositos.values();
        Iterator it = coleccionDeDepositos.iterator();
        //LISTA DEPOSITOS
        DefaultListModel modeloDeListaDepo = new DefaultListModel();
        this.listadepositos.setCellRenderer(new RenderCeldasDepositos());
        while (it.hasNext()) {
            boolean loAgrego = true;
            Deposito miDep = (Deposito) it.next();
            if (miDep.getTamaño() >= tamMinimo && miDep.getTamaño() <= tamMaximo) {
                if (!noRelevanteEstan) {
                    //ME PIDEN CON ESTANTES
                    if (miDep.esEstante() != conEstan) {
                        loAgrego = false;
                    }
                }
                if (!noRelevanteRefri) {
                    // ME PIDEN CON REFRIGERACION
                    if (miDep.esRefrigerado() != conRefri) {
                        loAgrego = false;
                    }
                }
            } else {
                loAgrego = false;
            }

            if (loAgrego) {
                modeloDeListaDepo.addElement(miDep);
            }

        }
        this.listadepositos.setModel(modeloDeListaDepo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoEstantes = new javax.swing.ButtonGroup();
        grupoRefrigeracion = new javax.swing.ButtonGroup();
        Clientes = new javax.swing.JScrollPane();
        listClientes = new javax.swing.JList();
        panelCaracteristicas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        checkEstantesNo = new javax.swing.JCheckBox();
        checkEstantesNoRel = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMin = new javax.swing.JTextField();
        txtMax = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        checkRefrigeradoSi = new javax.swing.JCheckBox();
        checkRefrigeradoNo = new javax.swing.JCheckBox();
        checkRefrigeradoNoRel = new javax.swing.JCheckBox();
        checkEstantesSi = new javax.swing.JCheckBox();
        labelMensaje1 = new javax.swing.JLabel();
        labelMensaje2 = new javax.swing.JLabel();
        panelAcciones = new javax.swing.JPanel();
        btnLimpiarCapmos = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        paneldepositos = new javax.swing.JScrollPane();
        listadepositos = new javax.swing.JList();
        subtitulos = new javax.swing.JPanel();
        labelEmpleados = new javax.swing.JLabel();
        labelClientes = new javax.swing.JLabel();
        lblDepositosDisp = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Empleados = new javax.swing.JScrollPane();
        listEmleados = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de contrato");
        getContentPane().setLayout(null);

        Clientes.setViewportView(listClientes);

        getContentPane().add(Clientes);
        Clientes.setBounds(300, 130, 270, 240);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Caracteristicas del deposito");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Tamaño");

        grupoEstantes.add(checkEstantesNo);
        checkEstantesNo.setText("No");

        grupoEstantes.add(checkEstantesNoRel);
        checkEstantesNoRel.setSelected(true);
        checkEstantesNoRel.setText("No relevante");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Estantes");

        jLabel6.setText("Min.");

        jLabel7.setText("Max.");

        txtMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Refrigeración");

        grupoRefrigeracion.add(checkRefrigeradoSi);
        checkRefrigeradoSi.setText("Si");

        grupoRefrigeracion.add(checkRefrigeradoNo);
        checkRefrigeradoNo.setText("No");

        grupoRefrigeracion.add(checkRefrigeradoNoRel);
        checkRefrigeradoNoRel.setSelected(true);
        checkRefrigeradoNoRel.setText("No relevante");

        grupoEstantes.add(checkEstantesSi);
        checkEstantesSi.setText("Si");

        javax.swing.GroupLayout panelCaracteristicasLayout = new javax.swing.GroupLayout(panelCaracteristicas);
        panelCaracteristicas.setLayout(panelCaracteristicasLayout);
        panelCaracteristicasLayout.setHorizontalGroup(
            panelCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCaracteristicasLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(panelCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCaracteristicasLayout.createSequentialGroup()
                        .addGroup(panelCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCaracteristicasLayout.createSequentialGroup()
                                .addGroup(panelCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCaracteristicasLayout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelCaracteristicasLayout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)
                                .addGroup(panelCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkEstantesNo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkEstantesNoRel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkEstantesSi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(panelCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(checkRefrigeradoSi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkRefrigeradoNo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkRefrigeradoNoRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCaracteristicasLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
        );
        panelCaracteristicasLayout.setVerticalGroup(
            panelCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCaracteristicasLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGroup(panelCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCaracteristicasLayout.createSequentialGroup()
                        .addGroup(panelCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCaracteristicasLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(checkEstantesNo))
                            .addGroup(panelCaracteristicasLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(panelCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(panelCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCaracteristicasLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(panelCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(panelCaracteristicasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkEstantesNoRel))))
                    .addGroup(panelCaracteristicasLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panelCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkRefrigeradoSi)
                            .addComponent(checkEstantesSi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkRefrigeradoNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkRefrigeradoNoRel)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(panelCaracteristicas);
        panelCaracteristicas.setBounds(20, 410, 460, 170);

        labelMensaje1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelMensaje1.setText("Seleccione un empleado, un cliente y las caracteristicas deseadas del deposito.");
        getContentPane().add(labelMensaje1);
        labelMensaje1.setBounds(80, 40, 670, 30);

        labelMensaje2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelMensaje2.setText("Luego seleccione los depositos que desea reservar.");
        getContentPane().add(labelMensaje2);
        labelMensaje2.setBounds(200, 50, 410, 40);

        panelAcciones.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        btnLimpiarCapmos.setText("Limpiar campos");
        btnLimpiarCapmos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCapmosActionPerformed(evt);
            }
        });
        panelAcciones.add(btnLimpiarCapmos);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panelAcciones.add(btnBuscar);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelAcciones.add(btnCancelar);

        btnReservar.setText("Reservar");
        panelAcciones.add(btnReservar);

        getContentPane().add(panelAcciones);
        panelAcciones.setBounds(530, 470, 290, 90);

        paneldepositos.setViewportView(listadepositos);

        getContentPane().add(paneldepositos);
        paneldepositos.setBounds(570, 130, 270, 240);

        subtitulos.setLayout(new java.awt.GridLayout(1, 3, 5, 0));

        labelEmpleados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelEmpleados.setText("Empleados");
        subtitulos.add(labelEmpleados);

        labelClientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelClientes.setText("Clientes");
        subtitulos.add(labelClientes);

        lblDepositosDisp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDepositosDisp.setText("Depositos disponibles");
        subtitulos.add(lblDepositosDisp);

        getContentPane().add(subtitulos);
        subtitulos.setBounds(30, 90, 810, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(30, 383, 810, 10);

        Empleados.setViewportView(listEmleados);

        getContentPane().add(Empleados);
        Empleados.setBounds(30, 130, 270, 240);

        setSize(new java.awt.Dimension(885, 613));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarCapmosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCapmosActionPerformed
        txtMin.setText("");
        txtMax.setText("");
        grupoEstantes.clearSelection();
        grupoRefrigeracion.clearSelection();


    }//GEN-LAST:event_btnLimpiarCapmosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int tamMinimo = Integer.parseInt(this.txtMin.getText());
        int tamMax = Integer.parseInt(this.txtMax.getText());
        boolean noRelevanteEstan = this.checkEstantesNoRel.isSelected();
        boolean noRelevanteRefri = this.checkRefrigeradoNoRel.isSelected();

        boolean conEstan = this.checkEstantesSi.isSelected();
        boolean conRefri = this.checkRefrigeradoSi.isSelected();

        cargarDepositos(tamMinimo, tamMax, noRelevanteEstan, noRelevanteRefri, conEstan, conRefri);

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Clientes;
    private javax.swing.JScrollPane Empleados;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpiarCapmos;
    private javax.swing.JButton btnReservar;
    private javax.swing.JCheckBox checkEstantesNo;
    private javax.swing.JCheckBox checkEstantesNoRel;
    private javax.swing.JCheckBox checkEstantesSi;
    private javax.swing.JCheckBox checkRefrigeradoNo;
    private javax.swing.JCheckBox checkRefrigeradoNoRel;
    private javax.swing.JCheckBox checkRefrigeradoSi;
    private javax.swing.ButtonGroup grupoEstantes;
    private javax.swing.ButtonGroup grupoRefrigeracion;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelClientes;
    private javax.swing.JLabel labelEmpleados;
    private javax.swing.JLabel labelMensaje1;
    private javax.swing.JLabel labelMensaje2;
    private javax.swing.JLabel lblDepositosDisp;
    private javax.swing.JList listClientes;
    private javax.swing.JList<String> listEmleados;
    private javax.swing.JList listadepositos;
    private javax.swing.JPanel panelAcciones;
    private javax.swing.JPanel panelCaracteristicas;
    private javax.swing.JScrollPane paneldepositos;
    private javax.swing.JPanel subtitulos;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMin;
    // End of variables declaration//GEN-END:variables

}

class RenderCeldasDepositos extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Component miCelda = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        Deposito dep = (Deposito) value;
        if (dep.esEstante() && dep.esRefrigerado()) {
            miCelda.setBackground(Color.GREEN);
        } else if (dep.esEstante() && !dep.esRefrigerado()) {
            miCelda.setBackground(Color.ORANGE);
        } else if (!dep.esEstante() && dep.esRefrigerado()) {
            miCelda.setBackground(Color.YELLOW);
        } else if (!dep.esEstante() && !dep.esRefrigerado()) {
            miCelda.setBackground(Color.CYAN);
        }
        return miCelda;
    }
}
