/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Paweł
 */
public class Visualisation extends javax.swing.JFrame {

    /**
     * Creates new form Visualisation
     */
    public Visualisation() {
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

        buttonGroupCellState = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        jToggleButtonGoLWW = new javax.swing.JToggleButton();
        jLabelNumberGeneration = new javax.swing.JLabel();
        jLabelFileName = new javax.swing.JLabel();
        jLabelGridSize = new javax.swing.JLabel();
        jLabelInterval = new javax.swing.JLabel();
        jTextFieldNumberGeneratiom = new javax.swing.JTextField();
        jButtonFilePath = new javax.swing.JButton();
        jTextFieldFileName = new javax.swing.JTextField();
        jButtonLoad = new javax.swing.JButton();
        jComboBoxSetDimension = new javax.swing.JComboBox<>();
        jComboBoxSetInterval = new javax.swing.JComboBox<>();
        jButtonSave = new javax.swing.JButton();
        jButtonClearGrid = new javax.swing.JButton();
        jButtonCopyGrid = new javax.swing.JButton();
        jButtonPasteGrid = new javax.swing.JButton();
        jButtonRun = new javax.swing.JButton();
        jButtonPause = new javax.swing.JButton();
        jButtonOneStep = new javax.swing.JButton();
        jSeparatorMenu = new javax.swing.JSeparator();
        jRadioButtonWire = new javax.swing.JRadioButton();
        jRadioButtonElectronHead = new javax.swing.JRadioButton();
        jRadioButtonElectronTail = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CA Simulator");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(0, 0, 0));
        mainPanel.setPreferredSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jToggleButtonGoLWW.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButtonGoLWW.setText("WIRE WORLD");
        jToggleButtonGoLWW.setToolTipText("");
        jToggleButtonGoLWW.setActionCommand("");
        jToggleButtonGoLWW.setDoubleBuffered(true);
        jToggleButtonGoLWW.setPreferredSize(new java.awt.Dimension(150, 25));

        jLabelNumberGeneration.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelNumberGeneration.setText("Number of generations");
        jLabelNumberGeneration.setPreferredSize(new java.awt.Dimension(155, 20));

        jLabelFileName.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelFileName.setText("File name");
        jLabelFileName.setPreferredSize(new java.awt.Dimension(64, 20));

        jLabelGridSize.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelGridSize.setText("Grid size");
        jLabelGridSize.setPreferredSize(new java.awt.Dimension(58, 20));

        jLabelInterval.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelInterval.setText("Interval");
        jLabelInterval.setPreferredSize(new java.awt.Dimension(53, 20));

        jTextFieldNumberGeneratiom.setText("0");

        jButtonFilePath.setBackground(new java.awt.Color(255, 255, 255));
        jButtonFilePath.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonFilePath.setText("...");
        jButtonFilePath.setPreferredSize(new java.awt.Dimension(45, 20));

        jTextFieldFileName.setToolTipText("LOAD");

        jButtonLoad.setBackground(new java.awt.Color(255, 255, 255));
        jButtonLoad.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jButtonLoad.setText("LOAD");
        jButtonLoad.setToolTipText("");
        jButtonLoad.setMinimumSize(new java.awt.Dimension(65, 25));
        jButtonLoad.setPreferredSize(new java.awt.Dimension(73, 20));

        jComboBoxSetDimension.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15 x 10", "30 x 20", "60 x 40", "120 x 80" }));

        jComboBoxSetInterval.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1/8 s", "1/4 s", "1/2 s", "1 s", "2 s" }));

        jButtonSave.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jButtonSave.setText("SAVE");
        jButtonSave.setPreferredSize(new java.awt.Dimension(110, 50));

        jButtonClearGrid.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jButtonClearGrid.setText("CLEAR GRID");
        jButtonClearGrid.setPreferredSize(new java.awt.Dimension(110, 50));

        jButtonCopyGrid.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jButtonCopyGrid.setText("COPY GRID");
        jButtonCopyGrid.setPreferredSize(new java.awt.Dimension(110, 50));

        jButtonPasteGrid.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jButtonPasteGrid.setText("PASTE GRID");
        jButtonPasteGrid.setPreferredSize(new java.awt.Dimension(110, 50));

        jButtonRun.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/play.png"))); // NOI18N
        jButtonRun.setPreferredSize(new java.awt.Dimension(60, 35));

        jButtonPause.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/pause.png"))); // NOI18N
        jButtonPause.setToolTipText("");
        jButtonPause.setPreferredSize(new java.awt.Dimension(60, 35));

        jButtonOneStep.setBackground(new java.awt.Color(255, 255, 255));
        jButtonOneStep.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOneStep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/skip.png"))); // NOI18N
        jButtonOneStep.setPreferredSize(new java.awt.Dimension(60, 35));

        buttonGroupCellState.add(jRadioButtonWire);
        jRadioButtonWire.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRadioButtonWire.setText("Wire");

        buttonGroupCellState.add(jRadioButtonElectronHead);
        jRadioButtonElectronHead.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRadioButtonElectronHead.setText("Electron Head");

        buttonGroupCellState.add(jRadioButtonElectronTail);
        jRadioButtonElectronTail.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRadioButtonElectronTail.setText("Electron Tail");
        jRadioButtonElectronTail.setPreferredSize(new java.awt.Dimension(107, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jButtonLoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparatorMenu, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonWire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonElectronHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonElectronTail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))))
            .addGroup(layout.createSequentialGroup()
                .addGap(620, 620, 620)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNumberGeneration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumberGeneratiom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonClearGrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonCopyGrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelGridSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBoxSetDimension, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxSetInterval, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jButtonPause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(jButtonOneStep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(72, 72, 72)
                                    .addComponent(jButtonPasteGrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButtonGoLWW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jToggleButtonGoLWW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNumberGeneration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNumberGeneratiom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelGridSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSetDimension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSetInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonClearGrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCopyGrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPasteGrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonOneStep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jSeparatorMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                .addComponent(jRadioButtonWire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonElectronHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jRadioButtonElectronTail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 59, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonFilePath, jButtonLoad, jTextFieldFileName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBoxSetDimension, jLabelGridSize});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBoxSetInterval, jLabelInterval});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonClearGrid, jButtonSave});

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Visualisation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visualisation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visualisation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visualisation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visualisation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupCellState;
    private javax.swing.JButton jButtonClearGrid;
    private javax.swing.JButton jButtonCopyGrid;
    private javax.swing.JButton jButtonFilePath;
    private javax.swing.JButton jButtonLoad;
    private javax.swing.JButton jButtonOneStep;
    private javax.swing.JButton jButtonPasteGrid;
    private javax.swing.JButton jButtonPause;
    private javax.swing.JButton jButtonRun;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxSetDimension;
    private javax.swing.JComboBox<String> jComboBoxSetInterval;
    private javax.swing.JLabel jLabelFileName;
    private javax.swing.JLabel jLabelGridSize;
    private javax.swing.JLabel jLabelInterval;
    private javax.swing.JLabel jLabelNumberGeneration;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonElectronHead;
    private javax.swing.JRadioButton jRadioButtonElectronTail;
    private javax.swing.JRadioButton jRadioButtonWire;
    private javax.swing.JSeparator jSeparatorMenu;
    private javax.swing.JTextField jTextFieldFileName;
    private javax.swing.JTextField jTextFieldNumberGeneratiom;
    private javax.swing.JToggleButton jToggleButtonGoLWW;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}