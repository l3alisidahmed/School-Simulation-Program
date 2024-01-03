class SchoolSimulation {
    static int Num_seance = -1;
    static String Seance_type = "vide";
    static final Object lock = new Object();

    public static void main(String[] args) {
        Secretaire secretaireThread = new Secretaire();
        Enseignant enseignantThread = new Enseignant();
        Etudiant etudiantThread = new Etudiant();

        secretaireThread.start();
        etudiantThread.start();
        enseignantThread.start();
    }
}

