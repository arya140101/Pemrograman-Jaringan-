use Normalisasi_19205002_Azarya_Divino;

create table utama_Mahasiswa_Azarya_Divino_19205002(
	NIM CHAR(10),
	NAMA_MHS VARCHAR(50),
	JURUSAN CHAR(2),
	FAKULTAS VARCHAR(20),
	KODE_MK CHAR(4),
	NAMA_MK VARCHAR(50),
	KODE_DSN CHAR(4),
	NAMA_DSN VARCHAR(50),
	RUANG CHAR(3),
	NILAI CHAR(2),
);

--memasukan data
INSERT INTO utama_Mahasiswa_Azarya_Divino_19205002 (NIM,NAMA_MHS,JURUSAN,FAKULTAS,KODE_MK,NAMA_MK,KODE_DSN,NAMA_DSN,RUANG,NILAI) VALUES 
('19205002','Azarya Divino','TI','Teknologi','STK','Statistika','28','Lela Nurlaela. ST., M.Kom','24','A'),
('19205002','Azarya Divino','TI','Teknologi','TBO','Teori Bahasa & Automata','182','Ahmad Fitriansyah, M.Kom','25','A'),
('19205002','Azarya Divino','TI','Teknologi','KMN','Keamanan Komputer','136','Zami Satria, S.Kom','26','A'),
('19205003','Ivan Julian','SI','E. Bussines','STK','Statistika','28','Lela Nurlaela. ST., M.Kom','27','B+'),
('19205003','Ivan Julian','SI','E. Bussines','TBO','Teori Bahasa & Automata','182','Ahmad Fitriansyah, M.Kom','28','A');


--menampilkan data
select * from utama_Mahasiswa_Azarya_Divino_19205002;

create table mahasiswa(
 
 	NIM CHAR(10),
	NAMA_MHS VARCHAR(50),
	JURUSAN CHAR(2),
	FAKULTAS VARCHAR(20),
	primary key (NIM)
);

--menampilkan data
select * from mahasiswa;

INSERT INTO mahasiswa (NIM,NAMA_MHS,JURUSAN,FAKULTAS) VALUES 
('19205002','Azarya Divino','TI','Teknologi'),('19205003','Ivan Julian','SI','E. Bussines');

create table MatKul(
 
 	KODE_MK CHAR(4),
	NAMA_MK VARCHAR(50),
	KODE_DSN CHAR(4),
	primary key (KODE_MK)
);
INSERT INTO MatKul (KODE_MK,NAMA_MK,KODE_DSN) VALUES 
('STK','Statistika','28'),
('TBO','Teori Bahasa & Automata','182'),
('KMN','Keamanan Komputer','136');

--menampilkan data
select * from MatKul;

create table NILAI(
 
 	NIM CHAR(10),
	KODE_MK CHAR(4),
	RUANG CHAR(3),
	NILAI CHAR(2)
);

INSERT INTO NILAI (NIM,KODE_MK,RUANG,NILAI) VALUES 
('19205002','STK','24','A'),
('19205002','TBO','25','A'),
('19205002','KMN','26','A'),
('19205003','STK','27','B+'),
('19205003','TBO','28','A');

--menampilkan data
select * from NILAI;

create table dosen(

	KODE_DSN CHAR(4),
	NAMA_DSN VARCHAR(50),
	primary key (KODE_DSN)

);

INSERT INTO dosen
(KODE_DSN,NAMA_DSN) VALUES 
('28','Lela Nurlaela. ST., M.Kom'),
('182','Ahmad Fitriansyah, S.Kom, M.Kom'),
('136','Zami Satria, S.Kom');

--menampilkan data
select * from dosen;

--relasi (nilai-mahasiswa)
ALTER TABLE NILAI
ADD CONSTRAINT FKmahasiswa foreign key (NIM)
REFERENCES mahasiswa (NIM);

--relasi (MatKul - dosen)
ALTER TABLE MatKul
ADD CONSTRAINT FKdosen foreign key (KODE_DSN)
REFERENCES dosen (KODE_DSN);

--relasi (NILAI - MatKul)
ALTER TABLE NILAI
ADD CONSTRAINT FKMatKul foreign key (KODE_MK)
REFERENCES MatKul (KODE_MK);