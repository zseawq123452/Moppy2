package com.moppy.control.gui;

import com.moppy.core.comms.bridge.MultiBridge;
import com.moppy.core.midi.MoppyMIDISequencer;
import com.moppy.core.status.StatusBus;

/**
 * 
 */
public class MainWindow extends javax.swing.JFrame {

    private final StatusBus statusBus;
    private final MoppyMIDISequencer midiSequencer;
    private final MultiBridge networkBridge;
    
    
    /**
     * Creates new form MainWindow
     */
    public MainWindow(StatusBus statusBus, MoppyMIDISequencer midiSequencer, MultiBridge networkBridge) {
        this.statusBus = statusBus;
        this.midiSequencer = midiSequencer;
        this.networkBridge = networkBridge;
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sequencerPanel = new com.moppy.control.gui.SequencerPanel();
        sequencerPanel.setMidiSequencer(midiSequencer);
        statusBus.registerConsumer(sequencerPanel);
        jScrollPane1 = new javax.swing.JScrollPane();
        networkSelectorPanel = new com.moppy.control.gui.NetworkSelectorPanel();
        networkSelectorPanel.initNetworkPanel(networkBridge);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Moppy Control");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        sequencerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportView(networkSelectorPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sequencerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(404, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(sequencerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addContainerGap(267, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private com.moppy.control.gui.NetworkSelectorPanel networkSelectorPanel;
    private com.moppy.control.gui.SequencerPanel sequencerPanel;
    // End of variables declaration//GEN-END:variables
}