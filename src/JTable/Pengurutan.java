package JTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pengurutan {
    private JTextField textangkasatu;
    private JTextField textangkakedua;
    private JTable tablehasil;
    private JPanel rootpanel;
    private JButton Buttonurut;
    private DefaultTableModel tableModel;
    private boolean added = false;

    public JPanel getrootPanel1() {
        return rootpanel;
    }
        public Pengurutan() {
            this.initComponents();
            Buttonurut.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DefaultTableModel model = (DefaultTableModel)
                            tablehasil.getModel();
                    String jumlah2 = textangkakedua.getText();
                    int jumlah = Integer.parseInt(textangkasatu.getText());
                    String angka = textangkakedua.getText();

                    if (textangkasatu.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(rootpanel,
                                "jumlah angka tidak diketahui",
                                "Warning",
                                JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    if (angka.isEmpty()) {
                        JOptionPane.showMessageDialog(rootpanel,
                                "Angka belum diinput",
                                "Warning",
                                JOptionPane.WARNING_MESSAGE);
                    }
                    if (!added) {
                        for (int i = 0; i < jumlah; i++) {
                            model.addRow(new Object[]{});
                        }
                        added = true;
                    } else {
                        model.addRow(new Object[]{jumlah2, angka});
                        //clear textfield
                        textangkasatu.setText("");
                        textangkakedua.setText("");
                    }
                    int a = 0;
                    for (int i : Urutan.getascen(angka, jumlah)) {
                        model.setValueAt(i, a, 0);
                        a++;
                    }
                    int b = 0;
                    for (int i : Urutan.getdescen(angka, jumlah)) {
                        model.setValueAt(i, b, 1);
                        b++;
                    }
                }
            });
        }


    private void initComponents() {
            Object[] tableColom = {
                    "Ascending",
                    "Descending"
            };
            Object[][] initData = {

            };
            tableModel = new DefaultTableModel(initData, tableColom);
            //set table model
            tablehasil.setModel(tableModel);
            //menampilkan sorting di setiap kolom
            tablehasil.setAutoCreateRowSorter(true);
            //hidupkan single selection
            tablehasil.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        }
    }


