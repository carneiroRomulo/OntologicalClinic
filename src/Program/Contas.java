package Program;

import java.text.DateFormat;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Contas {

    String valor;
    String tipo;
    String dataVencimento;
    String dataPagamento;

    // CONTRUTOR VAZIO
    public Contas() {
    }

    public Contas(String valor, String dataVencimento, String dataPagamento, String tipo) {
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.tipo = tipo;
    }

    /* GETTERS */
    // RETORNA O VALOR DA CONTA
    public String getValor() {
        return valor;
    }

    // RETORNA A DATA DO VENCIMENTO DA CONTA
    public String getDataVencimento() {
        return dataVencimento;
    }

    // RETORNA A DATA DO PAGAMENTO DA CONTA
    public String getDataPagamento() {
        return dataPagamento;
    }

    // RETORNA O TIPO DE CONTA
    public String getTipo() {
        return tipo;
    }

    /* SETTERS */
    // ALTERA O VALOR DA CONTA
    protected void setValor(String valor) {
        this.valor = valor;
    }

    // ALTERA A DATA DO VENCIMENTO DA CONTA
    protected void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    // ALTERA A DATA DO PAGAMENTO DA CONTA
    protected void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    // ALTERA O TIPO DE CONTA
    protected void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //REALIZA O PAGAMENTO DAS CONTAS
    protected void pagamentoContas() {
        Scanner input = new Scanner(System.in);

        Contas conta = new Contas();

        System.out.print("Qual conta deseja pagar? ");
        conta.tipo = input.nextLine();
        conta.setTipo(conta.tipo);

        System.out.print("Data de vencimento (dd/mm/yy)? ");
        conta.dataVencimento = input.nextLine();
        conta.setDataVencimento(conta.dataVencimento);

        System.out.print("Valor: ");
        conta.valor = input.nextLine();
        conta.setValor(conta.valor);

        //USADO PARA PEGAR A DATA DE PAGAMENTO DIRETO DO SISTEMA
        Date data = new Date();

        //VERIFICA SE DESEJA REALIZAR O PAGAMENTO
        char opcao;
        System.out.print("Deseja realizar o pagamento (S/N)? ");
        opcao = input.next().charAt(0);

        if (opcao == 'S') {
            try {
                //PEGA A DATA NO INSTANTE DO PAGAMENTO E COLOCA A DATA EM FORMATO DD/MM/AA 
                String formatoData = java.text.DateFormat.getDateInstance(DateFormat.DATE_FIELD).format(data);
                conta.setDataPagamento(formatoData);

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
                Date dataP = formato.parse(conta.dataPagamento);
                Date dataV = formato.parse(conta.dataVencimento);
                //COMPARA SE A CONTA ESTÁ VENCIDA (DATA DE PAGAMENTO É ANTERIOR A DATA DE VENCIMENTO)
                if (dataP.before(dataV)) {
                    System.out.println("A data de pagamento foi: " + conta.dataPagamento);
                } else {
                    //ADICIONA UM PERCENTUAL DE 3% DE MULTA PELO ATRASO
                    conta.valor = conta.valor + (conta.valor * 0.03);
                    setValor(conta.valor);
                    System.out.println("\nA conta está vencida, será acrescido uma multa de 3% no valor da conta. \nNovo valor: " + conta.valor);

                    System.out.print("Deseja realizar o pagamento (S/N)? ");
                    opcao = input.next().charAt(0);

                    if (opcao == 'S') {
                        System.out.println("A data de pagamento foi: " + conta.dataPagamento);
                    } else {
                        System.out.println("A conta não foi paga");
                    }
                }
                jogaEmArquivo(conta);
            } catch (ParseException ex) {
            }
        } else {
            System.out.println("A conta não foi paga");
        }
    }

    public void jogaEmArquivo(String tipo, String valor, String dataPagamento) {
        //CRIA UM ARQUIVO PARA JOGAR OS DADOS DAS CONTAS PAGAS
        File arq = new File("Contas.txt");
        try {
            arq.createNewFile();

            //APONTA O PONTEIRO PARA A PRIMEIRA POSIÇÃO DO ARQUIVO
            //O 2º PARÂMETRO SENDO NEGATIVO, SOBREESCREVE O ARQUIVO COM O NOVO CONTEÚDO
            FileWriter fileWriter = new FileWriter(arq, true);

            //USANDO A CLASSE PrintWriter PARA ESCREVER NO ARQUIVO
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(tipo);
            printWriter.print("\t" + valor);
            printWriter.print("\t" + dataPagamento);
            printWriter.print("\n");

            //LIBERA A ESCRITA NO ARQUIVO
            printWriter.flush();

            //FECHA O ARQUIVO
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
