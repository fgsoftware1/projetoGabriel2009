package projeto;

public class Tipo_Programa extends Programa_Televisao{
    private int ID_programa;
    private String Nome;
    private String Descricao;
    private double Duracao;
    private int Classificacao;

    public Tipo_Programa() {
        ID_programa = 0;
        Nome = "";
        Descricao = "";
        Duracao = 0.00;
        Classificacao = 0;
    }

    public int getID_programa(){
        return this.ID_programa;
    }

    public void setID_programa(int id_programa){
        this.ID_programa = id_programa;
    }

    public String getNome(){
        return this.Nome;
    }

    public void setNome(String nome){
        this.Nome = nome;
    }

    public String getDescricao(){
        return this.Descricao;
    }

    public void setDescricao(String descricao){
        this.Descricao = descricao;
    }

    public double getDuracao(){
        return this.Duracao;
    }

    public void setDuracao(double duracao){
        this.Duracao = duracao;
    }

    public int getClassificacao(){
        return this.Classificacao;
    }

    public void setClassificacao(int classificacao){
        this.Classificacao = classificacao;
    }
}
