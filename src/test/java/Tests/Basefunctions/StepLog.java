package Tests.Basefunctions;

import java.util.logging.Logger;

public class StepLog extends Step{
    void write(Logger tolog,String text){
        tolog.info(text);
    }
}
