package view;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> L = new ArrayList<Integer>();
        L.add(3);
        L.add(5);
        L.add(18);
        L.add(12);
        L.add(9);
        L.add(7);
        L.add(6);
        L.add(2);
        L.add(13);
        L.add(4);
        L.add(16);

        // a) Invertendo os elementos da lista logicamente
        int n = L.size();
        for (int i = 0; i < n / 2; i++) {
            int temp = L.get(i);
            L.set(i, L.get(n - 1 - i));
            L.set(n - 1 - i, temp);
        }

        // b) Exibindo os elementos da lista
        for (int i = 0; i < L.size(); i++) {
            System.out.print(L.get(i) + " ");
        }
    }
}

