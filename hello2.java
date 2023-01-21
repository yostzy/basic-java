import java.util.Scanner;
publik class hello2.java{
    public static void main (String args[]{
        String nama;
        int status,jml_anak,gapok,tunkes,tunak,tunis;
        Scanner sc=new Scanner(System.in);
        System.out.println("APLIKASI PENGGAJIAN KARYAWAN PT. INDAH KARYA");
        System.out.println("============================================");
        System.out.println("1. Belum Menikah");
        System.out.println("2. Sudah Menikah");
        System.out.println("3. Duda/Janda");
        System.out.print("Masukkan Pilihan Diatas (1-3): ");
        status.sc.nextInt();
        System.out.print("Masukan Jumlah Anak : ");
        jml_anak=sc.nextInt();
        if(status ==1){
            gapok=2000000;
            tunkes=300000;
            tunak=0;
            tunis=0;
        }else if (status ==2){
            if(jml_anak >=3){
                gapok=3000000;
                tunkes=300000;
                tunak=500000;
                tunis=250000;
            }else if(jml_anak > 0){
                gapok=3000000;
                tunkes=300000;
                tunak=200000;
                tunis=250000;
            }else{
                gapok=3000000;
                tunkes=300000;
                tunak=0;
                tunis=250000;
            }else if(status ==3){
                if(jml_anak >=3){
                    gapok=3000000;
                    tunkes=300000;
                    tunak=300000;
                    tunis=0;
                }else if(jml_anak >0){
                    gapok=3000000;
                    tunkes=300000;
                    tunak=100000;
                    tunis=0;
                }else{
                    gapok=3000000;
                    tunkes=300000;
                    tunak=0;
                    tunis=0;
                }
            }
            int total_gaji = gapok + tunkes + tunis + tunak;
            System.out.println("Gaji Pokok          = Rp "+gapok);
            System.out.println("Tunj. Kesehatan     = Rp "+tunkes);
            System.out.println("Tunj. Suami/Istri   = Rp "+tunis);
            System.out.println("Tunj. Anak          = Rp "+tunak);
            System.out.println("Total Gaji          = Rp "+total_gaji);
        }
    }