/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro_bibliotecajuegos.controller;

import java.io.File;
import javax.swing.JOptionPane;
import pro_bibliotecajuegos.model.TrivialPlayerModel;

/**
 *
 * @author Hansen
 */
public class TrivialTurnController {

    private boolean turno1; //boolean que asigna el turno al jugador 1 o no.
    private boolean p1, p2, p3, p4, p5, p6;
    TrivialPlayerModel player1 = new TrivialPlayerModel();
    TrivialPlayerModel player2 = new TrivialPlayerModel();
    TrivialController met = new TrivialController();
    File fichero;
    String listaPro = "FicheroPreguntasPRO.txt";
    String listaSis = "FicheroPreguntasSI.txt";
    String listaBds = "FicheroPreguntasBD.txt";
    String listaLmsxi = "FicheroPreguntasLMSXI.txt";
    String listaFol = "FicheroPreguntasFOL.txt";
    String listaCod = "FicheroPreguntasCOD.txt";

    // 2 jugadores:
    public void partida() {
        turno1 = true;
        do {
            if (turno1 == true) {
                /*
                * Una vez dentro, cambiamos el valor para que, en el caso de que
                * falls, salte el turno al otro jugador.
                 */
                turno1 = false;
                p1 = false;
                p2 = false;
                p3 = false;
                p4 = false;
                p5 = false;
                p6 = false;
                // Se muestran las estadísticas del jugador:
                JOptionPane.showMessageDialog(null, "Turno do xogador 1:\n" + player1.verQuesitos());
                // Condicional en el que generamos un tipo de pregunta en funcion a los quesitos:
                if (player1.isQuesitoBds() == true
                        && player1.isQuesitoCod() == true
                        && player1.isQuesitoFol() == true
                        && player1.isQuesitoLms() == true
                        && player1.isQuesitoPro() == true
                        && player1.isQuesitoSis() == true) {
                    JOptionPane.showMessageDialog(null, "Teñes tódolos quesitos, responde correctamente ás preguntas.");
                    // 1. Pregunta de programación:
                    fichero = new File(listaPro);
                    met.leerPregunta(fichero);
                    if (met.isAcierto() == true) {
                        // 2. Pregunta de BD:
                        met.setAcierto(false);
                        fichero = new File(listaBds);
                        met.leerPregunta(fichero);
                        if (met.isAcierto() == true) {
                            // 3. Pregunta de SI:
                            met.setAcierto(false);
                            fichero = new File(listaSis);
                            met.leerPregunta(fichero);
                            if (met.isAcierto() == true) {
                                // 4. Pregunta de FOL:
                                met.setAcierto(false);
                                fichero = new File(listaFol);
                                met.leerPregunta(fichero);
                                if (met.isAcierto() == true) {
                                    // 5. Pregunta de LMSXI:
                                    met.setAcierto(false);
                                    fichero = new File(listaLmsxi);
                                    met.leerPregunta(fichero);
                                    if (met.isAcierto() == true) {
                                        // 6. Pregunta de COD:
                                        met.setAcierto(false);
                                        fichero = new File(listaBds);
                                        met.leerPregunta(fichero);
                                        if (met.isAcierto() == true) {
                                            player1.setSuperQuesito(turno1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    // Bucle de preguntas que sigue dando preguntas si aciertas.
                    do {
                        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                                "**** MENU ****\n"
                                + "1) Pregunta Programación\n"
                                + "2) Pregunta Bases de Datos\n"
                                + "3) Pregunta Sistemas Informáticos\n"
                                + "4) Pregunta FOL\n"
                                + "5) Pregunta LMSXI\n"
                                + "6) Pregunta COD\n"));
                        do {
                            switch (opcion) {
                                case 1:
                                    fichero = new File(listaPro);
                                    met.leerPregunta(fichero);
                                    if (met.isAcierto() == true) {
                                        player1.setQuesitoPro(true);
                                        JOptionPane.showMessageDialog(null, "Gañaches un quesito de programación.\n");
                                    }
                                    break;
                                case 2:
                                    fichero = new File(listaBds);
                                    met.leerPregunta(fichero);
                                    if (met.isAcierto() == true) {
                                        player1.setQuesitoBds(true);
                                        JOptionPane.showMessageDialog(null, "Gañaches un quesito de Bases de Datos.");
                                    }
                                    break;
                                case 3:
                                    fichero = new File(listaSis);
                                    met.leerPregunta(fichero);
                                    if (met.isAcierto() == true) {
                                        player1.setQuesitoSis(true);
                                        JOptionPane.showMessageDialog(null, "Gañaches un quesito de Sistemas Informáticos.");
                                    }
                                    break;
                                case 4:
                                    fichero = new File(listaFol);
                                    met.leerPregunta(fichero);
                                    if (met.isAcierto() == true) {
                                        player1.setQuesitoFol(true);
                                        JOptionPane.showMessageDialog(null, "Gañaches un quesito de FOL.");
                                    }
                                    break;
                                case 5:
                                    fichero = new File(listaLmsxi);
                                    met.leerPregunta(fichero);
                                    if (met.isAcierto() == true) {
                                        player1.setQuesitoLms(true);
                                        JOptionPane.showMessageDialog(null, "Gañaches un quesito de LMSXI.");
                                    }
                                    break;
                                case 6:
                                    fichero = new File(listaCod);
                                    met.leerPregunta(fichero);
                                    if (met.isAcierto() == true) {
                                        player1.setQuesitoCod(true);
                                        JOptionPane.showMessageDialog(null, "Gañaches un quesito de COD.");
                                    }
                                    break;
                            }
                        } while (opcion > 6);
                    } while (met.isAcierto() == true);
                }
            } else {
                /*
                * Una vez dentro, cambiamos el valor para que, en el caso de que
                * falls, salte el turno al otro jugador.
                 */
                turno1 = true;
                JOptionPane.showMessageDialog(null, "Turno do xogador 2:");
                if (player2.isQuesitoBds() == true
                        && player2.isQuesitoCod() == true
                        && player2.isQuesitoFol() == true
                        && player2.isQuesitoLms() == true
                        && player2.isQuesitoPro() == true
                        && player2.isQuesitoSis() == true) {
                    JOptionPane.showMessageDialog(null, "Teñes tódolos quesitos, responde correctamente ás preguntas.");
                    // 1. Pregunta de programación:
                    fichero = new File(listaPro);
                    met.leerPregunta(fichero);
                    if (met.isAcierto() == true) {
                        // 2. Pregunta de BD:
                        met.setAcierto(false);
                        fichero = new File(listaBds);
                        met.leerPregunta(fichero);
                        if (met.isAcierto() == true) {
                            // 3. Pregunta de SI:
                            met.setAcierto(false);
                            fichero = new File(listaSis);
                            met.leerPregunta(fichero);
                            if (met.isAcierto() == true) {
                                // 4. Pregunta de FOL:
                                met.setAcierto(false);
                                fichero = new File(listaFol);
                                met.leerPregunta(fichero);
                                if (met.isAcierto() == true) {
                                    // 5. Pregunta de LMSXI:
                                    met.setAcierto(false);
                                    fichero = new File(listaLmsxi);
                                    met.leerPregunta(fichero);
                                    if (met.isAcierto() == true) {
                                        // 6. Pregunta de COD:
                                        met.setAcierto(false);
                                        fichero = new File(listaBds);
                                        met.leerPregunta(fichero);
                                        if (met.isAcierto() == true) {
                                            player1.setSuperQuesito(turno1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    do {
                        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                                "**** MENU ****\n"
                                + "1) Pregunta Programación\n"
                                + "2) Pregunta Bases de Datos\n"
                                + "3) Pregunta Sistemas Informáticos\n"
                                + "4) Pregunta FOL\n"
                                + "5) Pregunta LMSXI\n"
                                + "6) Pregunta COD\n"));
                        do {
                            switch (opcion) {
                                case 1:
                                    fichero = new File(listaPro);
                                    met.leerPregunta(fichero);
                                    if (met.isAcierto() == true) {
                                        player2.setQuesitoPro(true);
                                        JOptionPane.showMessageDialog(null, "Gañaches un quesito de programación.\n");
                                    }
                                    break;
                                case 2:
                                    fichero = new File(listaBds);
                                    met.leerPregunta(fichero);
                                    if (met.isAcierto() == true) {
                                        player2.setQuesitoBds(true);
                                        JOptionPane.showMessageDialog(null, "Gañaches un quesito de Bases de Datos.");
                                    }
                                    break;
                                case 3:
                                    fichero = new File(listaSis);
                                    met.leerPregunta(fichero);
                                    if (met.isAcierto() == true) {
                                        player2.setQuesitoSis(true);
                                        JOptionPane.showMessageDialog(null, "Gañaches un quesito de Sistemas Informáticos.");
                                    }
                                    break;
                                case 4:
                                    fichero = new File(listaFol);
                                    met.leerPregunta(fichero);
                                    if (met.isAcierto() == true) {
                                        player2.setQuesitoFol(true);
                                        JOptionPane.showMessageDialog(null, "Gañaches un quesito de FOL.");
                                    }
                                    break;
                                case 5:
                                    fichero = new File(listaLmsxi);
                                    met.leerPregunta(fichero);
                                    if (met.isAcierto() == true) {
                                        player2.setQuesitoLms(true);
                                        JOptionPane.showMessageDialog(null, "Gañaches un quesito de LMSXI.");
                                    }
                                    break;
                                case 6:
                                    fichero = new File(listaCod);
                                    met.leerPregunta(fichero);
                                    if (met.isAcierto() == true) {
                                        player2.setQuesitoCod(true);
                                        JOptionPane.showMessageDialog(null, "Gañaches un quesito de COD.");
                                    }
                                    break;
                            }
                        } while (opcion > 6);
                    } while (met.isAcierto() == true);
                }
            }
        } while (player1.isSuperQuesito() == false || player2.isSuperQuesito() == false);
        if (player1.isSuperQuesito() == true) {
            JOptionPane.showMessageDialog(null, "O xogador 1 gaña!");
        } else {
            JOptionPane.showMessageDialog(null, "O xogador 2 gaña!");
        }
    }
}
