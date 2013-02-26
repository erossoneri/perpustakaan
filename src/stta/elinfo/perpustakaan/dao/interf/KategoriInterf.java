/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stta.elinfo.perpustakaan.dao.interf;

import java.sql.SQLException;
import java.util.List;
import stta.elinfo.perpustakaan.dao.entity.Kategori;


public interface KategoriInterf {

    void insert(String kat) throws SQLException;

    List<Kategori> getAll() throws SQLException;

}
