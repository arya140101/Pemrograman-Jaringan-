#include <iostream.h> //File Header Iostream
#include <conio.h> //File Header Conio
#include <stdio.h>

struct TNode { //Deklarasi Linked List
int data;   //data bertipe integer
TNode *next;
};  //penutup deklarasi
TNode *head, *tail;  //disini menggunakan head sebagai pointer utama dari linked list

void init(){  //Fungsi untuk inisialisasi awal linked list
head = NULL;
tail = NULL;  //Untuk pertama kali, head bernilai NULL
}

int isEmpty(){  //Fungsi untuk mengetahui apakah Linked list kosong atau ada isinya
if(tail == NULL) return 1;
else return 0;
}

void insertDepan(int databaru){
TNode *baru;
baru = new TNode;
baru->data = databaru;
baru->next = NULL;
if(isEmpty()==1){
head=tail=baru;
tail->next=NULL;
}
else {
baru->next = head;
head = baru;
}
printf("Data masuk\n");
}

void tambahTengah(int databaru){
TNode *baru,*bantu;
baru = new TNode;
baru->data = databaru;
baru->next = NULL;
if(isEmpty()==1){
head=baru;
tail=baru;
tail->next = NULL;
}
else {
tail->next = baru;
tail=baru;
}
printf("Data masuk\n");
}


void tambahBelakang(int databaru){
TNode *baru,*bantu;
baru = new TNode;
baru->data = databaru;
baru->next = NULL;
if(isEmpty()==1){
head=baru;
tail=baru;
tail->next = NULL;
}
else {
tail->next = baru;
tail=baru;
}
printf("Data masuk\n");
}

void hapusDepan(){
TNode *hapus;
int d;
if (isEmpty()==0){
if(head!=tail){
hapus = head;
d = hapus->data;
head = head->next;
delete hapus;
} else {
d = tail->data;
head=tail=NULL;
}
printf("%d terhapus\n",d);
} else printf("Masih kosong\n");
}

void hapusTengah(){
TNode *bantu,*hapus;
int d;
if (isEmpty()==0){
if(head!=tail){
hapus = bantu;
d = hapus->data;
head = head->next;
delete hapus;
} else {
d = tail->data;
head=tail=NULL;
}
printf("%d terhapus\n",d);
} else printf("Masih kosong\n");
}

void hapusBelakang(){
TNode *bantu,*hapus;
int d;
if (isEmpty()==0){
bantu = head;
if(head!=tail){
while(bantu->next!=tail){
bantu = bantu->next;
}
hapus = tail;
tail=bantu;
d = hapus->data;
delete hapus;
tail->next = NULL;
}else {
d = tail->data;
head=tail=NULL;
}
cout<<d<<" terhapus\n";
} else cout<<"Masih kosong\n";
}

void clear()
{
TNode *bantu,*hapus;
bantu = head;
while(bantu!=NULL)
{
hapus = bantu;
bantu = bantu->next;
delete hapus;
}
head = NULL;
tail = NULL;
}

void tampil(){   //Fungsi untuk menampilkan linked list yang telah di input / di delete
TNode *bantu;  //pointer yang digunakan yaitu bantu
bantu=head;  // Nilai bantu= Nilai yang ada di head
if(isEmpty()==0){  // periksa apakah return 0(bernilai)
while(bantu!=NULL){ //Selama bantu tidak sama dengan NULL, maka di eksekusi
cout<<bantu->data<<endl;  // tampilkan di monitor nilai bantu->data
bantu=bantu->next;  //Nilai bantu= nilai bantu selanjutnya
}
}
else
cout<<"Masih Kosong"<<endl;
}

main(){  // Fungsi Utama dari program
int pil;
do{
clrscr();
int n;
cout<<"================================="<<endl;
cout<<"\t Menu Pilihan\t\t"<<endl;
cout<<"================================="<<endl;
cout<<endl;
cout<<"1.Insert Depan"<<endl;
cout<<"2.Insert Tengah"<<endl;
cout<<"3.Insert Belakang"<<endl;
cout<<"4.Display"<<endl;
cout<<"5.Delete Depan"<<endl;
cout<<"6.Delete Tengah"<<endl;
cout<<"7.Delete Belakang"<<endl;
cout<<"8.Hapus Semua"<<endl;
cout<<"9.Exit"<<endl;
cout<<endl;
cout<<"Masukan Pilihan Anda :";pil=getche();
switch(pil){
case '1' : clrscr();
cout<<"Masukan data :";cin>>n;
isEmpty();
insertDepan(n);
break;
case '2': clrscr();
cout<<"Masukan data :";cin>>n;
isEmpty();
tambahBelakang(n);
break;
case '3': clrscr();
cout<<"Masukan data :";cin>>n;
isEmpty();
tambahBelakang(n);
break;
case '4': clrscr();
isEmpty();
tampil();
break;
case '5': clrscr();
isEmpty();
hapusDepan();
break;
case '6': clrscr();
isEmpty();
hapusTengah();
break;
case '7': clrscr();
isEmpty();
hapusBelakang();
break;
case '8':clrscr();
clear();
}
getch();
}while(pil!='9');
return 0;
}