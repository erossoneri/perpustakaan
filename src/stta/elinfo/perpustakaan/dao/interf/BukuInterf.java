/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stta.elinfo.perpustakaan.dao.interf;

import java.sql.SQLException;
import java.util.List;
import stta.elinfo.perpustakaan.dao.entity.Buku;


public interface BukuInterf {

    void insert(Buku bk)throws SQLException;

    List<Buku> getAll() throws SQLException;

    List<Buku> getKatNama(String nama, String kat) throws SQLException;

}
