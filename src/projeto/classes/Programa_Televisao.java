package projeto.classes;

import projeto.interfaces.IPrograma_Televisao;

public class Programa_Televisao implements IPrograma_Televisao {
    private int ID_programa;
    private String Nome;
    private String Descricao;
    private double Duracao;
    private int Classificacao;

    public Programa_Televisao() {
        ID_programa = 0;
        Nome = "";
        Descricao = "";
        Duracao = 0.00;
        Classificacao = 0;
    }

    public Programa_Televisao(int ID_programa1, String Nome1, String Descricao1, double Duracao1, int Classificacao1) {
        this.ID_programa = ID_programa1;
        this.Nome = Nome1;
        this.Descricao = Descricao1;
        this.Duracao = Duracao1;
        this.Classificacao = Classificacao1;
    }

    public int getID_programa() {
        return this.ID_programa;
    }

    public void setID_programa(int id_programa) {
        this.ID_programa = id_programa;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getDescricao() {
        return this.Descricao;
    }

    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }

    public double getDuracao() {
        return this.Duracao;
    }

    public void setDuracao(double duracao) {
        this.Duracao = duracao;
    }

    public int getClassificacao() {
        return this.Classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.Classificacao = classificacao;
    }

    public String MostraMensagem() {
        return new String("ID_programa: " + ID_programa + " Nome: " + Nome + "Descricao" + Descricao + "Duracao" + Duracao + "Classificao" + Classificacao) {
        };
    }
}