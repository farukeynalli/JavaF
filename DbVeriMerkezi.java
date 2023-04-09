package database;

import java.text.DecimalFormat;

public class DbVeriMerkezi extends DbConnection {

    protected int kullaniciId = 0,temsilciNo=0;
    protected String adSoyad, telNo, tcNo, musteriNo,e_mail,adress;
    protected double bakiye;

     public int getTemsilciNo() {
        return temsilciNo;
    }

    public void setTemsilciNo(int temsilciNo) {
        this.temsilciNo = temsilciNo;
    }
    
    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    

    public int getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(int kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        double b = Double.valueOf(new DecimalFormat("##.##").format(bakiye).replaceAll(",", "."));
        this.bakiye = b;
    }

    

    
}
