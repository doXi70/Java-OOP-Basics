package p03_WildFarm;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(1.256));
    }
}
