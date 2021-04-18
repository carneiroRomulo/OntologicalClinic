package Program;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Consulta {

    private double valor;
    private boolean pago;
    private String dataPagamento;

    // CONTRUTOR VAZIO
    public Consulta() {
    }

    public Consulta(double valor, boolean pago, String dataPagamento) {
        this.valor = valor;
        this.pago = pago;
        this.dataPagamento = dataPagamento;
    }

    /* GETTERS */
    // RETORNA O VALOR DA CONSULTA
    public double getValor() {
        return valor;
    }

    // RETORNA O STATUS DO PAGAMENTO
    public boolean getPago() {
        return pago;
    }

    // RETORNA A DATA DO PAGAMENTO
    public String getDataPagamento() {
        return dataPagamento;
    }

    // ALTERA O VALOR DO PAGAMENTO
    public void setValor(double valor) {
        this.valor = valor;
    }

    // ALTERA O STATUS DO PAGAMENTO
    protected void setPago(boolean pago) {
        this.pago = pago;
    }

    // ALTERA A DATA DO PAGAMENTO
    protected void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    // RECEBER CONSULTA
    public void receberConsulta(Cliente cliente) {
        Consulta consulta = new Consulta();
        Scanner input = new Scanner(System.in);

        System.out.print("Valor: ");
        consulta.valor = input.nextDouble();

        char opcao;
        System.out.print("Confirmar pagamento (S/N)? ");
        opcao = input.next().charAt(0);

        if (opcao == 'S') {
            consulta.setPago(true);
            System.out.println("\nPagamento confirmado.\n");

            //PEGA A DATA ATUAL DO SISTEMA
            Date hoje = new Date();
            String dataHoje = java.text.DateFormat.getDateInstance(DateFormat.DATE_FIELD).format(hoje);
            consulta.setDataPagamento(dataHoje);
        } else {
            System.out.println("A conta não foi paga");
            consulta.setPago(false);
            consulta.setDataPagamento(null);
        }
        jogaEmArquivo(consulta, cliente);
    }

    public void jogaEmArquivo(Consulta consulta, Cliente cliente) {
        //CRIA UM ARQUIVO PARA JOGAR OS DADOS DAS CONSULTAS 
        File arq = new File("Consultas.txt");
        try {
            arq.createNewFile();

            //APONTA O PONTEIRO PARA A PRIMEIRA POSIÇÃO DO ARQUIVO
            //O 2º PARÂMETRO SENDO NEGATIVO, SOBREESCREVE O ARQUIVO COM O NOVO CONTEÚDO
            //SENDO TRUE ESCREVE DE ONDE PAROU
            FileWriter fileWriter = new FileWriter(arq, false);

            //USANDO A CLASSE PrintWriter PARA ESCREVER NO ARQUIVO
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.printf("%-10s %-10s %-10s %-10s\n", "Cliente", "Valor", "Pago", "Data do pagamento");
            //printWriter.printf("Cliente \t Valor \t\t Foi paga \t Data do pagamento\n");
            printWriter.printf("%-11s", cliente.getNome());
            printWriter.printf("%-11s", consulta.getValor());
            printWriter.printf("%-12s", consulta.getPago());
            printWriter.printf("%10s\n", consulta.getDataPagamento());

            //LIBERA A ESCRITA NO ARQUIVO
            printWriter.flush();

            //FECHA O ARQUIVO
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
