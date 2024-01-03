public class Etudiant extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (SchoolSimulation.lock) {
                if (SchoolSimulation.Num_seance != -1) {
                    Afficher_Signature();
                    Afficher_Num();
                    Afficher_Seance();
                    break;
                } else {
                    // Repeat the test
                    continue;
                }
            }
        }
    }

    void Afficher_Signature() {
        System.out.println("Etudiant: Signature");
    }

    void Afficher_Num() {
        System.out.println("Etudiant: Afficher_Num - Num_seance: " + SchoolSimulation.Num_seance);
    }

    void Afficher_Seance() {
        System.out.println("Etudiant: Afficher_Seance - Seance_type: " + SchoolSimulation.Seance_type);
    }
}
