package Tugas2;
import java.util.Scanner;
public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Kode Asli, menggunakan constructor default
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.getAverage();
        anna.displayMessage();

        // menggunakan constructor overload yang hanya mengisi nama, alamat, dan umur
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.getAverage();
        chris.displayMessage();

        // Menggunakan constructor yang dapat mengisi nilai Student
        System.out.println("===================");
        Student agus = new Student("Agus", "Jember", 12, 95, 87, 91);
        agus.getAverage();
        agus.displayMessage();

        // siswa dengan nama anna dirubah informasi alamat dan umurnya melalui
        // constructor
        System.out.println("===================");
        anna = new Student("Anna", "Batu", 18);
        anna.displayMessage();

        // siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
        System.out.println("===================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();
        Student.getObjek();

        // Modifikasi kode dengan menggunakan inputan user
        int destinyChoice;
        do {
            System.out.print("1. Tambah Siswa\n2. Keluar\nTentukan pilihan anda : ");
             destinyChoice= sc.nextInt();
            switch (destinyChoice) {
                case 1:
                    tambahSiswa();
                    break;
                case 2:
                    System.out.println("Anda telah keluar dari program");
                default:
                    break;
            }
            Student.getObjek();
        } while (destinyChoice == 1);
    }

    // Method untuk menambahkan siswa Sesuai dengan keinginan user
    // Method ini sekaligus meminta user untuk memasukkan data siswa
    public static void tambahSiswa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa ");
        int siswa = sc.nextInt();
        // Membuat array objek Student untuk membuat objek sebanyak siswa yang diinginkan
        Student[] jumlahSiswa = new Student[siswa];
        for (int i = 0; i < siswa; i++) {
            jumlahSiswa[i] = new Student();
            System.out.print("Masukkan nama siswa ke-" + (i + 1) + " : ");
            jumlahSiswa[i].setName(sc.next());
            System.out.print("Masukkan alamat siswa ke-" + (i + 1) + " : ");
            jumlahSiswa[i].setAddress(sc.next());
            System.out.print("Masukkan umur siswa ke-" + (i + 1) + " : ");
            jumlahSiswa[i].setAge(sc.nextInt());
            System.out.print("Masukkan nilai matematika siswa ke-" + (i + 1) + " : ");
            jumlahSiswa[i].setMath(sc.nextInt());
            System.out.print("Masukkan nilai bahasa inggris siswa ke-" + (i + 1) + " : ");
            jumlahSiswa[i].setEnglish(sc.nextInt());
            System.out.print("Masukkan nilai sains siswa ke-" + (i + 1) + " : ");
            jumlahSiswa[i].setScience(sc.nextInt());
            jumlahSiswa[i].getAverage();
            jumlahSiswa[i].displayMessage();
        }
    }

}