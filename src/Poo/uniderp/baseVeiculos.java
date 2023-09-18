package Poo.uniderp;

public abstract class baseVeiculos {
    
    protected int codigo;
    protected String nome;
    protected String modelo;
    protected String cor;
    protected int assentos;
    protected int anoFabricacao;
    protected String fabricante;
    protected int rodas;
    protected String tipoCombustível;
    protected int qtdeMotores;
    protected int qtdeOcupantes;
    protected double potência;
    protected String tipoVeiculo;
   
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
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public String getTipoCombustível() {
        return tipoCombustível;
    }
    public void setTipoCombustível(String tipoCombustível) {
        this.tipoCombustível = tipoCombustível;
    }
    public int getQtdeMotores() {
        return qtdeMotores;
    }
    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }
    public double getPotência() {
        return potência;
    }
    public void setPotência(double potência) {
        this.potência = potência;
    }
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
   
    public baseVeiculos(int codigo, String nome, String modelo, String cor, int assentos, int anoFabricacao,
            String fabricante, int rodas, String tipoCombustível, int qtdeMotores, int qtdeOcupantes, double potência,
            String tipoVeiculo) {
        this.codigo = codigo;
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.assentos = assentos;
        this.anoFabricacao = anoFabricacao;
        this.fabricante = fabricante;
        this.rodas = rodas;
        this.tipoCombustível = tipoCombustível;
        this.qtdeMotores = qtdeMotores;
        this.qtdeOcupantes = qtdeOcupantes;
        this.potência = potência;
        this.tipoVeiculo = tipoVeiculo;
    }
   

}
