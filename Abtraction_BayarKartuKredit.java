public class Abtraction_BayarKartuKredit extends Abstraction_Pembayaran {
    @Override
    public void bayar (int jumlah){
        System.out.println("Pembayaran Kartu Kredit Sebesar: Rp. " + jumlah + ". Telah Berhasil Dilakukan.");
        System.out.println("Arigato Gozaimasu.....");
    }
    
}
interface DapatDiskon {
    void diskon(int persen);

    
}