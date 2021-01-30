package projeto.classes;

import projeto.interfaces.IProgramacao;

public class Programacao extends Programa_Televisao implements IProgramacao {
    private double Hora_inicio;
    private double Hora_fim;

    public Programacao(){
    	super();
        Hora_inicio = 0.0;
        Hora_fim = 0.0;
    }
    
    public Programacao(int ID_programa1,String Nome1,String Descricao1,double Duracao1,int Classificacao1,double Hora_inicio1, double Hora_fim1) {
    	super(id1,nome1,descricao1,duracao1,classificacao1);
    	this.Hora_inicio = Hora_inicio1;
    	this.Hora_fim = Hora_fim1;
    	}

    public double getHora_inicio(){
        return this.Hora_inicio;
    }

    public void setHora_inicio(double hora_inicio){
        this.Hora_inicio = hora_inicio;
    }

    public double getHora_fim(){
        return this.Hora_fim;
    }

    public void setHora_fim(double hora_fim){
        this.Hora_fim = hora_fim;
    }
    
    @Override
    public String MostraMensagem() {
        return new String(super.MostraMensagem() + "hora de inicio: " + Hora_inicio + "hora de fim: " + Hora_fim);
    }
}
