/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
//NEW
/**
 *
 * @author WAHYU LINTANG
 */
public class DashboardAdmin extends javax.swing.JFrame {

    /**
     * Creates new form DashboardAdmin
     */
    public DashboardAdmin() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArAktivitas = new javax.swing.JTextArea();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnLogout = new javax.swing.JButton();
        lblUserAdmin = new javax.swing.JLabel();
        btnTambahMP = new javax.swing.JButton();
        btnTambahPro = new javax.swing.JButton();
        btnHapusMP = new javax.swing.JButton();
        btnHapusPro = new javax.swing.JButton();
        btnBeranda = new javax.swing.JButton();
        panelMP = new javax.swing.JScrollPane();
        tblMP = new javax.swing.JTable();
        panelPro = new javax.swing.JScrollPane();
        tblPro = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(850, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Vani", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aktivitas Terakhir");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 32, 179, 72));

        txtArAktivitas.setColumns(20);
        txtArAktivitas.setRows(5);
        jScrollPane1.setViewportView(txtArAktivitas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 110, 517, 30));

        jDesktopPane1.setBackground(new java.awt.Color(0, 153, 204));

        btnLogout.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        btnLogout.setText("LOGOUT ");

        lblUserAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserAdmin.setText("USER :  ADMIN");

        btnTambahMP.setFont(new java.awt.Font("Vani", 0, 10)); // NOI18N
        btnTambahMP.setText("TAMBAH MANAJER PROYEK");

        btnTambahPro.setFont(new java.awt.Font("Vani", 0, 10)); // NOI18N
        btnTambahPro.setText("TAMBAH PROGRAMMER");

        btnHapusMP.setFont(new java.awt.Font("Vani", 0, 10)); // NOI18N
        btnHapusMP.setText("HAPUS MANAJER PROYEK");

        btnHapusPro.setFont(new java.awt.Font("Vani", 0, 10)); // NOI18N
        btnHapusPro.setText("HAPUS PROGRAMMER");

        btnBeranda.setFont(new java.awt.Font("Vani", 0, 10)); // NOI18N
        btnBeranda.setText("BERANDA");

        jDesktopPane1.setLayer(btnLogout, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblUserAdmin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnTambahMP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnTambahPro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnHapusMP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnHapusPro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnBeranda, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUserAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(btnTambahPro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTambahMP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHapusMP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHapusPro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBeranda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblUserAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBeranda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTambahMP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTambahPro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHapusMP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHapusPro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 0, -1, 510));

        tblMP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "ID", "Jumlah Proyek"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        panelMP.setViewportView(tblMP);

        jPanel1.add(panelMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 192, 517, 95));

        tblPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "ID", "Jumlah Proyek"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        panelPro.setViewportView(tblPro);

        jPanel1.add(panelPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 342, 517, 95));

        jLabel2.setText("Programmer");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 322, -1, -1));

        jLabel3.setText("Manajer Proyek");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 177, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\Tubes PBO\\wallhaven-41419.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeranda;
    private javax.swing.JButton btnHapusMP;
    private javax.swing.JButton btnHapusPro;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnTambahMP;
    private javax.swing.JButton btnTambahPro;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUserAdmin;
    private javax.swing.JScrollPane panelMP;
    private javax.swing.JScrollPane panelPro;
    private javax.swing.JTable tblMP;
    private javax.swing.JTable tblPro;
    private javax.swing.JTextArea txtArAktivitas;
    // End of variables declaration//GEN-END:variables

    public void setlblUserAdmin(String input){
        lblUserAdmin.setText(input);
    }
    
    public JButton getBtnBeranda() {
        return btnBeranda;
    }

    public JButton getBtnHapusMP() {
        return btnHapusMP;
    }

    public JButton getBtnHapusPro() {
        return btnHapusPro;
    }

    public JButton getBtnLogout() {
        return btnLogout;
    }

    public JButton getBtnTambahMP() {
        return btnTambahMP;
    }

    public JButton getBtnTambahPro() {
        return btnTambahPro;
    }

    public JLabel getLblUserAdmin() {
        return lblUserAdmin;
    }

    public JTable getTblMP() {
        return tblMP;
    }

    public JTable getTblPro() {
        return tblPro;
    }

    public JTextArea getTxtArAktivitas() {
        return txtArAktivitas;
    }
    
    public void addListener(ActionListener e){
        btnBeranda.addActionListener(e);
        btnHapusMP.addActionListener(e);
        btnHapusPro.addActionListener(e);
        btnLogout.addActionListener(e);
        btnTambahMP.addActionListener(e);
        btnTambahPro.addActionListener(e); 
    }

    public JScrollPane getPanelMP() {
        return panelMP;
    }

    public JScrollPane getPanelPro() {
        return panelPro;
    }
    
    
}