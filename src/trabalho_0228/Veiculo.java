package trabalho_0228;

public class Veiculo
{
    private int codigo;
    private String descricao;
    private double valor;

    public Veiculo(int cod, String desc, double valor)
    {
        this.codigo = cod;
        this.descricao = desc;
        this.valor = valor;
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

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
