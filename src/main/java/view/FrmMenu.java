package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.formdev.flatlaf.*;
import control.FuncionarioControl;
import model.Funcionario;

public class FrmMenu extends JFrame
{
    public FrmMenu()
    {
        setSize(320,480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Menu");

        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(200,30));
        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(200,30));

        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        JLabel lblTitle = new JLabel("RFIND");
        lblTitle.setFont(new Font("Arial",Font.BOLD,40));


        JButton btnEntrar = new JButton("Entrar");
        JButton btnCadastro = new JButton("Cadastrar-se");

        constraints.gridx = 0;
        constraints.gridy = 0;
        add(lblTitle,constraints);
        constraints.gridy = 1;
        add(panel1,constraints);
        constraints.gridy = 2;
        add(btnEntrar,constraints);
        constraints.gridy = 3;
        add(panel2,constraints);
        constraints.gridy = 4;
        add(btnCadastro,constraints);

        //listeners
        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new FrmLoginEmpresa();
            }
        });
        //fim dos listeners

        setVisible(true);
    }
    public static void main(String[] args)
    {
        try
        {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        }
        catch(UnsupportedLookAndFeelException ex)
        {
            System.out.println("Ocorreu um erro");
        }
        FuncionarioControl funcionarioControl = new FuncionarioControl();
        funcionarioControl.cadastrar(new Funcionario("Renato Moreira","Dormitório"));
        funcionarioControl.cadastrar(new Funcionario("Lucas Antunes","açafrao maldoso"));
        funcionarioControl.cadastrar(new Funcionario("Luiz Filliphe","Ser bom com o matioli"));
        funcionarioControl.cadastrar(new Funcionario("Cauãn Olivera","jdbc"));
        funcionarioControl.excluir(2);
        for(Funcionario f : funcionarioControl.getListFunc())
        {
            System.out.println(f.getNome());
        }
        new FrmMenu();
    }
}