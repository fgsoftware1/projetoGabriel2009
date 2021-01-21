package projeto;

public class Tipo_Programa extends Programa_Televisao{
    private int ID_programa;
    private String Nome;
    private String Descricao;
    private double Duracao;
    private int Classificacao;

    public Tipo_Programa(){
        ID_programa = 0;
        Nome = "";
        Descricao = "";
        Duracao = 0.00;
        Classificacao = 0;
    }

    public int getID_programa(){
        return this.ID_programa;
    }

    public String getNome(){
        return this.Nome;
    }

    public String getDescricao() {
        return this.Descricao;
    }

    public int getClassificacao(){
        return this.Classificacao;
    }
}
