import entity.ContaCorrente;
import entity.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();

        // Definindo o titular da conta
        conta1.setTitular("João");

        // Realizando operações na conta
        conta1.depositar(1000);  // deposita R$ 1000 na conta
        conta1.sacar(500);      // saca R$ 500 da conta

        // Mostrando informações da conta
        System.out.println("Titular da conta: " + conta1.getTitular());
        System.out.println("Número da conta: " + conta1.getNumero());
        System.out.println("Agência da conta: " + conta1.getAgencia());
        System.out.println("Saldo da conta: R$ " + conta1.getSaldo());

        // Criando outra instância de ContaPoupanca
        ContaPoupanca conta2 = new ContaPoupanca();
        conta2.setTitular("Maria");
        conta2.depositar(500);

        // Transferindo dinheiro entre contas
        conta1.transferir(200, conta2);  // transfere R$ 200 da conta1 para conta2

        // Mostrando saldo atualizado após transferência
        System.out.println("\nSaldo da conta de " + conta1.getTitular() + ": R$ " + conta1.getSaldo());
        System.out.println("Saldo da conta de " + conta2.getTitular() + ": R$ " + conta2.getSaldo());
    }
}