package Poo.uniderp;

public class Aviao extends baseVeiculos {
    
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
   
    public Aviao(int codigo, String nome, String modelo, String cor, int assentos, int anoFabricacao, String fabricante,
            int rodas, String tipoCombustível, int qtdeMotores, int qtdeOcupantes, double potência, String tipoVeiculo,
            int portas, double pesoLiquido, double pesoTotal) {
        super(codigo, nome, modelo, cor, assentos, anoFabricacao, fabricante, rodas, tipoCombustível, qtdeMotores,
                qtdeOcupantes, potência, tipoVeiculo);
        this.portas = portas;
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
    }

    


}
