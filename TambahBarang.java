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
public class TambahBarang {
    View viewBeli = new ViewBeli();
    ModelToko modelToko = new ModelToko();
    ControllerBeli controllerBeli = new ControllerBeli(viewBeli, modelToko);
}