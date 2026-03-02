import android.media.AudioManager.AudioPlaybackCallback;
import android.media.AudioManager;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public final class fxdm extends fxov implements fxgv {
    public static final bboh a;
    public final ScheduledExecutorService b;
    public final Object c;
    public volatile boolean d;
    public bxh e;
    public long f;
    public long g;
    public fxou h;
    private final AudioManager j;
    private final AudioManager.AudioPlaybackCallback k;

    static {
        fxdm.a = bboh.c("EQMon", bbcu.g, "AudRCL");
    }

    public fxdm(fxnw fxnw0, AudioManager audioManager0, ScheduledExecutorService scheduledExecutorService0) {
        super(fxnw0);
        this.c = new Object();
        this.h = fxou.b;
        this.j = audioManager0;
        this.b = scheduledExecutorService0;
        this.k = new fxdj(this);
    }

    public final boolean a() {
        return this.e == null;
    }

    @Override  // fxov
    public final fxou b() {
        synchronized(this.c) {
        }
        return this.h;
    }

    @Override  // fxgv
    public final boolean c(long v) {
        synchronized(this.c) {
            if(this.a()) {
                return true;
            }
            if(Long.compare(this.f, 0L) != 0 && v >= this.f) {
                return false;
            }
            for(int v2 = 0; v2 < this.e.a(); ++v2) {
                fxdl fxdl0 = (fxdl)this.e.b(v2);
                if(v >= fxdl0.a && v <= fxdl0.b) {
                    return false;
                }
                if(v > fxdl0.b) {
                    return true;
                }
            }
        }
        return true;
    }

    @Override  // fxov
    public final void f() {
        synchronized(this) {
            synchronized(this.c) {
                this.e = new bxh(15);
                this.h = fxou.b;
            }
            AudioManager audioManager0 = this.j;
            if(audioManager0 != null) {
                audioManager0.registerAudioPlaybackCallback(this.k, null);
                List list0 = audioManager0.getActivePlaybackConfigurations();
                this.k.onPlaybackConfigChanged(list0);
            }
        }
    }

    @Override  // fxov
    public final void g() {
        synchronized(this) {
            AudioManager audioManager0 = this.j;
            if(audioManager0 != null) {
                audioManager0.unregisterAudioPlaybackCallback(this.k);
            }
            synchronized(this.c) {
                this.e = null;
                this.f = 0L;
            }
        }
    }
}

