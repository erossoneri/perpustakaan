/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stta.elinfo.perpustakaan.dao.entity;

import java.util.Date;


public class Buku {
    private int id;
    private String nama;
    private String kategori;
    private String deskripsi;
    private Date tanggal;
    private String path;

    public Buku() {
    }

    public Buku(int id, String nama, String kategori, String deskripsi, Date tanggal, String path) {
        this.id = id;
        this.nama = nama;
        this.kategori = kategori;
        this.deskripsi = deskripsi;
        this.tanggal = tanggal;
        this.path = path;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }


}
