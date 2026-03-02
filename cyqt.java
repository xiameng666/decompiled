import android.media.AudioManager.MuteAwaitConnectionCallback;
import android.media.AudioManager;
import java.util.concurrent.Executor;

public final class cyqt {
    public final AudioManager a;
    public AudioManager.MuteAwaitConnectionCallback b;
    public final Executor c;

    public cyqt(AudioManager audioManager0) {
        this.c = new bblp(1, 10);
        this.a = audioManager0;
    }

    public final void a() {
        AudioManager.MuteAwaitConnectionCallback audioManager$MuteAwaitConnectionCallback0 = this.b;
        if(audioManager$MuteAwaitConnectionCallback0 == null) {
            ((ggtj)cyjh.a.d().ar(0x1F6F)).x("AudioManagerWrapper: unregisterMuteAwaitConnectionCallback called but callback is not registered!");
            return;
        }
        this.a.unregisterMuteAwaitConnectionCallback(audioManager$MuteAwaitConnectionCallback0);
        this.b = null;
    }
}

