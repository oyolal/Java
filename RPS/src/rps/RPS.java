/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rps;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author OmerFaruk
 */
public class RPS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rock,Paper,Scissors");
       
        frame.add(new RPSG());

        frame.setSize(700, 700);

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);


}
}