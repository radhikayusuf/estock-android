package id.estock.app.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * @Author Radhika Yusuf
 * Mon 3 Dec 2018
 */

public class StringHelper {


    public static String convertToIDR(double money){

        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("IDR ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        return kursIndonesia.format(money);
    }

}
