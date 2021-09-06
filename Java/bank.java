/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BANK;

/**
 *
 * @author Azarya Divino
 */
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class bank {

    Scanner sc = new Scanner(System.in);

    int saldoAwal = 10000000;
    int saldoAwal2 = 10000000;
    int saldoAwal3 = 10000000;

    int simpan;
    int simpan2;
    int simpan3;
    int tambahsaldo;
    int tambahsaldo2;
    int tambahsaldo3;
    int uangT;
    int uangT2;
    int uangT3;
    int saldoAkhir;
    int saldoAkhir2;
    int saldoAkhir3;
    int beliBayar;
    int beliBayar2;
    int beliBayar3;
    Tulis arya = new Tulis();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Tulis arya = new Tulis();
        arya.SetTulisString("=========================================================================================");
        arya.SetTulisString("||                                      SELAMAT DATANG                                 ||");
        arya.SetTulisString("||                                  BANK NASIONAL INDONESIA                            ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("=========================================================================================");
        arya.SetTulisString("Masukkan Pin Anda : ");
        int pin = sc.nextInt();

        if (pin == 9876) {
            arya.SetTulisString("Pin Anda benar !!");
            arya.SetTulisString("Joko Santoso : ");
            bank m = new bank();
            m.menu();
        }
        if (pin == 19205002) {
            arya.SetTulisString("Pin anda benar!!");
            arya.SetTulisString("Dadang Sudirman : ");
            bank m = new bank();
            m.menu2();
        }
        if (pin == 4321) {
            arya.SetTulisString("Pin Anda benar !!");
            arya.SetTulisString("Cecep Santoso : ");
            bank m = new bank();
            m.menu3();
        }
    }

    public void menu() {
        arya.SetTulisString("=========================================================================================");
        arya.SetTulisString("||                              SILAKAN MASUKAN PILIHAN TRANSAKSI                      ||");
        arya.SetTulisString("||                                      YANG ANDA INGINKAN                             ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||Pilihan Menu                                                                         ||");
        arya.SetTulisString("||<1> Cek Saldo                                                     <4> Penarikan Saldo||");
        arya.SetTulisString("||<2> Tambah saldo                                                           <5> Keluar||");
        arya.SetTulisString("||<3> Transfer                                                                         ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("=======================================================================================\n");
        arya.SetTulisString("Nasabah Yth: Joko Santoso\n");
        arya.SetTulisString("Masukkan Menu yang Anda Pilih : ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                cekSaldo();
                break;
            case 2:
                tambahsaldo();
                break;
            case 3:
                transfer();
                break;
            case 4:
                penarikansaldo();
                break;
            case 5:
                exit();
                break;
            default:
                arya.SetTulisString("Menu tidak ada.");
        }
    }

    public void menu2() {
        arya.SetTulisString("=========================================================================================");
        arya.SetTulisString("||                              SILAHKAN MASUKAN PILIHAN TRANSAKSI                     ||");
        arya.SetTulisString("||                                      YANG ANDA INGINKAN                             ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||Pilihan Menu                                                      <4> Penarikan Saldo||");
        arya.SetTulisString("||<1> Cek Saldo                                                              <5> Keluar||");
        arya.SetTulisString("||<2> Tambah saldo                                                                     ||");
        arya.SetTulisString("||<3> Transfer                                                                         ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("=======================================================================================\n");
        arya.SetTulisString("Nasabah Yth: Dadang Sudirman\n");
        arya.SetTulisString("Masukkan Menu yang Anda Pilih : ");
        int menu2 = sc.nextInt();

        switch (menu2) {
            case 1:
                cekSaldo2();
                break;
            case 2:
                tambahsaldo2();
                break;
            case 3:
                transfer2();
                break;
            case 4:
                penarikansaldo2();
                break;
            case 5:
                exit();
                break;
            default:
                arya.SetTulisString("Menu tidak ada.");
        }
    }

    public void menu3() {
        arya.SetTulisString("=========================================================================================");
        arya.SetTulisString("||                              SILAHKAN MASUKAN PILIHAN TRANSAKSI                     ||");
        arya.SetTulisString("||                                      YANG ANDA INGINKAN                             ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||Pilihan Menu                                                                         ||");
        arya.SetTulisString("||<1> Cek Saldo                                                     <4> Penarikan Saldo||");
        arya.SetTulisString("||<2> Tambah saldo                                                           <5> Keluar||");
        arya.SetTulisString("||<3> Transfer                                                                         ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("=======================================================================================\n");
        arya.SetTulisString("Nasabah Yth: Cecep Santoso\n");
        arya.SetTulisString("Masukkan Menu yang Anda Pilih : ");
        int menu3 = sc.nextInt();

        switch (menu3) {
            case 1:
                cekSaldo3();
                break;
            case 2:
                tambahsaldo3();
                break;
            case 3:
                transfer3();
                break;
            case 4:
                penarikansaldo3();
                break;
            case 5:
                exit();
                break;
            default:
                arya.SetTulisString("Menu tidak ada.");
        }
    }

    public void tambahsaldo() {

        arya.SetTulisString("Masukan Nominal untuk menambah saldo :");
        tambahsaldo = sc.nextInt();
        simpan = saldoAwal + tambahsaldo;
        simpan = tambahsaldo;
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        String m = kursIndonesia.format(simpan);
        System.out.println("Saldo anda sekarang adalah : " + m + " ");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||<1> Lanjutkan                                                                Exit <2>||");
        arya.SetTulisString("=========================================================================================");
        arya.SetTulisString("Masukkan Pilihan Anda : ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                menu();
                break;
            case 2:
                exit();
                break;
            default:
                arya.SetTulisString("Menu tidak ada");
        }
    }

    public void tambahsaldo2() {

        arya.SetTulisString("Masukan Nominal untuk menambah saldo :");
        simpan2 = saldoAwal2 + tambahsaldo2;
        tambahsaldo2 = sc.nextInt();
        simpan2 = tambahsaldo2;
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        String n = kursIndonesia.format(simpan2 + saldoAwal2);
        arya.SetTulisString("Saldo anda sekarang adalah : " + n + " ");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||<1> Lanjutkan                                                                Exit <2>||");
        arya.SetTulisString("=========================================================================================");
        arya.SetTulisString("Masukkan Pilihan Anda : ");
        int menu2 = sc.nextInt();

        switch (menu2) {
            case 1:
                menu2();
                break;
            case 2:
                exit();
                break;
            default:
                arya.SetTulisString("Menu tidak ada");
        }
    }

    public void tambahsaldo3() {

        arya.SetTulisString("Masukan Nominal untuk menambah saldo :");
        tambahsaldo3 = saldoAwal3 + tambahsaldo3;
        tambahsaldo3 = sc.nextInt();
        simpan3 = tambahsaldo3;
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        String o = kursIndonesia.format(simpan3 + saldoAwal3);
        arya.SetTulisString("Saldo anda sekarang adalah : " + o + " ");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||<1> Lanjutkan                                                                Exit <2>||");
        arya.SetTulisString("=========================================================================================");
        arya.SetTulisString("Masukkan Pilihan Anda : ");
        int menu3 = sc.nextInt();

        switch (menu3) {
            case 1:
                menu3();
                break;
            case 2:
                exit();
                break;
            default:
                arya.SetTulisString("Menu tidak ada");
        }

    }

    public void cekSaldo() {
        arya.SetTulisString("=========================================================================================");
        arya.SetTulisString("||                          SILAHKAN MASUKAN PILIHAN TRANSAKSI                         ||");
        arya.SetTulisString("||                                  YANG ANDA INGINKAN                                 ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||           Nama Nasabah  : Joko Santoso                                              ||");
        arya.SetTulisString("||           Nomor Pin     : 9876                                                      ||");
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        String a = kursIndonesia.format(saldoAwal + tambahsaldo);
        arya.SetTulisString("||           Nominal Saldo : " + a + "                                                 ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||<1> Kembali Ke Menu                                                          Exit <2>||");
        arya.SetTulisString("=========================================================================================");
        arya.SetTulisString("Masukkan Pilihan Anda : ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                menu();
                break;
            case 2:
                exit();
                break;
            default:
                arya.SetTulisString("Menu tidak ada");
        }
    }

    public void cekSaldo2() {
        arya.SetTulisString("=========================================================================================");
        arya.SetTulisString("||                          SILAHKAN MASUKAN PILIHAN TRANSAKSI``````                   ||");
        arya.SetTulisString("||                                  YANG ANDA INGINKAN                                 ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||           Nama Nasabah  : Dadang Sudirman                                           ||");
        arya.SetTulisString("||           Nomor Pin     : 19205002                                                      ||");
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        String b = kursIndonesia.format(saldoAwal2 + simpan2);
        arya.SetTulisString("||           Nominal Saldo : " + b + "                                                 ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||<1> Kembali Ke Menu                                                          Exit <2>||");
        arya.SetTulisString("=========================================================================================");
        arya.SetTulisString("Masukkan Pilihan Anda : ");
        int menu2 = sc.nextInt();

        switch (menu2) {
            case 1:
                menu2();
                break;
            case 2:
                exit();
                break;
            default:
                arya.SetTulisString("Menu tidak ada");
        }
    }

    public void cekSaldo3() {
        arya.SetTulisString("=========================================================================================");
        arya.SetTulisString("||                          SILAHKAN MASUKAN PILIHAN TRANSAKSI``````                   ||");
        arya.SetTulisString("||                                  YANG ANDA INGINKAN                                 ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||           Nama Nasabah  : Cecep Susanto                                             ||");
        arya.SetTulisString("||           Nomor Pin     : 4321                                                      ||");
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        String c = kursIndonesia.format(saldoAwal3 + simpan3);
        arya.SetTulisString("||           Nominal Saldo : " + c + "                                                 ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||                                                                                     ||");
        arya.SetTulisString("||<1> Kembali Ke Menu                                                          Exit <2>||");
        arya.SetTulisString("=========================================================================================");
        arya.SetTulisString("Masukkan Pilihan Anda : ");

        int menu3 = sc.nextInt();

        switch (menu3) {
            case 1:
                menu3();
                break;
            case 2:
                exit();
                break;
            default:
                arya.SetTulisString("Menu tidak ada");
        }
    }

    public void transfer() {
        if (saldoAwal < 50000) {
            arya.SetTulisString("||Maaf saldo anda kurang dari Rp. 50.000, silakan lakukan pengisian saldo||");
        } else {
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("||                              SILAKAN MASUKAN PILIHAN TRANSAKSI                      ||");
            arya.SetTulisString("||                                      YANG ANDA INGINKAN                             ||");
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("Masukan Nominal Transfer yang anda inginkan :                                            ");
            int uangT = sc.nextInt();
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("||                            Pilih Bank Tujuan Transfer Anda :                        ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||<1> Mandiri                                                                   BCA <2>||");
            arya.SetTulisString("||<3> BTN                                                                       BNI <4>||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("=========================================================================================");

            int bank = sc.nextInt();
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("||                          Uang yang akan ditransfer sebesar :                        ||");
            DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');
            kursIndonesia.setDecimalFormatSymbols(formatRp);
            String a = kursIndonesia.format(uangT);
            arya.SetTulisString("||                                    " + a + "                                   ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||                       Apakah jumlah yang anda masukkan sudah benar?                 ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||<1>Ya                                                                       Tidak <2>||");
            arya.SetTulisString("=========================================================================================");
            int uangP = sc.nextInt();

            if (uangP == 1) {
                if (uangT < saldoAwal) {

                    saldoAwal = saldoAwal - uangT;
                    arya.SetTulisString("Masukan No. Rekening yang ingin ditransfer : ");
                    int pilih = sc.nextInt();

                    switch (pilih) {
                        case 19205002:
                            arya.SetTulisString("=================================================================================");
                            arya.SetTulisString("                               No. Rek Tujuan : " + pilih + "                                                       ");
                            arya.SetTulisString("                               Nama Nasabah : Dadang Sudirman                                                    ");
                            arya.SetTulisString("                               Nominal Transfer : " + a + "                                                   ||");
                            arya.SetTulisString("||                                  Transaksi Berhasil                         ||");
                            arya.SetTulisString("||                                     Terima Kasih                            ||");
                            arya.SetTulisString("=================================================================================");
                            break;
                        case 4321:
                            arya.SetTulisString("=================================================================================");
                            arya.SetTulisString("                               No. Rek Tujuan : " + pilih + "                                                       ");
                            arya.SetTulisString("                               Nama Nasabah : Cecep Susanto                                                     ");
                            arya.SetTulisString("                               Nominal Transfer : " + a + "                                                   ||");
                            arya.SetTulisString("||                                  Transaksi Berhasil                         ||");
                            arya.SetTulisString("||                                     Terima Kasih                            ||");
                            arya.SetTulisString("=================================================================================");
                            break;
                        default:
                            arya.SetTulisString("********************************No. rekening tidak ada***************************");
                    }
                    arya.SetTulisString("=========================================================================================");
                    arya.SetTulisString("||<1> Menu Utama                                                               Exit <2>||");
                    arya.SetTulisString("=========================================================================================");
                    arya.SetTulisString("Masukkan pilihan anda : ");
                    int selesai1 = sc.nextInt();
                    if (selesai1 == 1) {
                        menu();
                    } else {
                        exit();
                    }
                } else {
                    arya.SetTulisString("Maaf saldo anda tidak mencukupi");
                }
            } else {
                exit();
            }
        }
    }

    public void transfer2() {
        if (saldoAwal2 < 50000) {
            arya.SetTulisString("||Maaf saldo anda kurang dari Rp. 50.000, silakan lakukan pengisian saldo||");
        } else {
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("||                              SILAKAN MASUKAN PILIHAN TRANSAKSI                      ||");
            arya.SetTulisString("||                                      YANG ANDA INGINKAN                             ||");
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("Masukan Nominal Transfer yang anda inginkan :                                            ");
            int uangT2 = sc.nextInt();
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("||                            Pilih Bank Tujuan Transfer Anda :                        ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||<1> Mandiri                                                                   BCA <2>||");
            arya.SetTulisString("||<3> BTN                                                                       BNI <4>||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("=========================================================================================");
            int bank2 = sc.nextInt();
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("||                          Uang yang akan ditransfer sebesar :                        ||");
            DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');
            kursIndonesia.setDecimalFormatSymbols(formatRp);
            String b = kursIndonesia.format(uangT2);
            arya.SetTulisString("||                                    " + b + "                                   ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||                       Apakah jumlah yang anda masukkan sudah benar?                 ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||<1>Ya                                                                       Tidak <2>||");
            arya.SetTulisString("=========================================================================================");
            int uangP2 = sc.nextInt();

            if (uangP2 == 1) {
                if (uangT2 < saldoAwal2) {

                    saldoAwal2 = saldoAwal2 - uangT2;
                    arya.SetTulisString("Masukan No. Rekening yang ingin ditransfer : ");
                    int pilih = sc.nextInt();

                    switch (pilih) {
                        case 9876:
                            arya.SetTulisString("=================================================================================");
                            arya.SetTulisString("                               No.Rek Tujuan : " + pilih + "                        ");
                            arya.SetTulisString("                               Nama Nasabah : Joko Santoso              ");
                            arya.SetTulisString("                               Nominal Transfer : " + b + "                    ||");
                            arya.SetTulisString("||                                  Transaksi Berhasil                         ||");
                            arya.SetTulisString("||                                     Terima Kasih                            ||");
                            arya.SetTulisString("=================================================================================");
                            break;
                        case 4321:
                            arya.SetTulisString("=================================================================================");
                            arya.SetTulisString("                               No. Rek Tujuan : " + pilih + "                        ");
                            arya.SetTulisString("                               Nama Nasabah : Cecep Susanto                      ");
                            arya.SetTulisString("                               Nominal Transfer : " + b + "                    ||");
                            arya.SetTulisString("||                                  Transaksi Berhasil                         ||");
                            arya.SetTulisString("||                                     Terima Kasih                            ||");
                            arya.SetTulisString("=================================================================================");
                            break;
                        default:
                            arya.SetTulisString("********************************No. rekening tidak ada***************************");
                    }
                    arya.SetTulisString("=========================================================================================");
                    arya.SetTulisString("||                                                                                     ||");
                    arya.SetTulisString("||<1> Menu Utama                                                               Exit <2>||");
                    arya.SetTulisString("=========================================================================================");
                    arya.SetTulisString("Masukkan pilihan anda : ");
                    int selesai1 = sc.nextInt();
                    if (selesai1 == 1) {
                        menu2();
                    } else {
                        exit();
                    }
                } else {
                    arya.SetTulisString("Maaf saldo anda tidak mencukupi");
                }
            } else {
                exit();
            }
        }
    }

    public void transfer3() {
        if (saldoAwal3 < 50000) {
            arya.SetTulisString("||Maaf saldo anda kurang dari Rp. 50.000, silakan lakukan pengisian saldo||");
        } else {
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("||                              SILAKAN MASUKAN PILIHAN TRANSAKSI                      ||");
            arya.SetTulisString("||                                      YANG ANDA INGINKAN                             ||");
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("Masukan Nominal Transfer yang anda inginkan :                                            ");
            int uangT3 = sc.nextInt();
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("||                            Pilih Bank Tujuan Transfer Anda :                        ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||<1> Mandiri                                                                   BCA <2>||");
            arya.SetTulisString("||<3> BTN                                                                       BNI <4>||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("=========================================================================================");
            int bank3 = sc.nextInt();
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("||                          Uang yang akan ditransfer sebesar :                        ||");
            DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');
            kursIndonesia.setDecimalFormatSymbols(formatRp);
            String c = kursIndonesia.format(uangT3);
            arya.SetTulisString("||                                    " + c + "                                   ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||                       Apakah jumlah yang anda masukkan sudah benar?                 ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||<1>Ya                                                                       Tidak <2>||");
            arya.SetTulisString("=========================================================================================");
            int uangP3 = sc.nextInt();

            if (uangP3 == 1) {
                if (uangT3 < saldoAwal3) {

                    saldoAwal3 = saldoAwal3 - uangT3;
                    arya.SetTulisString("Masukan No. Rekening yang ingin ditransfer : ");
                    int pilih = sc.nextInt();

                    switch (pilih) {
                        case 9876:
                            arya.SetTulisString("=================================================================================");
                            arya.SetTulisString("                               No. Rek Tujuan : " + pilih + "                        ");
                            arya.SetTulisString("                               Nama Nasabah : Joko Santoso              ");
                            arya.SetTulisString("                               Nominal Transfer : " + c + "                    ||");
                            arya.SetTulisString("||                                  Transaksi Berhasil                         ||");
                            arya.SetTulisString("||                                     Terima Kasih                            ||");
                            arya.SetTulisString("=================================================================================");
                            break;
                        case 19205002:
                            arya.SetTulisString("=================================================================================");
                            arya.SetTulisString("No. Rek Tujuan : " + pilih + "                                                       ");
                            arya.SetTulisString("Nama Nasabah : Dadang Sudirman                                                     ");
                            arya.SetTulisString("Nominal Transfer : " + c + "                                                   ||");
                            arya.SetTulisString("||                                  Transaksi Berhasil                         ||");
                            arya.SetTulisString("||                                     Terima Kasih                            ||");
                            arya.SetTulisString("=================================================================================");
                            break;
                        default:
                            arya.SetTulisString("********************************No. rekening tidak ada***************************");
                    }
                    arya.SetTulisString("=========================================================================================");
                    arya.SetTulisString("||                                                                                     ||");
                    arya.SetTulisString("||<1> Menu Utama                                                               Exit <2>||");
                    arya.SetTulisString("=========================================================================================");
                    arya.SetTulisString("Masukkan pilihan anda : ");
                    int selesai1 = sc.nextInt();
                    if (selesai1 == 1) {
                        menu3();
                    } else {
                        exit();
                    }
                } else {
                    arya.SetTulisString("Maaf saldo anda tidak mencukupi");
                }
            } else {
                exit();
            }
        }
    }

    public void penarikansaldo() {
        if (saldoAwal < 50000) {
            arya.SetTulisString("||Maaf saldo anda kurang dari Rp. 50.000, silakan lakukan pengisian saldo||");
        } else {
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("||                              SILAKAN MASUKAN PILIHAN TRANSAKSI                      ||");
            arya.SetTulisString("||                                      YANG ANDA INGINKAN                             ||");
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("                                  Pilih Nominal Penarikan Saldo                          ");
            arya.SetTulisString("<1> Rp. 50.000                                                            <5> Rp. 250.000");
            arya.SetTulisString("<2> Rp. 100.000                                                           <6> Rp. 300.000");
            arya.SetTulisString("<3> Rp. 150.000                                                           <7> Rp. 350.000");
            arya.SetTulisString("<4> Rp. 200.000                                                           <8> Rp. 400.000");
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("||                          Uang yang akan diambil sebesar :                           ||");
            int uangT = sc.nextInt();
            DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');
            kursIndonesia.setDecimalFormatSymbols(formatRp);
            String a = kursIndonesia.format(uangT);
            arya.SetTulisString("||                                    " + a + "                                ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||                       Apakah jumlah yang anda masukkan sudah benar?                 ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||<1>Ya                                                                       Tidak <2>||");
            arya.SetTulisString("=========================================================================================");
            int uangP = sc.nextInt();
            if (uangP == 1) {
                if (uangP < saldoAwal) {
                    saldoAwal = saldoAwal - uangT;
                    arya.SetTulisString("");
                    arya.SetTulisString("=========================================================================================");
                    arya.SetTulisString("                             Sisa Saldo Anda Sebesar :                                 ||");
                    formatRp.setCurrencySymbol("Rp. ");
                    formatRp.setMonetaryDecimalSeparator(',');
                    formatRp.setGroupingSeparator('.');
                    kursIndonesia.setDecimalFormatSymbols(formatRp);
                    String x = kursIndonesia.format(saldoAwal);
                    arya.SetTulisString("||                              " + x + "                                              ||");
                    arya.SetTulisString("||                                                                                     ||");
                    arya.SetTulisString("||                                                                                     ||");
                    arya.SetTulisString("||<1> Menu Utama                                                               Exit <2>||");
                    arya.SetTulisString("=========================================================================================");
                    int uangG = sc.nextInt();
                    if (uangG == 1) {
                        menu();
                    } else {
                        exit();
                    }
                } else {
                    arya.SetTulisString("Saldo Anda tidak cukup untuk melakukan transaksi ini");
                    menu();
                }
            } else {
                penarikansaldo();
            }
        }
    }

    public void penarikansaldo2() {
        if (saldoAwal2 < 50000) {
            arya.SetTulisString("||Maaf saldo anda kurang dari Rp. 50.000, silakan lakukan pengisian saldo||");
        } else {
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("||                              SILAKAN MASUKAN PILIHAN TRANSAKSI                      ||");
            arya.SetTulisString("||                                      YANG ANDA INGINKAN                             ||");
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("                                  Pilih Nominal Penarikan Saldo                          ");
            arya.SetTulisString("<1> Rp. 50.000                                                            <5> Rp. 250.000");
            arya.SetTulisString("<2> Rp. 100.000                                                           <6> Rp. 300.000");
            arya.SetTulisString("<3> Rp. 150.000                                                           <7> Rp. 350.000");
            arya.SetTulisString("<4> Rp. 200.000                                                           <8> Rp. 400.000");
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("||                          Uang yang akan diambil sebesar :                           ||");
            int uangT2 = sc.nextInt();
            DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');
            kursIndonesia.setDecimalFormatSymbols(formatRp);
            String b = kursIndonesia.format(uangT2);
            arya.SetTulisString("||                                    " + b + "                                ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||                       Apakah jumlah yang anda masukkan sudah benar?                 ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||<1>Ya                                                                       Tidak <2>||");
            arya.SetTulisString("=========================================================================================");
            int uangP2 = sc.nextInt();
            if (uangP2 == 1) {
                if (uangP2 < saldoAwal2) {
                    saldoAwal2 = saldoAwal2 - uangT2;
                    arya.SetTulisString("");
                    arya.SetTulisString("=========================================================================================");
                    arya.SetTulisString("                             Sisa Saldo Anda Sebesar :                                 ||");
                    formatRp.setCurrencySymbol("Rp. ");
                    formatRp.setMonetaryDecimalSeparator(',');
                    formatRp.setGroupingSeparator('.');
                    kursIndonesia.setDecimalFormatSymbols(formatRp);
                    String y = kursIndonesia.format(saldoAwal2);
                    arya.SetTulisString("||                              " + y + "                                       ||");
                    arya.SetTulisString("||                                                                                     ||");
                    arya.SetTulisString("||                                                                                     ||");
                    arya.SetTulisString("||<1> Menu Utama                                                               Exit <2>||");
                    arya.SetTulisString("=========================================================================================");
                    int uangG2 = sc.nextInt();
                    if (uangG2 == 1) {
                        menu2();
                    } else {
                        exit();
                    }
                } else {
                    arya.SetTulisString("Saldo Anda tidak cukup untuk melakukan transaksi ini");
                    menu2();
                }
            } else {
                penarikansaldo2();
            }
        }
    }

    public void penarikansaldo3() {
        if (saldoAwal3 < 50000) {
            arya.SetTulisString("||Maaf saldo anda kurang dari Rp. 50.000, silakan lakukan pengisian saldo||");
        } else {
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("||                              SILAKAN MASUKAN PILIHAN TRANSAKSI                      ||");
            arya.SetTulisString("||                                      YANG ANDA INGINKAN                             ||");
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("                                  Pilih Nominal Penarikan Saldo                          ");
            arya.SetTulisString("<1> Rp. 50.000                                                            <5> Rp. 250.000");
            arya.SetTulisString("<2> Rp. 100.000                                                           <6> Rp. 300.000");
            arya.SetTulisString("<3> Rp. 150.000                                                           <7> Rp. 350.000");
            arya.SetTulisString("<4> Rp. 200.000                                                           <8> Rp. 400.000");
            arya.SetTulisString("=========================================================================================");
            arya.SetTulisString("||                          Uang yang akan diambil sebesar :                           ||");
            int uangT3 = sc.nextInt();
            DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');
            kursIndonesia.setDecimalFormatSymbols(formatRp);
            String c = kursIndonesia.format(uangT3);

            arya.SetTulisString("||                                    " + c + "                                ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||                       Apakah jumlah yang anda masukkan sudah benar?                 ||");
            arya.SetTulisString("||                                                                                     ||");
            arya.SetTulisString("||<1>Ya                                                                       Tidak <2>||");
            arya.SetTulisString("=========================================================================================");
            int uangP3 = sc.nextInt();
            if (uangP3 == 1) {
                if (uangP3 < saldoAwal3) {
                    saldoAwal3 = saldoAwal3 - uangT3;
                    arya.SetTulisString("");
                    arya.SetTulisString("=========================================================================================");
                    arya.SetTulisString("                             Sisa Saldo Anda Sebesar :                                 ||");
                    formatRp.setCurrencySymbol("Rp. ");
                    formatRp.setMonetaryDecimalSeparator(',');
                    formatRp.setGroupingSeparator('.');
                    kursIndonesia.setDecimalFormatSymbols(formatRp);
                    String z = kursIndonesia.format(saldoAwal3);
                    arya.SetTulisString("||                              " + z + "                                       ||");
                    arya.SetTulisString("||                                                                                     ||");
                    arya.SetTulisString("||                                                                                     ||");
                    arya.SetTulisString("||<1> Menu Utama                                                               Exit <2>||");
                    arya.SetTulisString("=========================================================================================");
                    int uangG3 = sc.nextInt();
                    if (uangG3 == 1) {
                        menu3();
                    } else {
                        exit();
                    }
                } else {
                    arya.SetTulisString("Saldo Anda tidak cukup untuk melakukan transaksi ini");
                    menu3();
                }
            } else {
                penarikansaldo3();
            }
        }
    }

    public void exit() {
        arya.SetTulisString("=========================================================================================");
        arya.SetTulisString("||                                  Selamat Tinggal                                    ||");
        arya.SetTulisString("||                                    Terima Kasih                                     ||");
        arya.SetTulisString("||                                Selamat Datang Kembali                               ||");
        arya.SetTulisString("=========================================================================================");

    }

}
