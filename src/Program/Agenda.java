package Program;
import java.util.List;
        
public class Agenda {
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int minutos;

    // CONSTRUTOR VAZIO
    public Agenda() {}

    public Agenda(int dia, int mes, int ano, int hora, int minutos) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minutos = minutos;
    }

    /* GETTERS */
    // RETORNA O DIA
    public int getDia() {
        return dia;
    }
    // RETORNA O MES
    public int getMes() {
        return mes;
    }
    // RETORNA O ANO
    public int getAno() {
        return ano;
    }
    // RETORNA A HORA
    public int getHora() {
        return hora;
    }
    // RETORNA OS MINUTOS
    public int getMinutos() {
        return minutos;
    }

    /* SETTERS */
    // ALTERA O DIA
    protected void setDia(int dia) {
        this.dia = dia;
    }
    // ALTERA O MES
    protected void setMes(int mes) {
        this.mes = mes;
    }
    // ALTERA O ANO
    protected void setAno(int ano) {
        this.ano = ano;
    }
    // ALTERA A HORA
    protected void setHora(int hora) {
        this.hora = hora;
    }
    // ALTERA OS MINUTOS
    protected void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    
    //ABRE A AGENDA DE UM DETERMINADO DENTISTA
    public void abrirAgenda(){}
    // EDITA A AGENDA DE UM DETERMINADO DENTISTA
    public void editarAgenda(){}
}
