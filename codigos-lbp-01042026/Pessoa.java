// --- A CLASSE MÃE (superclasse) ---
public class Pessoa {

    // PROTECTED: o nome está seguro contra acessos externos, mas as classes filhas (como Professor e Aluno) têm permissão para acessar
    protected String nome;

    // construtor de Pessoa com o mesmo nome da classe
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Comportamento padrão da classe mãe
    public void apresentar() {
        System.out.println("Olá, sou " + this.nome);
    }
}