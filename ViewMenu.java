/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo;

/**
 *
 * @author ACER
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ViewMenu extends JFrame{
    JButton btnLoginAdmin = new JButton("Tambah Barang");
    JButton btnBeliSayur = new JButton("Lihat Barang");
    JLabel judul = new JLabel("Main Menu");
    
    public ViewMenu()
    {
     setTitle("Menu Awal");
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setVisible(true);
     setLayout(null);
     setSize(400,300);
     setLocation(500,100);
     this.getContentPane().setBackground(Color.GREEN);
     
   add(judul);
        judul.setBounds(50, 10, 300, 50);
        judul.setForeground(new java.awt.Color(43, 84, 128));
        judul.setFont(new Font("Algerian",Font.BOLD,28));
        add(btnLoginAdmin);
        btnLoginAdmin.setBounds(95, 75, 200, 50);
        btnLoginAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginAdmin.setFont(new Font("Aharoni",Font.BOLD,18));
        btnLoginAdmin.setBackground(new java.awt.Color(43, 84, 128));
        add(btnBeliSayur);
        btnBeliSayur.setBounds(95, 150, 200, 50);
        btnBeliSayur.setForeground(new java.awt.Color(255, 255, 255));
        btnBeliSayur.setFont(new Font("Aharoni",Font.BOLD,18));
        btnBeliSayur.setBackground(new java.awt.Color(43, 84, 128));
     
    btnBeliSayur.addActionListener(new ActionListener()
     {
         @Override
         public void actionPerformed(ActionEvent e)
         {  
              TambahBarang tambahbarang = new TambahBarang();
             dispose();
         }
     });
     
   btnLoginAdmin.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
               LihatBarang lihatbarang = new LihatBarang();
                dispose();
            }
        });
       
   }
}
