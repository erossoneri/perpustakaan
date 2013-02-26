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
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;


public class ButtonTransparan extends JButton{

    private Color color;
    private Paint paint;
    private boolean over;

    public ButtonTransparan() {
        setOpaque(false);
        setForeground(Color.BLACK);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorder(new EmptyBorder(3, 3, 3, 3));
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
        color = new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 200);
        paint = new GradientPaint(0, 0, new Color(1F, 1F, 1F, 0F), getWidth(), 0, new Color(1F, 1F, 1F, 0.5F));
        if(isOver()){
             paint = new GradientPaint(0, 0, new Color(1F, 1F, 1F, 0F), 0, getHeight(), new Color(1F, 1F, 1F, 0.5F));
       
        }else{
             paint = new GradientPaint(0, 0, new Color(1F, 1F, 1F, 0.5F), 0, getHeight(), new Color(1F, 1F, 1F, 0F));
       
        }

        gd.setPaint(paint);
        gd.setBackground(color);
        gd.fillRoundRect(0, 0, getWidth(), getHeight(), getHeight(), getHeight());
        gd.dispose();
        super.paintComponent(g);
    }



}
