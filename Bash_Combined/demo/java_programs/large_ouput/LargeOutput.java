/**
 * Created by webert3 on 4/25/17.
 */

import java.util.concurrent.TimeUnit;

public class LargeOutput {
        public static void main(String[] args) {
            System.out.println("Going to write a lot of garbage to stdout in " +
                    "about 3 seconds... Press ctrl-c to kill the process!");

            int count = 3;
            while (count > 0) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.print(count+" ");
                    count--;
                } catch (InterruptedException e) {
                    System.exit(0);
                }
            }
            System.out.println();

            // Loop a bunch and write to stdout.
            for (int i = 0; i < 100000; i++) {
                System.out.printf("garbage ");
                if (i % 10000 == 0) {
                    System.out.println("\nhello");
                }
            }
            System.out.println("Okay I'm done!");
        }
}
