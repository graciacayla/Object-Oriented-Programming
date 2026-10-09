# Inheritance and Polymorphism

Tugas PBO yang menerapkan inheritance, overriding sebagai bentuk polymorphism, dan encapsulation pada Java.

---

## Class Structure

* **Shape.java**  
  Class induk (superclass) yang menyimpan atribut untuk seluruh bentuk, yaitu warna ('color'), serta method "printInfo()" untuk menampilkan informasi warna.

* **Square.java**  
  Class turunan (subclass) dari "Shape". Menambahkan atribut sisi ('side'), method "calculateArea()" untuk menghitung luas persegi, serta meng-override method "printInfo()".

* **Circle.java**  
  Class turunan dari "Shape". Menyimpan atribut jari-jari ('radius'), konstanta "PI", method hitung luas "calculateArea()", serta meng-override method "printInfo()".

* **Cylinder.java**  
  Class turunan dari "Circle". Memanfaatkan method "calculateArea()" milik Circle dan menambahkan atribut tinggi ('height') untuk menghitung volume tabung melalui "calculateVolume()".

* **ShapeDemo.java**  
  File utama yang berisi method "main" untuk menjalankan pembuatan objek persegi, lingkaran, dan silinder, lalu menampilkan perhitungannya.

---

## Implementation of Inheritance, Polymorphism, and Encapsulation

* **Inheritance**  
  * Class "Square" dan "Circle" mewarisi class "Shape" menggunakan kata kunci "extends".
  * Class "Cylinder" mewarisi class "Circle", sehingga Cylinder bisa langsung memanggil method "calculateArea()" milik Circle untuk menghitung volume tabung ('calculateArea() * height').
  * Setiap subclass memanggil konstruktor milik class induknya menggunakan perintah "super()".

* **Polymorphism**  
  * Method "printInfo()" ditulis ulang di setiap subclass menggunakan anotasi "@Override".
  * Setiap class punya cara berbeda dalam menampilkan datanya, tetapi tetap memanggil method "printInfo()" milik parent-nya terlebih dahulu lewat perintah "super.printInfo()" sebelum mencetak luas atau volume masing-masing.

* **Encapsulation**  
  * Variabel seperti "side", "radius", dan "height" diatur menjadi "private" agar tidak bisa diubah secara sembarangan dari luar class.

---

## Output

<pre>
SQUARE
Shape Color: Purple
Square Area: 225.0

CIRCLE
Shape Color: Yellow
Circle Area: 153.86

CYLINDER
Shape Color: Blue
Circle Area: 615.44
Cylinder Volume: 12308.800000000001
</pre>
