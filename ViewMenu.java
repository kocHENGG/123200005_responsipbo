/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo;
import javax.swing.*;
/**
 *
 * @author ACER
 */


public class ViewMenu extends JFrame {
    JLabel judul = new JLabel("Main Menu");
    JButton btnTambah = new JButton("Tambah Barang");
    JButton btnLihat = new JButton("Lihat Barang");

    public ViewMenu() {
        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        
        setLayout(null);
        setSize(200,200);
        add(judul);
        judul.setBounds(60, 5, 100, 30);
        
        add(btnTambah);
        btnTambah.setBounds(20, 45, 130, 30);
        
        add(btnLihat);
        btnLihat.setBounds(20, 95, 130,30);
}
}
