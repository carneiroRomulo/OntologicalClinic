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
            String salario, String cargaHoraria, String cargo, String nome,
            String sobrenome, String endereco, String email, String CPF,
            String RG, String telefone, String idade, String login, String senha) {
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
    
    // CADASTRA ADMINISTRADOR
    public void cadastraAdministrador(String nome, String sobrenome, String endereco, String email,
            String cpf, String rg, String telefone, String idade, String salario,
            String cargaHoraria, String cargo, String login, String senha) {

        Administrador admin = new Administrador();
        admin.setNome(nome);
        admin.setSobrenome(sobrenome);
        admin.setEndereco(endereco);
        admin.setEmail(email);
        admin.setCPF(cpf);
        admin.setRG(rg);
        admin.setTelefone(telefone);
        admin.setIdade(idade);
        admin.setSalario(salario);
        admin.setCargaHoraria(cargaHoraria);
        admin.setCargo(cargo);
        admin.setLogin(login);
        admin.setSenha(senha);
        //CRIA UMA LISTA DE ADM'S E VAI JOGANDO EM UM ARQUIVO 
        List<Administrador> administradores = new ArrayList<>();
        administradores.add(admin);
        //CRIA UM ARQUIVO PARA JOGAR OS DADOS DOS FUNCIONÁRIOS
        File arqAdm = new File("Administradores.txt");
        try {
            arqAdm.createNewFile();

            //APONTA O PONTEIRO PARA A PRIMEIRA POSIÇÃO DO ARQUIVO
            //O 2º PARÂMETRO SENDO FALSE, SOBREESCREVE O ARQUIVO COM O NOVO CONTEÚDO
            //SENDO TRUE ESCREVE DE ONDE PAROU
            FileWriter fileWriter = new FileWriter(arqAdm, true);

            //USANDO A CLASSE PrintWriter PARA ESCREVER NO ARQUIVO
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (int i = 0; i < administradores.size(); i++) {
                printWriter.print(administradores.get(i).getNome() + " " + administradores.get(i).getSobrenome());
                printWriter.print("\t" + administradores.get(i).getIdade());
                printWriter.print("\t" + administradores.get(i).getCargo());
                printWriter.print("\t" + administradores.get(i).getSalario());
                printWriter.print("\t" + administradores.get(i).getTelefone());
                printWriter.print("\t" + administradores.get(i).getEmail());
                printWriter.print("\t" + administradores.get(i).getEndereco());
                printWriter.print("\t" + administradores.get(i).getCargaHoraria());
                printWriter.println("\t" + administradores.get(i).getLogin());
                printWriter.println("\t" + administradores.get(i).getSenha());
                printWriter.print("\n");
            }

            //LIBERA A ESCRITA NO ARQUIVO
            printWriter.flush();

            //FECHA O ARQUIVO
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // CADASTRA UM ASSISTENTE ADMINISTRATIVO
    public void cadastraAssistenteAdm(String nome, String sobrenome, String endereco, String email,
            String cpf, String rg, String telefone, String idade, String salario,
            String cargaHoraria, String cargo, String login, String senha) {

        AssistenteAdministrativo assistente = new AssistenteAdministrativo();
        assistente.setNome(nome);
        assistente.setSobrenome(sobrenome);
        assistente.setEndereco(endereco);
        assistente.setEmail(email);
        assistente.setCPF(cpf);
        assistente.setRG(rg);
        assistente.setTelefone(telefone);
        assistente.setIdade(idade);
        assistente.setSalario(salario);
        assistente.setCargaHoraria(cargaHoraria);
        assistente.setCargo(cargo);
        assistente.setLogin(login);
        assistente.setSenha(senha);

        //CRIA UMA LISTA DE ASSISTENTES ADMINISTRATIVOS E VAI JOGANDO EM UM ARQUIVO 
        List<AssistenteAdministrativo> assistentes = new ArrayList<>();
        assistentes.add(assistente);

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
                printWriter.print(assistentes.get(i).getNome() + " " + assistentes.get(i).getSobrenome());
                printWriter.print("\t" + assistentes.get(i).getIdade());
                printWriter.print("\t" + assistentes.get(i).getCargo());
                printWriter.print("\t" + assistentes.get(i).getSalario());
                printWriter.print("\t" + assistentes.get(i).getTelefone());
                printWriter.print("\t" + assistentes.get(i).getEmail());
                printWriter.print("\t" + assistentes.get(i).getEndereco());
                printWriter.print("\t" + assistentes.get(i).getCargaHoraria());
                printWriter.println("\t" + assistentes.get(i).getLogin());
                printWriter.println("\t" + assistentes.get(i).getSenha());
                printWriter.print("\n");
            }

            //LIBERA A ESCRITA NO ARQUIVO
            printWriter.flush();

            //FECHA O ARQUIVO
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // CADASTRA UM DENTISTA
    public void cadastraDentista(String nome, String sobrenome, String endereco, String email,
            String cpf, String rg, String telefone, String idade, String salario,
            String cargaHoraria, String cargo) {

        Dentista dentista = new Dentista();
        dentista.setNome(nome);
        dentista.setSobrenome(sobrenome);
        dentista.setEndereco(endereco);
        dentista.setEmail(email);
        dentista.setCPF(cpf);
        dentista.setRG(rg);
        dentista.setTelefone(telefone);
        dentista.setIdade(idade);
        dentista.setSalario(salario);
        dentista.setCargaHoraria(cargaHoraria);
        dentista.setCargo(cargo);

        //CRIA UMA LISTA DE ADM'S E VAI JOGANDO EM UM ARQUIVO 
        List<Dentista> dentistas = new ArrayList<>();
        dentistas.add(dentista);

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
            for (int i = 0; i < dentistas.size(); i++) {
                printWriter.println("Dentista:\t" + dentistas.get(i).getNome() + " " + dentistas.get(i).getSobrenome());
                printWriter.println("Idade:\t" + dentistas.get(i).getIdade());
                printWriter.println("Cargo:\t" + dentistas.get(i).getCargo());
                printWriter.println("Salario:\t" + dentistas.get(i).getSalario());
                printWriter.println("Telefone:\t" + dentistas.get(i).getTelefone());
                printWriter.println("E-mai:l\t" + dentistas.get(i).getEmail());
                printWriter.println("Endereço:\t" + dentistas.get(i).getEndereco());
                printWriter.println("Carga Horária:\t" + dentistas.get(i).getCargaHoraria());
                printWriter.print("\n");
            }

            //LIBERA A ESCRITA NO ARQUIVO
            printWriter.flush();

            //FECHA O ARQUIVO
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // CADASTRA UM ASSISTENTE DE DENTISTA
    public void cadastraAssistenteDentista(String nome, String sobrenome, String endereco, String email,
            String cpf, String rg, String telefone, String idade, String salario,
            String cargaHoraria, String cargo) {

        AssistenteDentista assistenteDentista = new AssistenteDentista();
        assistenteDentista.setNome(nome);
        assistenteDentista.setSobrenome(sobrenome);
        assistenteDentista.setEndereco(endereco);
        assistenteDentista.setEmail(email);
        assistenteDentista.setCPF(cpf);
        assistenteDentista.setRG(rg);
        assistenteDentista.setTelefone(telefone);
        assistenteDentista.setIdade(idade);
        assistenteDentista.setSalario(salario);
        assistenteDentista.setCargaHoraria(cargaHoraria);
        assistenteDentista.setCargo(cargo);

        //CRIA UMA LISTA DE ADM'S E VAI JOGANDO EM UM ARQUIVO 
        List<AssistenteDentista> assDentista = new ArrayList<AssistenteDentista>();
        assDentista.add(assistenteDentista);

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
                printWriter.println(assDentista.get(i).getNome() + " " + assDentista.get(i).getSobrenome());
                printWriter.println("\t" + assDentista.get(i).getIdade());
                printWriter.println("\t" + assDentista.get(i).getCargo());
                printWriter.println("\t" + assDentista.get(i).getSalario());
                printWriter.println("\t" + assDentista.get(i).getTelefone());
                printWriter.println("\t" + assDentista.get(i).getEmail());
                printWriter.println("\t" + assDentista.get(i).getEndereco());
                printWriter.println("\t" + assDentista.get(i).getCargaHoraria());
                printWriter.print("\n");
            }

            //LIBERA A ESCRITA NO ARQUIVO
            printWriter.flush();

            //FECHA O ARQUIVO
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // CADASTRA UM RECEPCIONISTA
    public void cadastraRecepcionista(String nome, String sobrenome, String endereco, String email,
            String cpf, String rg, String telefone, String idade, String salario,
            String cargaHoraria, String cargo) {

        Recepcionista recepcionista = new Recepcionista();
        recepcionista.setNome(nome);
        recepcionista.setSobrenome(sobrenome);
        recepcionista.setEndereco(endereco);
        recepcionista.setEmail(email);
        recepcionista.setCPF(cpf);
        recepcionista.setRG(rg);
        recepcionista.setTelefone(telefone);
        recepcionista.setIdade(idade);
        recepcionista.setSalario(salario);
        recepcionista.setCargaHoraria(cargaHoraria);
        recepcionista.setCargo(cargo);
        //CRIA UMA LISTA DE ADM'S E VAI JOGANDO EM UM ARQUIVO 
        List<Recepcionista> recepcionistas = new ArrayList<>();
        recepcionistas.add(recepcionista);

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
            for (int i = 0; i < recepcionistas.size(); i++) {
                printWriter.println(recepcionistas.get(i).getNome() + " " + recepcionistas.get(i).getSobrenome());
                printWriter.println("Idade:\t" + recepcionistas.get(i).getIdade());
                printWriter.println("Cargo:\t" + recepcionistas.get(i).getCargo());
                printWriter.println("Salario:\t" + recepcionistas.get(i).getSalario());
                printWriter.println("Telefone\t" + recepcionistas.get(i).getTelefone());
                printWriter.println("E-mail\t" + recepcionistas.get(i).getEmail());
                printWriter.println("Endereço\t" + recepcionistas.get(i).getEndereco());
                printWriter.println("Carga Horária\t" + recepcionistas.get(i).getCargaHoraria());
                printWriter.print("\n");
            }

            //LIBERA A ESCRITA NO ARQUIVO
            printWriter.flush();

            //FECHA O ARQUIVO
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // GERA O RELATORIO
    private void gerarRelatorio(){
        int opcao;
        System.out.println("\n1 - Relatório de ganhos\n2 - Relatório de gastos\n3 - Relatório de gastos com funcionários");
        Scanner input = new Scanner(System.in);
        opcao = input.nextInt();
        
        switch(opcao) {
            case 1: {
                try {
                    double ganhos = 0;
                    FileReader arq = new FileReader("Consultas.txt");
                    BufferedReader lerArq = new BufferedReader(arq);
                    List<Consulta> consultas = new ArrayList<Consulta>();
                    List<Cliente> clientes = new ArrayList<Cliente>();
                    
                    //VERIFICA EM QUAL PERÍODO DEVE SER PROCURADO
                    String dataInicio;
                    String dataFim;
                    
                    System.out.print("Data início (dd/mm/yy): ");
                    dataInicio = input.next();
                    
                    System.out.print("Data fim (dd/mm/yy): ");
                    dataFim = input.next();
                    
                    //Lê A PRIMEIRA LINHA QUE NO CASO É OS ÍNDICES
                    String linha = lerArq.readLine();
                    String teste;
                    String data;

                    while (linha != null) {              
                        //VERIFICA APENAS O VALOR DA CONSULTA
                        if (linha.contains("Valor")) {
                            //LÊ A PRÓXIMA LINHA
                            linha = lerArq.readLine();
                            
                            int comecoNome = linha.indexOf("");
                            int fimNome = linha.indexOf(" ");
                            Cliente cliente = new Cliente();
                            cliente.setNome(linha.substring(comecoNome, fimNome));
                            clientes.add(cliente);

                            //PEGA A DATA
                            int comecoData = linha.indexOf("/");
                            int fimData = linha.indexOf("/");
                            data = linha.substring(comecoData-2, fimData+6);
                            
                            //VERIFICA SE A DATA É VÁLIDA
                            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");

                            try {
                                Date dataDesejadaInicio = formato.parse(dataInicio);
                                Date dataDesejadaFim = formato.parse(dataFim);
                                Date dataArquivo = formato.parse(data);
                                
                                //COMPARA SE A DATA DESEJADA JÁ PASSOU
                                if (dataArquivo.after(dataDesejadaInicio) && dataArquivo.before(dataDesejadaFim)) {
                                    //PARA PEGAR A SUBSTRING VALOR 
                                    int comeco = linha.indexOf(" ");
                                    int fim = linha.indexOf(".");
                                    teste = linha.substring(comeco + 1, fim + 2);
                                    
                                    //ADICIONANDO ESSES VALORES A UMA LISTA DE CONSULTA
                                    Consulta consulta = new Consulta();
                                    consulta.setValor(Double.parseDouble(teste));
                                    consulta.setDataPagamento(data);
                                    
                                    consultas.add(consulta);

                                    //SOMA TODOS OS VALORES
                                    ganhos += Double.parseDouble(teste); 
                                }
                            } catch (ParseException e) {}
                        }
                        //LÊ AS LINHAS QUE SÃO ÍNDICES
                        linha = lerArq.readLine();
                    }

                    arq.close();
                    geraRelatorioGanhos(clientes, consultas, ganhos);
                    System.out.println(ganhos);
                } catch (IOException e) {
                    System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
                }
                
                break;
            }
            case 2: {
                try {
                    double gastos = 0;
                    FileReader arq = new FileReader("Contas.txt");
                    BufferedReader lerArq = new BufferedReader(arq);
                    List<Contas> contas = new ArrayList<Contas>();

                    //VERIFICA EM QUAL PERÍODO DEVE SER PROCURADO
                    String dataInicio;
                    String dataFim;

                    System.out.print("Data início (dd/mm/yy): ");
                    dataInicio = input.next();

                    System.out.print("Data fim (dd/mm/yy): ");
                    dataFim = input.next();

                    //Lê A PRIMEIRA LINHA QUE NO CASO É OS ÍNDICES
                    String linha = lerArq.readLine();
                    String teste;
                    String data;
                    while (linha != null) {
                        
                        int comecoNome = linha.indexOf("");
                        int fimNome = linha.indexOf(" ");
                        Contas conta = new Contas();
                        conta.setTipo(linha.substring(comecoNome, fimNome));
                        contas.add(conta);
                        
                        //PEGA A DATA
                        int comecoData = linha.indexOf("/");
                        int fimData = linha.indexOf("/");
                        data = linha.substring(comecoData - 2, fimData + 8);

                        //VERIFICA SE A DATA É VÁLIDA
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");

                        try {
                            Date dataDesejadaInicio = formato.parse(dataInicio);
                            Date dataDesejadaFim = formato.parse(dataFim);
                            Date dataArquivo = formato.parse(data);

                            //COMPARA SE A DATA DESEJADA JÁ PASSOU
                            if (dataArquivo.after(dataDesejadaInicio) && dataArquivo.before(dataDesejadaFim)) {
                                //PARA PEGAR A SUBSTRING VALOR 
                                int comeco = linha.indexOf(" ");
                                int fim = linha.indexOf(".");
                                teste = linha.substring(comeco + 5, fim + 2);
                                
                                conta.setValor(Double.parseDouble(teste));
                                conta.setDataPagamento(data);
                                
                                contas.add(conta);
                                
                                //SOMA TODOS OS VALORES
                                gastos += Double.parseDouble(teste);
                            }
                        } catch (ParseException e) {}
                        
                        //LÊ AS LINHAS QUE SÃO ÍNDICES
                        linha = lerArq.readLine();
                    }

                    arq.close();
                    System.out.println(gastos);
                    geraRelatorioGastos(contas, gastos);
                } catch (IOException e) {
                    System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
                }
                break;
            }
            case 3: {
                try {
                    double salarios = 0;
                    FileReader arq = new FileReader("Salarios.txt");
                    BufferedReader lerArq = new BufferedReader(arq);

                    //VERIFICA EM QUAL PERÍODO DEVE SER PROCURADO
                    String dataInicio;
                    String dataFim;

                    System.out.print("Data início (dd/mm/yy): ");
                    dataInicio = input.next();

                    System.out.print("Data fim (dd/mm/yy): ");
                    dataFim = input.next();

                    //Lê A PRIMEIRA LINHA QUE NO CASO É OS ÍNDICES
                    String linha = lerArq.readLine();
                    String teste;
                    String data;
                    while (linha != null) {
                        //VERIFICA APENAS O VALOR DA CONSULTA
                        if (linha.contains("Valor")) {
                            //LÊ A PRÓXIMA LINHA
                            linha = lerArq.readLine();

                            //PEGA A DATA
                            int comecoData = linha.indexOf("/");
                            int fimData = linha.indexOf("/");
                            data = linha.substring(comecoData - 2, fimData + 6);

                            //VERIFICA SE A DATA É VÁLIDA
                            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");

                            try {
                                Date dataDesejadaInicio = formato.parse(dataInicio);
                                Date dataDesejadaFim = formato.parse(dataFim);
                                Date dataArquivo = formato.parse(data);

                                //COMPARA SE A DATA DESEJADA JÁ PASSOU
                                if (dataArquivo.after(dataDesejadaInicio) && dataArquivo.before(dataDesejadaFim)) {
                                    //PARA PEGAR A SUBSTRING VALOR 
                                    int comeco = linha.indexOf(" ");
                                    int fim = linha.indexOf(".");
                                    teste = linha.substring(comeco + 1, fim + 2);

                                    //SOMA TODOS OS VALORES
                                    salarios += Double.parseDouble(teste);
                                }
                            } catch (ParseException e) {}
                        }
                        else if (linha.contains ("R$")) {
                            //PEGA A DATA
                            int comecoData = linha.indexOf("/");
                            int fimData = linha.indexOf("/");
                            data = linha.substring(comecoData - 2, fimData + 6);

                            //VERIFICA SE A DATA É VÁLIDA
                            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");

                            try {
                                Date dataDesejadaInicio = formato.parse(dataInicio);
                                Date dataDesejadaFim = formato.parse(dataFim);
                                Date dataArquivo = formato.parse(data);

                                //COMPARA SE A DATA DESEJADA JÁ PASSOU
                                if (dataArquivo.after(dataDesejadaInicio) && dataArquivo.before(dataDesejadaFim)) {
                                    //PARA PEGAR A SUBSTRING VALOR 
                                    int comeco = linha.indexOf(" ");
                                    int fim = linha.indexOf(".");
                                    teste = linha.substring(comeco + 1, fim + 2);

                                    //SOMA TODOS OS VALORES
                                    salarios += Double.parseDouble(teste);
                                }
                            } catch (ParseException e) {}
                        }
                        //LÊ AS LINHAS QUE SÃO ÍNDICES
                        linha = lerArq.readLine();
                    }

                    arq.close();
                    System.out.println(salarios);
                } catch (IOException e) {
                    System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
                }
                break;
            }
            default: {
                System.err.println("Erro na geração de relatório");
                break;
            }
        }
    }
    
    // JOGA O RELATÓRIO DE GANHOS EM UM ARQUIVO 
    public void geraRelatorioGanhos (List<Cliente> clientes, List<Consulta> consultas,double ganhos) {
        //CRIA UM ARQUIVO PARA JOGAR OS DADOS DA AGENDA
        File arq = new File("RelatorioGanhos.txt");
        try {
            arq.createNewFile();

            //APONTA O PONTEIRO PARA A PRIMEIRA POSIÇÃO DO ARQUIVO
            //O 2º PARÂMETRO SENDO FALSE, SOBREESCREVE O ARQUIVO COM O NOVO CONTEÚDO
            //SENDO TRUE ESCREVE DE ONDE PAROU
            FileWriter fileWriter = new FileWriter(arq, false);

            //USANDO A CLASSE PrintWriter PARA ESCREVER NO ARQUIVO
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (int i = 0; i < consultas.size(); i++) {
                printWriter.printf("%-10s %-10s %-10s\n", "Cliente", "Valor", "Data do pagamento");
                printWriter.printf("%-11s", clientes.get(i).getNome());
                printWriter.printf("%-11s", consultas.get(i).getValor());
                printWriter.printf("%10s\n\n", consultas.get(i).getDataPagamento());
            }
            printWriter.println("TOTAL: " + ganhos);

            //LIBERA A ESCRITA NO ARQUIVO
            printWriter.flush();

            //FECHA O ARQUIVO
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // JOGA O RELATÓRIO DE GASTOS EM UM ARQUIVO
    public void geraRelatorioGastos (List<Contas> contas, double gastos) {
        //CRIA UM ARQUIVO PARA JOGAR OS DADOS DA AGENDA
        File arq = new File("RelatorioGastos.txt");
        try {
            arq.createNewFile();

            //APONTA O PONTEIRO PARA A PRIMEIRA POSIÇÃO DO ARQUIVO
            //O 2º PARÂMETRO SENDO FALSE, SOBREESCREVE O ARQUIVO COM O NOVO CONTEÚDO
            //SENDO TRUE ESCREVE DE ONDE PAROU
            FileWriter fileWriter = new FileWriter(arq, false);

            //USANDO A CLASSE PrintWriter PARA ESCREVER NO ARQUIVO
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (int i = 0; i < contas.size(); i++) {
                printWriter.printf("%-10s %-10s %-10s\n", "Tipo", "Valor", "Data do pagamento");
                printWriter.printf("%-11s", contas.get(i).getTipo());
                printWriter.printf("%-11s", contas.get(i).getValor());
                printWriter.printf("%10s\n\n", contas.get(i).getDataPagamento());
            }
            printWriter.println("TOTAL: " + gastos);
            //LIBERA A ESCRITA NO ARQUIVO
            printWriter.flush();

            //FECHA O ARQUIVO
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //LÊ TODOS OS FUNCIONÁRIOS E JOGA EM UMA LISTA DE NOMES
    public void lerFuncionarios(int cargo, List<Object> nomes) {
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
                        if (linha.contains("Dentista:\t")) {
                            teste = linha.replace("Dentista:\t", "");
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
    }
    
    // RETORNA A FOLHA DE PONTO DE UM DETERMINADO FUNCIONÁRIO
    private void folhaDePonto() {
        Scanner input = new Scanner(System.in);
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
        
        lerFuncionarios(cargo, nomes);

        //LEITURA DO NOME DOS FUNCIONARIOS
        System.out.println("------------FUNCIONARIOS------------");
        nomes.forEach(i -> {
            System.out.println(i);
        });
        
        input = new Scanner(System.in);
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
                        } else {
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

                switch (salvar) {
                    case 'S': {
                        System.out.println("Salvo com sucesso");

                        //CRIA UM ARQUIVO PARA JOGAR OS DADOS DA AGENDA
                        File arq = new File("FolhaDePonto.txt");
                        try {
                            arq.createNewFile();

                            //APONTA O PONTEIRO PARA A PRIMEIRA POSIÇÃO DO ARQUIVO
                            //O 2º PARÂMETRO SENDO FALSE, SOBREESCREVE O ARQUIVO COM O NOVO CONTEÚDO
                            //SENDO TRUE ESCREVE DE ONDE PAROU
                            FileWriter fileWriter = new FileWriter(arq, false);

                            //USANDO A CLASSE PrintWriter PARA ESCREVER NO ARQUIVO
                            PrintWriter printWriter = new PrintWriter(fileWriter);

                            printWriter.println("Folha de Ponto - " + i);
                            printWriter.printf("%-10s %-10s\n", "Data", "Observação");
                            printWriter.printf("%-12s", data);
                            printWriter.printf("%s\n", obs);
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
    
    // RETORNA A FOLHA DE PAGAMENTO DE UM DETERMINADO FUNCIONÁRIO
    private void pagarSalario () {
        Scanner input = new Scanner(System.in);
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

        lerFuncionarios(cargo, nomes);

        //IMPRIME OS NOMES DOS FUNCIONARIOS
        System.out.println("------------FUNCIONARIOS------------");
        nomes.forEach(i -> {
            System.out.println(i);
        });
        
        input = new Scanner(System.in);
        System.out.print("Qual funcionario que deseja pagar o salário? ");
        String nome = input.nextLine();
        
        System.out.println("1 - Folha de ponto\n2 - Efetuar pagamento\n0 - Sair");
        int opcao = input.nextInt();

        for (Object i : nomes) {
            if (nome.equals(i)) {
                while (opcao != 0) {
                    if (opcao == 1) {
                        try {
                            int diasTrabalhados = 0;
                            FileReader arq = new FileReader("FolhaDePonto.txt");
                            BufferedReader lerArq = new BufferedReader(arq);

                            //VERIFICA EM QUAL PERÍODO DEVE SER PROCURADO
                            String dataInicio;
                            String dataFim;

                            System.out.print("Data início (dd/mm/yy): ");
                            dataInicio = input.next();

                            System.out.print("Data fim (dd/mm/yy): ");
                            dataFim = input.next();

                            //Lê A PRIMEIRA LINHA QUE NO CASO É OS ÍNDICES
                            String linha = lerArq.readLine();
                            String data, obs;

                            while (linha != null) {

                                //VERIFICA APENAS O VALOR DA CONSULTA
                                if (linha.contains((CharSequence) i)) {

                                    System.out.println("\nFolha de Ponto - " + i);
                                    System.out.printf("%-10s %-10s\n", "Data", "Observação");

                                    linha = lerArq.readLine();
                                    linha = lerArq.readLine();

                                    while (linha != null) {
                                        //PEGA A DATA
                                        int comecoData = linha.indexOf("/");
                                        int fimData = linha.indexOf("/");
                                        //System.out.println(linha.substring(comecoData - 2, fimData+6));
                                        data = linha.substring(comecoData - 2, fimData + 6);
                                        //VERIFICA SE A DATA É VÁLIDA
                                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");

                                        try {
                                            Date dataDesejadaInicio = formato.parse(dataInicio);
                                            Date dataDesejadaFim = formato.parse(dataFim);
                                            Date dataArquivo = formato.parse(data);

                                            //COMPARA SE A DATA DESEJADA JÁ PASSOU
                                            if (dataArquivo.after(dataDesejadaInicio) && dataArquivo.before(dataDesejadaFim)) {
                                                if (linha.contains("---")) {
                                                    diasTrabalhados++;
                                                    obs = "   ---";
                                                } else {
                                                    int comecoObs = linha.indexOf(" ");
                                                    int fimObs = linha.indexOf(".");
                                                    obs = linha.substring(comecoObs + 1, fimObs);
                                                }

                                                System.out.printf("%-10s", data);
                                                System.out.printf("%s\n", obs);

                                            }
                                        } catch (ParseException e) {
                                        }

                                        linha = lerArq.readLine();
                                    }
                                }
                                //LÊ AS PRÓXIMAS LINHAS
                                linha = lerArq.readLine();
                            }

                            arq.close();                           
                        } catch (IOException e) {
                            System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
                        }
                    } else if (opcao == 2) {
                        System.out.println("Valor a ser pago: ");
                        double valor = input.nextDouble();
                        char pagar;
                        System.out.print("Deseja pagar (S/N)? ");
                        pagar = input.next().charAt(0);

                        String data, obs;

                        switch (pagar) {
                            case 'S': {
                                //PEGA A DATA ATUAL DO SISTEMA
                                Date hoje = new Date();
                                data = java.text.DateFormat.getDateInstance(DateFormat.DATE_FIELD).format(hoje);
                                
                                input = new Scanner(System.in);
                                System.out.print("Algum comentário a ser feito? ");
                                obs = input.nextLine();

                                //CRIA UM ARQUIVO PARA JOGAR OS DADOS DA AGENDA
                                File arq = new File("Salarios.txt");
                                try {
                                    arq.createNewFile();

                                    //APONTA O PONTEIRO PARA A PRIMEIRA POSIÇÃO DO ARQUIVO
                                    //O 2º PARÂMETRO SENDO FALSE, SOBREESCREVE O ARQUIVO COM O NOVO CONTEÚDO
                                    //SENDO TRUE ESCREVE DE ONDE PAROU
                                    FileWriter fileWriter = new FileWriter(arq, false);

                                    //USANDO A CLASSE PrintWriter PARA ESCREVER NO ARQUIVO
                                    PrintWriter printWriter = new PrintWriter(fileWriter);

                                    printWriter.println("Folha de Pagamento - " + i);
                                    printWriter.printf("%-20s %-20s %-20s\n", "Data", "Valor", "Descrição");
                                    printWriter.printf("%s", data);
                                    printWriter.printf("\t%s", valor);
                                    printWriter.printf("\t%s\n", obs);

                                    //LIBERA A ESCRITA NO ARQUIVO
                                    printWriter.flush();

                                    //FECHA O ARQUIVO
                                    printWriter.close();
                                    System.out.println("Salário pago");

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
                    System.out.println("\n1 - Folha de ponto\n2 - Efetuar pagamento");
                    opcao = input.nextInt();
                }
                    
            }
        }
        
        System.err.println("Esse funcionario não existe na clínica");
    }
}
