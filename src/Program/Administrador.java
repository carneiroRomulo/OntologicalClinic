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

    // CONSTRUTOR VAZIO
    public Administrador() {}

    public Administrador(String login, String senha, List<Administrador> administradores, 
            List<AssistenteAdministrativo> assistentesAdministrativos, 
            List<Dentista> dentistas, List<AssistenteDentista> assistentesDentistas, 
            List<Recepcionista> recepcionistas, List<Cliente> clientes, 
            double salario, int cargaHoraria, int cargo, String nome, 
            String sobrenome, String endereco, String email, String CPF, 
            String RG, String telefone, String dataNascimento) {
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
    public <G> void createPessoa(String nome, String endereco, 
            String email, String CPF, String RG,String telefone, 
            String dataNascimento, double salario, int cargaHoraria, int cargo,
            String login, String senha){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setEmail(email);
        this.setCPF(CPF);
        this.setRG(RG);
        this.setTelefone(telefone);
        this.setDataNascimento(dataNascimento);
        this.setSalario(salario);
        this.setCargaHoraria(cargaHoraria);
        this.setCargo(cargo);
        this.setLogin(login);
        this.setSenha(senha);
    }

    /* DELETE */
    // DELETA UM ADMINISTRADOR
    private void deletePessoa(Object obj){
        if(obj.equals(Administrador)) {}
        
    }
    // DELETA UM ASSISTENTE ADMINISTRATIVO
    private void deleteAssistenteAdministrativo(AssistenteAdministrativo assistenteAdministrativo){
        if(!assistentesAdministrativos.isEmpty()) {
            assistentesAdministrativos.remove(assistenteAdministrativo);
        }
    }
    // DELETA UM DENTISTA
    private void deleteDentista(Dentista dentista){
        if(!dentistas.isEmpty()) {
            dentistas.remove(dentista);
        }
    }
    // DELETA UM ASSISTENTE DE DENTISTA
    private void deleteAssistenteDentista(AssistenteDentista assistenteDentista) {
        if(!assistentesDentistas.isEmpty()) {
            assistentesDentistas.remove(assistenteDentista);
        }
    }
    // DELETA UM RECEPCIONISTA
    private void deleteRecepcionista(Recepcionista recepcionista) {
        if(!recepcionistas.isEmpty()) {
            recepcionistas.remove(recepcionista);
        }
    }
    // DELETA UM CLIENTE
    private void deleteCliente(Cliente cliente) {
        if(!clientes.isEmpty()) {
            clientes.remove(cliente);
        }
    }
    
    
    // FAZ A LEITURA DOS DADOS DURANTE O CADASTRO
    private void lerDados(String nome, int dataNascimento){
        Scanner input = new Scanner(System.in);
        
        boolean valida;
        do {
            valida = true;

            System.out.print("Nome: ");
            nome = input.nextLine();
            
            for(char i : nome.toCharArray()) {
                if (!Character.isLetter(i)) {
                    System.out.println("Nome possui caracteres inválidos");
                    valida = false;
                }
            }
        } while (valida != true);
        // IDADE
        do { 
            valida = true;
            System.out.print("Idade: ");
            dataNascimento = input.nextInt();
            
            if (idade < 18 || idade > 90) {
                System.out.println("Idade Mínima: 18 anos");
                System.out.println("Idade Máxima: 90 anos");
                valida = false;
            }
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
            
            if (salario < 1100) {
                System.out.println("Salário mínimo: R$1100,00");
                valida = false;
            }
            else if (salario > 30000) {
                System.out.println("Salário máximo: R$30.000,00");
                valida = false;
            }
        } while (valida != true);

        // CARGA HORARIA
        do {
            valida = true;
                
            System.out.print("Carga Horaria: ");
            cargaHoraria = input.nextInt();
            
            if(cargaHoraria < 6) {
                System.out.print("Carga Horária Mínima: 6 horas");
                valida = false;
            }
            else if (cargaHoraria > 12) {
                System.out.println("Carga Horária Máxima: 12 horas");
                valida = false;
            }
        } while (valida != true);
    }
    // GERA O RELATORIO
    private void gerarRelatorio(){}
    // MOSTRA O MENU DE OPÇÕES DO SISTEMA
    protected void mostrarMenu(){}
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

                if (salvar == 'S') {
                    //Jogando tudo isso para um arquivo
                    //File arquivo = new File("file.txt");
                    //fprintf (arquivo, "%s \t %d%c%d%c%d \t %s", i, dia, barra, mes, barra, ano, obs);
                    return;
                }
                else if (salvar == 'N') {
                    return;
                }
                else {
                    System.err.println("Opcao invalida");
                    return;
                }
           }
        }
        System.err.println("Esse funcionario nao existe na clinica");
    }
    
    // ACESSAR O SISTEMA
    protected void acessarSistema(){}
}
