// 1. INTERFACE

interface ImpostoStrategy {
    double calcular(double valor);
}

// 2. ESTRATÉGIAS CONCRETAS

class Icms implements ImpostoStrategy {
    public double calcular(double valor) { return valor * 0.18; }
}

class Iss implements ImpostoStrategy {
    public double calcular(double valor) { return valor * 0.05; }
}

// 3. CLASSE QUE USA A ESTRATÉGIA

class CalculadoraDeImpostos {
    private ImpostoStrategy estrategia;

    public void setEstrategia(ImpostoStrategy e) {
        this.estrategia = e;
    }

    public double calcular(double valor) {
        return estrategia.calcular(valor);
    }
}

// MÉTODO MAIN

class MainImposto {
    public static void main(String[] args) {
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        double valorImposto = 10.0;

        // o cliente (main) decide qual estratégia usar dinamicamente
        calculadora.setEstrategia(new Icms());
        System.out.println("Imposto Icms: R$" + calculadora.calcular(valorImposto));

        calculadora.setEstrategia(new Iss());
        System.out.println("Imposto Iss: R$" + calculadora.calcular(valorImposto));
    }
}
