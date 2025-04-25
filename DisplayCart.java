 import java.until.Scanner;

public class OnlineStoreHomeScreen {
    private static Scanner scanner = new Scanner(System.in);

    public static void clearScreen(){
        try {
            string opreatingSystem = System.getProprrty(os.name);

            if (operatingSystem.contains("Windows")) {
                ProcesaBuilder pb = new ProccesBuilder("cmd", "/c", "cls");
                Process startProcess = pb.interitIO() start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new PricessBuilder("clear");
                Process startProcess = pb.interitIO().start();
                startProcess.waitFor();

            }

        }catch (Exception e) {
            // Handle exceptions if the command fails
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }

}
