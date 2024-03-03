package Pertemuan4;

public class tugasb {

    public static void main(String[] args) {
        // Membuat objek linked list dengan elemen awal null
        StrukturList list = new StrukturList(null);
        // Menambahkan elemen 2.1 di awal linked list
        list.addHead(2.1);
        // Menambahkan elemen 3.4 di awal linked list
        list.addHead(3.4);
        // Menambahkan elemen 1.1 di tengah linked list setelah indeks 3
        list.addMid(1.1, 3);
        // Menambahkan elemen 4.5 di akhir linked list
        list.addTail(4.5);
        // Menambahkan elemen 5.5 di akhir linked list
        list.addTail(5.5);
        // Menampilkan semua elemen dalam linked list
        list.displayElement();

        System.out.println();
    }
}
