import java.util.Random;

public class Lab6s3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int totalDays = 1000000;

        String[] weatherOptions = new String[100];
        for (int i = 0; i < 40; i++) {
            weatherOptions[i] = "Sunny";
        }
        for (int i = 40; i < 70; i++) {
            weatherOptions[i] = "Cloudy";
        }
        for (int i = 70; i < 90; i++) {
            weatherOptions[i] = "Rainy";
        }
        for (int i = 90; i < 100; i++) {
            weatherOptions[i] = "Stormy";
        }

        int sunnyCount = 0;
        int cloudyCount = 0;
        int rainyCount = 0;
        int stormyCount = 0;

        for (int i = 0; i < totalDays; i++) {
            int pick = rand.nextInt(100);
            String today = weatherOptions[pick];

            if (today.equals("Sunny")) {
                sunnyCount++;
            } else if (today.equals("Cloudy")) {
                cloudyCount++;
            } else if (today.equals("Rainy")) {
                rainyCount++;
            } else {
                stormyCount++;
            }
        }

        System.out.println("Weather simulation for " + totalDays + " days:");
        System.out.printf("Sunny:  %.2f%%\n", sunnyCount * 100.0 / totalDays);
        System.out.printf("Cloudy: %.2f%%\n", cloudyCount * 100.0 / totalDays);
        System.out.printf("Rainy:  %.2f%%\n", rainyCount * 100.0 / totalDays);
        System.out.printf("Stormy: %.2f%%\n", stormyCount * 100.0 / totalDays);

    }
}
