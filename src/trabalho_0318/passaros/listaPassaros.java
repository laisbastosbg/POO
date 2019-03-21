package trabalho_0318.passaros;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Comparator;
import java.util.ArrayList;

public class listaPassaros {
    LinkedHashSet<Passaro> passaros = new LinkedHashSet<>();

    public void inserir(Passaro passaro)
    {
        this.passaros.add(passaro);
    }

    public void remover(Passaro passaro)
    {
        this.passaros.remove(passaro);
    }



    public void mostrarPassaros()
    {
        for(Passaro passaro: passaros)
        {
            System.out.println(passaro.getNome());
        }
    }

    public void ordenar()
    {
        ArrayList<Passaro> p = new ArrayList<>(this.passaros);
        Collections.sort(p, new ordenarNome());
        this.passaros.clear();
        this.passaros.addAll(p);
    }
}

class ordenarNome implements Comparator<Passaro>
{
    public int compare(Passaro a, Passaro b)
    {
        return a.getNome().compareTo(b.getNome());
    }
}