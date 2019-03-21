package trabalho_0228;

public class Vendedor
{
    private int codigo;
    private String nome;
    private double comissao;

    public Vendedor(int cod, String nome, double comissao)
    {
        this.codigo = cod;
        this.nome = nome;
        this.comissao = comissao;
    }

    public void setCodigo(int cod) { this.codigo = cod; }

    public int getCodigo() { return this.codigo; }

    public void setNome(String nome) { this.nome = nome; }

    public String getNome() { return nome; }

    public void setComissao(float comissao) { this.comissao = comissao; }

    public double getComissao() { return comissao; }
}
