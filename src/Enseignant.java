
// class Enseignant extends Thread to simulate the teacher thread
class Enseignant extends Thread {
        // Override the run method inherited from Thread
        @Override
        // This method will be called when the thread is started (see SchoolSimulation.java)
        public void run() {
            for (int i = 0; i < 5; i++) {
                synchronized (SchoolSimulation.lock) { // synchronize threads on the lock object (see SchoolSimulation.java)
                    if (SchoolSimulation.Num_seance != -1) { // if the current seance is not -1 (not empty)
                        Avoir_Seance(SchoolSimulation.Num_seance); // print the type of the current seance on the screen (see below)
                        break; // exit the loop
                    } else {
                        // Repeat the test
                        continue; // continue the loop
                    }
                }
            }
        }

        // Print the type of the current seance on the screen
        void Avoir_Seance(int num_seance) { // num_seance: number of the current seance
            switch (num_seance) { 
                // if num_seance is 1 print "seance Cours"
                case 1:
                    System.out.println("Enseignant: Avoir_Seance - seance Cours");
                    SchoolSimulation.Seance_type = "seance Cours";
                    break; // exit the switch
                // if num_seance is 2 print "seance TD"
                case 2:
                    System.out.println("Enseignant: Avoir_Seance - seance: TD");
                    SchoolSimulation.Seance_type = "seance: TD";
                    break;
                // if num_seance is 3 print "seance TP"
                case 3:
                    System.out.println("Enseignant: Avoir_Seance - seance: TP");
                    SchoolSimulation.Seance_type = "seance: TP";
                    break;
                // else print "Enseignant: Avoir_Seance - Invalid seance number"
                default:
                    System.out.println("Enseignant: Avoir_Seance - Invalid seance number");
            }
        }
    }