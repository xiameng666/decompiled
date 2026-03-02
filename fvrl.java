import java.io.Closeable;
import java.io.IOException;

public final class fvrl {
    final long a;
    public final fvrp b;
    public final fvrp c;
    public final fvrp d;
    public final fwyk e;

    public fvrl(fwyk fwyk0, long v, long v1) {
        fvrp fvrp0 = new fvrp("bandwidth", -1L, new fvro(76800L, 0x3200L, 14400000L), v, v1);
        fvrp fvrp1 = new fvrp("sensor-gps", -1L, new fvro(1260000L, 1260000L, 86400000L), v, v1);
        fvrp fvrp2 = new fvrp("burst-gps", 0L, (huqp.a.b().e() ? new fvro(huqp.a.b().c(), huqp.a.b().b(), huqp.a.b().a()) : new fvro(120000L, 120000L, 86400000L)), v, v1);
        super();
        this.e = fwyk0;
        this.a = v;
        this.b = fvrp0;
        this.c = fvrp1;
        this.d = fvrp2;
        this.a(v1);
    }

    public final void a(long v) {
        synchronized(this) {
            this.b.f(v);
            this.c.f(v);
            this.d.f(v);
        }
    }

    public final void b(long v) {
        synchronized(this) {
            this.e.m().execute(new fvrk(this, v));
        }
    }

    public static final void c(Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
            }
            catch(IOException unused_ex) {
            }
        }
    }
}

