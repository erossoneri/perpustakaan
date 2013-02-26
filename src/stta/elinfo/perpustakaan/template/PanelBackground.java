/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stta.elinfo.perpustakaan.template;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class PanelBackground extends JPanel{
    private Image image;

    public PanelBackground() {
        setOpaque(false);

        image = new ImageIcon(getClass().getResource("/stta/elinfo/perpustakaan/gambar/buku.jpg")).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D gd = (Graphics2D) g.create();
        image = new ImageIcon(getClass().getResource("/stta/elinfo/perpustakaan/gambar/buku.jpg")).getImage();
        gd.drawImage(image, 0, 0,getWidth(),getHeight(),null);
        gd.dispose();
        super.paintComponent(g);
    }


}
