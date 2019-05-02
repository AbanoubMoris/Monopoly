package GamePlay0;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author A.LoOotfy
 */
       
public class Dice extends javax.swing.JPanel {


    private int dice_value;
      
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
        
        this.add(pnl);
        pnl.setBounds(0, 0, this.getWidth(), this.getHeight());
        
    }  
    
    public Dice() {
        initComponents();
    }
    public int getDice_value() {
        return dice_value;
    }
    public void setDice_value(int dice_value) {
        this.dice_value = dice_value;
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
