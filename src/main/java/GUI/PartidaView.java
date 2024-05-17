/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import UTIL.ConjuntoMVC;
import UTIL.FichaMVC;
import java.util.ArrayList;
import java.util.List;

import CONTROLLERS.PantallaPartidaController;
import UTIL.SuscriptorPartida;
import interaces.ConjuntoDTO;
import interaces.FichaDTO;
import interaces.PartidaDTO;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author rosafresita
 */
public class PartidaView extends JFrame implements SuscriptorPartida {

    private static PartidaView instancia;

    public static PartidaView obtenerInstancia() {

        if (PartidaView.instancia == null) {
            PartidaView.instancia = new PartidaView();
        }

        return PartidaView.instancia;
    }

    /**
     * Creates new form FInicio
     */
    private PartidaView() {
        initComponents();

        this.setLocationRelativeTo(null);

        List<FichaMVC> fichas1 = createRandomFicha(100);
        List<FichaMVC> fichas2 = createRandomFicha(5);

        fichas1.forEach((ficha) -> {
            this.panelFichas.add(ficha);
        });

        //Agregar conjuntos al tablero
        this.tableroPanel.add(
                new ConjuntoMVC(fichas2)
        );

    }

    private List<FichaMVC> createRandomFicha(int max) {
//        List<FichaMVC> fichas = new ArrayList();
//        for (byte i = 0; i < max; i++) {
//            Ficha ficha = new FichaNumerica(i);
//            fichas.add(new FichaMVC(ficha));
//        }
//        return fichas;
        return new ArrayList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableroPanel = new javax.swing.JPanel();
        opcionesPanel = new javax.swing.JPanel();
        botonAgregar = new javax.swing.JButton();
        botonSeparar = new javax.swing.JButton();
        botonPozo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelFichas = new javax.swing.JPanel();
        campoTextoPeriodoInicio = new javax.swing.JTextField();
        campoTextoPeriodoFinal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        terminarTurno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 608));

        tableroPanel.setBackground(new java.awt.Color(255, 204, 153));

        javax.swing.GroupLayout tableroPanelLayout = new javax.swing.GroupLayout(tableroPanel);
        tableroPanel.setLayout(tableroPanelLayout);
        tableroPanelLayout.setHorizontalGroup(
            tableroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        tableroPanelLayout.setVerticalGroup(
            tableroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precionaBotonAgregarFicha(evt);
            }
        });

        botonSeparar.setText("Separar");
        botonSeparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precionaBotonSepararConjunto(evt);
            }
        });

        botonPozo.setText("Pozo");
        botonPozo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPozoActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(panelFichas);

        jLabel1.setText("Inicio");

        jLabel2.setText("Final");

        terminarTurno.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        terminarTurno.setText("Terminar Turno");
        terminarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarTurnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout opcionesPanelLayout = new javax.swing.GroupLayout(opcionesPanel);
        opcionesPanel.setLayout(opcionesPanelLayout);
        opcionesPanelLayout.setHorizontalGroup(
            opcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(opcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesPanelLayout.createSequentialGroup()
                        .addGroup(opcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campoTextoPeriodoFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(campoTextoPeriodoInicio))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)))
                .addGroup(opcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(terminarTurno, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonPozo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonSeparar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        opcionesPanelLayout.setVerticalGroup(
            opcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(opcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(opcionesPanelLayout.createSequentialGroup()
                        .addGroup(opcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(opcionesPanelLayout.createSequentialGroup()
                                .addGroup(opcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonAgregar)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTextoPeriodoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2))
                            .addGroup(opcionesPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(botonSeparar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonPozo)))
                        .addGap(6, 6, 6)
                        .addGroup(opcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(terminarTurno)
                            .addComponent(campoTextoPeriodoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opcionesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tableroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(opcionesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarMensajeError(String mensaje) {

        JOptionPane.showMessageDialog(
                this,
                mensaje,
                "ERROR!",
                JOptionPane.ERROR_MESSAGE
        );

    }

    private List<FichaDTO> verificarFichasSeleccionadas() throws Exception {
        List<FichaDTO> fichas = new ArrayList<>();
        for (Component c : this.panelFichas.getComponents()) {
            if (c.getClass() == FichaMVC.class) {
                FichaMVC ficha = (FichaMVC) c;
                if (!ficha.isSelected()) {
                    continue;
                }
                fichas.add(ficha.getFicha());
            }
        }
        if (fichas.isEmpty()) {
            throw new Exception("No selecciono fichas");
        }
        return fichas;
    }

    private int[] obtenerPerido() throws Exception {

        if (this.campoTextoPeriodoInicio.getText().equalsIgnoreCase("")
                || this.campoTextoPeriodoFinal.getText().equalsIgnoreCase("")) {
            throw new Exception("Debe de ingresar un periodo antes de dividir");
        }

        int periodo[] = {
            Integer.parseInt(this.campoTextoPeriodoInicio.getText()),
            Integer.parseInt(this.campoTextoPeriodoFinal.getText())
        };

        return periodo;
    }

    private ConjuntoDTO verificarConjuntoSeleccionado() {
        for (Component c : this.getComponents()) {
            if (c.getClass() == ConjuntoMVC.class) {
                ConjuntoMVC conjunto = (ConjuntoMVC) c;
                if (!conjunto.isSelected()) {
                    continue;
                }
                return conjunto.getConjunto();
            }
        }
        return null;
    }

    /**
     * Método que muestra una alerta para que el jugador elija si quiere
     * modificar el conjunto adelante o atras
     */
    private boolean muestraMensajeDelanteOAtras() throws Exception {
        String[] opciones = {"Adelante", "Atrás"};
        int seleccion = JOptionPane.showOptionDialog(
                this,
                "Selecciona una opción:",
                "Alerta con Opciones",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]);
        if (seleccion == 0) {
            return true;
        } else if (seleccion == 1) {
            return false;
        } else {
            throw new Exception("Necesitas seleccionar algún lado");
        }
    }

    private void precionaBotonAgregarFicha(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precionaBotonAgregarFicha

        try {
            List<FichaDTO> fichas = verificarFichasSeleccionadas();
            ConjuntoDTO conjunto = verificarConjuntoSeleccionado();

            if (conjunto == null) {

                PantallaPartidaController
                        .obtenerInstancia()
                        .agregarSinConjunto(fichas);
                return;
            }

            boolean delante = this.muestraMensajeDelanteOAtras();

            //Continua el agregar con conjunto seleccionado
            PantallaPartidaController
                    .obtenerInstancia()
                    .agregarConConjunto(fichas, conjunto, delante);
        } catch (Exception e) {
            this.mostrarMensajeError(e.getMessage());
        }

    }//GEN-LAST:event_precionaBotonAgregarFicha

    private void precionaBotonSepararConjunto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precionaBotonSepararConjunto

        try {

            int[] periodo = obtenerPerido();
            ConjuntoDTO conjunto = this.verificarConjuntoSeleccionado();

            PantallaPartidaController
                    .obtenerInstancia()
                    .realizarMovimientoDividir(conjunto, periodo);

        } catch (Exception e) {
            this.mostrarMensajeError(e.getMessage());
        }

    }//GEN-LAST:event_precionaBotonSepararConjunto

    private void botonPozoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPozoActionPerformed

    }//GEN-LAST:event_botonPozoActionPerformed

    private void terminarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarTurnoActionPerformed
        PantallaPartidaController.obtenerInstancia().terminarTurno();
    }//GEN-LAST:event_terminarTurnoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonPozo;
    private javax.swing.JButton botonSeparar;
    private javax.swing.JTextField campoTextoPeriodoFinal;
    private javax.swing.JTextField campoTextoPeriodoInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel opcionesPanel;
    private javax.swing.JPanel panelFichas;
    private javax.swing.JPanel tableroPanel;
    private javax.swing.JButton terminarTurno;
    // End of variables declaration//GEN-END:variables

    @Override
    public void notificar(PartidaDTO partida) {

    }
}
