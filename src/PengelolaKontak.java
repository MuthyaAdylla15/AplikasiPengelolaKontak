import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import java.sql.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class PengelolaKontak extends javax.swing.JFrame {

    /**
     * Creates new form PengelolaKontak
     */
    public PengelolaKontak() {
         initComponents();
         tampilkanData(); // Menampilkan data saat aplikasi pertama kali dibuka

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txfNama = new javax.swing.JTextField();
        txfNo = new javax.swing.JTextField();
        cbKategori = new javax.swing.JComboBox<>();
        txfEmail = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txfCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Latihan 3", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("Aplikasi Pengelola Kontak");

        jLabel2.setText("Nama");

        jLabel3.setText("No Handphone");

        jLabel4.setText("Email");

        jLabel5.setText("Kategori");

        cbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teman", "Keluarga", "Pekerjaan", "Orang tua", " " }));

        btnTambah.setBackground(new java.awt.Color(255, 204, 204));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 204, 204));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 204, 204));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setText("Cari");

        txfCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCariActionPerformed(evt);
            }
        });

        btnCari.setBackground(new java.awt.Color(204, 255, 204));
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnSimpan.setBackground(new java.awt.Color(255, 204, 204));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfNo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfNama, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbKategori, 0, 170, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCari, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSimpan)
                            .addComponent(btnTambah))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnCari)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txfCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(btnTambah)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String nama = txfNama.getText();
        String noHandphone = txfNo.getText();
        String email = txfEmail.getText();
        String kategori = (String) cbKategori.getSelectedItem();

        if (nama.isEmpty() || noHandphone.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Harap isi semua data!");
            return;
        }

        if (!noHandphone.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Nomor handphone harus berupa angka!");
            return;
        }

        if (!email.matches("^[\\w-.]+@[\\w-]+\\.[a-zA-Z]{2,}$")) {
            JOptionPane.showMessageDialog(this, "Format email tidak valid!");
            return;
        }

        databaseHelper dbHelper = new databaseHelper();
        dbHelper.addContact(nama, noHandphone, email, kategori);

        JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
        tampilkanData();
        clearForm();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
    int row = jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin diubah!");
            return;
        }

        int id = Integer.parseInt(jTable1.getValueAt(row, 0).toString());
        String nama = txfNama.getText();
        String noHandphone = txfNo.getText();
        String email = txfEmail.getText();
        String kategori = (String) cbKategori.getSelectedItem();

        if (nama.isEmpty() || noHandphone.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Harap isi semua data!");
            return;
        }

        databaseHelper dbHelper = new databaseHelper();
        dbHelper.updateContact(id, nama, noHandphone, email, kategori);

        JOptionPane.showMessageDialog(this, "Data berhasil diubah!");
        tampilkanData();
        clearForm();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
     int row = jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus!");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?");
        if (confirm != JOptionPane.YES_OPTION) return;

        int id = Integer.parseInt(jTable1.getValueAt(row, 0).toString());
        databaseHelper dbHelper = new databaseHelper();
        dbHelper.deleteContact(id);

        JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
        tampilkanData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
         tampilkanData();
    }//GEN-LAST:event_jTable1AncestorAdded

    private void txfCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCariActionPerformed
        cariData(); 
    }//GEN-LAST:event_txfCariActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
         cariData(); // Panggil metode untuk mencari data
}

private void cariData() {
    String keyword = txfCari.getText().trim(); // Ambil kata kunci dari input
    String query;
    
    // Jika kata kunci kosong, ambil semua data
    if (keyword.isEmpty()) {
        query = "SELECT * FROM kontak"; // Query untuk mengambil semua data
    } else {
        query = "SELECT * FROM kontak WHERE nama LIKE ? OR nomor_handphone LIKE ? OR email LIKE ? OR kategori LIKE ?";
    }

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kontak db", "root", "");
         PreparedStatement stmt = conn.prepareStatement(query)) {

        // Jika ada kata kunci, set parameter untuk pencarian
        if (!keyword.isEmpty()) {
            String formattedKeyword = "%" + keyword + "%";
            stmt.setString(1, formattedKeyword);
            stmt.setString(2, formattedKeyword);
            stmt.setString(3, formattedKeyword);
            stmt.setString(4, formattedKeyword);
        }

        try (ResultSet rs = stmt.executeQuery()) {
            // Inisialisasi model tabel
            DefaultTableModel model = new DefaultTableModel(
                new String[]{"ID", "Nama", "Nomor Handphone", "Email", "Kategori"}, 0
            );

            // Tambahkan data dari ResultSet ke model tabel
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("nama"),
                    rs.getString("nomor_handphone"),
                    rs.getString("email"),
                    rs.getString("kategori")
                });
            }

            // Set model tabel ke jTable1
            jTable1.setModel(model);

            // Tampilkan pesan jika tidak ada data yang ditemukan
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan!");
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat pencarian: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
       simpanDataKeCSV(); // Panggil metode untuk menyimpan data ke file CSV
}

private void simpanDataKeCSV() {
    // Membuka JFileChooser untuk memilih lokasi dan nama file
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Simpan Data ke CSV");

    // Mengatur filter untuk file CSV
    FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV Files", "csv");
    fileChooser.setFileFilter(filter);

    // Menampilkan dialog simpan file
    int userSelection = fileChooser.showSaveDialog(this);
    if (userSelection != JFileChooser.APPROVE_OPTION) {
        // Jika pengguna membatalkan, keluar dari metode
        return;
    }

    // Mendapatkan file yang dipilih oleh pengguna
    File fileToSave = fileChooser.getSelectedFile();
    
    // Jika file tidak memiliki ekstensi .csv, tambahkan .csv
    if (!fileToSave.getName().endsWith(".csv")) {
        fileToSave = new File(fileToSave.getAbsolutePath() + ".csv");
    }

    // Ambil data dari jTable1
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave))) {
        // Menulis header (kolom) ke file CSV
        for (int i = 0; i < model.getColumnCount(); i++) {
            writer.write(model.getColumnName(i));
            if (i < model.getColumnCount() - 1) {
                writer.write(","); // Pisahkan dengan koma
            }
        }
        writer.newLine(); // Pindah baris setelah header

        // Menulis data ke file CSV
        for (int row = 0; row < model.getRowCount(); row++) {
            for (int col = 0; col < model.getColumnCount(); col++) {
                writer.write(model.getValueAt(row, col).toString());
                if (col < model.getColumnCount() - 1) {
                    writer.write(","); // Pisahkan dengan koma
                }
            }
            writer.newLine(); // Pindah baris setelah setiap baris data
        }
        
        // Tampilkan pesan berhasil
        JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke " + fileToSave.getAbsolutePath());
        
    } catch (IOException e) {
        // Tangani error jika terjadi masalah saat menulis ke file
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan file: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if (row != -1) {
            // Isi form berdasarkan data di tabel
            txfNama.setText(jTable1.getValueAt(row, 1).toString()); // Asumsi kolom 1 adalah nama
            txfNo.setText(jTable1.getValueAt(row, 2).toString());   // Asumsi kolom 2 adalah no handphone
            txfEmail.setText(jTable1.getValueAt(row, 3).toString());// Asumsi kolom 3 adalah email
            cbKategori.setSelectedItem(jTable1.getValueAt(row, 4).toString()); // Asumsi kolom 4 adalah kategori
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(PengelolaKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PengelolaKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PengelolaKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PengelolaKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PengelolaKontak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cbKategori;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txfCari;
    private javax.swing.JTextField txfEmail;
    private javax.swing.JTextField txfNama;
    private javax.swing.JTextField txfNo;
    // End of variables declaration//GEN-END:variables

    private void tampilkanData() {
    databaseHelper dbHelper = new databaseHelper();
    ResultSet rs = dbHelper.getContacts();


        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Nama", "Nomor Handphone", "Email", "Kategori"}, 0);

        try {
            while (rs != null && rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("nama"),
                        rs.getString("nomor_handphone"),
                        rs.getString("email"),
                        rs.getString("kategori")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.getStatement().getConnection().close();
            } catch (SQLException e) {
            }
        }
        jTable1.setModel(model);
    }

    private void clearForm() {
        txfNama.setText("");
        txfNo.setText("");
        txfEmail.setText("");
        cbKategori.setSelectedIndex(0);
    }
}
