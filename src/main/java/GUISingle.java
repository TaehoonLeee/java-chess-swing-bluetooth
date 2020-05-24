import javax.swing.*;
import java.awt.*;

public class GUISingle extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public GUISingle() {
        initComponents();
        bluechess = new ImageIcon(getClass().getResource("images2/bluechess.png"));
        logo.setIcon(bluechess);
        logo.setText(null);
    }

    public Container createGUI(JFrame mainApp) {
        mainChessBoard = new WindowChessGameSingle();
        mainChessBoard.setSize(new Dimension(450, 450));

        ImageIcon[] imgRed = new ImageIcon[6];
        ImageIcon[] imgBlue = new ImageIcon[6];
        for (int i = 0; i < 6; i++) {
            System.err.println("Creating images    " + "images/" + strRedPieces[i]);
            imgRed[i] = new ImageIcon(getClass().getResource("images/" + strRedPieces[i]));
            imgBlue[i] = new ImageIcon(getClass().getResource("images/" + strBluePieces[i]));
        }
        System.err.println(imgRed[1]);
        mainChessBoard.setupImages(imgRed, imgBlue);
        mainChessBoard.setNames("Player1", "Player2");
        chessPanel.add(mainChessBoard);
        chessPanel.setVisible(true);
        chessPanel.setBorder(BorderFactory.createEtchedBorder());
        return chessPanel;
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        chessPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setBorder(BorderFactory.createEtchedBorder());
        setPreferredSize(new Dimension(550, 680));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startButton.setBackground(new java.awt.Color(102, 102, 102));
        startButton.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18));
        startButton.setText("Start");
        startButton.addActionListener(this::startButtonActionPerformed);
        add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 160, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18));
        jButton1.setForeground(new java.awt.Color(255, 51, 102));
        jButton1.setText("Quit");
        jButton1.addActionListener(this::jButton1ActionPerformed);
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 100, -1));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(BorderFactory.createTitledBorder(null, "Chess Board", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setPreferredSize(new Dimension(500, 500));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel3MouseReleased(evt);
            }
        });
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel3MouseMoved(evt);
            }
        });

        chessPanel.setBackground(new java.awt.Color(51, 51, 51));
        chessPanel.setPreferredSize(new Dimension(500, 500));
        chessPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                chessPanelMouseReleased(evt);
            }
        });
        chessPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                chessPanelMouseMoved(evt);
            }
        });
        chessPanel.addPropertyChangeListener(this::chessPanelPropertyChange);

        javax.swing.GroupLayout chessPanelLayout = new javax.swing.GroupLayout(chessPanel);
        chessPanel.setLayout(chessPanelLayout);
        chessPanelLayout.setHorizontalGroup(
                chessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 402, Short.MAX_VALUE)
        );
        chessPanelLayout.setVerticalGroup(
                chessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 443, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(chessPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(chessPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 440, 480));

        logo.setText("jLabel1");
        add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            final String[] strings = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        jScrollPane1.setViewportView(jList1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 140, 260));

        jLabel1.setText("Movements");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        jTextField1.setText("Player1");
        jTextField1.addActionListener(this::jTextField1ActionPerformed);
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 400, 80, -1));

        jTextField2.setText("Player2");
        jTextField2.addActionListener(this::jTextField2ActionPerformed);
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 430, 80, -1));

        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));

        jLabel3.setText("jLabel2");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, -1));

        jButton2.setText("Set Names");
        jButton2.addActionListener(this::jButton2ActionPerformed);
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        mainChessBoard.newGame();
        startButton.setText("Game Started");
        startButton.setEnabled(false);


    }//GEN-LAST:event_startButtonActionPerformed

    private void chessPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chessPanelMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_chessPanelMouseReleased

    private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseReleased

    private void chessPanelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_chessPanelPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_chessPanelPropertyChange

    private void chessPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chessPanelMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_chessPanelMouseMoved

    private void jPanel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseMoved
        // TODO add your handling code here:
        System.err.println("list updatedddddd");
        jList1.setListData(mainChessBoard.getMovementRecord());

    }//GEN-LAST:event_jPanel3MouseMoved

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        player1 = jTextField1.getText();
        player2 = jTextField2.getText();
        mainChessBoard.setNames(player1, player2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chessPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel logo;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
    protected final ImageIcon bluechess;
    private WindowChessGameSingle mainChessBoard;
    private final String[] strRedPieces = {"whitePawn.png", "whiteRock.png", "whiteKnight.png", "whiteBishop.png", "whiteQueen.png", "whiteKing.png"};
    private final String[] strBluePieces = {"blackPawn.png", "blackRock.png", "blackKnight.png", "blackBishop.png", "blackQueen.png", "blackKing.png"};
    private String player1;
    private String player2;
}