package view;
import control.FuncionarioControl;
import model.Funcionario;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FrmFuncionarios extends JFrame
{
    FuncionarioControl funcionarioControl;
    public FrmFuncionarios()//ainda não está funcionando corretamente
    {
        funcionarioControl = new FuncionarioControl();
        setTitle("Pesquisar Funcionários");
        setSize(490,480);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel pnlCenter = new JPanel(new GridLayout(2,1));

        JPanel pnl1 = new JPanel();
        JPanel pnl2 = new JPanel(new GridLayout(4,1));

        //declarar um jbutton com o texto "Pesquisar"
        //declarar uma jtextfield

        ArrayList<String[]> funcTable = new ArrayList<>();
        ArrayList<Funcionario> gLF = funcionarioControl.getListFunc();
        for(Funcionario f : gLF)
        {
            funcTable.add(new String[]{f.getNome(),String.valueOf(f.getIdFunc()),f.getSetor()});
        }

        JTable tbl = new JTable(funcTable.toArray(new String[funcTable.size()][]),new String[]{"Nome","ID","Setor"});
        JScrollPane jsp = new JScrollPane(tbl);

        pnl1.add(jsp);
        pnl2.add(new JPanel());
        pnl2.add(new JTextField());//trocar esse new jtextfield pelo declarado
        pnl2.add(new JPanel());
        pnl2.add(new JButton("Pesquisar"));//trocar esse new jbutton pelo declarado
        pnlCenter.add(pnl1);
        pnlCenter.add(pnl2);
        add(pnlCenter,BorderLayout.CENTER);
        add(new JPanel(), BorderLayout.NORTH);
        add(new JPanel(), BorderLayout.SOUTH);
        add(new JPanel(), BorderLayout.WEST);
        add(new JPanel(), BorderLayout.EAST);
        setVisible(true);
    }
}
