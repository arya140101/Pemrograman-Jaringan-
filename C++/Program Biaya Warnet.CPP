#include<iostream.h>
#include<conio.h>
#include<stdio.h>

main() {
	//Inisialisasi variabel
   char nama[30];
	int lama, harga, tambahan, jam_berikutnya,no_urut_komputer;

   cout<<"\t	===============================	"<<endl;
	cout<<"\t	PROGRAM MENGHITUNG BIAYA WARNET	"<<endl;
   cout<<"\t	===============================	"<<endl;
   cout<<endl;
	cout<<"Nama Urut Komputer: 		   ";cin>>no_urut_komputer;
	cout<<"Nama Pengguna:			   ";gets(nama);

   harga=3500;
   tambahan=3000;

	cout<<"Lama Pemakaian Komputer (Per Jam): ";cin>>lama;

	if (lama>1){
		jam_berikutnya=((lama-1)*tambahan);
	}else {
		jam_berikutnya=0;
	}

   clrscr();

	cout<<"1 Jam Pertama  		  Rp."<<harga<<endl;
	cout<<"Jam Berikutnya 		  Rp."<<jam_berikutnya<<endl;
	cout<<"Total yang harus dibayar: Rp."<<harga+jam_berikutnya<<endl;

   cout<<"\n\n";

   getch();

}
