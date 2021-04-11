package Program;
import java.util.List;
        
public class Dentista extends Funcionario {
    private List<Funcionario> assistenteConsultorio;
    private List<Cliente> cliente;
    private List<Agenda> agenda;

    // CONSTRUTOR VAZIO
    public Dentista() {}

    public Dentista(List<Funcionario> assistenteConsultorio, List<Cliente> cliente, 
            List<Agenda> agenda, double salario, int cargaHoraria, int cargo, 
            String nome, String sobrenome, String endereco, String email, String CPF, 
            String RG, String telefone, String dataNascimento) {
        super(salario, cargaHoraria, cargo, nome, sobrenome, endereco, email, 
                CPF, RG, telefone, dataNascimento);
        this.assistenteConsultorio = assistenteConsultorio;
        this.cliente = cliente;
        this.agenda = agenda;
    }


    /* GETTERS */
    // RETORNA OS ASSISTENTES DO DENTISTA
    public List<Funcionario> getAssistenteConsultorio() {
        return assistenteConsultorio;
    }
    // RETORNA OS CLIENTES DO DENTISTA
    public List<Cliente> getCliente() {
        return cliente;
    }
    // RETORNA A AGENDA DO CLIENTE
    public List<Agenda> getAgenda() {
        return agenda;
    }

    /* SETTERS */
    // ALTERAR OS ASSISTENTES DO DENTISTA
    protected void setAssistenteConsultorio(List<Funcionario> assistenteConsultorio) {
        this.assistenteConsultorio = assistenteConsultorio;
    }
    // ALTERA OS CLIENTES DO DENTISTA
    protected void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }
    // ALTERA A AGENDA DO DENTISTA
    protected void setAgenda(List<Agenda> agenda) {
        this.agenda = agenda;
    }
    
}
