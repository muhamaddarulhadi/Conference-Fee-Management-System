
package confee;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class confema extends javax.swing.JFrame {
    datalist datlis = new datalist();
    DefaultTableModel model;

    public confema() {
        initComponents();
        this.setLocationRelativeTo(null);
        main.show();
        update.hide();
        delete.hide();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        conferencenameMain = new javax.swing.JTextField();
        participantidMain = new javax.swing.JTextField();
        participantnameMain = new javax.swing.JTextField();
        noofparticipantMain = new javax.swing.JTextField();
        participantorganizationMain = new javax.swing.JTextField();
        contactnoMain = new javax.swing.JTextField();
        emailMain = new javax.swing.JTextField();
        feeamountMain = new javax.swing.JTextField();
        totalfeeMain = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        deleteMain = new javax.swing.JButton();
        updateMain = new javax.swing.JButton();
        addMain = new javax.swing.JButton();
        resetMain = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        delete = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        deleteno = new javax.swing.JTextField();
        deleteDelete = new javax.swing.JButton();
        resetDelete = new javax.swing.JButton();
        backDelete = new javax.swing.JButton();
        update = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        findno = new javax.swing.JTextField();
        getUpdate = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        conferencenameOri = new javax.swing.JTextField();
        participantidOri = new javax.swing.JTextField();
        participantnameOri = new javax.swing.JTextField();
        noofparticipantOri = new javax.swing.JTextField();
        participantorganizationOri = new javax.swing.JTextField();
        contactnoOri = new javax.swing.JTextField();
        emailOri = new javax.swing.JTextField();
        feeamountOri = new javax.swing.JTextField();
        totalfeeOri = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        conferencenameEdit = new javax.swing.JTextField();
        participantidEdit = new javax.swing.JTextField();
        participantnameEdit = new javax.swing.JTextField();
        noofparticipantEdit = new javax.swing.JTextField();
        participantorganizationEdit = new javax.swing.JTextField();
        contactnoEdit = new javax.swing.JTextField();
        emailEdit = new javax.swing.JTextField();
        feeamountEdit = new javax.swing.JTextField();
        totalfeeEdit = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        resetUpdate = new javax.swing.JButton();
        backUpdate = new javax.swing.JButton();
        updateUpdate = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conference Management System");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main.setBackground(new java.awt.Color(51, 204, 0));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(255, 255, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "Conference Name", "Participant ID", "Participant Name", "No of Participant", "Participant Organization", "Contact No", "Email", "Fee Amount", "Total Fee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        main.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 104, 637, 352));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Conference Name");
        main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 107, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Participant ID");
        main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 148, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Participant Name");
        main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 189, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No of participant");
        main.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 232, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Participant Organization");
        main.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 273, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contact No");
        main.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 311, -1, 22));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email");
        main.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 351, -1, 23));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fee Amount");
        main.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 392, -1, 23));

        conferencenameMain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        main.add(conferencenameMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 104, 204, -1));

        participantidMain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        participantidMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                participantidMainActionPerformed(evt);
            }
        });
        main.add(participantidMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 145, 204, -1));

        participantnameMain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        main.add(participantnameMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 186, 204, -1));

        noofparticipantMain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        main.add(noofparticipantMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 229, 204, -1));

        participantorganizationMain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        main.add(participantorganizationMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 270, 204, -1));

        contactnoMain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        main.add(contactnoMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 310, 204, -1));

        emailMain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        main.add(emailMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 351, 204, -1));

        feeamountMain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        main.add(feeamountMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 392, 204, -1));

        totalfeeMain.setEditable(false);
        totalfeeMain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        main.add(totalfeeMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 433, 204, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total Fee");
        main.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 433, -1, 23));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CONFERENCE MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        main.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 1200, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("No of participant - single / group");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("Fee amount - secretariat / discount / normal / other");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("NOTE :");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        deleteMain.setBackground(new java.awt.Color(255, 255, 255));
        deleteMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteMain.setText("DELETE");
        deleteMain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMainActionPerformed(evt);
            }
        });
        jPanel3.add(deleteMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        updateMain.setBackground(new java.awt.Color(255, 255, 255));
        updateMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateMain.setText("UPDATE");
        updateMain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMainActionPerformed(evt);
            }
        });
        jPanel3.add(updateMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        addMain.setBackground(new java.awt.Color(255, 255, 255));
        addMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addMain.setText("ADD");
        addMain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMainActionPerformed(evt);
            }
        });
        jPanel3.add(addMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        resetMain.setBackground(new java.awt.Color(255, 255, 255));
        resetMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetMain.setText("RESET");
        resetMain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetMainActionPerformed(evt);
            }
        });
        jPanel3.add(resetMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 20, 50));

        main.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 482, 1200, 67));

        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 560));

        delete.setBackground(new java.awt.Color(51, 204, 0));
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("DELETE PARTICIPANT");
        delete.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Record that you want to delete");
        delete.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        deleteno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletenoActionPerformed(evt);
            }
        });
        delete.add(deleteno, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 140, -1));

        deleteDelete.setBackground(new java.awt.Color(255, 255, 255));
        deleteDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteDelete.setText("DELETE");
        deleteDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDeleteActionPerformed(evt);
            }
        });
        delete.add(deleteDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, -1, -1));

        resetDelete.setBackground(new java.awt.Color(255, 255, 255));
        resetDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetDelete.setText("RESET");
        resetDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetDeleteActionPerformed(evt);
            }
        });
        delete.add(resetDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, -1));

        backDelete.setBackground(new java.awt.Color(255, 255, 255));
        backDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backDelete.setText("BACK");
        backDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backDeleteActionPerformed(evt);
            }
        });
        delete.add(backDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, -1, -1));

        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 560));

        update.setBackground(new java.awt.Color(51, 204, 0));
        update.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("NEW DATA");
        update.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, -1, 30));

        findno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        findno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findnoActionPerformed(evt);
            }
        });
        update.add(findno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 90, 30));

        getUpdate.setBackground(new java.awt.Color(255, 255, 255));
        getUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getUpdate.setText("GET");
        getUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getUpdateActionPerformed(evt);
            }
        });
        update.add(getUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 70, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("NO :");
        update.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("ORIGINAL DATA");
        update.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, 30));

        conferencenameOri.setEditable(false);
        conferencenameOri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.add(conferencenameOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 320, -1));

        participantidOri.setEditable(false);
        participantidOri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        participantidOri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                participantidOriActionPerformed(evt);
            }
        });
        update.add(participantidOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 320, -1));

        participantnameOri.setEditable(false);
        participantnameOri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.add(participantnameOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 320, -1));

        noofparticipantOri.setEditable(false);
        noofparticipantOri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.add(noofparticipantOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 320, -1));

        participantorganizationOri.setEditable(false);
        participantorganizationOri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.add(participantorganizationOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 320, -1));

        contactnoOri.setEditable(false);
        contactnoOri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.add(contactnoOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 320, -1));

        emailOri.setEditable(false);
        emailOri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.add(emailOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 320, -1));

        feeamountOri.setEditable(false);
        feeamountOri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.add(feeamountOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 320, -1));

        totalfeeOri.setEditable(false);
        totalfeeOri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.add(totalfeeOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 320, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total Fee");
        update.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, 23));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Fee Amount");
        update.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, 23));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Email");
        update.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, 23));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Contact No");
        update.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, 22));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Participant Organization");
        update.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("No of participant");
        update.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Participant Name");
        update.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Participant ID");
        update.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Conference Name");
        update.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        conferencenameEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.add(conferencenameEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 320, -1));

        participantidEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        participantidEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                participantidEditActionPerformed(evt);
            }
        });
        update.add(participantidEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 320, -1));

        participantnameEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.add(participantnameEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 320, -1));

        noofparticipantEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.add(noofparticipantEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 320, -1));

        participantorganizationEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.add(participantorganizationEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 320, -1));

        contactnoEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.add(contactnoEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 320, -1));

        emailEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.add(emailEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 320, -1));

        feeamountEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.add(feeamountEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 320, -1));

        totalfeeEdit.setEditable(false);
        totalfeeEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.add(totalfeeEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 320, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resetUpdate.setBackground(new java.awt.Color(255, 255, 255));
        resetUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetUpdate.setText("RESET");
        resetUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetUpdateActionPerformed(evt);
            }
        });
        jPanel5.add(resetUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 110, -1));

        backUpdate.setBackground(new java.awt.Color(255, 255, 255));
        backUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backUpdate.setText("BACK");
        backUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backUpdateActionPerformed(evt);
            }
        });
        jPanel5.add(backUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 110, -1));

        updateUpdate.setBackground(new java.awt.Color(255, 255, 255));
        updateUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateUpdate.setText("UPDATE");
        updateUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUpdateActionPerformed(evt);
            }
        });
        jPanel5.add(updateUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 110, -1));

        update.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 130, 560));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("UPDATE PARTICIPANT");
        update.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 0, 0));
        jLabel29.setText("No of participant - single / group");
        update.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 0, 0));
        jLabel30.setText("Fee amount - secretariat / discount / normal / other");
        update.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, -1, -1));

        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMainActionPerformed

    try
    {
       String tempConferenceName = conferencenameMain.getText();
       int tempParticipantId = Integer.parseInt (participantidMain.getText());
       String tempParticipantName = participantnameMain.getText();
       String tempNoOfParticipant=noofparticipantMain.getText();
       String tempParticipantOrganization=participantorganizationMain.getText();
       String tempContactNo=contactnoMain.getText();
       String tempEmail=emailMain.getText();
       String tempFeeAmount=feeamountMain.getText();
       String temptTotalFee=totalfeeMain.getText();
       

        if(tempNoOfParticipant.equals("single") && tempFeeAmount.equals("secretariat"))
        {
            totalfeeMain.setText("5");
        }
        else if(tempNoOfParticipant.equals("single") && tempFeeAmount.equals("discount"))
        {
            totalfeeMain.setText("6");       
        }
        else if(tempNoOfParticipant.equals("single") && tempFeeAmount.equals("normal"))
        {
            totalfeeMain.setText("7");           
        }
        else if(tempNoOfParticipant.equals("single") && tempFeeAmount.equals("other"))
        {
            totalfeeMain.setText("8");           
        }
        else if(tempNoOfParticipant.equals("group") && tempFeeAmount.equals("secretariat"))
        {
            totalfeeMain.setText("7");
        }
        else if(tempNoOfParticipant.equals("group") && tempFeeAmount.equals("discount"))
        {
            totalfeeMain.setText("8");         
        }
        else if(tempNoOfParticipant.equals("group") && tempFeeAmount.equals("normal"))
        {
            totalfeeMain.setText("9");           
        }
        else if(tempNoOfParticipant.equals("group") && tempFeeAmount.equals("other"))
        {
            totalfeeMain.setText("10");           
        }
       
       DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
       data tempObject = new data(tempConferenceName,tempParticipantId,tempParticipantName,tempNoOfParticipant,tempParticipantOrganization,tempContactNo,tempEmail,tempFeeAmount,totalfeeMain.getText());
       datlis.add(tempObject);
       datlis.removeRow(model);
       datlis.display(model);
        
        JOptionPane.showMessageDialog(this, " ADD SUCCESSFULLY ");
    }
    catch(NumberFormatException e)
    {
        JOptionPane.showMessageDialog(this, " PLEASE ENTER A VALUE ");
    }
        
    }//GEN-LAST:event_addMainActionPerformed

    private void deleteMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMainActionPerformed
        delete.show();
        update.hide();
        main.hide();
        
    }//GEN-LAST:event_deleteMainActionPerformed

    private void resetMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetMainActionPerformed
        conferencenameMain.setText(null);
        participantidMain.setText(null);
        participantnameMain.setText(null);
        noofparticipantMain.setText(null);
        participantorganizationMain.setText(null);
        contactnoMain.setText(null);
        emailMain.setText(null);
        feeamountMain.setText(null);
        totalfeeMain.setText(null);
    }//GEN-LAST:event_resetMainActionPerformed

    private void updateMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMainActionPerformed
        main.hide();
        update.show();
    }//GEN-LAST:event_updateMainActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        int selectedRowIndex=jTable1.getSelectedRow();
        conferencenameMain.setText(model.getValueAt(selectedRowIndex, 1).toString());
        participantidMain.setText(model.getValueAt(selectedRowIndex, 2).toString());
        participantnameMain.setText(model.getValueAt(selectedRowIndex, 3).toString());
        noofparticipantMain.setText(model.getValueAt(selectedRowIndex, 4).toString());
        participantorganizationMain.setText(model.getValueAt(selectedRowIndex, 5).toString());
        contactnoMain.setText(model.getValueAt(selectedRowIndex, 6).toString());
        emailMain.setText(model.getValueAt(selectedRowIndex, 7).toString());
        feeamountMain.setText(model.getValueAt(selectedRowIndex, 8).toString());
        totalfeeMain.setText(model.getValueAt(selectedRowIndex, 9).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void participantidMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_participantidMainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_participantidMainActionPerformed

    private void findnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_findnoActionPerformed

    private void participantidOriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_participantidOriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_participantidOriActionPerformed

    private void participantidEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_participantidEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_participantidEditActionPerformed

    private void backUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backUpdateActionPerformed
       update.hide();
       main.show();
       
       DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
       datlis.removeRow(model);
       datlis.display(model);
    }//GEN-LAST:event_backUpdateActionPerformed

    private void updateUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUpdateActionPerformed
    
        try
        {
        int oldparticipantid = Integer.parseInt(participantidOri.getText());
        int setparticipantid = Integer.parseInt(participantidEdit.getText());
        String setconferencename = conferencenameEdit.getText();
        String setparticipantname = participantnameEdit.getText();
        String setnoofparticipant = noofparticipantEdit.getText();
        String setparticipantorganization = participantorganizationEdit.getText();
        String setcontactno = contactnoEdit.getText();
        String setemailn = emailEdit.getText();
        String setfeeamount = feeamountEdit.getText();
        String settotalfee = totalfeeEdit.getText();
        
        if(setnoofparticipant.equals("single") && setfeeamount.equals("secretariat"))
        {
            totalfeeEdit.setText("5");
        }
        else if(setnoofparticipant.equals("single") && setfeeamount.equals("discount"))
        {
            totalfeeEdit.setText("6");       
        }
        else if(setnoofparticipant.equals("single") && setfeeamount.equals("normal"))
        {
            totalfeeEdit.setText("7");           
        }
        else if(setnoofparticipant.equals("single") && setfeeamount.equals("other"))
        {
            totalfeeEdit.setText("8");           
        }
        else if(setnoofparticipant.equals("group") && setfeeamount.equals("secretariat"))
        {
            totalfeeEdit.setText("7");
        }
        else if(setnoofparticipant.equals("group") && setfeeamount.equals("discount"))
        {
            totalfeeEdit.setText("8");         
        }
        else if(setnoofparticipant.equals("group") && setfeeamount.equals("normal"))
        {
            totalfeeEdit.setText("9");           
        }
        else if(setnoofparticipant.equals("group") && setfeeamount.equals("other"))
        {
            totalfeeEdit.setText("10");           
        }
        
        datlis.update(oldparticipantid,setparticipantid,setconferencename,setparticipantname,setnoofparticipant,setparticipantorganization,setcontactno,setemailn,setfeeamount,totalfeeEdit.getText());
        JOptionPane.showMessageDialog(this, " UPDATE SUCCESSFULLY ");
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "PLEASE INSERT VALID VALUE"); 
        }
    }//GEN-LAST:event_updateUpdateActionPerformed

    private void deletenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletenoActionPerformed

    private void backDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backDeleteActionPerformed
        delete.hide();
        main.show();
        
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        datlis.removeRow(model);
        datlis.display(model);
        
    }//GEN-LAST:event_backDeleteActionPerformed

    private void deleteDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDeleteActionPerformed
      try
      {
        int temp2=Integer.parseInt(deleteno.getText());
        if(temp2>=1)
        {
           int tempid1=(int) jTable1.getValueAt(temp2-1,2);

            datlis.delete(tempid1);
            JOptionPane.showMessageDialog(this, "DELETE SUCCESSFULLY!");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "PLEASE INSERT VALID FIGURE"); 
        }
      }
      catch(NumberFormatException e)
      {
          JOptionPane.showMessageDialog(this, "PLEASE INSERT VALID VALUE"); 
      }
    }//GEN-LAST:event_deleteDeleteActionPerformed

    private void resetDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetDeleteActionPerformed
        deleteno.setText(null);
    }//GEN-LAST:event_resetDeleteActionPerformed

    private void getUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getUpdateActionPerformed
        try
        {
        int temp1=Integer.parseInt(findno.getText());
        if(temp1>=1)
        {
            String tempConferenceName = (String)jTable1.getValueAt(temp1-1,1);
            int tempParticipantId = (int) jTable1.getValueAt(temp1-1,2);
            String tempParticipantName = (String)jTable1.getValueAt(temp1-1,3);
            String tempNoOfParticipant = (String)jTable1.getValueAt(temp1-1,4);
            String tempParticipantOrganization = (String)jTable1.getValueAt(temp1-1,5);
            String tempContactNo = (String)jTable1.getValueAt(temp1-1,6);
            String tempEmail = (String)jTable1.getValueAt(temp1-1,7);
            String tempFeeAmount = (String)jTable1.getValueAt(temp1-1,8);
            String temptTotalFee = (String)jTable1.getValueAt(temp1-1,9);
            
            String IdString=String.valueOf(tempParticipantId);
            
            conferencenameOri.setText(tempConferenceName);
            participantidOri.setText(IdString);
            participantnameOri.setText(tempParticipantName);
            noofparticipantOri.setText(tempNoOfParticipant);
            participantorganizationOri.setText(tempParticipantOrganization);
            contactnoOri.setText(tempContactNo);
            emailOri.setText(tempEmail);
            feeamountOri.setText(tempFeeAmount);
            totalfeeOri.setText(temptTotalFee);
        }
        else
        {
                JOptionPane.showMessageDialog(this, " NOT IN THE LIST, PLEASE TRY AGAIN ");
        }
        }
        catch(IndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(this, " NOT IN THE LIST, PLEASE TRY AGAIN ");
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, " PLEASE ENTER A VALID INPUT ");
        }
    }//GEN-LAST:event_getUpdateActionPerformed

    private void resetUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetUpdateActionPerformed
            conferencenameOri.setText(null);
            participantidOri.setText(null);
            participantnameOri.setText(null);
            noofparticipantOri.setText(null);
            participantorganizationOri.setText(null);
            contactnoOri.setText(null);
            emailOri.setText(null);
            feeamountOri.setText(null);
            totalfeeOri.setText(null);
            conferencenameEdit.setText(null);
            participantidEdit.setText(null);
            participantnameEdit.setText(null);
            noofparticipantEdit.setText(null);
            participantorganizationEdit.setText(null);
            contactnoEdit.setText(null);
            emailEdit.setText(null);
            feeamountEdit.setText(null);
            totalfeeEdit.setText(null);
            findno.setText(null);
    }//GEN-LAST:event_resetUpdateActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new confema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMain;
    private javax.swing.JButton backDelete;
    private javax.swing.JButton backUpdate;
    private javax.swing.JTextField conferencenameEdit;
    private javax.swing.JTextField conferencenameMain;
    private javax.swing.JTextField conferencenameOri;
    private javax.swing.JTextField contactnoEdit;
    private javax.swing.JTextField contactnoMain;
    private javax.swing.JTextField contactnoOri;
    private javax.swing.JPanel delete;
    private javax.swing.JButton deleteDelete;
    private javax.swing.JButton deleteMain;
    private javax.swing.JTextField deleteno;
    private javax.swing.JTextField emailEdit;
    private javax.swing.JTextField emailMain;
    private javax.swing.JTextField emailOri;
    private javax.swing.JTextField feeamountEdit;
    private javax.swing.JTextField feeamountMain;
    private javax.swing.JTextField feeamountOri;
    private javax.swing.JTextField findno;
    private javax.swing.JButton getUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel main;
    private javax.swing.JTextField noofparticipantEdit;
    private javax.swing.JTextField noofparticipantMain;
    private javax.swing.JTextField noofparticipantOri;
    private javax.swing.JTextField participantidEdit;
    private javax.swing.JTextField participantidMain;
    private javax.swing.JTextField participantidOri;
    private javax.swing.JTextField participantnameEdit;
    private javax.swing.JTextField participantnameMain;
    private javax.swing.JTextField participantnameOri;
    private javax.swing.JTextField participantorganizationEdit;
    private javax.swing.JTextField participantorganizationMain;
    private javax.swing.JTextField participantorganizationOri;
    private javax.swing.JButton resetDelete;
    private javax.swing.JButton resetMain;
    private javax.swing.JButton resetUpdate;
    private javax.swing.JTextField totalfeeEdit;
    private javax.swing.JTextField totalfeeMain;
    private javax.swing.JTextField totalfeeOri;
    private javax.swing.JPanel update;
    private javax.swing.JButton updateMain;
    private javax.swing.JButton updateUpdate;
    // End of variables declaration//GEN-END:variables
}
