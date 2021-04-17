package Program;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Administrador extends Funcionario {
    private String login;
    private String senha;

    // CONSTRUTOR 
    
    public Administrador() {
        login = "admin";
        senha = "admin";
    }

    public Administrador( 
            double salario, int cargaHoraria, int cargo, String nome, 
            String sobrenome, String endereco, String email, String CPF, 
            String RG, String telefone, int idade, String login, String senha) {
        super(salario, cargaHoraria, cargo, nome, sobrenome, endereco, email, 
                CPF, RG, telefone, idade);
        this.login = login;
        this.senha = senha;
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
    
    /* SETTERS */
    // ALTERA O LOGIN DE UM ADMINISTRADOR OU ASSISTENTE ADMINISTRATIVO
    protected void setLogin(String login) {
        this.login = login;
    }
    // ALTERA A SENHA DE UM ADMINISTRADOR OU ASSISTENTE ADMINISTRATIVO
    protected void setSenha(String senha) {
        this.senha = senha;
    }
    
    /* CREATE */
    // CRIA UMA PESSOA GENÉRICA
    public void createPessoa(List list){
        String nome, sobrenome, endereco, email, CPF, RG, telefone;
        double pagamento;
        int horario, emprego, idade;
        
        Scanner input = new Scanner(System.in); 
        boolean valida;
        /* LEITURA E VALIDAÇÃO DOS DADOS */
        // NOME
        do {
            valida = true;
            System.out.print("\nNome: ");
            nome = input.nextLine();
            
            //VERIFICAÇÃO DO NOME
            if (!nome.matches("[a-zA-Z]*")) {
                System.err.println("Nome possui caracteres inválidos");
                valida = false;
            }
            else {
                valida = true;
            }
        } while (valida != true);
       
        // SOBRENOME
        do {
            valida = true;
            System.out.print("Sobrenome: ");
            sobrenome = input.nextLine();
            
            //VERIFICAÇÃO DO SOBRENOME
            if (!sobrenome.matches("[a-zA-Z]*")) {
                System.err.println("Sobrenome possui caracteres inválidos");
                valida = false;
            }
            else {
                valida = true;
            }
        } while (valida != true);
        
        // ENDEREÇO
        do { 
            valida = true;
            System.out.print("Endereço: ");
            endereco = input.nextLine();
            
            //VERIFICAÇÃO DO ENDEREÇO (ACEITA APENAS LETRAS, NUMEROS E VÍRGULA)
            if (!endereco.matches("[a-zA-Z0-9,-, ]*")) {
                System.err.println("Endereço possui caracteres inválidos");
                valida = false;
            }
            else {
                valida = true;
            }
        } while (valida != true);
        
        // EMAIL
        do { 
            valida = true;
            System.out.print("Email: ");
            email = input.nextLine();
            
            //VERIFICAÇÃO DO EMAIL (ACEITA APENAS LETRAS, NUMEROS E @)
            if (!email.matches("[a-zA-Z0-9@.]*")) {
                System.err.println("Email possui caracteres inválidos");
                valida = false;
            }
            else {
                valida = true;
            }
        } while (valida != true);
        
        // CPF
        do { 
            valida = true;
            System.out.print("CPF: ");
            CPF = input.nextLine();
            
             //VERIFICAÇÃO DO CPF (ACEITA APENAS NÚMEROS, PONTO E BARRA)
            if (!CPF.matches("[0-9.-]*")) {
                System.err.println("CPF possui caracteres inválidos");
                valida = false;
            }
            else {
                valida = true;
            }
            
        } while (valida != true);
        
        // RG
        do { 
            valida = true;
            System.out.print("RG: ");
            RG = input.nextLine();
            
             //VERIFICAÇÃO DO RG (ACEITA APENAS NÚMEROS, PONTO E BARRA)
            if (!RG.matches("[0-9.-]*")) {
                System.err.println("RG possui caracteres inválidos");
                valida = false;
            }
            else {
                valida = true;
            }
        } while (valida != true);
        
        // TELEFONE
        do { 
            valida = true;
            System.out.print("Telefone: ");
            telefone = input.nextLine();
            
             //VERIFICAÇÃO DO CPF (ACEITA APENAS NÚMEROS, PONTO E BARRA)
            if (!telefone.matches("[0-9(-)---]*")) {
                System.err.println("Telefone possui caracteres inválidos");
                valida = false;
            }
            else {
                valida = true;
            }
        } while (valida != true);
        
        // IDADE
        do { 
            valida = true;
            System.out.print("Idade: ");
            idade = input.nextInt();
           
            if(idade < 18 || idade > 90) {
                System.err.println("Idade Mínima: 18 anos\nIdade Máxima: 90 anos");
                valida = false;
            }               
        } while (valida != true);
        
        // SALARIO
        do {
            valida = true;
            System.out.print("Salario: ");
            pagamento = input.nextInt();
            
            if (pagamento < 1100 || pagamento > 30000) {
                System.err.println("Salário mínimo: R$1100,00");
                System.err.println("Salário máximo: R$30.000,00");
                valida = false;
            }
        } while (valida != true);

        // CARGA HORARIA
        do {
            valida = true;
                
            System.out.print("Carga Horaria: ");
            horario = input.nextInt();
            
            if(horario < 6 || horario > 12) {
                System.err.print("Carga Horária Mínima: 6 horas");
                System.err.println("Carga Horária Máxima: 12 horas");
                valida = false;
            }
        } while (valida != true);
        
        // CARGO
        do {
            valida = true;
            System.out.println("\n01 - ADMINISTRADOR");
            System.out.println("02 - ASSISTENTE ADM");
            System.out.println("03 - DENTISTA");
            System.out.println("04 - ASSISTENTE DENT");
            System.out.println("05 - RECEPCIONISTA");
            System.out.print("Cargo: ");
            emprego = input.nextInt();
           
            if(emprego < 1 || emprego > 5) {
                System.err.println("Cargo inválido");
                valida = false;
            }
        } while (valida != true);  
        
        switch(emprego) {
            case 1:{
                Administrador adm = new Administrador();
                adm.setNome(nome);
               
                adm.setSobrenome(sobrenome);
                adm.setEndereco(endereco);
                adm.setEmail(email);
                adm.setCPF(CPF);
                adm.setRG(RG);
                adm.setTelefone(telefone);
                adm.setIdade(idade);
                adm.setSalario(pagamento);
                adm.setCargaHoraria(horario);
                adm.setCargo(emprego);

                list.add(adm);
                break;
            }
            // CADASTRA UM ASSISTENTE ADMINISTRATIVO
            case 2:{
                AssistenteAdministrativo assistente = new AssistenteAdministrativo();
                assistente.setNome(nome);
               
                assistente.setSobrenome(sobrenome);
                assistente.setEndereco(endereco);
                assistente.setEmail(email);
                assistente.setCPF(CPF);
                assistente.setRG(RG);
                assistente.setTelefone(telefone);
                assistente.setIdade(idade);
                assistente.setSalario(pagamento);
                assistente.setCargaHoraria(horario);
                assistente.setCargo(emprego);

                list.add(assistente);
                break;
            }
            
            // CADASTRA UM DENTISTA
            case 3:{
                Dentista dentista = new Dentista();

                dentista.setNome(nome); 
                dentista.setSobrenome(sobrenome);
                dentista.setEndereco(endereco);
                dentista.setEmail(email);
                dentista.setCPF(CPF);
                dentista.setRG(RG);
                dentista.setTelefone(telefone);
                dentista.setIdade(idade);
                dentista.setSalario(pagamento);
                dentista.setCargaHoraria(horario);
                dentista.setCargo(emprego);

                list.add(dentista);
                
                break;
            }
            // CADASTRA UM ASSISTENTE DE DENTISTA
            case 4:{
                AssistenteDentista assistenteDentista = new AssistenteDentista();
               
                assistenteDentista.setNome(nome);
               
                assistenteDentista.setSobrenome(sobrenome);
                assistenteDentista.setEndereco(endereco);
                assistenteDentista.setEmail(email);
                assistenteDentista.setCPF(CPF);
                assistenteDentista.setRG(RG);
                assistenteDentista.setTelefone(telefone);
                assistenteDentista.setIdade(idade);
                assistenteDentista.setSalario(pagamento);
                assistenteDentista.setCargaHoraria(horario);
                assistenteDentista.setCargo(emprego);

                list.add(assistenteDentista);
                break;
            }
            // CADASTRA UM RECEPCIONISTA
            case 5:{
                Recepcionista recepcionista = new Recepcionista();
                recepcionista.setNome(nome);
               
                recepcionista.setSobrenome(sobrenome);
                recepcionista.setEndereco(endereco);
                recepcionista.setEmail(email);
                recepcionista.setCPF(CPF);
                recepcionista.setRG(RG);
                recepcionista.setTelefone(telefone);
                recepcionista.setIdade(idade);
                recepcionista.setSalario(pagamento);
                recepcionista.setCargaHoraria(horario);
                recepcionista.setCargo(emprego);

                list.add(recepcionista);
                break;
            }
            default:{
                System.err.println("Erro no cadastro de funcionario");
                break;
            }
        }
    }
    
    // GERA O RELATORIO
    //private void gerarRelatorio(){}

    // MOSTRA O MENU DE OPÇÕES DO SISTEMA
    protected void mostrarMenu(){
        Scanner input = new Scanner(System.in);
        
        Agenda agenda = new Agenda();
        Consulta consulta = new Consulta();
        Contas conta = new Contas();
        
        File arqAgenda = new File ("Agenda.txt");
        File arqContas = new File ("Contas.txt");
        File arqConsultas = new File ("Consultas.txt");
        File arqSalarios  = new File ("Salarios.txt");
        File arqFolhaDePonto = new File ("FolhaDePonto.txt");
        
        
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
                    Cliente cliente = new Cliente();
                    System.out.print("Qual seu nome? ");
                    String nomePaciente = input.next();
                    cliente.setNome(nomePaciente);
                    System.out.print("Com qual dentista é a consulta? ");
                    String nome = input.nextLine();
                    
                    Scanner ler = new Scanner(System.in);
                    List<Dentista> dentistas = new ArrayList<Dentista>();

                    try {
                        //ABRE O ARQUIVO DE DENTISTAS DISPONIVEIS E JOGA NUMA LIST
                        FileReader arq = new FileReader("Dentistas.txt");
                        BufferedReader lerArq = new BufferedReader(arq);

                        //Lê A PRIMEIRA LINHA QUE NO CASO É O NOME DO DENTISTA
                        String linha = lerArq.readLine();
                        String teste;
                        while (linha != null) {
                            //VERIFICA APENAS O NOME DO DENTISTA
                            if (linha.contains("Administrador: ")) {
                                teste = linha.replace("Administrador: ", "");
                                Dentista dentista = new Dentista();
                                dentista.setNome(teste);
                                dentistas.add(dentista);

                            }
                            //LÊ DA SEGUNDA ATÉ A ÚLTIMA LINHA
                            linha = lerArq.readLine();
                        }

                        arq.close();
                    } catch (IOException e) {
                        System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
                    }
                    
                    consulta.receberConsulta(cliente);
                    break;
                }
                
                //FAZ O PAGAMENTO DE ALGUMA CONTA
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
                    int cargo;
                    boolean valida;
                    
                    // CARGO
                    do {
                        valida = true;
                        System.out.println("\n01 - ADMINISTRADOR");
                        System.out.println("02 - ASSISTENTE ADM");
                        System.out.println("03 - DENTISTA");
                        System.out.println("04 - ASSISTENTE DENT");
                        System.out.println("05 - RECEPCIONISTA");
                        System.out.print("Cargo: ");
                        cargo = input.nextInt();

                        if(cargo < 1 || cargo > 5) {
                            System.err.println("Cargo inválido");
                            valida = false;
                        }
                    } while (valida != true);  
                    
                    switch(cargo){
                        // CADASTRA UM ADMINISTRADOR
                        case 1:{
                            
                            //CRIA UMA LISTA DE ADM'S E VAI JOGANDO EM UM ARQUIVO 
                            List<Administrador> adm = new ArrayList<Administrador>();
                            createPessoa(adm);
                            
                            //CRIA UM ARQUIVO PARA JOGAR OS DADOS DOS FUNCIONÁRIOS
                            File arqAdm = new File ("Administradores.txt");
                            try { 
                                arqAdm.createNewFile();

                                //APONTA O PONTEIRO PARA A PRIMEIRA POSIÇÃO DO ARQUIVO
                                //O 2º PARÂMETRO SENDO FALSE, SOBREESCREVE O ARQUIVO COM O NOVO CONTEÚDO
                                //SENDO TRUE ESCREVE DE ONDE PAROU
                                FileWriter fileWriter = new FileWriter (arqAdm, true);

                                //USANDO A CLASSE PrintWriter PARA ESCREVER NO ARQUIVO
                                PrintWriter printWriter = new PrintWriter (fileWriter);
                                for (int i = 0; i < adm.size(); i++ ) {
                                    printWriter.println ("Administrador: " + adm.get(i).getNome());
                                    printWriter.println ("Idade: " + adm.get(i).getIdade());
                                    printWriter.println ("Cargo: " + adm.get(i).getCargo());
                                    printWriter.println ("Salário: " + adm.get(i).getSalario());
                                    printWriter.println ("Telefone: " + adm.get(i).getTelefone());
                                    printWriter.println ("Endereço: " + adm.get(i).getEndereco());
                                    printWriter.println ("Carga Horária: " + adm.get(i).getCargaHoraria());
                                    printWriter.println ("Login: " + adm.get(i).getLogin());
                                    printWriter.println ("Senha: " + adm.get(i).getSenha());
                                    printWriter.print("\n");
                                }
                                
                                //LIBERA A ESCRITA NO ARQUIVO
                                printWriter.flush();

                                //FECHA O ARQUIVO
                                printWriter.close();

                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        }
                        // CADASTRA UM ASSISTENTE ADMINISTRATIVO
                        case 2:{
                            //CRIA UMA LISTA DE ASSISTENTES ADMINISTRATIVOS E VAI JOGANDO EM UM ARQUIVO 
                            List<AssistenteAdministrativo> assistentes = new ArrayList<AssistenteAdministrativo>();
                            createPessoa(assistentes);

                            //CRIA UM ARQUIVO PARA JOGAR OS DADOS DOS FUNCIONÁRIOS
                            File arqAssAdm = new File("AssistentesAdm.txt");
                            try {
                                arqAssAdm.createNewFile();

                                //APONTA O PONTEIRO PARA A PRIMEIRA POSIÇÃO DO ARQUIVO
                                //O 2º PARÂMETRO SENDO FALSE, SOBREESCREVE O ARQUIVO COM O NOVO CONTEÚDO
                                //SENDO TRUE ESCREVE DE ONDE PAROU
                                FileWriter fileWriter = new FileWriter(arqAssAdm, true);

                                //USANDO A CLASSE PrintWriter PARA ESCREVER NO ARQUIVO
                                PrintWriter printWriter = new PrintWriter(fileWriter);
                                for (int i = 0; i < assistentes.size(); i++) {
                                    printWriter.println("Assistente administrativo: " + assistentes.get(i).getNome());
                                    printWriter.println("Idade: " + assistentes.get(i).getIdade());
                                    printWriter.println("Cargo: " + assistentes.get(i).getCargo());
                                    printWriter.println("Salário: " + assistentes.get(i).getSalario());
                                    printWriter.println("Telefone: " + assistentes.get(i).getTelefone());
                                    printWriter.println("Endereço: " + assistentes.get(i).getEndereco());
                                    printWriter.println("Carga Horária: " + assistentes.get(i).getCargaHoraria());
                                    printWriter.println("Login: " + assistentes.get(i).getLogin());
                                    printWriter.println("Senha: " + assistentes.get(i).getSenha());
                                    printWriter.print("\n");
                                }

                                //LIBERA A ESCRITA NO ARQUIVO
                                printWriter.flush();

                                //FECHA O ARQUIVO
                                printWriter.close();

                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        }
                        // CADASTRA UM DENTISTA
                        case 3:{                            
                            //CRIA UMA LISTA DE ADM'S E VAI JOGANDO EM UM ARQUIVO 
                            List<Dentista> dentista = new ArrayList<Dentista>();
                            createPessoa(dentista);

                            //CRIA UM ARQUIVO PARA JOGAR OS DADOS DOS FUNCIONÁRIOS
                            File arqDentista = new File("Dentistas.txt");
                            try {
                                arqDentista.createNewFile();

                                //APONTA O PONTEIRO PARA A PRIMEIRA POSIÇÃO DO ARQUIVO
                                //O 2º PARÂMETRO SENDO FALSE, SOBREESCREVE O ARQUIVO COM O NOVO CONTEÚDO
                                //SENDO TRUE ESCREVE DE ONDE PAROU
                                FileWriter fileWriter = new FileWriter(arqDentista, true);

                                //USANDO A CLASSE PrintWriter PARA ESCREVER NO ARQUIVO
                                PrintWriter printWriter = new PrintWriter(fileWriter);
                                for (int i = 0; i < dentista.size(); i++) {
                                    printWriter.println("Dentista: " + dentista.get(i).getNome());
                                    printWriter.println("Idade: " + dentista.get(i).getIdade());
                                    printWriter.println("Cargo: " + dentista.get(i).getCargo());
                                    printWriter.println("Salário: " + dentista.get(i).getSalario());
                                    printWriter.println("Telefone: " + dentista.get(i).getTelefone());
                                    printWriter.println("Endereço: " + dentista.get(i).getEndereco());
                                    printWriter.println("Carga Horária: " + dentista.get(i).getCargaHoraria());
                                    printWriter.print("\n");
                                }

                                //LIBERA A ESCRITA NO ARQUIVO
                                printWriter.flush();

                                //FECHA O ARQUIVO
                                printWriter.close();

                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        }
                        // CADASTRA UM ASSISTENTE DE DENTISTA
                        case 4:{
                            //CRIA UMA LISTA DE ADM'S E VAI JOGANDO EM UM ARQUIVO 
                            List<AssistenteDentista> assDentista = new ArrayList<AssistenteDentista>();
                            createPessoa(assDentista);

                            //CRIA UM ARQUIVO PARA JOGAR OS DADOS DOS FUNCIONÁRIOS
                            File arqAssDen = new File("AssistentesDeDentista.txt");
                            try {
                                arqAssDen.createNewFile();

                                //APONTA O PONTEIRO PARA A PRIMEIRA POSIÇÃO DO ARQUIVO
                                //O 2º PARÂMETRO SENDO FALSE, SOBREESCREVE O ARQUIVO COM O NOVO CONTEÚDO
                                //SENDO TRUE ESCREVE DE ONDE PAROU
                                FileWriter fileWriter = new FileWriter(arqAssDen, true);

                                //USANDO A CLASSE PrintWriter PARA ESCREVER NO ARQUIVO
                                PrintWriter printWriter = new PrintWriter(fileWriter);
                                for (int i = 0; i < assDentista.size(); i++) {
                                    printWriter.println("Assistende de dentista: " + assDentista.get(i).getNome());
                                    printWriter.println("Idade: " + assDentista.get(i).getIdade());
                                    printWriter.println("Cargo: " + assDentista.get(i).getCargo());
                                    printWriter.println("Salário: " + assDentista.get(i).getSalario());
                                    printWriter.println("Telefone: " + assDentista.get(i).getTelefone());
                                    printWriter.println("Endereço: " + assDentista.get(i).getEndereco());
                                    printWriter.println("Carga Horária: " + assDentista.get(i).getCargaHoraria());
                                    printWriter.print("\n");
                                }

                                //LIBERA A ESCRITA NO ARQUIVO
                                printWriter.flush();

                                //FECHA O ARQUIVO
                                printWriter.close();

                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        }
                        // CADASTRA UM RECEPCIONISTA
                        case 5:{
                            //CRIA UMA LISTA DE ADM'S E VAI JOGANDO EM UM ARQUIVO 
                            List<Recepcionista> recepcionista = new ArrayList<Recepcionista>();
                            createPessoa(recepcionista);

                            //CRIA UM ARQUIVO PARA JOGAR OS DADOS DOS FUNCIONÁRIOS
                            File arqRecepcionistas = new File("Recepcionistas.txt");
                            try {
                                arqRecepcionistas.createNewFile();

                                //APONTA O PONTEIRO PARA A PRIMEIRA POSIÇÃO DO ARQUIVO
                                //O 2º PARÂMETRO SENDO FALSE, SOBREESCREVE O ARQUIVO COM O NOVO CONTEÚDO
                                //SENDO TRUE ESCREVE DE ONDE PAROU
                                FileWriter fileWriter = new FileWriter(arqRecepcionistas, true);

                                //USANDO A CLASSE PrintWriter PARA ESCREVER NO ARQUIVO
                                PrintWriter printWriter = new PrintWriter(fileWriter);
                                for (int i = 0; i < recepcionista.size(); i++) {
                                    printWriter.println("Recepcionista: " + recepcionista.get(i).getNome());
                                    printWriter.println("Idade: " + recepcionista.get(i).getIdade());
                                    printWriter.println("Cargo: " + recepcionista.get(i).getCargo());
                                    printWriter.println("Salário: " + recepcionista.get(i).getSalario());
                                    printWriter.println("Telefone: " + recepcionista.get(i).getTelefone());
                                    printWriter.println("Endereço: " + recepcionista.get(i).getEndereco());
                                    printWriter.println("Carga Horária: " + recepcionista.get(i).getCargaHoraria());
                                    printWriter.print("\n");
                                }

                                //LIBERA A ESCRITA NO ARQUIVO
                                printWriter.flush();

                                //FECHA O ARQUIVO
                                printWriter.close();

                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        }
                        default:{
                            System.err.println("Erro no cadastro de funcionario");
                            break;
                        }
                    }
                    System.out.println("Cadastro realizado com sucesso");
                    System.out.println("Redirecionando para o menu..."); 
                    break;
                }
                case 00: {
                    System.out.println("ENCERRANDO SESSÃO...");
                    System.exit(1);
                }
            }      
             System.out.println();      
        }
    }
    
    // RETORNA A FOLHA DE PONTO DE UM DETERMINADO FUNCIONARIO
    private void folhaDePonto(){
        Scanner input= new Scanner(System.in);
        int cargo;
        boolean valida;
        
        // CARGO
        do {
            valida = true;
            System.out.println("\n01 - ADMINISTRADOR");
            System.out.println("02 - ASSISTENTE ADM");
            System.out.println("03 - DENTISTA");
            System.out.println("04 - ASSISTENTE DENT");
            System.out.println("05 - RECEPCIONISTA");
            System.out.print("Cargo: ");
            cargo = input.nextInt();

            if (cargo < 1 || cargo > 5) {
                System.err.println("Cargo inválido");
                valida = false;
            }
        } while (valida != true);
        
        //VETOR PARA ADICIONAR TODOS OS FUNCIONARIOS QUE ESTÃO EM ARQUIVOS
        List<Object> nomes = new ArrayList<>();
        
        switch (cargo) {
            //LÊ TODOS OS ADMINISTRADORES
            case 1: {
                try {
                    FileReader arq = new FileReader("Administradores.txt");
                    BufferedReader lerArq = new BufferedReader(arq);

                    //Lê A PRIMEIRA LINHA QUE NO CASO É O NOME DO DENTISTA
                    String linha = lerArq.readLine();
                    String teste;
                    while (linha != null) {
                        //VERIFICA APENAS O NOME DO ADM
                        if (linha.contains("Administrador: ")) {
                            teste = linha.replace("Administrador: ", "");
                            String nome;
                            nome = teste;
                            nomes.add(nome);
                        }
                        //LÊ DA SEGUNDA ATÉ A ÚLTIMA LINHA
                        linha = lerArq.readLine();
                    }

                    arq.close();
                } catch (IOException e) {
                    System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
                }

                break;
            }
            // LÊ TODOS OS ASSISTENTE ADMINISTRATIVO
            case 2: {
                try {
                    FileReader arq = new FileReader("AssistentesAdm.txt");
                    BufferedReader lerArq = new BufferedReader(arq);

                    //Lê A PRIMEIRA LINHA QUE NO CASO É O NOME DO DENTISTA
                    String linha = lerArq.readLine();
                    String teste;
                    while (linha != null) {
                        //VERIFICA APENAS O NOME DO DENTISTA
                        if (linha.contains("Assistente administrativo: ")) {
                            teste = linha.replace("Assistente administrativo: ", "");
                            String nome;
                            nome = teste;
                            nomes.add(nome);
                        }
                        //LÊ DA SEGUNDA ATÉ A ÚLTIMA LINHA
                        linha = lerArq.readLine();
                    }
                    arq.close();
                } catch (IOException e) {
                    System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
                }

                break;
            }

            // LÊ TODOS OS DENTISTA
            case 3: {
                try {
                    FileReader arq = new FileReader("Dentistas.txt");
                    BufferedReader lerArq = new BufferedReader(arq);

                    //Lê A PRIMEIRA LINHA QUE NO CASO É O NOME DO DENTISTA
                    String linha = lerArq.readLine();
                    String teste;
                    while (linha != null) {
                        //VERIFICA APENAS O NOME DO DENTISTA
                        if (linha.contains("Dentista: ")) {
                            teste = linha.replace("Dentista: ", "");
                            String nome;
                            nome = teste;
                            nomes.add(nome);
                        }
                        //LÊ DA SEGUNDA ATÉ A ÚLTIMA LINHA
                        linha = lerArq.readLine();
                    }

                    arq.close();
                } catch (IOException e) {
                    System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
                }
                break;
            }
            // LÊ TODOS ASSISTENTES DE DENTISTA
            case 4: {
                try {
                    FileReader arq = new FileReader("AssistentesDeDentistas.txt");
                    BufferedReader lerArq = new BufferedReader(arq);

                    //Lê A PRIMEIRA LINHA QUE NO CASO É O NOME DO DENTISTA
                    String linha = lerArq.readLine();
                    String teste;
                    while (linha != null) {
                        //VERIFICA APENAS O NOME DO DENTISTA
                        if (linha.contains("Assistente de dentista: ")) {
                            teste = linha.replace("Assistente de dentista: ", "");
                            String nome;
                            nome = teste;
                            nomes.add(nome);
                        }
                        //LÊ DA SEGUNDA ATÉ A ÚLTIMA LINHA
                        linha = lerArq.readLine();
                    }

                    arq.close();
                } catch (IOException e) {
                    System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
                }
                break;
            }
            // LÊ TODOS RECEPCIONISTA
            case 5: {
                try {
                    FileReader arq = new FileReader("Recepcionistas.txt");
                    BufferedReader lerArq = new BufferedReader(arq);

                    //Lê A PRIMEIRA LINHA QUE NO CASO É O NOME DO DENTISTA
                    String linha = lerArq.readLine();
                    String teste;
                    while (linha != null) {
                        //VERIFICA APENAS O NOME DO DENTISTA
                        if (linha.contains("Recepcionista: ")) {
                            teste = linha.replace("Recepcionista: ", "");
                            String nome;
                            nome = teste;
                            nomes.add(nome);
                        }
                        //LÊ DA SEGUNDA ATÉ A ÚLTIMA LINHA
                        linha = lerArq.readLine();
                    }

                    arq.close();
                } catch (IOException e) {
                    System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
                }
                break;
            }
            default: {
                System.err.println("Erro no cadastro de funcionario");
                break;
            }
        }

        //LEITURA DO NOME DOS FUNCIONARIOS
        System.out.println("------------FUNCIONARIOS------------");
        nomes.forEach(i -> {
            System.out.println(i);
        });
        
        System.out.print("Qual funcionario deseja editar a folha de ponto? ");
        String nome = input.nextLine();
        
        for (Object i : nomes) {
            if (nome.equals(i)) {
                String data, obs;
                char salvar;
                
                //VERIFICA SE A DATA É VÁLIDA
                boolean controle = false;
                do {
                    System.out.print("Data (dd/mm/yy): ");
                    data = input.next();

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
                    formato.setLenient(false);

                    //PEGA A DATA ATUAL DO SISTEMA
                    Date hoje = new Date();
                    String dataHoje = java.text.DateFormat.getDateInstance(DateFormat.DATE_FIELD).format(hoje); 

                    try {
                        Date dat = formato.parse(data); 
                        Date datHoje = formato.parse(dataHoje);
                        //COMPARA SE A DATA DESEJADA JÁ PASSOU
                        if (dat.after(datHoje) || dat.equals(datHoje)) {
                            controle = true;
                        } 
                        else {
                            System.err.println("Essa data já passou. Consultas a partir do dia de hoje: " + dataHoje);
                        }
                    } catch (ParseException e) {   
                        System.err.println("Data inválida, digite novamente...");
                        controle = false;   
                    }
                } while (controle != true);
                
                //VERIFICA SE TERÁ ALGUMA OBSERVAÇÃO A SER COLOCADA NA FOLHA DE PONTO
                System.out.print("Alguma observacao a ser feita referente ao dia de trabalho? ");
                obs = input.next();

                System.out.print("Deseja salvar (S/N)? ");
                salvar = input.next().charAt(0);

                switch(salvar){
                    case 'S': {
                        System.out.println("Salvo com sucesso");
                        
                        //CRIA UM ARQUIVO PARA JOGAR OS DADOS DA AGENDA
                        File arq = new File("FolhaDePonto.txt");
                        try {
                            arq.createNewFile();

                            //APONTA O PONTEIRO PARA A PRIMEIRA POSIÇÃO DO ARQUIVO
                            //O 2º PARÂMETRO SENDO FALSE, SOBREESCREVE O ARQUIVO COM O NOVO CONTEÚDO
                            //SENDO TRUE ESCREVE DE ONDE PAROU
                            FileWriter fileWriter = new FileWriter(arq, true);

                            //USANDO A CLASSE PrintWriter PARA ESCREVER NO ARQUIVO
                            PrintWriter printWriter = new PrintWriter(fileWriter);
                            
                            printWriter.println("Folha de Ponto - " + i);
                            printWriter.printf("%-10s %-10s", "Data", "Observação");
                            printWriter.printf("%-10s", data);
                            printWriter.printf("%-10s\n", obs);
                            printWriter.print("\n");

                            //LIBERA A ESCRITA NO ARQUIVO
                            printWriter.flush();

                            //FECHA O ARQUIVO
                            printWriter.close();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }                        
                        return;
                    }
                    case 'N': {
                        return;
                    }
                    default: {
                        System.err.println("Opção inválida");
                        return;
                    }
                }
           }
        }
        System.err.println("Esse funcionario não existe na clínica");
    }
    
    // ACESSAR O SISTEMA
    public void acessarSistema(){
        List<Administrador> administradores = new ArrayList<Administrador>();
        Scanner input = new Scanner(System.in);
        Clinica clinica = new Clinica();
        String acesso, chave;
        if ((administradores.size()) == 0) {
            Administrador adm = new Administrador();
            adm.setNome("");
            administradores.add(adm);
        }

        System.out.print("--------------CLINICA " + clinica.getNomeEmpresa() + "--------------\n");

        while(true) {
            System.out.print("Login: ");
            acesso = input.next();
            System.out.print("Senha: ");
            chave = input.next();
            
            for (int i = 0; i < administradores.size(); i++) {
                if(acesso.equals(administradores.get(i).getLogin()) || chave.equals(administradores.get(i).getSenha())) {
                    System.out.println("\nBem vindo " + administradores.get(i).getNome() + "\n");
                    mostrarMenu();
                } else System.err.println("Acesso inválido, por favor tente novamente");
            }
        }
    }
}
