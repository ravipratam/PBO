/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Service IT
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
        
public class Pembeli extends javax.swing.JFrame {

    /** Creates new form NewJFrame */
    public Pembeli() {
        initComponents();
        buka_tabel_pembeli();
    }
    private void buka_tabel_pembeli(){
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID Pembeli");
        model.addColumn("Nama Pembeli");
        model.addColumn("Alamat");
        model.addColumn("No. HP");
        
        try{
            int no=1;
            String sql="SELECT id_pembeli, nm_pembeli, p_alamat, p_telpon FROM pembeli";
           // String sql="SELECT txtnobarcode,txtnama,txtharga,txtstok FROM tblbarang";
            java.sql.Connection conn=(Connection) koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{
                        no++,
                        res.getString(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4)});
            }
            tblpembeli.setModel (model);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "KONEKSI GAGAL " + e.getMessage());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtidpembeli = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        txthp = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpembeli = new javax.swing.JTable();
        btnbarang = new javax.swing.JButton();
        btnsupplier = new javax.swing.JButton();
        btntransaksi = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Pembeli");

        jLabel2.setText("Nama Pembeli");

        jLabel3.setText("Alamat");

        jLabel4.setText("No. HP");

        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnedit.setText("EDIT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        tblpembeli.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblpembeli);

        btnbarang.setText("BARANG");
        btnbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbarangActionPerformed(evt);
            }
        });

        btnsupplier.setText("SUPPLIER");
        btnsupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsupplierActionPerformed(evt);
            }
        });

        btntransaksi.setText("TRANSAKSI");

        jLabel5.setText("FORM PEMBELI");

        jButton1.setText("PEMBELI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txthp)
                    .addComponent(txtnama)
                    .addComponent(txtidpembeli)
                    .addComponent(txtalamat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnbarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btntransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnsimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel5)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidpembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbarang))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsupplier))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txthp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntransaksi))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btnedit)
                    .addComponent(btnhapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // Ambil data dari form input
    String idPembeli = txtidpembeli.getText();
    String namaPembeli = txtnama.getText();
    String alamat = txtalamat.getText();
    String noHp = txthp.getText();

    // Validasi input (opsional)
    if (idPembeli.isEmpty() || namaPembeli.isEmpty() || alamat.isEmpty() || noHp.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Semua field harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        // Koneksi ke database
        Connection conn = koneksi.configDB();

        // Query SQL untuk INSERT data
        String sql = "INSERT INTO pembeli (id_pembeli, nm_pembeli, p_alamat, p_telpon) VALUES (?, ?, ?, ?)";
        java.sql.PreparedStatement stmt = conn.prepareStatement(sql);

        // Mengisi parameter query dengan data dari form
        stmt.setString(1, idPembeli);
        stmt.setString(2, namaPembeli);
        stmt.setString(3, alamat);
        stmt.setString(4, noHp);

        // Eksekusi query
        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan!", "Informasi", JOptionPane.INFORMATION_MESSAGE);

        // Reset form input setelah berhasil disimpan
        txtidpembeli.setText("");
        txtnama.setText("");
        txtalamat.setText("");
        txthp.setText("");

        // (Opsional) Refresh tabel jika ada
        buka_tabel_pembeli();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal menyimpan data: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        int selectedRow = tblpembeli.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Pilih data yang ingin diedit!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Ambil data dari baris yang dipilih
    String idPembeli = tblpembeli.getValueAt(selectedRow, 1).toString(); // Kolom ke-1 adalah no_barcode
    String namaPembeli = txtnama.getText();
    String alamat = txtalamat.getText();
    String noHp = txthp.getText();

    // Validasi input
    if (namaPembeli.isEmpty() || alamat.isEmpty() || noHp.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Semua field harus diisi untuk update!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        // Koneksi ke database
        Connection conn = koneksi.configDB();

        // Query SQL untuk UPDATE data
        String sql = "UPDATE pembeli SET nm_pembeli = ?, p_alamat = ?, p_telpon = ? WHERE id_pembeli = ?";
        java.sql.PreparedStatement stmt = conn.prepareStatement(sql);

        // Mengisi parameter query dengan data dari form
        stmt.setString(1, namaPembeli);
        stmt.setString(2, alamat);
        stmt.setString(3, noHp);
        stmt.setString(4, idPembeli);

        // Eksekusi query
        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data berhasil diperbarui!", "Informasi", JOptionPane.INFORMATION_MESSAGE);

        // Reset form input setelah update
        txtidpembeli.setText("");
        txtnama.setText("");
        txtalamat.setText("");
        txthp.setText("");

        // Refresh tabel setelah update
        buka_tabel_pembeli();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal mengupdate data: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btneditActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        int selectedRow = tblpembeli.getSelectedRow();
    
    if (selectedRow == -1) { // Tidak ada baris yang dipilih
        JOptionPane.showMessageDialog(null, "Pilih data yang ingin dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Mengambil nilai kolom "No Barcode" dari baris yang dipilih
    String idSupplier = tblpembeli.getValueAt(selectedRow, 1).toString(); // Kolom ke-1 adalah no_barcode

    // Konfirmasi penghapusan
    int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        try {
            // Koneksi ke database
            Connection conn = koneksi.configDB();
            
            // Query SQL untuk DELETE
            String sql = "DELETE FROM pembeli WHERE id_pembeli = ?";
            java.sql.PreparedStatement stmt = conn.prepareStatement(sql);

            // Set parameter no_barcode
            stmt.setString(1, idSupplier);

            // Eksekusi query DELETE
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!", "Informasi", JOptionPane.INFORMATION_MESSAGE);

            // Refresh tabel setelah penghapusan
            buka_tabel_pembeli();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal menghapus data: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbarangActionPerformed
        formduba n = new formduba();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnbarangActionPerformed

    private void btnsupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsupplierActionPerformed
        Supplier n = new Supplier();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnsupplierActionPerformed

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
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbarang;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnsupplier;
    private javax.swing.JButton btntransaksi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblpembeli;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txthp;
    private javax.swing.JTextField txtidpembeli;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
