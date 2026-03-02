import j..util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class ccbx extends clci {
    final ccdr a;
    private final long b;
    private final gfsx c;
    private final byte[] d;

    public ccbx(ccdr ccdr0, long v, gfsx gfsx0) {
        Objects.requireNonNull(ccdr0);
        this.a = ccdr0;
        super();
        this.b = v;
        this.c = gfsx0;
        this.d = new byte[(v <= 0L || v >= ((long)ccdr0.a) ? ccdr0.a : ((int)v))];
    }

    @Override  // clci
    public final long a() {
        return this.b;
    }

    @Override  // clci
    public final gfsx b() {
        return this.c;
    }

    @Override  // clci
    public final void c(clch clch0, ByteBuffer byteBuffer0) {
        int v;
        int[] arr_v;
        boolean z = true;
        try {
            arr_v = new int[1];
            this.a.a();
            this.a.g(this.d, ((long)byteBuffer0.remaining()), arr_v);
            this.a.a();
            v = arr_v[0];
        }
        catch(ccbv ccbv0) {
            throw new IOException("failure to read request body", ccbv0);
        }
        if(v == -1) {
            if(this.b != -1L) {
                z = false;
            }
            clch0.a(z);
            return;
        }
        byteBuffer0.put(this.d, 0, v);
        this.a.d.addAndGet(((long)arr_v[0]));
        clch0.a(false);
    }

    @Override  // clci
    public final void close() {
    }

    @Override  // clci
    public final void d(clch clch0) {
        UnsupportedOperationException unsupportedOperationException0 = new UnsupportedOperationException("Rewind not supported!");
        clch0.a.c(unsupportedOperationException0);
    }
}

