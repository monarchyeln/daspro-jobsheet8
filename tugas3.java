import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal harus 1!");
        } else {
            int totalBarang = 0;
            int maxBarang = - 1;
            int tokoTerbaik = 0;
            
            for (int i = 1; i <= jumlahToko; i++) {
                System.out.println("--- Toko " + i + " ---");
                System.out.print("Masukan jumlah pelanggan: ");
                int jumlahPelanggan = sc.nextInt();

                int totalBarangPerToko = 0;

                for (int j = 1; j <= jumlahPelanggan; j++) {
                    System.out.print("Jumlah barang yang dibeli pelanggan ke-" + j + ": ");
                    int jumlahBarang = sc.nextInt();

                    totalBarangPerToko += jumlahBarang;
                }
                
                totalBarang += totalBarangPerToko;

                System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangPerToko);

                if (totalBarangPerToko > maxBarang) {
                    maxBarang = totalBarangPerToko;
                    tokoTerbaik = i;
            }
        }
            System.out.println("\n=================================");
            System.out.println("Total barang seluruh toko: " + totalBarang);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);
    }
    sc.close();
    }
}