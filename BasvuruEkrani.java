package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.KullaniciBasvuru;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;

public class BasvuruEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    private KullaniciBasvuru kullaniciBasvuruObject = null;

    public BasvuruEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        basvuruEkraniPanel.setFocusable(true);
        TextAyarlari.setOnlyAlphabetic(adSoyadText);
        TextAyarlari.setMaxLimit(telNoText, 11);
        TextAyarlari.setMaxLimit(tcNoText, 11);
        
    }

    public KullaniciBasvuru getKullaniciBasvuruObject() {
        if (this.kullaniciBasvuruObject == null) {
            kullaniciBasvuruObject = new KullaniciBasvuru();
        }
        return kullaniciBasvuruObject;
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return TextAyarlari.textAlanlariDolumu(basvuruEkraniPanel);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basvuruEkraniPanel = new javax.swing.JPanel();
        kisiselBilgilerLabel = new javax.swing.JLabel();
        TCnoLabel = new javax.swing.JLabel();
        adSoyadText = new javax.swing.JTextField();
        tcNoText = new javax.swing.JTextField();
        telNoLabel = new javax.swing.JLabel();
        temsilciText = new javax.swing.JTextField();
        temsilciLabel = new javax.swing.JLabel();
        e_mailLabel = new javax.swing.JLabel();
        adresLabel = new javax.swing.JLabel();
        adresText = new javax.swing.JTextField();
        basvurButton = new javax.swing.JButton();
        geriIcon = new javax.swing.JLabel();
        e_mailText = new javax.swing.JTextField();
        AdSoyadLabel = new javax.swing.JLabel();
        telNoText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banka Başvuru Ekranı");

        basvuruEkraniPanel.setBackground(new java.awt.Color(204, 204, 255));
        basvuruEkraniPanel.setPreferredSize(new java.awt.Dimension(650, 590));

        kisiselBilgilerLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        kisiselBilgilerLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kisiselBilgilerLabel.setText("Kişisel Bilgiler");

        TCnoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TCnoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TCnoLabel.setText("T.C. No :");

        adSoyadText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tcNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        telNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telNoLabel.setText("Tel No :");

        temsilciText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        temsilciLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        temsilciLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        temsilciLabel.setText("Temsilci No :");

        e_mailLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        e_mailLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        e_mailLabel.setText("E-mail :");

        adresLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adresLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adresLabel.setText("Adres :");

        adresText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        basvurButton.setBackground(new java.awt.Color(204, 204, 255));
        basvurButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvurButton.setText("Başvur");
        basvurButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        basvurButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                basvurButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                basvurButtonMouseExited(evt);
            }
        });
        basvurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basvurButtonActionPerformed(evt);
            }
        });

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        e_mailText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        AdSoyadLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AdSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AdSoyadLabel.setText("Ad Soyad :");

        telNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telNoTextActionPerformed(evt);
            }
        });

        jLabel1.setText("NOT: 3 TANE MÜŞTERİ TEMSİLCİSİ VARDIR!");

        javax.swing.GroupLayout basvuruEkraniPanelLayout = new javax.swing.GroupLayout(basvuruEkraniPanel);
        basvuruEkraniPanel.setLayout(basvuruEkraniPanelLayout);
        basvuruEkraniPanelLayout.setHorizontalGroup(
            basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                        .addComponent(geriIcon)
                        .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(kisiselBilgilerLabel))
                            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                                        .addComponent(adresLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(adresText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                                        .addComponent(e_mailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(e_mailText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                                            .addComponent(telNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                                            .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(TCnoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(AdSoyadLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(adSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                                            .addComponent(temsilciLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(temsilciText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(105, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basvuruEkraniPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(basvurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basvuruEkraniPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(157, 157, 157))
        );

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {e_mailText, telNoText, temsilciText});

        basvuruEkraniPanelLayout.setVerticalGroup(
            basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                        .addComponent(geriIcon)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basvuruEkraniPanelLayout.createSequentialGroup()
                        .addComponent(kisiselBilgilerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TCnoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temsilciLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(temsilciText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e_mailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e_mailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adresLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adresText, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(basvurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {TCnoLabel, adSoyadText});

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tcNoText, telNoLabel});

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {e_mailText, telNoText, temsilciLabel, temsilciText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void basvurButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseEntered
        ButtonAyarlari.setBgFg(basvurButton, Color.black, Color.white);
    }//GEN-LAST:event_basvurButtonMouseEntered

    private void basvurButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(basvurButton);
    }//GEN-LAST:event_basvurButtonMouseExited


    private void basvurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvurButtonActionPerformed
        if (this.bilgilerGecerliMi()) {
            this.basvuruyuGerceklestir();
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }

    }//GEN-LAST:event_basvurButtonActionPerformed

    private void basvuruyuGerceklestir() {

        //kişisel bilgiler
        this.getKullaniciBasvuruObject().setAdSoyad(this.adSoyadText.getText().trim());
        this.getKullaniciBasvuruObject().setTcNo(this.tcNoText.getText());
        this.getKullaniciBasvuruObject().setTelNo(this.telNoText.getText());
        this.getKullaniciBasvuruObject().setE_mail(this.e_mailText.getText());
        this.getKullaniciBasvuruObject().setAdress(this.adresText.getText().trim());
        this.getKullaniciBasvuruObject().setTemsilciNo(this.temsilciText.getText());

        //sistem tarafından verilecek bilgiler
        this.getKullaniciBasvuruObject().setMusteriNo(this.randomMusteriNoAl());
        this.getKullaniciBasvuruObject().setSifre(this.randomSifreAl());

        if (this.getKullaniciBasvuruObject().basvuruOnaylandiMi()) {
            Dialogs.ozelMesajGoster(this, "Başvurunuz kabul edilmiştir.\n"
                    + "Müşteri Numaranız:" + this.getKullaniciBasvuruObject().getMusteriNo()
                    + "\nŞifreniz:" + this.getKullaniciBasvuruObject().getSifre());
            ActionAyarlari.setVisible(this, new GirisEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Başvurunuz kabul edilmemiştir.\n"
                    + "Lütfen bilgilerinizi kontrol edin!");
        }

    }

    private String randomMusteriNoAl() {
        String musteriNo;
        do {
            musteriNo = String.valueOf(1000000 + (int) (Math.random() * 9000000));
        } while (this.getKullaniciBasvuruObject().musteriNoTablodaVarMi());
        return musteriNo;
    }

    private String randomSifreAl() {
        String sifre;
        sifre = String.valueOf(1000 + (int) (Math.random() * 9000));
        return sifre;
    }

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionAyarlari.setVisible(this, new GirisEkrani());
    }//GEN-LAST:event_geriIconMouseClicked

    private void telNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telNoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telNoTextActionPerformed

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
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasvuruEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdSoyadLabel;
    private javax.swing.JLabel TCnoLabel;
    private javax.swing.JTextField adSoyadText;
    private javax.swing.JLabel adresLabel;
    private javax.swing.JTextField adresText;
    private javax.swing.JButton basvurButton;
    private javax.swing.JPanel basvuruEkraniPanel;
    private javax.swing.JLabel e_mailLabel;
    private javax.swing.JTextField e_mailText;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kisiselBilgilerLabel;
    private javax.swing.JTextField tcNoText;
    private javax.swing.JLabel telNoLabel;
    private javax.swing.JTextField telNoText;
    private javax.swing.JLabel temsilciLabel;
    private javax.swing.JTextField temsilciText;
    // End of variables declaration//GEN-END:variables
}
