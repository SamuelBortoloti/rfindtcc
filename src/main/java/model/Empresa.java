package model;

public class Empresa
{
    private String nomeEmpresa;
    private String senha;
    private String cnpj;

    public Empresa(String nomeEmpresa, String senha, String cnpj)
    {
        if(nomeEmpresa == null)
            throw new IllegalArgumentException();
        else
            this.nomeEmpresa = nomeEmpresa;
        if(senha == null)
            throw new IllegalArgumentException();
        else
            this.senha = senha;
        if(cnpj == null)
            throw new IllegalArgumentException();
        else if(cnpj.length()<14)
            throw new LengthException();
        else
            this.cnpj = cnpj;
    }
    public String getNomeEmpresa()
    {
        return nomeEmpresa;
    }
    public String getSenha()
    {
        return senha;
    }
    public String getCnpj()
    {
        return cnpj;
    }
}
