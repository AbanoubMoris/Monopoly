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
import java.util.HashMap;
public class Player {
    private int m_id;
    private Color m_color;
    private int m_balance;
    private boolean m_inJail;
    private boolean m_passByGo;
    private ArrayList<Integer> m_zonesOwnedIndexes;  
    private Map<Integer, Integer> m_numberOfHousesOwned;

    public Player() {
    }

    public Player(int m_id, Color m_color, int m_balance, boolean m_inJail, boolean m_passByGo) {
        this.m_id = m_id;
        this.m_color = m_color;
        this.m_balance = m_balance;
        this.m_inJail = m_inJail;
        this.m_passByGo = m_passByGo;
        m_zonesOwnedIndexes = new ArrayList<Integer>();
        m_numberOfHousesOwned = new HashMap<Integer , Integer>();
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

}
