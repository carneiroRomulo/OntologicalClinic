package Program;

public class Consulta {
    private double valor;
    private boolean pago;
    private int diaPagamento;
    private int mesPagamento;
    private int anoPagamento;

    // CONTRUTOR VAZIO
    public Consulta() {}

    public Consulta(double valor, boolean pago, int diaPagamento, int mesPagamento, int anoPagamento) {
        this.valor = valor;
        this.pago = pago;
        this.diaPagamento = diaPagamento;
        this.mesPagamento = mesPagamento;
        this.anoPagamento = anoPagamento;
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
    // RETORNA O DIA DO PAGAMENTO
    public int getDiaPagamento() {
        return diaPagamento;
    }
    // RETORNA O MES DO PAGAMENTO
    public int getMesPagamento() {
        return mesPagamento;
    }
    // RETORNA O ANO DO PAGAMENTO
    public int getAnoPagamento() {
        return anoPagamento;
    }
    // ALTERA O VALOR DO PAGAMENTO
    public void setValor(double valor) {
        this.valor = valor;
    }
    // ALTERA O STATUS DO PAGAMENTO
    protected void setPago(boolean pago) {
        this.pago = pago;
    }
    // ALTERA O DIA DO PAGAMENTO
    protected void setDiaPagamento(int diaPagamento) {
        this.diaPagamento = diaPagamento;
    }
    // ALTERA O MES DO PAGAMENTO
    protected void setMesPagamento(int mesPagamento) {
        this.mesPagamento = mesPagamento;
    }
    // ALTERA O ANO DO PAGAMENTO
    protected void setAnoPagamento(int anoPagamento) {
        this.anoPagamento = anoPagamento;
    }
    
    // RECEBER CONSULTA
    public void receberConsulta() {}   
}
