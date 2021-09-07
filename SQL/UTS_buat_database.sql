--create database __19205002_Azarya_Divino;

use __19205002_Azarya_Divino;

create table Mhs_Azarya_Divino(
NIM CHAR(10),
NAMA VARCHAR(50),
JNKEL CHAR(1),
HOBBY VARCHAR(30),
TELP VARCHAR(13),
TANGGAL_LAHIR DATE,
ALAMAT VARCHAR(100),
primary key (NIM)
);

create table Fakultas(
Kode_Fakultas CHAR(3),
Nama_Fakultas VARCHAR(50),
);
create table Jurusan(
Kode_Jurusan CHAR(2),
Nama_Jurusan varchar(50),
);

INSERT INTO Mhs_Azarya_Divino (NIM,NAMA,JNKEL,HOBBY,TELP,TANGGAL_LAHIR,ALAMAT) VALUES 
('19205002','Azarya Divino','L','Dengar Musik','08871202051','2001-01-14','Tangerang Selatan'),
('19205001','Asep Ruswanto','L','Futsal','088910281020','1998-07-19','Tanah Pasir'),
('19205003','Muhammad Wahib','L','Tenis','08281919201','2001-04-20','Kalideres');

INSERT INTO Fakultas (Kode_Fakultas,Nama_Fakultas) VALUES ('FT','Teknologi'),('FEB','E.Bussiness'),('FT','Teknologi');
INSERT INTO Jurusan(Kode_Jurusan,Nama_Jurusan) VALUES ('TI','Teknik Informatika'),('SI','Sistem Informasi'),('TI','Teknik Informatika');
