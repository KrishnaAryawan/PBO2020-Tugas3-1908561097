package com.main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MenyimpanPemain implements Serializable {
    private PemainBasket pemainBasket;
    public MenyimpanPemain(String pemainBaru) {
        if (pemainBaru == null) {
            pemainBasket = null;
        } else {
            pemainBasket = new PemainBasket(pemainBaru);
        }
    }

    public void laksanakan() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("depository_file.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(this.pemainBasket);
            objectOutputStream.flush();
            objectOutputStream.close();

        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
