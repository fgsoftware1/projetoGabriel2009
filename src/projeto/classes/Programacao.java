package projeto.classes;

import projeto.interfaces.IProgramacao;

public class Programacao implements IProgramacao {
    private double Hora_inicio;
    private double Hora_fim;

    public Programacao(){
        Hora_inicio = 0.0;
        Hora_fim = 0.0;
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
}
