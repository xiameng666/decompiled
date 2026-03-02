import android.content.Context;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

abstract class augg {
    protected final avjh d;
    protected final Context e;
    protected final ScheduledExecutorService f;
    protected final atxp g;
    protected final aulm h;
    public boolean i;
    protected final ausg j;

    protected augg(Context context0, ScheduledExecutorService scheduledExecutorService0, atxp atxp0, String s, aulm aulm0, ausg ausg0) {
        this.d = new avjh("DeviceScanner", s);
        this.e = context0;
        this.f = scheduledExecutorService0;
        this.g = atxp0;
        this.h = aulm0;
        this.j = ausg0;
    }

    protected abstract void a(Set arg1, int arg2);

    protected abstract void b();

    protected abstract boolean d(Set arg1, int arg2);
}

