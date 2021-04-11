package Program;

import java.util.List;

public class UserGeral extends Administrador {

    // CONSTRUTOR VAZIO
    public UserGeral() {}

    public UserGeral(List<Administrador> administradores, 
            List<AssistenteAdministrativo> assistentesAdministrativos, 
            List<Dentista> dentistas, List<AssistenteDentista> assistentesDentistas, 
            List<Recepcionista> recepcionistas, List<Cliente> clientes, 
            double salario, int cargaHoraria, int cargo, String nome, 
            String sobrenome, String endereco, String email, String CPF, 
            String RG, String telefone, String dataNascimento, String login, String senha) {
        super(administradores, assistentesAdministrativos, dentistas, 
                assistentesDentistas, recepcionistas, clientes, salario, 
                cargaHoraria, cargo, nome, sobrenome, endereco, email, CPF, RG, 
                telefone, dataNascimento, login, senha);
    }
}
