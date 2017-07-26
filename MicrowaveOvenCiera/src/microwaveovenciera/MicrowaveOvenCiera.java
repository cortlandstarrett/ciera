package microwaveovenciera;

import ciera.application.XtumlApplication;
import ciera.components.Component;
import microwaveovenciera.components.microwaveoven.MicrowaveOven;

public class MicrowaveOvenCiera extends XtumlApplication {

    @Override
    public void setup() {
        // create threads
        createThreadPool( 1 );
        
        // create components
        Component[] components = {
                new MicrowaveOven( getThreadFromPool( 0 ) )
        };
        setComponents( components );
    }
    
    public static void main( String[] args ) {
        XtumlApplication.app = new MicrowaveOvenCiera();
        XtumlApplication.app.setup();
        XtumlApplication.app.initialize();
        XtumlApplication.app.start();
    }

}