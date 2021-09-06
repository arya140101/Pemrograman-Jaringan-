#include<conio.h>
#include<stdio.h>
#include<iostream.h>

main()
{
long ppn;
char kode[3],nama[30],pembeli[30],input;
int harga,jumlah,total,jumbayar,kembalian,potongan;

  awal:
  clrscr();
    cout<<" 		 AGEMU STEAK 								"<<endl;
    cout<<" ******************************************"<<endl;
    cout<<" Input Nama Pembeli: 			";gets(pembeli);
    cout<<" Pilihan Steak Yang Tersedia : "<<endl;
    cout<<" A01 - Terdorlin 					"<<endl;
    cout<<" B01 - Sirloin "<<endl;
    cout<<" Steak Yang Dipilih: 			";cin>>kode;
    cout<<" Jumlah Beli: 				";cin>>jumlah;
      if
      	(strcmp(kode,"A01")==0) {
         strcpy(nama,"Terdorlin");
         harga=25000;
      }
      else if (strcmp(kode,"B01")==0) {
         strcpy(nama,"Sirloin");
         harga=20000;
      }
  	clrscr();
   cout<<" *****************************************"<<endl;
   cout<<" 		Struk AGEMU STEAK 							 "<<endl;
   cout<<" .........................................."<<endl;
   cout<<" Nama Es Krim: 		"<<nama<<endl;
   cout<<" Harga: 		Rp."<<harga<<endl;
   cout<<" Jumlah: 		"<<jumlah<<endl;
   total = harga*jumlah+ppn;
   ppn = total*0.1;
   cout<<" PPN 10%: 		Rp."<<ppn<<endl;
   cout<<" Total:			Rp."<<total+ppn<<endl;
   cout<<" __________________________________________"<<endl;
   cout<<" Uang Bayar: 		Rp.";cin>>jumbayar;
   kembalian=jumbayar-(total+ppn);
   cout<<" Uang Kembali:	  	Rp."<<kembalian<<endl;
   cout<<" ========================================="<<endl;
   if(jumbayar < (total+ppn))
         {
         	cout<<" Maaf Uang Anda Kurang"<<endl;
         }else if (jumbayar > (total+ppn))
         {
         	cout<<" Terima Kasih Selamat Datang Kembali"<<endl;
         }
   cout<<" Mau Input Lagi [Y/N]? : ";cin>>input;
      if (input=='Y'||input=='y')
      goto awal;
      else
      goto akhir;
      akhir:
}
