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

## Dokumentasi Program

1. Insert data yang sudah ada nim nya 
<img width="516" alt="yang sudah ada nim nya" src="https://github.com/Nurainunlubis/TP2DPBO2024C1/assets/113582460/f7c61c62-8d64-400b-8dce-8246a780b965">

2.  Show massage 
<img width="512" alt="show massage nim sudah ada" src="https://github.com/Nurainunlubis/TP2DPBO2024C1/assets/113582460/03368102-7845-46ac-9d3f-e1543c79940f">

3. Insert data kosong
<img width="516" alt="input data kosong" src="https://github.com/Nurainunlubis/TP2DPBO2024C1/assets/113582460/58a5bb1b-1100-453b-9894-3a30f782776d">

4. Show Massage data kosong
<img width="514" alt="data tidak boleh kosong" src="https://github.com/Nurainunlubis/TP2DPBO2024C1/assets/113582460/3064c809-baa8-4378-85d7-9b47f693237e">

5. Insert Data
<img width="516" alt="insert data" src="https://github.com/Nurainunlubis/TP2DPBO2024C1/assets/113582460/bf426900-1ed8-48ec-9a23-e8668b617b83">

6. Data berhasil ditambahkan
<img width="512" alt="data berhasil ditambahkan" src="https://github.com/Nurainunlubis/TP2DPBO2024C1/assets/113582460/c2a0665a-405f-4644-8e63-eb883d565052">

7.Update data kosong
<img width="517" alt="update data kosong" src="https://github.com/Nurainunlubis/TP2DPBO2024C1/assets/113582460/dcb879b0-a8b4-4331-a53d-934af4de0acc">

8. Update data
<img width="512" alt="update data" src="https://github.com/Nurainunlubis/TP2DPBO2024C1/assets/113582460/ba9d9ef3-5952-431e-a27c-4be9fbbf1abd">

9. Show massage update
<img width="518" alt="data berhasil di ubah" src="https://github.com/Nurainunlubis/TP2DPBO2024C1/assets/113582460/e6d74a58-76bf-4331-af27-a99696fbac3d">

10. konfirmasi hapus data
<img width="511" alt="konfimasi hapus data" src="https://github.com/Nurainunlubis/TP2DPBO2024C1/assets/113582460/90954ee4-7e2f-45cf-bd5f-d1e62ee22cae">

11. Show massage delete
<img width="513" alt="data berhasil dihapus" src="https://github.com/Nurainunlubis/TP2DPBO2024C1/assets/113582460/f916da61-be1a-4846-b41a-953043fea780">




