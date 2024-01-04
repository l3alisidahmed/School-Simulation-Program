import java.util.Random; // import the Random class from the java.util package

// Class Secretaire extends Thread to simulate the secretary thread
class Secretaire extends Thread {
    // Override the run method inherited from Thread
    @Override
    public void run() { // This method will be called when the thread is started (see SchoolSimulation.java)
        for (int i = 0; i < 5; i++) {
            synchronized (SchoolSimulation.lock) { // synchronize threads on the lock object (see SchoolSimulation.java)
                SchoolSimulation.Num_seance = Avoir_Num(); // generate a random number for the current seance (see below)
            }
        }
    }

    // Generate a random number for the current seance
    int Avoir_Num() {
        Random rand = new Random(); // create a new Random object (see https://docs.oracle.com/javase/8/docs/api/java/util/Random.html)
        int num = rand.nextInt(3) + 1; // generate a random number between 1 and 3 (see https://docs.oracle.com/javase/8/docs/api/java/util/Random.html#nextInt-int-)
        System.out.println("Secretaire: Avoir_Num - Generated Num_seance: " + num); // print the generated number on the screen
        return num; // return the generated number to the caller (see https://docs.oracle.com/javase/tutorial/java/javaOO/returnvalue.html)
    }
}
