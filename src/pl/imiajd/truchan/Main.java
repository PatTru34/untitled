package pl.imiajd.truchan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        Rekrutacja.set();
        ArrayList<Kandydat> grupa = new ArrayList<>();
        grupa.add(new Kandydat("Ĺukasz", 21, "licencjat", 1));
        grupa.add(new Kandydat("PaweĹ‚", 21, "mistrzowie", 2));

        grupa.add(new Kandydat("Szymon", 21, "licencjat", 3));
        grupa.add(new Kandydat("Andrzej", 25, "licencjat", 4));

        grupa.add(new Kandydat("Szymon", 25, "mistrzowie", 5));
        grupa.add(new Kandydat("Andrzej", 25, "mistrzowie", 6));

        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
        System.out.println(Qualified(grupa.get(0)));
        System.out.println(RecruitmentMap(grupa));
    }

    public static boolean Qualified(Kandydat k) {
        return k.getLataDoswiadczenia() >= Rekrutacja.doswiadczenie;
    }

    public static Map<Integer, String> RecruitmentMap(ArrayList<Kandydat> klist) {
        Map<Integer, String> kand = new HashMap<>();

        for(int i = 0; i < klist.size(); i++) {
            Kandydat kandydat = klist.get(i);
            if(Qualified(kandydat)) {
                kand.put(kandydat.getLataDoswiadczenia(), kandydat.getNazwa());
            }
        }
        return kand;
    }
}
