daftar_input =input('masukan list bilangan bulat, pisahkan dengan tanda koma. contoh: -3,-2,-1,dst : ')
list_angka = daftar_input.split(',')
daftar_baru = [int(x) for x in list_angka]

jumlah = 0
for angka in daftar_baru:
    jumlah += angka
rata_rata = jumlah / len(daftar_baru)

print('Nilai rata-rata: {}'.format(rata_rata))
print('penjumlahan: {}'.format(jumlah)),