import java.util.Scanner;

class Curso {
    private String nome;

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

public class Main {
    private static final Curso[] cursos = {
            new Curso("ADS"),
            new Curso("PSI"),
            new Curso("SINT"),
            new Curso("ENF")
    };

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int ADS = 0, PSI = 0, SINT = 0, ENF = 0, superior = 0, tecnico = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Insira seu curso: ");
            String seuCurso = read.next();

            boolean cursoValido = false;
            for (Curso curso : cursos) {
                if (curso.getNome().equalsIgnoreCase(seuCurso)) {
                    cursoValido = true;
                    switch (seuCurso.toUpperCase()) {
                        case "ADS":
                            ADS++;
                            superior++;
                            break;
                        case "PSI":
                            PSI++;
                            superior++;
                            break;
                        case "SINT":
                            SINT++;
                            tecnico++;
                            break;
                        case "ENF":
                            ENF++;
                            tecnico++;
                            break;
                    }
                    break;
                }
            }

            if (!cursoValido) {
                System.out.println("Curso inválido, insira novamente");
                i--;
            }
        }

        read.close();

        System.out.println("Contagem de Cursos:");
        System.out.println("ADS: " + ADS);
        System.out.println("PSI: " + PSI);
        System.out.println("SINT: " + SINT);
        System.out.println("ENF: " + ENF);
        System.out.println("Total de cursos superior: "+superior+"\nTotal de tecnicos: " +tecnico);
    }
}
