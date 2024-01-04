// Class Etudiant extends Thread to simulate the student thread
public class Etudiant extends Thread {
    // Override the run method inherited from Thread
    @Override
    // This method will be called when the thread is started (see SchoolSimulation.java)
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (SchoolSimulation.lock) { // synchronize threads on the lock object (see SchoolSimulation.java)
                if (SchoolSimulation.Num_seance != -1) { // if the current seance is not -1 (not empty)
                    Afficher_Signature(); // print the signature of the student on the screen (see below)
                    Afficher_Num(); // print the number of the current seance on the screen (see below)
                    Afficher_Seance(); // print the type of the current seance on the screen (see below)
                    break; // exit the loop
                } else {
                    // Repeat the test
                    continue; // continue the loop
                }
            }
        }
    }

    // Print the signature of the student on the screen
    void Afficher_Signature() {
        System.out.println("Etudiant: Signature");
    }

    // Print the number of the current seance on the screen
    void Afficher_Num() {
        System.out.println("Etudiant: Afficher_Num - Num_seance: " + SchoolSimulation.Num_seance); // print the number of the current seance on the screen
    }

    // Print the type of the current seance on the screen
    void Afficher_Seance() {
        System.out.println("Etudiant: Afficher_Seance - Seance_type: " + SchoolSimulation.Seance_type); // print the type of the current seance on the screen
    }
}
