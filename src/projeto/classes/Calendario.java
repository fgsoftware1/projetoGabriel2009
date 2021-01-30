package projeto.classes;

import projeto.interfaces.ICalendario;

public class Calendario extends Programa_Televisao implements ICalendario {
    private int Dia;
    private String Mes;
    private int Ano;

    public Calendario(){
    	super();
        Dia = 0;
        Mes = "";
        Ano = 0;
    }
    
    public Calendario(int Dia1,String Mes1,int Ano1) {
    	super(id1,nome1,descricao1,duracao1,classificacao1);
    	this.Dia = Dia1;
    	this.Mes = Mes1;
    	this.Ano = Ano1;
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
    
    @Override
    public String MostraMensagem() {
    	return new String(super.MostraMensagem() + "dia: " + Dia + "mes: " + Mes + "ano: " + Ano);
    }
}
