package Soal1Praktikum6;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String kosong;

    public Mahasiswa(String nim, String nama, String kosong) {
        this.nim = nim;
        this.nama = nama;
        this.kosong = kosong;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void getKosong(String kosong){
        this.kosong = kosong;
    }

    public void setKosong(String kosong){
        this.kosong =  kosong;
    }
}
