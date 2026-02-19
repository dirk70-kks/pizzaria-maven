package de.pizzeria.gui;
import javax.swing.*;
public class GUI extends JFrame {
    public GUI() {
        initComponents();
    }
    private void initComponents() {
        setTitle("Pizzeria GUI");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new GUI().setVisible(true);
    }
}
