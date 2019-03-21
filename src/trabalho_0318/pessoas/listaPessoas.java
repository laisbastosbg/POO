package trabalho_0318.pessoas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class listaPessoas {
    ArrayList<Pessoa> pessoa = new ArrayList<>();

    public void inserirInicio(Pessoa pessoa)
    {
        this.pessoa.add(0, pessoa);
    }

    public void removerInicio()
    {
        this.pessoa.remove(0);
    }

    public void inserirMeio(Pessoa pessoa)
    {
        this.pessoa.add(this.pessoa.size()/2, pessoa);
    }

    public void removerMeio()
    {
        this.pessoa.remove(this.pessoa.size()/2);
    }

    public void inserirFim(Pessoa pessoa)
    {
        this.pessoa.add(pessoa);
    }

    public void removerFim()
    {
        this.pessoa.remove(this.pessoa.size()-1);
    }

    public void mostrarPessoas()
    {
        for(Pessoa pessoa: pessoa)
        {
            System.out.println(pessoa.getNome());
        }
    }

    public void ordenar()
    {
        Collections.sort(this.pessoa, new ordenarNome());
    }
}


class ordenarNome implements Comparator<Pessoa>
{
    public int compare(Pessoa a, Pessoa b)
    {
        return a.getNome().compareTo(b.getNome());
    }
}