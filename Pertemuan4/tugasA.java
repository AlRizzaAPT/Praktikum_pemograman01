package Pertemuan4;

public class tugasA {

    public static void main(String[] args) {
        // Membuat objek linked list list1 dengan elemen awal null
        StrukturList list1 = new StrukturList(null);
        // Menambahkan elemen 2.1 di akhir linked list list1
        list1.addTail(2.1);
        // Menambahkan elemen 3.4 di akhir linked list list1
        list1.addTail(3.4);
        // Menambahkan elemen 4.5 di akhir linked list list1
        list1.addTail(4.5);
        // Menampilkan semua elemen dalam linked list list1
        list1.displayElement();

        System.out.println();
    }
}
