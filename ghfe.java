import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class ghfe extends ghfg {
    private ByteBuffer a;

    public abstract void a(byte arg1);

    public void b(ByteBuffer byteBuffer0) {
        throw null;
    }

    protected void c(byte[] arr_b) {
        this.d(arr_b, 0, arr_b.length);
    }

    protected void d(byte[] arr_b, int v, int v1) {
        throw null;
    }

    @Override  // ghga
    public final void e(byte b) {
        this.a(b);
    }

    @Override  // ghfg
    public final void f(char c) {
        ByteBuffer byteBuffer0 = this.p();
        byteBuffer0.putChar(c);
        this.q(byteBuffer0, 2);
    }

    @Override  // ghfg
    public final void g(long v) {
        this.k(v);
    }

    @Override  // ghfg
    public final void h(ByteBuffer byteBuffer0) {
        this.b(byteBuffer0);
    }

    @Override  // ghfg
    public final void i(byte[] arr_b, int v, int v1) {
        gftb.p(v, v + v1, arr_b.length);
        this.d(arr_b, v, v1);
    }

    @Override  // ghfg
    public final void j(int v) {
        ByteBuffer byteBuffer0 = this.p();
        byteBuffer0.putInt(v);
        this.q(byteBuffer0, 4);
    }

    @Override  // ghfg
    public final void k(long v) {
        ByteBuffer byteBuffer0 = this.p();
        byteBuffer0.putLong(v);
        this.q(byteBuffer0, 8);
    }

    @Override  // ghfg
    public final void l(byte[] arr_b) {
        gftb.check(arr_b);
        this.c(arr_b);
    }

    private final ByteBuffer p() {
        if(this.a == null) {
            this.a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        }
        return this.a;
    }

    private final void q(ByteBuffer byteBuffer0, int v) {
        try {
            this.d(byteBuffer0.array(), 0, v);
        }
        finally {
            byteBuffer0.clear();
        }
    }
}

