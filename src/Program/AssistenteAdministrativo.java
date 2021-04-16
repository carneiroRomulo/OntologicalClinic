package Program;

import java.util.List;

public class AssistenteAdministrativo extends Administrador {
    
    // CONSTRUTOR VAZIO
    public AssistenteAdministrativo() {}

    public AssistenteAdministrativo(double salario, int cargaHoraria, int cargo, String nome, 
            String sobrenome, String endereco, String email, String CPF, 
            String RG, String telefone, int idade, String login, String senha) {
        super(salario, cargaHoraria, cargo, nome, sobrenome, endereco, email, CPF, 
                RG, telefone, idade, login, senha);
    }
}
