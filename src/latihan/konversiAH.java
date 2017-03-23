package konversi;

public class konversiAH {

    private String[] kata
            = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
    private int[] angka2
            = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    private String a;
    private int b;

    public konversiAH() {
        a = null;
        b = 0;
    }

    public String proses(int angka2) {

        if (angka2 > 0 && angka2 < 12) {
            a = kata[angka2];
        } else if (angka2 > 11 && angka2 < 20) {
            a = kata[angka2 - 10] + " belas";
        } else if (angka2 > 100 && angka2 < 200) {
            a = "seratus " + proses(angka2 % 100);
        } else if (angka2 % 10 == 0) {
            a = kata[angka2 / 10] + " puluh";
        } else if (angka2 > 21 && angka2 < 100) {
            a = kata[angka2 / 10] + " puluh " + kata[angka2 % 10];
        } else if (angka2 > 199 && angka2 < 1000) {
            a = proses(angka2 / 100) + " ratus " + proses(angka2 % 100);
        } else if (angka2 == 100) {
            a = "seratus";
        } else if (angka2 == 1000) {
            a = "seribu";
        } else if (angka2 == 0) {
            a = kata[angka2];
        }
        return a;
    }

    public int proses(String kata) {
        if (kata.equals("seratus sebelas")) {
            b = 111;
            return b;
        }
        for (int i = 0; i < this.kata.length; i++) {// sampai panjang array kata
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {

                    if (kata.equalsIgnoreCase(this.kata[i])) {
                        b = angka2[i];
                    } else if (kata.equalsIgnoreCase("seratus")) {
                        b = 100;
                    } else if (kata.equalsIgnoreCase("seribu")) {
                        b = 1000;
                    } else if (kata.equalsIgnoreCase(this.kata[i] + " belas")) {
                        b = angka2[i] + 10;
                    } //untuk angka puluhan
                    else if (kata.equalsIgnoreCase(this.kata[i] + " puluh")) {
                        b = angka2[i] * 10;
                    } else if (kata.equalsIgnoreCase(this.kata[i] + " puluh " + this.kata[j])) {
                        b = angka2[i] * 10 + angka2[j];
                    } //untuk angka ratusan
                    else if (kata.equalsIgnoreCase("seratus " + this.kata[j])) {
                        b = 100 + angka2[j];
                    } else if (kata.equalsIgnoreCase("seratus " + this.kata[j] + " belas")) {
                        b = 110 + angka2[j];
                    } else if (kata.equalsIgnoreCase("seratus " + this.kata[j] + " puluh")) {
                        b = 100 + angka2[j] * 10;
                    } else if (kata.equalsIgnoreCase("seratus " + this.kata[j] + " puluh " + this.kata[k])) {
                        b = 100 + angka2[j] * 10 + angka2[k];
                    } 
                }
            }
        }
        return b;
    }

}
