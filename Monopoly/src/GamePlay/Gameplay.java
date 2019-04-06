/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GamePlay;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author lap shop
 */
public class Gameplay extends javax.swing.JFrame {
    
    
    
    
    
    
    
    
    
    public void DrawGamePlay(){
            
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        go.setImage("src/Gameplay/img/go.png", true);
        jail.setImage("src/Gameplay/img/jail.png", true);
        parking.setImage("src/Gameplay/img/free-parking.png", true);
        goToJail.setImage("src/Gameplay/img/go-to-jail.png", true);
        
        MarvinGardens.setImage("src/Gameplay/img/Untitled-15.png", true);
        waterWorks.setImage("src/Gameplay/img/Untitled-114.png", true);
        ventnor.setImage("src/Gameplay/img/Untitled-16.png", true);
        Atlantic.setImage("src/Gameplay/img/Untitled-17.png", true);
        RailRoad.setImage("src/Gameplay/img/Untitled-21.png", true);
        Illinois.setImage("src/Gameplay/img/Untitled-18.png", true);
        Indiana.setImage("src/Gameplay/img/Untitled-19.png", true);
        ChanceBlue.setImage("src/Gameplay/img/chance blue.png", true);
        Kentucky.setImage("src/Gameplay/img/20.png", true);
    
    
        Mediter_Ranean.setImage("src/Gameplay/img/Untitled-1.png", true);
        Community_Chest.setImage("src/Gameplay/img/community-chest.png", true);
        Baltic.setImage("src/Gameplay/img/Untitled-2.png", true);
        IncomeTax.setImage("src/Gameplay/img/24.png", true);
        RealRoad.setImage("src/Gameplay/img/Untitled-21.png", true);
        Oriental.setImage("src/Gameplay/img/Untitled-3.png", true);
        ChanceRed.setImage("src/Gameplay/img/chance-red.png", true);
        Vermont.setImage("src/Gameplay/img/Untitled-4.png", true);
        Connecticut.setImage("src/Gameplay/img/Untitled-5.png", true);
        pacific.setImage("src/Gameplay/img/Untitled-12.png", true);
        NorthCaro.setImage("src/Gameplay/img/Untitled-13.png", true);
        communtityChestRight.setImage("src/Gameplay/img/community-chest-left.png", true);
        pennsy.setImage("src/Gameplay/img/Untitled-14.png", true);
        shorLline.setImage("src/Gameplay/img/Untitled-121.png", true);
        OrangeChance.setImage("src/Gameplay/img/chance-orange.png", true);
        ParkPlace.setImage("src/Gameplay/img/Untitled-PR.png", true);
        NewYork.setImage("src/Gameplay/img/Untitled-11.png", true);
        Tenss.setImage("src/Gameplay/img/Untitled-10.png", true);
        CCT.setImage("src/Gameplay/img/community-chest-right.png", true);
        stJames.setImage("src/Gameplay/img/Untitled-9.png", true);
        pennsyl.setImage("src/Gameplay/img/PENS.png", true);
        Virginnia.setImage("src/Gameplay/img/Untitled-8.png", true);
        States.setImage("src/Gameplay/img/Untitled-7.png", true);
        MONOMAN.setImage("src/Gameplay/img/monoMan.png", false);
        orange.setImage("src/Gameplay/img/orange-CHANCE.png", false);
        bluetreasure.setImage("src/Gameplay/img/treasure.png", false);
        
    
    }
    public void DisplayCiyInfo(){
        
        // cards info mouse events
        MarvinGardens.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/MarvinGardens.png");
            }
        });
        
        ventnor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/VentorAvenue.png");
            }
        });
        
        Atlantic.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/AtlanticAvenue.png");
            }
        });
       
        
        Illinois.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/IllinoisAvenue.png");
            }
        });
        
        Indiana.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/IndianaAvenue.png");
            }
        });
        
        Kentucky.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/KentuckyAvenue.png");
            }
        });
        
        Mediter_Ranean.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/MediteraneanAvenue.png");
            }
        });
        
        Baltic.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/BalticAvenue.png");
            }
        });
        
        
        Oriental.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/OrientalAvenue.png");
            }
        });
        
        Vermont.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/VermontAvenue.png");
            }
        });
        
        Connecticut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/ConnectCutAvenue.png");
            }
        });
        
        pacific.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/PacificAvenue.png");
            }
        });
        
        NorthCaro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/NorthCarolina.png");
            }
        });
        
        pennsy.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/Pensylvania.png");
            }
        });
        
       
        
        ParkPlace.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/ParkPlace.png");
            }
        });
        
        NewYork.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/NewYorkAvenue.png");
            }
        });
        
        Tenss.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/TennesseeAvenue.png");
            }
        });
        
        stJames.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/StJamesPlace.png");
            }
        });
        
        
        Virginnia.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/VirginiaAvenue.png");
            }
        });
        
        States.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/StatesAvenue.png");
            }
        });
    
        //this.repaint();
    }
    
    public Gameplay() {
        initComponents();
        DrawGamePlay();
        DisplayCiyInfo();
        JButton btn = new JButton();
        btn.setBounds(55, 0, 65, 35);
        jPanel1.add(btn);
        
        
        new Thread ( new Runnable() {

            @Override
            public void run() {
                for (int i=55;i<55+(70*9);i++){
                    btn.setBounds(i, 0, 65, 35);
                    
                    try {
                        Thread.sleep(1);
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                   // parking.repaint();
                }
                
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }).start();
        
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        go = new GamePlay.Zone();
        jail = new GamePlay.Zone();
        parking = new GamePlay.Zone();
        goToJail = new GamePlay.Zone();
        MarvinGardens = new GamePlay.Zone(24,48,120,360,850,1025,1200,150,150,280,"Yellow");
        ventnor = new GamePlay.Zone(22,44,110,330,800,975,1150,150,150,260,"Yellow");
        Atlantic = new GamePlay.Zone(22,44,110,330,800,975,1150,150,150,260,"Yellow");
        waterWorks = new GamePlay.Zone();
        RailRoad = new GamePlay.Zone();
        Illinois = new GamePlay.Zone(20,40,100,300,750,925,1100,150,150,240,"Red");
        Indiana = new GamePlay.Zone(18,36,90,250,700,875,1050,150,150,220,"Red");
        ChanceBlue = new GamePlay.Zone();
        Kentucky = new GamePlay.Zone(18,36,90,250,700,875,1050,150,150,220,"Red");
        Mediter_Ranean = new GamePlay.Zone(2,4,10,30,90,160,250,50,50,60,"Brown");
        Community_Chest = new GamePlay.Zone();
        Baltic = new GamePlay.Zone(4,8,20,60,180,320,450,50,50,60,"Brown");
        IncomeTax = new GamePlay.Zone();
        RealRoad = new GamePlay.Zone();
        Oriental = new GamePlay.Zone(6,12,30,90,270,400,550,50,50,100,"Light Blue");
        ChanceRed = new GamePlay.Zone();
        Vermont = new GamePlay.Zone(6,12,30,90,270,400,550,50,50,100,"Light Blue");
        Connecticut = new GamePlay.Zone(8,16,40,100,300,450,600,50,50,100,"Light Blue");
        pacific = new GamePlay.Zone(26,52,130,390,900,1100,1275,200,200,300,"Green");
        NorthCaro = new GamePlay.Zone(26,52,130,390,900,1100,1275,200,200,300,"Green");
        communtityChestRight = new GamePlay.Zone();
        pennsy = new GamePlay.Zone(28,56,150,450,1000,1200,1400,200,200,320,"Green");
        shorLline = new GamePlay.Zone();
        OrangeChance = new GamePlay.Zone();
        ParkPlace = new GamePlay.Zone(35,44,175,500,1100,1300,1500,200,200,350,"Dark Blue");
        NewYork = new GamePlay.Zone(16,32,80,220,600,800,1000,50,50,200,"Orange");
        CCT = new GamePlay.Zone();
        stJames = new GamePlay.Zone(14,28,70,200,550,750,950,50,50,180,"Orange");
        pennsyl = new GamePlay.Zone();
        Virginnia = new GamePlay.Zone(12,24,60,180,500,700,900,100,100,160,"Pink");
        States = new GamePlay.Zone(10,20,50,150,450,625,750,100,100,140,"Pink");
        Tenss = new GamePlay.Zone(14,28,70,200,550,750,950,50,50,180,"Orange");
        MONOMAN = new GamePlay.Zone();
        orange = new GamePlay.Zone();
        bluetreasure = new GamePlay.Zone();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 218, 242));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanel1.setLayout(null);

        go.setMaximumSize(new java.awt.Dimension(120, 120));
        go.setMinimumSize(new java.awt.Dimension(120, 120));
        go.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout goLayout = new javax.swing.GroupLayout(go);
        go.setLayout(goLayout);
        goLayout.setHorizontalGroup(
            goLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        goLayout.setVerticalGroup(
            goLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(go);
        go.setBounds(750, 608, 120, 120);

        javax.swing.GroupLayout jailLayout = new javax.swing.GroupLayout(jail);
        jail.setLayout(jailLayout);
        jailLayout.setHorizontalGroup(
            jailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jailLayout.setVerticalGroup(
            jailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jail);
        jail.setBounds(0, 608, 120, 120);

        javax.swing.GroupLayout parkingLayout = new javax.swing.GroupLayout(parking);
        parking.setLayout(parkingLayout);
        parkingLayout.setHorizontalGroup(
            parkingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        parkingLayout.setVerticalGroup(
            parkingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(parking);
        parking.setBounds(0, 0, 120, 120);

        javax.swing.GroupLayout goToJailLayout = new javax.swing.GroupLayout(goToJail);
        goToJail.setLayout(goToJailLayout);
        goToJailLayout.setHorizontalGroup(
            goToJailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        goToJailLayout.setVerticalGroup(
            goToJailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(goToJail);
        goToJail.setBounds(750, 0, 120, 120);

        MarvinGardens.setMaximumSize(new java.awt.Dimension(70, 120));
        MarvinGardens.setMinimumSize(new java.awt.Dimension(70, 120));

        javax.swing.GroupLayout MarvinGardensLayout = new javax.swing.GroupLayout(MarvinGardens);
        MarvinGardens.setLayout(MarvinGardensLayout);
        MarvinGardensLayout.setHorizontalGroup(
            MarvinGardensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        MarvinGardensLayout.setVerticalGroup(
            MarvinGardensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(MarvinGardens);
        MarvinGardens.setBounds(680, 0, 70, 120);

        ventnor.setMaximumSize(new java.awt.Dimension(70, 120));
        ventnor.setMinimumSize(new java.awt.Dimension(70, 120));

        javax.swing.GroupLayout ventnorLayout = new javax.swing.GroupLayout(ventnor);
        ventnor.setLayout(ventnorLayout);
        ventnorLayout.setHorizontalGroup(
            ventnorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        ventnorLayout.setVerticalGroup(
            ventnorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(ventnor);
        ventnor.setBounds(540, 0, 70, 120);

        Atlantic.setMaximumSize(new java.awt.Dimension(70, 120));
        Atlantic.setMinimumSize(new java.awt.Dimension(70, 120));

        javax.swing.GroupLayout AtlanticLayout = new javax.swing.GroupLayout(Atlantic);
        Atlantic.setLayout(AtlanticLayout);
        AtlanticLayout.setHorizontalGroup(
            AtlanticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        AtlanticLayout.setVerticalGroup(
            AtlanticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(Atlantic);
        Atlantic.setBounds(470, 0, 70, 120);

        waterWorks.setMaximumSize(new java.awt.Dimension(70, 120));
        waterWorks.setMinimumSize(new java.awt.Dimension(70, 120));

        javax.swing.GroupLayout waterWorksLayout = new javax.swing.GroupLayout(waterWorks);
        waterWorks.setLayout(waterWorksLayout);
        waterWorksLayout.setHorizontalGroup(
            waterWorksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        waterWorksLayout.setVerticalGroup(
            waterWorksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(waterWorks);
        waterWorks.setBounds(610, 0, 70, 120);

        RailRoad.setMaximumSize(new java.awt.Dimension(70, 120));
        RailRoad.setMinimumSize(new java.awt.Dimension(70, 120));

        javax.swing.GroupLayout RailRoadLayout = new javax.swing.GroupLayout(RailRoad);
        RailRoad.setLayout(RailRoadLayout);
        RailRoadLayout.setHorizontalGroup(
            RailRoadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        RailRoadLayout.setVerticalGroup(
            RailRoadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(RailRoad);
        RailRoad.setBounds(400, 0, 70, 120);

        Illinois.setMaximumSize(new java.awt.Dimension(70, 120));
        Illinois.setMinimumSize(new java.awt.Dimension(70, 120));

        javax.swing.GroupLayout IllinoisLayout = new javax.swing.GroupLayout(Illinois);
        Illinois.setLayout(IllinoisLayout);
        IllinoisLayout.setHorizontalGroup(
            IllinoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        IllinoisLayout.setVerticalGroup(
            IllinoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(Illinois);
        Illinois.setBounds(330, 0, 70, 120);

        Indiana.setMaximumSize(new java.awt.Dimension(70, 120));
        Indiana.setMinimumSize(new java.awt.Dimension(70, 120));

        javax.swing.GroupLayout IndianaLayout = new javax.swing.GroupLayout(Indiana);
        Indiana.setLayout(IndianaLayout);
        IndianaLayout.setHorizontalGroup(
            IndianaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        IndianaLayout.setVerticalGroup(
            IndianaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(Indiana);
        Indiana.setBounds(260, 0, 70, 120);

        ChanceBlue.setMaximumSize(new java.awt.Dimension(70, 120));
        ChanceBlue.setMinimumSize(new java.awt.Dimension(70, 120));

        javax.swing.GroupLayout ChanceBlueLayout = new javax.swing.GroupLayout(ChanceBlue);
        ChanceBlue.setLayout(ChanceBlueLayout);
        ChanceBlueLayout.setHorizontalGroup(
            ChanceBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        ChanceBlueLayout.setVerticalGroup(
            ChanceBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(ChanceBlue);
        ChanceBlue.setBounds(190, 0, 70, 120);

        Kentucky.setMaximumSize(new java.awt.Dimension(70, 120));
        Kentucky.setMinimumSize(new java.awt.Dimension(70, 120));
        Kentucky.setName(""); // NOI18N
        Kentucky.setPreferredSize(new java.awt.Dimension(70, 0));
        Kentucky.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout KentuckyLayout = new javax.swing.GroupLayout(Kentucky);
        Kentucky.setLayout(KentuckyLayout);
        KentuckyLayout.setHorizontalGroup(
            KentuckyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        KentuckyLayout.setVerticalGroup(
            KentuckyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(Kentucky);
        Kentucky.setBounds(120, 0, 70, 120);

        Mediter_Ranean.setMaximumSize(new java.awt.Dimension(70, 120));
        Mediter_Ranean.setMinimumSize(new java.awt.Dimension(70, 120));

        javax.swing.GroupLayout Mediter_RaneanLayout = new javax.swing.GroupLayout(Mediter_Ranean);
        Mediter_Ranean.setLayout(Mediter_RaneanLayout);
        Mediter_RaneanLayout.setHorizontalGroup(
            Mediter_RaneanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        Mediter_RaneanLayout.setVerticalGroup(
            Mediter_RaneanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(Mediter_Ranean);
        Mediter_Ranean.setBounds(680, 608, 70, 120);

        Community_Chest.setMaximumSize(new java.awt.Dimension(70, 120));
        Community_Chest.setMinimumSize(new java.awt.Dimension(70, 120));

        javax.swing.GroupLayout Community_ChestLayout = new javax.swing.GroupLayout(Community_Chest);
        Community_Chest.setLayout(Community_ChestLayout);
        Community_ChestLayout.setHorizontalGroup(
            Community_ChestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        Community_ChestLayout.setVerticalGroup(
            Community_ChestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(Community_Chest);
        Community_Chest.setBounds(610, 608, 70, 120);

        Baltic.setMaximumSize(new java.awt.Dimension(70, 120));
        Baltic.setMinimumSize(new java.awt.Dimension(70, 120));

        javax.swing.GroupLayout BalticLayout = new javax.swing.GroupLayout(Baltic);
        Baltic.setLayout(BalticLayout);
        BalticLayout.setHorizontalGroup(
            BalticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        BalticLayout.setVerticalGroup(
            BalticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(Baltic);
        Baltic.setBounds(540, 608, 70, 120);

        IncomeTax.setMaximumSize(new java.awt.Dimension(70, 120));
        IncomeTax.setMinimumSize(new java.awt.Dimension(70, 120));

        javax.swing.GroupLayout IncomeTaxLayout = new javax.swing.GroupLayout(IncomeTax);
        IncomeTax.setLayout(IncomeTaxLayout);
        IncomeTaxLayout.setHorizontalGroup(
            IncomeTaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        IncomeTaxLayout.setVerticalGroup(
            IncomeTaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(IncomeTax);
        IncomeTax.setBounds(470, 608, 70, 120);

        RealRoad.setMaximumSize(new java.awt.Dimension(70, 120));
        RealRoad.setMinimumSize(new java.awt.Dimension(70, 120));

        javax.swing.GroupLayout RealRoadLayout = new javax.swing.GroupLayout(RealRoad);
        RealRoad.setLayout(RealRoadLayout);
        RealRoadLayout.setHorizontalGroup(
            RealRoadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        RealRoadLayout.setVerticalGroup(
            RealRoadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(RealRoad);
        RealRoad.setBounds(400, 608, 70, 120);

        Oriental.setMaximumSize(new java.awt.Dimension(70, 120));
        Oriental.setMinimumSize(new java.awt.Dimension(70, 120));

        javax.swing.GroupLayout OrientalLayout = new javax.swing.GroupLayout(Oriental);
        Oriental.setLayout(OrientalLayout);
        OrientalLayout.setHorizontalGroup(
            OrientalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        OrientalLayout.setVerticalGroup(
            OrientalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(Oriental);
        Oriental.setBounds(330, 608, 70, 120);

        ChanceRed.setMaximumSize(new java.awt.Dimension(70, 120));
        ChanceRed.setMinimumSize(new java.awt.Dimension(70, 120));

        javax.swing.GroupLayout ChanceRedLayout = new javax.swing.GroupLayout(ChanceRed);
        ChanceRed.setLayout(ChanceRedLayout);
        ChanceRedLayout.setHorizontalGroup(
            ChanceRedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        ChanceRedLayout.setVerticalGroup(
            ChanceRedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(ChanceRed);
        ChanceRed.setBounds(260, 608, 70, 120);

        Vermont.setMaximumSize(new java.awt.Dimension(70, 120));
        Vermont.setMinimumSize(new java.awt.Dimension(70, 120));

        javax.swing.GroupLayout VermontLayout = new javax.swing.GroupLayout(Vermont);
        Vermont.setLayout(VermontLayout);
        VermontLayout.setHorizontalGroup(
            VermontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        VermontLayout.setVerticalGroup(
            VermontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(Vermont);
        Vermont.setBounds(190, 608, 70, 120);

        Connecticut.setMaximumSize(new java.awt.Dimension(70, 120));
        Connecticut.setMinimumSize(new java.awt.Dimension(70, 120));
        Connecticut.setPreferredSize(new java.awt.Dimension(70, 120));

        javax.swing.GroupLayout ConnecticutLayout = new javax.swing.GroupLayout(Connecticut);
        Connecticut.setLayout(ConnecticutLayout);
        ConnecticutLayout.setHorizontalGroup(
            ConnecticutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        ConnecticutLayout.setVerticalGroup(
            ConnecticutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(Connecticut);
        Connecticut.setBounds(120, 608, 70, 120);

        pacific.setPreferredSize(new java.awt.Dimension(120, 70));

        javax.swing.GroupLayout pacificLayout = new javax.swing.GroupLayout(pacific);
        pacific.setLayout(pacificLayout);
        pacificLayout.setHorizontalGroup(
            pacificLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pacificLayout.setVerticalGroup(
            pacificLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(pacific);
        pacific.setBounds(750, 120, 120, 70);

        NorthCaro.setMaximumSize(new java.awt.Dimension(120, 70));
        NorthCaro.setMinimumSize(new java.awt.Dimension(120, 70));
        NorthCaro.setPreferredSize(new java.awt.Dimension(120, 70));

        javax.swing.GroupLayout NorthCaroLayout = new javax.swing.GroupLayout(NorthCaro);
        NorthCaro.setLayout(NorthCaroLayout);
        NorthCaroLayout.setHorizontalGroup(
            NorthCaroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        NorthCaroLayout.setVerticalGroup(
            NorthCaroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(NorthCaro);
        NorthCaro.setBounds(750, 190, 120, 70);

        communtityChestRight.setMaximumSize(new java.awt.Dimension(120, 70));
        communtityChestRight.setMinimumSize(new java.awt.Dimension(120, 70));
        communtityChestRight.setPreferredSize(new java.awt.Dimension(120, 70));

        javax.swing.GroupLayout communtityChestRightLayout = new javax.swing.GroupLayout(communtityChestRight);
        communtityChestRight.setLayout(communtityChestRightLayout);
        communtityChestRightLayout.setHorizontalGroup(
            communtityChestRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        communtityChestRightLayout.setVerticalGroup(
            communtityChestRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(communtityChestRight);
        communtityChestRight.setBounds(750, 260, 120, 70);

        pennsy.setMaximumSize(new java.awt.Dimension(120, 70));
        pennsy.setMinimumSize(new java.awt.Dimension(120, 70));
        pennsy.setName(""); // NOI18N
        pennsy.setPreferredSize(new java.awt.Dimension(120, 70));

        javax.swing.GroupLayout pennsyLayout = new javax.swing.GroupLayout(pennsy);
        pennsy.setLayout(pennsyLayout);
        pennsyLayout.setHorizontalGroup(
            pennsyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pennsyLayout.setVerticalGroup(
            pennsyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(pennsy);
        pennsy.setBounds(750, 330, 120, 70);

        shorLline.setMaximumSize(new java.awt.Dimension(120, 70));
        shorLline.setMinimumSize(new java.awt.Dimension(120, 70));
        shorLline.setPreferredSize(new java.awt.Dimension(120, 70));

        javax.swing.GroupLayout shorLlineLayout = new javax.swing.GroupLayout(shorLline);
        shorLline.setLayout(shorLlineLayout);
        shorLlineLayout.setHorizontalGroup(
            shorLlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        shorLlineLayout.setVerticalGroup(
            shorLlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(shorLline);
        shorLline.setBounds(750, 400, 120, 70);

        OrangeChance.setMaximumSize(new java.awt.Dimension(120, 70));
        OrangeChance.setMinimumSize(new java.awt.Dimension(120, 70));
        OrangeChance.setPreferredSize(new java.awt.Dimension(120, 70));

        javax.swing.GroupLayout OrangeChanceLayout = new javax.swing.GroupLayout(OrangeChance);
        OrangeChance.setLayout(OrangeChanceLayout);
        OrangeChanceLayout.setHorizontalGroup(
            OrangeChanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        OrangeChanceLayout.setVerticalGroup(
            OrangeChanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(OrangeChance);
        OrangeChance.setBounds(750, 470, 120, 70);

        ParkPlace.setMaximumSize(new java.awt.Dimension(120, 70));
        ParkPlace.setMinimumSize(new java.awt.Dimension(120, 70));
        ParkPlace.setPreferredSize(new java.awt.Dimension(120, 70));

        javax.swing.GroupLayout ParkPlaceLayout = new javax.swing.GroupLayout(ParkPlace);
        ParkPlace.setLayout(ParkPlaceLayout);
        ParkPlaceLayout.setHorizontalGroup(
            ParkPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ParkPlaceLayout.setVerticalGroup(
            ParkPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(ParkPlace);
        ParkPlace.setBounds(750, 540, 120, 70);

        javax.swing.GroupLayout NewYorkLayout = new javax.swing.GroupLayout(NewYork);
        NewYork.setLayout(NewYorkLayout);
        NewYorkLayout.setHorizontalGroup(
            NewYorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        NewYorkLayout.setVerticalGroup(
            NewYorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(NewYork);
        NewYork.setBounds(0, 118, 120, 70);

        javax.swing.GroupLayout CCTLayout = new javax.swing.GroupLayout(CCT);
        CCT.setLayout(CCTLayout);
        CCTLayout.setHorizontalGroup(
            CCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        CCTLayout.setVerticalGroup(
            CCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(CCT);
        CCT.setBounds(0, 258, 120, 70);

        stJames.setMaximumSize(new java.awt.Dimension(120, 70));
        stJames.setMinimumSize(new java.awt.Dimension(120, 70));
        stJames.setPreferredSize(new java.awt.Dimension(120, 70));

        javax.swing.GroupLayout stJamesLayout = new javax.swing.GroupLayout(stJames);
        stJames.setLayout(stJamesLayout);
        stJamesLayout.setHorizontalGroup(
            stJamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        stJamesLayout.setVerticalGroup(
            stJamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(stJames);
        stJames.setBounds(0, 328, 120, 70);

        pennsyl.setMaximumSize(new java.awt.Dimension(120, 70));
        pennsyl.setMinimumSize(new java.awt.Dimension(120, 70));
        pennsyl.setPreferredSize(new java.awt.Dimension(120, 70));

        javax.swing.GroupLayout pennsylLayout = new javax.swing.GroupLayout(pennsyl);
        pennsyl.setLayout(pennsylLayout);
        pennsylLayout.setHorizontalGroup(
            pennsylLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pennsylLayout.setVerticalGroup(
            pennsylLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(pennsyl);
        pennsyl.setBounds(0, 398, 120, 70);

        Virginnia.setMaximumSize(new java.awt.Dimension(120, 70));
        Virginnia.setMinimumSize(new java.awt.Dimension(120, 70));
        Virginnia.setPreferredSize(new java.awt.Dimension(120, 70));

        javax.swing.GroupLayout VirginniaLayout = new javax.swing.GroupLayout(Virginnia);
        Virginnia.setLayout(VirginniaLayout);
        VirginniaLayout.setHorizontalGroup(
            VirginniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        VirginniaLayout.setVerticalGroup(
            VirginniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(Virginnia);
        Virginnia.setBounds(0, 468, 120, 70);

        States.setMaximumSize(new java.awt.Dimension(120, 70));
        States.setMinimumSize(new java.awt.Dimension(120, 70));

        javax.swing.GroupLayout StatesLayout = new javax.swing.GroupLayout(States);
        States.setLayout(StatesLayout);
        StatesLayout.setHorizontalGroup(
            StatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        StatesLayout.setVerticalGroup(
            StatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(States);
        States.setBounds(0, 538, 120, 70);

        javax.swing.GroupLayout TenssLayout = new javax.swing.GroupLayout(Tenss);
        Tenss.setLayout(TenssLayout);
        TenssLayout.setHorizontalGroup(
            TenssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        TenssLayout.setVerticalGroup(
            TenssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(Tenss);
        Tenss.setBounds(0, 188, 120, 70);

        javax.swing.GroupLayout MONOMANLayout = new javax.swing.GroupLayout(MONOMAN);
        MONOMAN.setLayout(MONOMANLayout);
        MONOMANLayout.setHorizontalGroup(
            MONOMANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );
        MONOMANLayout.setVerticalGroup(
            MONOMANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        jPanel1.add(MONOMAN);
        MONOMAN.setBounds(281, 248, 281, 228);

        javax.swing.GroupLayout orangeLayout = new javax.swing.GroupLayout(orange);
        orange.setLayout(orangeLayout);
        orangeLayout.setHorizontalGroup(
            orangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );
        orangeLayout.setVerticalGroup(
            orangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );

        jPanel1.add(orange);
        orange.setBounds(600, 443, 137, 139);

        javax.swing.GroupLayout bluetreasureLayout = new javax.swing.GroupLayout(bluetreasure);
        bluetreasure.setLayout(bluetreasureLayout);
        bluetreasureLayout.setHorizontalGroup(
            bluetreasureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        bluetreasureLayout.setVerticalGroup(
            bluetreasureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );

        jPanel1.add(bluetreasure);
        bluetreasure.setBounds(138, 138, 133, 133);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("CONTROLS");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(80, 310, 274, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
      
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gameplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gameplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gameplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gameplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gameplay().setVisible(true);
            }
        });
        
        
        
    }
    
      private static void displayCardInfo(String Path) {
        JOptionPane.showConfirmDialog(null,
                        getCardInfoPanel(Path),
                        "Card Info  ",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE);
    }

    private static JPanel getCardInfoPanel(String Path) {
        JPanel panel = new JPanel();

        String path = Path;
        Image img = null;
        try {
            File imgFile = new File(path);
            img = ImageIO.read(imgFile);
            panel.setBorder(new LineBorder(Color.black, 7));

        } catch(MalformedURLException mue) {
            mue.printStackTrace();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        } 

        JLabel label = new JLabel(new ImageIcon(img));
        panel.add(label);

        return panel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GamePlay.Zone Atlantic;
    private GamePlay.Zone Baltic;
    private GamePlay.Zone CCT;
    private GamePlay.Zone ChanceBlue;
    private GamePlay.Zone ChanceRed;
    private GamePlay.Zone Community_Chest;
    private GamePlay.Zone Connecticut;
    private GamePlay.Zone Illinois;
    private GamePlay.Zone IncomeTax;
    private GamePlay.Zone Indiana;
    private GamePlay.Zone Kentucky;
    private GamePlay.Zone MONOMAN;
    private GamePlay.Zone MarvinGardens;
    private GamePlay.Zone Mediter_Ranean;
    private GamePlay.Zone NewYork;
    private GamePlay.Zone NorthCaro;
    private GamePlay.Zone OrangeChance;
    private GamePlay.Zone Oriental;
    private GamePlay.Zone ParkPlace;
    private GamePlay.Zone RailRoad;
    private GamePlay.Zone RealRoad;
    private GamePlay.Zone States;
    private GamePlay.Zone Tenss;
    private GamePlay.Zone Vermont;
    private GamePlay.Zone Virginnia;
    private GamePlay.Zone bluetreasure;
    private GamePlay.Zone communtityChestRight;
    private GamePlay.Zone go;
    private GamePlay.Zone goToJail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private GamePlay.Zone jail;
    private GamePlay.Zone orange;
    private GamePlay.Zone pacific;
    private GamePlay.Zone parking;
    private GamePlay.Zone pennsy;
    private GamePlay.Zone pennsyl;
    private GamePlay.Zone shorLline;
    private GamePlay.Zone stJames;
    private GamePlay.Zone ventnor;
    private GamePlay.Zone waterWorks;
    // End of variables declaration//GEN-END:variables
}
