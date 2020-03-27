package DigPow;

import java.util.Arrays;

public class DigPow{

  public static long digPow(int number, int powerSeriesStartIndex){
    int[][] powerSeries = extractPowerSeriesFromNumber(number, powerSeriesStartIndex);
    long powerSeriesTotal = sumPowerSeries(powerSeries);
    return findFactorPair(number, powerSeriesTotal);
  }

  private static int[][] extractPowerSeriesFromNumber(int number, int powerSeriesStartIndex){
    int numberOfDigitsInNumber = Integer.toString(number).length();
    int[][] powerSeries = new int[numberOfDigitsInNumber][2];
    int powerSeriesIndex = powerSeriesStartIndex;
    for(int i = 0; i < numberOfDigitsInNumber; i++){
      powerSeries[i][0] = (number / (int)Math.pow(10,(numberOfDigitsInNumber-i-1)))%10;
      powerSeries[i][1] = powerSeriesIndex;
      powerSeriesIndex++;
    }
    return powerSeries;
  }

  private static long sumPowerSeries(int[][] powerSeries){
    long powerSeriesTotal = 0;
    for(int i = 0; i < powerSeries.length; i++){
      powerSeriesTotal += Math.pow(powerSeries[i][0], powerSeries[i][1]);
    }
    return powerSeriesTotal;
  }

  private static int findFactorPair(int factor, long total){
    return (int)total % factor == 0 ? (int)total / factor : -1;
  }
}
