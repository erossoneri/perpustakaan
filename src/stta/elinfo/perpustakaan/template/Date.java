/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stta.elinfo.perpustakaan.template;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFormattedTextField;
import javax.swing.border.EmptyBorder;


public class Date extends JFormattedTextField{
    private Paint paint;
    private boolean over;

    public Date() {
        setOpaque(false);
        setBorder(new EmptyBorder(3, 3, 3, 3));
        setForeground(Color.BLACK);
//        setFormatterFactory();
        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
               setOver(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setOver(false);
            }

        });
    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D gd = (Graphics2D) g.create();
       paint = new GradientPaint(0, 0, Color.cyan, 0, getHeight(), Color.WHITE);
        if(isOver()){
            paint = new GradientPaint(0, 0, Color.WHITE, 0, getHeight(), Color.cyan);
        }else{
            paint = new GradientPaint(0, 0, Color.cyan, 0, getHeight(), Color.WHITE);
        }
        gd.setPaint(paint);
        gd.fillRoundRect(0, 0, getWidth(), getHeight(), getHeight(), getHeight());
        gd.dispose();

        super.paintComponent(g);
    }



}
