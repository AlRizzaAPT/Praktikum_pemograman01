package Pertemuan4;

public class StrukturList {

    private Node HEAD; // Node yang menunjukkan kepala dari linked list

    public StrukturList(Node HEAD) {
        this.HEAD = HEAD; // Menginisialisasi kepala linked list
    }

    // Menambahkan elemen di akhir linked list
    public void addTail(double data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            HEAD = newNode; // Jika linked list kosong, elemen baru menjadi kepala
        } else {
            Node posNode = null;
            Node curNode = HEAD;

            // Menemukan posisi terakhir dalam linked list
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }

            // Menambahkan elemen baru di akhir linked list
            posNode.setNext(newNode);
        }
    }
    // Menambahkan elemen di awal linked list
    public void addHead(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode; // Jika linked list kosong, elemen baru menjadi kepala
        } else {
            newNode.next = HEAD;
            HEAD = newNode; // Mengubah kepala linked list menjadi elemen baru
        }
    }

    // Menambahkan elemen di tengah linked list pada posisi tertentu
    public void addMid(double data, int position) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode; // Jika linked list kosong, elemen baru menjadi kepala
        } else {
            Node posNode = null;
            Node curNode = HEAD;
            int i = 1;
            if (position == 1) { // Jika memasukkan di awal
                newNode.next = curNode;
                HEAD = newNode;
            } else {
                // Menemukan posisi yang dimaksud
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.next;
                    i++;
                }
                // Menambahkan elemen baru di posisi yang dimaksud
                posNode.next = newNode;
                newNode.next = curNode;
            }
        }
    }

    // Mengecek apakah linked list kosong
    private boolean isEmpty() {
        return HEAD == null;
    }
    
    // Menampilkan semua elemen dalam linked list
    public void displayElement() {
        Node curNode = HEAD;

        while (curNode != null) {
            System.out.print(curNode.getData() + " "); // Menampilkan data dari setiap elemen
            curNode = curNode.getNext(); // Pindah ke elemen berikutnya
        }
    }
}
