import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class GenerateUUID {
    private static final Logger LOGGER = LoggerFactory.getLogger(GenerateUUID.class);

    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString();
        LOGGER.info("UUID = {}", uuid);
    }
}
