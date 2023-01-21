import java.util.Scanner;
public class pembelian_barang1{
 public static void main(String [] args){
  Scanner scan = new Scanner (System.in);
  
  //Masukan tipe Data

  String nama_barang1;
  String nama_barang2;
  String nama_barang;
  
  int jenis_barang;
  int jml_barang, jml_barang1, jml_barang2;
  int harga_satuan, harga_satuan1, harga_satuan2;
  int subtotal1, subtotal2;
  int total_harga, diskon, total_bayar;
  
  //Input
  System.out.println("\nPEMBELIAN ");
  System.out.println();
  
  System.out.print("Masukan Jumlah Jenis Barang = ");
  jenis_barang = scan.nextInt();
  
  if(jenis_barang>=1 && jenis_barang<2) {
  System.out.print("Nama Barang  : ");
  nama_barang = scan.next();
  System.out.print("Jumlah Barang  : ");
  jml_barang = scan.nextInt();
  System.out.print("Harga Satuan  : ");
  harga_satuan = scan.nextInt();
  
    //Proses
  total_harga = harga_satuan * jml_barang;
  diskon = total_harga*5/100;
  total_bayar = (total_harga-(diskon));
  
  //Output
  if(total_harga>=500000){
   System.out.println("\nPotongan Diskon 5%  : "+diskon);
   System.out.print("Total Bayar   : "+total_bayar);
  }else if (total_harga>=0 && total_harga<500000){
   System.out.println("\nTotal Bayar : "+total_harga+" kawus, anda tidak dapat bonus");
   
  }
  }
  
  else if (jenis_barang>=2 && jenis_barang<3) {
  System.out.println("\nBarang ke-1 \n");
  System.out.print("Nama Barang  : ");
  nama_barang1 = scan.next();
  System.out.print("Jumlah Barang   : ");
  jml_barang1 = scan.nextInt();
  System.out.print("Harga Satuan  : ");
  harga_satuan1 = scan.nextInt();
  subtotal1 = harga_satuan1 * jml_barang1;
  System.out.println("Subtotal  : "+subtotal1);

  System.out.println("\nBarang ke-2 \n");
  System.out.print("Nama Barang  : ");
  nama_barang2 = scan.next();
  System.out.print("Jumlah Barang  : ");
  jml_barang2 = scan.nextInt();
  System.out.print("Harga Satuan  : ");
  harga_satuan2 = scan.nextInt();
  subtotal2 = harga_satuan2 * jml_barang2; 
  System.out.println("Subtotal  : "+subtotal2);
  
      //Proses
    
  total_harga = subtotal1 + subtotal2;
  diskon = total_harga*5/100;
  total_bayar = (total_harga-(diskon));
  
  //Output
  if(total_harga>=500000){
   System.out.println("\nPotongan Diskon 5%  : "+diskon);
   System.out.print("Total Bayar   : "+total_bayar);
   System.out.println();
  }else if (total_harga>=0 && total_harga<500000){
   System.out.println("\nTotal Bayar : "+total_harga+" kawus, anda tidak dapat bonus");
   System.out.println();
   
  }
  }
  
  
 }
}