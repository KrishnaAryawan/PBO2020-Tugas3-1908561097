package com.main;

import java.util.Scanner;

public class Program {
    private final Scanner scanner;

    public Program() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        int userMenu;
        do {
            userMenu = this.getIntegerInput("\n\nNama: Anak Agung Gde Krishna Aryawan\nNIM: 1908561097\nMENU\n1. Cek Pemain Basket\n2. Ganti Data Pemain\n3. Reset Data Pemain\n4. Quit\nPilihan: ");
            this.processMenu(userMenu);
        } while(userMenu != 4);
    }

    private void processMenu(int menu) {
        switch (menu) {
            case 1:
                PemainBasket pemainBasket = TampilkanPemain.tampilkanPemain();
                if (pemainBasket != null) {
                    System.out.println("Nama Pemain: " + pemainBasket.getNamaPemain());
                } else {
                    System.out.println("Mohon diisi terlebih dahulu!");
                }
                break;
            case 2:
                MenyimpanPemain menyimpanPemain = new MenyimpanPemain(getInputPemain("Masukkan nama pemain baru: "));
                menyimpanPemain.laksanakan();
                break;
            case 3:
                MenyimpanPemain menyimpanPemain1 = new MenyimpanPemain(null);
                menyimpanPemain1.laksanakan();
                break;
            case 4:
                break;
            default:
                System.out.println("Mohon maaf anda salah sambung");
                break;
        }
    }

    private int getIntegerInput(String message) {
        System.out.println(message);
        int buffer = scanner.nextInt();
        scanner.nextLine();
        return buffer;
    }

    private String getInputPemain(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
