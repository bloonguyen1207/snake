/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.StaticObject;

import GamePlay.Classic.Board;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

/**
 *
 * @author Hanh
 */
public class Coins extends StaticObject {
    public Coins() {
        icon = loadImage(icon, "res\\Items\\money-bag.png");
    }   
    
    @Override
    public int specialEffect() {
        return 0;
    }
}
