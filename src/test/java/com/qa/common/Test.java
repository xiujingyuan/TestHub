package com.qa.common;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/30
 * Time: 下午3:04
 */
public class Test {
    public static void main(String[] args) {
        double invest = 10000;
        double yearRate = 0.12;
        double monthRate = yearRate / 12;
        int totalMonth = 3;


        DecimalFormat decimalFormat = new DecimalFormat("0.00");

// 每月本金 = 本金×月利率×(1+月利率)^(还款月序号-1)÷((1+月利率)^还款月数-1)
        double sumCapital = 0;
        for (int i = 1; i < totalMonth + 1; i++) {
            BigDecimal n = new BigDecimal(invest)
                    .multiply(new BigDecimal(monthRate * Math.pow(1 + monthRate, i - 1)))
                    .divide(new BigDecimal(Math.pow(1 + monthRate, totalMonth) - 1), 2, BigDecimal.ROUND_DOWN);
            double monthCapital = n.doubleValue();
            sumCapital += monthCapital;

            System.out.println("第" + i + "月本金： " + monthCapital);
        }

// 每月利息  = 剩余本金 x 贷款月利率
        double monthInterest = 0;
        double capital = invest;
        double sumAvg = 0;
        double tmpCapital = 0;
        for (int i = 1; i < totalMonth + 1; i++) {
            capital = capital - tmpCapital;
            monthInterest = capital * monthRate;
            BigDecimal s = new BigDecimal(invest)
                    .multiply(new BigDecimal(monthRate * (Math.pow((1 + monthRate), i - 1))))
                    .divide(new BigDecimal(Math.pow(1 + monthRate, totalMonth) - 1), 2, BigDecimal.ROUND_DOWN);
            tmpCapital = s.doubleValue();

            System.out.println("第" + i + "月利息： " + Double.parseDouble(decimalFormat.format(monthInterest)));
            sumAvg += monthInterest;
        }

        System.out.println("总本金： " + Double.parseDouble(decimalFormat.format(sumCapital)));
        System.out.println("总利息： " + Double.parseDouble(decimalFormat.format(sumAvg)));

    }
}
