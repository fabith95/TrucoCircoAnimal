package org.example.model;

public class CircusTrick {
    private String rugir = "";
    private String mugidos= "";
    private String dance = "";
    private String duerme = "";
    private String salta = "";
    public int TRUCO_ANIMAL = 2;

    public String getRugir() {
        return rugir;
    }

    public String getMugidos() {
        return mugidos;
    }

    public String getDance() {
        return dance;
    }

    public String getDuerme() {
        return duerme;
    }

    public String getSalta() {
        return salta;
    }

    public void silbatoLeon(){
        for (int i = 0; i < TRUCO_ANIMAL; i++) {
            this.rugir += "rou";
        }
    }

    public void silbatoVaca(){
        for (int i = 0; i < TRUCO_ANIMAL; i++) {
            this.mugidos += "muu";
        }
    }
}
