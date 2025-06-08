import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  Verificando aprovação em uma disciplina
        System.out.println("\n=== Exercício 1 ===");

        System.out.println("Insira sua nota do Grau A: ");
        double notaA = scanner.nextDouble();
        System.out.println("Insira sua nota do Grau B: ");
        double notaB = scanner.nextDouble();

        double media = (notaA * 0.33) + (notaB * 0.67);
        String mensagem;

        if (media >= 7) {
            mensagem = " e foi aprovado";
        } else if (media < 5) {
            mensagem = " e foi reprovado";
        } else {
            mensagem = " e está de recuperação.";
        }
        System.out.println("\nO estudante teve uma média de " + media + mensagem);

        // Validação de senha
        System.out.println("\n=== Exercício 2 ===");

        System.out.println("Insira sua senha: ");
        scanner.nextLine();
        String senhaDigitada = scanner.nextLine();
        String senhaDefinida = "123456";

        if (senhaDigitada.equals(senhaDefinida)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }

        // Comparando dois números
        System.out.println("\n=== Exercício 3 ===");

        System.out.println("Digite um número: ");
        int primeiroNum = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int segundoNum = scanner.nextInt();

        if (primeiroNum > segundoNum) {
            System.out.println("O número maior é " + primeiroNum);
        } else if (segundoNum > primeiroNum) {
            System.out.println("O número maior é " + segundoNum);
        } else {
            System.out.println("Os números são iguais!");
        }

        // Verificação de desconto em compras
        System.out.println("\n=== Exercício 4 ===");

        System.out.println("Digite o valor da compra: ");
        double valorOriginal = scanner.nextDouble();
        double valorDesconto;

        if (valorOriginal >= 100) {
            valorDesconto = valorOriginal - (valorOriginal / 10);
            System.out.println("Desconto de 10% aplicado");
            System.out.println("Novo valor: R$" + valorDesconto);
        } else {
            System.out.println("Nenhum desconto aplicado");
            System.out.println("Valor total: R$" + valorOriginal);
        }

        // Verificação de dia útil
        System.out.println("\n=== Exercício 5 ===");

        System.out.println("Digite o dia da semana: ");
        scanner.nextLine();
        String dia = scanner.nextLine();

        if (dia.equalsIgnoreCase("segunda") || dia.equalsIgnoreCase("terça") ||
                dia.equalsIgnoreCase("quarta") || dia.equalsIgnoreCase("quinta") ||
                dia.equalsIgnoreCase("sexta")) {
            System.out.println(dia + " é um dia útil");
        } else {
            System.out.println(dia + " não é um dia útil");
        }

        // Verificando se um número está em um intervalo
        System.out.println("\n=== Exercício 6 ===");

        System.out.println("Qual o valor do empréstimo que gostaria de retirar?");
        int valor = scanner.nextInt();

        if (valor < 1000 || valor > 5000) {
            System.out.println("O valor " + valor + " não está dentro do intervalo permitido de empréstimo");
        } else {
            System.out.println("Empréstimo feito com sucesso!");
        }

        // Verificação de triângulo
        System.out.println("\n=== Exercício 7 ===");

        System.out.println("Qual o valor do primeiro lado?");
        int lado1 = scanner.nextInt();
        System.out.println("Qual o valor do segundo lado?");
        int lado2 = scanner.nextInt();
        System.out.println("Qual o valor do terceiro lado?");
        int lado3 = scanner.nextInt();

        if ((lado1 + lado2) > lado3) {
            System.out.println("Os lados podem formar um triângulo.");
        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }

        // Verificação de compatibilidade de doação de sangue
        System.out.println("\n=== Exercício 8 ===");

        System.out.println("Digite o peso do doador (em kg): ");
        double peso = scanner.nextDouble();
        System.out.println("Digite a idade do doador: ");
        int idade = scanner.nextInt();

        if (peso < 50) {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve pesar acima de 50kg");
        } else if (idade < 18 || idade > 65) {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve ter entre 18 e 65 anos.");
        } else {
            System.out.println("O doador é compatível!");
        }

        // Verificação de código de acesso e nível de permissão
        System.out.println("\n=== Exercício 9 ===");

        System.out.println("Digite o código de acesso: ");
        int codigo = scanner.nextInt();
        System.out.println("Digite seu nível de permissão: ");
        int nivelPermissao = scanner.nextInt();

        int nivelPermissaoMinimo = 1;
        int nivelPermissaoMaximo = 3;

        int codigoCorreto = 2023;
        boolean nivelPermissaoValido = nivelPermissao >= nivelPermissaoMinimo && nivelPermissao <= nivelPermissaoMaximo;

        if (codigo == codigoCorreto && nivelPermissaoValido) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else if (codigo != codigoCorreto && nivelPermissaoValido){
            System.out.println("Acesso negado. Código de acesso incorreto.");
        } else if (codigo == codigoCorreto && !nivelPermissaoValido) {
            System.out.println("Acesso negado. Nível de permissão fora de parâmetro.");
        } else {
            System.out.println("Acesso negado. Código de acesso incorreto e nível de permissão fora de parâmetro.");
        }
    }
}
