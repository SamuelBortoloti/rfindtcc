package view;

import control.FuncionarioControl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmLoginEmpresa extends JFrame
{
    public FrmLoginEmpresa()
    {
        setSize(340,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Log-in");
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;

        JTextField txtNomeEmpresa = new JTextField();
        txtNomeEmpresa.setPreferredSize(new Dimension(200,25));
        JPasswordField txtSenha = new JPasswordField();
        txtSenha.setPreferredSize(new Dimension(200,25));
        JTextField txtCnpj = new JTextField();
        txtCnpj.setPreferredSize(new Dimension(200,25));
        JLabel lblTitle = new JLabel("RFIND");
        lblTitle.setFont(new Font("Arial",Font.BOLD,40));
        JButton btnLogin = new JButton("Log-in");

        JPanel pnl1 = new JPanel();
        pnl1.setPreferredSize(new Dimension(200,25));
        JPanel pnl2 = new JPanel();
        pnl2.setPreferredSize(new Dimension(200,25));
        JPanel pnl3 = new JPanel();
        pnl3.setPreferredSize(new Dimension(200,25));
        JPanel pnl4 = new JPanel();
        pnl4.setPreferredSize(new Dimension(200,25));

        add(lblTitle,constraints);
        constraints.gridy = 1;
        add(pnl1,constraints);
        constraints.gridy = 2;
        add(new JLabel("Nome da empresa"),constraints);
        constraints.gridy = 3;
        add(txtNomeEmpresa,constraints);
        constraints.gridy = 4;
        add(pnl2,constraints);
        constraints.gridy = 5;
        add(new JLabel("Senha"),constraints);
        constraints.gridy = 6;
        add(txtSenha,constraints);
        constraints.gridy = 7;
        add(pnl3,constraints);
        constraints.gridy = 8;
        add(new JLabel("CNPJ"),constraints);
        constraints.gridy = 9;
        add(txtCnpj,constraints);
        constraints.gridy = 10;
        add(pnl4,constraints);
        constraints.gridy = 11;
        add(btnLogin,constraints);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //if algo inválido(Exception), message dialog

                //else:
                dispose();
                new FrmFuncionarios();
            }
        });

        setVisible(true);
    }
}