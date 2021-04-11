package Program;

public class Recepcionista extends Funcionario {

    // CONSTRUTOR VAZIO
    public Recepcionista() {}

    public Recepcionista(double salario, int cargaHoraria, int cargo, 
            String nome, String sobrenome, String endereco, String email, 
            String CPF, String RG, String telefone, String dataNascimento) {
        super(salario, cargaHoraria, cargo, nome, sobrenome, endereco, email, 
                CPF, RG, telefone, dataNascimento);
    }

}
