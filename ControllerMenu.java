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

public class ControllerMenu {
    ViewMenu viewmenu;

    public ControllerMenu (ViewMenu vmm) {
        this.viewmenu = vmm;
        
        viewmenu.btnTambah.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                ModelInputBarang modelinputbarang = new ModelInputBarang();
                ViewBarang viewbarang= new ViewBarang();
                viewmenu.setVisible(false);
                ControllerInput controllerinput = new ControllerInput(viewbarang,modelinputbarang);
            }
        });
        
        viewmenu.btnLihat.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                ModelInputBarang modelinputbarang = new ModelInputBarang();
                ViewLihat viewlihat= new ViewLihat();
                viewmenu.setVisible(false);
                ControllerLihat ControllerLihat = new ControllerLihat(viewlihat,modelinputbarang);
            }
        });
    }
}
