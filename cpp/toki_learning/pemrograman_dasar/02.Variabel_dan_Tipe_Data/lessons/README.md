# Bagian 1
# Konsep Variabel
#### Perkenalan Variabel
> Variabel merupakan istilah yang diadopsi dari dunia matematika, yang
memetakan sebuah nama ke suatu nilai.

Setiap kali suatu variabel digunakan dalam ekspresi
matematika, yang diacu sebenarnya adalah nilai yang
dipetakan oleh nama variabel tersebut.

#### Aturan Penamaan Variabel
• Terdiri dari kombinasi karakter huruf, angka, dan underscore.

• Tidak boleh dimulai dengan angka.

• Huruf kapital dan huruf kecil dianggap berbeda. 

• Tidak boleh merupakan *reserved word*. Contoh reserved word
pada C++: **int**, **if**, **while**, **for**, atau **switch**.

#### Assignment
> Assignment merupakan pengisian nilai yang diacu oleh variabel dengan suatu nilai.

• Operator untuk assignment adalah =

• Isikan ruas kiri dengan nama suatu variabel, dan ruas kanan
dengan nilai yang ingin diisikan ke variabel tersebut.

• Tipe data dari variabel dan nilai yang diacu harus sesuai.

#### Sekilas Tentang printf
• Untuk pencetakan, digunakan perintah berikut:
printf("Nilai = %d\n", x);

• Untuk mencetak nilai dari variabel, diperlukan simbol

• Variabel-variabel untuk menggantikan simbol sementara perlu
dituliskan sesudah pola cetakan.

# Bagian 2
#### Tipe Data: Bilangan Bulat
| Nama   | Jangkauan | Ukuran |
| :----: | :----:    | :----: |
| short | -2^15 ..2^15 -1 | 2 byte |
| unsigned short | 0..2^16 -1 | 2 byte |
| int | -2^31..2^31 -1 | 4 byte |
| unsigned int | 0..2^32 -1| 4 byte |
| long long | -2^63..2^63 -1 | 8 byte |
| unsigned long long |0..2^64 -1 | 8 byte |

Dalam memprogram, yang umum digunakan adalah int dan long long.

#### Tipe Data Bilangan Riil
| Nama   | Jangkauan | Akurasi | Ukuran |
| :----: | :----:    | :----: | :----: |
| float | 1.5 x 10^-45 ..3.4 x 10^38 | 7-8 digit | 4 byte |
| double | 5.0 x 10^-324 ..1.7 x 10^308 | 15-16 digit | 8 byte |

• Biasa disebut dengan floating point.

• Tipe data floating point bisa merepresentasikan negatif atau positif dari magnitudonya.

• Pada pemrograman, umumnya tipe data floating point dihindari karena kurang akurat. Representasi 3 pada floating point bisa jadi 2.99999999999999 atau 3.000000000000001
karena keterbatasan pada struktur penyimpanan bilangan pecahan pada komputer.

• Tipe yang umum digunakan adalah **double**.

#### Tipe Data Karakter
• Merupakan tipe data untuk merepresentasikan karakter menurut ASCII (American Standart Code for Information Interchange).

• Dalam ASCII, terdapat 128 karakter yang direpresentasikan dengan angka dari 0 sampai 127.

• Misalnya, kode ASCII untuk karakter spasi (’ ’) adalah 32, huruf ’A’ adalah 65, ’B’ adalah 66, huruf ’a’ adalah 97, dan huruf ’b’ adalah 98.

• Pada C++, tipe data ini dinyatakan sebagai char, dengan ukuran 1 byte.

#### Tipe Data Boolean
• Merupakan tipe data yang menyimpan nilai kebenaran, yaitu hanya TRUE atau FALSE.

• Tipe data ini akan lebih terasa kebermanfaatannya ketika kita sudah mempelajari struktur percabangan dan array.

#### Deklarasi Variabel
• Deklarasi variabel adakah aktivitas mendaftarkan nama-nama dan tipe variabel yang akan digunakan.

• Pada saat dideklarasi, setiap variabel perlu disertakan tipe datanya.

• Pada C++, variabel dapat dideklarasikan di luar atau di dalam blok program.

• Apabila variabel dideklarasikan di luar blok program, artinya variabel tersebut bersifat global.

• Tipe data dituliskan sebelum nama variabel, dipisahkan oleh spasi.

• Beberapa variabel juga bisa dideklarasikan secara bersamaan jika memiliki tipe data yang sama.

#### Simbol Variabel pada printf
Berikut tabel beserta simbolnya.
| Nama   | Simbol |
| :----: | :----:    |
| short | %d |
| unsigned short | %u | 
| int | %d |
| unsigned int | %u | 
| long long | %lld atau %I64d | 
| unsigned long long | %llu atau %I64u |
| float | %F |
| double | %lf | 
| char | %c |

• Untuk boolean, Anda dapat menggunakan %d yang akan mencetak 1 apabila TRUE atau 0 apabila FALSE.

• Khusus untuk long long, simbolnya bergantung pada sistem operasi yang digunakan.

#### Tipe Data Komposit Struct
• Struct dapat dideklarasikan di luar blok program utama.
struct <nama_struct> {
  <tipe_1> <variabel_1>;
  <tipe_2> <variabel_2>;
  ...
};

• Setelah dideklarasikan, sebuah tipe data <nama struct> sudah bisa digunakan.
  
• Untuk mengakses nilai dari <variabel 1> dari suatu variabel bertipe struct, gunakan tanda titik (.).

#### Konsumsi Memori Struct
• Memori yang dibutuhkan bagi sebuah tipe data struct bisa dianggap sama dengan jumlah memori variabel-variabel yang menyusunnya.

• Artinya, struct bernama titik pada contoh titik.pas mengkonsumsi memori yang sama dengan dua buah longint, yaitu 8 byte.

• Perhitungan ini hanya perkiraan saja, sebab konsumsi memori yang sesungguhnya sulit dilakukan.

#### Ordinalitas
• Suatu tipe data memiliki sifat ordinal jika untuk suatu elemennya, kita bisa mengetahui secara pasti apa elemen sebelum atau selanjutnya.

• Dengan demikian, seluruh tipe data bilangan bulat dan karakter adalah tipe data ordinal.

• Kebalikannya, suatu tipe data dinyatakan memiliki sifat non-ordinal jika kita tidak bisa menentukan elemen sebelum dan sesudahnya.

• Bilangan floating point termasuk dalam tipe data non-ordinal.
