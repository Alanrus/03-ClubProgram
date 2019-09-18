public class Main {
    public static void main(String[] args) {
        double totalMoneySpent = 13100.15;
        double currentPurchase = 2000;
        totalMoneySpent = totalMoneySpent + currentPurchase;
        int bonusesPerMoneySpent = 0;
        if (totalMoneySpent <= 15_000) {
            bonusesPerMoneySpent = 50;
        } else if (totalMoneySpent > 15_000 && totalMoneySpent <= 150_000) {
            bonusesPerMoneySpent = 70;
        } else if (totalMoneySpent > 150_000) {
            bonusesPerMoneySpent = 100;
        }
        int amountForBonus = 1000;
        int bonusesPerCurrentPurchase = (int) currentPurchase / amountForBonus * bonusesPerMoneySpent;
        int bonusesPerTotalMoneySpent = (int) totalMoneySpent / amountForBonus * bonusesPerMoneySpent;
        System.out.println("За текущую покупку Вам начислено бонусов: " + bonusesPerCurrentPurchase);
        System.out.println("Всего начислено бонусов: " + bonusesPerTotalMoneySpent);
    }
}

