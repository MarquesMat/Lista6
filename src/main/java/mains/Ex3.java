package mains;

import java.util.Scanner;
import evento.*;

public class Ex3 {
    public static void menu() {
        System.out.println("\nSELECIONE UMA OPCAO:");
        System.out.println("0 - INSCREVER PARTICIPANTE NAS PALESTRAS");
        System.out.println("1 - CONSULTAR VAGAS DISPONIVEIS NAS PALESTRAS");
        System.out.println("2 - CONSULTAR PALESTRAS QUE O PARTICIPANTE SE INSCREVEU");
        System.out.println("3 - EXIBIR DADOS DE UMA PALESTRA");
        System.out.println("4 - FECHAR SISTEMA");
    }
    
    public static void inscricao(String texto, String email,int mat, String txt, String c) {
        switch(c) {
            case "E" -> {
                Aluno aluno = new Aluno();
                aluno.newParticipante(texto, email, mat, txt);
                Inscricao.addParticipante(aluno);
            }
            case "P" -> {
                Professor professor = new Professor();
                professor.newParticipante(texto, email, mat, txt);
                Inscricao.addParticipante(professor);
            }
            case "F" -> {
                Funcionario funcionario = new Funcionario();
                funcionario.newParticipante(texto, email, mat, txt);
                Inscricao.addParticipante(funcionario);
            }
        }
    }
    
    public static void ocupacao(String c) {
        Inscricao.addOcupacao(c);
        switch(c) {
            case "E" -> System.out.print("Insira o curso: ");
            case "P" -> System.out.print("Insira o departamento: ");
            case "F" -> System.out.print("Insira o cargo: ");
        }
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INSCREVER PALESTRAS:");
        System.out.print("Digite o titulo da nova palestra ou 'xxx' para fechar a inscricao: ");
        String texto = teclado.nextLine();
        while (!texto.equals("xxx")) {
            if (Evento.palestrasLivres()) {
                Palestra palestra = new Palestra(texto);
                System.out.print("Insira o nome do palestrante: ");
                palestra.setPalestrante(teclado.nextLine());
                System.out.print("Insira o local: ");
                palestra.setLocal(teclado.nextLine());
                System.out.print("Insira a data: ");
                palestra.setData(teclado.next());
                System.out.print("Insira o horario: ");
                palestra.setHorario(teclado.next());
                System.out.print("Insira a duracao: ");
                palestra.setDuracao(teclado.nextInt());
                Evento.addPalestra(palestra);
                teclado.nextLine();
                System.out.print("\nDigite o titulo da nova palestra ou 'xxx' para fechar a inscricao: ");
                texto = teclado.nextLine();
            } else {
                System.out.println("\nO EVENTO NAO ACEITA NOVAS PALESTRAS");
                texto = "xxx";
            }
        }
        int mat, op, pales;
        String email, txt, ocupacao;
        System.out.println("\nINSCREVER PARTICIPANTES:");
        System.out.print("Digite o nome do novo participante ou 'xxx' para fechar a inscricao: ");
        texto = teclado.nextLine();
        while (!texto.equals("xxx")) {
            System.out.printf("Insira o email de %s: ", texto);
            email = teclado.next();
            System.out.printf("Insira a matricula de %s: ", texto);
            mat = teclado.nextInt();
            System.out.printf("Selecione a ocupacao de %s: ", texto);
            System.out.println("\n(E) estudante\n(P) professor\n(F) funcionario");
            ocupacao = teclado.next();
            teclado.nextLine();
            ocupacao(ocupacao); //Selecionar entre estudante, professor ou funcionario
            txt = teclado.nextLine();
            inscricao(texto, email, mat, txt, ocupacao);
            System.out.print("\nDigite o nome do novo participante ou 'xxx' para fechar a inscricao: ");
            texto = teclado.nextLine();
        }
        System.out.println("\nINSCRICOES REALIZADAS!");
        Evento.imprimirPalestras();
        Inscricao.imprimirParticipantes();
        do {
            menu();
            op = teclado.nextInt();
            switch(op){
                case 0 -> {
                    System.out.print("\nDIGITE A MATRICULA DO PARTICIPANTE: ");
                    mat = teclado.nextInt();
                    System.out.print("DIGITE O NUMERO DA PALESTRA: ");
                    pales = teclado.nextInt();
                    Inscricao.inscreverParticipante(mat, pales);
                }
                case 1 -> Evento.imprimirVagas();
                case 2 -> {
                    System.out.print("DIGITE A MATRICULA DO PARTICIPANTE: ");
                    Evento.imprimirPalestrasParticipantes(teclado.nextInt());
                }
                case 3 -> {
                    System.out.print("DIGITE O NUMERO DA PALESTRA: ");
                    pales = teclado.nextInt();
                    Evento.imprimirPalestraEsp((pales-1), true);
                }
            }
        } while (op != 4);
    }
}