/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.*;
/**
 *
 * @author Taherrrrrrr
 */
public class Game extends JFrame {
    
Player[] players ;
Dice dice = new Dice();
int player=0;
int number_of_palyer;  
int number_of_palyer2;  
public ArrayList<City> allcities = new ArrayList<City>();
public ArrayList<Chances_Card> cards = new ArrayList<Chances_Card>();
public ArrayList<Tax> tax = new ArrayList<Tax>();
public ArrayList<Train_station> alltrainstations = new ArrayList<Train_station>();
public ArrayList<Company> companies=new ArrayList<Company>();
public Strarting_point Go;
public Prison prison;
boolean camera=false;
int blue_houses=0 , green_houses=0 ,  grey_houses=0 ,  purple_houses=0 , orange_houses=0 ,  pink_houses=0 ,  red_houses=0 ,  yellow_houses=0;   
boolean blueGroup=false , greenGroup=false , greyGroup=false , purpleGroup=false,orangeGroup=false , pinkGroup=false , redGroup=false , yellowGroup=false;
    public Game() 
    {
    }
    
    public Game(int number_of_palyer)
    {
        
             initComponents();
             buy_btn.setEnabled(false);
             building_house_btn.setEnabled(false);
             building_hotel_btn.setEnabled(false);
             getout_btn.setEnabled(false);/////////////******************************
             jLabel6.setVisible(false);
             jLabel7.setVisible(false);
             jLabel8.setVisible(false);
             jLabel9.setVisible(false);
             
 
        City city01 = new City(1122,750,"CAMP SEARCH LIGHT","purble",60);
        allcities.add(city01);
        City city02 = new City(912,750,"VAULT","purble",60);
        allcities.add(city02);
        
        City city03 = new City(597,750,"NIPTON","grey",100);
        allcities.add(city03);
        City city04 = new City(387,750,"BOULDER CITY","grey",100);
        allcities.add(city04);
        City city05 = new City(282,750,"SLOAN","grey",120);
        allcities.add(city05);
        
        City city06 = new City(177,677,"GOOD SPRINGS","pink",140);
        allcities.add(city06);
        City city07 = new City(177,612,"PRIMM","pink",140);
        allcities.add(city07);
        City city08 = new City(177,482,"FREE SIDE","pink",160);
        allcities.add(city08);
        
        
        City city09 = new City(177,352,"NOVAC","orange",180);
        allcities.add(city09);
        City city10 = new City(177,287,"188 TRAGING POST","orange",180);
        allcities.add(city10);
        City city11 = new City(177,157,"SARSAPARILLA FACTORY","orange",200);
        allcities.add(city11);
        
        
        City city12 = new City(225,92,"MOJAVE OUTPOST","red",220);
        allcities.add(city12);
        City city13 = new City(435,92,"HELIOS ONE","red",220);
        allcities.add(city13);
        City city14 = new City(540,92,"REPCONN TEST SITE","red",240);
        allcities.add(city14);
        
        
        City city15 = new City(750,92,"HIDDEN VALLY","yellow",260);
        allcities.add(city15);
        City city16 = new City(855,92,"JACOB'S TOWN","yellow",260);
        allcities.add(city16);
        City city17 = new City(1065,92,"GUN RANNERS","yellow",280);
        allcities.add(city17);
        
        
        City city18 = new City(1170,139,"NELLIS AIR FORCE BASE","green",300);
        allcities.add(city18);
        City city19 = new City(1170,204,"THE FORT","green",300);
        allcities.add(city19);
        City city20 = new City(1170,334,"CAMP MCCARRAN","green",320);
        allcities.add(city20);
        
        
        City city21 = new City(1170,529,"HOOVER DAM","blue",350);
        allcities.add(city21);
        City city22 = new City(1170,659,"THE STRIP","blue",400);
        allcities.add(city22);
        
        
         city01.setCity_rent(10);
         city02.setCity_rent(10);
         city03.setCity_rent(15);
         city04.setCity_rent(15);
         city05.setCity_rent(20);
         city06.setCity_rent(25);
         city07.setCity_rent(25);
         city08.setCity_rent(30);
         city09.setCity_rent(30);
         city10.setCity_rent(30);
         city11.setCity_rent(35);
         city12.setCity_rent(35);
         city13.setCity_rent(35);
         city14.setCity_rent(35);
         city15.setCity_rent(40);
         city16.setCity_rent(40);
         city17.setCity_rent(40);
         city18.setCity_rent(45);
         city19.setCity_rent(45);
         city20.setCity_rent(45);
         city21.setCity_rent(50);
         city22.setCity_rent(50);
         
        Chances_Card card1=new Chances_Card(1017,750);
        cards.add(card1);
        Chances_Card card2=new Chances_Card(492,750);
        cards.add(card2);
        Chances_Card card3=new Chances_Card(177,222);
        cards.add(card3);
        Chances_Card card4=new Chances_Card(330,92);
        cards.add(card4);
        Chances_Card card5=new Chances_Card(1170,269);
        cards.add(card5);
        Chances_Card card6=new Chances_Card(1170,464);
        cards.add(card6);
         
        Tax tax1=new Tax(807,750,200);
        tax.add(tax1);
        Tax tax2=new Tax(1170,594,75);
        tax.add(tax2);
        
        Train_station station1=new Train_station(702,750,"South NCR Monorail",200);
        station1.trainstation_rent(35);
        alltrainstations.add(station1);
        
        Train_station station2=new Train_station(177,417,"West NCR Monorail",200);
        station2.trainstation_rent(35);
        alltrainstations.add(station2);
        
        Train_station station3=new Train_station(645,92,"North NCR Monorail",200);
        station3.trainstation_rent(35);
        alltrainstations.add(station3);
        
        Train_station station4=new Train_station(1170,399,"East NCR Monorail",200);
        station4.trainstation_rent(35);
        alltrainstations.add(station4);
        
        Company company1 = new Company(177, 547,"Poseidon Energy", 150);
        company1.company_rent(20);
        companies.add(company1);
        Company company2 = new Company(960,92,"Lake Mead", 150);
        company2.company_rent(20);
        companies.add(company2);
        card_panel.setVisible(false);
        
        
        Go=new Strarting_point();
        prison = new Prison();    
     ////////////////////////////********************************************************************************
        ImageIcon my=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("board1.jpg")));
        Image img1=my.getImage().getScaledInstance(board_photo.getWidth(),board_photo.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i=new ImageIcon(img1);
        board_photo.setIcon(i);
    ////////////////////////////**********************************************************************************    
        this.number_of_palyer=number_of_palyer;
        this.number_of_palyer2=number_of_palyer;
        players = new Player[number_of_palyer] ;
        
        Dimension size = player_1_mark.getPreferredSize();
        player_1_mark.setBounds(1227, 725, size.width, size.height);
        
        Dimension size2 = player_2_mark.getPreferredSize();
        player_2_mark.setBounds(1300, 725, size.width, size.height);
        
        if(number_of_palyer==2){
        player_3_mark.setVisible(false);
        player_4_mark.setVisible(false);
        }
        if(number_of_palyer==3){
        Dimension size3 = player_3_mark.getPreferredSize();
        player_3_mark.setBounds(1227, 775, size.width, size.height);
        player_4_mark.setVisible(false);
        }
         if(number_of_palyer==4){
        Dimension size3 = player_3_mark.getPreferredSize();
        player_3_mark.setBounds(1227, 775, size.width, size.height);
         Dimension size4 = player_4_mark.getPreferredSize();
        player_4_mark.setBounds(1300, 775, size.width, size.height);
         }   
        ////////////////////////////**********************************************************************************      
         
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        for(int j=0;j<number_of_palyer;j++){
        players[j]=new Player(String.valueOf(j));
        }
        SetPlayerInfo();
    }//public Game(int number_of_palyer)
    
        public void property_of_player(int index)
        {
        jComboBox1.removeAllItems();
        for(int i=0;i<players[index].getProperty().size();i++){
        
        jComboBox1.addItem(players[index].getProperty().get(i));
        }
    
    
        }
////////////////////////////**********************************************************************************      
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        buy_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        throw_dice = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        player_4_money = new javax.swing.JLabel();
        player_3_money = new javax.swing.JLabel();
        player_2_money = new javax.swing.JLabel();
        player_1_money = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        city_price_lbl = new javax.swing.JLabel();
        city_name_lbl = new javax.swing.JLabel();
        city_rent_lbl = new javax.swing.JLabel();
        cities = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        building_hotel_btn = new javax.swing.JButton();
        building_house_btn = new javax.swing.JButton();
        getout_btn = new javax.swing.JButton();
        playnow = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        player_1_mark = new javax.swing.JLabel();
        player_2_mark = new javax.swing.JLabel();
        player_3_mark = new javax.swing.JLabel();
        player_4_mark = new javax.swing.JLabel();
        card_panel = new javax.swing.JPanel();
        card_button = new javax.swing.JButton();
        card_text = new javax.swing.JLabel();
        card_label = new javax.swing.JLabel();
        board_photo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1500, 1500));

        jPanel1.setBackground(new java.awt.Color(102, 51, 0));

        buy_btn.setBackground(new java.awt.Color(0, 51, 51));
        buy_btn.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        buy_btn.setForeground(new java.awt.Color(204, 255, 255));
        buy_btn.setText("Buy");
        buy_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy_btnActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/roll.gif"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/roll.gif"))); // NOI18N

        throw_dice.setBackground(new java.awt.Color(0, 51, 51));
        throw_dice.setFont(new java.awt.Font("Andalus", 1, 12)); // NOI18N
        throw_dice.setForeground(new java.awt.Color(204, 255, 255));
        throw_dice.setText("Throw");
        throw_dice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                throw_diceActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 51, 0));
        jPanel3.setLayout(null);

        player_4_money.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        player_4_money.setForeground(new java.awt.Color(255, 255, 255));
        player_4_money.setText("Player 4 :");
        jPanel3.add(player_4_money);
        player_4_money.setBounds(20, 210, 160, 28);

        player_3_money.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        player_3_money.setForeground(new java.awt.Color(255, 255, 255));
        player_3_money.setText("Player 3 :");
        jPanel3.add(player_3_money);
        player_3_money.setBounds(20, 170, 160, 28);

        player_2_money.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        player_2_money.setForeground(new java.awt.Color(255, 255, 255));
        player_2_money.setText("Player 2 :");
        jPanel3.add(player_2_money);
        player_2_money.setBounds(20, 130, 160, 28);

        player_1_money.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        player_1_money.setForeground(new java.awt.Color(255, 255, 255));
        player_1_money.setText("Player 1 :");
        jPanel3.add(player_1_money);
        player_1_money.setBounds(20, 90, 160, 28);

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Andalus", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/ddddd.png"))); // NOI18N
        jLabel2.setText("Camera");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(-10, 0, 270, 390);

        jComboBox1.setBackground(new java.awt.Color(102, 51, 0));
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(0, 340, 220, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Your property :");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 290, 210, 29);

        jLabel6.setBackground(new java.awt.Color(255, 102, 102));
        jLabel6.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("City Name :");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 420, 80, 30);

        jLabel7.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("City Price :");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(30, 490, 80, 22);

        jLabel8.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("City Rent :");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(30, 550, 80, 22);

        city_price_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(city_price_lbl);
        city_price_lbl.setBounds(30, 520, 170, 30);

        city_name_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(city_name_lbl);
        city_name_lbl.setBounds(30, 450, 180, 30);

        city_rent_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(city_rent_lbl);
        city_rent_lbl.setBounds(30, 580, 180, 30);

        cities.setForeground(new java.awt.Color(255, 255, 255));
        cities.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/ddddd.png"))); // NOI18N
        cities.setText("CITY NANE");
        jPanel3.add(cities);
        cities.setBounds(-10, 360, 240, 310);

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Camera");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(70, 20, 110, 31);

        building_hotel_btn.setBackground(new java.awt.Color(0, 51, 51));
        building_hotel_btn.setFont(new java.awt.Font("Andalus", 1, 12)); // NOI18N
        building_hotel_btn.setForeground(new java.awt.Color(204, 255, 255));
        building_hotel_btn.setText("Build Hotel");
        building_hotel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                building_hotel_btnActionPerformed(evt);
            }
        });

        building_house_btn.setBackground(new java.awt.Color(0, 51, 51));
        building_house_btn.setFont(new java.awt.Font("Andalus", 1, 12)); // NOI18N
        building_house_btn.setForeground(new java.awt.Color(204, 255, 255));
        building_house_btn.setText("Build House");
        building_house_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                building_house_btnActionPerformed(evt);
            }
        });

        getout_btn.setBackground(new java.awt.Color(0, 51, 51));
        getout_btn.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        getout_btn.setForeground(new java.awt.Color(204, 255, 255));
        getout_btn.setText("Get Out");
        getout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getout_btnActionPerformed(evt);
            }
        });

        playnow.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        playnow.setForeground(new java.awt.Color(255, 255, 255));
        playnow.setText("Start  play");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(throw_dice)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buy_btn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(getout_btn))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(playnow)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 16, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(building_house_btn)
                        .addGap(18, 18, 18)
                        .addComponent(building_hotel_btn)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playnow)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getout_btn)
                    .addComponent(buy_btn)
                    .addComponent(throw_dice))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(building_hotel_btn)
                    .addComponent(building_house_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane2.setLeftComponent(jPanel1);

        jPanel2.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/3590442.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(60, 20, 1280, 830);

        player_1_mark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/1.png"))); // NOI18N
        jPanel2.add(player_1_mark);
        player_1_mark.setBounds(120, 210, 40, 40);

        player_2_mark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/2.png"))); // NOI18N
        jPanel2.add(player_2_mark);
        player_2_mark.setBounds(120, 270, 40, 40);

        player_3_mark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/3.png"))); // NOI18N
        jPanel2.add(player_3_mark);
        player_3_mark.setBounds(90, 330, 40, 40);

        player_4_mark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/4.png"))); // NOI18N
        jPanel2.add(player_4_mark);
        player_4_mark.setBounds(70, 270, 40, 40);

        card_panel.setBackground(new java.awt.Color(255, 255, 204));
        card_panel.setLayout(null);

        card_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/gooo.png"))); // NOI18N
        card_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card_buttonActionPerformed(evt);
            }
        });
        card_panel.add(card_button);
        card_button.setBounds(140, 170, 80, 80);

        card_text.setFont(new java.awt.Font("Yu Gothic UI", 2, 18)); // NOI18N
        card_text.setText("sorry you should pay 200");
        card_panel.add(card_text);
        card_text.setBounds(50, 30, 270, 110);

        card_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/card.jpg"))); // NOI18N
        card_panel.add(card_label);
        card_label.setBounds(0, 0, 370, 300);

        jPanel2.add(card_panel);
        card_panel.setBounds(350, 290, 370, 300);

        board_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/board1.jpg"))); // NOI18N
        board_photo.setText("jLabel1");
        jPanel2.add(board_photo);
        board_photo.setBounds(0, 0, 1390, 860);

        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(930, 60, 41, 16);

        jSplitPane2.setRightComponent(jPanel2);

        getContentPane().add(jSplitPane2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void MoveMark(int result){
          
  getout_btn.setEnabled(true);  
  if(player==number_of_palyer){
        player=0;
        }
   
  if(players[player].isGetout()==true)
  {
      if(player==0){player_1_mark.setVisible(false);
      }
       if(player==1){player_2_mark.setVisible(false);}
       if(player==2){ player_3_mark.setVisible(false);}
       if(player==3){player_4_mark.setVisible(false); }
   
   player++;
   if(player==number_of_palyer){ player=0; }
 
  }
  
     if(players[player].isInjail()==true){
        players[player].setInjail(false);
        player++;
        if(player==number_of_palyer){ player=0; }
        }
    
     if(player==0){playnow.setText("player   1");}
        if(player==1){playnow.setText("player    2");}
        if(player==2){playnow.setText("player     3");}
        if(player==3){playnow.setText("player     4");}
        
        if(player==0){
          players[player].move(player_1_mark,1,player);
            property_of_player(player);
          player++;
          
        }
        else if(player==1){
          players[player].move(player_2_mark,result,player);
          property_of_player(player);
          player++;   
        }
        
          else if(player==2&&player<number_of_palyer){
          players[player].move(player_3_mark,result,player);
          property_of_player(player);
          player++;   
        }
          else if(player==3&&player<number_of_palyer){

          players[player].move(player_4_mark,result,player);
          property_of_player(player);
        player++;   

        }
        ////////////////////////////**********************************************************************************      
         
        if(search() instanceof Strarting_point){go(player-1);}
        if(search() instanceof Tax){get_tax(player-1);}
        if(search() instanceof Chances_Card){get_cards(player-1);}
        
           
         
        if(search() instanceof Train_station)
        {
            if(!((Train_station) search()).isIsowned())
            {
                buy_btn.setEnabled(true);
            }
            else 
            {
                buy_btn.setEnabled(false);
                 if(!((Train_station) search()).getOwner().getPlayerName().equals(players[player-1].getPlayerName()))
                 {
                   players[player-1].pay(((Train_station) search()).getOwner() , ((Train_station)search()).getmoney());
                   
                  JOptionPane.showMessageDialog(null, "This Train_station is selled you have to pay "+((Train_station) search()).getTrain_rent() , "Message" ,JOptionPane.INFORMATION_MESSAGE );
                 }
            }
        }
        
       if(search() instanceof City)
        {
            if(!((City) search()).isIsowned()) 
            {
                buy_btn.setEnabled(true);
            }
            else
            {
                
                 buy_btn.setEnabled(false);
                 if(!((City) search()).getOwner().getPlayerName().equals(players[player-1].getPlayerName()))
                 {
                  players[player-1].pay(((City) search()).getOwner() , ((City) search()).getmoney());
                  JOptionPane.showMessageDialog(null, "This City is selled you have to pay "+((City) search()).getCity_rent(), "Message" ,JOptionPane.INFORMATION_MESSAGE );
                 }
             
            }
        }

       if(search() instanceof Company)
        {
            if(!((Company) search()).isIsowned())
            {
                buy_btn.setEnabled(true);
                
            }
            else 
            {
                buy_btn.setEnabled(false);
                 if(!((Company) search()).getOwner().getPlayerName().equals(players[player-1].getPlayerName()))
                 {
                   players[player-1].pay(((Company) search()).getOwner() , ((Company)search()).getmoney());
                   JOptionPane.showMessageDialog(null, "This Company is selled you have to pay "+((Company) search()).getRent() , "Message" ,JOptionPane.INFORMATION_MESSAGE );
                 }
               
            }
        }
     
SetPlayerInfo();
SetCityInfo();


}
    private void throw_diceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_throw_diceActionPerformed
      
        int result=0;
        if(!camera){
        result = dice.RollDice(jLabel3, jLabel4);
        }
       if(camera){
       camera=false;
    File temp=new File("copy.txt");
        Scanner file;
    try {
        file = new Scanner(temp);
        result=Integer.valueOf(file.nextLine());
        System.out.println(Integer.valueOf(file.nextLine()));
    } catch(Exception ex) {
       // Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
    }
       }
       MoveMark(result);
     //throw??
    }//GEN-LAST:event_throw_diceActionPerformed
    public void SetPlayerInfo()
    {
    if(number_of_palyer==2){
        player_1_money.setText("Player 1 : "+String.valueOf(players[0].getPlayerMoney()));
        player_2_money.setText("Player 2 : "+String.valueOf(players[1].getPlayerMoney()));
        player_3_money.setText("");
        player_4_money.setText("");
        
           
    }
    if(number_of_palyer==3){
        player_1_money.setText("Player 1 : "+String.valueOf(players[0].getPlayerMoney()));
        player_2_money.setText("Player 2 : "+String.valueOf(players[1].getPlayerMoney()));
        player_3_money.setText("Player 3 : "+String.valueOf(players[2].getPlayerMoney()));
        player_4_money.setText("");
    }
    if(number_of_palyer==4){
        player_1_money.setText("Player 1 : "+String.valueOf(players[0].getPlayerMoney()));
        player_2_money.setText("Player 2 : "+String.valueOf(players[1].getPlayerMoney()));
        player_3_money.setText("Player 3 : "+String.valueOf(players[2].getPlayerMoney()));
        player_4_money.setText("Player 4 : "+String.valueOf(players[3].getPlayerMoney()));
    }
  
   }
  public void SetCityInfo()
  {
      if(search() instanceof City)
      {
             jLabel6.setVisible(true);
             jLabel7.setVisible(true);
             jLabel8.setVisible(true);
          city_name_lbl.setText(((City) search()).city_name);
          city_price_lbl.setText(" "+((City) search()).city_price);
          city_rent_lbl.setText(" "+((City) search()).getCity_rent());        
      }
  }
    

    public Field search()
    {
        boolean check=false;    
    if( players[player-1].getLocationX()==1227&& players[player-1].getLocationY()==750)
    {
        check=true;
    return Go;
    }
    else if( players[player-1].getLocationX()==177&& players[player-1].getLocationY()==750)
    {
        check=true;
    return prison;
    }
    
     if(check==false )
     {
        for(int i=0;i<tax.size();i++){
        if(tax.get(i).getxCoord()==players[player-1].getLocationX()&&tax.get(i).getyCoord()==players[player-1].getLocationY()){
         check=true;
         return tax.get(i);
        
        }
        
        }
       
   }
     if(check==false )
     {
        for(int i=0;i<cards.size();i++){
        if(cards.get(i).getxCoord()==players[player-1].getLocationX()&&cards.get(i).getyCoord()==players[player-1].getLocationY()){
         check=true;
        return cards.get(i);}}
     }
     if(check==false )
     {
        for(int i=0;i<alltrainstations.size();i++){
        if(alltrainstations.get(i).getxCoord()==players[player-1].getLocationX()&&alltrainstations.get(i).getyCoord()==players[player-1].getLocationY()){
         check=true;
        return alltrainstations.get(i);}}
     }
     if(check==false)
     {
        for(int i=0;i<allcities.size();i++)
        {
          if(allcities.get(i).getxCoord()==players[player-1].getLocationX()&&allcities.get(i).getyCoord()==players[player-1].getLocationY())
          {
           check=true;
           return allcities.get(i);
          }
        }
     }
     if(check==false)
     {
        for(int i=0;i<companies.size();i++)
        {
          if(companies.get(i).getxCoord()==players[player-1].getLocationX()&&companies.get(i).getyCoord()==players[player-1].getLocationY())
          {
           check=true;
           return companies.get(i);
          }
        }
     }

    return null;
   
   }
 
    public void go(int player)
    {
    players[player].earnMoney(200);
    } 
    //sara
    public void get_tax(int player)
    {
        Tax tax =(Tax)search();
        int x=tax.getmoney();
        players[player].payMoney(x);
    }
    public void get_cards(int player)
    {
        throw_dice.setEnabled(false);
         card_panel.setVisible(true);
         Chances_Card chances_card = (Chances_Card)search();
         chances_card.randomcard();
         card_text.setText(chances_card.getMessage());
         
         
   
    }
    private void buy_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy_btnActionPerformed
       buy_btn.setEnabled(false);
      
       if(search() instanceof City)
      {     
         players[player-1].payMoney(((City) search()).getmoney());
         ((City) search()).setIsowned(true);
         ((City)search()).setOwner(players[player-1]);
         players[player-1].addcity((City) search());   
           
      }
      
       else  if(search() instanceof Train_station)
      {
   
         //  System.out.println(((Train_station) search()).getmoney());
            players[player-1].payMoney(((Train_station) search()).getmoney());
              ((Train_station) search()).setIsowned(true);
           ((Train_station) search()).setOwner(players[player-1]);
            players[player-1].add_trainstation((Train_station)search());
      }
       else if(search() instanceof Company)
       {
          
             players[player-1].payMoney(((Company) search()).getmoney());
              ((Company) search()).setIsowned(true);
           ((Company) search()).setOwner(players[player-1]);
             players[player-1].add_company((Company) search());   
            
       }
    SetPlayerInfo();
    SetCityInfo();
    property_of_player(player-1);
    
    if(players[player-1].CompleteGroupblue||players[player-1].CompleteGroupgreen||players[player-1].CompleteGroupgrey||players[player-1].CompleteGrouporange||players[player-1].CompleteGrouppink||players[player-1].CompleteGrouppurple||players[player-1].CompleteGroupred||players[player-1].CompleteGroupyellow)
    {
      building_house_btn.setEnabled(true);
    }
    
    }//GEN-LAST:event_buy_btnActionPerformed

    private void card_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card_buttonActionPerformed
       Chances_Card chances_card = (Chances_Card)search();
       
       int x= chances_card.getmoney();
       
           if(x>0)
         players[player-1].earnMoney(x);
        else{
            if(x==-1){
                if(player-1==0){ players[player-1].go_prison(player_1_mark, player-1);}
                if(player-1==1){ players[player-1].go_prison(player_2_mark, player-1);}
                if(player-1==2){ players[player-1].go_prison(player_3_mark, player-1);}
                if(player-1==3){ players[player-1].go_prison(player_4_mark, player-1);}
          
            }
            
            else{players[player-1].payMoney(-x);}
        }
        card_panel.setVisible(false);
        SetPlayerInfo();
        throw_dice.setEnabled(true);
    }//GEN-LAST:event_card_buttonActionPerformed

    private void building_hotel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_building_hotel_btnActionPerformed
     building_hotel_btn.setEnabled(false);
     building_house_btn.setEnabled(false);
     Hotel hotel = null;
     
       if(players[player-1].CompleteGroupblue&&!(blueGroup))
        {
            hotel = new Hotel("blue");
            for(int i=0 ; i<players[player-1].blue.list.size() ; i++)
            {
                players[player-1].blue.list.get(i).setCity_rent(players[player-1].blue.list.get(i).getmoney()+500);
            }
            blueGroup=true;
        }
        else if(players[player-1].CompleteGroupgreen &&!(greenGroup))
        {
            hotel = new Hotel("green"); 
            for(int i=0 ; i<players[player-1].green.list.size() ; i++)
            {
                players[player-1].green.list.get(i).setCity_rent(players[player-1].green.list.get(i).getmoney()+500);
            }
            greenGroup=true;
        }
        else if(players[player-1].CompleteGroupgrey &&!(greyGroup))
        {
            hotel = new Hotel("grey");
            for(int i=0 ; i<players[player-1].grey.list.size() ; i++)
            {
                players[player-1].grey.list.get(i).setCity_rent(players[player-1].grey.list.get(i).getmoney()+200);
            }
            greyGroup = true;
        }
        else if(players[player-1].CompleteGrouppurple &&!(purpleGroup))
        {
            hotel = new Hotel("purple");
            for(int i=0 ; i<players[player-1].purple.list.size() ; i++)
            {
                players[player-1].purple.list.get(i).setCity_rent(players[player-1].purple.list.get(i).getmoney()+200);
            } 
            purpleGroup = true;
        }
         else if(players[player-1].CompleteGrouporange &&!(orangeGroup))
        {
            hotel = new Hotel("orange");
            for(int i=0 ; i<players[player-1].orange.list.size() ; i++)
            {
                players[player-1].orange.list.get(i).setCity_rent(players[player-1].orange.list.get(i).getmoney()+300);
            } 
            orangeGroup = true;
        }
         else if(players[player-1].CompleteGrouppink &&!(pinkGroup))
        {       
            hotel = new Hotel("pink");
              for(int i=0 ; i<players[player-1].pink.list.size() ; i++)
            {
                players[player-1].pink.list.get(i).setCity_rent(players[player-1].pink.list.get(i).getmoney()+300);
            }
            pinkGroup = true;  
        }
           else if(players[player-1].CompleteGroupred &&!(redGroup))
        {
            hotel = new Hotel("red");
            for(int i=0 ; i<players[player-1].red.list.size() ; i++)
            {
                players[player-1].red.list.get(i).setCity_rent(players[player-1].red.list.get(i).getmoney()+400);
            } 
            redGroup = true;  
        }
         else if(players[player-1].CompleteGroupyellow &&!(yellowGroup))
        {
            hotel = new Hotel("yellow");
            for(int i=0 ; i<players[player-1].yellow.list.size() ; i++)
            {
                players[player-1].yellow.list.get(i).setCity_rent(players[player-1].yellow.list.get(i).getmoney()+400);
            } 
            yellowGroup = true;  
        }
      players[player-1].payMoney(hotel.getPrice());
        SetPlayerInfo();
    }//GEN-LAST:event_building_hotel_btnActionPerformed

    private void building_house_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_building_house_btnActionPerformed
        //building_house_btn.setEnabled(false); 
        House house=null;
        
        if(players[player-1].CompleteGroupblue)
        {
            house = new House("blue");
            for(int i=0 ; i<players[player-1].blue.list.size() ; i++)
            {
                players[player-1].blue.list.get(i).setCity_rent(players[player-1].blue.list.get(i).getmoney()+160);
            }
            blue_houses++;
        }
        else if(players[player-1].CompleteGroupgreen)
        {
            house = new House("green");
            
            for(int i=0 ; i<players[player-1].green.list.size() ; i++)
            {
                players[player-1].green.list.get(i).setCity_rent(players[player-1].green.list.get(i).getmoney()+160);
            }
            green_houses++;
        }
        else if(players[player-1].CompleteGroupgrey)
        {
            house = new House("grey");
            for(int i=0 ; i<players[player-1].grey.list.size() ; i++)
            {
                players[player-1].grey.list.get(i).setCity_rent(players[player-1].grey.list.get(i).getmoney()+40);
            }
             grey_houses++;
        }
         else if(players[player-1].CompleteGrouppurple)
        {
            house = new House("purple");   
            for(int i=0 ; i<players[player-1].purple.list.size() ; i++)
            {
                players[player-1].purple.list.get(i).setCity_rent(players[player-1].purple.list.get(i).getmoney()+40);
            } 
            purple_houses++; 
        }
        else if(players[player-1].CompleteGrouporange)
        {
            house = new House("orange");   
            for(int i=0 ; i<players[player-1].orange.list.size() ; i++)
            {
                players[player-1].orange.list.get(i).setCity_rent(players[player-1].orange.list.get(i).getmoney()+80);
            } 
            orange_houses++;
        }
        else if(players[player-1].CompleteGrouppink)
        {
            house = new House("pink");
            for(int i=0 ; i<players[player-1].pink.list.size() ; i++)
            {
                players[player-1].pink.list.get(i).setCity_rent(players[player-1].pink.list.get(i).getmoney()+80);
            } 
          pink_houses++;
            
        }
        else if(players[player-1].CompleteGroupred)
        {
            house = new House("red"); 
             for(int i=0 ; i<players[player-1].red.list.size() ; i++)
            {
                players[player-1].red.list.get(i).setCity_rent(players[player-1].red.list.get(i).getmoney()+120);
            } 
             red_houses++;
        }
        else if(players[player-1].CompleteGroupyellow)
        {
            house = new House("yellow");   
            for(int i=0 ; i<players[player-1].yellow.list.size() ; i++)
            {
                players[player-1].yellow.list.get(i).setCity_rent(players[player-1].yellow.list.get(i).getmoney()+120);
            } 
           yellow_houses++;
        }
        
        players[player-1].payMoney(house.getPrice());
       
       if(blue_houses==4||green_houses==4||grey_houses==4||purple_houses==4||orange_houses==4||pink_houses==4||red_houses==4||yellow_houses==4)
       {
            building_hotel_btn.setEnabled(true);
            building_house_btn.setEnabled(false);
       }
         SetPlayerInfo();
    }//GEN-LAST:event_building_house_btnActionPerformed

    private void getout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getout_btnActionPerformed

        number_of_palyer2--;
       players[player-1].getout();
       players[player-1].payMoney(players[player-1].getPlayerMoney());
       
       players[player-1].setGetout(true);
       
      if(player-1==0){player_1_mark.setVisible(false);
      }
       if(player-1==1){player_2_mark.setVisible(false);}
       if(player-1==2){ player_3_mark.setVisible(false);}
       if(player-1==3){player_4_mark.setVisible(false); }
       SetPlayerInfo();
       if(number_of_palyer2==1){
       jLabel9.setVisible(true);
       }
      
        // TODO add your handling code here:
    }//GEN-LAST:event_getout_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        camera=true;
        DiceImageProcessing dice_image_processing=new DiceImageProcessing();
    try {
        dice_image_processing.startDecleration();
    } catch (IOException ex) {
        Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InterruptedException ex) {
        Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel board_photo;
    private javax.swing.JButton building_hotel_btn;
    private javax.swing.JButton building_house_btn;
    private javax.swing.JButton buy_btn;
    private javax.swing.JButton card_button;
    private javax.swing.JLabel card_label;
    private javax.swing.JPanel card_panel;
    public javax.swing.JLabel card_text;
    private javax.swing.JLabel cities;
    private javax.swing.JLabel city_name_lbl;
    private javax.swing.JLabel city_price_lbl;
    private javax.swing.JLabel city_rent_lbl;
    private javax.swing.JButton getout_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JLabel player_1_mark;
    private javax.swing.JLabel player_1_money;
    private javax.swing.JLabel player_2_mark;
    private javax.swing.JLabel player_2_money;
    private javax.swing.JLabel player_3_mark;
    private javax.swing.JLabel player_3_money;
    private javax.swing.JLabel player_4_mark;
    private javax.swing.JLabel player_4_money;
    private javax.swing.JLabel playnow;
    private javax.swing.JButton throw_dice;
    // End of variables declaration//GEN-END:variables
}
