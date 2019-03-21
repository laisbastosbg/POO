package trabalho_0318.livros;

import java.util.Vector;
import java.util.Comparator;
import java.util.Collections;

public class listaLivros {
    Vector<Livro> livros = new Vector<>();

    public void inserirInicio(Livro livro)
    {
        this.livros.add(0, livro);
    }

    public void removerInicio()
    {
        this.livros.remove(0);
    }

    public void inserirMeio(Livro livro)
    {
        this.livros.add(this.livros.size()/2, livro);
    }

    public void removerMeio()
    {
        this.livros.remove(this.livros.size()/2);
    }

    public void inserirFim(Livro livro)
    {
        this.livros.add(this.livros.size(), livro);
    }

    public void removerFim()
    {
        this.livros.remove(this.livros.size()-1);
    }

    public void ordenar()
    {
        Collections.sort(this.livros, new ordenarNome());
    }

    public void mostrarLivros()
    {
        for(Livro livro: livros)
        {
            System.out.println(livro.getNome());
        }
    }
}

class ordenarNome implements Comparator<Livro>
{
    public int compare(Livro a, Livro b)
    {
        return a.getNome().compareTo(b.getNome());
    }
}