package pl.imiajd.truchan;

import java.util.ArrayList;

public class Rekrutacja {
    public static Integer doswiadczenie;
    private ArrayList<Kandydat> kandydat;

    public Rekrutacja(ArrayList<Kandydat> kandydat) {
        this.kandydat = kandydat;
    }

    public static void set() {
        doswiadczenie = 2;
    }
}
