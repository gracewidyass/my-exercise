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
| short | -2 | 2 byte |
| unsigned short | | 2 byte |
| int | | 4 byte |
| unsigned int | | 4 byte |
| long long | | 8 byte |
| unsigned long long | | 8 byte |

Dalam memprogram, yang umum digunakan adalah int dan long long.

#### Tipe Data Bilangan Riil
| Nama   | Jangkauan | Akurasi | Ukuran |
| :----: | :----:    | :----: | :----: |
| float | -2 | 7-8 digit | 4 byte |
| double | | 15-16 digit | 8 byte |

• Biasa disebut dengan floating point.
• Tipe data floating point bisa merepresentasikan negatif atau positif dari magnitudonya.
• Pada pemrograman, umumnya tipe data floating point dihindari karena kurang akurat. Representasi 3 pada floating point bisa jadi 2.99999999999999 atau 3.000000000000001
karena keterbatasan pada struktur penyimpanan bilangan pecahan pada komputer.
• Tipe yang umum digunakan adalah **double**.

#### Tipe Data Karakter
