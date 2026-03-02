import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class aubc {
    public final avjh a;
    public final String b;
    public final String c;
    public final auaf d;
    public int e;
    public final auak f;
    private final auad g;

    public aubc(Context context0, ScheduledExecutorService scheduledExecutorService0, String s, String s1, int v, boolean z, boolean z1, atxp atxp0, auak auak0) {
        this.a = new avjh("WakeupSocketProxy", s1);
        this.b = s;
        this.c = s1;
        this.f = auak0;
        this.e = 1;
        aubb aubb0 = new aubb(this);
        this.g = aubb0;
        this.d = new auaf(context0, aubb0, scheduledExecutorService0, s, s1, v, z, z1, atxp0);
    }

    public final void a(int v) {
        Integer integer0 = v;
        this.a.n("wakeup socket connection failed with error = %d", integer0);
        this.e = 4;
        aual aual0 = this.f.a;
        aual0.a.n("onWakeupSocketConnectionFailed with error = %d", integer0);
        if(aual0.f == 2) {
            aual0.e(aual0.e);
        }
    }
}

