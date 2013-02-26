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
import stta.elinfo.perpustakaan.dao.entity.Kategori;
import stta.elinfo.perpustakaan.dao.interf.KategoriInterf;
import stta.elinfo.perpustakaan.dao.koneksi.DatabaseUtilities;


public class KategoriImpl implements KategoriInterf{

    public void insert(String kat) throws SQLException {
        PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("insert into kategori values(?)");
        ps.setString(1, kat);
        ps.executeUpdate();
    }

    public List<Kategori> getAll() throws SQLException {
        Statement st=DatabaseUtilities.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select *from kategori");
        List<Kategori> list=new ArrayList<Kategori>();
        while(rs.next()){
            Kategori kt=new Kategori();
            kt.setKategori(rs.getString("kategori"));
            list.add(kt);
        }
        return list;
    }

}
