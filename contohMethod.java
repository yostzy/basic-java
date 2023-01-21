import javax.swing.JOptionPane;                                     
class dataSiswa{                                     //awal class dataSiswa 
int nis;                                            //deklarasi variabel
String nm,jrsn,kelas;                             //deklarasi variabel
void input(){                                      //awal class dataSiswa 
nis=Integer.parseInt(JOptionPane.showInputDialog("Nomor punggung : "));
nm=JOptionPane.showInputDialog("warna kulit : ");
jrsn=JOptionPane.showInputDialog("apakah pemain bola : ");
kelas=JOptionPane.showInputDialog("agama : ");
}                                                 //akhir method input
void output(){                                    //awal method output
JOptionPane.showMessageDialog(null, "Nomor punggung "+nis);
JOptionPane.showMessageDialog(null, "warna kulit : "+nm);
JOptionPane.showMessageDialog(null, "apakah pemain bola : "+jrsn);
JOptionPane.showMessageDialog(null, "agama: "+kelas);
JOptionPane.showMessageDialog(null,"kerca pakus.");
}                                                   //akhir method output
}                                                  //akhir class dataSiswa
public class contohMethod{                       //awal class contohMethod                                     
public static void main(String [] args){             //class utama 
dataSiswa obyek1=new dataSiswa();              //membuat objek baru "obyek1"
obyek1.input();                  //mengakses dan menjalankan method input
obyek1.output();                //mengakses dan menjalankan method output
}
}                                //akhir class contohMethod (class utama)