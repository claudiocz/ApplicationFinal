package com.claudiocanedo;



// Ventana 2

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.black;
import static javafx.scene.text.FontWeight.NORMAL;


public class View extends JFrame {


    private JLabel texto;
    private JButton btn;
    private JPanel pan;

    public View() {
        super("Viewer");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        this.setSize(350, 250);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        //this.getContentPane().setBackground(Color.black);
        this.pan.setBackground(Color.BLACK);
    }

    public void init() {
        texto = new JLabel();
        texto.setForeground(Color.WHITE);
        texto.setAlignmentX(25);
        texto.setAlignmentY(25);
        texto.setFont(new java.awt.Font("Tahoma",0, 40));

        pan = new JPanel(new FlowLayout());
        pan.add(texto);

        this.add(BorderLayout.CENTER, pan);
    }

    public void asignarTexto(String a) {
        texto.setText(a);
    }
}
