package trabalho_0228;

public class Produto
{
    private int codigo;
    private String descricao;
    private double valorProduto;

    public Produto(int cod, String desc, double val)
    {
        this.codigo = cod;
        this.descricao = desc;
        this.valorProduto = val;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }
}
