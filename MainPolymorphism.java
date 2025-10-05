public class MainPolymorphism {
    public static void main(String[] args) {
        Polymorphism_Kendaraan kendaraan = new Polymorphism_Kendaraan();
        kendaraan.hidupkan();
        kendaraan.hidupkan("Kunci Universal");

        polimorphism_Motor Motor = new polimorphism_Motor();
        Motor.hidupkan();
        Motor.hidupkan("Kunci Motor");


        Polimorphism_Mobil Mobil = new Polimorphism_Mobil();
        Mobil.hidupkan();
        Mobil.hidupkan("Kunci Mobil");
    }
    
}
