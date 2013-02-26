/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stta.elinfo.perpustakaan.dao.interf;

import java.sql.SQLException;
import stta.elinfo.perpustakaan.dao.entity.User;


public interface UserInterf {

    void insert(User user)throws SQLException;

    User getUser() throws SQLException;


}
