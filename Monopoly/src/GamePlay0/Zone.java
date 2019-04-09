/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GamePlay0;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author lap shop
 */
public class  Zone extends javax.swing.JPanel {
   
    private int m_rent;
    private int m_rentWithColorSet;
    private int m_rentWithOneHouse;
    private int m_rentWithTwoHouses;
    private int m_rentWithThreeHouses;
    private int m_rentWithFourHouses;
    private int m_rentWithHotel;
    private int m_houseCost;
    private int m_hotelCost;
    private int m_zoneCost;
    private String m_color;
    private int m_index;

    public int getM_rent() {
        return m_rent;
    }

    public void setM_rent(int m_rent) {
        this.m_rent = m_rent;
    }

    public int getM_rentWithColorSet() {
        return m_rentWithColorSet;
    }

    public void setM_rentWithColorSet(int m_rentWithColorSet) {
        this.m_rentWithColorSet = m_rentWithColorSet;
    }

    public int getM_rentWithOneHouse() {
        return m_rentWithOneHouse;
    }

    public void setM_rentWithOneHouse(int m_rentWithOneHouse) {
        this.m_rentWithOneHouse = m_rentWithOneHouse;
    }

    public int getM_rentWithTwoHouses() {
        return m_rentWithTwoHouses;
    }

    public void setM_rentWithTwoHouses(int m_rentWithTwoHouses) {
        this.m_rentWithTwoHouses = m_rentWithTwoHouses;
    }

    public int getM_rentWithThreeHouses() {
        return m_rentWithThreeHouses;
    }

    public void setM_rentWithThreeHouses(int m_rentWithThreeHouses) {
        this.m_rentWithThreeHouses = m_rentWithThreeHouses;
    }

    public int getM_rentWithFourHouses() {
        return m_rentWithFourHouses;
    }

    public void setM_rentWithFourHouses(int m_rentWithFourHouses) {
        this.m_rentWithFourHouses = m_rentWithFourHouses;
    }

    public int getM_rentWithHotel() {
        return m_rentWithHotel;
    }

    public void setM_rentWithHotel(int m_rentWithHotel) {
        this.m_rentWithHotel = m_rentWithHotel;
    }

    public int getM_houseCost() {
        return m_houseCost;
    }

    public void setM_houseCost(int m_houseCost) {
        this.m_houseCost = m_houseCost;
    }

    public int getM_hotelCost() {
        return m_hotelCost;
    }

    public void setM_hotelCost(int m_hotelCost) {
        this.m_hotelCost = m_hotelCost;
    }

    public int getM_zoneCost() {
        return m_zoneCost;
    }

    public void setM_zoneCost(int m_zoneCost) {
        this.m_zoneCost = m_zoneCost;
    }

    public String getM_color() {
        return m_color;
    }

    public void setM_color(String m_color) {
        this.m_color = m_color;
    }

    public int getM_index() {
        return m_index;
    }

    public void setM_index(int m_index) {
        this.m_index = m_index;
    }
    
    public  Zone getData()
    {
        return this;
    }

    public Zone(int index) {
        this.m_rent = 0;
        this.m_rentWithColorSet = 0;
        this.m_rentWithOneHouse = 0;
        this.m_rentWithTwoHouses = 0;
        this.m_rentWithThreeHouses = 0;
        this.m_rentWithFourHouses = 0;
        this.m_rentWithHotel = 0;
        this.m_houseCost = 0;
        this.m_hotelCost = 0;
        this.m_zoneCost = 0;
        this.m_color = null;
        this.m_index = index;
    }
    
    public Zone() {
        this.m_rent = 0;
        this.m_rentWithColorSet = 0;
        this.m_rentWithOneHouse = 0;
        this.m_rentWithTwoHouses = 0;
        this.m_rentWithThreeHouses = 0;
        this.m_rentWithFourHouses = 0;
        this.m_rentWithHotel = 0;
        this.m_houseCost = 0;
        this.m_hotelCost = 0;
        this.m_zoneCost = 0;
        this.m_color = null;
        this.m_index = -1;
    }
    
    public Zone(int m_rent , int m_rentWithColorSet , int m_rentWithOneHouse, int m_rentWithTwoHouses , int m_rentWithThreeHouses , int m_rentWithFourHouses , int m_rentWithHotel , int m_houseCost , int m_hotelCost , int m_zoneCost , String m_color , int index)
    {
        this.m_rent = m_rent;
        this.m_rentWithColorSet = m_rentWithColorSet;
        this.m_rentWithOneHouse = m_rentWithOneHouse;
        this.m_rentWithTwoHouses = m_rentWithTwoHouses;
        this.m_rentWithThreeHouses = m_rentWithThreeHouses;
        this.m_rentWithFourHouses = m_rentWithFourHouses;
        this.m_rentWithHotel = m_rentWithHotel;
        this.m_houseCost = m_houseCost;
        this.m_hotelCost = m_hotelCost;
        this.m_zoneCost = m_zoneCost;
        this.m_color = m_color;
        this.m_index = index;
    }
  
    public void setImage(String path , boolean border){     
        
        JPanel pnl = new JPanel(){
            
          public void paintComponent(Graphics g){
              Graphics2D g2 = (Graphics2D)g;
              Image img;
              try {
                  img = ImageIO.read(new File(path));
                  g2.drawImage(img, 1, 1, this.getWidth()-1, this.getHeight()-1, this);
              } catch (IOException ex) {
                  Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
              }
              if (border){
                g2.setStroke(new BasicStroke(2));
                g2.drawRect(0, 0, this.getWidth(), this.getHeight());
              }
          }  
          
        };
        //JButton btn = new JButton();
       // this.add(btn);
        this.add(pnl);
        
  
        pnl.setBounds(0, 0, this.getWidth(), this.getHeight());
        
      //  btn.setBounds(0, 0, 100, 100);
        
    }
    
    public JPanel getPanel(){
        return this;
    }

   
  




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 153, 102));
        setPreferredSize(new java.awt.Dimension(90, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
