/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author Taher
 */
public class Dice
{
   Random Dice=new Random();
   int sides1,sides2;
   public int RollDice(JLabel label,JLabel label2)
   {           
   sides1=Dice.nextInt(6)+1;
   sides2=Dice.nextInt(6)+1;
   if(sides1==1){ label.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice1.png")));}
   if(sides1==2){ label.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice2.png")));}
   if(sides1==3){ label.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice3.png")));}
   if(sides1==4){ label.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice4.png")));}
   if(sides1==5){ label.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice5.png")));}
   if(sides1==6){ label.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice6.png")));}
   
   if(sides2==1){ label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice1.png")));}
   if(sides2==2){ label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice2.png")));}
   if(sides2==3){ label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice3.png")));}
   if(sides2==4){ label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice4.png")));}
   if(sides2==5){ label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice5.png")));}
   if(sides2==6){ label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice6.png")));}
  
    return sides1+sides2;
    }
   
}
