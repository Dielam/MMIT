/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Controlador.Controlador;
import Controlador.Eventos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author crash
 */
public class MenuPrincipal extends javax.swing.JFrame implements IGUI{

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        botonInsertar = new javax.swing.JButton();
        botonMostrar = new javax.swing.JButton();
        botonHola = new javax.swing.JButton();
        panelEquipos = new Presentacion.PanelEquipos();
        jPanel1 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prototipo MMIT - Menu Principal");
        setBackground(new java.awt.Color(0, 204, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1000, 750));
        setMinimumSize(new java.awt.Dimension(1000, 750));
        setPreferredSize(new java.awt.Dimension(1000, 750));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        botonInsertar.setText("Insertar");
        botonInsertar.setMaximumSize(new java.awt.Dimension(150, 150));
        botonInsertar.setMinimumSize(new java.awt.Dimension(150, 150));
        botonInsertar.setPreferredSize(new java.awt.Dimension(150, 150));
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
        getContentPane().add(botonInsertar, gridBagConstraints);

        botonMostrar.setText("Mostrar");
        botonMostrar.setMaximumSize(new java.awt.Dimension(150, 150));
        botonMostrar.setMinimumSize(new java.awt.Dimension(150, 150));
        botonMostrar.setPreferredSize(new java.awt.Dimension(150, 150));
        botonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(botonMostrar, gridBagConstraints);

        botonHola.setText("Hola Mundo");
        botonHola.setMaximumSize(new java.awt.Dimension(150, 150));
        botonHola.setMinimumSize(new java.awt.Dimension(150, 150));
        botonHola.setPreferredSize(new java.awt.Dimension(150, 150));
        botonHola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHolaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        getContentPane().add(botonHola, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 339;
        gridBagConstraints.ipady = 132;
        gridBagConstraints.insets = new java.awt.Insets(15, 76, 20, 65);
        getContentPane().add(panelEquipos, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        labelNombre.setText("Inserte Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(labelNombre, gridBagConstraints);

        textNombre.setMaximumSize(new java.awt.Dimension(300, 22));
        textNombre.setMinimumSize(new java.awt.Dimension(300, 22));
        textNombre.setName(""); // NOI18N
        textNombre.setPreferredSize(new java.awt.Dimension(300, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 24, 0, 3);
        jPanel1.add(textNombre, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jPanel2, gridBagConstraints);

        jScrollPane1.setBorder(null);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(300, 150));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(300, 150));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(300, 150));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        textArea.setMaximumSize(new java.awt.Dimension(250, 250));
        textArea.setMinimumSize(new java.awt.Dimension(250, 250));
        textArea.setPreferredSize(new java.awt.Dimension(250, 250));
        jScrollPane2.setViewportView(textArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 241;
        gridBagConstraints.ipady = 195;
        getContentPane().add(jScrollPane2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
       String text = this.textNombre.getText();
       if (!text.equals("")) {
           Controlador.getInstancia().accion(Eventos.ACCION_INSERTAR_FORMULARIO,this.textNombre.getText());
       } else {
           Controlador.getInstancia().accion(Eventos.ERROR_ARGUMENTOS,this.textNombre.getText());
       }
               
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarActionPerformed
        Controlador.getInstancia().accion(Eventos.ACCION_CARGAR_BBDD,null );
    }//GEN-LAST:event_botonMostrarActionPerformed

    private void botonHolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHolaActionPerformed
        Controlador.getInstancia().accion(Eventos.MOSTRAR_HOLA_MUNDO, null);
    }//GEN-LAST:event_botonHolaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonHola;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonMostrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelNombre;
    private Presentacion.PanelEquipos panelEquipos;
    private javax.swing.JTextPane textArea;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
@Override
    public void actualizar(Eventos evento, Object datos) {
       switch (evento) {
            case setFinalistaDe:
                this.panelEquipos.setTextEquipoDerechaFinal((String)datos);
                break;
            case setFinalistaIz:
                this.panelEquipos.setTextEquipoIzquierdaFinal((String)datos);
                break;
            case MOSTRAR_MENU:
                setVisible(true);
                break;
            case MOSTRAR_HOLA_MUNDO:
                JOptionPane.showMessageDialog(null, "Hola mundo!");
                break;
            case OCULTAR_MENU:
                setVisible(false);
                break;
            case RES_CREAR_FORMULARIO_OK:
                textArea.setText("Insercion correcta\n");
                JOptionPane.showMessageDialog(null, "Insercion realizada correctamente");
                break;
            case RES_CREAR_FORMULARIO_ERROR:
                textArea.setText("Insercion fallida\n");
                JOptionPane.showMessageDialog(null,"No se pudo realizar la insercion");
                break;
            case RES_CARGAR_BBDD_OK:
                ArrayList<String> dato = (ArrayList<String>) datos;
                for(int i = 0; i < dato.size(); i++){
                    jTable1.getModel().setValueAt(dato.get(i), i, 0);
                }
                break;
            case MOSTRAR_CARGAR_BBDD:
                    setVisible(true);
                    break;
            case OCULTAR_CARGAR_BBDD:
                setVisible(false);
                break;
            case RES_CARGAR_BBDD_ERROR:
                textArea.setText("Error en la carga de la BBDD\n");
                break;
            case MOSTRAR_CREAR_FORMULARIO:
                    setVisible(true);
                    break;
            case OCULTAR_CREAR_FORMULARIO:
                setVisible(false);
                break;
            default:
                break;
        }
    }
    
}