package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.*;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        AustralianDollar aus = new AustralianDollar();
        CanadianDollar can = new CanadianDollar();
        ChineseYR chi = new ChineseYR();
        Euro euro = new Euro();
        Franc fran = new Franc();
        Pound poun = new Pound();
        Ringgit ring = new Ringgit();
        Rupee rupe = new Rupee();
        SingaporeDollar sing = new SingaporeDollar();
        UniversalCurrency univ = new UniversalCurrency();
        USDollar usdo = new USDollar();
        Yen yen = new Yen();

        CurrencyType[] targetCurrencyType = {CurrencyType.AUSTRALIAN_DOLLAR, CurrencyType.CANADIAN_DOLLAR,
                CurrencyType.CHINESE_YR, CurrencyType.EURO, CurrencyType.FRANC, CurrencyType.POUND,
                CurrencyType.RINGGIT, CurrencyType.RUPEE, CurrencyType.SINGAPORE_DOLLAR,
                CurrencyType.UNIVERSAL_CURRENCY, CurrencyType.US_DOLLAR, CurrencyType.YEN};

        ConvertableCurrency[] sourceCurrencyType = {aus, can, chi, euro, fran, poun, ring, rupe, sing, univ, usdo, yen};

        System.out.println("Enter the currency you wish to convert to:" + "\n" + "0: AustralianDollar" + "\n"
                + "1: CanadianDollar" + "\n" + "2: ChineseYR" + "\n" + "3: Euro" + "\n" + "4: Franc" + "\n" + "5: Pound" +
                "\n" + "6: Ringgit" + "\n" + "7: Rupee" + "\n" + "8: SingaporeDollar" + "\n" + "9: UniversalCurrency" +
                "\n" + "10: USDollar" + "\n" + "11: Yen");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("Enter the currency you wish to convert from:" + "\n" + "0: AustralianDollar" + "\n"
                + "1: CanadianDollar" + "\n" + "2: ChineseYR" + "\n" + "3: Euro" + "\n" + "4: Franc" + "\n" + "5: Pound" +
                "\n" + "6: Ringgit" + "\n" + "7: Rupee" + "\n" + "8: SingaporeDollar" + "\n" + "9: UniversalCurrency" +
                "\n" + "10: USDollar" + "\n" + "11: Yen");
        int num2 = scanner.nextInt();

        System.out.println("How much of said currency do you wish to convert?");
        double num3 = scanner.nextDouble();


        System.out.println("Your converted total from " + sourceCurrencyType[num2] + " to " + targetCurrencyType[num] + " is: " + convert(num3, sourceCurrencyType[num2], targetCurrencyType[num]));


    }

    public static Double convert(Double amountOfBaseCurrency, ConvertableCurrency sourceCurrencyType, CurrencyType targetCurrencyType) {
        return sourceCurrencyType.convert(targetCurrencyType) * amountOfBaseCurrency;
    }


}
