package Program;
import java.util.Scanner;
import java.time.LocalDate;

public class Contas {
    private double valor;
    String tipo;

    private int diaVencimento;
    private int mesVencimento;
    private int anoVencimento;
    
    private int diaPagamento;
    private int mesPagamento;
    private int anoPagamento;
    

    // CONTRUTOR VAZIO
    public Contas() {}

    public Contas(double valor, int diaVencimento, int mesVencimento, 
            int anoVencimento, int diaPagamento, int mesPagamento, 
            int anoPagamento, String tipo) {
        this.valor = valor;
        this.diaVencimento = diaVencimento;
        this.mesVencimento = mesVencimento;
        this.anoVencimento = anoVencimento;
        this.diaPagamento = diaPagamento;
        this.mesPagamento = mesPagamento;
        this.anoPagamento = anoPagamento;
        this.tipo = tipo;
    }

    /* GETTERS */
    // RETORNA O VALOR DA CONTA
    public double getValor() {
        return valor;
    }
    // RETORNA O DIA DO VENCIMENTO DA CONTA
    public int getDiaVencimento() {
        return diaVencimento;
    }
    // RETORNA O MES DO VENCIMENTO DA CONTA
    public int getMesVencimento() {
        return mesVencimento;
    }
    // RETORNA O ANO DO VENCIMENTO DA CONTA
    public int getAnoVencimento() {
        return anoVencimento;
    }
    // RETORNA O DIA DO PAGAMENTO DA CONTA
    public int getDiaPagamento() {
        return diaPagamento;
    }
    // RETORNA O MES DO PAGAMENTO DA CONTA
    public int getMesPagamento() {
        return mesPagamento;
    }
    // RETORNA O ANO DO PAGAMENTO DA CONTA
    public int getAnoPagamento() {
        return anoPagamento;
    }
    // RETORNA O TIPO DE CONTA
    public String getTipo() {
        return tipo;
    }
    
    /* SETTERS */
    // ALTERA O VALOR DA CONTA
    protected void setValor(double valor) {
        this.valor = valor;
    }
    // ALTERA O DIA DO VENCIMENTO DA CONTA
    protected void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }
    // ALTERA O MES DO VENCIMENTO DA CONTA
    protected void setMesVencimento(int mesVencimento) {
        this.mesVencimento = mesVencimento;
    }
    // ALTERA O ANO DO VENCIMENTO DA CONTA
    protected void setAnoVencimento(int anoVencimento) {
        this.anoVencimento = anoVencimento;
    }
    // ALTERA O DIA DO PAGAMENTO DA CONTA
    protected void setDiaPagamento(int diaPagamento) {
        this.diaPagamento = diaPagamento;
    }
    // ALTERA O MES DO PAGAMENTO DA CONTA
    protected void setMesPagamento(int mesPagamento) {
        this.mesPagamento = mesPagamento;
    }
    // ALTERA O ANO DO PAGAMENTO DA CONTA
    protected void setAnoPagamento(int anoPagamento) {
        this.anoPagamento = anoPagamento;
    }
    // ALTERA O TIPO DE CONTA
    protected void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    void pagamentoContas() {
        Scanner input = new Scanner(System.in);
        
        Contas conta;
        char barra;
        System.out.print("Qual conta deseja pagar? ");
        conta.tipo = input.nextLine();
        
        System.out.print("Data de vencimento? No seguinte formato dia/mes/ano: ");
        conta.diaVencimento = input.nextInt();
        barra = input.next().charAt(0);
        conta.mesVencimento = input.nextInt();
        //barra = input.next().charAt(0);
        conta.anoVencimento = input.nextInt();
        
        System.out.print("Valor: ");
        cin >> conta.valor = input.nextInt();

        // UTILIZANDO A STRUCT ** PARA PEGAR A DATA DIRETO DO SISTEMA
        struct tm *p;
        time_t seconds;
        time(&seconds);
        p = localtime(&seconds);

        //Verificar se deseja realizar o pagamento
        char opcao;
        System.out.println("Deseja realizar o pagamento? S ou N");
        opcao = input.next().charAt(0);
        
        if (opcao == 'S') { 
            conta.diaPagamento = p->tm_mday;
            conta.mesPagamento = p->tm_mon + 1;
            conta.anoPagamento = p->tm_year + 1900;
            fprintf (arq, "%d%c%d%c%d \t %s \t %.2lf", conta.diaPagamento, barra, conta.mesPagamento, barra, conta.anoPagamento, conta.getTipoConta().c_str(), conta.valor);
        }
        else {
            System.out.println("Não foi paga");
        }
    }
}
