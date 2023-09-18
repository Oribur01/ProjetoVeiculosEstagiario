package Poo.uniderp;

public class Caminhao extends VeiculoCivil {
 
    private int portas;
    private double pesoLiquido;
    private double pesoTotal;
    
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public Caminhao(int codigo, String nome, String modelo, String cor, int assentos, int anoFabricacao,
            String fabricante, int rodas, String tipoCombustível, int qtdeMotores, int qtdeOcupantes, double potência,
            String tipoVeiculo, String codigoRenavam, String estadoUF, String cidadeUF, String chassi,
            String nomeProprietário, int eixos, String placa, int anoModelo, int portas, double pesoLiquido,
            double pesoTotal) {
        super(codigo, nome, modelo, cor, assentos, anoFabricacao, fabricante, rodas, tipoCombustível, qtdeMotores,
                qtdeOcupantes, potência, tipoVeiculo, codigoRenavam, estadoUF, cidadeUF, chassi, nomeProprietário,
                eixos, placa, anoModelo);
        this.portas = portas;
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
    }

  
    
}
