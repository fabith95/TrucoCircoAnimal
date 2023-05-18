package org.example.model;

public class CircusTrick {
    private String rugir = "";
    private String mugidos= "";
    private String dance = "";
    private String duerme = "";
    private String salta = "";
    public int TRUCO_ANIMAL = 2;

    public String getRugir() {
        for (int i = 0; i < TRUCO_ANIMAL; i++) {
            this.rugir += "roar";
        }
        return rugir;
    }

    public String getMugidos() {
        for (int i = 0; i < TRUCO_ANIMAL; i++) {
            this.mugidos += "moo";
        }
        return mugidos;
    }

    public String getDance() {
        for (int i = 0; i < TRUCO_ANIMAL; i++) {
            this.dance += "bla";
        }
        return dance;
    }

    public String getDuerme() {
        for (int i = 0; i < TRUCO_ANIMAL; i++) {
            this.duerme += "zzz";
        }
        return duerme;
    }

    public String getSalta() {
        for (int i = 0; i < TRUCO_ANIMAL; i++) {
            this.salta += "miu";
        }
        return salta;
    }

}
