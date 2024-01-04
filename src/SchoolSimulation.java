class SchoolSimulation {
    
    // Static global variables for sharing between threads
    static int Num_seance = -1; // number of the current seance (initially -1)
    static String Seance_type = "vide"; // type of the current seance (initially "vide")
    static final Object lock = new Object(); // lock object for synchronizing threads

    // main method for the simulation of the school system
    public static void main(String[] args) {
        Secretaire secretaireThread = new Secretaire(); // create a new thread for the secretary
        Enseignant enseignantThread = new Enseignant(); // create a new thread for the teacher
        Etudiant etudiantThread = new Etudiant(); // create a new thread for the student

        secretaireThread.start(); // start the secretary thread (calls the run method)
        etudiantThread.start(); // start the student thread (calls the run method)
        enseignantThread.start(); // start the teacher thread (calls the run method)
    }
}

