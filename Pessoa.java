/**
 * @author cauevinnicius
 */

class Pessoa {

    String nome;
    int anoNascimento;

    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public void cumprimentar() {
        System.out.println("Olá, eu sou " + nome + "!");
    }

    public int calcularIdade(int anoAtual) {
        return anoAtual - anoNascimento;
    }
}