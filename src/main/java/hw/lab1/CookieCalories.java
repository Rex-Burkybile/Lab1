/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.lab1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 0800490
 */
public class CookieCalories {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "How many cookies did you eat");
        String CookiesAteAsString = JOptionPane.showInputDialog("Number of cookies");
        float CookiesAteAsFloat = Float.parseFloat(CookiesAteAsString);

        float servings = CookiesAteAsFloat / 4;
        float calories = servings * 300;

        System.out.println("You consumed " + calories + " calories");
    }
}
