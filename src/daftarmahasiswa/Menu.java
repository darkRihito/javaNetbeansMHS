/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmahasiswa;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Menu extends javax.swing.JFrame {

    private DefaultTableModel dtm;
    private Boolean isUpdate = false;
    private int selectedID = -1;
    private ArrayList<Mahasiswa> listMhs;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        listMhs = new ArrayList<>();
        //Dummy
        listMhs.add(new Mahasiswa("1111", "Aaaa", "A", "-"));
        listMhs.add(new Mahasiswa("2222", "Bbbb", "B", "-"));
        listMhs.add(new Mahasiswa("3333", "Cccc", "C", "-"));
        // Set Table
        jTable1.setModel(setTable());
        // Hide Delete button
        bt_delete.setVisible(false);
    }

    public final DefaultTableModel setTable() {
        Object[] column = {"NIM", "Nama", "Nilai", "Ket"};
        DefaultTableModel dataTabel = new DefaultTableModel(null, column);
        for (int i = 0; i < listMhs.size(); i++) {
            Object[] row = new Object[4];
            row[0] = listMhs.get(i).getNim();
            row[1] = listMhs.get(i).getNama();
            row[2] = listMhs.get(i).getNilai();
            row[3] = listMhs.get(i).getKet();

            dataTabel.addRow(row);
        }

        return dataTabel;
    }
    
    public void canceldat(){
        inp_nim.setText("");
        inp_nama.setText("");
        inp_nilai.setText("");
        inp_ket.setText("");
    }
    
    public void insertData() {
        // Get Data
        String nim = inp_nim.getText();
        String nama = inp_nama.getText();
        String nilai = inp_nilai.getText();
        String ket = inp_ket.getText();

        listMhs.add(new Mahasiswa(nim, nama, nilai, ket));
        //Update Table
        if(nim.equals("")||nama.equals("")||nilai.equals("")||ket.equals("")){
            System.out.println("data tidak lengkap!");
            JOptionPane.showMessageDialog(null, "data tidak lengkap!");
        }else{
            inp_nim.setText("");
            inp_nama.setText("");
            inp_nilai.setText("");
            inp_ket.setText("");
            jTable1.setModel(setTable());
            System.out.println("Insert Success!");
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
        }
    }

    public void updateData() {
        // Get Data
        String nim = inp_nim.getText();
        String nama = inp_nama.getText();
        String nilai = inp_nilai.getText();
        String ket = inp_ket.getText();
        //System.out.println(nim + nama + nilai);

        listMhs.get(selectedID).setNim(nim);
        listMhs.get(selectedID).setNama(nama);
        listMhs.get(selectedID).setNilai(nilai);
        listMhs.get(selectedID).setKet(ket);
        
        // update table #1
        if(nim.equals("")||nama.equals("")||nilai.equals("")||ket.equals("")){
            System.out.println("data tidak lengkap!");
            JOptionPane.showMessageDialog(null, "data tidak lengkap!");
        }else{
            inp_nim.setText("");
            inp_nama.setText("");
            inp_nilai.setText("");
            inp_ket.setText("");
            jTable1.setModel(setTable());
            System.out.println("Update Success!");
            JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
        }

    }

    public void deleteData() {
        // Get Data
        //String nim = inp_nim.getText();
        String nama = inp_nama.getText();
        //String nilai = inp_nilai.getText();
        for (int i = 0; i < listMhs.size(); i++) {
            if(listMhs.get(i).getNama().equals(nama)){
                listMhs.remove(i);
            }
        }
        inp_nim.setText("");
        inp_nama.setText("");
        inp_nilai.setText("");
        inp_ket.setText("");
        jTable1.setModel(setTable());
        System.out.println("Delete Success!");
        JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        inp_nim = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inp_nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inp_nilai = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bt_delete = new javax.swing.JButton();
        bt_cancel = new javax.swing.JButton();
        Ket = new javax.swing.JLabel();
        inp_ket = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Daftar Mahasiswa");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        inp_nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inp_nimActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel2.setText("NIM");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel3.setText("Nama");

        inp_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inp_namaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel4.setText("Nilai");

        inp_nilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inp_nilaiActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Nilai", "Ket"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.setVerifyInputWhenFocusTarget(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        bt_delete.setText("Delete");
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });

        bt_cancel.setText("Cancel");
        bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelActionPerformed(evt);
            }
        });

        Ket.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        Ket.setText("Ket");

        inp_ket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inp_ketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Ket)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inp_ket, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inp_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(55, 55, 55)
                                    .addComponent(inp_nim, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inp_nilai, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(bt_delete)
                            .addComponent(bt_cancel))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inp_nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inp_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(bt_cancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inp_nilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(bt_delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ket)
                    .addComponent(inp_ket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inp_nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inp_nimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inp_nimActionPerformed

    private void inp_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inp_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inp_namaActionPerformed

    private void inp_nilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inp_nilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inp_nilaiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (isUpdate == false)
            insertData();
        else {
            updateData();
            jButton1.setText("Add");
            bt_delete.setVisible(false);
            this.isUpdate = false;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        this.isUpdate = true;

        //Get Selected Data
        int row = jTable1.getSelectedRow();
        String selectedNim = (jTable1.getModel().getValueAt(row, 0).toString());
        String selectedNama = (jTable1.getModel().getValueAt(row, 1).toString());
        String selectedNilai = (jTable1.getModel().getValueAt(row, 2).toString());
        String selectedKet = (jTable1.getModel().getValueAt(row, 3).toString());

        for (int i = 0; i < listMhs.size(); i++) {
            if (selectedNim.equals(listMhs.get(i).getNim())) {
                selectedID = i;
                break;
            }
        }

        //System.out.println(selectedID);
        inp_nim.setText(selectedNim);
        inp_nama.setText(selectedNama);
        inp_nilai.setText(selectedNilai);
        inp_ket.setText(selectedKet);

        jButton1.setText("Update");
        bt_delete.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        // TODO add your handling code here:
        if (isUpdate == true) {
            deleteData();
            jButton1.setText("Add");
            bt_delete.setVisible(false);
            this.isUpdate = false;
        }
    }//GEN-LAST:event_bt_deleteActionPerformed

    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
        // TODO add your handling code here:
        canceldat();
        jButton1.setText("Add");
        bt_delete.setVisible(false);
        this.isUpdate = false;
    }//GEN-LAST:event_bt_cancelActionPerformed

    private void inp_ketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inp_ketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inp_ketActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ket;
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_delete;
    private javax.swing.JTextField inp_ket;
    private javax.swing.JTextField inp_nama;
    private javax.swing.JTextField inp_nilai;
    private javax.swing.JTextField inp_nim;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
