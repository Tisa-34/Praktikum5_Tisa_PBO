public class Abrtaction_BayarTunai extends Abstraction_Pembayaran {
    @Override
    public void bayar(int jumlah) {
        System.out.println("Pembayaran Tunai Sebesar: Rp. " + jumlah + ". Telah Berhasil Dilakukan. ");
        System.out.println("Arigato Gozaimasu.....");
    }
    
}
