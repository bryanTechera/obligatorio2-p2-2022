/*Bryan Techera #271868  Martín Lores #285463
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Dominio.Sistema;
import Dominio.Cliente;
import Dominio.Contrato;
import Dominio.Deposito;
import Dominio.Empleado;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class VisitaDepositos extends javax.swing.JFrame implements Observer {

    private HashMap<String, Empleado> empleados;
    private HashMap<String, Cliente> clientes;
    private HashMap<Integer, Deposito> depositos;

    private Sistema sistema;

    public VisitaDepositos(Sistema sistema) {

        this.sistema = sistema;
        this.empleados = sistema.getEmpleados();
        this.clientes = sistema.getClientes();
        this.depositos = sistema.getDepositos();

        initComponents();
        update(null, "empleado");
        update(null, "cliente");
        update(null, "contratos");

    }

    @Override
    public void update(Observable o, Object arg) {

        String opcion = (String) arg;
        if (opcion.equals("empleado")) {
            DefaultListModel modelEmp = sistema.getModeloEmpleado();
            this.listEmpleados.setModel(modelEmp);
        } else if (opcion.equals("cliente")) {
            DefaultListModel modelCliente = sistema.getModeloCliente();
            this.listClientes.setModel(modelCliente);
        } else if (opcion.equals("contratos")) {
            DefaultListModel modelContrato = sistema.getModeloContrato();
            this.listContratos.setModel(modelContrato);
        }
    }

    private void cargarContratos(Cliente cliente) {
        Collection<Contrato> coleccionDeContratos = this.sistema.getContratos().values();
        Iterator it = coleccionDeContratos.iterator();
        DefaultListModel modeloDeListaContrato = new DefaultListModel();

        while (it.hasNext()) {

            Contrato miContrato = (Contrato) it.next();

            if (miContrato.getCliente().getCedula().equals(cliente.getCedula())) {
                modeloDeListaContrato.addElement(miContrato);
            }

        }

        listContratos.setModel(modeloDeListaContrato);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDatos = new javax.swing.JPanel();
        Empleados = new javax.swing.JScrollPane();
        listEmpleados = new javax.swing.JList();
        lblMes = new javax.swing.JLabel();
        lblEmpleados = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        comboDia = new javax.swing.JComboBox();
        comboMes = new javax.swing.JComboBox<>();
        list = new javax.swing.JScrollPane();
        listContratos = new javax.swing.JList();
        lblContratos = new javax.swing.JLabel();
        lis = new javax.swing.JScrollPane();
        listClientes = new javax.swing.JList();
        lblClientes = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visita depositos");
        setResizable(false);
        getContentPane().setLayout(null);

        pnlDatos.setLayout(null);

        listEmpleados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listEmpleados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Empleados.setViewportView(listEmpleados);

        pnlDatos.add(Empleados);
        Empleados.setBounds(230, 70, 210, 120);

        lblMes.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblMes.setText("Mes");
        pnlDatos.add(lblMes);
        lblMes.setBounds(570, 90, 29, 22);

        lblEmpleados.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblEmpleados.setText("Empleados");
        pnlDatos.add(lblEmpleados);
        lblEmpleados.setBounds(300, 30, 90, 22);

        lblDia.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblDia.setText("Día");
        pnlDatos.add(lblDia);
        lblDia.setBounds(480, 90, 50, 22);

        comboDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        comboDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDiaActionPerformed(evt);
            }
        });
        pnlDatos.add(comboDia);
        comboDia.setBounds(460, 130, 72, 22);

        comboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        pnlDatos.add(comboMes);
        comboMes.setBounds(550, 130, 72, 22);

        listContratos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listContratos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        list.setViewportView(listContratos);

        pnlDatos.add(list);
        list.setBounds(10, 250, 630, 90);

        lblContratos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblContratos.setText("Contratos");
        pnlDatos.add(lblContratos);
        lblContratos.setBounds(290, 220, 80, 22);

        listClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listClientes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                listClientesFocusGained(evt);
            }
        });
        listClientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listClientesValueChanged(evt);
            }
        });
        lis.setViewportView(listClientes);

        pnlDatos.add(lis);
        lis.setBounds(10, 70, 210, 120);

        lblClientes.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblClientes.setText("Clientes");
        pnlDatos.add(lblClientes);
        lblClientes.setBounds(80, 30, 60, 22);

        getContentPane().add(pnlDatos);
        pnlDatos.setBounds(0, 10, 648, 360);

        pnlBotones.setLayout(null);

        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(150, 50));
        btnCancelar.setMinimumSize(new java.awt.Dimension(150, 50));
        btnCancelar.setPreferredSize(new java.awt.Dimension(150, 50));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlBotones.add(btnCancelar);
        btnCancelar.setBounds(13, 25, 140, 30);

        btnRegistrar.setText("Registrar");
        btnRegistrar.setPreferredSize(new java.awt.Dimension(150, 50));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        pnlBotones.add(btnRegistrar);
        btnRegistrar.setBounds(188, 25, 140, 30);

        getContentPane().add(pnlBotones);
        pnlBotones.setBounds(140, 370, 350, 60);

        setSize(new java.awt.Dimension(676, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDiaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Empleado empleado = (Empleado) this.listEmpleados.getSelectedValue();
        Cliente cliente = (Cliente) this.listClientes.getSelectedValue();
        Contrato contrato = (Contrato) this.listContratos.getSelectedValue();
        int dia = comboDia.getSelectedIndex();
        int mes = comboMes.getSelectedIndex();
        try {
            this.sistema.registrarVisita(cliente, empleado, contrato, dia, mes);
            JOptionPane.showMessageDialog(this, "Visita registrada", "Registro de visita", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            this.comboDia.setSelectedIndex(0);
            this.comboMes.setSelectedIndex(0);
            this.listClientes.setSelectedIndex(0);
            this.listEmpleados.setSelectedIndex(0);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void listClientesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listClientesFocusGained

    }//GEN-LAST:event_listClientesFocusGained

    private void listClientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listClientesValueChanged
        Cliente clientSelec = (Cliente) listClientes.getSelectedValue();
        if (clientSelec != null) {
            cargarContratos((Cliente) listClientes.getSelectedValue());
        }
    }//GEN-LAST:event_listClientesValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Empleados;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox comboDia;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblContratos;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblEmpleados;
    private javax.swing.JLabel lblMes;
    private javax.swing.JScrollPane lis;
    private javax.swing.JScrollPane list;
    private javax.swing.JList listClientes;
    private javax.swing.JList listContratos;
    private javax.swing.JList listEmpleados;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlDatos;
    // End of variables declaration//GEN-END:variables

}
