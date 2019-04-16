/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GamePlay0;
/**
 *
 * @author Ramez
 */
import java.util.Map;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
public class Player {
    private int m_id;
    private Color m_color;
    private int m_carXY;  //postion of car
    private int m_balance;
    private boolean m_inJail;
    private boolean m_passByGo;
    private int m_getOutOfJailCards;
    public ArrayList<Integer> m_zonesOwnedIndexes;  
    private Map<Integer, Integer> m_numberOfHousesOwned;
    private int m_numberOfHouses;
    private int m_numberOFHotels;
    private int inJail;

    public int getM_numberOfHouses() {
        return m_numberOfHouses;
    }

    public void setM_numberOfHouses(int m_numberOfHouses) {
        this.m_numberOfHouses = m_numberOfHouses;
    }

    public int getM_numberOFHotels() {
        return m_numberOFHotels;
    }

    public void setM_numberOFHotels(int m_numberOFHotels) {
        this.m_numberOFHotels = m_numberOFHotels;
    }
    
    public int getInJail() {
        return inJail;
    }

    public void setInJail(int inJail) {
        this.inJail = inJail;
    }



    public Player() {
        inJail=0;
        m_getOutOfJailCards = 0;
        m_inJail = false;
        m_zonesOwnedIndexes = new ArrayList<Integer>();
        m_numberOfHousesOwned = new HashMap<Integer , Integer>();
        m_numberOfHouses = 0;
        m_numberOFHotels = 0;
    }


    public Player(int m_id, Color m_color, int m_balance, boolean m_inJail, boolean m_passByGo) {
        inJail=0;
        this.m_id = m_id;
        this.m_color = m_color;
        this.m_balance = m_balance;
        this.m_inJail = m_inJail;
        this.m_passByGo = m_passByGo;
        m_getOutOfJailCards = 0;
        m_zonesOwnedIndexes = new ArrayList<Integer>();
        m_numberOfHousesOwned = new HashMap<Integer , Integer>();
        m_numberOfHouses = 0;
        m_numberOFHotels = 0;
    }

    public int getM_getOutOfJailCards() {
        return m_getOutOfJailCards;
    }

    public void setM_getOutOfJailCards(int m_getOutOfJailCards) {
        this.m_getOutOfJailCards = m_getOutOfJailCards;
    }

    

    public int getM_carXY() {
        return m_carXY;
    }

    public void setM_carXY(int m_carXY) {
        this.m_carXY = m_carXY;
    }


    
    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public Color getM_color() {
        return m_color;
    }

    public void setM_color(Color m_color) {
        this.m_color = m_color;
    }

    public int getM_balance() {
        return m_balance;
    }

    public void setM_balance(int m_balance) {
        this.m_balance = m_balance;
    }

    public boolean isM_inJail() {
        return m_inJail;
    }

    public void setM_inJail(boolean m_inJail) {
        this.m_inJail = m_inJail;
    }

    public boolean isM_passByGo() {
        return m_passByGo;
    }

    public void setM_passByGo(boolean m_passByGo) {
        this.m_passByGo = m_passByGo;
    }
    
    public void addZone(int index)
    {
        if(!m_zonesOwnedIndexes.contains(index))
           m_zonesOwnedIndexes.add(index);
        Collections.sort(m_zonesOwnedIndexes);
    }
    
   
}
