/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naim's
 */
import java.util.Scanner;
public class jam_bekerja {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
    String nama;
    int jam_kerja;
    int hari_kerja;
    int kerja_ot;
    int gaji;
    
    System.out.print("Sila masukkan nama anda :");
    nama=scan.nextLine();
    System.out.print("Sila masukkan jam bekerja :");
    jam_kerja=scan.nextInt();
        while(jam_kerja>9){
    System.out.print("Sila masukkan jam bekerja yang betul:");
    jam_kerja=scan.nextInt();
    }
    
    System.out.print("Sila masukkan hari bekerja :");
    hari_kerja=scan.nextInt();
        while(hari_kerja>30){
    System.out.print("Sila masukkan hari bekerja yang betul:");
    hari_kerja=scan.nextInt();
    }
        
    System.out.print("Sila masukkan jam bekerja lebih masa :");
    kerja_ot=scan.nextInt();
        while(kerja_ot>50){
    System.out.print("Sila masukkan jam bekerja lebih masa yang betul:");
    kerja_ot=scan.nextInt();
    }
    gaji=(jam_kerja * hari_kerja * 100)+(kerja_ot * 0);
    
    System.out.println("Rumusan gaji bulanan "+nama);
    System.out.println("Jumlah jam bekerja "+jam_kerja+"jam");
    System.out.println("Jumlah hari bekerja "+hari_kerja+"hari");
    System.out.println("Jumlah jam bekerja lebih masa "+kerja_ot+"jam");
    System.out.println("Jumlah GAJI:RM"+gaji);
    
    } 
}
