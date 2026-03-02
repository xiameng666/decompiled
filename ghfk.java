import java.nio.ByteBuffer;
import java.nio.ByteOrder;

abstract class ghfk extends ghfg {
    private final ByteBuffer a;
    private final int b;
    private final int c;

    protected ghfk(int v, int v1) {
        gftb.checkTrue(v1 % v == 0);
        this.a = ByteBuffer.allocate(v1 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.b = v1;
        this.c = v;
    }

    protected abstract ghfy b();

    protected abstract void c(ByteBuffer arg1);

    protected void d(ByteBuffer byteBuffer0) {
        throw null;
    }

    @Override  // ghga
    public final void e(byte b) {
        this.a.put(b);
        this.q();
    }

    @Override  // ghfg
    public final void f(char c) {
        this.a.putChar(c);
        this.q();
    }

    @Override  // ghfg
    public final void g(long v) {
        this.k(v);
    }

    @Override  // ghfg
    public final void h(ByteBuffer byteBuffer0) {
        ByteOrder byteOrder0 = byteBuffer0.order();
        try {
            byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
            this.r(byteBuffer0);
        }
        finally {
            byteBuffer0.order(byteOrder0);
        }
    }

    @Override  // ghfg
    public final void i(byte[] arr_b, int v, int v1) {
        this.r(ByteBuffer.wrap(arr_b, v, v1).order(ByteOrder.LITTLE_ENDIAN));
    }

    @Override  // ghfg
    public final void j(int v) {
        this.a.putInt(v);
        this.q();
    }

    @Override  // ghfg
    public final void k(long v) {
        this.a.putLong(v);
        this.q();
    }

    private final void p() {
        ByteBuffer byteBuffer0 = this.a;
        byteBuffer0.flip();
        while(byteBuffer0.remaining() >= this.c) {
            this.c(byteBuffer0);
        }
        byteBuffer0.compact();
    }

    private final void q() {
        if(this.a.remaining() < 8) {
            this.p();
        }
    }

    private final void r(ByteBuffer byteBuffer0) {
        ByteBuffer byteBuffer1 = this.a;
        if(byteBuffer0.remaining() <= byteBuffer1.remaining()) {
            byteBuffer1.put(byteBuffer0);
            this.q();
            return;
        }
        int v = this.b - byteBuffer1.position();
        for(int v1 = 0; v1 < v; ++v1) {
            byteBuffer1.put(byteBuffer0.get());
        }
        this.p();
        while(byteBuffer0.remaining() >= this.c) {
            this.c(byteBuffer0);
        }
        byteBuffer1.put(byteBuffer0);
    }

    @Override  // ghga
    public final ghfy s() {
        this.p();
        ByteBuffer byteBuffer0 = this.a;
        byteBuffer0.flip();
        if(byteBuffer0.remaining() > 0) {
            this.d(byteBuffer0);
            byteBuffer0.position(byteBuffer0.limit());
        }
        return this.b();
    }
}

