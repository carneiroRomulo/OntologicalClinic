package Program;

public class Funcionario extends Pessoa {
    double salario;
    int cargaHoraria;
    int cargo;

    // CONSTRUTOR VAZIO
    public Funcionario() {}

    public Funcionario(double salario, int cargaHoraria, int cargo, String nome, String sobrenome, String endereco, String email, String CPF, String RG, String telefone, int idade) {
        super(nome, sobrenome, endereco, email, CPF, RG, telefone, idade);
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.cargo = cargo;
    }

    /* GETTERS */
    // RETORNA O SALARIO DO FUNCIONARIO
    public double getSalario() {
        return salario;
    }
    // RETORNA A CARGA HORARIA DO FUNCIONARIO
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    // RETORNA O CARGO DO FUNCIONARIO
    public int getCargo() {
        return cargo;
    }

    /* SETTERS */
    // ALTERA O SALARIO DO FUNCIONARIO
    protected void setSalario(double salario) {
        this.salario = salario;
    }
    // ALTERA A CARGA HORARIA DO FUNCIONARIO
    protected void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    // ALTERA O CARGO DO FUNCIONARIO
    protected void setCargo(int cargo) {
        this.cargo = cargo;
    }
}
