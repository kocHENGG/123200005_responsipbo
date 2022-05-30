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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControllerInput {
    ViewBarang viewbarang;
    ModelInputBarang modelinputbarang;

    public ControllerInput(ViewBarang viewbarang, ModelInputBarang modelinputbarang) {
        this.viewbarang = viewbarang;
        this.modelinputbarang = modelinputbarang;
        
        viewbarang.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                ViewMenu viewmenu =new ViewMenu();
                viewbarang.setVisible(false);
                ControllerMenu Start = new ControllerMenu(viewmenu);
            }
        });
        
        viewbarang.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(viewbarang.getTfnama().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nama Tidak Boleh Kosong");
                }
                else if(viewbarang.getTfharga()==0){
                    JOptionPane.showMessageDialog(null, "Harga Tidak Boleh Kosong");
                }
                else if(viewbarang.getTfmassa()==0){
                    JOptionPane.showMessageDialog(null, "Massa Tidak Boleh Kosong");
                }
                else if(viewbarang.getTfharga()<0){
                    JOptionPane.showMessageDialog(null, "Harga Harus Positif");
                }
                else if(viewbarang.getTfmassa()<0){
                    JOptionPane.showMessageDialog(null, "Massa Harus Positif");
                }
                else{
                    modelinputbarang.insertData(viewbarang.getTfnama(), viewbarang.getTfmassa(), viewbarang.getTfharga());
                }
                
            }
        });
        
        viewbarang.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                viewbarang.tfnama.setText("");
                viewbarang.tfmassa.setText("");
                viewbarang.tfharga.setText("");
            }
        });
    }
    
}
