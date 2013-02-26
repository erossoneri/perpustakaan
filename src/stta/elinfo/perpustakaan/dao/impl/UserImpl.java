/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stta.elinfo.perpustakaan.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import stta.elinfo.perpustakaan.dao.entity.User;
import stta.elinfo.perpustakaan.dao.interf.UserInterf;
import stta.elinfo.perpustakaan.dao.koneksi.DatabaseUtilities;


public class UserImpl implements UserInterf{

    public void insert(User user) throws SQLException {
    PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("insert into user values (?,?)");
    ps.setString(1, user.getNama());
    ps.setString(2, user.getPassword());
    ps.executeUpdate();
    }

    public User getUser() throws SQLException {
        Statement st=DatabaseUtilities.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select *from user");
        User us=new User();
        while(rs.next()){
            us.setNama(rs.getString("nama"));
            us.setPassword(rs.getString("password"));
        }
        return us;
    }

}
