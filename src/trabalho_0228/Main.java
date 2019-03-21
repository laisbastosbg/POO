package trabalho_0228;

public class Main
{
    public static void main(String[] args)
    {
        Produto p1 = new Produto(1, "Calota Aro 13pol", 25.00);
        Produto p2 = new Produto(2, "Sensor Estacionamento", 1300.00);
        Produto p3 = new Produto(3, "GPS Garmin", 1500.00);

        Cliente c1 = new Cliente(1,"Egel Locadora", TipoCliente.PESSOA_JURIDICA);
        Cliente c2 = new Cliente(2,"Francisco José", TipoCliente.PESSOA_FISICA);

        Vendedor vd1 = new Vendedor(1,"José Emanuel", 5.00);

        Veiculo v1 = new Veiculo(1,"Fiat Siena 2011", 32000.00);
        Veiculo v2 = new Veiculo(2,"Wolks Gol 2011", 33000.00);

        ItemDoPedido ip1 = new ItemDoPedido(1, p1,4);
        ItemDoPedido ip2 = new ItemDoPedido(2, p2,1);
        ItemDoPedido ip3 = new ItemDoPedido(3, p3,1);

        PedidoVenda pv1 = new PedidoVenda(1, c1, vd1, v2);

        pv1.AddItemPedido(ip1);
        pv1.AddItemPedido(ip2);
        pv1.ToString();
        System.out.println();
    }
}
