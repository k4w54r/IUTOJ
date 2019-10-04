/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iutoj_admin;

import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import newsubmission.NewSubmission;

/**
 *
 * @author KAWSAR
 */
public class SubmissionShow extends javax.swing.JFrame {

    public SubmissionShow() {
        initComponents();

        SubDetailsTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 20));
        SubDetailsTable.setRowHeight(25);

        this.setVisible(rootPaneCheckingEnabled);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SubDetailsScrollPane = new javax.swing.JScrollPane();
        SubDetailsTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        CopyButton = new javax.swing.JButton();
        SourceCodeLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SourceCodeTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1900, 700));
        setSize(new java.awt.Dimension(1900, 700));

        SubDetailsTable.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        SubDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Author", "Problem ID", "Lang", "Verdict", "Time", "Submitted"
            }
        ));
        SubDetailsTable.setRowHeight(25);
        SubDetailsTable.setSelectionBackground(new java.awt.Color(0, 181, 204));
        SubDetailsTable.setShowHorizontalLines(false);
        SubDetailsScrollPane.setViewportView(SubDetailsTable);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        CopyButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        CopyButton.setText("Copy");
        CopyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyButtonActionPerformed(evt);
            }
        });

        SourceCodeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SourceCodeLabel.setForeground(new java.awt.Color(0, 181, 204));
        SourceCodeLabel.setText("Source Code");

        SourceCodeTextArea.setEditable(false);
        SourceCodeTextArea.setBackground(new java.awt.Color(239, 240, 242));
        SourceCodeTextArea.setColumns(20);
        SourceCodeTextArea.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        SourceCodeTextArea.setForeground(new java.awt.Color(0, 51, 51));
        SourceCodeTextArea.setRows(5);
        jScrollPane2.setViewportView(SourceCodeTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1107, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SourceCodeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CopyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CopyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SourceCodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubDetailsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1131, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SubDetailsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CopyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CopyButtonActionPerformed

    public void setSubDetailsTable(Object subID, Object author, Object problem, Object lang, Object verdict, Object time, Object submitted) {
        Object[][] table = {{subID, author, problem, lang, verdict, time, submitted}};
        Object[] columns = { "#", "Author", "Problem ID", "Lang", "Verdict", "Time", "Submitted"};
        DefaultTableModel tablemodel = new DefaultTableModel(table, columns){

            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        
        SubDetailsTable.setModel(tablemodel);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );

        SubDetailsTable.setDefaultRenderer(Object.class, centerRenderer);
        JTableHeader subdetailstableheader = SubDetailsTable.getTableHeader();
        ((DefaultTableCellRenderer)subdetailstableheader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER); 
    }
    
    public void setSourceCOde(NewSubmission submission){
        SourceCodeTextArea.setTabSize(4);
        SourceCodeTextArea.setText(new String(submission.getCodeF()));
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CopyButton;
    private javax.swing.JLabel SourceCodeLabel;
    private javax.swing.JTextArea SourceCodeTextArea;
    private javax.swing.JScrollPane SubDetailsScrollPane;
    private javax.swing.JTable SubDetailsTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
