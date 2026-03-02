import android.content.Context;
import java.io.IOException;
import java.net.InetAddress;
import java.util.concurrent.ScheduledExecutorService;

public final class aual {
    public final avjh a;
    public final auad b;
    public auaf c;
    public final aubc d;
    public int e;
    public int f;
    private final Context g;
    private final ScheduledExecutorService h;
    private final String i;
    private final String j;
    private final int k;
    private final boolean l;
    private final boolean m;
    private final atxp n;
    private final auad o;
    private final String p;
    private final auak q;

    public aual(Context context0, auad auad0, ScheduledExecutorService scheduledExecutorService0, String s, String s1, int v, boolean z, boolean z1, atxp atxp0, String s2) {
        this.g = context0;
        this.h = scheduledExecutorService0;
        this.i = s;
        this.j = s1;
        this.k = v;
        this.l = z;
        this.m = z1;
        this.n = atxp0;
        this.p = s2;
        this.b = auad0;
        this.a = new avjh("CastSocketConnector", s1);
        this.f = 1;
        this.o = new auai(this);
        auak auak0 = new auak(this);
        this.q = auak0;
        this.d = new aubc(context0, scheduledExecutorService0, s, s1, v, z, z1, atxp0, auak0);
    }

    public final void a(String s, auah auah0, boolean z) {
        String s1 = aurf.g(s);
        Integer integer0 = auah0.c;
        this.a.q("connect to %s with wakeupServicePort = %d, wakeupAllowed = %b", s1, integer0, Boolean.valueOf(z));
        aubc aubc0 = this.d;
        if(aubc0 != null && z && integer0 != null) {
            aubc0.a.n("connect to the wakeup socket with port %d", integer0);
            aubc0.e = 2;
            aubc0.d.s(s, auah0.a, integer0.intValue(), auah0.d);
        }
        this.c.s(s, auah0.a, auah0.b, auah0.d);
    }

    public final void b() {
        this.c.i();
        this.c();
    }

    public final void c() {
        aubc aubc0 = this.d;
        if(aubc0 != null) {
            auaf auaf0 = aubc0.d;
            if(!auaf0.p()) {
                aubc0.a.m("disconnect from the wakeup socket");
                auaf0.i();
            }
        }
    }

    final void d() {
        auaf auaf0 = new auaf(this.g, this.o, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
        this.c = auaf0;
        auaf0.i = this.p;
    }

    public final void e(int v) {
        this.f = 4;
        auad auad0 = this.b;
        if(auad0 != null) {
            this.a.n("Notify Cast socket connection failed with error = %d", Integer.valueOf(v));
            auad0.c(v);
        }
    }

    public final void f(int v) {
        this.f = 3;
        auaf auaf0 = this.c;
        if(auaf0 != null) {
            InetAddress inetAddress0 = auaf0.f;
            if(inetAddress0 != null) {
                String s = auaf0.g;
                int v1 = auaf0.h;
                this.a.n("Retry Cast socket connection with originalError = %d", Integer.valueOf(v));
                this.d();
                try {
                    this.c.s(s, inetAddress0, v1, this.c.j);
                }
                catch(IOException unused_ex) {
                    this.e(v);
                }
            }
        }
    }
}

