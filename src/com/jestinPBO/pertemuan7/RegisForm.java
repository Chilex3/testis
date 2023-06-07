package com.jestinPBO.pertemuan7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisForm extends JFrame{
    private JTextField txtNama;
    private JTextField textNim;
    private JComboBox Cprodi;
    private JTextField noTelp;
    private JRadioButton priaRadioButton;
    private JRadioButton wanitaRadioButton;
    private JTextArea Alamat;
    private JButton saveButton;
    private JButton clearButton;
    private JPanel mainPanel;

    public RegisForm(){
        super("Formulir Registrasi");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(800,600);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNama.setText("");
                textNim.setText("");
                noTelp.setText("");
                Alamat.setText("");
                Cprodi.setSelectedIndex(0);
                priaRadioButton.setSelected(false);
                wanitaRadioButton.setSelected(false);
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = txtNama.getText();
                String nim = textNim.getText();
                String prodi = (String) Cprodi.getSelectedItem();
                String telp = noTelp.getText();
                String alamat = Alamat.getText();
                String JK;
                if(priaRadioButton.isSelected()){
                    JK = "Pria";
                } else if (wanitaRadioButton.isSelected()) {
                    JK = "Wanita";
                } else {
                    JK = "Tidak ditemukan";
                }

                JOptionPane.showMessageDialog(null,"Data berhasil disimpan!");
            }
        });
    }

    public static void main(String[] args){
        JFrame mainFrame = new RegisForm();
        mainFrame.setVisible(true);
    }
}
