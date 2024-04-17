import java.util.Scanner;

public class gnose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Bem vindo a Jornada Filosofica, aspirante a filosofo!\nVocê foi escolhido para esta jornada em busca da Fonte da Sabedoria.");
        System.out.println("Você aceita o desafio? (s/n)");
        char escolha = scanner.next().charAt(0);
        if (escolha == 's') {
            escolhaCaminho(scanner);
        } else if (escolha == 'n') {
            System.out.println("Você decide voltar para casa. Adeus, BURRO!");
        } else {
            System.out.println("Opção inválida. Fim da jornada.");
        }
    }
    public static void escolhaCaminho(Scanner scanner) {
        System.out.println("\nVocê entra no Labirinto da Sabedoria.\nEscolha a trilha: Lógica (l) ou Ética (e)");
        char escolha = scanner.next().charAt(0);
        if (escolha == 'l') {
            System.out.println("Você escolhe a trilha da Lógica.");
            System.out.println("Você se depara com um quebra-cabeça: 2 + 2 * 3 = ?");
            int resposta = scanner.nextInt();
            if (resposta == 8) {
                System.out.println("Parabéns! Você resolveu o quebra-cabeça e avançou para a próxima fase.");
                encontroFilosofico(scanner);
            } else {
                System.out.println("Resposta incorreta. Fim da jornada.");
            }
        } else if (escolha == 'e') {
            System.out.println("Você escolhe a trilha da Ética.");
            System.out.println("Você encontra uma carteira perdida. O que você faz? (d/r)");
            char acao = scanner.next().charAt(0);
            if (acao == 'd') {
                System.out
                        .println("Você devolve a carteira ao dono e é recompensado com uma chave para a próxima fase.");
                encontroFilosofico(scanner);
            } else if (acao == 'r') {
                System.out.println(
                        "Você decide ficar com a carteira, mas é confrontado com sua própria consciência. Fim da jornada.");
            } else {
                System.out.println("Opção inválida. Fim da jornada.");
            }
        } else {
            System.out.println("Opção inválida. Fim da jornada.");
        }
    }

    public static void encontroFilosofico(Scanner scanner) {
        System.out.println("\nVocê encontra três figuras filosóficas.");
        System.out.println("Deseja debater com eles? (s/n)");
        char escolha = scanner.next().charAt(0);
        if (escolha == 's') {
            System.out.println("Você inicia os debates filosóficos...");
            System.out.println("Após os debates, você segue para a próxima fase.");
            desafioFinal(scanner);
        } else if (escolha == 'n') {
            System.out.println("Você decide não debater e segue para a próxima fase.");
            desafioFinal(scanner);
        } else {
            System.out.println("Opção inválida. Fim da jornada.");
        }
    }

    public static void desafioFinal(Scanner scanner) {
        System.out.println("\nVocê finalmente chega à Sala da Verdade.");
        System.out.println("Qual é a sua escolha? Beber da Fonte da Sabedoria (b) ou Recusar (r)");
        char escolha = scanner.next().charAt(0);
        if (escolha == 'b') {
            System.out.println("Você bebe da Fonte da Sabedoria e enfrenta uma sobrecarga de informações.");
            System.out.println("Após muitos desafios mentais, você emerge como um sábio. Fim da jornada.");
        } else if (escolha == 'r') {
            System.out.println(
                    "Você decide não beber da Fonte da Sabedoria e aceita que a verdade é relativa. Fim da jornada.");
        } else {
            System.out.println("Opção inválida. Fim da jornada.");
        }
    }
}
