#include <iostream.h>
#include <conio.h>
struct TNode{
char data[15];
TNode *next;
};
TNode *head;
int opsi = 0;
void init(){
head = NULL;
}
bool isEmpty(){
if (head ==NULL) return true;
else return false;
}
void tambahdepan(){
TNode *baru;
baru = new TNode;
cout << "Masukkan DATA : ";
cin >> baru-> data;
baru->next = NULL;
clrscr();
if(isEmpty()==true){
head=baru;
head->next = NULL;
}else {
baru->next = head;
head = baru;
}
}
void tambahbelakang(){
TNode *baru,*bantu;
baru = new TNode;
cout << "Masukkan DATA  : ";
cin >> baru-> data;
baru->next = NULL;
clrscr();
if(isEmpty()== true){
head=baru;
head->next = NULL;
} else {
bantu=head;
while(bantu->next!=NULL){
bantu=bantu->next;
}
bantu->next = baru;
}
}
void tambahtengah(){
TNode *baru, *bantu;
int posisiSisip;
if(isEmpty()== false){
cout<<"Akan disisip setelah Data Ke ? : "; cin>>posisiSisip;
bantu=head;
baru=new TNode;
for(int i=1;i<posisiSisip;i++){
if(bantu->next!=NULL)
bantu=bantu->next;
else break;
}
cout << "Masukkan DATA  : ";
cin >> baru-> data;
baru->next=bantu->next;
bantu->next=baru;
clrscr();
}
else cout<<"Mau Menyisipkan tengah Belum ada data !! …silahkan masukkan Data terlebih dahulu";
}
void hapusdepan() {
TNode *hapus;
if (isEmpty() == false){
if(head->next !=NULL){
hapus = head;
head = head->next;
delete hapus;
clrscr();
} else {
head = NULL;
}
}else {
cout<<"Data anda masih kosong !!!!\n";
}
}
void hapusbelakang(){
TNode *hapus, *bantu;
if (isEmpty()==false){
if(head->next !=NULL){
bantu = head;
while(bantu->next->next!=NULL){
bantu = bantu->next;
}
hapus = bantu->next;
bantu->next = NULL;
delete hapus;
clrscr();
} else {
head = NULL;
}
} else {
cout<<"Data anda masih kosong !!!!\n";
}
}
void hapustengah(){
int banyakdata,posisiSisip,poshapus;
TNode *hapus, *bantu;
if(isEmpty()== false){
cout<<" Akan dihapus pada data ke : "; cin>>posisiSisip;
banyakdata=1;
bantu=head;
while(bantu->next!=NULL)
{
bantu=bantu->next;
banyakdata++;
}
if((posisiSisip<1)||(posisiSisip>banyakdata)){
cout<<"Belum ada data !! …silahkan masukkan Data terlebih dahulu..\n";
}else {
bantu=head;
poshapus=1;
while(poshapus<(posisiSisip-1))
{
bantu=bantu->next;
poshapus++;
}
hapus=bantu->next;
bantu->next=hapus->next;
delete hapus;
clrscr();
}
}
else cout<<"Data Masih kosong, tidak bisa hapus data dari tengah! ";
}
void display(){
clrscr();
TNode *bantu;
bantu = head;
if(isEmpty()==true){
cout<<"Data masih kosong\n";
} else {
cout<<endl<<"DATA LINKED LIST\n";
while(bantu!=NULL){
cout<<"--------------- "<<endl;
cout<<"DATA    : " << bantu->data << " ";
cout<<endl;
bantu=bantu->next;
cout<<"--------------- "<<endl;
}
cout<<endl;
}
}
void main(){
int();
do{
cout<<endl;
cout<<endl;
cout<<endl;
cout<<"-----------MENU PILIHAN--------------"   <<endl;
cout<<endl;

cout<<"1. Tambah Simpul dari Depan."   <<endl;
cout<<"2. Tambah Simpul dari Belakang."   <<endl;
cout<<"3. Tambah Simpul dari Tengah."   <<endl;
cout<<"4. Hapus Simpul dari Depan."   <<endl;
cout<<"5. Hapus Simpul dari Belakang."   <<endl;
cout<<"6. Hapus Simpul dari Tengah."   <<endl;
cout<<"7. Tampil Data."   <<endl;
cout<<"8. Keluar."   <<endl;
cout<<endl;
cout<< "Pilihan Menu : ";
cin >> opsi;
switch(opsi){
case 1 : tambahdepan();break;
case 2 : tambahbelakang();break;
case 3 : tambahtengah();break;
case 4 : hapusdepan();break;
case 5 : hapusbelakang();break;
case 6 : hapustengah();break;
case 7 : display();break;
}
}while (opsi != 8);
}