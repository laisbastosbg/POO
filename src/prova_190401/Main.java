package prova_190401;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        OcorrenciaFolha oc1 = new OcorrenciaFolha(200, TipoOcorrencia.P);
        OcorrenciaFolha oc2 = new OcorrenciaFolha(50, TipoOcorrencia.P);
        OcorrenciaFolha oc3 = new OcorrenciaFolha(350, TipoOcorrencia.P);
        OcorrenciaFolha oc4 = new OcorrenciaFolha(100, TipoOcorrencia.P);
        OcorrenciaFolha oc5 = new OcorrenciaFolha(150, TipoOcorrencia.P);

        OcorrenciaFolha oc6 = new OcorrenciaFolha(200, TipoOcorrencia.D);
        OcorrenciaFolha oc7 = new OcorrenciaFolha(50, TipoOcorrencia.D);
        OcorrenciaFolha oc8 = new OcorrenciaFolha(350, TipoOcorrencia.D);
        OcorrenciaFolha oc9 = new OcorrenciaFolha(100, TipoOcorrencia.D);
        OcorrenciaFolha oc10 = new OcorrenciaFolha(150, TipoOcorrencia.D);

        Colaborador CL01 = new Colaborador(100,"Manoel Claudino","Av 13 de Maio, 2081", "8867-1020", "Benfica", "60020060", "124543556-89", 4500.0);
            CL01.inserirOcorrencias(oc1);

        Colaborador CL02 = new Colaborador(200, "Carmelina da Silva", "Av dos Expedicionarios, 1200", "3035-1280", "Aerolandia", "60530-020", "301789435-54", 2500.0);
            CL02.inserirOcorrencias(oc2);
            CL02.inserirOcorrencias(oc5);
            CL02.inserirOcorrencias(oc9);

        Colaborador CL03 = new Colaborador(300, "Gurmelina Castro e Silva", "Av João Pessoa, 1020", "3235-1089", "Damas", "60330-090", "350245632-76", 3000.0);
            CL03.inserirOcorrencias(oc3);
            CL03.inserirOcorrencias(oc7);

        Colaborador CL04 = new Colaborador(400, "Joao do Espirito Renovado", "Av Bezerra de Menezes, 1243", "3227-8765", "Monte Castelo", "60650-450", "124543556-89", 1200.0);
            CL04.inserirOcorrencias(oc5);
            CL04.inserirOcorrencias(oc6);

        Colaborador CL05 = new Colaborador(500, "Setembrino dos Santos Cordeiro", "Av Jovita Feitosa, 810", "3227-3250", "Parquelandia", "60120-060", "245325436-87", 2500.0);
            CL05.inserirOcorrencias(oc4);
            CL05.inserirOcorrencias(oc8);
            CL05.inserirOcorrencias(oc10);


        FolhaPagamento folha = new FolhaPagamento(04, 2019);
        folha.inserirColaboradores(CL01);
        folha.inserirColaboradores(CL02);
        folha.inserirColaboradores(CL03);
        folha.inserirColaboradores(CL04);
        folha.inserirColaboradores(CL05);
        //folha.mostrarColaboradores();
        folha.setTotalDescontos();
        folha.setTotalProventos();
        folha.mostrarFolha();
    }
}
