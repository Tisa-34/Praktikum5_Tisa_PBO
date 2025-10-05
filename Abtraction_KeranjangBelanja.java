public class Abtraction_KeranjangBelanja implements DapatDiskon{
    private int total;

    public Abtraction_KeranjangBelanja(int total){
        this.total = total;
    }

    @Override 
    public void diskon (int persen){
        int potongan = total * persen /100;
        total -= potongan;
        System.out.println("Diskon Sebesar: " + persen + "%. didapatkan. Total Pembayaran Setelah Diskon: RP. " + total);
    }
    
}
