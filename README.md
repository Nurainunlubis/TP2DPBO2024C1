# TP2DPBO2024C1
## JANJI 
```bash
Saya Nur Ainun 2202046 mengerjakan LATIHAN PRAKTIKUM 5 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. 
```

## Deskripsi Program

Program ini adalah sebuah aplikasi manajemen data mahasiswa yang dibuat menggunakan Java dengan antarmuka grafis (GUI) menggunakan Java Swing. Tujuan utama dari program ini adalah memudahkan pengguna dalam melakukan operasi dasar CRUD (Create, Read, Update, Delete) terhadap data mahasiswa. Program ini memungkinkan pengguna untuk melakukan berbagai operasi seperti menambahkan, mengubah, dan menghapus data mahasiswa, serta melihat daftar mahasiswa yang tersimpan dalam database.

## Desain Program

### Class Mahasiswa
Kelas ini bertanggung jawab untuk merepresentasikan entitas mahasiswa dalam sistem. Setiap objek dari kelas Mahasiswa memiliki atribut seperti NIM, nama, jenis kelamin, dan program studi. Kelas ini juga menyediakan metode setter dan getter untuk mengakses dan mengubah nilai atribut mahasiswa.

### Class Menu
Kelas Menu adalah kelas utama yang mengatur tampilan utama aplikasi dan berinteraksi dengan pengguna. Kelas ini memiliki fungsi main sebagai entry point aplikasi. Selain itu, kelas ini juga bertanggung jawab untuk membuat antarmuka pengguna menggunakan Java Swing, termasuk tombol, tabel, dan field input. Kelas Menu juga mengatur aliran data antara GUI dan kelas lainnya seperti Mahasiswa.

Berikut adalah beberapa fungsi yang dimiliki oleh kelas Menu:
- `insertData()`: Menambahkan data mahasiswa ke dalam tabel.
- `updateData()`: Mengubah data mahasiswa yang sudah ada dalam tabel.
- `deleteData()`: Menghapus satu baris data mahasiswa dari tabel.
- `clearForm()`: Mengosongkan isian pada formulir tabel.

## Alur Program CRUD dengan Database

1. **Koneksi Database**:
   - Saat program dimulai, koneksi dengan database dibuat menggunakan JDBC (Java Database Connectivity).
   - Informasi koneksi seperti URL, username, dan password disimpan dalam konfigurasi atau langsung diinisialisasi dalam kode.

2. **Create/ Insert  (Tambah Data)**:
   - Ketika pengguna mengisi formulir dengan data mahasiswa baru dan menekan tombol "Add", data tersebut diambil dari GUI.
   - Data yang diambil kemudian disimpan ke dalam tabel di database menggunakan perintah SQL INSERT.
   - Setelah data berhasil ditambahkan ke database, tampilan tabel pada antarmuka pengguna diperbarui untuk menampilkan data baru.

3. **Read (Baca Data)**:
   - Ketika program dimulai, aplikasi melakukan kueri SELECT ke database.
   - Hasil kueri tersebut berupa daftar mahasiswa yang kemudian ditampilkan dalam bentuk tabel pada antarmuka pengguna.

4. **Update (Ubah Data)**:
   - Saat pengguna memilih sebuah entri dalam tabel dan menekan tombol "Ubah", program mengambil data terpilih dari tabel.
   - Data tersebut ditampilkan kembali dalam formulir untuk memungkinkan pengguna melakukan perubahan.
   - Setelah pengguna mengubah data dan menekan tombol "Update", perintah SQL UPDATE dikirimkan ke database untuk memperbarui data.
   - jika inputan data saat update ada yang kosong maka akan menampilkan "data tidak boleh kosong", namun jika inputan data berhasil maka akan menampilkan "Data berhasil diubah",
   - Tampilan tabel pada antarmuka pengguna diperbarui untuk mencerminkan perubahan yang dilakukan.

5. **Delete (Hapus Data)**:
   - Ketika pengguna memilih sebuah entri dalam tabel dan menekan tombol "Delete", program mengambil data terpilih dari tabel.
   - Data tersebut kemudian dihapus dari database menggunakan perintah SQL DELETE.
   - Setelah data dihapus, tampilan tabel pada antarmuka pengguna diperbarui untuk menghilangkan entri yang dihapus.

### Keterangan Tambahan

- Dalam setiap langkah CRUD, program juga dapat menangani validasi data untuk memastikan keakuratan dan kelengkapan informasi yang dimasukkan oleh pengguna.
- Penggunaan prepared statements dalam JDBC dapat membantu mencegah serangan SQL injection dan meningkatkan keamanan aplikasi.
- Koneksi ke database biasanya dibuka saat program dimulai dan ditutup saat program berakhir atau saat koneksi tidak lagi diperlukan untuk menghindari kebocoran sumber daya (resource leak).

### Dokumentasi Program
