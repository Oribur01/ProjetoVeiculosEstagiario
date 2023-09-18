package Poo.uniderp;

public abstract class VeiculoCivil extends baseVeiculos {

    protected String codigoRenavam;
    protected String estadoUF;
    protected String cidadeUF;
    protected String chassi;
    protected String nomeProprietário;
    protected int eixos;
    protected String placa;
    protected int anoModelo;
    
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    public String getEstadoUF() {
        return estadoUF;
    }
    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }
    public String getCidadeUF() {
        return cidadeUF;
    }
    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getNomeProprietário() {
        return nomeProprietário;
    }
    public void setNomeProprietário(String nomeProprietário) {
        this.nomeProprietário = nomeProprietário;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    
    public VeiculoCivil(int codigo, String nome, String modelo, String cor, int assentos, int anoFabricacao,
            String fabricante, int rodas, String tipoCombustível, int qtdeMotores, int qtdeOcupantes, double potência,
            String tipoVeiculo, String codigoRenavam, String estadoUF, String cidadeUF, String chassi,
            String nomeProprietário, int eixos, String placa, int anoModelo) {
        super(codigo, nome, modelo, cor, assentos, anoFabricacao, fabricante, rodas, tipoCombustível, qtdeMotores,
                qtdeOcupantes, potência, tipoVeiculo);
        this.codigoRenavam = codigoRenavam;
        this.estadoUF = estadoUF;
        this.cidadeUF = cidadeUF;
        this.chassi = chassi;
        this.nomeProprietário = nomeProprietário;
        this.eixos = eixos;
        this.placa = placa;
        this.anoModelo = anoModelo;
    }

    
    


}
