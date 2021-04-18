package Program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.ParseException;
import java.util.Date;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.RandomAccessFile;

public class Agenda {

    String data;
    String horario;

    // CONSTRUTOR VAZIO
    public Agenda() {
    }

    public Agenda(String data, String horario) {
        this.data = data;
        this.horario = horario;
    }

    /* GETTERS */
    // RETORNA O DIA
    public String getData() {
        return data;
    }

    // RETORNA A HORA
    public String getHorario() {
        return horario;
    }

    /* SETTERS */
    // ALTERA O DIA
    protected void setData(String data) {
        this.data = data;
    }

    // ALTERA A HORA
    protected void setHorario(String horario) {
        this.horario = horario;
    }

    public void lerDentistas(List<Dentista> dentistas) {
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
    }

    //ABRE A AGENDA DE UM DETERMINADO DENTISTA
    public void abrirAgenda() {
        List<Agenda> agenda = new ArrayList<Agenda>();
        List<Dentista> dentistas = new ArrayList<Dentista>();
        lerDentistas(dentistas);

        //DOIS INTEIROS UTILIZADOS COMO VERIFICADORES DE PARADA DO LAÇO
        int encontrou = 0;
        int sairDaAgenda = 0;

        String nome;
        Scanner input = new Scanner(System.in);

        do {
            //VERIFICA SE EXISTE DENTISTA
            if ((dentistas.size()) == 0) {
                //SE NÃO EXISTIR CRIA UM DENTISTA PADRÃO
                Dentista dentistaPadrao = new Dentista();
                dentistaPadrao.setNome("Padrao");
                dentistas.add(dentistaPadrao);
            }

            do {
                //IMPRIME TODOS OS DENTISTAS
                System.out.println("\nDentistas disponíveis: ");
                for (Dentista i : dentistas) {
                    System.out.println(i.getNome());
                }

                System.out.print("Qual deles você deseja visualizar a agenda? ");
                nome = input.nextLine();

                for (int i = 0; i < dentistas.size(); i++) {
                    //COMPARA SE O DENTISTA DIGITADO PELO USUÁRIO EXISTE
                    if (dentistas.get(i).getNome().equals(nome)) {
                        //SE EXISTIR, IMPRIME A AGENDA DO DENTISTA
                        System.out.println("Agenda do dentista: " + dentistas.get(i).getNome());

                        for (int j = 0; j < agenda.size(); j++) {
                            System.out.println(agenda.get(j).getData() + "\t" + agenda.get(j).getHorario());
                        }

                        //ATUALIZA O VERIFICADOR
                        encontrou = 1;
                        break;
                    }
                }

                if (encontrou != 1) {
                    System.err.println("Nome inválido ou incorreto.");
                }

            } while (encontrou != 1);

            char opcao;
            //VERIFICA SE A PESSOA ESTÁ DIGITANDO UMA OPÇÃO VÁLIDA
            do {
                System.out.print("\nDeseja editar a agenda (S/N)? ");
                opcao = input.next().charAt(0);
                if (opcao != 'S' && opcao != 'N') {
                    System.err.println("Comando inválido, digite novamente.\n");
                }
            } while (opcao != 'S' && opcao != 'N');

            if (opcao == 'S') {
                Cliente paciente = new Cliente();
                String nomePaciente;
                int idade;

                boolean valida;

                //VERIFICAÇÃO SE O NOME É VÁLIDO 
                do {
                    valida = true;

                    System.out.print("Qual seu nome: ");
                    nomePaciente = input.next();

                    if (!nomePaciente.matches("[a-zA-Z]*")) {
                        System.err.println("Nome possui caracteres inválidos");
                        valida = false;
                    } else {
                        valida = true;
                    }

                } while (valida != true);

                //VERIFICAÇÃO SE A IDADE É VÁLIDA
                do {
                    valida = true;

                    System.out.print("Qual sua idade: ");
                    idade = input.nextInt();

                    if (idade < 18 || idade > 90) {
                        System.err.println("Idade Mínima: 18 anos\nIdade Máxima: 90 anos");
                        valida = false;
                    }

                } while (valida != true);

                paciente.setNome(nomePaciente);
                paciente.setIdade(idade);

                //ASSOCIA O PACIENTE AO DENTISTA SELECIONADO
                for (int i = 0; i < dentistas.size(); i++) {
                    if (dentistas.get(i).getNome().equals(nome)) {
                        dentistas.get(i).setCliente(paciente);
                    }
                }

                editarAgenda(agenda);
                jogaEmArquivo(agenda, dentistas);
                sairDaAgenda = 1;
            } else {
                sairDaAgenda = 1;
            }

        } while (sairDaAgenda != 1);
    }

    // EDITA A AGENDA DE UM DETERMINADO DENTISTA    
    public void editarAgenda(List<Agenda> agenda) {
        Scanner input = new Scanner(System.in);
        Agenda aux = new Agenda();
        int comando;

        System.out.print("Digite um comando (1/2/3): ");
        comando = input.nextInt();

        /* TABELA DE COMANDOS AQUI */
        String data;
        String horario;
        boolean controle = false;
        if (comando == 1) {
            boolean agendar = true;

            System.out.println("\n*** AGENDAMENTO DE CONSULTA ***\n");
            do {
                System.out.print("Data (dd/mm/yy): ");
                data = input.next();

                //VERIFICA SE A DATA É VÁLIDA
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

            do {
                System.out.print("Horário (hh:mm): ");
                horario = input.next();

                //VERIFICA SE A HORA É VÁLIDA
                SimpleDateFormat hora = new SimpleDateFormat("HH:mm");
                hora.setLenient(false);

                try {
                    hora.parse(horario);
                    controle = true;
                } catch (ParseException e) {
                    System.err.println("Horário inválido, digite novemente...");
                    controle = false;
                }

            } while (controle != true);

            //VERIFICA SE ESSE HORÁRIO JÁ FOI RESERVADO
            for (int i = 0; i < agenda.size(); i++) {
                if (data.equals(agenda.get(i).getData())) {
                    System.err.println("Horário já reservado");
                    agendar = false;
                    break;
                }
            }

            //AGENDA ESSE HORÁRIO
            if (agendar != false) {
                aux.setData(data);
                aux.setHorario(horario);

                //ADICIONA NA AGENDA
                agenda.add(aux);
            }

        } else if (comando == 2) {
            do {
                System.out.println("*** DESAGENDAMENTO DE CONSULTA ***");
                System.out.print("Data (dd/mm/yy): ");
                data = input.next();
                System.out.print("Horário (hh:mm): ");
                horario = input.next();

                //VERIFICA SE A DATA E HORA SÃO VÁLIDAS
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
                formato.setLenient(false);

                //PEGA A DATA ATUAL DO SISTEMA
                Date hoje = new Date();
                String dataHoje = java.text.DateFormat.getDateInstance(DateFormat.DATE_FIELD).format(hoje);

                SimpleDateFormat hora = new SimpleDateFormat("HH:mm");
                hora.setLenient(false);

                try {
                    Date dat = formato.parse(data);
                    Date datHoje = formato.parse(dataHoje);
                    //COMPARA SE A DATA DESEJADA JÁ PASSOU
                    if (dat.after(datHoje) || dat.equals(datHoje)) {
                        controle = true;
                    } else {
                        System.err.println("Essa data já passou. Consultas a partir do dia de hoje: " + dataHoje);
                    }
                    hora.parse(horario);
                    controle = true;
                } catch (ParseException e) {
                    controle = false;
                }
            } while (controle != true);

            for (int i = 0; i < agenda.size(); i++) {
                //VERIFICA SE EXISTE ESSA CONSULTA NA AGENDA
                if (!data.equals(agenda.get(i).getData()) || !horario.equals(agenda.get(i).getHorario())) {
                    System.err.println("Consulta Inexistente");
                } else {
                    //REMOVE A CONSULTA
                    agenda.remove(i);
                    System.out.println("Consulta Desmarcada");
                    break;
                }
            }
        } else if (comando == 3) {
            System.out.println("Redirecionando para o menu");
            System.out.flush();
        }
    }

    public void jogaEmArquivo(List<Agenda> agenda, List<Dentista> dentistas) {
        //CRIA UM ARQUIVO PARA JOGAR OS DADOS DA AGENDA
        File arq = new File("Agenda.txt");
        try {
            arq.createNewFile();

            //APONTA O PONTEIRO PARA A PRIMEIRA POSIÇÃO DO ARQUIVO
            //O 2º PARÂMETRO SENDO FALSE, SOBREESCREVE O ARQUIVO COM O NOVO CONTEÚDO
            //SENDO TRUE ESCREVE DE ONDE PAROU
            FileWriter fileWriter = new FileWriter(arq, false);

            //USANDO A CLASSE PrintWriter PARA ESCREVER NO ARQUIVO
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (int i = 0; i < agenda.size(); i++) {
                printWriter.println("Dentista: " + dentistas.get(i).getNome());
                printWriter.print(dentistas.get(i).getCliente().getNome());
                printWriter.print("\t" + agenda.get(i).getData());
                printWriter.println("\t" + agenda.get(i).getHorario());
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
}
