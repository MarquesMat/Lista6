package mains;

import agenda.*;
import java.util.Scanner;

public class Ex2 {
    public static void menu() {
        System.out.println("\n---MENU---");
        System.out.println("0 -> IMPRIMIR AGENDA");
        System.out.println("1 -> BUSCAR CONTATO");
        System.out.println("2 -> FECHAR AGENDA");
        System.out.print("SELECIONE UMA OPCAO: ");
    }
    
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto, end, aniversario;
        float faturamento;
        int op;
        System.out.print("Insira um novo CPF/CNPJ ou digite 'fechar' para fechar a agenda: ");
        String numero = teclado.next();
        while (!numero.equals("fechar")) {
            teclado.nextLine();
            if (numero.length()<14) { //CPF
                PessoaFisica pessoa = new PessoaFisica();
                System.out.print("Digite o nome: ");
                texto = teclado.nextLine();
                System.out.print("Digite o endereco: ");
                end = teclado.nextLine();
                System.out.print("Digite o aniversario: ");
                aniversario = teclado.nextLine();
                pessoa.newPessoa(numero, texto, end, aniversario);
                Agenda.addPessoa(pessoa);
                pessoa.getAniversario();
            } else { //CNPJ
                PessoaJuridica pessoa = new PessoaJuridica();
                System.out.print("Digite a razao social: ");
                texto = teclado.nextLine();
                System.out.print("Digite o endereco: ");
                end = teclado.nextLine();
                System.out.print("Digite o faturamento: ");
                faturamento = teclado.nextFloat();
                pessoa.newPessoa(numero, texto, end, faturamento);
                Agenda.addPessoa(pessoa);
            }
            System.out.print("\nInsira um novo CPF/CNPJ ou digite 'fechar' para fechar a agenda: ");
            numero = teclado.next();
        }
        do {
            menu();
            op = teclado.nextInt();
            switch (op) {
                case 0 -> Agenda.imprimirAgenda();
                case 1 -> {
                    System.out.print("\nDigite o CPF/CNPJ: ");
                    Agenda.buscarContato(teclado.next());
                }
                case 2 -> System.out.println("\n---AGENDA FECHADA---");
                default -> System.out.println("\n---ESCOLHA UMA OPCAO VALIDA---");
            }
        } while(op != 2);
    }
}