package control;

import java.util.ArrayList;
import model.Funcionario;

public class FuncionarioControl
{
    private ArrayList<Funcionario> listFunc;

    public FuncionarioControl()
    {
        listFunc = new ArrayList<>();
    }

    public void cadastrar(Funcionario funcionario)
    {
        listFunc.add(funcionario);
    }
    public void excluir(int id)
    {
        ArrayList<Funcionario> listTemp = new ArrayList<>();

        for(Funcionario f : listFunc)
        {
            if(f.getIdFunc() == id)
            {
                listTemp.add(f);
            }
        }
        listFunc.removeAll(listTemp);
    }
    public ArrayList<Funcionario> getListFunc()
    {
        return listFunc;
    }
}
