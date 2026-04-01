public class Professor extends Pessoa {
    
    // Atributo específico do Professor
    // Como ninguém herda de Professor, ainda, pode ser private
    public String area;

    // Construtor de Professor com o mesmo nome da classe
    public Professor(String nome, String area) {
        // O super() deve ser a primeira linha
        // Mandamos o nome para a mãe para inicializar com a base do objeto
        super(nome);
        this.area = area;
    }

    // SOBRESCRITA: mudando o comportamento padrão da mãe
    @Override
    public void apresentar() {
        // conseguimos usar o this.nome diretamente porque ele foi declarado como protected na classe Pessoa
        System.out.println("Olá, sou o Prof. " + this.nome + " da área de " + this.area);
    }
}
