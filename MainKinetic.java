/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
package LiveCode;
 
/**
 *
 * @author Rafi Andrea Lesmana 
 * Nim   : 22104410014
 * Kelas : TI A
 */
import java.util.Scanner;

public class MainKinetic {
    double massa, kecepatan;

    public void setMassa(double massa) { this.massa = massa; }
    public double getMassa() { return massa; }

    public void setKecepatan(double kecepatan) { this.kecepatan = kecepatan; }
    public double getKecepatan() { return kecepatan; }

    public double hitungEnergiKinetik(){ 
        return 0.5 * massa * Math.pow(kecepatan, 2); }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MainKinetic kinetik = new MainKinetic();

        System.out.print("Masukkan massa sepeda (kg): ");
        kinetik.setMassa(scanner.nextDouble());

        System.out.print("Masukkan kecepatan sepeda (m/s): ");
        kinetik.setKecepatan(scanner.nextDouble());

        double energiKinetik = kinetik.hitungEnergiKinetik();
        System.out.println("Energi kinetik sepeda: " + energiKinetik + " Joule");

        scanner.close();
    }
}