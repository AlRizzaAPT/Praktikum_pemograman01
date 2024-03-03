package Pertemuan4;

public class Strukturlistest {

    public static void main(String[] args) {
    	
        // Membuat objek linked list dengan elemen awal null
        StrukturList list = new StrukturList(null);

        // Menambahkan elemen 3 di akhir linked list
        list.addTail(3);
        // Menambahkan elemen 4 di akhir linked list setelah 3
        list.addTail(4);
        // Menambahkan elemen 7 di tengah linked list setelah indeks 2
        list.addMid(7, 2);
        // Menambahkan elemen 8 di tengah linked list setelah indeks 2
        list.addMid(8, 2);
        // Menambahkan elemen 5 di awal linked list
        list.addHead(5);

        // Menampilkan semua elemen dalam linked list
        list.displayElement();
    }
}
