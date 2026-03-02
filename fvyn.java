import java.util.Locale;

public final class fvyn implements Runnable {
    public final fvyu a;

    public fvyn(fvyu fvyu0) {
        this.a = fvyu0;
    }

    @Override
    public final void run() {
        fvyu fvyu0 = this.a;
        synchronized(fvyu0.a) {
            if(fvyu0.f == 1) {
                fvyu0.g(2);
            }
            if(hutn.d()) {
                int v1 = fvyu0.f;
                if(v1 != 0) {
                    cnwr.a(fvyu0.b, "GNSS outage", System.currentTimeMillis(), "yuhany@google.com", String.format(Locale.ROOT, "indoorState: %d\nduration: %d", v1, ((long)(v1 == 2 ? hutn.b() : huum.c()))), null, cnwq.a);
                }
            }
            fvyu0.e = null;
        }
    }
}

