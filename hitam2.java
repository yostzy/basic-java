import java.util.Scanner;
class dataSiswa{
int nis;
String nm,jrsn,kelas;
Scanner sc1=new Scanner(System.in);
Scanner sc2=new Scanner(System.in);
Scanner sc3=new Scanner(System.in);
Scanner sc4=new Scanner(System.in);
void input(){
System.out.println("=====================");
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
System.out.print("DATA SISWA");
System.out.println("Nomor Induk Siswa : "+nis);
System.out.println("Nama Lengkap Siswa : "+nm);
System.out.println("Kompetensi Keahlian : "+jrsn);
System.out.println("Kelas : "+kelas);
}
}
public class hitam2{
public static void main(String[] args){
dataSiswa obyek1=new dataSiswa(); 
obyek1.input();
obyek1.output();
}
}