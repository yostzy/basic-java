/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author yosef
 */
public class NewClass {
 import javax.swing.JOptionPane;                                     
class dataSiswa{                                     //awal class dataSiswa 
int nis;                                            //deklarasi variabel
String nm, jrsn, kelas;                             //deklarasi variabel
void input(){                                      //awal class dataSiswa 
nis-Integer.parseInt(JOptionPane.showInputDialog("Nomor Induk Siswa : "));
nm=JOptionPane.showInputDialog("Nama Lengkap Siswa : ");
jrsn=JOptionPane.showInputDialog("Kompetensi Keahlian : ");
kelas=JOptionPane.showInputDialog("Kelas: ");
}                                                 //akhir method input
void output(){                                    //awal method output
JOptionPane.showMessageDialog(null, "Nomor Induk Siswa "+nis);
JOptionPane.showMessageDialog(null, "Nama Lengkap Siswa : "+nm);
JOptionPane.showm
JOptionPane.showMessageDialog(null, "Kelas: "+kelas);
JOptionPane.showMessageDialog(null,"Terima Kasih.");
}                                                   //akhir method output
}                                                  //akhir class dataSiswa
public class contohMethod{                       //awal class contohMethod                                     
public static void main(String[] args) {             //class utama 
dataSiswa obyek1=new dataSiswa();              //membuat objek baru "obyek1"
obyek1.input();                  //mengakses dan menjalankan method input
obyek1.output();                //mengakses dan menjalankan method output
}
}                                //akhir class contohMethod (class utama)   
}
