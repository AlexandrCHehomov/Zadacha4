package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int loseWeightKg = 7;
        int loseWeightInDayInGr1 = 250;
        int loseWeightInDayInGr2 = 500;
        int loseWeightGr = loseWeightKg * 1000;
        int day1 = loseWeightGr / loseWeightInDayInGr1;
        int day2 = loseWeightGr / loseWeightInDayInGr2;
        System.out.println("Если спортсмен хочет сбросить " + loseWeightKg + " кг" + " и будет сбрасывать в день по " + loseWeightInDayInGr1 + " грамм, то ему понадобиться " + day1 + " дней");
        System.out.println("Если спортсмен хочет сбросить " + loseWeightKg + " кг" + " и будет сбрасывать в день по " + loseWeightInDayInGr2 + " грамм, то ему понадобиться " + day2
                + " дней");
    }
}
