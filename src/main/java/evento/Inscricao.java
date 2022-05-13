package evento;

import java.util.ArrayList;

public class Inscricao {
    private static ArrayList<Participante> participantes = new ArrayList<Participante>();
    private static ArrayList<String> participantesOcupacao = new ArrayList<String>();
    private static ArrayList<Palestra> palestras = new ArrayList<Palestra>();
    
    public static void addParticipante(Participante participante) {
        participantes.add(participante);
    }
    
    public static void addOcupacao(String c) {
        participantesOcupacao.add(c);
    }
    
    public static void imprimirParticipantes() {
        System.out.println("\n--PARTICIPANTES--");
        for (int i=0; i<participantes.size(); i++) {
            System.out.println("\nNOME: "+participantes.get(i).getNome());
            System.out.println("EMAIL: "+participantes.get(i).getEmail());
            System.out.println("MATRICULA: "+participantes.get(i).getMatricula());
            switch(participantesOcupacao.get(i)) {
                case "E" -> System.out.println("CURSO: "+participantes.get(i).getTxt());
                case "P" -> System.out.println("DEPARTAMENTO: "+participantes.get(i).getTxt());
                case "F" -> System.out.println("CARGO: "+participantes.get(i).getTxt());
            }
        }
    }
    
    public static void inscreverParticipante(int m, int p) {
        int i;
        for (i=0; participantes.get(i).getMatricula()!=m; i++) {
            //Localizar matricula do participante
        }
        if (Evento.vagasPalestra(p-1)) Evento.getPalestra(p-1).addParticipantePalestra(participantes.get(i)); //A linha é executada, mas nada muda
        else System.out.println("NAO HA MAIS VAGAS DISPONIVEIS NESSA PALESTRA!");
    }
}