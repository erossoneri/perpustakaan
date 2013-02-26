/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stta.elinfo.perpustakaan.template;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;


public class PanelTransparan extends JPanel{
    private Color color;

    public PanelTransparan() {
        setOpaque(false);
        color = new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 200);
       
    }

    @Override
    public void setBackground(Color bg) {
        super.setBackground(bg);
        color = new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 200);
        repaint();
            }

    @Override
    protected void paintComponent(Graphics g) {
     Graphics2D gd = (Graphics2D) g.create();
      color = new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 200);
       gd.setColor(color);
       // gd.fillRoundRect(0, 0, getWidth(), getHeight(), getHeight(), getHeight());
       gd.fillRect(0, 0, getWidth(), getHeight());
       gd.dispose();
       super.paintComponent(g);
    }




}
