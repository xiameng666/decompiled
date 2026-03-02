import java.util.Locale;

public final class fvyj implements Runnable {
    public final fvym a;

    public fvyj(fvym fvym0) {
        this.a = fvym0;
    }

    @Override
    public final void run() {
        fvym fvym0 = this.a;
        synchronized(fvym0.a) {
            if(fvym0.e == 1) {
                fvym0.c(2);
            }
            if(hutn.d()) {
                int v1 = fvym0.e;
                if(v1 != 0) {
                    cnwr.a(fvym0.b, "GNSS outage", System.currentTimeMillis(), "yuhany@google.com", String.format(Locale.ROOT, "indoorState: %d\nduration: %d", v1, ((long)(v1 == 2 ? hutn.b() : huum.c()))), null, cnwq.a);
                }
            }
            fvym0.d = null;
        }
    }
}

