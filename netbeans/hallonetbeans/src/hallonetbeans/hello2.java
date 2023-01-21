/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hallonetbeans;
import java.util.Scanner;
/**
 *
 * @author yosef
 */
public class hello2 {
public static void main (String args[]) {
String nama, kelas, umur;
Scanner rekam = new Scanner(System.in);
Scanner rekam2 = new Scanner(System.in);
Scanner rekam3 = new Scanner(System.in);
System.out.println("");
System.out.println("=======================");
System.out.println("Selamat Datang di Pemrograman Java :)...");
System.out.print(" pacar keysha siapa?");
nama = rekam.nextLine();
System.out.print(" cantik tidak?");
kelas = rekam2.nextLine();
System.out.print(" umur berapa?");
umur = rekam3.nextLine();
System.out.println(" pacar keysha adalah "+nama+", cantik tidak? "+kelas+", Umur "+umur+", langgeng ya");
System.out.println("========================");
}
}
