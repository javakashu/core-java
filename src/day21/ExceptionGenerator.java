package day21;

import java.io.IOException;

public class ExceptionGenerator {

    public void runTimeExceptionFunc() {

       throw new RuntimeException("This is a run time exception");
    }

    public void ioExceptionFunc() throws IOException {

        throw new IOException("This is IO Exception");

    }
}



