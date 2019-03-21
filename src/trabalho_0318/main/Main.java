package trabalho_0318.main;

import trabalho_0318.livros.Livro;
import trabalho_0318.livros.listaLivros;
import trabalho_0318.pessoas.Pessoa;
import trabalho_0318.pessoas.listaPessoas;
import trabalho_0318.frutas.Fruta;
import trabalho_0318.frutas.listaFrutas;
import trabalho_0318.passaros.Passaro;
import trabalho_0318.passaros.listaPassaros;


public class Main {
    public static void main(String[] args) {  
        Pessoa p1 = new Pessoa("Maria");
        Pessoa p2 = new Pessoa("José");
        Pessoa p3 = new Pessoa("Joana");
        Pessoa p4 = new Pessoa("Pedro");
        Pessoa p5 = new Pessoa("Ana");

        listaPessoas listaP = new listaPessoas();

        System.out.println("----------------------------------");
        System.out.println("LISTA DE PESSOAS(ARRAYLIST)");
        System.out.println("Inserindo no inicio:");
        listaP.inserirInicio(p1);
        listaP.mostrarPessoas();
        System.out.println();
        System.out.println("Inserindo no inicio:");
        listaP.inserirInicio(p2);
        listaP.mostrarPessoas();
        System.out.println();
        System.out.println("Inserindo no meio:");
        listaP.inserirMeio(p3);
        listaP.mostrarPessoas();
        System.out.println();
        System.out.println("Inserindo no fim:");
        listaP.inserirFim(p4);
        listaP.mostrarPessoas();
        System.out.println();
        System.out.println("Inserindo no meio:");
        listaP.inserirMeio(p5);
        listaP.mostrarPessoas();

        System.out.println();

        System.out.println("LISTA ORDENADA DE PESSOAS");
        listaP.ordenar();
        listaP.mostrarPessoas();
        System.out.println();

        System.out.println("REMOVENDO DE PESSOAS");
        listaP.removerFim();
        System.out.println("Removendo do fim: ");
        listaP.mostrarPessoas();
        System.out.println();
        listaP.removerInicio();
        System.out.println("Removendo do inicio");
        listaP.mostrarPessoas();
        System.out.println();
        listaP.removerMeio();
        System.out.println("Removendo do meio");
        listaP.mostrarPessoas();
        System.out.println();

        Fruta f1 = new Fruta("Abacaxi");
        Fruta f2 = new Fruta("Uva");
        Fruta f3 = new Fruta("Laranja");
        Fruta f4 = new Fruta("Banana");
        Fruta f5 = new Fruta("Pera");

        listaFrutas listaF = new listaFrutas();

        System.out.println("----------------------------------");
        System.out.println("LISTA DE FRUTAS (LINKEDLIST)");
        System.out.println("Inserindo no inicio: ");
        listaF.inserirInicio(f1);
        listaF.mostrarFrutas();
        System.out.println();
        System.out.println("Inserindo no inicio: ");
        listaF.inserirInicio(f2);
        listaF.mostrarFrutas();
        System.out.println();
        listaF.inserirMeio(f3);
        System.out.println("Inserindo no meio: ");
        listaF.mostrarFrutas();
        System.out.println();
        listaF.inserirFim(f4);
        System.out.println("Inserindo no fim: ");
        listaF.mostrarFrutas();
        System.out.println();
        listaF.inserirMeio(f5);
        System.out.println("Inserindo no meio: ");
        listaF.mostrarFrutas();
        System.out.println();

        System.out.println("LISTA ORDENADA DE FRUTAS");
        listaF.ordenar();
        listaF.mostrarFrutas();
        System.out.println();

        System.out.println("REMOVENDO DE FRUTAS");
        listaF.removerFim();
        System.out.println("Removendo do fim: ");
        listaF.mostrarFrutas();
        System.out.println();
        listaF.removerInicio();
        System.out.println("Removendo do inicio: ");
        listaF.mostrarFrutas();
        System.out.println();
        listaF.removerMeio();
        System.out.println("Removendo do meio: ");
        listaF.mostrarFrutas();
        System.out.println();


        Passaro ps1 = new Passaro("Sabiá");
        Passaro ps2 = new Passaro("Andorinha");
        Passaro ps3 = new Passaro("Beija-flor");
        Passaro ps4 = new Passaro("Gaivota");
        Passaro ps5 = new Passaro("Calopsita");

        listaPassaros listaPs = new listaPassaros();
        System.out.println("----------------------------------");
        System.out.println("LISTA DE PASSAROS (LINKEDHASHSET)");
        System.out.println("Inserindo no fim:");
        listaPs.inserir(ps1);
        listaPs.mostrarPassaros();
        System.out.println();
        System.out.println("Inserindo no fim:");
        listaPs.inserir(ps2);
        listaPs.mostrarPassaros();
        System.out.println();
        System.out.println("Inserindo no fim:");
        listaPs.inserir(ps3);
        listaPs.mostrarPassaros();
        System.out.println();
        System.out.println("Inserindo no fim:");
        listaPs.inserir(ps4);
        listaPs.mostrarPassaros();
        System.out.println();
        System.out.println("Inserindo no fim:");
        listaPs.inserir(ps5);
        listaPs.mostrarPassaros();

        System.out.println();
        System.out.println("LISTA ORDENADA DE PASSAROS");
        listaPs.ordenar();
        listaPs.mostrarPassaros();
        System.out.println();

        System.out.println("REMOVENDO DE PASSAROS");
        listaPs.remover(ps1);
        listaPs.mostrarPassaros();
        System.out.println();
        listaPs.remover(ps2);
        listaPs.mostrarPassaros();
        System.out.println();
        listaPs.remover(ps3);
        listaPs.mostrarPassaros();
        System.out.println();


        Livro l1 = new Livro("João e Maria");
        Livro l2 = new Livro("Alice no País das Maravilhas");
        Livro l3 = new Livro("Rapunzel");
        Livro l4 = new Livro("Pinóquio");
        Livro l5 = new Livro("João e o Pé de Feijão");

        listaLivros listaL = new listaLivros();
        System.out.println("----------------------------------");
        System.out.println("LISTA DE LIVROS (VECTOR)");
        System.out.println("Inserindo no inicio:");
        listaL.inserirInicio(l1);
        listaL.mostrarLivros();
        System.out.println();
        System.out.println("Inserindo no inicio:");
        listaL.inserirInicio(l2);
        listaL.mostrarLivros();
        System.out.println();
        System.out.println("Inserindo no Meio:");
        listaL.inserirMeio(l3);
        listaL.mostrarLivros();
        System.out.println();
        System.out.println("Inserindo no Fim:");
        listaL.inserirFim(l4);
        listaL.mostrarLivros();
        System.out.println();
        System.out.println("Inserindo no Meio:");
        listaL.inserirMeio(l5);
        listaL.mostrarLivros();
        System.out.println();

        System.out.println("LISTA ORDENADA DE LIVROS");
        listaL.ordenar();
        listaL.mostrarLivros();
        System.out.println();

        System.out.println("REMOVENDO DE LIVROS");
        System.out.println("Removendo do fim:");
        listaL.removerFim();
        listaL.mostrarLivros();
        System.out.println();
        System.out.println("Removendo do Inicio:");
        listaL.removerInicio();
        listaL.mostrarLivros();
        System.out.println();
        System.out.println("Removendo do meio:");
        listaL.removerMeio();
        listaL.mostrarLivros();
    }
}
