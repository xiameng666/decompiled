import android.content.Context;
import java.util.concurrent.Executor;

public final class gylf {
    public final gyjn a;
    public final Context b;
    private final gyey c;
    private final gxuf d;
    private final Executor e;

    public gylf(Context context0, Executor executor0) {
        this.b = context0;
        this.a = (gyjn)cusq.c(context0, gyjn.class);
        this.d = (gxuf)cusq.c(context0, gxuf.class);
        this.e = executor0;
        this.c = (gyey)cusq.e(context0, gyey.class);
        this.c(null);
    }

    public final gykk a(gyjd gyjd0) {
        return new gyjj(gyjd0, this.d);
    }

    public final gykk b(gykt gykt0) {
        return new gykz(gykt0, this.d, this.e);
    }

    public final void c(gykr gykr0) {
        gyey gyey0 = this.c;
        if(gyey0 != null) {
            boolean z = !gyey0.l(gykr0);
        }
        else if(gykr0 != null) {
            gykr0.b();
        }
    }
}

