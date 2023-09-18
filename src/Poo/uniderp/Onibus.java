package Poo.uniderp;

public class Onibus extends VeiculoCivil {
    
    private int portas;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public Onibus(int codigo, String nome, String modelo, String cor, int assentos, int anoFabricacao,
            String fabricante, int rodas, String tipoCombustível, int qtdeMotores, int qtdeOcupantes, double potência,
            String tipoVeiculo, String codigoRenavam, String estadoUF, String cidadeUF, String chassi,
            String nomeProprietário, int eixos, String placa, int anoModelo, int portas) {
        super(codigo, nome, modelo, cor, assentos, anoFabricacao, fabricante, rodas, tipoCombustível, qtdeMotores,
                qtdeOcupantes, potência, tipoVeiculo, codigoRenavam, estadoUF, cidadeUF, chassi, nomeProprietário,
                eixos, placa, anoModelo);
        this.portas = portas;
    }

    


}
