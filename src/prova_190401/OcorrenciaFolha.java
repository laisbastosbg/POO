package prova_190401;

public class OcorrenciaFolha {
    private String descricao;
    private double valor;
    private TipoOcorrencia tipoOcorrencia;

    public OcorrenciaFolha(double valor, TipoOcorrencia tipoOcorrencia) {
        this.valor = valor;
        this.tipoOcorrencia = tipoOcorrencia;
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

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoOcorrencia getTipoOcorrencia() {
        return tipoOcorrencia;
    }

    public void setTipoOcorrencia(TipoOcorrencia tipoOcorrencia) {
        this.tipoOcorrencia = tipoOcorrencia;
    }
}
