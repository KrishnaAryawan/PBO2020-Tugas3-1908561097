package com.main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TampilkanPemain {
    public static PemainBasket tampilkanPemain() {
        PemainBasket pemainBasket = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("depository_file.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            pemainBasket = (PemainBasket) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception error) {
            error.printStackTrace();
        }
        return pemainBasket;
    }
}
