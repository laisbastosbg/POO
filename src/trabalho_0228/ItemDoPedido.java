package trabalho_0228;

public class ItemDoPedido
{
    private int sequencial;
    private int qtd;
    private Produto produto;
    private float valorItem;

    public ItemDoPedido(int seq, Produto prod, int qtd)
    {
        this.sequencial = seq;
        this.qtd = qtd;
        this.produto = prod;
    }

    public String ToString()
    {
        String s = "";
        s += System.out.printf("\n%5d %-29s %-12d %-12.2f %.2f",this.sequencial, this.produto.getDescricao(), this.qtd, this.produto.getValorProduto(), (this.produto.getValorProduto()*this.qtd));
        return s;
    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getValorItem() {
        return valorItem;
    }

    public void setValorItem(float valorItem) {
        this.valorItem = valorItem;
    }
}
