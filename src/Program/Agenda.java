package Program;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
        
public class Agenda {
    String data;
    String horario;

    // CONSTRUTOR VAZIO
    public Agenda() {}

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
    protected void setData (String data) {
        this.data = data;
    }
    
    // ALTERA A HORA
    protected void setHorario (String horario) {
        this.horario = horario;
    }
    
    //ABRE A AGENDA DE UM DETERMINADO DENTISTA
    public void abrirAgenda(List<Dentista> dentistas){
        List<Agenda> agenda = new ArrayList<Agenda>();
        
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
                dentistas.add(dentistaPadrao);
            }
            
            do {
                //IMPRIME TODOS OS DENTISTAS
                System.out.println("Dentistas disponíveis: ");
                for (int i = 0; i < dentistas.size(); i++) {
                    System.out.println(dentistas.get(i).getNome());                  
                }
                
                System.out.print("Qual deles você deseja visualizar a agenda?");
                nome = input.nextLine();
                
                for (int i = 0; i < dentistas.size(); i++) {
                    //COMPARA SE O DENTISTA DIGITADO PELO USUÁRIO EXISTE
                    if (dentistas.get(i).getNome().equals(nome)) {
                        //SE EXISTIR, IMPRIME A AGENDA DO DENTISTA
                        System.out.println ("Agenda do dentista: " + dentistas.get(i).getNome());
                        
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
                    nomePaciente = input.nextLine();
                    
                    for(char i : nome.toCharArray()) {
                        if (!Character.isLetter(i)) {
                            System.err.println("Nome possui caracteres inválidos");
                            valida = false;
                        }
                    }
                    
                } while (valida != true);
                
                //VERIFICAÇÃO SE A IDADE É VÁLIDA
                do {
                    valida = true;
                    
                    System.out.print("Qual sua idade: ");
                    idade = input.nextInt();
                    
                    if(idade < 18 || idade > 90) {
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
                
                editarAgenda();
            }
            else {
                sairDaAgenda = 1;
            }
            
        } while (sairDaAgenda != 1);
    }
    // EDITA A AGENDA DE UM DETERMINADO DENTISTA
    public void editarAgenda(){}
}
