package prova_190401;

import java.util.ArrayList;

public class Colaborador {
    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private String bairro;
    private String cep;
    private String cpf;
    private double salarioAtual;
    private ArrayList<OcorrenciaFolha> ocorrencias = new ArrayList<>();

    public Colaborador(int codigo, String nome, String endereco, String telefone, String bairro, String cep, String cpf, double salarioAtual) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.bairro = bairro;
        this.cep = cep;
        this.cpf = cpf;
        this.salarioAtual = salarioAtual;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioAtual() {
        return salarioAtual;
    }

    public void setSalarioAtual(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public ArrayList<OcorrenciaFolha> getOcorrencias() {
        return this.ocorrencias;
    }

    public void inserirOcorrencias(OcorrenciaFolha ocorrencia) {
        this.ocorrencias.add(ocorrencia);
    }

    public double calcularSalario() {
        double salarioTotal = this.salarioAtual;
        for(OcorrenciaFolha ocorrencia: this.ocorrencias) {
            if(ocorrencia.getTipoOcorrencia() == TipoOcorrencia.P) {
                salarioTotal += ocorrencia.getValor();
            } else if(ocorrencia.getTipoOcorrencia() == TipoOcorrencia.D) {
                salarioTotal -= ocorrencia.getValor();
            }
        }
        return salarioTotal;
    }

    public void mostrar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario atual: " + this.salarioAtual);
        for(OcorrenciaFolha ocorrencia: this.ocorrencias) {
            if(ocorrencia.getTipoOcorrencia() == TipoOcorrencia.P) {
                System.out.printf("Valor provento: %.2f\n", ocorrencia.getValor());
            } else {
                System.out.printf("Valor desconto: %.2f\n", ocorrencia.getValor());
            }
        }
        System.out.printf("Total: %.2f", calcularSalario());
        System.out.println();
    }
}
