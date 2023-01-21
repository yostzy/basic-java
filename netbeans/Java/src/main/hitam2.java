/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.Scanner;
/**
 *
 * @author yosef
 */
public class hitam2 {

public static void main(String[] args){
hitam2 obyek1=new hitam2(); 
obyek1.input();
obyek1.output();
}
int nis;
String nm,jrsn,kelas;
Scanner sc1=new Scanner(System.in);
Scanner sc2=new Scanner(System.in);
Scanner sc3=new Scanner(System.in);
Scanner sc4=new Scanner(System.in);
void input(){
System.out.println("=====================");
System.out.println("Selamat Datang");
System.out.println("Silahkan Mengisi Data Anda");
System.out.print ("Nomor Induk Siswa : ");
nis=sc1.nextInt();
System.out.print("Nama Lengkap Siswa : ");
nm=sc2.nextLine();
System.out.print ("Kompetensi Keahlian : ");
jrsn=sc3.nextLine(); 
System.out.print("Kelas : ");
kelas=sc4.nextLine();
}
void output(){
System.out.println("=====================");
System.out.println("DATA SISWA");
System.out.println("Nomor Induk Siswa : "+nis);
System.out.println("Nama Lengkap Siswa : "+nm);
System.out.println("Kompetensi Keahlian : "+jrsn);
System.out.println("Kelas : "+kelas);
System.out.println("Terimakasih Telah Mengisi, Semoga Cepet ketemu tempat PKL Aamiin");
}
}

