/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stta.elinfo.perpustakaan.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import stta.elinfo.perpustakaan.dao.entity.Buku;
import stta.elinfo.perpustakaan.dao.interf.BukuInterf;
import stta.elinfo.perpustakaan.dao.koneksi.DatabaseUtilities;

public class BukuImpl implements BukuInterf{

    public void insert(Buku bk) throws SQLException {
        PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("insert into buku (nama,kategori,deskripsi,tanggal,path) values(?,?,?,?,?)");
        ps.setString(1, bk.getNama());
        ps.setString(2, bk.getKategori());
        ps.setString(3, bk.getDeskripsi());
        ps.setDate(4, new java.sql.Date(bk.getTanggal().getTime()));
        ps.setString(5, bk.getPath());
        ps.executeUpdate();
    }

    public List<Buku> getAll() throws SQLException {
        Statement st=DatabaseUtilities.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select nama,kategori,deskripsi,tanggal,path from buku");
        List<Buku> list=new ArrayList<Buku>();
        while(rs.next()){
            Buku bk=new Buku();
            bk.setNama(rs.getString("nama"));
            bk.setKategori(rs.getString("kategori"));
            bk.setDeskripsi(rs.getString("deskripsi"));
            bk.setTanggal(rs.getDate("tanggal"));
            bk.setPath(rs.getString("path"));
            list.add(bk);
        }
        return list;
    }

    public List<Buku> getKatNama(String nama, String kat) throws SQLException {
        PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("select nama,kategori,deskripsi,tanggal,path from buku where nama like ? and kategori=?");
        ps.setString(1, "%"+nama+"%");
        ps.setString(2, kat);
        ResultSet rs=ps.executeQuery();
        List<Buku> list=new ArrayList<Buku>();
        while(rs.next()){
            Buku bk=new Buku();
            bk.setNama(rs.getString("nama"));
            bk.setKategori(rs.getString("kategori"));
            bk.setDeskripsi(rs.getString("deskripsi"));
            bk.setTanggal(rs.getDate("tanggal"));
            bk.setPath(rs.getString("path"));
            list.add(bk);
        }
        return list;
    }

}
