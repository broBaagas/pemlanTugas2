package Tugas2;

public class Student {

private String name;
private String address;
private int age;
private double mathGrade;
private double englishGrade;
private double scienceGrade;
private double average;
private static int jumlahObjek; // Atribut ini bersifat static, sehingga hanya ada satu di seluruh objek
                                // Bisa disebut juga ini adalah atribut class

// memperbaiki constructor default yang sebelumnya error karena s tidak kapital
public Student(){
    name = "";
    address = "";
    age = 0;
    jumlahObjek ++; // Setiap Coinstructor dipanggil, jumlah objek akan bertambah
}

//Overloading constructor dengan parameter nama, alamat, dan umur
public Student(String n, String a, int ag){
    name = n;
    address = a;
    age = ag;
    jumlahObjek ++; // Setiap Coinstructor dipanggil, jumlah objek akan bertambah
}

//overloading constructor dengan parameter nama, alamat, umur, nilai matematika, nilai bahasa inggris, dan nilai sains
public Student(String n, String a, int ag, double math, double english, double science){
    name = n;
    address = a;
    age = ag;
    mathGrade = math;
    englishGrade = english;
    scienceGrade = science;
    jumlahObjek ++;
}

public void setName(String n){
    name = n;
}

public void setAddress(String a){
    address = a;
}

public void setAge(int ag){
    age = ag;
}

public void setMath(int math){
    mathGrade = math;
}

public void setEnglish(int english){
    englishGrade = english;
}

public void setScience(int science){
    scienceGrade = science;
}

// Behaviour untuk mendapatkan jumlah objek yang telah diinstansiasi
public static void getObjek(){
    System.out.println("Jumlah objek yang telah anda instansiasi berjumlah " + jumlahObjek + "\n");
}

// Behaviour untuk menghitung nilai rata rata
public double getAverage(){
    double result = 0;
    result = (mathGrade + scienceGrade + englishGrade) / 3.0;
    this.average = result;
    return result;
}

// Behaviour untuk menampilkan informasi siswa
public void displayMessage(){
    System.out.println("Siswa dengan nama " + name);
    System.out.println("beralamat di " + address);
    System.out.println("berumur " + age + " tahun");
    System.out.printf("mempunyai nilai rata rata %.2f\n", average);
    if (statusAkhir()){
        System.out.printf(name + " LULUS dengan nilai rata rata %.2f \n\n", average);
    } else {
        System.out.printf(name + " TIDAK LULUS dengan nilai rata rata %.2f \n\n", average);
    }
}

// Behaviour untuk mengecek status akhir siswa
private boolean statusAkhir(){
    if (average >= 60){
        return true;
    } else {
        return false;
    }
}

}