package model;

public class Funcionario
{
    private String nome;
    private String setor;
    private static int id;
    private int idFunc;

    public Funcionario(String nome, String setor)
    {
        if(nome == null)
            throw new IllegalArgumentException();
        else
            this.nome = nome;
        if(setor == null)
            throw new IllegalArgumentException();
        else
            this.setor = setor;
        Funcionario.id+=1;
        this.idFunc = id;
    }
    public String getNome()
    {
        return nome;
    }
    public String getSetor()
    {
        return setor;
    }
    public int getIdFunc()
    {
        return idFunc;
    }
}