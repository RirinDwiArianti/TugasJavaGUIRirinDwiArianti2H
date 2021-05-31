package Ririn.javagui.GUI;

import javax.swing.*;

public class RunDataMahasiswa {
        public static void main(String[] args) {
            JFrame jFrame = new JFrame("DataMahasiswa");
            jFrame.setContentPane(new DataMahasiswa().getDatamhs());
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setLocationRelativeTo(null);
            jFrame.setSize(700,600);
            jFrame.setVisible(true);
        }
    }

