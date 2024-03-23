package PBO_2;

public class mobilXpander {
    public static void main(String[] args) {
        DeklarasiMobil xpander = new DeklarasiMobil();
        
        xpander.merkMobil = "Mitsubishi Xpander";
        xpander.tahunBuat = 2020;
        xpander.warnaMobil = "hitam";
        
        System.out.println("Merk mobil      = " + xpander.merkMobil);
        System.out.println("warna mobil     = " + xpander.warnaMobil);
        System.out.println("Tahun Pembuatan = " + xpander.tahunBuat);
        
        xpander.mobilberjalan();
        xpander.mobilberhenti();
    }
    
}
