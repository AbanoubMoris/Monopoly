/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GamePlay0;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Clock;
import java.util.ArrayList;
import java.util.HashMap;
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
import javax.swing.border.LineBorder;
import java.lang.Math;

/**
 *
 * @author lap shop
 */




public class Gameplay extends javax.swing.JFrame {

    Player p0 ,p1 ,p2 ,p3 ,p4 ,p5 ;
    public void DrawGamePlay(){
            
        this.setExtendedState(JFrame.NORMAL); 
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
        
        dice1.setImage("src/GamePlay/img/1.PNG", false);
        dice2.setImage("src/Gameplay/img/1.PNG", false);
        trade_pnl1.setVisible(false);
        player_pnl1.setVisible(false);
        player_pnl2.setVisible(false);
        player_pnl3.setVisible(false);
        player_pnl4.setVisible(false);
        player_pnl5.setVisible(false);
        player_pnl6.setVisible(false);
        
   
    }
    public void DisplayCiyInfo(){
        
        // cards info mouse events
        MarvinGardens.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_select.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/MarvinGardens.png");
            }
        });
        
        ventnor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_select.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/VentorAvenue.png");
            }
        });
        
        Atlantic.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_select.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/AtlanticAvenue.png");
            }
        });
       
        
        Illinois.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_select.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/IllinoisAvenue.png");
            }
        });
        
        Indiana.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_select.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/IndianaAvenue.png");
            }
        });
        
        Kentucky.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_select.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/KentuckyAvenue.png");
            }
        });
        
        Mediter_Ranean.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_select.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/MediteraneanAvenue.png");
            }
        });
        
        Baltic.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_select.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/BalticAvenue.png");
            }
        });
        
        
        Oriental.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_select.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/OrientalAvenue.png");
            }
        });
        
        Vermont.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_select.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/VermontAvenue.png");
            }
        });
        
        Connecticut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_select.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/ConnectCutAvenue.png");
            }
        });
        
        pacific.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_select.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/PacificAvenue.png");
            }
        });
        
        NorthCaro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_select.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/NorthCarolina.png");
            }
        });
        
        pennsy.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_select.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/Pensylvania.png");
            }
        });
        
       
        
        ParkPlace.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_select.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/ParkPlace.png");
            }
        });
        
        NewYork.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_select.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/NewYorkAvenue.png");
            }
        });
        
        Tenss.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_select.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/TennesseeAvenue.png");
            }
        });
        
        stJames.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_select.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/StJamesPlace.png");
            }
        });
        
        
        Virginnia.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_select.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
        
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/VirginiaAvenue.png");
            }
        });
        
        States.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_select.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                displayCardInfo("src/Gameplay/img/cards/StatesAvenue.png");
            }
        });
    
        //this.repaint();
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }
    
    private Thread s;
    PlayerCurrentPostion pos;
    
    //JButton btn1;
    //JButton btn2;
    int playerTurn = -1;
    
    
    Map<Integer,Zone> zoneMap;
    public void zoneMapInitialization()
    {
        zoneMap = new HashMap<Integer, Zone>();
        zoneMap.put(0, go);
        zoneMap.put(1, Mediter_Ranean);
        zoneMap.put(2, Community_Chest);
        zoneMap.put(3, Baltic);
        zoneMap.put(4, IncomeTax);
        zoneMap.put(5, RealRoad);
        zoneMap.put(6, Oriental);
        zoneMap.put(7, ChanceRed);
        zoneMap.put(8, Vermont);
        zoneMap.put(9, Connecticut);
        zoneMap.put(10, jail);
        zoneMap.put(11, States);
        zoneMap.put(12, Virginnia);
        zoneMap.put(13, pennsyl);
        zoneMap.put(14, stJames);
        zoneMap.put(15, CCT);
        zoneMap.put(16, Tenss);
        zoneMap.put(17, NewYork);
        zoneMap.put(18, parking);
        zoneMap.put(19, Kentucky);
        zoneMap.put(20, ChanceBlue);
        zoneMap.put(21, Indiana);
        zoneMap.put(22, Illinois);
        zoneMap.put(23, RailRoad);
        zoneMap.put(24, Atlantic);
        zoneMap.put(25, ventnor);
        zoneMap.put(26, waterWorks);
        zoneMap.put(27, MarvinGardens);
        zoneMap.put(28, goToJail);
        zoneMap.put(29, pacific);
        zoneMap.put(30, NorthCaro);
        zoneMap.put(31, communtityChestRight);
        zoneMap.put(32, pennsy);
        zoneMap.put(33, shorLline);
        zoneMap.put(34, OrangeChance);
        zoneMap.put(35, ParkPlace);
        
    }
    
    public Map<Integer, Zone> getZoneMap() {
        return zoneMap;
    }

    public PlayerCurrentPostion getPos() {
        return pos;
    }
    
    private int NumbOfPlayers;
    private Player[] player;
    private static ArrayList<JButton> Player_Car;
    
    public void IntializePlayers(int NumOfPlayers , Player []player){
        Player_Car = new ArrayList<>();
        for (int i=0;i<NumOfPlayers;i++){
            Player_Car.add(new JButton());
            Player_Car.get(i).setBackground(player[i].getM_color());
            int postion = (i)*20;
            player[i].setM_carXY(postion);
            Player_Car.get(i).setBounds(go.getX(), go.getY()+(go.getWidth()-20-postion), 60, 20);
            jPanel1.add(Player_Car.get(i));
            //player[i]= new Player(player[i].getM_id(), player[i].getM_color(), 7000, false, false); 
            //player[i].setM_id(i);
            player[i].setM_balance(7000);
            player[i].setM_inJail(false);
            player[i].setM_passByGo(false);
        }
      /*  if(NumbOfPlayers == 2 ){
             p0 = new Player(player[0].getM_id(), player[0].getM_color(), 7000, false, false);
             p1 = new Player(player[1].getM_id(), player[1].getM_color(), 7000, false, false);
             System.out.println("in 2");
        } 
        else if(NumbOfPlayers == 3){
             p0 = new Player(player[0].getM_id(), player[0].getM_color(), 7000, false, false);
             p1 = new Player(player[1].getM_id(), player[1].getM_color(), 7000, false, false);
             p2 = new Player(player[2].getM_id(), player[2].getM_color(), 7000, false, false);
            System.out.println("in 3");
        }
        else if (NumbOfPlayers == 4){
             p0 = new Player(player[0].getM_id(), player[0].getM_color(), 7000, false, false);
             p1 = new Player(player[1].getM_id(), player[1].getM_color(), 7000, false, false);
             p2 = new Player(player[2].getM_id(), player[2].getM_color(), 7000, false, false);
             p3 = new Player(player[3].getM_id(), player[3].getM_color(), 7000, false, false);
              System.out.println("in 4");
        }
        else if(NumbOfPlayers == 5){
             p0 = new Player(player[0].getM_id(), player[0].getM_color(), 7000, false, false);
             p1 = new Player(player[1].getM_id(), player[1].getM_color(), 7000, false, false);
             p2 = new Player(player[2].getM_id(), player[2].getM_color(), 7000, false, false);
             p3 = new Player(player[3].getM_id(), player[3].getM_color(), 7000, false, false);
             p4 = new Player(player[4].getM_id(), player[4].getM_color(), 7000, false, false);
              System.out.println("in 5");
        }
        else if(NumbOfPlayers == 6)
        {
             p0 = new Player(player[0].getM_id(), player[0].getM_color(), 7000, false, false);
             p1 = new Player(player[1].getM_id(), player[1].getM_color(), 7000, false, false);
             p2 = new Player(player[2].getM_id(), player[2].getM_color(), 7000, false, false);
             p3 = new Player(player[3].getM_id(), player[3].getM_color(), 7000, false, false);
             p4 = new Player(player[4].getM_id(), player[4].getM_color(), 7000, false, false);
             p5 = new Player(player[5].getM_id(), player[5].getM_color(), 7000, false, false);
              System.out.println("in 6");
        }
        */
    }
    
    public Gameplay(){
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    }
    public Gameplay(int NumOfPlayers , Player[] player ) {
        initComponents();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        
        zoneMapInitialization();
        DrawGamePlay();
        DisplayCiyInfo();
       
        IntializePlayers(NumOfPlayers, player);   
        this.NumbOfPlayers = NumOfPlayers;
        this.player = player;
        pos = new PlayerCurrentPostion();
        DrawPlayers_pnl(NumOfPlayers);    
        
    }
     public void DrawPlayers_pnl(int NumOfPlayers){
        
         if(NumOfPlayers == 2 ){
            player_pnl1.getBalance_lbl().setText(String.valueOf(player[0].getM_balance()));
            player_pnl1.getID_lbl().setText(String.valueOf( player[0].getM_id()));
            player_pnl1.getPlayercolor_pnl().setBackground(player[0].getM_color());
            player_pnl1.setVisible(true);
            
            player_pnl2.getBalance_lbl().setText(String.valueOf(player[1].getM_balance()));
            player_pnl2.getID_lbl().setText(String.valueOf( player[1].getM_id()));
            player_pnl2.getPlayercolor_pnl().setBackground(player[1].getM_color());
            player_pnl2.setVisible(true);
        }
        else if(NumOfPlayers == 3){
            player_pnl1.getBalance_lbl().setText(String.valueOf(player[0].getM_balance()));
            player_pnl1.getID_lbl().setText(String.valueOf(player[0].getM_id()));
            player_pnl1.getPlayercolor_pnl().setBackground(player[0].getM_color());
            player_pnl1.setVisible(true);
           
            player_pnl2.getBalance_lbl().setText(String.valueOf( player[1].getM_balance()));
            player_pnl2.getID_lbl().setText(String.valueOf(player[1].getM_id()));
            player_pnl2.getPlayercolor_pnl().setBackground(player[1].getM_color());
            player_pnl2.setVisible(true);
            
            player_pnl3.getBalance_lbl().setText(String.valueOf( player[2].getM_balance()));
            player_pnl3.getID_lbl().setText(String.valueOf(player[2].getM_id()));
            player_pnl3.getPlayercolor_pnl().setBackground(player[2].getM_color());
            player_pnl3.setVisible(true);
        }
         else if(NumOfPlayers == 4){
            player_pnl1.getBalance_lbl().setText(String.valueOf(player[0].getM_balance()));
            player_pnl1.getID_lbl().setText(String.valueOf(player[0].getM_id()));
            player_pnl1.getPlayercolor_pnl().setBackground(player[0].getM_color());
            player_pnl1.setVisible(true);
           
            player_pnl2.getBalance_lbl().setText(String.valueOf( player[1].getM_balance()));
            player_pnl2.getID_lbl().setText(String.valueOf(player[1].getM_id()));
            player_pnl2.getPlayercolor_pnl().setBackground(player[1].getM_color());
            player_pnl2.setVisible(true);
            
            player_pnl3.getBalance_lbl().setText(String.valueOf( player[2].getM_balance()));
            player_pnl3.getID_lbl().setText(String.valueOf(player[2].getM_id()));
            player_pnl3.getPlayercolor_pnl().setBackground(player[2].getM_color());
            player_pnl3.setVisible(true);
            
            player_pnl4.getBalance_lbl().setText(String.valueOf( player[3].getM_balance()));
            player_pnl4.getID_lbl().setText(String.valueOf(player[3].getM_id()));
            player_pnl4.getPlayercolor_pnl().setBackground(player[3].getM_color());
            player_pnl4.setVisible(true);
        }
         else if(NumOfPlayers == 5){
            player_pnl1.getBalance_lbl().setText(String.valueOf(player[0].getM_balance()));
            player_pnl1.getID_lbl().setText(String.valueOf(player[0].getM_id()));
            player_pnl1.getPlayercolor_pnl().setBackground(player[0].getM_color());
            player_pnl1.setVisible(true);
           
            player_pnl2.setVisible(true);
            player_pnl2.getBalance_lbl().setText(String.valueOf( player[1].getM_balance()));
            player_pnl2.getID_lbl().setText(String.valueOf(player[1].getM_id()));
            player_pnl2.getPlayercolor_pnl().setBackground(player[1].getM_color());
            
            player_pnl3.getBalance_lbl().setText(String.valueOf( player[2].getM_balance()));
            player_pnl3.getID_lbl().setText(String.valueOf(player[2].getM_id()));
            player_pnl3.getPlayercolor_pnl().setBackground(player[2].getM_color());
            player_pnl3.setVisible(true);
            
            player_pnl4.getBalance_lbl().setText(String.valueOf( player[3].getM_balance()));
            player_pnl4.getID_lbl().setText(String.valueOf(player[3].getM_id()));
            player_pnl4.getPlayercolor_pnl().setBackground(player[3].getM_color());
            player_pnl4.setVisible(true);
            
            player_pnl5.getBalance_lbl().setText(String.valueOf( player[4].getM_balance()));
            player_pnl5.getID_lbl().setText(String.valueOf(player[4].getM_id()));
            player_pnl5.getPlayercolor_pnl().setBackground(player[4].getM_color());
            player_pnl5.setVisible(true);
        }
         else if(NumOfPlayers == 6){
            player_pnl1.getBalance_lbl().setText(String.valueOf(player[0].getM_balance()));
            player_pnl1.getID_lbl().setText(String.valueOf(player[0].getM_id()));
            player_pnl1.getPlayercolor_pnl().setBackground(player[0].getM_color());
            player_pnl1.setVisible(true);
           
            player_pnl2.getBalance_lbl().setText(String.valueOf( player[1].getM_balance()));
            player_pnl2.getID_lbl().setText(String.valueOf(player[1].getM_id()));
            player_pnl2.getPlayercolor_pnl().setBackground(player[1].getM_color());
            player_pnl2.setVisible(true);
            
            player_pnl3.getBalance_lbl().setText(String.valueOf( player[2].getM_balance()));
            player_pnl3.getID_lbl().setText(String.valueOf(player[2].getM_id()));
            player_pnl3.getPlayercolor_pnl().setBackground(player[2].getM_color());
            player_pnl3.setVisible(true);
            
            player_pnl4.getBalance_lbl().setText(String.valueOf( player[3].getM_balance()));
            player_pnl4.getID_lbl().setText(String.valueOf(player[3].getM_id()));
            player_pnl4.getPlayercolor_pnl().setBackground(player[3].getM_color());
            player_pnl4.setVisible(true);
            
            player_pnl5.getBalance_lbl().setText(String.valueOf( player[4].getM_balance()));
            player_pnl5.getID_lbl().setText(String.valueOf(player[4].getM_id()));
            player_pnl5.getPlayercolor_pnl().setBackground(player[4].getM_color());
            player_pnl5.setVisible(true);
            
            player_pnl6.getBalance_lbl().setText(String.valueOf( player[5].getM_balance()));
            player_pnl6.getID_lbl().setText(String.valueOf(player[5].getM_id()));
            player_pnl6.getPlayercolor_pnl().setBackground(player[5].getM_color());
            player_pnl6.setVisible(true);
         }
     }   
        
    
        
     
    public void Movement(int NumOfSteps , int x ,int y , int pl){
        //Player_Car.get(pl).setBounds(100, 100, 500, 500);
       //int width = 65;
       //int height = 35;
        jButton3.setEnabled(false);
       int width = 65;
       int height = 20;
        s = new Thread ( new Runnable() {
            
            public void run() {

                int cnt = 0;
                
                while(true){
                     try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_token_thimble_move.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                    int currentX = Player_Car.get(pl).getX();
                    int currentY = Player_Car.get(pl).getY();
                    
                    //UP
                    if(currentX + (parking.getHeight() - currentX) > x && currentX < jPanel1.getWidth() && currentY == y){
                    for (int i=Player_Car.get(pl).getX();i<currentX+70;i++){
                    if(Player_Car.get(pl).getX()+10>=goToJail.getX()){
                       // btn.setBounds(goToJail.getX()+85, 0, height, width);
                        Player_Car.get(pl).setBounds(goToJail.getX() + (goToJail.getWidth()-height-x) , goToJail.getY()+goToJail.getWidth()-width , height , width);
                        //cnt--;
                        break;
                        
                    }
                    else
                        Player_Car.get(pl).setBounds(i, y, width, height);
                    
                    try {
                        Thread.sleep(1);
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
                   
                    } 
                    
                    
                    //LEFT
                    if(currentY>=y && currentY<=jPanel1.getHeight() && currentX == x){
                        for (int i=Player_Car.get(pl).getY() ; i>currentY-70 ;i--){
                            if(Player_Car.get(pl).getY()<=(parking.getWidth())) {
                                Player_Car.get(pl).setBounds(parking.getX()+(parking.getWidth()-width), y, width , height);
                                //cnt--;
                                break;
                            }
                            
                            else
                                Player_Car.get(pl).setBounds(Player_Car.get(pl).getX(), i, height, width);
                    
                            try {
                                Thread.sleep(1);
                                } catch (InterruptedException ex) {
                                Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);} 
                        }
                    }

                   //RIGHT
                    
                    if(currentY + (goToJail.getWidth() - currentY )>=y && currentY<=go.getY()+go.getHeight() && currentX==go.getX()+(go.getWidth()-height-x)){
                        
                        for (int i=currentY ; i < currentY+70 ; i++){
                            if(Player_Car.get(pl).getY()>go.getY()-5){
                                Player_Car.get(pl).setBounds(go.getX(), go.getY()+(go.getWidth()-height-y), width, height);
                                //cnt--;
                                break;
                            }
                            Player_Car.get(pl).setBounds(currentX, i, height, width);
                            
                            try {
                        Thread.sleep(1);
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                        }
                        
                    }
             
               //Down
                   // System.out.println(currentX + " " + (go.getX()+go.getWidth()) + " " + currentY + " " + (go.getY()+(go.getHeight()-height-y)));
                    if (currentX>=0 && currentX<=(go.getX()+go.getWidth()) && currentY == (go.getY()+(go.getHeight()-height-y))){
                       for (int i=currentX ; i>currentX-70 ; i--){
                           if (Player_Car.get(pl).getX() <= x){
                               Player_Car.get(pl).setBounds(x, jail.getY() , height,width);
                               cnt--;
                               break;
                           }
                           else
                           Player_Car.get(pl).setBounds(i, currentY, width,height);
                           
                                try {
                        Thread.sleep(1);
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                           
                       }
                   }
                    

                    cnt++;
                    if(cnt == NumOfSteps)
                    {
                        try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_token_thimble_move.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                        System.out.println(pos.getCurrentPos(pl));
                        if (pos.getCurrentPos(pl) == 2 || pos.getCurrentPos(pl) == 15 || pos.getCurrentPos(pl) == 31) 
                        {
                            DrawingCards("Community Chest");
                        }
                        else if (pos.getCurrentPos(pl) == 7 || pos.getCurrentPos(pl) == 20 || pos.getCurrentPos(pl) == 34) {
                            DrawingCards("Chance");
                        }
                        System.out.println(pos.getCurrentPos(playerTurn) + " --- " + playerTurn);
                        
                        jButton3.setEnabled(true);
                        
                              
                             
                        break;
                    }
                    jPanel1.repaint();  
                }

                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
    private void DrawingCards(String cardType)
    {
        if(cardType == "Community Chest")
        {
            try {
            SoundEffects.PlaySound("src/Gameplay/soundEffects/104207086-game-treasure-06.wav");
                    } catch (IOException ex) {
            Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
        }
            if(card.displayCommunityChestCards()>=-1)
            {
                int currentPos = pos.getCurrentPos(playerTurn);
                int randomNumber = card.ApplyCardEffect("CommunityChest", player[playerTurn],playerTurn,pos,NumbOfPlayers , player);
                if(randomNumber==1)
                {
                    pos.SetPlayer(playerTurn,(36-currentPos)%36);   
                    Movement((36-currentPos)%36,player[playerTurn].getM_carXY(),player[playerTurn].getM_carXY() ,playerTurn); 
                    s.start();
                    //player[playerTurn].setM_balance(player[playerTurn].getM_balance()+200);
                }
                else if(randomNumber==7)
                {
                    pos.SetPlayer(playerTurn,(46-currentPos)%36);   
                    Movement((46-currentPos)%36,player[playerTurn].getM_carXY(),player[playerTurn].getM_carXY() ,playerTurn); 
                    player[playerTurn].setM_inJail(true);
                    s.start();
                }
                updatePlayersBalance();
            }
        }
        else if(cardType == "Chance")
        {
            if(card.displayChanceCards()>=-1)
            {
                int currentPos = pos.getCurrentPos(playerTurn);
                int randomNumber = card.ApplyCardEffect("Chance", player[playerTurn],playerTurn,pos,NumbOfPlayers , player);
                if(randomNumber==1)
                {
                    pos.SetPlayer(playerTurn,(36-currentPos)%36);   
                    Movement((36-currentPos)%36,player[playerTurn].getM_carXY(),player[playerTurn].getM_carXY() ,playerTurn); 
                    s.start();
                    //player[playerTurn].setM_balance(player[playerTurn].getM_balance()+200);
                }
                else if(randomNumber==2)
                {
                    pos.SetPlayer(playerTurn,(58-currentPos)%36);   
                    Movement((58-currentPos)%36,player[playerTurn].getM_carXY(),player[playerTurn].getM_carXY() ,playerTurn); 
                    s.start();
                }
                else if(randomNumber==4 && currentPos == 7)
                {
                    pos.SetPlayer(playerTurn,(49-currentPos)%36);   
                    Movement((49-currentPos)%36,player[playerTurn].getM_carXY(),player[playerTurn].getM_carXY() ,playerTurn); 
                    s.start();
                }
                else if(randomNumber==4 && currentPos == 20)
                {
                    pos.SetPlayer(playerTurn,(59-currentPos)%36);   
                    Movement((59-currentPos)%36,player[playerTurn].getM_carXY(),player[playerTurn].getM_carXY() ,playerTurn); 
                    s.start();
                }
                else if(randomNumber==4 && currentPos == 34)
                {
                    pos.SetPlayer(playerTurn,(41-currentPos)%36);   
                    Movement((41-currentPos)%36,player[playerTurn].getM_carXY(),player[playerTurn].getM_carXY() ,playerTurn); 
                    s.start();
                }
                else if(randomNumber==6)
                {
                    pos.SetPlayer(playerTurn,(62-currentPos)%36);   
                    Movement((62-currentPos)%36,player[playerTurn].getM_carXY(),player[playerTurn].getM_carXY() ,playerTurn); 
                    s.start();
                }
                else if(randomNumber==9)
                {
                    pos.SetPlayer(playerTurn,(46-currentPos)%36);   
                    Movement((46-currentPos)%36,player[playerTurn].getM_carXY(),player[playerTurn].getM_carXY() ,playerTurn); 
                    player[playerTurn].setM_inJail(true);
                    s.start();
                }
                else if(randomNumber==12 && currentPos == 7)
                {
                    pos.SetPlayer(playerTurn,(59-currentPos)%36);   
                    Movement((59-currentPos)%36,player[playerTurn].getM_carXY(),player[playerTurn].getM_carXY() ,playerTurn); 
                    s.start();
                }
                else if(randomNumber==12 && currentPos == 20)
                {
                    pos.SetPlayer(playerTurn,(41-currentPos)%36);   
                    Movement((41-currentPos)%36,player[playerTurn].getM_carXY(),player[playerTurn].getM_carXY() ,playerTurn); 
                    s.start();
                }
                else if(randomNumber==12 && currentPos == 34)
                {
                    pos.SetPlayer(playerTurn,(59-currentPos)%36);   
                    Movement((59-currentPos)%36,player[playerTurn].getM_carXY(),player[playerTurn].getM_carXY() ,playerTurn); 
                    s.start();
                }
                updatePlayersBalance();
            }
        }
    }
    
    private void updatePlayersBalance()
    {
        player_pnl1.getBalance_lbl().setText(String.valueOf(player[0].getM_balance()));
        player_pnl1.setBalance_lbl(player_pnl1.getBalance_lbl());
        player_pnl2.getBalance_lbl().setText(String.valueOf(player[1].getM_balance()));
        player_pnl2.setBalance_lbl(player_pnl2.getBalance_lbl());
        player_pnl3.getBalance_lbl().setText(String.valueOf(player[2].getM_balance()));
        player_pnl3.setBalance_lbl(player_pnl3.getBalance_lbl());
        player_pnl4.getBalance_lbl().setText(String.valueOf(player[3].getM_balance()));
        player_pnl4.setBalance_lbl(player_pnl4.getBalance_lbl());
        player_pnl5.getBalance_lbl().setText(String.valueOf(player[4].getM_balance()));
        player_pnl5.setBalance_lbl(player_pnl5.getBalance_lbl());
        player_pnl6.getBalance_lbl().setText(String.valueOf(player[5].getM_balance()));
        player_pnl6.setBalance_lbl(player_pnl6.getBalance_lbl());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        go = new GamePlay0.Zone(0);
        jail = new GamePlay0.Zone(10);
        parking = new GamePlay0.Zone(18);
        goToJail = new GamePlay0.Zone(28);
        MarvinGardens = new GamePlay0.Zone(24,48,120,360,850,1025,1200,150,150,280,"Yellow",27);
        ventnor = new GamePlay0.Zone(22,44,110,330,800,975,1150,150,150,260,"Yellow",25);
        Atlantic = new GamePlay0.Zone(22,44,110,330,800,975,1150,150,150,260,"Yellow",24);
        waterWorks = new GamePlay0.Zone(26);
        RailRoad = new GamePlay0.Zone(23);
        Illinois = new GamePlay0.Zone(20,40,100,300,750,925,1100,150,150,240,"Red",22);
        Indiana = new GamePlay0.Zone(18,36,90,250,700,875,1050,150,150,220,"Red",21);
        ChanceBlue = new GamePlay0.Zone(20);
        Kentucky = new GamePlay0.Zone(18,36,90,250,700,875,1050,150,150,220,"Red",19);
        Mediter_Ranean = new GamePlay0.Zone(2,4,10,30,90,160,250,50,50,60,"Brown",1);
        Community_Chest = new GamePlay0.Zone(2);
        Baltic = new GamePlay0.Zone(4,8,20,60,180,320,450,50,50,60,"Brown",3);
        IncomeTax = new GamePlay0.Zone(4);
        RealRoad = new GamePlay0.Zone(5);
        Oriental = new GamePlay0.Zone(6,12,30,90,270,400,550,50,50,100,"Light Blue",6);
        ChanceRed = new GamePlay0.Zone(7);
        Vermont = new GamePlay0.Zone(6,12,30,90,270,400,550,50,50,100,"Light Blue",8);
        Connecticut = new GamePlay0.Zone(8,16,40,100,300,450,600,50,50,100,"Light Blue",9);
        pacific = new GamePlay0.Zone(26,52,130,390,900,1100,1275,200,200,300,"Green",29);
        NorthCaro = new GamePlay0.Zone(26,52,130,390,900,1100,1275,200,200,300,"Green",30);
        communtityChestRight = new GamePlay0.Zone(31);
        pennsy = new GamePlay0.Zone(28,56,150,450,1000,1200,1400,200,200,320,"Green",32);
        shorLline = new GamePlay0.Zone(33);
        OrangeChance = new GamePlay0.Zone(34);
        ParkPlace = new GamePlay0.Zone(35,44,175,500,1100,1300,1500,200,200,350,"Dark Blue",35);
        NewYork = new GamePlay0.Zone(16,32,80,220,600,800,1000,50,50,200,"Orange",17);
        CCT = new GamePlay0.Zone(15);
        stJames = new GamePlay0.Zone(14,28,70,200,550,750,950,50,50,180,"Orange",14);
        pennsyl = new GamePlay0.Zone(13);
        Virginnia = new GamePlay0.Zone(12,24,60,180,500,700,900,100,100,160,"Pink",12);
        States = new GamePlay0.Zone(10,20,50,150,450,625,750,100,100,140,"Pink",11);
        Tenss = new GamePlay0.Zone(14,28,70,200,550,750,950,50,50,180,"Orange",16);
        MONOMAN = new GamePlay0.Zone();
        orange = new GamePlay0.Zone();
        bluetreasure = new GamePlay0.Zone();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Trade_btn = new javax.swing.JButton();
        trade_pnl1 = new GamePlay0.trade_pnl();
        jButton3 = new javax.swing.JButton();
        dice2 = new GamePlay0.Dice();
        dice1 = new GamePlay0.Dice();
        player_pnl1 = new GamePlay0.Player_pnl();
        player_pnl2 = new GamePlay0.Player_pnl();
        player_pnl3 = new GamePlay0.Player_pnl();
        player_pnl4 = new GamePlay0.Player_pnl();
        player_pnl5 = new GamePlay0.Player_pnl();
        player_pnl6 = new GamePlay0.Player_pnl();

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

        jLabel2.setText("Player1");

        jLabel3.setText("jLabel3");

        jLabel4.setText("Balance:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(10, 10, 220, 40);

        jLabel5.setText("Player2");

        jLabel6.setText("jLabel3");

        jLabel7.setText("Balance:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(240, 10, 220, 40);

        jButton4.setText("BuyCity");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(10, 710, 69, 23);

        Trade_btn.setText("Trade");
        Trade_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Trade_btnActionPerformed(evt);
            }
        });
        jPanel2.add(Trade_btn);
        Trade_btn.setBounds(380, 710, 73, 23);
        jPanel2.add(trade_pnl1);
        trade_pnl1.setBounds(60, 440, 355, 194);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Roll Dice");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(190, 710, 90, 30);

        javax.swing.GroupLayout dice2Layout = new javax.swing.GroupLayout(dice2);
        dice2.setLayout(dice2Layout);
        dice2Layout.setHorizontalGroup(
            dice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        dice2Layout.setVerticalGroup(
            dice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(dice2);
        dice2.setBounds(240, 640, 70, 60);

        javax.swing.GroupLayout dice1Layout = new javax.swing.GroupLayout(dice1);
        dice1.setLayout(dice1Layout);
        dice1Layout.setHorizontalGroup(
            dice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        dice1Layout.setVerticalGroup(
            dice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(dice1);
        dice1.setBounds(160, 640, 70, 60);
        jPanel2.add(player_pnl1);
        player_pnl1.setBounds(10, 60, 125, 150);
        jPanel2.add(player_pnl2);
        player_pnl2.setBounds(160, 60, 125, 150);
        jPanel2.add(player_pnl3);
        player_pnl3.setBounds(320, 60, 125, 150);
        jPanel2.add(player_pnl4);
        player_pnl4.setBounds(10, 250, 125, 150);
        jPanel2.add(player_pnl5);
        player_pnl5.setBounds(160, 250, 125, 150);
        jPanel2.add(player_pnl6);
        player_pnl6.setBounds(320, 250, 125, 150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Cards card = new Cards();
    
    public void roll_Dice(Dice d){
         switch(d.getDice_value()){
            case 1:
                d.setImage("src/Gameplay/img/1.PNG", false);
                break;
            case 2:
                d.setImage("src/Gameplay/img/2.PNG", false);
                break;
            case 3:
                d.setImage("src/Gameplay/img/3.PNG", false);
                break;
            case 4:
                d.setImage("src/Gameplay/img/4.PNG", false);
                break;
            case 5:
                d.setImage("src/Gameplay/img/5.PNG", false);
                break;
            case 6:
                d.setImage("src/Gameplay/img/6.PNG", false);
                break;    
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_dice_end_1.wav");
                    } catch (IOException ex) {
            Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
        }
        playerTurn++;
        playerTurn%=NumbOfPlayers;
   
        Random r = new Random();
        Random z = new Random();
        dice1.setDice_value(r.nextInt(6)+1);
        dice2.setDice_value(r.nextInt(6)+1);
        roll_Dice(dice1);
        roll_Dice(dice2);
        //System.out.println(playerTurn);
        pos.SetPlayer(playerTurn,dice1.getDice_value()+dice2.getDice_value());
        Movement(dice1.getDice_value()+dice2.getDice_value(),player[playerTurn].getM_carXY(),player[playerTurn].getM_carXY() ,playerTurn);
        s.start();
        //System.out.print("  " + playerTurn);
  
    }//GEN-LAST:event_jButton3ActionPerformed

    ArrayList<Integer> zonesOwned = new ArrayList<>();
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
     /*   int currentPositionPlayer0 = pos.getCurrentPos(0);
        int currentPositionPlayer1 = pos.getCurrentPos(1);
        Zone temp = getZone();

        if (!(p0.m_zonesOwnedIndexes.contains(temp.getM_index())) && !(p1.m_zonesOwnedIndexes.contains(temp.getM_index()))) {
            if (currentPositionPlayer0 == temp.getM_index() && playerTurn == 0 && p0.getM_balance()>=temp.getM_zoneCost()) {
                int newBalance = p0.getM_balance() - temp.getM_zoneCost();
                p0.setM_balance(newBalance);
                p0.m_zonesOwnedIndexes.add(temp.getM_index());
                addPanel(String.valueOf(temp.getM_index()),jPanel3);
            }
        }
        if (!(p1.m_zonesOwnedIndexes.contains(temp.getM_index())) && !(p0.m_zonesOwnedIndexes.contains(temp.getM_index())) ) {
            if (currentPositionPlayer1 == temp.getM_index() && playerTurn == 1 && p0.getM_balance()>=temp.getM_zoneCost()) {
                int newBalance = p1.getM_balance() - temp.getM_zoneCost();
                p1.setM_balance(newBalance);
                p1.m_zonesOwnedIndexes.add(temp.getM_index());
                addPanel(String.valueOf(temp.getM_index()),jPanel4);
                  
            }
        }
        
//        updateBalance();*/
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Trade_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Trade_btnActionPerformed
        // TODO add your handling code here:
        trade_pnl trade_pnl1 = new trade_pnl();
        if(playerTurn == 0){
        trade_pnl1.setP_withdeal(p0);
        trade_pnl1.setP(p1);
        trade_pnl1.getId_lbl1().setText(String.valueOf(p0.getM_id()));
        trade_pnl1.getId_lbl2().setText(String.valueOf(p1.getM_id()));
        trade_pnl1.setZ(zoneMap.get(pos.getCurrentPos(0)));
        Zone temp = getZone();
        System.out.println(p0.m_zonesOwnedIndexes.contains(temp.getM_index()));
        }
        else if (playerTurn == 1)
        {    trade_pnl1.setP_withdeal(p1);
              trade_pnl1.setP(p0);
              trade_pnl1.getId_lbl1().setText(String.valueOf(p0.getM_id()));
               trade_pnl1.getId_lbl2().setText(String.valueOf(p1.getM_id()));
                trade_pnl1.setZ(zoneMap.get(pos.getCurrentPos(1)));
                 Zone temp = getZone();
                  System.out.println(p1.m_zonesOwnedIndexes.contains(temp.getM_index()));
        }
        trade_pnl1.setVisible(true);
      
    }//GEN-LAST:event_Trade_btnActionPerformed
int x1=5,y1=20 , x2=5 , y2=20;
    public void addPanel(String name, JPanel panelName)
    {
        JLabel cityName = new JLabel();
        panelName.add(cityName);
        if (panelName == jPanel3) {
            if (x1 == 180) {
                x1 = 0;
                y1 += 50;
            }

            cityName.setText(name);
            cityName.setBounds(x1, y1, 40, 15);
            cityName.setBackground(Color.red);
            cityName.setOpaque(true);
            x1 += 50;
            
        }
        else if(panelName == jPanel4){
            if (x2 == 180) {
                x2 = 0;
                y2 += 50;
            }

            cityName.setText(name);
            cityName.setLocation(x2, y2);
            cityName.setBackground(Color.CYAN);
            cityName.setOpaque(true);
            x2 += 60;
        }
        
        
    }

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
    
   
    public void updateBalance(){
        String balanceP0 = String.valueOf(p0.getM_balance());
         String balanceP1 = String.valueOf(p1.getM_balance());
         if(Integer.parseInt(balanceP0) >=0)
             jLabel3.setText(balanceP0);
         if(Integer.parseInt(balanceP1) >=0)
             jLabel6.setText(balanceP1);
    }

    public Zone getZone(){
             if((pos.getCurrentPos(0) == 1 && playerTurn == 0) || (pos.getCurrentPos(1) == 1 && playerTurn == 1 ))return  Mediter_Ranean.getData();
        else if((pos.getCurrentPos(0) == 3 && playerTurn == 0) || (pos.getCurrentPos(1) == 3 && playerTurn == 1 ))return  Baltic.getData();
        else if((pos.getCurrentPos(0) == 5 && playerTurn == 0) || (pos.getCurrentPos(1) == 5 && playerTurn == 1 ))return  RealRoad.getData();
        else if((pos.getCurrentPos(0) == 6 && playerTurn == 0) || (pos.getCurrentPos(1) == 6 && playerTurn == 1 ))return  Oriental.getData();
        else if((pos.getCurrentPos(0) == 8 && playerTurn == 0) || (pos.getCurrentPos(1) == 8 && playerTurn == 1 ))return  Vermont.getData();
        else if((pos.getCurrentPos(0) == 9 && playerTurn == 0) || (pos.getCurrentPos(1) == 9 && playerTurn == 1 ))return  Connecticut.getData();
        else if((pos.getCurrentPos(0) == 11 && playerTurn == 0) || (pos.getCurrentPos(1) == 11 && playerTurn == 1 ))return  States.getData();
        else if((pos.getCurrentPos(0) == 12 && playerTurn == 0) || (pos.getCurrentPos(1) == 12 && playerTurn == 1 ))return  Virginnia.getData();
        else if((pos.getCurrentPos(0) == 13 && playerTurn == 0) || (pos.getCurrentPos(1) == 13 && playerTurn == 1 ))return  pennsyl.getData();
        else if((pos.getCurrentPos(0) == 14 && playerTurn == 0) || (pos.getCurrentPos(1) == 14 && playerTurn == 1 ))return  stJames.getData();
        else if((pos.getCurrentPos(0) == 16 && playerTurn == 0) || (pos.getCurrentPos(1) == 16 && playerTurn == 1 ))return  Tenss.getData();
        else if((pos.getCurrentPos(0) == 17 && playerTurn == 0) || (pos.getCurrentPos(1) == 17 && playerTurn == 1 ))return  NewYork.getData();
        else if((pos.getCurrentPos(0) == 19 && playerTurn == 0) || (pos.getCurrentPos(1) == 19 && playerTurn == 1 ))return  Kentucky.getData();
        else if((pos.getCurrentPos(0) == 21 && playerTurn == 0) || (pos.getCurrentPos(1) == 21 && playerTurn == 1 ))return  Indiana.getData();
        else if((pos.getCurrentPos(0) == 22 && playerTurn == 0) || (pos.getCurrentPos(1) == 22 && playerTurn == 1 ))return  Illinois.getData();
        else if((pos.getCurrentPos(0) == 23 && playerTurn == 0) || (pos.getCurrentPos(1) == 23 && playerTurn == 1 ))return  RailRoad.getData();
        else if((pos.getCurrentPos(0) == 24 && playerTurn == 0) || (pos.getCurrentPos(1) == 24 && playerTurn == 1 ))return  Atlantic.getData();
        else if((pos.getCurrentPos(0) == 25 && playerTurn == 0) || (pos.getCurrentPos(1) == 25 && playerTurn == 1 ))return  ventnor.getData();
        else if((pos.getCurrentPos(0) == 26 && playerTurn == 0) || (pos.getCurrentPos(1) == 26 && playerTurn == 1 ))return  waterWorks.getData();
        else if((pos.getCurrentPos(0) == 27 && playerTurn == 0) || (pos.getCurrentPos(1) == 27 && playerTurn == 1 ))return  MarvinGardens.getData();
        else if((pos.getCurrentPos(0) == 29 && playerTurn == 0) || (pos.getCurrentPos(1) == 29 && playerTurn == 1 ))return  pacific.getData();
        else if((pos.getCurrentPos(0) == 30 && playerTurn == 0) || (pos.getCurrentPos(1) == 30 && playerTurn == 1 ))return  NorthCaro.getData();
        else if((pos.getCurrentPos(0) == 32 && playerTurn == 0) || (pos.getCurrentPos(1) == 32 && playerTurn == 1 ))return  pennsy.getData();
        else if((pos.getCurrentPos(0) == 33 && playerTurn == 0) || (pos.getCurrentPos(1) == 33 && playerTurn == 1 ))return  shorLline.getData();
        else if((pos.getCurrentPos(0) == 35 && playerTurn == 0) || (pos.getCurrentPos(1) == 35 && playerTurn == 1 ))return  ParkPlace.getData();
        
        
        return go.getData();
    }
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GamePlay0.Zone Atlantic;
    private GamePlay0.Zone Baltic;
    private GamePlay0.Zone CCT;
    private GamePlay0.Zone ChanceBlue;
    private GamePlay0.Zone ChanceRed;
    private GamePlay0.Zone Community_Chest;
    private GamePlay0.Zone Connecticut;
    private GamePlay0.Zone Illinois;
    private GamePlay0.Zone IncomeTax;
    private GamePlay0.Zone Indiana;
    private GamePlay0.Zone Kentucky;
    private GamePlay0.Zone MONOMAN;
    private GamePlay0.Zone MarvinGardens;
    private GamePlay0.Zone Mediter_Ranean;
    private GamePlay0.Zone NewYork;
    private GamePlay0.Zone NorthCaro;
    private GamePlay0.Zone OrangeChance;
    private GamePlay0.Zone Oriental;
    private GamePlay0.Zone ParkPlace;
    private GamePlay0.Zone RailRoad;
    private GamePlay0.Zone RealRoad;
    private GamePlay0.Zone States;
    private GamePlay0.Zone Tenss;
    private javax.swing.JButton Trade_btn;
    private GamePlay0.Zone Vermont;
    private GamePlay0.Zone Virginnia;
    private GamePlay0.Zone bluetreasure;
    private GamePlay0.Zone communtityChestRight;
    private GamePlay0.Dice dice1;
    private GamePlay0.Dice dice2;
    private GamePlay0.Zone go;
    private GamePlay0.Zone goToJail;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private GamePlay0.Zone jail;
    private GamePlay0.Zone orange;
    private GamePlay0.Zone pacific;
    private GamePlay0.Zone parking;
    private GamePlay0.Zone pennsy;
    private GamePlay0.Zone pennsyl;
    private GamePlay0.Player_pnl player_pnl1;
    private GamePlay0.Player_pnl player_pnl2;
    private GamePlay0.Player_pnl player_pnl3;
    private GamePlay0.Player_pnl player_pnl4;
    private GamePlay0.Player_pnl player_pnl5;
    private GamePlay0.Player_pnl player_pnl6;
    private GamePlay0.Zone shorLline;
    private GamePlay0.Zone stJames;
    private GamePlay0.trade_pnl trade_pnl1;
    private GamePlay0.Zone ventnor;
    private GamePlay0.Zone waterWorks;
    // End of variables declaration//GEN-END:variables
}




