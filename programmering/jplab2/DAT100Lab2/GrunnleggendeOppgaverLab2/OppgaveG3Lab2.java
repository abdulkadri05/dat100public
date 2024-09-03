package GrunnleggendeOppgaverLab2;

public class OppgaveG3Lab2 {
    public static void main(String[] args) {
        // A) og B)
        for (int i = 1; i <= 20; i++){
            System.out.println("i = " + i);

            switch (i){
                case 1: System.out.println("A"); break;
                case 2: System.out.println("B"); break;
                default: System.out.println("C"); break;
            }

            // C)
            if (i == 1){
                System.out.println("A");
            }
            else if (i == 2){
                System.out.println("B");
            }
            else {
                System.out.println("C");
            }
        }

    }
}
