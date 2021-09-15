import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class GenerateAlphanumericRandom {
    private static final Logger LOGGER = LoggerFactory.getLogger(GenerateAlphanumericRandom.class);

    public static void main(String[] args) {
        int length = 8;
        String generatedCode = new Random().ints((int) '0', (int) 'z' + 1)
                .filter(i -> (i <= (int) '9' || i >= (int) 'A') && (i <= (int) 'Z' || i >= (int) 'a'))
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        LOGGER.info("Code = " + generatedCode);
    }
}
