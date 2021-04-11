package Program;

import java.util.List;

public class AssistenteAdministrativo extends Administrador {
    
    // CONSTRUTOR VAZIO
    public AssistenteAdministrativo() {}

    public AssistenteAdministrativo(String login, String senha, List<Administrador> administradores, List<AssistenteAdministrativo> assistentesAdministrativos, List<Dentista> dentistas, List<AssistenteDentista> assistentesDentistas, List<Recepcionista> recepcionistas, List<Cliente> clientes, double salario, int cargaHoraria, int cargo, String nome, String sobrenome, String endereco, String email, String CPF, String RG, String telefone, String dataNascimento) {
        super(login, senha, administradores, assistentesAdministrativos, dentistas, assistentesDentistas, recepcionistas, clientes, salario, cargaHoraria, cargo, nome, sobrenome, endereco, email, CPF, RG, telefone, dataNascimento);
    }
}
