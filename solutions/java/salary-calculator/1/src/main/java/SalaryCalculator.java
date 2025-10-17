public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double x = daysSkipped;
        return (x>= 5) ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
       int x = productsSold;
        return (x>=20) ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        int x = productsSold;
           return (x>=20) ? x * 13 : x * 10;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
       double baseSalary = 1000;
        double salary = 1000 * salaryMultiplier(daysSkipped);
        double total = salary + bonusForProductsSold(productsSold);
        return (total > 2000) ? 2000 : total;
    } 
}
