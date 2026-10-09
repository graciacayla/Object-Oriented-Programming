# Array dan ArrayList
Tugas PBO untuk melihat perbedaan penggunaan array biasa dan ArrayList di Java.

---

## Pembagian Class

* **Account.java**  
  Menyimpan nomor rekening dan saldo. File ini mengatur proses transaksi seperti setor uang melalui method "deposit" dan tarik tunai melalui method "withdraw".

* **Customer.java**  
  Menyimpan nama nasabah. Di class ini, daftar rekening disimpan menggunakan "ArrayList" agar satu nasabah bisa memili lebih dari satu rekening tanpa harus di tentukan terlebih dahulu batasannya.

* **Bank.java**  
  Mengelola daftar seluruh nasabah. Class ini menggunakan "array" dengan kapasitas yang dibatasi maksimal 10 orang nasabah.

* **BankDemo.java**  
  File utama yang berisi method "main" untuk menjalankan alur program, mulai dari mendaftarkan nasabah, menambahkan rekening, melakukan transaksi, hingga menampilkan hasilnya.

---

## Perbedaan Array vs ArrayList

* **Array biasa (di Bank.java)**  
  * Ukurannya tetap (maksimal 10 nasabah).  
  * Butuh variabel bantuan "numberOfCustomers" untuk menghitung jumlah nasabah yang sudah masuk dan menentukan posisi index pengisian.  
  * Perlu pengecekan manual supaya data yang diinput tidak melebihi panjang array.

* **ArrayList (di Customer.java)**  
  * Ukurannya dinamis, jadi rekening nasabah bisa ditambah tanpa perlu menetapkan batas maksimal di awal.  
  * Tidak perlu variabel counter manual karena sudah ada fungsi bawaan ".add()" untuk memasukkan data dan ".size()" untuk menghitung total rekening.  
  * Mengambil data rekening menggunakan fungsi ".get(index)".
