public class MainAbtraction {
    public static void main(String[] args) {
        Abstraction_Pembayaran tunai = new Abrtaction_BayarTunai();
        tunai.tampilInfo();
        tunai.bayar(500000);

        Abstraction_Pembayaran kartuKredit =new Abtraction_BayarKartuKredit();
        kartuKredit.tampilInfo();
        kartuKredit.bayar(10000000);


        Abtraction_KeranjangBelanja belanja = new Abtraction_KeranjangBelanja(10000000);
        belanja.diskon(20);
        
    }
    
}
