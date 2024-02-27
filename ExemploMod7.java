/**
 * @author cauevinnicius
 */

public class ExemploMod7 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Cauê Vinicius", 1999);
        pessoa1.cumprimentar();
        int anoAtual = 2024;
        int idade = pessoa1.calcularIdade(anoAtual);
        System.out.println("Idade: " + idade + " anos");
    }
}
    