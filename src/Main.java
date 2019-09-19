public class Main {
    public static void main(String[] args) {
        int totalMoneySpent = 1_475_55;
        int currentPurchase = 2_345_45;
        totalMoneySpent = totalMoneySpent + currentPurchase;
        int bonusesPerMoneySpent = 0;
        int sumBlueLevel = 15_000_00;
        int sumGoldLevel = 150_000_00;
        int amountBonusesBlueLevel = 50;
        int amountBonusesSilverLevel = 70;
        int amountBonusesGoldLevel = 100;
        if (totalMoneySpent <= sumBlueLevel) {
            bonusesPerMoneySpent = amountBonusesBlueLevel;
        } else if (totalMoneySpent > sumBlueLevel && totalMoneySpent <= sumGoldLevel) {
            bonusesPerMoneySpent = amountBonusesSilverLevel;
        } else if (totalMoneySpent > sumGoldLevel) {
            bonusesPerMoneySpent = amountBonusesGoldLevel;
        }
        int amountForBonus = 1_000_00;
        int bonusesPerCurrentPurchase = currentPurchase / amountForBonus * bonusesPerMoneySpent;
        int bonusesPerTotalMoneySpent = totalMoneySpent / amountForBonus * bonusesPerMoneySpent;
        System.out.println("За текущую покупку Вам начислено бонусов: " + bonusesPerCurrentPurchase);
        System.out.println("Всего начислено бонусов: " + bonusesPerTotalMoneySpent);
    }
}

