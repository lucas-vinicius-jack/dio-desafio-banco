package desafiobanco;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Conta implements IConta{
    private static int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;


    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;



    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    protected void imprimeAtributos() {
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agência: %d", getAgencia() ));
        System.out.println(String.format("Npumero: %d", getNumero() ));
        System.out.println(String.format("Saldo: %.2f", getSaldo() ));
    }

}
