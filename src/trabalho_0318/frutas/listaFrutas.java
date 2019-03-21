package trabalho_0318.frutas;

import java.util.LinkedList;
import java.util.Comparator;
import java.util.Collections;

public class listaFrutas {
    LinkedList<Fruta> frutas = new LinkedList<>();

    public void inserirInicio(Fruta fruta)
    {
        this.frutas.add(0, fruta);

    }

    public void removerInicio()
    {
        this.frutas.remove(0);
    }

    public void inserirMeio(Fruta fruta)
    {
        this.frutas.add(this.frutas.size()/2, fruta);
    }

    public void removerMeio()
    {
        this.frutas.remove(this.frutas.size()/2);
    }

    public void inserirFim(Fruta fruta)
    {
        this.frutas.add(fruta);
    }

    public void removerFim()
    {
        this.frutas.remove(this.frutas.size() - 1);
    }

    public void mostrarFrutas()
    {
        for(Fruta fruta: frutas)
        {
            System.out.println(fruta.getNome());
        }
    }

    public void ordenar()
    {
        Collections.sort(this.frutas, new ordenarNome());
    }
}

class ordenarNome implements Comparator<Fruta>
{
    public int compare(Fruta a, Fruta b)
    {
        return a.getNome().compareTo(b.getNome());
    }
}