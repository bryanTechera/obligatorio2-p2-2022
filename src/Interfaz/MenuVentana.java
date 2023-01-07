/*Bryan Techera #271868  Martín Lores #285463
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package Interfaz;

import Controlador.PersistenciaSistema;
import Dominio.Sistema;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MenuVentana extends javax.swing.JFrame {

    /**
     * Creates new form MenuVentana
     */
    private Sistema sistema;

    public MenuVentana(Sistema unSistema) {
        initComponents();

        this.sistema = unSistema;

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

        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        registrosMenu = new javax.swing.JMenu();
        itmRegistroDeposito = new javax.swing.JMenuItem();
        itmRegistroEmpleado = new javax.swing.JMenuItem();
        itmRegistroCliente = new javax.swing.JMenuItem();
        itmRegistroContrato = new javax.swing.JMenuItem();
        visitasMenu = new javax.swing.JMenu();
        itmVisitasDepositos = new javax.swing.JMenuItem();
        consultasMenu = new javax.swing.JMenu();
        itmConsultaBaja = new javax.swing.JMenuItem();
        itmConsultaDeposito = new javax.swing.JMenuItem();
        estadisticasMenu = new javax.swing.JMenu();
        itmReporte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu principal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SelfStorage.png"))); // NOI18N

        registrosMenu.setMnemonic('f');
        registrosMenu.setText("Registros");

        itmRegistroDeposito.setMnemonic('o');
        itmRegistroDeposito.setText("Registro de deposito");
        itmRegistroDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistroDepositoActionPerformed(evt);
            }
        });
        registrosMenu.add(itmRegistroDeposito);

        itmRegistroEmpleado.setMnemonic('s');
        itmRegistroEmpleado.setText("Registro de empleado ");
        itmRegistroEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistroEmpleadoActionPerformed(evt);
            }
        });
        registrosMenu.add(itmRegistroEmpleado);

        itmRegistroCliente.setMnemonic('a');
        itmRegistroCliente.setText("Registro de cliente");
        itmRegistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistroClienteActionPerformed(evt);
            }
        });
        registrosMenu.add(itmRegistroCliente);

        itmRegistroContrato.setMnemonic('x');
        itmRegistroContrato.setText("Registro de contrato");
        itmRegistroContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistroContratoActionPerformed(evt);
            }
        });
        registrosMenu.add(itmRegistroContrato);

        menuBar.add(registrosMenu);

        visitasMenu.setMnemonic('e');
        visitasMenu.setText("Visitas");

        itmVisitasDepositos.setMnemonic('t');
        itmVisitasDepositos.setText("Visitas de depositos");
        itmVisitasDepositos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVisitasDepositosActionPerformed(evt);
            }
        });
        visitasMenu.add(itmVisitasDepositos);

        menuBar.add(visitasMenu);

        consultasMenu.setMnemonic('h');
        consultasMenu.setText("Consultas");

        itmConsultaBaja.setMnemonic('c');
        itmConsultaBaja.setText("Consulta/baja de contrato");
        itmConsultaBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultaBajaActionPerformed(evt);
            }
        });
        consultasMenu.add(itmConsultaBaja);

        itmConsultaDeposito.setMnemonic('a');
        itmConsultaDeposito.setText("Consulta de deposito");
        itmConsultaDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultaDepositoActionPerformed(evt);
            }
        });
        consultasMenu.add(itmConsultaDeposito);

        menuBar.add(consultasMenu);

        estadisticasMenu.setMnemonic('e');
        estadisticasMenu.setText("Estadisticas");

        itmReporte.setMnemonic('t');
        itmReporte.setText("Generar reporte de ocupación");
        itmReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReporteActionPerformed(evt);
            }
        });
        estadisticasMenu.add(itmReporte);

        menuBar.add(estadisticasMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmRegistroContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistroContratoActionPerformed
        RegistroContrato ventanaContrato = new RegistroContrato(this.sistema);
        sistema.addObserver(ventanaContrato);
        ventanaContrato.setVisible(true);
    }//GEN-LAST:event_itmRegistroContratoActionPerformed

    private void itmRegistroDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistroDepositoActionPerformed

        RegistroDeposito regDeposito = new RegistroDeposito(this.sistema);
        regDeposito.setVisible(true);

    }//GEN-LAST:event_itmRegistroDepositoActionPerformed

    private void itmRegistroEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistroEmpleadoActionPerformed
        RegistroEmpleado regEmpleado = new RegistroEmpleado(this.sistema);
        regEmpleado.setVisible(true);
    }//GEN-LAST:event_itmRegistroEmpleadoActionPerformed

    private void itmRegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistroClienteActionPerformed
        RegistroCliente regCliente = new RegistroCliente(this.sistema);
        regCliente.setVisible(true);
    }//GEN-LAST:event_itmRegistroClienteActionPerformed

    private void itmVisitasDepositosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVisitasDepositosActionPerformed
        VisitaDepositos ventanaVistaDeposito = new VisitaDepositos(this.sistema);
        sistema.addObserver(ventanaVistaDeposito);
        ventanaVistaDeposito.setVisible(true);
    }//GEN-LAST:event_itmVisitasDepositosActionPerformed

    private void itmConsultaBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultaBajaActionPerformed
        Consulta_bajaContrato ventanaBajaContratos = new Consulta_bajaContrato(this.sistema);
        sistema.addObserver(ventanaBajaContratos);
        ventanaBajaContratos.setVisible(true);
    }//GEN-LAST:event_itmConsultaBajaActionPerformed

    private void itmReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReporteActionPerformed
        GraficoDepositos ventanaGrafico = new GraficoDepositos(this.sistema);
        sistema.addObserver(ventanaGrafico);
        ventanaGrafico.setVisible(true);
    }//GEN-LAST:event_itmReporteActionPerformed

    private void itmConsultaDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultaDepositoActionPerformed
        ConsultaDeposito consultaDeposito = new ConsultaDeposito(this.sistema);
        sistema.addObserver(consultaDeposito);
        consultaDeposito.setVisible(true);
    }//GEN-LAST:event_itmConsultaDepositoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       
        try {
            
            
            PersistenciaSistema.persistirSistema(this.sistema, "Sistema.ser");
        } catch (IOException ex) {
            System.out.println("Error al serializar sistema" + ex);
        }
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu consultasMenu;
    private javax.swing.JMenu estadisticasMenu;
    private javax.swing.JMenuItem itmConsultaBaja;
    private javax.swing.JMenuItem itmConsultaDeposito;
    private javax.swing.JMenuItem itmRegistroCliente;
    private javax.swing.JMenuItem itmRegistroContrato;
    private javax.swing.JMenuItem itmRegistroDeposito;
    private javax.swing.JMenuItem itmRegistroEmpleado;
    private javax.swing.JMenuItem itmReporte;
    private javax.swing.JMenuItem itmVisitasDepositos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu registrosMenu;
    private javax.swing.JMenu visitasMenu;
    // End of variables declaration//GEN-END:variables

  

}
