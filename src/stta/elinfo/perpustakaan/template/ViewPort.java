/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stta.elinfo.perpustakaan.template;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import javax.swing.JTable;
import javax.swing.JViewport;


public class ViewPort extends JTable{

    private Paint paint;

    public ViewPort() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D gd = (Graphics2D) g.create();
        paint = new Color(156190255);
        gd.setPaint(paint);
        super.paintComponent(g);
    }





}
