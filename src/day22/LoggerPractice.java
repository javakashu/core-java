package day22;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerPractice {

    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
         logger.setLevel(Level.INFO);

        logger.severe(String.valueOf(2));
        logger.warning("This is warning");
        logger.info("This is info log");


    }
}
