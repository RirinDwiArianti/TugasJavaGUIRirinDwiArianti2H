package Ririn.javagui.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class DataMahasiswa {
        private JPanel datamhs;
        private JTextField textnim;
        private JButton cekbutton;
        private JButton batalbutton;
        private JLabel jawab1;
        private JLabel jawab2;
        private JLabel jawab3;
        private JLabel jawab4;
        private JLabel jawab5;
        private JLabel jawab6;
        private JLabel jawab7;
        private JLabel jawab8;
        private JTextField textnama;

        public DataMahasiswa() {
            cekbutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    //mengambil data dari textnama
                    String NAMA = textnama.getText();
                    //mengambil data dari textnim
                    String NIM = textnim.getText();
                    //diproses
                    Mahasiswa mhs =  new Mahasiswa();
                    mhs.setNAMA(NAMA);
                    mhs.setNIM(NIM);
                    jawab1.setText("NAMA : " + mhs.getNAMA() );
                    jawab2.setText("NIM :" + mhs.getNIM());
                    jawab3.setText("Jenjang Pendidikan :" + mhs.getJenjang());
                    jawab4.setText("Tahun masuk : " + mhs.getTahun());
                    jawab5.setText("Fakultas : " + mhs.getFakultas());
                    jawab6.setText("Jurusan : " + mhs.getJurusan());
                    jawab7.setText("Jenis Kelamin : " + mhs.getJenisKelamin());
                    jawab8.setText("Nomor Urut : " + mhs.getNomorurut());

                }
            });
            batalbutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {

                }
            });
        }

        public JPanel getDatamhs() {
            return datamhs;
        }
    }

