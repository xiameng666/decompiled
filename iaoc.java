import java.io.InputStream;

public final class iaoc {
    private final ianx a;
    private final Object b;
    private volatile byte[] c;

    public iaoc(ianx ianx0, Object object0) {
        this.a = ianx0;
        this.b = object0;
    }

    public static ianx a(iaoa iaoa0) {
        return ianx.class.isInstance(iaoa0.c) ? ((ianx)ianx.class.cast(iaoa0.c)) : null;
    }

    public final InputStream b() {
        return this.a.a(this.b);
    }

    final byte[] c() {
        if(this.c == null) {
            synchronized(this) {
                if(this.c == null) {
                    this.c = iaof_metadata.l(this.b());
                }
            }
            return this.c;
        }
        return this.c;
    }
}

