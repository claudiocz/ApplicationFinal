package com.claudiocanedo;
// Ventana 1
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;

import static javafx.geometry.Pos.CENTER;

public class Ventana1 extends JFrame implements ActionListener{

    private JLabel label;
    private JTextField txt;
    private JButton button;
    private JPanel panel;

    public Ventana1() {
        super("Send");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        this.setSize(400, 300);
        setContentPane(panel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void init() {
        label = new JLabel("Entrada");
        label.setBounds(10, 10, 50, 30);

        txt = new JTextField(15);
        button = new JButton("ACEPTAR");
        button.addActionListener(this);
        panel = new JPanel(new FlowLayout());

        panel.add(label);
        panel.add(txt);
        panel.add(button);

    }

    public String obtenerTexto() {
        return txt.getText();
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == button) {
            this.dispose();
            View frame2 = new View();
            frame2.asignarTexto(obtenerTexto());
        }
    }

    public static void main(String[] a) {
        Ventana1 frame = new Ventana1();
    }
}
