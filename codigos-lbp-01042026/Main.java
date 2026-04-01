public class Main {
    public static void main(String[] args) {
        
        // testando a classe mãe (generalização)
        Pessoa p1 = new Pessoa("Carlos");
        p1.apresentar();
        // SAÍDA: Olá, sou Carlos

        System.out.println("--------------------------");

        // testando a classe filha (especialização)
        Professor prof1 = new Professor("Carlos", "Informática");
        prof1.apresentar();
        // SAÍDA: Olá, sou o Prof. Carlos da área de Informática
    }
}
