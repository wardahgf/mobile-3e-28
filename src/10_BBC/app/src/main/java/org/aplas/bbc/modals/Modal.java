package org.aplas.bbc.modals;

public class Modal {
    private String judul;
    private String keterangan;
    public Modal() {

    }

    public Modal(String judul, String keterangan){
        this.judul = judul;
        this.keterangan = keterangan;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
