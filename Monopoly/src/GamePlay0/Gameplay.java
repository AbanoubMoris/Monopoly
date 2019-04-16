/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GamePlay0;
import java.awt.Color;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;




public class Gameplay extends javax.swing.JFrame {
    public void DrawGamePlay(){
            
        this.setExtendedState(JFrame.ABORT); 
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
        player_pnl1.setVisible(false);
        player_pnl2.setVisible(false);
        player_pnl3.setVisible(false);
        player_pnl4.setVisible(false);
        player_pnl5.setVisible(false);
        player_pnl6.setVisible(false);
        trade_pnl1.setVisible(false);
        Deal_btn.setVisible(false);
        NoDeal_btn.setVisible(false);
      
   
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

   
    
    private Thread s;
    PlayerCurrentPostion pos;
    
    //JButton btn1;
    //JButton btn2;
    int playerTurn = -1;
    int turn = 0;
    public int getPlayerTurn() {
        return playerTurn;
    }
    
    
    Map<Integer,Zone> zoneMap;
    public void zoneMapInitialization(){
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
            
            player[i].setM_balance(1500);
            player[i].setM_inJail(false);
            player[i].setM_passByGo(false);
        }

    }
    
    public Gameplay(){
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    }
    public Gameplay(int NumOfPlayers , Player[] player ) throws IOException {
        initComponents();
       

        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        
        zoneMapInitialization();
        playerPanelMapInitialization();
        playerPanelAccsessMapInitialization();
        DrawGamePlay();
        DisplayCiyInfo();
        initializeArray();
        
        IntializePlayers(NumOfPlayers, player);   
        this.NumbOfPlayers = NumOfPlayers;
        this.player = player;
        pos = new PlayerCurrentPostion();
        DrawPlayers_pnl(NumOfPlayers);    
        
        B1.setNumAndColor(3, Color.yellow , true);
        IntializeBuildings();
        
    }
    private Map<Integer , Object> build = new HashMap<Integer,Object>();
    
    public void IntializeBuildings(){
        build.put(1, B1);
        build.put(3, B3);
        build.put(5,B5 );
        build.put(6,B6 );
        build.put(8,B8 );
        build.put(9,B9 );
        build.put(11,B11 );
        build.put(12,B12 );
        build.put(13,B13 );
        build.put(14,B14 );
        build.put(16,B16 );
        build.put(17,B17 );
        build.put(19,B19 );
        build.put(21,B21 );
        build.put(22,B22 );
        build.put(23,B23 );
        build.put(24,B24 );
        build.put(25,B25 );
        build.put(27,B27 );
        build.put(29,B29 );
        build.put(30,B30 );
        build.put(32,B32 );
        build.put(33,B33 );
        build.put(35,B35 );
        
        /*
        VBuidings vb =  (VBuidings)build.get(32); 
        vb.getNumOfHouses();
        */
        
    }
    
     public void DrawPlayers_pnl(int NumOfPlayers){
        
         if(NumOfPlayers == 2){
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
        
    
        
    private void PassByGo(){
        player[playerTurn].setM_balance(player[playerTurn].getM_balance()+200);
        updatePlayersBalance();
    } 
    private void GoToJail(){
        //int currentPos = pos.getCurrentPos(playerTurn);
        pos.SetPlayer(playerTurn,18); 
        player[playerTurn].setInJail(2);
        Movement(18,player[playerTurn].getM_carXY(),player[playerTurn].getM_carXY() ,playerTurn); 
        s.start();
    }
     
    public void Movement(int NumOfSteps , int x ,int y , int pl){

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
                    
                     //if pass by go
                    //(pos.getCurrentPos(pl)-cnt)%36==0
                    if ((pos.getCurrentPos(pl)-cnt)%36==0 && (turn-1)!=playerTurn && player[playerTurn].getInJail()==0)
                    {
                        PassByGo();
                    }
                    
                    
                    if(cnt == NumOfSteps)
                    {
                        try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_token_thimble_move.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                        if (pos.getCurrentPos(pl) == 2 || pos.getCurrentPos(pl) == 15 || pos.getCurrentPos(pl) == 31) 
                        {
                            DrawingCards("Community Chest");
                        }
                        else if (pos.getCurrentPos(pl) == 7 || pos.getCurrentPos(pl) == 20 || pos.getCurrentPos(pl) == 34) {
                            DrawingCards("Chance");
                        }
                        else if (pos.getCurrentPos(pl)==10) player[playerTurn].setInJail(2);
                        else if (pos.getCurrentPos(pl)==28){
                             GoToJail();
                        }
                        someConditions();
                        //System.out.println(pl + " -- " + pos.getCurrentPos(pl));
                        jButton3.setEnabled(true);
                        cnt=0;
                        break;
                    }
                    jPanel1.repaint();  
                }

                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    
    private void DrawingCards(String cardType){
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
                }
                else if(randomNumber==7)
                {
                    pos.SetPlayer(playerTurn,(46-currentPos)%36);   
                    Movement((46-currentPos)%36,player[playerTurn].getM_carXY(),player[playerTurn].getM_carXY() ,playerTurn); 
                    //player[playerTurn].setM_inJail(true);
                    player[playerTurn].setInJail(2);
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
                    //player[playerTurn].setM_inJail(true);
                    player[playerTurn].setInJail(2);
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
    
    private void updatePlayersBalance(){
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
        B27 = new GamePlay0.HBuildings();
        ventnor = new GamePlay0.Zone(22,44,110,330,800,975,1150,150,150,260,"Yellow",25);
        B25 = new GamePlay0.HBuildings();
        Atlantic = new GamePlay0.Zone(22,44,110,330,800,975,1150,150,150,260,"Yellow",24);
        B24 = new GamePlay0.HBuildings();
        waterWorks = new GamePlay0.Zone(26);
        RailRoad = new GamePlay0.Zone(23);
        B23 = new GamePlay0.HBuildings();
        Illinois = new GamePlay0.Zone(20,40,100,300,750,925,1100,150,150,240,"Red",22);
        B22 = new GamePlay0.HBuildings();
        Indiana = new GamePlay0.Zone(18,36,90,250,700,875,1050,150,150,220,"Red",21);
        B21 = new GamePlay0.HBuildings();
        ChanceBlue = new GamePlay0.Zone(20);
        Kentucky = new GamePlay0.Zone(18,36,90,250,700,875,1050,150,150,220,"Red",19);
        B19 = new GamePlay0.HBuildings();
        Mediter_Ranean = new GamePlay0.Zone(2,4,10,30,90,160,250,50,50,60,"Brown",1);
        B1 = new GamePlay0.HBuildings();
        Community_Chest = new GamePlay0.Zone(2);
        Baltic = new GamePlay0.Zone(4,8,20,60,180,320,450,50,50,60,"Brown",3);
        B3 = new GamePlay0.HBuildings();
        IncomeTax = new GamePlay0.Zone(4);
        RealRoad = new GamePlay0.Zone(5);
        B5 = new GamePlay0.HBuildings();
        Oriental = new GamePlay0.Zone(6,12,30,90,270,400,550,50,50,100,"Light Blue",6);
        B6 = new GamePlay0.HBuildings();
        ChanceRed = new GamePlay0.Zone(7);
        Vermont = new GamePlay0.Zone(6,12,30,90,270,400,550,50,50,100,"Light Blue",8);
        B8 = new GamePlay0.HBuildings();
        Connecticut = new GamePlay0.Zone(8,16,40,100,300,450,600,50,50,100,"Light Blue",9);
        B9 = new GamePlay0.HBuildings();
        pacific = new GamePlay0.Zone(26,52,130,390,900,1100,1275,200,200,300,"Green",29);
        B29 = new GamePlay0.VBuidings();
        NorthCaro = new GamePlay0.Zone(26,52,130,390,900,1100,1275,200,200,300,"Green",30);
        B30 = new GamePlay0.VBuidings();
        communtityChestRight = new GamePlay0.Zone(31);
        pennsy = new GamePlay0.Zone(28,56,150,450,1000,1200,1400,200,200,320,"Green",32);
        B32 = new GamePlay0.VBuidings();
        shorLline = new GamePlay0.Zone(33);
        B33 = new GamePlay0.VBuidings();
        OrangeChance = new GamePlay0.Zone(34);
        ParkPlace = new GamePlay0.Zone(35,44,175,500,1100,1300,1500,200,200,350,"Dark Blue",35);
        B35 = new GamePlay0.VBuidings();
        NewYork = new GamePlay0.Zone(16,32,80,220,600,800,1000,50,50,200,"Orange",17);
        B17 = new GamePlay0.VBuidings();
        CCT = new GamePlay0.Zone(15);
        stJames = new GamePlay0.Zone(14,28,70,200,550,750,950,50,50,180,"Orange",14);
        B14 = new GamePlay0.VBuidings();
        pennsyl = new GamePlay0.Zone(13);
        B13 = new GamePlay0.VBuidings();
        Virginnia = new GamePlay0.Zone(12,24,60,180,500,700,900,100,100,160,"Pink",12);
        B12 = new GamePlay0.VBuidings();
        States = new GamePlay0.Zone(10,20,50,150,450,625,750,100,100,140,"Pink",11);
        B11 = new GamePlay0.VBuidings();
        Tenss = new GamePlay0.Zone(14,28,70,200,550,750,950,50,50,180,"Orange",16);
        B16 = new GamePlay0.VBuidings();
        MONOMAN = new GamePlay0.Zone();
        orange = new GamePlay0.Zone();
        bluetreasure = new GamePlay0.Zone();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        Trade_btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        dice2 = new GamePlay0.Dice();
        dice1 = new GamePlay0.Dice();
        player_pnl1 = new GamePlay0.Player_pnl();
        player_pnl2 = new GamePlay0.Player_pnl();
        player_pnl3 = new GamePlay0.Player_pnl();
        player_pnl4 = new GamePlay0.Player_pnl();
        player_pnl5 = new GamePlay0.Player_pnl();
        player_pnl6 = new GamePlay0.Player_pnl();
        jButton1 = new javax.swing.JButton();
        trade_pnl1 = new GamePlay0.trade_pnl();
        Deal_btn = new javax.swing.JButton();
        NoDeal_btn = new javax.swing.JButton();
        Sell = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

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
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(go);
        go.setBounds(750, 608, 120, 120);

        javax.swing.GroupLayout jailLayout = new javax.swing.GroupLayout(jail);
        jail.setLayout(jailLayout);
        jailLayout.setHorizontalGroup(
            jailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jailLayout.setVerticalGroup(
            jailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
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
            .addGap(0, 120, Short.MAX_VALUE)
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
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(goToJail);
        goToJail.setBounds(750, 0, 120, 120);

        MarvinGardens.setMaximumSize(new java.awt.Dimension(70, 120));
        MarvinGardens.setMinimumSize(new java.awt.Dimension(70, 120));
        MarvinGardens.setLayout(null);
        MarvinGardens.add(B27);
        B27.setBounds(10, 110, 51, 16);

        jPanel1.add(MarvinGardens);
        MarvinGardens.setBounds(680, 0, 70, 120);

        ventnor.setMaximumSize(new java.awt.Dimension(70, 120));
        ventnor.setMinimumSize(new java.awt.Dimension(70, 120));
        ventnor.setLayout(null);
        ventnor.add(B25);
        B25.setBounds(10, 110, 51, 16);

        jPanel1.add(ventnor);
        ventnor.setBounds(540, 0, 70, 120);

        Atlantic.setMaximumSize(new java.awt.Dimension(70, 120));
        Atlantic.setMinimumSize(new java.awt.Dimension(70, 120));
        Atlantic.setLayout(null);
        Atlantic.add(B24);
        B24.setBounds(10, 110, 51, 16);

        jPanel1.add(Atlantic);
        Atlantic.setBounds(470, 0, 70, 120);

        waterWorks.setMaximumSize(new java.awt.Dimension(70, 120));
        waterWorks.setMinimumSize(new java.awt.Dimension(70, 120));
        waterWorks.setLayout(null);
        jPanel1.add(waterWorks);
        waterWorks.setBounds(610, 0, 70, 120);

        RailRoad.setMaximumSize(new java.awt.Dimension(70, 120));
        RailRoad.setMinimumSize(new java.awt.Dimension(70, 120));
        RailRoad.setLayout(null);
        RailRoad.add(B23);
        B23.setBounds(10, 110, 51, 16);

        jPanel1.add(RailRoad);
        RailRoad.setBounds(400, 0, 70, 120);

        Illinois.setMaximumSize(new java.awt.Dimension(70, 120));
        Illinois.setMinimumSize(new java.awt.Dimension(70, 120));
        Illinois.setLayout(null);
        Illinois.add(B22);
        B22.setBounds(10, 110, 51, 16);

        jPanel1.add(Illinois);
        Illinois.setBounds(330, 0, 70, 120);

        Indiana.setMaximumSize(new java.awt.Dimension(70, 120));
        Indiana.setMinimumSize(new java.awt.Dimension(70, 120));
        Indiana.setLayout(null);
        Indiana.add(B21);
        B21.setBounds(10, 110, 51, 16);

        jPanel1.add(Indiana);
        Indiana.setBounds(260, 0, 70, 120);

        ChanceBlue.setMaximumSize(new java.awt.Dimension(70, 120));
        ChanceBlue.setMinimumSize(new java.awt.Dimension(70, 120));
        ChanceBlue.setLayout(null);
        jPanel1.add(ChanceBlue);
        ChanceBlue.setBounds(190, 0, 70, 120);

        Kentucky.setMaximumSize(new java.awt.Dimension(70, 120));
        Kentucky.setMinimumSize(new java.awt.Dimension(70, 120));
        Kentucky.setName(""); // NOI18N
        Kentucky.setPreferredSize(new java.awt.Dimension(70, 0));
        Kentucky.setVerifyInputWhenFocusTarget(false);
        Kentucky.setLayout(null);
        Kentucky.add(B19);
        B19.setBounds(10, 110, 51, 16);

        jPanel1.add(Kentucky);
        Kentucky.setBounds(120, 0, 70, 120);

        Mediter_Ranean.setMaximumSize(new java.awt.Dimension(70, 120));
        Mediter_Ranean.setMinimumSize(new java.awt.Dimension(70, 120));
        Mediter_Ranean.setLayout(null);
        Mediter_Ranean.add(B1);
        B1.setBounds(10, 0, 51, 16);

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
        Baltic.setLayout(null);
        Baltic.add(B3);
        B3.setBounds(10, 0, 51, 16);

        jPanel1.add(Baltic);
        Baltic.setBounds(540, 608, 70, 120);

        IncomeTax.setMaximumSize(new java.awt.Dimension(70, 120));
        IncomeTax.setMinimumSize(new java.awt.Dimension(70, 120));
        IncomeTax.setLayout(null);
        jPanel1.add(IncomeTax);
        IncomeTax.setBounds(470, 608, 70, 120);

        RealRoad.setMaximumSize(new java.awt.Dimension(70, 120));
        RealRoad.setMinimumSize(new java.awt.Dimension(70, 120));
        RealRoad.setLayout(null);
        RealRoad.add(B5);
        B5.setBounds(10, 0, 51, 16);

        jPanel1.add(RealRoad);
        RealRoad.setBounds(400, 608, 70, 120);

        Oriental.setMaximumSize(new java.awt.Dimension(70, 120));
        Oriental.setMinimumSize(new java.awt.Dimension(70, 120));
        Oriental.setLayout(null);
        Oriental.add(B6);
        B6.setBounds(10, 0, 51, 16);

        jPanel1.add(Oriental);
        Oriental.setBounds(330, 608, 70, 120);

        ChanceRed.setMaximumSize(new java.awt.Dimension(70, 120));
        ChanceRed.setMinimumSize(new java.awt.Dimension(70, 120));
        ChanceRed.setLayout(null);
        jPanel1.add(ChanceRed);
        ChanceRed.setBounds(260, 608, 70, 120);

        Vermont.setMaximumSize(new java.awt.Dimension(70, 120));
        Vermont.setMinimumSize(new java.awt.Dimension(70, 120));
        Vermont.setLayout(null);
        Vermont.add(B8);
        B8.setBounds(10, 0, 51, 16);

        jPanel1.add(Vermont);
        Vermont.setBounds(190, 608, 70, 120);

        Connecticut.setMaximumSize(new java.awt.Dimension(70, 120));
        Connecticut.setMinimumSize(new java.awt.Dimension(70, 120));
        Connecticut.setPreferredSize(new java.awt.Dimension(70, 120));
        Connecticut.setLayout(null);
        Connecticut.add(B9);
        B9.setBounds(10, 0, 51, 16);

        jPanel1.add(Connecticut);
        Connecticut.setBounds(120, 608, 70, 120);

        pacific.setPreferredSize(new java.awt.Dimension(120, 70));
        pacific.setLayout(null);
        pacific.add(B29);
        B29.setBounds(0, 10, 16, 57);

        jPanel1.add(pacific);
        pacific.setBounds(750, 120, 120, 70);

        NorthCaro.setMaximumSize(new java.awt.Dimension(120, 70));
        NorthCaro.setMinimumSize(new java.awt.Dimension(120, 70));
        NorthCaro.setPreferredSize(new java.awt.Dimension(120, 70));
        NorthCaro.setLayout(null);
        NorthCaro.add(B30);
        B30.setBounds(0, 10, 16, 57);

        jPanel1.add(NorthCaro);
        NorthCaro.setBounds(750, 190, 120, 70);

        communtityChestRight.setMaximumSize(new java.awt.Dimension(120, 70));
        communtityChestRight.setMinimumSize(new java.awt.Dimension(120, 70));
        communtityChestRight.setPreferredSize(new java.awt.Dimension(120, 70));
        communtityChestRight.setLayout(null);
        jPanel1.add(communtityChestRight);
        communtityChestRight.setBounds(750, 260, 120, 70);

        pennsy.setMaximumSize(new java.awt.Dimension(120, 70));
        pennsy.setMinimumSize(new java.awt.Dimension(120, 70));
        pennsy.setName(""); // NOI18N
        pennsy.setPreferredSize(new java.awt.Dimension(120, 70));
        pennsy.setLayout(null);
        pennsy.add(B32);
        B32.setBounds(0, 10, 16, 57);

        jPanel1.add(pennsy);
        pennsy.setBounds(750, 330, 120, 70);

        shorLline.setMaximumSize(new java.awt.Dimension(120, 70));
        shorLline.setMinimumSize(new java.awt.Dimension(120, 70));
        shorLline.setPreferredSize(new java.awt.Dimension(120, 70));
        shorLline.setLayout(null);
        shorLline.add(B33);
        B33.setBounds(0, 10, 16, 57);

        jPanel1.add(shorLline);
        shorLline.setBounds(750, 400, 120, 70);

        OrangeChance.setMaximumSize(new java.awt.Dimension(120, 70));
        OrangeChance.setMinimumSize(new java.awt.Dimension(120, 70));
        OrangeChance.setPreferredSize(new java.awt.Dimension(120, 70));
        OrangeChance.setLayout(null);
        jPanel1.add(OrangeChance);
        OrangeChance.setBounds(750, 470, 120, 70);

        ParkPlace.setMaximumSize(new java.awt.Dimension(120, 70));
        ParkPlace.setMinimumSize(new java.awt.Dimension(120, 70));
        ParkPlace.setPreferredSize(new java.awt.Dimension(120, 70));
        ParkPlace.setLayout(null);
        ParkPlace.add(B35);
        B35.setBounds(0, 10, 16, 57);

        jPanel1.add(ParkPlace);
        ParkPlace.setBounds(750, 540, 120, 70);

        NewYork.setLayout(null);
        NewYork.add(B17);
        B17.setBounds(110, 10, 16, 57);

        jPanel1.add(NewYork);
        NewYork.setBounds(0, 118, 120, 70);

        CCT.setLayout(null);
        jPanel1.add(CCT);
        CCT.setBounds(0, 258, 120, 70);

        stJames.setMaximumSize(new java.awt.Dimension(120, 70));
        stJames.setMinimumSize(new java.awt.Dimension(120, 70));
        stJames.setPreferredSize(new java.awt.Dimension(120, 70));
        stJames.setLayout(null);
        stJames.add(B14);
        B14.setBounds(110, 10, 16, 57);

        jPanel1.add(stJames);
        stJames.setBounds(0, 328, 120, 70);

        pennsyl.setMaximumSize(new java.awt.Dimension(120, 70));
        pennsyl.setMinimumSize(new java.awt.Dimension(120, 70));
        pennsyl.setPreferredSize(new java.awt.Dimension(120, 70));
        pennsyl.setLayout(null);
        pennsyl.add(B13);
        B13.setBounds(110, 10, 16, 57);

        jPanel1.add(pennsyl);
        pennsyl.setBounds(0, 398, 120, 70);

        Virginnia.setMaximumSize(new java.awt.Dimension(120, 70));
        Virginnia.setMinimumSize(new java.awt.Dimension(120, 70));
        Virginnia.setPreferredSize(new java.awt.Dimension(120, 70));
        Virginnia.setLayout(null);
        Virginnia.add(B12);
        B12.setBounds(110, 10, 16, 57);

        jPanel1.add(Virginnia);
        Virginnia.setBounds(0, 468, 120, 70);

        States.setMaximumSize(new java.awt.Dimension(120, 70));
        States.setMinimumSize(new java.awt.Dimension(120, 70));
        States.setLayout(null);
        States.add(B11);
        B11.setBounds(110, 10, 16, 57);

        jPanel1.add(States);
        States.setBounds(0, 538, 120, 70);

        Tenss.setLayout(null);
        Tenss.add(B16);
        B16.setBounds(110, 10, 16, 57);

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

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 40, 875, 728);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 102, 0), new java.awt.Color(255, 0, 51), new java.awt.Color(255, 102, 102), new java.awt.Color(204, 0, 102)));
        jPanel2.setLayout(null);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("BuyCity");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(10, 390, 90, 23);

        Trade_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Trade_btn.setText("Trade");
        Trade_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Trade_btnActionPerformed(evt);
            }
        });
        jPanel2.add(Trade_btn);
        Trade_btn.setBounds(240, 390, 90, 23);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Roll Dice");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(190, 680, 90, 30);

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
        dice2.setBounds(240, 610, 70, 60);

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
        dice1.setBounds(160, 610, 70, 60);
        jPanel2.add(player_pnl1);
        player_pnl1.setBounds(10, 10, 120, 150);
        jPanel2.add(player_pnl2);
        player_pnl2.setBounds(160, 10, 120, 150);
        jPanel2.add(player_pnl3);
        player_pnl3.setBounds(320, 10, 120, 150);
        jPanel2.add(player_pnl4);
        player_pnl4.setBounds(10, 200, 120, 150);
        jPanel2.add(player_pnl5);
        player_pnl5.setBounds(160, 200, 120, 150);
        jPanel2.add(player_pnl6);
        player_pnl6.setBounds(320, 200, 120, 150);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Build");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(120, 390, 100, 23);
        jPanel2.add(trade_pnl1);
        trade_pnl1.setBounds(10, 420, 357, 180);

        Deal_btn.setText("Deal");
        Deal_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deal_btnActionPerformed(evt);
            }
        });
        jPanel2.add(Deal_btn);
        Deal_btn.setBounds(370, 460, 80, 25);

        NoDeal_btn.setText("NoDeal");
        NoDeal_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoDeal_btnActionPerformed(evt);
            }
        });
        jPanel2.add(NoDeal_btn);
        NoDeal_btn.setBounds(370, 530, 80, 25);

        Sell.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sell.setText("Sell");
        Sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellActionPerformed(evt);
            }
        });
        jPanel2.add(Sell);
        Sell.setBounds(360, 390, 90, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(893, 40, 463, 717);

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1370, 40);

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
    //go to jail , pay 200 income tax
    private void someConditions()
    {
        if(pos.getCurrentPos(player[playerTurn].getM_id()) == 4)player[playerTurn].setM_balance(player[playerTurn].getM_balance()- 200);
        updatePlayersBalance();
    }
    
    private JPanel jailPanel()
    {
        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(Color.black, 10));
        return panel;
    }
    
    private void showJailPanel()
    {
                UIManager.put("OptionPane.cancelButtonText", "Skip Turn");
                UIManager.put("OptionPane.noButtonText", "Use Card");
                UIManager.put("OptionPane.yesButtonText", "Pay 50$");
                while(true)
                {
                    int input = JOptionPane.showConfirmDialog(jailPanel(),"Pay 50$ to get out of jail or Use a \"Get Out of Jail\" card or Skip your turn" ,"You Are In Jail!" , JOptionPane.YES_NO_CANCEL_OPTION , JOptionPane.PLAIN_MESSAGE);

                    if(input==0)
                    {
                        if(player[playerTurn].getM_balance()>=50)
                        {
                            player[playerTurn].setInJail(0);
                            player[playerTurn].setM_balance(player[playerTurn].getM_balance()-50);
                            updatePlayersBalance();
                            break;
                        }
                        else
                        {
                            try {
                            SoundEffects.PlaySound("src/Gameplay/soundEffects/you dont have enouph money.wav");
                        } catch (IOException ex) {
                            Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        }
                    }
                    else if(input==1)
                    {
                        if(player[playerTurn].getM_getOutOfJailCards()>0)
                        {
                            player[playerTurn].setInJail(0);
                            player[playerTurn].setM_getOutOfJailCards(player[playerTurn].getM_getOutOfJailCards()-1);
                            break;
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "You Dont Have Cards");
                        }
                    }
                    else
                    {
                        break;
                    }
                
                }
            // return them to default
            UIManager.put("OptionPane.cancelButtonText", "Cancel");
            UIManager.put("OptionPane.noButtonText", "No");
            UIManager.put("OptionPane.yesButtonText", "Yes");
            
           // playerTurn++;
           // playerTurn%=NumbOfPlayers;   
    }
    
    private void turnIndicator()
    {
        for(int i=0; i<NumbOfPlayers; i++)
        {
            playerPanelAccessMap.get(i).setBorder(null);
        }
        playerPanelAccessMap.get(playerTurn).setBorder(BorderFactory.createLineBorder(Color.RED,3));
    }
    
   
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            SoundEffects.PlaySound("src/Gameplay/soundEffects/snd_sys_dice_end_1.wav");
                    } catch (IOException ex) {
            Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        turn++;
        playerTurn++;
        playerTurn%=NumbOfPlayers;
        turnIndicator();
        
        //in jail
        if(player[playerTurn].getInJail()>0)
        {
            showJailPanel();
        }
        
        if(player[playerTurn].getInJail()==0)
        {
            Random r = new Random();
            Random z = new Random();
            dice1.setDice_value(r.nextInt(6)+1);
            dice2.setDice_value(r.nextInt(6)+1);
            roll_Dice(dice1);
            roll_Dice(dice2);
            pos.SetPlayer(playerTurn,/*dice1.getDice_value()+dice2.getDice_value()*/1);
            Movement(/*dice1.getDice_value()+dice2.getDice_value()*/1,player[playerTurn].getM_carXY(),player[playerTurn].getM_carXY() ,playerTurn);
            s.start();
            //dice1.getDice_value()+dice2.getDice_value()
        }
        else{
             player[playerTurn].setInJail(player[playerTurn].getInJail()-1);
        }
        
        checkIfZoneIsOwned(pos.getCurrentPos(player[playerTurn].getM_id()) , playerTurn);
        
        
  
        
    }//GEN-LAST:event_jButton3ActionPerformed
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        boolean isOwned = false;
        int index = pos.getCurrentPos(playerTurn);
        for(int i=0; i<NumbOfPlayers; i++)
        {
            if(player[i].m_zonesOwnedIndexes.contains(index))
            {
                
               System.out.println("owned");
               isOwned = true; 
               break;
            }
        }
        if(!isOwned)
        {
            if(zoneMap.get(index).getM_zoneCost()!=0 && player[playerTurn].getM_balance() >= zoneMap.get(index).getM_zoneCost() )
            {
                try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/Cash Register.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                player[playerTurn].addZone(index);
                player[playerTurn].setM_balance(player[playerTurn].getM_balance() - zoneMap.get(index).getM_zoneCost());
                updatePlayersBalance();
                addZoneToPanel(playerTurn, zoneMap.get(index).getM_index());
                zoneMap.get(index).setPlayer_zone(player[playerTurn]);

            }
            else {
                 try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/you dont have enouph money.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    Map<Integer, Panel> playerPanelMap = new HashMap<Integer, Panel>();
    private void playerPanelMapInitialization(){
        
        playerPanelMap.put(0, player_pnl1.getCity());
        playerPanelMap.put(1, player_pnl2.getCity());
        playerPanelMap.put(2, player_pnl3.getCity());
        playerPanelMap.put(3, player_pnl4.getCity());
        playerPanelMap.put(4, player_pnl5.getCity());
        playerPanelMap.put(5, player_pnl6.getCity());
   
    }
     
    
    Map<Integer , Player_pnl>playerPanelAccessMap = new HashMap<Integer, Player_pnl>();
    private void playerPanelAccsessMapInitialization(){
        
        playerPanelAccessMap.put(0, player_pnl1);
        playerPanelAccessMap.put(1, player_pnl2);
        playerPanelAccessMap.put(2, player_pnl3);
        playerPanelAccessMap.put(3, player_pnl4);
        playerPanelAccessMap.put(4, player_pnl5);
        playerPanelAccessMap.put(5, player_pnl6);
   
    }
    
      JLabel lbl;
      int x[] = new int [6];
      int y[] = new int [6];
      public void initializeArray(){
          for(int i=0;i<6;i++){
              x[i]=5;
              y[i]=5;
          }
      }
    private void addZoneToPanel(int id, int city){  
        
       lbl = new JLabel(String.valueOf(city)); //Lma geet a7ot city name kan btb3 null 3shan hya fadya 
        playerPanelMap.get(id).add(lbl);
        for(int i=0; i<6; i++)
            if(playerPanelMap.get(i).getComponentCount() == 1)x[i] = 5;
        
        lbl.setBounds(x[id], y[id], 100, 20);
       lbl.setOpaque(true);
       this.repaint();
        switch (id) {
            case 0:
                if (x[0] < 95) {
                    x[0] += 20;
                } else {
                    y[0] = 20;
                    x[0] = 5;
                }
                 break;
            case 1:
                if (x[1] < 95) {
                    x[1] += 20;
                } else {
                    y[1] = 20;
                    x[1] = 5;
                }
                 break;
            case 2:
                if (x[2] < 95) {
                    x[2] += 20;
                } else {
                    y[2] = 20;
                    x[2] = 5;
                }
                break;
            case 3:
                if (x[3] < 95) {
                    x[3] += 20;
                } else {
                    y[3] = 20;
                    x[3] = 5;
                }
                break;
            case 4:
                if (x[4] < 95) {
                    x[4] += 20;
                } else {
                    y[4] = 20;
                    x[4] = 5;
                }
                break;
            case 5:
                if (x[5] < 95) {
                    x[5] += 20;
                } else {
                    y[5] = 20;
                    x[5] = 5;
                }
                 break;
        }
      // lbl.setBackground(z.getM_color());
      
       
       
       
      
    }
    private void removeZonefromPanel(int id, int city){
        //ab2a zabt deh ya3m el leader
        playerPanelMap.get(id).removeAll();
        for (int i=0 ; i<player[id].m_zonesOwnedIndexes.size();i++){
                addZoneToPanel(id, player[id].m_zonesOwnedIndexes.get(i));
            
        }
        
  /*      
        
        for (Component c : playerPanelMap.get(id).getComponents()) {
            if (c instanceof JLabel && ((JLabel)c).getText().equals(String.valueOf(city))) {
                
                //if (((JLabel)c).getText().equals(String.valueOf(city))){
                    System.out.println("remove -- " + ((JLabel)c).getText() + "  ");
                    playerPanelMap.get(id).remove(((JLabel)c));
               // }
                //((JLabel)c).setText("");
            }
}   
*/
         playerPanelMap.get(id).revalidate();
         playerPanelMap.get(id).repaint();
    }
    private void Trade_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Trade_btnActionPerformed
        // TODO add your handling code here:

    
        if (zoneMap.get(pos.getCurrentPos(playerTurn)).getPlayer_zone() != null &&!player[playerTurn].m_zonesOwnedIndexes.contains(pos.getCurrentPos(player[playerTurn].getM_id()))  ){
            //Trade_btn.setEnabled(false);
        Zone z = zoneMap.get(pos.getCurrentPos(player[playerTurn].getM_id()));
              Player p = z.getPlayer_zone();
         trade_pnl1.setVisible(true);
         Deal_btn.setVisible(true);
         NoDeal_btn.setVisible(true);
         trade_pnl1.getId_lbl1().setText(String.valueOf(player[playerTurn].getM_id()));
         trade_pnl1.getId_lbl2().setText(String.valueOf(p.getM_id()));
             trade_pnl1.getId_lbl1().setBackground(player[playerTurn].getM_color());
             trade_pnl1.getId_lbl2().setBackground(p.getM_color());
          trade_pnl1.validate();
          trade_pnl1.repaint();
        }
    }//GEN-LAST:event_Trade_btnActionPerformed
            
    
    public boolean BuidHotel(int playerTurn ){
       for (int i=0;i<player[playerTurn].m_zonesOwnedIndexes.size();i++){
           try {
              if (player[playerTurn].m_zonesOwnedIndexes.get(i)==1 && player[playerTurn].m_zonesOwnedIndexes.get(i+1)==3){
                  if (pos.getCurrentPos(playerTurn) == 1 || pos.getCurrentPos(playerTurn) == 3)
                  return true;
              }
              

           } catch (Exception e) {
           }
           try {
              if (player[playerTurn].m_zonesOwnedIndexes.get(i)==6 && player[playerTurn].m_zonesOwnedIndexes.get(i+1)==8 && player[playerTurn].m_zonesOwnedIndexes.get(i+2)==9){
                  if (pos.getCurrentPos(playerTurn) == 6 || pos.getCurrentPos(playerTurn) == 8 || pos.getCurrentPos(playerTurn) == 9)
                  return true;}

           } catch (Exception e) {
           }
           try {
              if (player[playerTurn].m_zonesOwnedIndexes.get(i)==11 && player[playerTurn].m_zonesOwnedIndexes.get(i+1)==12){
                  if (pos.getCurrentPos(playerTurn) == 11 || pos.getCurrentPos(playerTurn) == 12)
                  return true;}

           } catch (Exception e) {
           }
           try {
             if (player[playerTurn].m_zonesOwnedIndexes.get(i)==14 && player[playerTurn].m_zonesOwnedIndexes.get(i+1)==16 && player[playerTurn].m_zonesOwnedIndexes.get(i+2)==17){
                 if (pos.getCurrentPos(playerTurn) == 14 || pos.getCurrentPos(playerTurn) == 16 || pos.getCurrentPos(playerTurn) == 17)
                 return true;}

           } catch (Exception e) {
           }
           try {
               if (player[playerTurn].m_zonesOwnedIndexes.get(i)==19 && player[playerTurn].m_zonesOwnedIndexes.get(i+1)==21 && player[playerTurn].m_zonesOwnedIndexes.get(i+2)==22){
                   if (pos.getCurrentPos(playerTurn) == 19 || pos.getCurrentPos(playerTurn) == 21 || pos.getCurrentPos(playerTurn) == 22)
                   return true;}

           } catch (Exception e) {
           }
           try {
                if (player[playerTurn].m_zonesOwnedIndexes.get(i)==24 && player[playerTurn].m_zonesOwnedIndexes.get(i+1)==25 && player[playerTurn].m_zonesOwnedIndexes.get(i+2)==27){
                    if (pos.getCurrentPos(playerTurn) == 24 || pos.getCurrentPos(playerTurn) == 25 || pos.getCurrentPos(playerTurn) == 27)
                    return true;}

           } catch (Exception e) {
           }
           try {
              if (player[playerTurn].m_zonesOwnedIndexes.get(i)==29 && player[playerTurn].m_zonesOwnedIndexes.get(i+1)==30 && player[playerTurn].m_zonesOwnedIndexes.get(i+2)==32){
                  if (pos.getCurrentPos(playerTurn) == 29 || pos.getCurrentPos(playerTurn) == 30 || pos.getCurrentPos(playerTurn) == 32)
                  return true;}

           } catch (Exception e) {
           }
           try {
              if (player[playerTurn].m_zonesOwnedIndexes.get(i)==35){
                  if (pos.getCurrentPos(playerTurn) == 35)
                  return true;}

           } catch (Exception e) {
           }
           try {
              if ((player[playerTurn].m_zonesOwnedIndexes.get(i)==5&&pos.getCurrentPos(playerTurn) == 5) ||
                      (player[playerTurn].m_zonesOwnedIndexes.get(i)==13 && pos.getCurrentPos(playerTurn) == 13)||
                      (player[playerTurn].m_zonesOwnedIndexes.get(i)==23 && pos.getCurrentPos(playerTurn) == 23)||
                      (player[playerTurn].m_zonesOwnedIndexes.get(i)==33 && pos.getCurrentPos(playerTurn) == 33)){
                  
                  return true;}

           } catch (Exception e) {
           }
       } 
       return false;
   }
    public void UpdateBuildings(){
        for (Map.Entry<Integer, Zone> entry : zoneMap.entrySet()) {
        int key = entry.getKey();
        Object value = entry.getValue();
            if ((key>0 && key<10) || (key>18&&key<28)){
                if (build.containsKey(key) ){
                    HBuildings HB = (HBuildings)build.get(key);
                    HB.setNumAndColor(zoneMap.get(key).getM_NumOFBuildedHouses(), null, false);
                    HB.setVisible(false);
                    
                } 
            }
            else {
                if (build.containsKey(key) ){
                    VBuidings VB = (VBuidings)build.get(key);
                    VB.setNumAndColor(zoneMap.get(key).getM_NumOFBuildedHouses(), null, false);
                    VB.setVisible(false);
                } 
            }
        }

    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        for (int i=0;i<player[playerTurn].m_zonesOwnedIndexes.size();i++){
            int currentBalance = player[playerTurn].getM_balance();
            int HouseCost = zoneMap.get(pos.getCurrentPos(playerTurn)).getM_houseCost();
            int Cityidx = player[playerTurn].m_zonesOwnedIndexes.get(i);
            int idx = pos.getCurrentPos(playerTurn);
            
            if (idx == Cityidx){
                if ((currentBalance > HouseCost ) && BuidHotel(playerTurn)){

                int ToBeBuild = zoneMap.get(Cityidx).getM_NumOFBuildedHouses() + 1;
                
                if ( ((idx >0 && idx <10) || (idx >18 && idx <28)) && (!zoneMap.get(Cityidx).isHotelBuilded())){
                    HBuildings HB = (HBuildings)build.get(idx);
                    
                    if(ToBeBuild<=5 && BuidHotel(playerTurn)){
                         try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/zapsplat_impacts_wood.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                        
                        zoneMap.get(Cityidx).setM_NumOFBuildedHouses((zoneMap.get(Cityidx).getM_NumOFBuildedHouses())+1);
                        if (ToBeBuild<=4){
                            HB.setNumAndColor(zoneMap.get(Cityidx).getM_NumOFBuildedHouses(), player[playerTurn].getM_color(), false);
                            player[playerTurn].setM_numberOfHouses(player[playerTurn].getM_numberOfHouses()+1);
                        }
                        else{
                            HB.setNumAndColor(zoneMap.get(Cityidx).getM_NumOFBuildedHouses(), player[playerTurn].getM_color(), true);
                            zoneMap.get(Cityidx).setHotelBuilded(true);
                            player[playerTurn].setM_numberOfHouses(player[playerTurn].getM_numberOfHouses()-4);
                            player[playerTurn].setM_numberOFHotels(player[playerTurn].getM_numberOFHotels()+1);
                        }
                        HB.setVisible(true);
                        build.replace(idx, HB);
                        player[playerTurn].setM_balance(currentBalance - zoneMap.get(Cityidx).getM_houseCost());
                        break;
                    }
                }   
                else {
                    if (!zoneMap.get(Cityidx).isHotelBuilded()){
                        
                        
                    VBuidings VB = (VBuidings)build.get(idx);
                    if(ToBeBuild<=5 && BuidHotel(playerTurn) == true){
                         try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/zapsplat_impacts_wood.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                        
                        zoneMap.get(Cityidx).setM_NumOFBuildedHouses((zoneMap.get(Cityidx).getM_NumOFBuildedHouses())+1);
                        if(ToBeBuild<=4){
                            VB.setNumAndColor(zoneMap.get(Cityidx).getM_NumOFBuildedHouses(), player[playerTurn].getM_color(), false);
                            player[playerTurn].setM_numberOfHouses(player[playerTurn].getM_numberOfHouses()+1);
                        }
                        else {
                            VB.setNumAndColor(zoneMap.get(Cityidx).getM_NumOFBuildedHouses(), player[playerTurn].getM_color(), true);
                            zoneMap.get(Cityidx).setHotelBuilded(true);
                            player[playerTurn].setM_numberOfHouses(player[playerTurn].getM_numberOfHouses()-4);
                            player[playerTurn].setM_numberOFHotels(player[playerTurn].getM_numberOFHotels()+1);
                        }
                        VB.setVisible(true);
                        build.replace(idx, VB);
                        player[playerTurn].setM_balance(currentBalance - zoneMap.get(Cityidx).getM_houseCost());
                        break;
                    }
                    
                }
                }
            }
          else if (currentBalance < HouseCost){
                try {
                    SoundEffects.PlaySound("src/Gameplay/soundEffects/you dont have enouph money.wav");
                } catch (IOException ex) {
                    Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
                }
                 break;
          }
        }
        }
        
        
    updatePlayersBalance();
    repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    private void Deal_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deal_btnActionPerformed
        // TODO add your handling code here:
              Zone z = zoneMap.get(pos.getCurrentPos(player[playerTurn].getM_id()));
              Player p = z.getPlayer_zone();
   
        if(!player[playerTurn].m_zonesOwnedIndexes.contains(pos.getCurrentPos(player[playerTurn].getM_id()))){
            if(p.m_zonesOwnedIndexes.contains(z.getM_index())){
                if(player[playerTurn].getM_balance() >=  Integer.valueOf(trade_pnl1.getMoney_txt().getText())){
                  p.setM_balance(p.getM_balance() + Integer.valueOf(trade_pnl1.getMoney_txt().getText()));
                  player[playerTurn].setM_balance( player[playerTurn].getM_balance() - Integer.valueOf(trade_pnl1.getMoney_txt().getText()));
                  int cityindex =0;
                    for(int i=0;i<p.m_zonesOwnedIndexes.size();i++){
                        if(p.m_zonesOwnedIndexes.contains(z.getM_index()))
                            cityindex = i ;
                    }
                     p.m_zonesOwnedIndexes.remove(cityindex);
                     player[playerTurn].m_zonesOwnedIndexes.add(z.getM_index());
                } 
            }
                     updatePlayersBalance();
                     removeZonefromPanel(p.getM_id(),zoneMap.get(pos.getCurrentPos(playerTurn)).getM_index());
                     addZoneToPanel(playerTurn, zoneMap.get(pos.getCurrentPos(playerTurn)).getM_index());
        }    
           trade_pnl1.setVisible(false);
           Deal_btn.setVisible(false);
           NoDeal_btn.setVisible(false);
    }//GEN-LAST:event_Deal_btnActionPerformed
            
    private void NoDeal_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoDeal_btnActionPerformed
        // TODO add your handling code here:
        trade_pnl1.setVisible(false);
        Deal_btn.setVisible(false);
        NoDeal_btn.setVisible(false);
    }//GEN-LAST:event_NoDeal_btnActionPerformed

    private void SellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellActionPerformed
        // TODO add your handling code here:
        Zone z = zoneMap.get(pos.getCurrentPos(player[playerTurn].getM_id()));
      if(player[playerTurn].m_zonesOwnedIndexes.contains(z.getM_index())){
          if (z.getM_NumOFBuildedHouses()!=0)
            player[playerTurn].setM_balance(player[playerTurn].getM_balance()+ (z.getM_NumOFBuildedHouses() * z.getM_houseCost()) +z.getM_zoneCost() );
          else 
               player[playerTurn].setM_balance(player[playerTurn].getM_balance()+  +z.getM_zoneCost());
        int cityindex =0;
        
                    for(int i=0;i<player[playerTurn].m_zonesOwnedIndexes.size();i++){
                        if(player[playerTurn].m_zonesOwnedIndexes.contains(i))
                            cityindex = i ;
                    }
                     player[playerTurn].m_zonesOwnedIndexes.remove(cityindex);
        updatePlayersBalance();
        removeZonefromPanel(player[playerTurn].getM_id(), cityindex);
        z.setPlayer_zone(null);
        }
      z.setM_NumOFBuildedHouses(0);
      
      UpdateBuildings();
        
     
        
    }//GEN-LAST:event_SellActionPerformed
            
    
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
    private GamePlay0.Zone Atlantic;
    private GamePlay0.HBuildings B1;
    private GamePlay0.VBuidings B11;
    private GamePlay0.VBuidings B12;
    private GamePlay0.VBuidings B13;
    private GamePlay0.VBuidings B14;
    private GamePlay0.VBuidings B16;
    private GamePlay0.VBuidings B17;
    private GamePlay0.HBuildings B19;
    private GamePlay0.HBuildings B21;
    private GamePlay0.HBuildings B22;
    private GamePlay0.HBuildings B23;
    private GamePlay0.HBuildings B24;
    private GamePlay0.HBuildings B25;
    private GamePlay0.HBuildings B27;
    private GamePlay0.VBuidings B29;
    private GamePlay0.HBuildings B3;
    private GamePlay0.VBuidings B30;
    private GamePlay0.VBuidings B32;
    private GamePlay0.VBuidings B33;
    private GamePlay0.VBuidings B35;
    private GamePlay0.HBuildings B5;
    private GamePlay0.HBuildings B6;
    private GamePlay0.HBuildings B8;
    private GamePlay0.HBuildings B9;
    private GamePlay0.Zone Baltic;
    private GamePlay0.Zone CCT;
    private GamePlay0.Zone ChanceBlue;
    private GamePlay0.Zone ChanceRed;
    private GamePlay0.Zone Community_Chest;
    private GamePlay0.Zone Connecticut;
    private javax.swing.JButton Deal_btn;
    private GamePlay0.Zone Illinois;
    private GamePlay0.Zone IncomeTax;
    private GamePlay0.Zone Indiana;
    private GamePlay0.Zone Kentucky;
    private GamePlay0.Zone MONOMAN;
    private GamePlay0.Zone MarvinGardens;
    private GamePlay0.Zone Mediter_Ranean;
    private GamePlay0.Zone NewYork;
    private javax.swing.JButton NoDeal_btn;
    private GamePlay0.Zone NorthCaro;
    private GamePlay0.Zone OrangeChance;
    private GamePlay0.Zone Oriental;
    private GamePlay0.Zone ParkPlace;
    private GamePlay0.Zone RailRoad;
    private GamePlay0.Zone RealRoad;
    private javax.swing.JButton Sell;
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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

    private void checkIfZoneIsOwned(int pos, int id) {
        for(int i=0; i<NumbOfPlayers; i++)
        {
            if(player[i].m_zonesOwnedIndexes.contains(pos))
            {  
                int totalBuildings = zoneMap.get(pos).getM_NumOFBuildedHouses();
                int totalRent = 0;
                switch(totalBuildings)
                {
                    case 0:
                        totalRent = zoneMap.get(pos).getM_rent();
                        break;
                    case 1:
                        totalRent = zoneMap.get(pos).getM_rentWithOneHouse();
                        break;
                    case 2:
                        totalRent = zoneMap.get(pos).getM_rentWithTwoHouses();
                        break;
                        
                    case 3:
                        totalRent = zoneMap.get(pos).getM_rentWithThreeHouses();
                        break;
                        
                    case 4:
                        totalRent = zoneMap.get(pos).getM_rentWithThreeHouses();
                        break;
                        
                    case 5:
                        totalRent = zoneMap.get(pos).getM_rentWithHotel();
                        break;
                    
                }
                player[i].setM_balance(player[i].getM_balance() + totalRent);
                player[id].setM_balance(player[id].getM_balance() - totalRent);
                updatePlayersBalance();
            }
        }
    }




}


