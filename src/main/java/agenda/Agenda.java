package agenda;

import java.util.ArrayList;

public class Agenda {
    private static ArrayList<Pessoa> agenda = new ArrayList<Pessoa>();
    
    public static void addPessoa(Pessoa pessoa) {
        agenda.add(pessoa);
    }
    
    public static void imprimirAgenda() {
        System.out.println("\n---AGENDA---");
        for (Pessoa pessoa: agenda) {
            if (pessoa.getNumero().length()<14) { //CPF
                System.out.println("\nNOME: "+pessoa.getTexto());
                System.out.println("CPF: "+pessoa.getNumero());
                System.out.println("ANIVERSARIO: "+pessoa.getAniversario());
                System.out.println("ENDERECO: "+pessoa.getEndereco());
            } else { //CNPJ
                System.out.println("\nRAZAO SOCIAL: "+pessoa.getTexto());
                System.out.println("CNPJ: "+pessoa.getNumero());
                System.out.println("FATURAMENTO: "+pessoa.getFaturamento());
                System.out.println("ENDERECO: "+pessoa.getEndereco());
            }
        }
    }
    
    public static void buscarContato(String num) {
        for (Pessoa pessoa: agenda) {
            if (pessoa.getNumero().equals(num)) {
                if (pessoa.getNumero().length()<14) { //CPF
                        System.out.println("\nNOME: "+pessoa.getTexto());
                        System.out.println("CPF: "+pessoa.getNumero());
                        System.out.println("ANIVERSARIO: "+pessoa.getAniversario());
                        System.out.println("ENDERECO: "+pessoa.getEndereco());
                        break;
                } else { //CNPJ
                        System.out.println("\nRAZAO SOCIAL: "+pessoa.getTexto());
                        System.out.println("CNPJ: "+pessoa.getNumero());
                        System.out.println("FATURAMENTO: "+pessoa.getFaturamento());
                        System.out.println("ENDERECO: "+pessoa.getEndereco());
                        break;
                }
            }
        }
    }
}
