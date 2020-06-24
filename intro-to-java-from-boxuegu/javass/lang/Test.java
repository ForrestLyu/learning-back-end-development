package javass.lang;

import java.lang.Math;

public class Test {
	
    public static void main(String[] args) {

        double thick = 0.1;
        double thickSum = 0.1;
        int height = 8844430;
        int counter = 0;

        // 这样书写, 混淆了典型的 2 倍和 2 阶的计算方式.
        // for ( ; (counter + 1) * thick < height; ++counter)

        while (thickSum < height) {

            ++counter;
            thickSum = thick * Math.pow(2, counter);
        }

        System.out.println("Execute: " + counter);
    } 
}
