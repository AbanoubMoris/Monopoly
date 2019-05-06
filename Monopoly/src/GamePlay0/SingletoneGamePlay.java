
package GamePlay0;

import java.io.IOException;

public class SingletoneGamePlay {
    private static Gameplay singleInstance = null;
    
    private SingletoneGamePlay(){
        
    }
    public static Gameplay getInstance() throws IOException{

        if (singleInstance == null) 
            singleInstance = new Gameplay();
        return singleInstance;
    }
           
}
