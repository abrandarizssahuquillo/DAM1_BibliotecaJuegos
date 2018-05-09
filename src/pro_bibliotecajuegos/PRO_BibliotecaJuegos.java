/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro_bibliotecajuegos;

import java.io.File;
import pro_bibliotecajuegos.controller.TrivialController;

/**
 *
 * @author Hansen
 */
public class PRO_BibliotecaJuegos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TrivialController prueba = new TrivialController();
        String listaPro = "FicheroPreguntasPRO.txt";
        File fichero = new File(listaPro);
        prueba.leerPregunta2(fichero);
    }
    
}
