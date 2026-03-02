import android.media.ToneGenerator;
import android.os.SystemClock;

public final class cqqe extends Thread {
    public volatile boolean a;

    public cqqe() {
        this.a = false;
    }

    @Override
    public final void run() {
        ToneGenerator toneGenerator0 = new ToneGenerator(4, 100);
        while(!this.a) {
            toneGenerator0.startTone(25);
            SystemClock.sleep(2000L);
        }
        toneGenerator0.stopTone();
    }
}

