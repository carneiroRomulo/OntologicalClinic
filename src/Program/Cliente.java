package Program;

public class Cliente extends Pessoa{
    private boolean pago;
    private int diaPagamento;
    private int mesPagamento;
    private int anoPagamento;

    // CONSTRUTOR VAZIO
    public Cliente() {
    }

    public Cliente(boolean pago, int diaPagamento, int mesPagamento, int anoPagamento, String nome, String sobrenome, String endereco, String email, String CPF, String RG, String telefone, String idade) {
        super(nome, sobrenome, endereco, email, CPF, RG, telefone, idade);
        this.pago = pago;
        this.diaPagamento = diaPagamento;
        this.mesPagamento = mesPagamento;
        this.anoPagamento = anoPagamento;
    }
    
    /* GETTERS */
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

    /* SETTERS */
    // ALTERA O STATUS DO PAGAMENTO
    protected void setPago(boolean pago) {
        this.pago = pago;
    }
    // ALTERA O DIA DO PAGAMENTO
    protected void setDiaPagamento(int diaPagamento) {
        this.diaPagamento = diaPagamento;
    }
    // ALTERA O MES DO PAGAMETNO
    protected void setMesPagamento(int mesPagamento) {
        this.mesPagamento = mesPagamento;
    }
    // ALTERA O ANO DO PAGAMENTO
    protected void setAnoPagamento(int anoPagamento) {
        this.anoPagamento = anoPagamento;
    }
    
}
