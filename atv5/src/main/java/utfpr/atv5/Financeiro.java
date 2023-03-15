
package utfpr.atv5;

public class Financeiro {
    double saldo;
    int tipo_lanc;
    String descricao_lanc = new String();
    double valor_lanc;
    
    public Financeiro(){
        saldo = 0;
    }
    
    public void processarLancamento(Lancamento l){
        tipo_lanc = l.getTipo();
        descricao_lanc = l.getDescricao();
        valor_lanc = l.getValor();
        System.out.print("Lançamento: ");
        if (tipo_lanc == 0){
            System.out.print("Pagar - ");
            saldo -= valor_lanc;
        }
        else if (tipo_lanc == 1){
            System.out.print("Receber - ");
            saldo += valor_lanc;
        }
        System.out.printf("%s - %.2f\n", descricao_lanc, valor_lanc);
}
    
    public void printSaldo(){
        System.out.printf("Saldo = %.2f\n", saldo);
    }
       
}
