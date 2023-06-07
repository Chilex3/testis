package com.jestinPBO.pertemuan7;

import javax.swing.*;

public class RegisForm extends JFrame{
    private JTextField txtNama;
    private JTextField textNim;
    private JComboBox comboBox1;
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
    }
    public static void main(String[] args){
        JFrame mainFrame = new RegisForm();
        mainFrame.setVisible(true);
    }
}
