/**
 * @author Carlos Soto
 */

package Calculadora;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        BtnAR = new javax.swing.JButton();
        BtnClear = new javax.swing.JButton();
        BtnChangePad = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnNum1 = new javax.swing.JButton();
        BtnNum4 = new javax.swing.JButton();
        BtnNum7 = new javax.swing.JButton();
        BtnNum5 = new javax.swing.JButton();
        BtnNum2 = new javax.swing.JButton();
        BtnNum8 = new javax.swing.JButton();
        BtnNum0 = new javax.swing.JButton();
        BtnEnter = new javax.swing.JButton();
        BtnNum6 = new javax.swing.JButton();
        BtnNum3 = new javax.swing.JButton();
        BtnNum9 = new javax.swing.JButton();
        BtnDiv = new javax.swing.JButton();
        BtnMul = new javax.swing.JButton();
        BtnRes = new javax.swing.JButton();
        BtnSum = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Display1 = new javax.swing.JLabel();
        Display2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(29, 29, 29));
        setForeground(java.awt.Color.white);
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(630, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(630, 450));
        setType(java.awt.Window.Type.UTILITY);

        Fondo.setBackground(new java.awt.Color(29, 29, 29));
        Fondo.setPreferredSize(new java.awt.Dimension(630, 450));

        BtnAR.setBackground(new java.awt.Color(46, 46, 46));
        BtnAR.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BtnAR.setForeground(new java.awt.Color(155, 155, 155));
        BtnAR.setText("A > R");
        BtnAR.setBorder(null);
        BtnAR.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnAR.setRequestFocusEnabled(false);
        BtnAR.setRolloverEnabled(false);
        BtnAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnARActionPerformed(evt);
            }
        });

        BtnClear.setBackground(new java.awt.Color(46, 46, 46));
        BtnClear.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BtnClear.setForeground(new java.awt.Color(155, 155, 155));
        BtnClear.setText("Clear");
        BtnClear.setBorder(null);
        BtnClear.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnClear.setRequestFocusEnabled(false);
        BtnClear.setRolloverEnabled(false);
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        BtnChangePad.setBackground(new java.awt.Color(46, 46, 46));
        BtnChangePad.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        BtnChangePad.setForeground(new java.awt.Color(155, 155, 155));
        BtnChangePad.setText("Roman");
        BtnChangePad.setBorder(null);
        BtnChangePad.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnChangePad.setRequestFocusEnabled(false);
        BtnChangePad.setRolloverEnabled(false);
        BtnChangePad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnChangePadActionPerformed(evt);
            }
        });

        BtnDelete.setBackground(new java.awt.Color(46, 46, 46));
        BtnDelete.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BtnDelete.setForeground(new java.awt.Color(155, 155, 155));
        BtnDelete.setText("Del");
        BtnDelete.setBorder(null);
        BtnDelete.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnDelete.setRequestFocusEnabled(false);
        BtnDelete.setRolloverEnabled(false);
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        BtnNum1.setBackground(new java.awt.Color(46, 46, 46));
        BtnNum1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        BtnNum1.setForeground(new java.awt.Color(255, 255, 255));
        BtnNum1.setText("1");
        BtnNum1.setBorder(null);
        BtnNum1.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnNum1.setRequestFocusEnabled(false);
        BtnNum1.setRolloverEnabled(false);
        BtnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum1ActionPerformed(evt);
            }
        });

        BtnNum4.setBackground(new java.awt.Color(46, 46, 46));
        BtnNum4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        BtnNum4.setForeground(new java.awt.Color(255, 255, 255));
        BtnNum4.setText("4");
        BtnNum4.setBorder(null);
        BtnNum4.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnNum4.setRequestFocusEnabled(false);
        BtnNum4.setRolloverEnabled(false);
        BtnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum4ActionPerformed(evt);
            }
        });

        BtnNum7.setBackground(new java.awt.Color(46, 46, 46));
        BtnNum7.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        BtnNum7.setForeground(new java.awt.Color(255, 255, 255));
        BtnNum7.setText("7");
        BtnNum7.setBorder(null);
        BtnNum7.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnNum7.setRequestFocusEnabled(false);
        BtnNum7.setRolloverEnabled(false);
        BtnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum7ActionPerformed(evt);
            }
        });

        BtnNum5.setBackground(new java.awt.Color(46, 46, 46));
        BtnNum5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        BtnNum5.setForeground(new java.awt.Color(255, 255, 255));
        BtnNum5.setText("5");
        BtnNum5.setBorder(null);
        BtnNum5.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnNum5.setRequestFocusEnabled(false);
        BtnNum5.setRolloverEnabled(false);
        BtnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum5ActionPerformed(evt);
            }
        });

        BtnNum2.setBackground(new java.awt.Color(46, 46, 46));
        BtnNum2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        BtnNum2.setForeground(new java.awt.Color(255, 255, 255));
        BtnNum2.setText("2");
        BtnNum2.setBorder(null);
        BtnNum2.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnNum2.setRequestFocusEnabled(false);
        BtnNum2.setRolloverEnabled(false);
        BtnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum2ActionPerformed(evt);
            }
        });

        BtnNum8.setBackground(new java.awt.Color(46, 46, 46));
        BtnNum8.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        BtnNum8.setForeground(new java.awt.Color(255, 255, 255));
        BtnNum8.setText("8");
        BtnNum8.setBorder(null);
        BtnNum8.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnNum8.setRequestFocusEnabled(false);
        BtnNum8.setRolloverEnabled(false);
        BtnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum8ActionPerformed(evt);
            }
        });

        BtnNum0.setBackground(new java.awt.Color(46, 46, 46));
        BtnNum0.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        BtnNum0.setForeground(new java.awt.Color(255, 255, 255));
        BtnNum0.setText("0");
        BtnNum0.setBorder(null);
        BtnNum0.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnNum0.setRequestFocusEnabled(false);
        BtnNum0.setRolloverEnabled(false);
        BtnNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum0ActionPerformed(evt);
            }
        });

        BtnEnter.setBackground(new java.awt.Color(69, 133, 0));
        BtnEnter.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BtnEnter.setForeground(new java.awt.Color(255, 255, 255));
        BtnEnter.setText("=");
        BtnEnter.setBorder(null);
        BtnEnter.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnEnter.setRequestFocusEnabled(false);
        BtnEnter.setRolloverEnabled(false);
        BtnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnterActionPerformed(evt);
            }
        });

        BtnNum6.setBackground(new java.awt.Color(46, 46, 46));
        BtnNum6.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        BtnNum6.setForeground(new java.awt.Color(255, 255, 255));
        BtnNum6.setText("6");
        BtnNum6.setBorder(null);
        BtnNum6.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnNum6.setRequestFocusEnabled(false);
        BtnNum6.setRolloverEnabled(false);
        BtnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum6ActionPerformed(evt);
            }
        });

        BtnNum3.setBackground(new java.awt.Color(46, 46, 46));
        BtnNum3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        BtnNum3.setForeground(new java.awt.Color(255, 255, 255));
        BtnNum3.setText("3");
        BtnNum3.setBorder(null);
        BtnNum3.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnNum3.setRequestFocusEnabled(false);
        BtnNum3.setRolloverEnabled(false);
        BtnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum3ActionPerformed(evt);
            }
        });

        BtnNum9.setBackground(new java.awt.Color(46, 46, 46));
        BtnNum9.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        BtnNum9.setForeground(new java.awt.Color(255, 255, 255));
        BtnNum9.setText("9");
        BtnNum9.setBorder(null);
        BtnNum9.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnNum9.setRequestFocusEnabled(false);
        BtnNum9.setRolloverEnabled(false);
        BtnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum9ActionPerformed(evt);
            }
        });

        BtnDiv.setBackground(new java.awt.Color(46, 46, 46));
        BtnDiv.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BtnDiv.setForeground(new java.awt.Color(155, 155, 155));
        BtnDiv.setText("/");
        BtnDiv.setBorder(null);
        BtnDiv.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnDiv.setRequestFocusEnabled(false);
        BtnDiv.setRolloverEnabled(false);
        BtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDivActionPerformed(evt);
            }
        });

        BtnMul.setBackground(new java.awt.Color(46, 46, 46));
        BtnMul.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BtnMul.setForeground(new java.awt.Color(155, 155, 155));
        BtnMul.setText("X");
        BtnMul.setBorder(null);
        BtnMul.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnMul.setRequestFocusEnabled(false);
        BtnMul.setRolloverEnabled(false);
        BtnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMulActionPerformed(evt);
            }
        });

        BtnRes.setBackground(new java.awt.Color(46, 46, 46));
        BtnRes.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BtnRes.setForeground(new java.awt.Color(155, 155, 155));
        BtnRes.setText("-");
        BtnRes.setBorder(null);
        BtnRes.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnRes.setRequestFocusEnabled(false);
        BtnRes.setRolloverEnabled(false);
        BtnRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResActionPerformed(evt);
            }
        });

        BtnSum.setBackground(new java.awt.Color(46, 46, 46));
        BtnSum.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BtnSum.setForeground(new java.awt.Color(155, 155, 155));
        BtnSum.setText("+");
        BtnSum.setBorder(null);
        BtnSum.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnSum.setRequestFocusEnabled(false);
        BtnSum.setRolloverEnabled(false);
        BtnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSumActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(46, 46, 46));

        Display1.setBackground(new java.awt.Color(46, 46, 46));
        Display1.setFont(new java.awt.Font("Arial", 0, 90)); // NOI18N
        Display1.setForeground(new java.awt.Color(255, 255, 255));
        Display1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Display1.setText("0");

        Display2.setBackground(new java.awt.Color(46, 46, 46));
        Display2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Display2.setForeground(new java.awt.Color(155, 155, 155));
        Display2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Display1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Display2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Display2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Display1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BtnChangePad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(BtnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnMul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(BtnAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)
                                .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addComponent(BtnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addComponent(BtnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(FondoLayout.createSequentialGroup()
                                                .addComponent(BtnChangePad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(5, 5, 5))
                                            .addGroup(FondoLayout.createSequentialGroup()
                                                .addComponent(BtnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BtnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(FondoLayout.createSequentialGroup()
                            .addComponent(BtnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BtnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BtnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BtnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(BtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnMul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Calculator");
        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento Pulsar Numero 0
    private void BtnNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum0ActionPerformed
        Pulsar("0","-");       
    }//GEN-LAST:event_BtnNum0ActionPerformed

    //Evento Pulsar Conversion Arabica a Romana
    private void BtnARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnARActionPerformed
     if(modo==false){
         this.Display2.setText(Op.ConvertArabicinRoman( Integer.parseInt(this.Display1.getText()))); //Convertir de Arabico a Romano
     }
     else
     {
         this.Display2.setText(Integer.toString(Op.ConvertRomaninArabic(this.Display1.getText()))); //Convertir de Romano a Arabico
     }
    }//GEN-LAST:event_BtnARActionPerformed

    //Evento Pulsar Borrar todo
    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        ValAArabicString= new String();
        ValARomanString= new String();
    
        ValBArabicString= new String();
        ValBRomanString= new String();
        
        this.Display1.setText("");
        this.Display2.setText("");

    }//GEN-LAST:event_BtnClearActionPerformed

    //Evento Pulsar Cambio de Teclado
    private void BtnChangePadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnChangePadActionPerformed
        
        //Cambiar a Teclado Romano
        if(modo==false){
        this.BtnChangePad.setText("Arabic");
        this.BtnAR.setText("R > A");
        this.BtnNum1.setText("I");
        this.BtnNum2.setText("V");
        this.BtnNum3.setText("X");
        this.BtnNum4.setText("L");
        this.BtnNum5.setText("C");
        this.BtnNum6.setText("D");
        this.BtnNum7.setText("M");
        this.BtnNum8.setText("-");
        this.BtnNum9.setText("-");
        this.BtnNum0.setText("-");
        this.BtnNum8.setEnabled(false);
        this.BtnNum9.setEnabled(false);
        this.BtnNum0.setEnabled(false);}
        
        //Cambiar a Teclado Arabico
        else{
        this.BtnChangePad.setText("Roman");
        this.BtnAR.setText("A > R");
        this.BtnNum1.setText("1");
        this.BtnNum2.setText("2");
        this.BtnNum3.setText("3");
        this.BtnNum4.setText("4");
        this.BtnNum5.setText("5");
        this.BtnNum6.setText("6");
        this.BtnNum7.setText("7");
        this.BtnNum8.setText("8");
        this.BtnNum9.setText("9");
        this.BtnNum0.setText("0");
        this.BtnNum8.setEnabled(true);
        this.BtnNum9.setEnabled(true);
        this.BtnNum0.setEnabled(true);}
        
        //Borrar Variables
        ValAArabicString= new String();
        ValARomanString= new String();
        
        ValBArabicString= new String();
        ValBRomanString= new String();
        
        //Limpiar Pantalla
        this.Display1.setText("");
        this.Display2.setText("");
        
        //Cambiar modo a inverso de modo
        modo=!modo;
    }//GEN-LAST:event_BtnChangePadActionPerformed

    //Evento Pulsar Borrar Caracter
    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
    if(modo==false){
            ValAArabicString=ValAArabicString.substring(0, ValAArabicString.length()-1); //Borra el ultimo caracter de la cadena
            this.Display1.setText(ValAArabicString);} // Muestra la nueva cadena
        
        else{            
            ValARomanString=ValARomanString.substring(0, ValARomanString.length()-1); //Borra el ultimo caracter de la cadena
            this.Display1.setText(ValARomanString);} // Muestra la nueva cadena
    }//GEN-LAST:event_BtnDeleteActionPerformed

    //Evento Pulsar Numero 1
    private void BtnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum1ActionPerformed
        Pulsar("1","I");
    }//GEN-LAST:event_BtnNum1ActionPerformed

    //Evento Pulsar Numero 2
    private void BtnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum2ActionPerformed
        Pulsar("2","V");
    }//GEN-LAST:event_BtnNum2ActionPerformed

    //Evento Pulsar Numero 3
    private void BtnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum3ActionPerformed
        Pulsar("3","X");
    }//GEN-LAST:event_BtnNum3ActionPerformed

    //Evento Pulsar Numero 4
    private void BtnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum4ActionPerformed
        Pulsar("4","L");
    }//GEN-LAST:event_BtnNum4ActionPerformed

    //Evento Pulsar Numero 5
    private void BtnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum5ActionPerformed
            Pulsar("5","C");
    }//GEN-LAST:event_BtnNum5ActionPerformed

    //Evento Pulsar Numero 6
    private void BtnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum6ActionPerformed
            Pulsar("6","D");
    }//GEN-LAST:event_BtnNum6ActionPerformed

    //Evento Pulsar Numero 7
    private void BtnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum7ActionPerformed
        Pulsar("7","M");
    }//GEN-LAST:event_BtnNum7ActionPerformed

    //Evento Pulsar Numero 8
    private void BtnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum8ActionPerformed
        Pulsar("8","-");   
    }//GEN-LAST:event_BtnNum8ActionPerformed

    //Evento Pulsar Numero 9
    private void BtnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum9ActionPerformed
      Pulsar("9","-");
    }//GEN-LAST:event_BtnNum9ActionPerformed

    //Evento Pulsar Division Entera
    private void BtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDivActionPerformed
      SRMD=4; //Selecciona la operacion division
      cursor=!cursor; //Cambia el cursor al segundo numero
      this.Display2.setText(this.Display1.getText()+"/");
      this.Display1.setText("");    
    }//GEN-LAST:event_BtnDivActionPerformed

    //Evento Pulsar Multiplicacion
    private void BtnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMulActionPerformed
      SRMD=3; //Selecciona la operacion multiplicacion
      cursor=!cursor; //Cambia el cursor al segundo numero
      this.Display2.setText(this.Display1.getText()+"X");
      this.Display1.setText("");
    }//GEN-LAST:event_BtnMulActionPerformed

    //Evento Pulsar Resta
    private void BtnResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResActionPerformed
      SRMD=2; //Selecciona la operacion resta
      cursor=!cursor; //Cambia el cursor al segundo numero
      this.Display2.setText(this.Display1.getText()+"-");
      this.Display1.setText("");
    }//GEN-LAST:event_BtnResActionPerformed

    //Evento Pulsar Suma
    private void BtnSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSumActionPerformed
      SRMD=1; //Selecciona la operacion suma
      cursor=!cursor; //Cambia el cursor al segundo numero
      this.Display2.setText(this.Display1.getText()+"+");
      this.Display1.setText("");
    }//GEN-LAST:event_BtnSumActionPerformed

    //Evento Pulsar Enter
    private void BtnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnterActionPerformed
        
        if(modo==false){
            int a=Integer.parseInt(ValAArabicString); //Captura el primer numero arabico
            int b=Integer.parseInt(ValBArabicString); //Captura el segundo numero arabico
            if(SRMD==1){
                this.Display1.setText(Op.Sumar(a,b));}
            else if(SRMD==2){
                this.Display1.setText(Op.Restar(a,b));}
            else if(SRMD==3){
                this.Display1.setText(Op.Multiplicar(a,b));}
            else{
                this.Display1.setText(Op.Dividir(a,b));}
        }
        else
        {
            int a=Op.ConvertRomaninArabic(ValARomanString); //Captura el primer numero romano
            int b=Op.ConvertRomaninArabic(ValBRomanString); //Captura el segundo numero romano
            
            if(SRMD==1){ //Si se pulso suma muestra la suma del primer y el segundo numero
                this.Display1.setText(Op.ConvertArabicinRoman(Integer.parseInt(Op.Sumar(a,b))));}
            else if(SRMD==2){ //Si se pulso resta muestra la resta del primer y el segundo numero
                this.Display1.setText(Op.ConvertArabicinRoman(Integer.parseInt(Op.Restar(a,b))));}
            else if(SRMD==3){ //Si se pulso multiplicacion muestra la multiplicacion del primer y el segundo numero
                this.Display1.setText(Op.ConvertArabicinRoman(Integer.parseInt(Op.Multiplicar(a,b))));}
            else{ //Si se pulso division muestra la division del primer y el segundo numero
                this.Display1.setText(Op.ConvertArabicinRoman(Integer.parseInt(Op.Dividir(a,b))));}
        }
        
        cursor=false; //Cambiar cursor al primer numero
    }//GEN-LAST:event_BtnEnterActionPerformed

    //Guarda y Muestra el Numero pulsado
    public void Pulsar(String ArabicNum,String RomanNum){
           if(modo==false){//Muestra y guarda el numero arabico
            if(cursor==false){
                ValAArabicString+=ArabicNum;
                this.Display1.setText(ValAArabicString);}
            else{
                ValBArabicString+=ArabicNum;
                this.Display1.setText(ValBArabicString);}}
        
        else{
            if(cursor==false){//Muestra y guardael numero romano
                ValARomanString+=RomanNum;
                this.Display1.setText(ValARomanString);}
            else{
                ValBRomanString+=RomanNum;
                this.Display1.setText(ValBRomanString);}}
    }
    
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAR;
    private javax.swing.JButton BtnChangePad;
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnDiv;
    private javax.swing.JButton BtnEnter;
    private javax.swing.JButton BtnMul;
    private javax.swing.JButton BtnNum0;
    private javax.swing.JButton BtnNum1;
    private javax.swing.JButton BtnNum2;
    private javax.swing.JButton BtnNum3;
    private javax.swing.JButton BtnNum4;
    private javax.swing.JButton BtnNum5;
    private javax.swing.JButton BtnNum6;
    private javax.swing.JButton BtnNum7;
    private javax.swing.JButton BtnNum8;
    private javax.swing.JButton BtnNum9;
    private javax.swing.JButton BtnRes;
    private javax.swing.JButton BtnSum;
    private javax.swing.JLabel Display1;
    private javax.swing.JLabel Display2;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private boolean modo=false; //modo={numeros arabicos, numeros romanos}
    private boolean cursor=false; //selecciona el primer o el segundo numero
    
    private int SRMD=0; //Escoge la operacion a realizar
    
    private String ValAArabicString= new String(); //Variable donde se guarda el primer numero arabico
    private String ValARomanString= new String(); //Variable donde se guarda el primer numero romano
    
    private String ValBArabicString= new String(); //Variable donde se guarda el segundo numero arabico
    private String ValBRomanString= new String(); //Variable donde se guarda el segundo numero romano
        
    Operaciones Op = new Operaciones(); //Se hereda de la clase operaciones todas las funciones
        
}
