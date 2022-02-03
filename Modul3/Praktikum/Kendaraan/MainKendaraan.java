package Modul3.Praktikum.Kendaraan;

public class MainKendaraan {
    public static void main(String[] args){
    Mobil mobil1 = new Mobil();
    Mobil mobil2 = new Mobil(4);
    Mobil mobil3 = new Mobil(4,2,2);

        System.out.println(mobil1);
        System.out.println(mobil2);

        System.out.println("Mobil 1");
        System.out.println("Roda\t: " + mobil1.getRoda());

        System.out.println("Mobil 3");
        System.out.println("Roda\t: " + mobil3.getRoda());

        mobil3.setRoda(8);

        System.out.println("\nMobil 3");
        System.out.println("Roda\t: " + mobil3.getRoda());


        System.out.println("Bunyi klakson mobil\t: " + mobil3.klakson());
        mobil3.controlPedal("GAS");
        mobil3.controlPedal("rem");
        mobil3.controlPedal("apaja");
    }
}
