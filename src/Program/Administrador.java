package Program;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Administrador extends Funcionario {
    private String login;
    private String senha;
    private List<Administrador> administradores;
    private List<AssistenteAdministrativo> assistentesAdministrativos;
    private List<Dentista> dentistas;
    private List<AssistenteDentista> assistentesDentistas;
    private List<Recepcionista> recepcionistas;
    private List<Cliente> clientes;

    // CONSTRUTOR 
    
    public Administrador() {}

    public Administrador(List<Administrador> administradores, List<AssistenteAdministrativo> assistentesAdministrativos, List<Dentista> dentistas, List<AssistenteDentista> assistentesDentistas, List<Recepcionista> recepcionistas, List<Cliente> clientes, double salario, int cargaHoraria, int cargo, String nome, String sobrenome, String endereco, String email, String CPF, String RG, String telefone, String dataNascimento) {
        super(salario, cargaHoraria, cargo, nome, sobrenome, endereco, email, 
                CPF, RG, telefone, dataNascimento);
        this.login = "admin";
        this.senha = "admin";
        this.administradores = administradores;
        this.assistentesAdministrativos = assistentesAdministrativos;
        this.dentistas = dentistas;
        this.assistentesDentistas = assistentesDentistas;
        this.recepcionistas = recepcionistas;
        this.clientes = clientes;
    }

    public Administrador(List<Administrador> administradores, 
            List<AssistenteAdministrativo> assistentesAdministrativos, 
            List<Dentista> dentistas, List<AssistenteDentista> assistentesDentistas, 
            List<Recepcionista> recepcionistas, List<Cliente> clientes, 
            double salario, int cargaHoraria, int cargo, String nome, 
            String sobrenome, String endereco, String email, String CPF, 
            String RG, String telefone, String dataNascimento, String login, String senha) {
        super(salario, cargaHoraria, cargo, nome, sobrenome, endereco, email, 
                CPF, RG, telefone, dataNascimento);
        this.login = login;
        this.senha = senha;
        this.administradores = administradores;
        this.assistentesAdministrativos = assistentesAdministrativos;
        this.dentistas = dentistas;
        this.assistentesDentistas = assistentesDentistas;
        this.recepcionistas = recepcionistas;
        this.clientes = clientes;
    }

    /* GETTERS */
    // RETORNA O LOGIN DE UM ADMINISTRADOR OU ASSISTENTE ADMINISTRATIVO
    public String getLogin() {
        return login;
    }
    // RETORNA A SENHA DE UM ADMINISTRADOR OU ASSISTENTE ADMINISTRATIVO
    public String getSenha() {
        return senha;
    }
    
    // RETORNA A LISTA DOS ADMINISTRADORES DO CONSULTORIO
    public List<Administrador> getAdministradores() {
        return administradores;
    }
    // RETORNA A LISTA DO ASSESSORES ADMINISTRATIVOS DO CONSULTORIO    
    public List<AssistenteAdministrativo> getAssistentesAdministrativos() {
        return assistentesAdministrativos;
    }
    // RETORNA A LISTA DE DENTISTAS DO CONSULTORIO    
    public List<Dentista> getDentistas() {
        return dentistas;
    }
    // RETORNA A LISTA DE ASSISTENTES DE DENTISTAS DO CONSULTORIO    
    public List<AssistenteDentista> getAssistentesDentistas() {
        return assistentesDentistas;
    }
    // RETORNA A LISTA DE RECEPCIONISTAS DO CONSULTORIO    
    public List<Recepcionista> getRecepcionistas() {
        return recepcionistas;
    }
    // RETORNA A LISTA DE CLIENTES DO CONSULTORIO        
    public List<Cliente> getClientes() {
        return clientes;
    }

    /* SETTERS */
    // ALTERA O LOGIN DE UM ADMINISTRADOR OU ASSISTENTE ADMINISTRATIVO
    protected void setLogin(String login) {
        this.login = login;
    }
    // ALTERA A SENHA DE UM ADMINISTRADOR OU ASSISTENTE ADMINISTRATIVO
    protected void setSenha(String senha) {
        this.senha = senha;
    }
    
    // ALTERA A LISTA DOS ADMINISTRADORES DO CONSULTORIO
    protected void setAdministradores(List<Administrador> administradores) {
        this.administradores = administradores;
    }
    // ALTERA A LISTA DO ASSESSORES ADMINISTRATIVOS DO CONSULTORIO    
    protected void setAssistentesAdministrativos(List<AssistenteAdministrativo> assistentesAdministrativos) {
        this.assistentesAdministrativos = assistentesAdministrativos;
    }
    // ALTERA A LISTA DE DENTISTAS DO CONSULTORIO    
    protected void setDentistas(List<Dentista> dentistas) {
        this.dentistas = dentistas;
    }
    // ALTERA A LISTA DE ASSISTENTES DE DENTISTAS DO CONSULTORIO
    protected void setAssistentesDentistas(List<AssistenteDentista> assistentesDentistas) {
        this.assistentesDentistas = assistentesDentistas;
    }
    // ALTERA A LISTA DE RECEPCIONISTAS DO CONSULTORIO    
    protected void setRecepcionistas(List<Recepcionista> recepcionistas) {
        this.recepcionistas = recepcionistas;
    }
    // ALTERA A LISTA DE CLIENTES DO CONSULTORIO        
    protected void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    /* CREATE */
    // CRIA UMA PESSOA GENÉRICA
    public <G> void createPessoa(String nome, String sobrenome, String endereco, 
            String email, String CPF, String RG,String telefone, 
            String dataNascimento, double salario, int cargaHoraria, int cargo){
        setNome(nome);
        setSobrenome(sobrenome);
        setEndereco(endereco);
        setEmail(email);
        setCPF(CPF);
        setRG(RG);
        setTelefone(telefone);
        setDataNascimento(dataNascimento);
        setSalario(salario);
        setCargaHoraria(cargaHoraria);
        setCargo(cargo);
    }

    // DELETA UMA PESSOA
    private <Object> void deletePessoa(Object pessoa){
        try {
            if(pessoa.getClass() == Administrador.class && !administradores.isEmpty()) {
                administradores.remove(pessoa);
            }
            else if(pessoa.getClass() == AssistenteAdministrativo.class && !assistentesAdministrativos.isEmpty()) {
                assistentesAdministrativos.remove(pessoa);
            }
            else if(pessoa.getClass() == Dentista.class && !dentistas.isEmpty()) {
                dentistas.remove(pessoa);
            }
            else if(pessoa.getClass() == AssistenteDentista.class && !assistentesDentistas.isEmpty()) {
                assistentesDentistas.remove(pessoa);

            }
            else if(pessoa.getClass() == Recepcionista.class && !recepcionistas.isEmpty()) {
                recepcionistas.remove(pessoa);

            }
            else if(pessoa.getClass() == Cliente.class && !clientes.isEmpty()) {
                clientes.remove(pessoa);
            }
        } catch (Exception e){
            System.err.println("Não foi possivel deletar a pessoa");
        }
    }
    
    // FAZ A LEITURA DOS DADOS DURANTE O CADASTRO
    private void lerDados(String nome, String sobrenome, String endereco, String email, 
            String CPF, String RG, String telefone, String dataNascimento, 
            double salario, int cargaHoraria, int cargo) {
        
        Scanner input = new Scanner(System.in); 
        boolean valida = true;
        do {
            System.out.print("Nome: ");
            nome = input.nextLine();
            
            for(char i : nome.toCharArray()) {
                if (!Character.isLetter(i)) {
                    System.err.println("Nome possui caracteres inválidos");
                    valida = false;
                }
            }
        } while (valida != true);
        // IDADE
        do { 
            valida = true;
            dataNascimento = input.nextLine();
            /*VERIFICAR IDADE AQUI*/
        } while (valida != true);

        // CARGO
        do {
            valida = true;
            System.out.println("01 - ADMINISTRADOR");
            System.out.println("02 - ASSISTENTE ADM");
            System.out.println("03 - DENTISTA");
            System.out.println("04 - ASSISTENTE DENT");
            System.out.println("05 - RECEPCIONISTA");
            System.out.printf("Cargo: ", cargo);
           
            if(cargo < 1 || cargo > 5) {
                System.out.println("Cargo inválido");
                valida = false;
            }
        } while (valida != true);

        // SALARIO
        do {
            valida = true;
            System.out.print("Salario: ");
            salario = input.nextInt();
            
            if (salario < 1100 || salario > 30000) {
                System.err.println("Salário mínimo: R$1100,00");
                System.err.println("Salário máximo: R$30.000,00");
                valida = false;
            }
        } while (valida != true);

        // CARGA HORARIA
        do {
            valida = true;
                
            System.out.print("Carga Horaria: ");
            cargaHoraria = input.nextInt();
            
            if(cargaHoraria < 6 || cargaHoraria > 12) {
                System.err.print("Carga Horária Mínima: 6 horas");
                System.err.println("Carga Horária Máxima: 12 horas");
                valida = false;
            }
        } while (valida != true);
    }
    
    // GERA O RELATORIO
    private void gerarRelatorio(){}
    // MOSTRA O MENU DE OPÇÕES DO SISTEMA
    protected void mostrarMenu(){
        Scanner input = new Scanner(System.in);
        
        Agenda agenda = new Agenda();
        Consulta consulta = new Consulta();
        Contas conta = new Contas();
        List<Cliente> cliente;

        int comando;

        while(true) {
            System.out.println("------------MENU------------");
            System.out.println("01 - Acessar agenda");
            System.out.println("02 - Receber Consulta");
            System.out.println("03 - Pagamento de Contas");
            System.out.println("04 - Mostrar Folha de Ponto");
            System.out.println("05 - Cadastrar novo Usuário");
            System.out.println("00 - Fechar Sistema");

            System.out.print("Digite uma opcao: ");
            comando = input.nextInt();

            switch(comando) {
                case 01: {
                    agenda.abrirAgenda();
                    break;
                }
                case 02: {
                    System.out.print("Com qual dentista é a consulta? ");
                    String nome = input.nextLine();

                    for (Dentista i : dentistas) {
                        if (nome.equals(i.getNome())) {
                            cliente = i.getCliente();
                        }
                    }
                    consulta.receberConsulta();
                    break;
                }
                case 03: {            
                    conta.pagamentoContas();
                    break;
                }
                // MOSTRA A FOLHA DE PONTO DE UM DETERMINADO FUNCIONARIO
                case 04: {
                    folhaDePonto();
                    break;
                }
                // CADASTRA UM NOVO FUCIONARIO
                case 05: {
                    String nome = "", sobrenome = "", endereco = "", email = "", 
                            CPF = "", RG = "", telefone = "", dataNascimento = "";
                    int cargaHoraria = 0, cargo = 0;
                    double salario = 0.0;
                    lerDados(nome, sobrenome, endereco, email, CPF, RG, telefone, 
                            dataNascimento, salario, cargaHoraria, cargo);

                    // CADASTRA UM ADMINISTRADOR
                    switch(cargo){
                        case 1:{
                            administradores.add(createPessoa(nome, sobrenome, 
                                    endereco, email, CPF, RG, telefone, dataNascimento, 
                                    salario, cargaHoraria, cargo));
                            break;
                        }
                        // CADASTRA UM ASSISTENTE ADMINISTRATIVO
                        case 2:{
                            assistentesAdministrativos.add(createPessoa(nome, 
                                    sobrenome, endereco, email, CPF, RG, telefone, 
                                    dataNascimento, salario, cargaHoraria, cargo));
                            break;
                        }
                        // CADASTRA UM DENTISTA
                        case 3:{
                            dentistas.add(createPessoa(nome, sobrenome, 
                                    endereco, email, CPF, RG, telefone, 
                                    dataNascimento, salario, 
                                    cargaHoraria, cargo));
                            break;
                        }
                        // CADASTRA UM ASSISTENTE DE DENTISTA
                        case 4:{
                            assistentesDentistas.add(createPessoa(nome, sobrenome, 
                                    endereco, email, CPF, RG, telefone, dataNascimento, 
                                    salario, cargaHoraria, cargo));
                            break;
                        }
                        // CADASTRA UM RECEPCIONISTA
                        case 5:{
                            recepcionistas.add(createPessoa(nome, sobrenome, 
                                    endereco, email, CPF, RG, telefone, dataNascimento, 
                                    salario, cargaHoraria, cargo));
                            break;
                        }
                        default:{
                            System.err.println("Erro no cadastro do funcionario");
                            break;
                        }
                    }
                    System.out.println("Cadastro realizado com sucesso");
                    System.out.println("Redirecionando para o menu...");
                }
                case 00: {
                    System.out.println("ENCERRANDO SESSÃO...");
                    System.exit(1);
                }
            }
        }
    }
    
    // RETORNA A FOLHA DE PONTO DE UM DETERMINADO FUNCIONARIO
    private void folhaDePonto(){
        Scanner input= new Scanner(System.in);
        
        //VETOR PARA ADICIONAR TODOS OS FUNCIONARIOS
        List<Object> nomes = new ArrayList<>();
        nomes.add(getAdministradores());
        nomes.add(getAssistentesAdministrativos());
        nomes.add(getDentistas());
        nomes.add(getAssistentesDentistas());
        nomes.add(getRecepcionistas());
        
        //LEITURA DO NOME DOS FUNCIONARIOS
        System.out.println("------------FUNCIONARIOS------------");
        for(Object i : nomes) {
            System.out.println(i);
        }
        
        System.out.print("Qual funcionario deseja editar a folha de ponto? ");
        String nome = input.nextLine();
        
        for (Object i : nomes) {
            if (nome.equals(i)) {
                int dia, mes, ano;
                char barra, obs, salvar;
                
                System.out.print("Insira a data em que o funcionario trabalhou (dd/mm/aa):");
                dia = input.nextInt();
                barra = input.next().charAt(0);
                mes = input.nextInt();
                //barra = input.next().charAt(0);
                ano = input.nextInt();
                
                if (dia > 31 || dia <= 0 || mes <= 0 || mes > 12 || ano <= 0 || ano > 2021) {
                    System.out.println("Data invalida");     
                    return;
                }
                System.out.print("Alguma observacao a ser feita referente ao dia de trabalho? [S - N]");
                obs = input.next().charAt(0);

                //FAZER UMA TABELA BONITA
                System.out.printf("Folha de Ponto – ", i);
                System.out.printf("Data \t Observacao", dia, barra, mes, barra, ano, "\t", obs);

                System.out.print("Deseja salvar? S ou N");
                salvar = input.next().charAt(0);

                switch(salvar){
                    case 'S': {
                        System.out.println("Salvo com sucesso");
                        return;
                    }
                    case 'N': {
                        return;
                    }
                    default: {
                        System.err.println("Opcao invalida");
                        return;
                    }
                }
           }
        }
        System.err.println("Esse funcionario nao existe na clinica");
    }
    
    // ACESSAR O SISTEMA
    public void acessarSistema(Administrador admin){
        Scanner input = new Scanner(System.in);
        Clinica clinica = new Clinica();
        String login, senha;

        System.out.printf("--------------CLINICA ", clinica.getNomeEmpresa(),"--------------\n");

        while(true) {
            System.out.print("Login: ");
            login = input.nextLine();
            System.out.print("Senha: ");
            senha = input.nextLine();
            
            for(Administrador i : administradores){
                try {
                    if(login.equals(i.getLogin()) || senha.equals(i.getSenha())) {
                        System.out.printf("Bem vindo ", i.getNome());
                        mostrarMenu();
                    }
                } catch (Exception e ){
                    System.err.println("Acesso inválido, por favor tente novamente");
                }
            }
        }
    }
}
