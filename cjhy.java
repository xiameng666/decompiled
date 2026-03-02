import java.io.Closeable;

public final class cjhy implements Closeable {
    private static final cjhy a;
    private final boolean b;
    private final cjid c;

    static {
        cjhy.a = new cjhy(false, null);
    }

    private cjhy(boolean z, cjid cjid0) {
        this.b = z;
        this.c = cjid0;
    }

    public static cjhy a(boolean z, cjhz cjhz0) {
        if(z && cjhz0 != null && !Thread.currentThread().isInterrupted()) {
            cjid cjid0 = new cjid(cjhz0.a);
            synchronized(cjhz0.a.b) {
                cjhz0.a.c.add(cjid0);
            }
            cjhy cjhy0 = new cjhy(true, cjid0);
            try {
                cjid0.j();
                return cjhy0;
            }
            catch(InterruptedException unused_ex) {
                Thread.currentThread().interrupt();
                return cjhy.a;
            }
        }
        return cjhy.a;
    }

    @Override
    public final void close() {
        if(this.b) {
            cjid cjid0 = this.c;
            if(cjid0 != null && cjid0.g()) {
                cjid0.e();
            }
        }
    }
}

