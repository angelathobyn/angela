/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BELLA TOBIN
 */
public class BUKU {
    private int id;
    private String judul;
    private String penulis;
    private String penerbit;
    private int stok;

   public BUKU() {
        this.id = 0;
    }

    public BUKU(int id, String judul, String penulis, String penerbit, int stok) {
        if (stok < 0) {
            throw new IllegalArgumentException("Stok harus positif");
        }

        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.stok = stok;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getStok() {
        return stok;
    }
     public void setStok(int stok) {
        if (stok < 0) {
            throw new IllegalArgumentException("Stok harus positif");
        }

        this.stok = stok;
    }
}