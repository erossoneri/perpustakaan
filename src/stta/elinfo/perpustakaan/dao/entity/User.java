/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stta.elinfo.perpustakaan.dao.entity;


public class User {

    private String nama;
    private String password;

    public User() {
    }

    public User(String nama, String password) {
        this.nama = nama;
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
