import java.util.Random;

class Secretaire extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (SchoolSimulation.lock) {
                SchoolSimulation.Num_seance = Avoir_Num();
            }
        }
    }

    int Avoir_Num() {
        Random rand = new Random();
        int num = rand.nextInt(3) + 1;
        System.out.println("Secretaire: Avoir_Num - Generated Num_seance: " + num);
        return num;
    }
}
