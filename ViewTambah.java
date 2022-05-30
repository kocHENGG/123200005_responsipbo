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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class ViewTambah extends JFrame {
    JLabel judul = new JLabel("Inout Barang");
    JLabel lnama = new JLabel("Nama");
    JTextField tfnama = new JTextField();
    JLabel lmassa = new JLabel("Massa (gr)");
    JTextField tfmassa = new JTextField();
    JLabel lharga = new JLabel("Harga Satuan");
    JTextField tfharga = new JTextField();
    
    JButton btnsubmit = new JButton("Submit");
    JButton btnreset = new JButton("Reset");
    JButton btndelete = new JButton("Delete");
    JButton btnedit = new JButton("Edit");
    JButton btnback = new JButton("Kembali");
    
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    Object namaKolom[] = {"id", "Nama", "Massa", "Harga"};
    
    public ViewTambah(){
         tableModel = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Data Barang");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(900, 600);
        setLocation(200, 50);
        this.getContentPane().setBackground(Color.YELLOW);
      
        add(judul);
        judul.setBounds(350, 30, 300, 30);
        judul.setForeground(new java.awt.Color(43, 84, 128));
        judul.setFont(new Font("Bauhaus 93",Font.PLAIN,30));
        add(tfnama);
        lnama.setBounds(30, 100, 120, 20);
        add(tfnama);
        tfnama.setBounds(180, 100, 150, 20);
        add(lmassa);
        lmassa.setBounds(30, 130, 120, 20);
        add(tfmassa);
        tfnama.setBounds(180, 130, 150, 20);
        add(lharga);
        lharga.setBounds(30, 160, 120, 20);
        add(tfharga);
        tfharga.setBounds(180, 160, 150, 20);
        add(btnsubmit);
        btnsubmit.setBounds(550, 130, 100, 30);
        btnsubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnsubmit.setFont(new Font("Aharoni",Font.BOLD,15));
        btnsubmit.setBackground(new java.awt.Color(43, 84, 128));
        add(btnreset);
        btnreset.setBounds(675, 130, 100, 30);
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setFont(new Font("Aharoni",Font.BOLD,15));
        btnreset.setBackground(new java.awt.Color(43, 84, 128));
        add(btndelete);
        btndelete.setBounds(675, 130, 100, 30);
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setFont(new Font("Aharoni",Font.BOLD,15));
        btndelete.setBackground(new java.awt.Color(43, 84, 128));
        add(btnedit);
        btnedit.setBounds(675, 130, 100, 30);
        btnedit.setForeground(new java.awt.Color(255, 255, 255));
        btnedit.setFont(new Font("Aharoni",Font.BOLD,15));
        btnedit.setBackground(new java.awt.Color(43, 84, 128));
        add(btnback);
        btnback.setBounds(615, 210, 100, 30);
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setFont(new Font("Aharoni",Font.BOLD,15));
        btnback.setBackground(new java.awt.Color(43, 84, 128));
        
        //TABEL
        add(scrollPane); 
        scrollPane.setBounds(20, 200, 480, 300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        //scrollpane-nya vertikal
        
        btnback.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ViewMenu viewmenu = new ViewMenu();
                dispose();
            }
        });
    }
    
    public String getIdSayur()
    {
        return tfnama.getText();
    }
    public String getNamaSayur()
    {
        return tfmassa.getText();
    }
   public String getHargaSayur()
   {
       return tfharga.getText();
   }
}
