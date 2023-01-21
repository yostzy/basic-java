/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodm;

/**
 *
 * @author yosef
 */
import javax.swing.JOptionPane;
public class MethodM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nis;                                            //deklarasi variabel
        String nm,kelas,jrsn,organisasi;
        
        nis=Integer.parseInt(JOptionPane.showInputDialog("Nomor Induk Siswa : "));
nm=JOptionPane.showInputDialog("Nama Lengkap : ");
kelas=JOptionPane.showInputDialog("Kelas : ");
jrsn=JOptionPane.showInputDialog("Jurusan : ");
organisasi=JOptionPane.showInputDialog("Organisasi : ");

//akhir method input
    //awal method output
JOptionPane.showMessageDialog(null, "Nomor Induk Siswa "+nis);
JOptionPane.showMessageDialog(null, "Nama Lengkap : "+nm);
JOptionPane.showMessageDialog(null, "Kelas : "+kelas);
JOptionPane.showMessageDialog(null, "Jurusan : "+jrsn);
JOptionPane.showMessageDialog(null, "Organisasi: "+organisasi);
JOptionPane.showMessageDialog(null,"Terimakasih telah mengisi, semoga cepet dapet tempat PKL Aamiin:)");

}
}
