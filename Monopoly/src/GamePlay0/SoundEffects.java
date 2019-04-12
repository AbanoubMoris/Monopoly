
package GamePlay0;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class SoundEffects {
    public static void PlaySound(String Path) throws IOException{

            InputStream in = new FileInputStream(Path);
            AudioStream as = new AudioStream(in);
            AudioPlayer.player.start(as);
    }
}
