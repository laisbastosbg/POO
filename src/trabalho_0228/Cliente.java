package trabalho_0228;

public class Cliente
{
    private int codigo;
    private String nome;
    private TipoCliente tipoCliente;

    public Cliente(int cod, String nome, TipoCliente tipo)
    {
        this.codigo = cod;
        this.nome = nome;
        this.tipoCliente = tipo;
    }

    public void setCodigo(int cod)
    {
        this.codigo = cod;
    }

    public int getCodigo()
    {
        return this.codigo;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setTipoCliente(TipoCliente tipo)
    {
        this.tipoCliente = tipo;
    }

    public TipoCliente getTipoCliente()
    {
        return this.tipoCliente;
    }
}
