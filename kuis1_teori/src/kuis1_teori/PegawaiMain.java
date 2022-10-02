package kuis1_teori;
import java.util.Scanner;
public class PegawaiMain {
    public static void main(String[] args){
        Scanner scString = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        System.out.println("==========================================");
        System.out.println("||          DATA GAJI KARYAWAN          ||");
        System.out.println("==========================================");
        System.out.print("Masukkan Jumlah Pegawai    : ");
        int jumPeg = scInt.nextInt();
        for(int i=0; i<jumPeg; i++){
            System.out.println("==========================================");
            System.out.print("Masukkan Nama Pegawai      : ");
            String nmPegawai =  scString.next();
            System.out.print("Masukkan NIP Pegawai       : ");
            String nipPegawai = scString.next();
            Pegawai peg1 = new Pegawai(nmPegawai, nipPegawai);
            System.out.print("Masukkan Total Jam Kerja   : ");
            int totalJamKerja = scInt.nextInt();
            peg1.setJamKerja(totalJamKerja);
            System.out.println("==========================================");
            peg1.hitungGajiHarian();
            peg1.cetakPenghasilan();
            System.out.println("==========================================");
        }
    }
}