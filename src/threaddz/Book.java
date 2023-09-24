package threaddz;

import java.util.Random;

import static threaddz.Library.NAMES;

public class Book{
        public static String getName() {
            Random random = new Random();
            return NAMES[random.nextInt(5)];
        }
}
