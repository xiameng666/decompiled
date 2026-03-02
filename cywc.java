import android.media.AudioAttributes;
import android.media.AudioManager.AudioPlaybackCallback;
import android.media.AudioManager;
import android.media.AudioPlaybackConfiguration;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.Executor;

public final class cywc implements cyga {
    public final AudioManager a;
    public final Executor b;
    public boolean c;
    public final cyws d;
    private final AudioManager.AudioPlaybackCallback e;

    public cywc(AudioManager audioManager0, cyws cyws0, Executor executor0) {
        ibuq.f(audioManager0, "audioManager");
        ibuq.f(cyws0, "activePlaybackChangeListener");
        super();
        this.a = audioManager0;
        this.d = cyws0;
        this.b = executor0;
        this.e = new cywb(this);
    }

    public static final boolean a(List list0) {
        for(Object object0: list0) {
            AudioPlaybackConfiguration audioPlaybackConfiguration0 = (AudioPlaybackConfiguration)object0;
            if(audioPlaybackConfiguration0 != null && audioPlaybackConfiguration0.getPlayerState() == 2 && !audioPlaybackConfiguration0.isMuted()) {
                hfuo hfuo0 = hvpg.a.aY().fc().b;
                AudioAttributes audioAttributes0 = audioPlaybackConfiguration0.getAudioAttributes();
                if(hfuo0.contains(String.valueOf((audioAttributes0 == null ? null : audioAttributes0.getUsage())))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // cyga
    public final void f() {
        this.a.unregisterAudioPlaybackCallback(this.e);
    }

    @Override  // cyga
    public final void g(PrintWriter printWriter0) {
    }

    @Override  // cyga
    public final void h() {
        this.a.registerAudioPlaybackCallback(this.e, null);
        cyvz cyvz0 = new cyvz(this);
        this.b.execute(cyvz0);
    }
}

