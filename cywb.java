import android.media.AudioManager.AudioPlaybackCallback;
import java.util.List;

public final class cywb extends AudioManager.AudioPlaybackCallback {
    final cywc a;
    public static final int b;

    public cywb(cywc cywc0) {
        this.a = cywc0;
        super();
    }

    @Override  // android.media.AudioManager$AudioPlaybackCallback
    public final void onPlaybackConfigChanged(List list0) {
        ibuq.f(list0, "configs");
        cywa cywa0 = new cywa(this.a, list0);
        this.a.b.execute(cywa0);
    }
}

