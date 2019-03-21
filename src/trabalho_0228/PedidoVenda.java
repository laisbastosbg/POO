package trabalho_0228;

import java.util.Calendar;
import java.util.ArrayList;

public class PedidoVenda
{
    private int codigo;
    private Calendar data = Calendar.getInstance();
    private ArrayList<ItemDoPedido> items = new ArrayList<ItemDoPedido>();
    private Cliente cliente;
    private Vendedor vendedor;
    private Veiculo veiculo;
    private double valorPedido;

    public PedidoVenda(int cod, Cliente c, Vendedor ven, Veiculo v)
    {
        this.codigo = cod;
        this.cliente = c;
        this.vendedor = ven;
        this.veiculo = v;
    }

    public void AddItemPedido(ItemDoPedido item) { this.items.add(item); }

    public void CalculaPedido()
    {
        int i = 0;
        for(ItemDoPedido item: this.items)
        {
            this.valorPedido += this.items.get(i).getProduto().getValorProduto() * this.items.get(i).getQtd();
            i++;
        }
        this.valorPedido += this.veiculo.getValor();
    }

    public String ToString()
    {
        String s = "";
        s += System.out.printf("\t\t\t\t\t\tPEDIDO DE VENDA\nNumero do Pedido: %-26dData do Pedido: %s",this.codigo, String.format("%s", this.data.get(Calendar.DATE)));
        s += System.out.printf("/%s/%s\nCliente: %s\nVendedor: %s\nVeiculo: %-45sValor: %.2f\n",this.data.get(Calendar.MONTH)+1, this.data.get(Calendar.YEAR), this.cliente.getNome(), this.vendedor.getNome(), this.veiculo.getDescricao(), this.veiculo.getValor());
        s += System.out.printf("---------------------------Itens do Pedido---------------------------\n");
        s += System.out.printf("#Item Descrição\t\t\t\t\t  Qtd -Valor Unitário- --Valor Item--");
        int i = 0;
        for(ItemDoPedido item: this.items)
        {
            s += this.items.get(i).ToString();
            i++;
        }
        s += System.out.printf("\n---------------------------------------------------------------------\n");
        this.CalculaPedido();
        s+= System.out.printf("Valor do Pedido: %.2f\n", this.valorPedido);
        s+= System.out.printf("Comissão do Vendedor: %.2f", this.vendedor.getComissao()/100*this.valorPedido);
        return s;
    }

    public int getCodigo() { return codigo; }

    public void setCodigo(int codigo) { this.codigo = codigo; }

    public Calendar getData() { return data; }

    public void setData(Calendar data) { this.data = data; }

    public ArrayList<ItemDoPedido> getItems() { return items; }

    public void setItems(ArrayList<ItemDoPedido> items) { this.items = items; }

    public Cliente getCliente() { return cliente; }

    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Vendedor getVendedor() { return vendedor; }

    public void setVendedor(Vendedor vendedor) { this.vendedor = vendedor; }

    public Veiculo getVeiculo() { return veiculo; }

    public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }

    public double getValorPedido() { return valorPedido; }

    public void setValorPedido(float valorPedido) { this.valorPedido = valorPedido; }
}
