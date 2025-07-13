# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pemesanan taksi online menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini memungkinkan pengguna untuk melakukan pemesanan taksi secara reguler maupun VIP. Input yang diterima berupa nama penumpang, nomor HP, supir, tujuan, dan jarak. Output yang diberikan adalah detail pemesanan dan total tarif berdasarkan jenis pemesanan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `PenumpangTaksi`, `PemesananTaksi`, `PemesananVIP`, dan `TaksiOnlineBeraksi` adalah contoh dari class.

```java
public class PenumpangTaksi {
    ...
}

public class PemesananTaksi {
    ...
}

public class PemesananVIP extends PemesananTaksi {
    ...
}

public class TaksiOnlineBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, objek dibuat saat input pemesanan.

```java
PenumpangTaksi penumpang = new PenumpangTaksi(nama, noHp);
PemesananTaksi psn = new PemesananVIP(penumpang, supir, tujuan, jarak);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `noHp`, `supir`, `tujuan`, `jarak`, dan `tarif` adalah contoh atribut.

```java
private String nama;
private String noHp;
protected String supir;
protected String tujuan;
protected double jarak;
protected double tarif;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object.

```java
public PenumpangTaksi(String nama, String noHp) {
    this.nama = nama;
    this.noHp = noHp;
}

public PemesananTaksi(PenumpangTaksi penumpang, String supir, String tujuan, double jarak) {
    this.penumpang = penumpang;
    this.supir = supir;
    this.tujuan = tujuan;
    this.jarak = jarak;
    this.tarif = hitungTarif();
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut.

```java
public void setSupir(String supir) {
    this.supir = supir;
}

public void setTujuan(String tujuan) {
    this.tujuan = tujuan;
}

public void setJarak(double jarak) {
    this.jarak = jarak;
    this.tarif = hitungTarif();
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut.

```java
public String getNama() {
    return nama;
}

public String getNoHp() {
    return noHp;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private atau protected dan hanya bisa diakses melalui method.

```java
private String nama;
private String noHp;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain.

```java
public class PemesananVIP extends PemesananTaksi {
    ...
}
```

9. **Polymorphism** adalah kemampuan objek untuk merespons secara berbeda terhadap method yang sama. Pada kode ini, method `hitungTarif()` dan `tampilkanDetail()` dioverride di class `PemesananVIP`.

```java
@Override
public double hitungTarif() {
    return jarak * 5000;
}

@Override
public void tampilkanDetail() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi.

```java
if (menu == 1 || menu == 2) {
    ...
} else if (menu == 3) {
    ...
} else if (menu == 4) {
    break;
} else {
    System.out.println("Menu tidak tersedia.");
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali.

```java
while (true) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user.

```java
Scanner sc = new Scanner(System.in);
System.out.print("Nama Penumpang: ");
String nama = sc.nextLine();

System.out.println("Tarif: Rp" + tarif);
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini digunakan `ArrayList`.

```java
ArrayList<PemesananTaksi> daftarPemesanan = new ArrayList<>();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime.

```java
try {
    ...
} catch (Exception e) {
    System.out.println("Terjadi kesalahan input.");
    sc.nextLine();
    return null;
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Rafiandra Darsyaf  
NPM: 2310010217
