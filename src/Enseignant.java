class Enseignant extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                synchronized (SchoolSimulation.lock) {
                    if (SchoolSimulation.Num_seance != -1) {
                        Avoir_Seance(SchoolSimulation.Num_seance);
                        break;
                    } else {
                        // Repeat the test
                        continue;
                    }
                }
            }
        }

        void Avoir_Seance(int num_seance) {
            switch (num_seance) {
                case 1:
                    System.out.println("Enseignant: Avoir_Seance - seance Cours");
                    SchoolSimulation.Seance_type = "seance Cours";
                    break;
                case 2:
                    System.out.println("Enseignant: Avoir_Seance - seance: TD");
                    SchoolSimulation.Seance_type = "seance: TD";
                    break;
                case 3:
                    System.out.println("Enseignant: Avoir_Seance - seance: TP");
                    SchoolSimulation.Seance_type = "seance: TP";
                    break;
                default:
                    System.out.println("Enseignant: Avoir_Seance - Invalid seance number");
            }
        }
    }