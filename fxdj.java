import android.media.AudioManager.AudioPlaybackCallback;
import j..util.Collection.-EL;
import j..util.Objects;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class fxdj extends AudioManager.AudioPlaybackCallback {
    final fxdm a;
    private volatile long b;

    public fxdj(fxdm fxdm0) {
        Objects.requireNonNull(fxdm0);
        this.a = fxdm0;
        super();
        this.b = 0L;
    }

    @Override  // android.media.AudioManager$AudioPlaybackCallback
    public final void onPlaybackConfigChanged(List list0) {
        fxdm fxdm0 = this.a;
        synchronized(fxdm0.c) {
            if(fxdm0.a()) {
                return;
            }
            long v1 = System.currentTimeMillis();
            if(v1 < this.b) {
                return;
            }
            this.b = v1;
            boolean z = Collection.-EL.stream(list0).filter(new fxdg()).anyMatch(new fxdh());
            if(z != fxdm0.d) {
                fxdm0.d = z;
                if(fxdm0.d) {
                    fxdm0.h = new fxou(2, 41);
                    fxdm0.g = 0L;
                    fxdm0.i.a();
                }
                else {
                    fxdm0.g = System.currentTimeMillis();
                    fxdf fxdf0 = new fxdf(fxdm0);
                    long v2 = huwd.c();
                    ((bbll)fxdm0.b).g(fxdf0, v2, TimeUnit.SECONDS);
                }
            }
            if(!Collection.-EL.stream(list0).anyMatch(new fxdi())) {
                if(fxdm0.f != 0L) {
                    if(fxdm0.e.a() == 15) {
                        fxdm0.e.f();
                    }
                    fxdm0.e.d(new fxdl(fxdm0.f, System.currentTimeMillis()));
                    bxh bxh0 = fxdm0.e;
                    int v3 = bxh0.b;
                    if(v3 == bxh0.c) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    ibuq.c(bxh0.a[v3]);
                    fxdm0.f = 0L;
                }
            }
            else if(fxdm0.f == 0L) {
                fxdm0.f = System.currentTimeMillis();
            }
        }
    }
}

