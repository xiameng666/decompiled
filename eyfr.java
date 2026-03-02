import com.google.android.gms.trustagent.activeunlock.common.data.communication.ConnectionInfo;
import j..time.Duration;

public final class eyfr {
    public final eyfl a;
    public final ConnectionInfo b;
    public final exjx c;
    public final gfug d;
    public Double e;
    public Duration f;
    private final gfuv g;

    public eyfr(eyfl eyfl0, gfuv gfuv0, ConnectionInfo connectionInfo0, exjx exjx0) {
        ibuq.f(exjx0, "rangingMethod");
        super();
        this.a = eyfl0;
        this.g = gfuv0;
        this.b = connectionInfo0;
        this.c = exjx0;
        this.d = gfug.c(gfuv0);
    }

    public final void a(double f) {
        gfug gfug0 = this.d;
        if(!gfug0.a) {
            return;
        }
        gfug0.g();
        this.e = f;
        this.f = gfug0.d();
    }

    public final void b(int v, double f) {
        gzyj gzyj0 = this.c.e();
        eyfl.g(this.a, gzyh.c, f, gzyj0, this.b, null, Integer.valueOf(v), 16);
    }
}

