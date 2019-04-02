package prova_190401;

import java.util.ArrayList;

public class FolhaPagamento {
    private int mes;
    private int ano;
    private double totalDescontos;
    private double totalProventos;
    private ArrayList<Colaborador> colaboradores = new ArrayList<>();

    public FolhaPagamento(int mes, int ano) {
        this.mes = mes;
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getTotalDescontos() {
        return totalDescontos;
    }

    public void setTotalDescontos() {
        this.totalDescontos = 0;
        for(Colaborador colaborador: this.colaboradores) {
            for(OcorrenciaFolha ocorrencia: colaborador.getOcorrencias()) {
                if(ocorrencia.getTipoOcorrencia() == TipoOcorrencia.D) {
                    this.totalDescontos += ocorrencia.getValor();
                }
            }
        }
    }

    public double getTotalProventos() {
        return totalProventos;
    }

    public void setTotalProventos() {
        this.totalProventos = 0;
        for(Colaborador colaborador: this.colaboradores) {
            for(OcorrenciaFolha ocorrencia: colaborador.getOcorrencias()) {
                if(ocorrencia.getTipoOcorrencia() == TipoOcorrencia.P) {
                    this.totalProventos += ocorrencia.getValor();
                }
            }
        }
    }

    public void inserirColaboradores(Colaborador colaborador) {
        this.colaboradores.add(colaborador);
    }

    public void mostrarColaboradores() {
        System.out.println("----------- COLABORADORES -----------");
        for(Colaborador colaborador: this.colaboradores) {
            System.out.println(colaborador.getNome());
        }
        System.out.println("-------------------------------------");
    }

    public double calcularFolha() {
        double total = 0;

        for(Colaborador colaborador: this.colaboradores) {
            total += colaborador.getSalarioAtual();
        }
        total += this.totalProventos;
        total -= this.totalDescontos;

        return total;
    }

    public void mostrarFolha() {
        double salarios = 0;
        double totalFinal = 0;
        System.out.println("------ FOLHA DE PAGAMENTO -----\n");

        for(Colaborador colaborador: this.colaboradores) {
            colaborador.mostrar();
            System.out.println();
        }

        for(Colaborador colaborador: this.colaboradores) {
            salarios += colaborador.getSalarioAtual();
            totalFinal += colaborador.calcularSalario();
        }
        System.out.println("------------------------------");
        System.out.printf("Valor total: %.2f\n", salarios);
        System.out.printf("Total de proventos: %.2f\n", this.totalProventos);
        System.out.printf("Total de descontos: %.2f\n", this.totalDescontos);
        System.out.printf("Valor final: %.2f", totalFinal);
    }
}
