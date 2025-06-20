import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = scan.next();
        System.out.printf("Bem vindo(a), " + nome);

        System.out.println(". Qual sua idade?");
        int idade = scan.nextInt();
        System.out.println("Você tem " + idade + " anos");

        System.out.println("Digite aqui o valor do raio circulo");
        double raio = scan.nextDouble();
        double calculo = Math.PI * (raio * raio); // ou Math.pow(raio, 2)
        System.out.println("A área do seu circulo é: " + calculo + " metros quadrados");

            exMedia(scan);
            notas(scan);
            calculos(scan);
            verificarIdade(scan);
            exemploLoop(scan);

    scan.close();
        scan.close();
    }

    public static void novoExemplo(Scanner scan) {
        System.out.println("Quantos números vc quer digitar?");
        int qntd = scan.nextInt();
        int[] numeros = new int[qntd];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i);
        }
    }

    public static void exemploLoop(Scanner scan) {
        while (true) {
            System.out.println("1-Oi\n2-Tchau\n0-Sair\nOpção");
            int op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Oi");
                    break;
                case 2:
                    System.out.println("Tchau");
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }

            if (op == 0) break;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void contadorLoop() {
        int contador = 0;

        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }

        do {
            System.out.println("do-while contador: " + contador);
            contador++;
        } while (contador < 10);
    }

    public static void senhaLoop(Scanner scan) {
        final String SENHA_LOCAL = "1234";
        System.out.println("Digite sua senha: ");
        String senha = scan.next();

        while (!senha.equals(SENHA_LOCAL)) {
            System.out.println("Senha incorreta, digite novamente.");
            senha = scan.next();
        }
        System.out.println("Senha correta!");
    }

    public static void exMedia(Scanner scan) {
        double[] notas = new double[4];
        System.out.println("Digite aqui suas quatro notas");
        notas[0] = scan.nextDouble();
        notas[1] = scan.nextDouble();
        notas[2] = scan.nextDouble();
        notas[3] = scan.nextDouble();
        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        System.out.println("Média final: " + media);

        ArrayList<Double> listaNotas = new ArrayList<>();
        listaNotas.add(10.0);
        listaNotas.add(8.0);
        listaNotas.add(9.0);
        listaNotas.add(1.0);
        System.out.println(listaNotas.get(3));

        if (media >= 10) {
            System.out.println("Aluno é top e passou de ano");
        } else if (media >= 7) {
            System.out.println("Aluno passou de ano");
        } else {
            System.out.println("Aluno reprovado");
        }

        System.out.println(media >= 7 ? "Aprovado" : "Reprovado");
    }

    public static void verificarIdade(Scanner scan) {
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println(idade >= 18 ? "Pode" : "Não pode");
    }

    public static void notas(Scanner scan) {
        System.out.println("Digite aqui a nota 1:");
        double nota1 = scan.nextDouble();
        System.out.println("Digite aqui a nota 2:");
        double nota2 = scan.nextDouble();
        System.out.println("Digite aqui a nota 3:");
        double nota3 = scan.nextDouble();
        System.out.println("Digite aqui a nota 4:");
        double nota4 = scan.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média é: " + media);
        if (media >= 7) {
            System.out.println("Aluno passou de ano");
        } else {
            System.out.println("O aluno reprovou!");
        }
    }

    public static void calculos(Scanner scan) {
        System.out.println("Digite um número:");
        double num1 = scan.nextDouble();
        System.out.println("Digite outro número:");
        double num2 = scan.nextDouble();

        double soma = num1 + num2;
        double sub = num1 - num2;
        double mult = num1 * num2;
        double div = num1 / num2;
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + sub);
        System.out.println("Resultado da multiplicação: " + mult);
        System.out.println("Resultado da divisão: " + div);
    }
}
