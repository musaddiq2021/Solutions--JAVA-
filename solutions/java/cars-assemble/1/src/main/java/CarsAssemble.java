public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double x = speed;
        double baseRate = 221;
        double failureRate = 0.0; 
        double solved = baseRate * speed;

        if (x >= 1 && x <= 4) {
            failureRate = 0.0;
        } else if (x >= 5 && x <= 8) {
            failureRate = 0.1;
        } else if (x == 9) {
            failureRate = 0.2;
        } else if (x == 10) {
            failureRate = 0.23;
        }

        double finalProduction = solved - (solved * failureRate);
        return finalProduction;
    }

    public int workingItemsPerMinute(int speed){
        double x = speed;
        double baseRate = 221;
        double failureRate = 0.0; 
        double solved = baseRate * speed;

        if (x >= 1 && x <= 4) {
            failureRate = 0.0;
        } else if (x >= 5 && x <= 8) {
            failureRate = 0.1;
        } else if (x == 9) {
            failureRate = 0.2;
        } else if (x == 10) {
            failureRate = 0.23;
        }

        double finalProduction = solved - (solved * failureRate);
        return (int)(finalProduction / 60.0);
    }
}

