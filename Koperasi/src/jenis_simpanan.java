package Main;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class jenis_simpanan extends javax.swing.JFrame {

    koneksi con = new koneksi();

    /* Membuat form Jenis Simpanan Koperasi */
    public jenis_simpanan() {
        initComponents();
    }

    public void awal() {
        con.setkoneksi();
        Table1.setModel(gettabel());
        tkode.setText("");
        tjenis.setText("");
        tkode.setEnabled(true);
        tkode.requestFocus();
        tjenis.setEnabled(false);
        bsimpan.setEnabled(false);
        bupdate.setEnabled(false);
        bedit.setEnabled(false);
        bhapus.setEnabled(false);
    }

    public DefaultTableModel gettabel() {
        String[] judul = {"Kode Simpanan", "Nama Simpanan"};
        DefaultTableModel kolom = new DefaultTableModel(null, judul);
        try {
            con.setkoneksi();
            con.rs = con.st.executeQuery("select * from simpanan");
            String data[] = new String[2];
            while (con.rs.next()) {
                data[0] = con.rs.getString(1);
                data[1] = con.rs.getString(2);
                kolom.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "<Error> Koneksikan Xampp Terlebih Dahulu : " + e, "Koneksi Gagal", JOptionPane.WARNING_MESSAGE);
        }
        return kolom;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tjenis = new javax.swing.JTextField();
        tkode = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        bsimpan = new javax.swing.JButton();
        bupdate = new javax.swing.JButton();
        bedit = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Formulir Jenis Simpanan Koperasi");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Kode Simpanan :");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Jenis Simpanan :");

        tkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tkodeActionPerformed(evt);
            }
        });
        tkode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tkodeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tkode, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tjenis)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 204, 204), null));

        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        bupdate.setText("Update");
        bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupdateActionPerformed(evt);
            }
        });

        bedit.setText("Edit");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });

        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        bkeluar.setText("Kembali");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bsimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bupdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bedit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bkeluar)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsimpan)
                    .addComponent(bupdate)
                    .addComponent(bkeluar)
                    .addComponent(bhapus)
                    .addComponent(bedit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Table1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Table1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkodeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tkodeActionPerformed

    private void tkodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tkodeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                con.setkoneksi();
                con.rs = con.st.executeQuery("select * from simpanan where kd_simp='" + tkode.getText() + "'");
                if (con.rs.next()) {
                    JOptionPane.showMessageDialog(null, "Kode Telah Tersedia");
                    tkode.setText(con.rs.getString(1));
                    tjenis.setText(con.rs.getString(2));
                    tkode.setEnabled(false);
                    bedit.setEnabled(true);
                    bhapus.setEnabled(true);
                } else {
                    tkode.setEnabled(false);
                    tjenis.setEnabled(true);
                    tjenis.requestFocus();
                    bsimpan.setEnabled(true);
                }
            } catch (Exception e) {
            }
        }
}//GEN-LAST:event_tkodeKeyPressed

        private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
            // TODO add your handling code here:
            try {
                con.setkoneksi();
                String sql = "insert into simpanan values('" + tkode.getText() + "','" + tjenis.getText() + "')";
                con.st.executeUpdate(sql);
                awal();
                con.rs.close();
                JOptionPane.showMessageDialog(null, "Database Berhasil Tersimpan", "Koneksi Sukses", JOptionPane.INFORMATION_MESSAGE);
                con.conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "<Error> Koneksikan Xampp Terlebih Dahulu : " + e, "Koneksi Gagal", JOptionPane.WARNING_MESSAGE);
            }
}//GEN-LAST:event_bsimpanActionPerformed

        private void bupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdateActionPerformed
            // TODO add your handling code here:
            try {
                con.setkoneksi();
                String sql = "update simpanan set jns_simp='" + tjenis.getText() + "' where kd_simp='" + tkode.getText() + "'";
                con.st.executeUpdate(sql);
                awal();
                con.rs.close();
                JOptionPane.showMessageDialog(null, "Database Berhasil Terupdate", "Koneksi Sukses", JOptionPane.INFORMATION_MESSAGE);
                con.conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "<Error> Koneksikan Xampp Terlebih Dahulu : " + e, "Koneksi Gagal", JOptionPane.WARNING_MESSAGE);
            }
}//GEN-LAST:event_bupdateActionPerformed

        private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
            // TODO add your handling code here:
            tjenis.setEnabled(true);
            bupdate.setEnabled(true);
            bedit.setEnabled(false);
            bhapus.setEnabled(false);
}//GEN-LAST:event_beditActionPerformed

        private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
            // TODO add your handling code here:
            try {
                con.setkoneksi();
                String sql = "delete from simpanan where kd_simp='" + tkode.getText() + "'";
                con.st.executeUpdate(sql);
                awal();
                con.rs.close();
                JOptionPane.showMessageDialog(null, "Database Berhasil Terhapus", "Koneksi Sukses", JOptionPane.INFORMATION_MESSAGE);
                con.conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "<Error> Koneksikan Xampp Terlebih Dahulu : " + e, "Koneksi Gagal", JOptionPane.WARNING_MESSAGE);
            }
}//GEN-LAST:event_bhapusActionPerformed

        private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
            // TODO add your handling code here:
            new utama().setVisible(true);
            dispose();
}//GEN-LAST:event_bkeluarActionPerformed

        private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            // TODO add your handling code here:
            awal();
        }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jenis_simpanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JButton bedit;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton bupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tjenis;
    private javax.swing.JTextField tkode;
    // End of variables declaration//GEN-END:variables
}
