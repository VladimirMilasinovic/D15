package Paket2;

import java.util.ArrayList;

public class arraydomaci2 {
    public static void main(String[] args) {
        int [] niz = new int [5];

        niz [0] = 3;
        niz [1] = 5;
        niz [2] = 8;
        niz [3] = 1;
        niz [4] = 4;

        ArrayList parniBrojevi = new ArrayList<>();
        ArrayList neparniBrojevi = new ArrayList<>();

        for (int i =0; i< niz.length ; i++){
            if (niz[i]%2 == 0){
                parniBrojevi.add(niz[i]);
            }else{
                neparniBrojevi.add(niz[i]);
            }
        }
        System.out.println("Lista parnih brojeva:" + parniBrojevi);
        System.out.println("Lista neparnih brojeva" + neparniBrojevi);
    }
}
