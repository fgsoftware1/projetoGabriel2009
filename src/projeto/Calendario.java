package projeto;

public class Calendario {
    private int Dia;
    private String Mes;
    private int Ano;

    public Calendario(){
        Dia = 0;
        Mes = "";
        Ano = 0;
    }

    public int getDia(){
        return this.Dia;
    }

    public void setDia(int dia){
        this.Dia = dia;
    }

    public String getMes(){
        return this.Mes;
    }

    public void setMes(String mes){
        this.Mes = mes;
    }

    public int getAno(){
        return this.Ano;
    }

    public void setAno(int ano){
        this.Ano = ano;
    }
}
