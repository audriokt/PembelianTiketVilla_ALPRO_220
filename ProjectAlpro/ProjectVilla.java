package ProjectAlpro;
 /* 
 * @author :
 * 235314198_ALBERTUS ANDREW PRANATA ALVARO
 * 235314199_ALBERTO SAFANDA
 * 235314220_AUDRI OKTAVIA
 * 235314196_ANTONIA ANASTASIA NDANG
 */
import java.util.*;// Mengimport fungsi untuk mengimpor semua kelas dari package tertentu:
public class ProjectVilla {//Deklarasi Class  
    static int tanggalPemesanan, bulanPemesanan, inputKamar, durasiTinggal, hargaTotal, jumlahKamar,jenisPembayaran, asalBank, setPemesanan, selesai, setPembayaran;
    static String namaBulan, namaUser, noUser;
    static boolean c = false;
    static String[] daftarNota;
    
    public static void main(String[] args) {
        inputData();
        pembayaranUser();
    }
    
    public static void inputData() {
        Scanner inputUser = new Scanner(System.in);// 
        System.out.println("                 SELAMAT DATANG DI ");
        System.out.println("                  VILLA KEBAYORAN");// Menulis Judul dari Villa dengan variabel System.out.print
        System.out.println("---------------------------------------------------");// Dekorasi batas antar caption (opsional)
        System.out.println("Jl. Tengku Umar No2, Kec. Laru 56748, Yogyakarta");// Menulis Alamat dari Villa
        System.out.println();
        
        do{
            System.out.print("Nama Anda : ");
            namaUser = inputUser.nextLine();

            for(int i = 0; i < 10; i++){
                if(namaUser.contains(String.valueOf(Character.forDigit(i, 10)))){ 
                    c = true;
                    break;
                } else {
                    c = false;
                }
            }
            if(c == true){
                System.out.println("  *Nama tidak boleh mengandung angka!");
            } else if (namaUser.isBlank() || namaUser.isEmpty()){
                System.out.println("  *Nama tidak boleh kosong!");
            }
            } while (c == true || namaUser.isBlank() || namaUser.isEmpty());
        System.out.println();

        System.out.println("---------------------------------------------------");
        
        do{
            System.out.print("No.telepon (contoh: 08...) : ");
            noUser = inputUser.nextLine();

            if(noUser.isEmpty() || noUser.isBlank()){
                System.out.println("  *Mohon masukan No.telepon anda");
            } else if(noUser.length() > 12 || noUser.length() < 12){
                System.out.println("  *Nomor tidak boleh kurang atau lebih dari!");
                System.out.println("   12 digit"); 
            }
            
            if(noUser.indexOf("0") != 0 || noUser.indexOf("8") != 1){
                System.out.println("  *Nomor salah");
            }
        } while(noUser.isEmpty() || noUser.isBlank() || noUser.length() > 12 || noUser.length() < 12 || noUser.indexOf("0") != 0 || noUser.indexOf("8") != 1 );
        
        System.out.println("---------------------------------------------------");

        
        do{
            System.out.println();//Baris kosong untuk Kalimat berikut-nya
            System.out.println("  *Kamar yang tersedia hanya ada pada");
            System.out.println("   tanggal 1-10. Maaf atas ketidak nyamanannya");
            System.out.print("Tanggal Check-in : ");// Caption tanggal Check in ( Dibatasi dari bulan ini dan tanggal sesuai diatas )
            tanggalPemesanan = inputUser.nextInt();// Input tanggal pemesanan 

            if(tanggalPemesanan < 1 || tanggalPemesanan > 10){
                    System.out.println("  *Maaf tidak ada kamar pada tanggal tersebut.");
                    // Menggunakan Statement If jika selaiin dari tanggal yang tertera maka pelanggan disuruh untuk menulis kembali
                }
        } while(tanggalPemesanan < 1 || tanggalPemesanan > 10);// Jika memenuhi persyaratan maka akan : 
      
        System.out.println("---------------------------------------------------");
        
        do{
            System.out.print("Bulan Check-in(angka)  : ");//1. Pelanggan meng-input Bulan Check-in menggunakan Scanner
            bulanPemesanan = inputUser.nextInt();

            if(bulanPemesanan < 1 || bulanPemesanan > 12){
                System.out.println("Masukkan bulan yang sesuai!");
            }
            }while(bulanPemesanan < 1 || bulanPemesanan > 12);
            System.out.println("---------------------------------------------------");

            do{
            System.out.println("  *maks 30 hari!");
            System.out.print("jangka waktu menginap(hari) : ");
            durasiTinggal = inputUser.nextInt();
        } while (durasiTinggal < 1 || durasiTinggal > 30);
        System.out.println("---------------------------------------------------");
        
        
        System.out.println();//Baris kosong untuk Kalimat berikut-nya
      
        System.out.println("ID 1: Kamar Single Rp 200.000/malam (1 orang)");
        System.out.println("Fasilitas: 1 single size bed, tv, wifi,");
        System.out.println("           kamar mandi,free breakfast"); 
        System.out.println("Rate * * * * ");
        System.out.println();
        
        System.out.println("ID 2: Kamar Dulaxe Rp 600.000/malam (2 orang)");
        System.out.println("Fasilitas: 1 queen bed, tv, wifi, kamar mandi,");
        System.out.println("           bathup, free breakfast, private pool");
        System.out.println("Rate * * * * * ");
        System.out.println();
        
        System.out.println("ID 3: Kamar Executive Rp 900.000/malam (4-6 orang)");
        System.out.println("Fasilitas: 2 kamar tidur, 1 ruang keluarga, 1 dapur, ");
        System.out.println("           1 king size bed, 1 queen size bed, tv,");
        System.out.println("           wifi, free breakfast, private pool,");
        System.out.println("           2 kamar mandi (bathup)");           
        System.out.println("Rate * * * * * ");
        System.out.println();
        
        do {
            System.out.print("Kamar (ID): ");
            inputKamar = inputUser.nextInt();

            if(inputKamar > 3 || inputKamar <= 0){
                System.out.println("*ID kamar tidak tersedia!");
            }
        } while (inputKamar > 3 || inputKamar <= 0);    
        
        System.out.println("---------------------------------------------------");
        do{
            System.out.println("  *Maks 20 kamar!");
            System.out.print("Jumlah Kamar : ");
            jumlahKamar = inputUser.nextInt();
            System.out.println();
        } while(jumlahKamar < 1 || jumlahKamar > 20);
        System.out.println("---------------------------------------------------");
    }
    
    public static long totalBiaya(int kamar){
        switch (kamar) {
            case 1 -> hargaTotal = durasiTinggal * 200000 * jumlahKamar;
            case 2 -> hargaTotal = durasiTinggal * 600000 * jumlahKamar;
            case 3 -> hargaTotal = durasiTinggal * 900000 * jumlahKamar;
        }
        return hargaTotal;
    }
    
    
    public static void notaPemesanan(int kamar){
        System.out.println("===============INFORMASI PEMBAYARAN================");

        System.out.println("                 VILLA KEBAYORAN");// Menulis Judul dari Villa dengan variabel System.out.print
        System.out.println("---------------------------------------------------");// Dekorasi batas antar caption (opsional)
        System.out.println("NOTA PEMBAYARAN");
        System.out.println();
        System.out.println("Pelanggan : " + namaUser);
        
        switch(bulanPemesanan){
            case 1 -> namaBulan = "Januari";
            case 2 -> namaBulan = "Februari";
            case 3 -> namaBulan = "Maret";
            case 4 -> namaBulan = "April";
            case 5 -> namaBulan = "Mei";
            case 6 -> namaBulan = "Juni";
            case 7 -> namaBulan = "Juli";
            case 8 -> namaBulan = "Agustus";
            case 9 -> namaBulan = "September";
            case 10 -> namaBulan = "Oktober";
            case 11 -> namaBulan = "November";
            case 12 -> namaBulan = "Desember";
        }
            
        switch (kamar) {
            case 1 -> {
                System.out.println("Kamar Single Rp 200.000/malam (1 orang)");
                System.out.println("Fasilitas: 1 single size bed, tv, wifi,");
                System.out.println("           kamar mandi, free breakfast");
                System.out.println("Jumlah Kamar : " + jumlahKamar);
                System.out.println();
            }
            case 2 -> {
                System.out.println("Kamar Dulaxe Rp 600.000/malam (2 orang)");
                System.out.println("Fasilitas: 1 queen bed, tv, wifi, kamar mandi,");
                System.out.println("           bathup, free breakfast, private pool");
                System.out.println("Jumlah Kamar : " + jumlahKamar);
                System.out.println();
            }
            default -> {
                System.out.println("Kamar Executive Rp 900.000/malam (4-6 orang)");
                System.out.println("Fasilitas: 2 kamar tidur, 1 ruang keluarga,");
                System.out.println("           1 dapur, 1 king size bed,");
                System.out.println("           1 queen size bed, tv, wifi,");
                System.out.println("           free breakfast, private pool,");
                System.out.println("           2 kamar mandi (bathup)");
                System.out.println("Jumlah Kamar : " + jumlahKamar);
                System.out.println();
            }
        }
        
        System.out.println("Tanggal Check-in : " + tanggalPemesanan + " " + namaBulan + " 2023");
        System.out.println("Durasi Tinggal : " + durasiTinggal + " hari");
        
        System.out.println("---------------------------------------------------");
        System.out.println("Total Pembayaran : Rp " + totalBiaya(inputKamar));
        System.out.println("---------------------------------------------------");   
        if (jenisPembayaran==1){
            switch (asalBank){
                case 1-> {
                    System.out.println("Pembayaran berupa Transfer melalui BRI");
                }
                case 2-> {
                    System.out.println("Pembayaran berupa Transfer melalui Mandiri");
                }
                case 3-> {
                    System.out.println("Pembayaran berupa Transfer melalui BCA");
                }
                case 4-> {
                    System.out.println("Pembayaran berupa Transfer melalui BNI");
                }
            }
        } else {
            System.out.println("Pembayaran dilakukan di lokasi dengan");
            System.out.println("menunjukan nota pemesanan"); 
        }
        System.out.println("  *Nota akan dikirim ke nomor " + noUser);
        System.out.println("  via WhatApps.");
        System.out.println("  *Mohon untuk menunjukan nota ke resepsionis!");
        System.out.println("===================================================");
        
    }
    
    static void setPembayaran(){
        Scanner inputUser = new Scanner(System.in);
        System.out.println("ID 1: Pesan Tiket      ID 2: Riwayat Transaksi");
        setPembayaran = inputUser.nextInt();
        
        switch (setPembayaran){
            case 1 -> {
                inputData();
                pembayaranUser();
            }
            case 2 -> {
                notaPemesanan(inputKamar);
            }
        }
    }
    
    public static void pembayaranUser(){
        Scanner inputUser = new Scanner(System.in);
        do{
            System.out.println("ID 1 : Transfer");
            System.out.println("ID 2 : Bayar Di Lokasi");
            System.out.print("Opsi Pembayaran : ");
            jenisPembayaran = inputUser.nextInt();
            System.out.println();
        } while(jenisPembayaran < 1 || jenisPembayaran > 2);
        
        if(jenisPembayaran == 1){
            System.out.println("OPSI BANK :");
            System.out.println("ID 1 : Bank BRI");
            System.out.println("ID 2 : Bank Mandiri");
            System.out.println("ID 3 : Bank BCA");
            System.out.println("ID 4 : Bank BNI");
            System.out.println();
            
            do{
                System.out.print("Bank Asal : ");
                asalBank = inputUser.nextInt();
            } while (asalBank < 1 || asalBank > 4 );
            
            System.out.println();
            
            System.out.println("---------------------------------------------------");
            System.out.println("TOTAL PEMBAYARAN : " + totalBiaya(inputKamar));
            
            switch (asalBank){
                case 1 -> {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Silahkan melakukan pembayaran ke nomor berikut!");
                    System.out.println("No Rekening : 0113 0234 1661 600");
                    System.out.println("*Mohon melakukan pembayaran dalam kurun waktu kurang dari 24 jam");
                }
                case 2 -> {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Silahkan melakukan pembayaran ke nomor berikut!");
                    System.out.println("No Rekening : 1560009861578");
                    System.out.println("*Mohon melakukan pembayaran dalam kurun waktu kurang dari 24 jam");
                }
                case 3 -> {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Silahkan melakukan pembayaran ke nomor berikut!");
                    System.out.println("No Rekening : 5220304312");
                    System.out.println("*Mohon melakukan pembayaran dalam kurun waktu kurang dari 24 jam");
                }
                case 4 -> {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Silahkan melakukan pembayaran ke nomor berikut!");
                    System.out.println("No Rekening : 0178305704");
                    System.out.println("*Mohon melakukan pembayaran dalam kurun waktu kurang dari 24 jam.");
                }
            }
            
            System.out.println();
            do{
                System.out.print("ID 1 : Sudah melakukan pembayaran");
                System.out.println();
                setPemesanan = inputUser.nextInt();
            } while (setPemesanan != 1);

            if(setPemesanan == 1){
                System.out.println();
                notaPemesanan(inputKamar);
            }
            } else {
                System.out.println();
                notaPemesanan(inputKamar);
            }
        
        System.out.println("ID 1 : Home     ID 2 : Exit");
        selesai = inputUser.nextInt();
        
        switch (selesai) {
            case 1 -> {
                setPembayaran();
            }
            case 2 -> {
                System.out.println("---------------------------------------------------");
                System.out.println("TERIMA KASIH ATAS KUNJUNGANNYA");
                System.out.println("---------------------------------------------------");
            }
            default -> System.out.println("  *ID tidak tersedia!");
        }
    }
} 