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
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewLihat extends JFrame{
      JButton btnKembali = new JButton("Kembali");  
    
    public JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"Id", "Nama", "Massa", "Harga"};

    public ViewLihat() {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Data Barang");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(550,500);
        
        add(scrollPane);
        scrollPane.setBounds(20, 20, 480, 300);
              
        add(btnKembali);
        btnKembali.setBounds(20, 420, 90, 20);
        
        
    }   

    public JButton getBtnKembali() {
        return btnKembali;
    }
}
