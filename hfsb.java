import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

class hfsb extends hfsa {
    protected final byte[] a;
    private static final long serialVersionUID = 1L;

    public hfsb(byte[] arr_b) {
        arr_b.getClass();
        this.a = arr_b;
    }

    @Override  // ByteString
    public byte a(int v) {
        return this.a[v];
    }

    @Override  // ByteString
    public byte b(int v) {
        return this.a[v];
    }

    protected int c() {
        return 0;
    }

    @Override  // ByteString
    public int size() {
        return this.a.length;
    }

    @Override  // ByteString
    protected void e(byte[] arr_b, int v, int v1, int v2) {
        System.arraycopy(this.a, v, arr_b, v1, v2);
    }

    @Override  // ByteString
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof ByteString)) {
            return false;
        }
        if(this.size() != ((ByteString)object0).size()) {
            return false;
        }
        if(this.size() == 0) {
            return true;
        }
        if((object0 instanceof hfsb)) {
            int v = this.d;
            int v1 = ((hfsb)object0).d;
            return v == 0 || v1 == 0 || v == v1 ? this.g(((ByteString)(((hfsb)object0))), 0, this.size()) : false;
        }
        return object0.equals(this);
    }

    @Override  // hfsa
    public final boolean g(ByteString hfsf0, int v, int v1) {
        if(v1 > hfsf0.size()) {
            throw new IllegalArgumentException("Length too large: " + v1 + this.size());
        }
        int v2 = v + v1;
        if(v2 > hfsf0.size()) {
            throw new IllegalArgumentException("Ran off end of other: " + v + ", " + v1 + ", " + hfsf0.size());
        }
        if((hfsf0 instanceof hfsb)) {
            byte[] arr_b = this.a;
            byte[] arr_b1 = ((hfsb)hfsf0).a;
            int v3 = this.c() + v1;
            int v4 = this.c();
            for(int v5 = ((hfsb)hfsf0).c() + v; v4 < v3; ++v5) {
                if(arr_b[v4] != arr_b1[v5]) {
                    return false;
                }
                ++v4;
            }
            return true;
        }
        return hfsf0.j(v, v2).equals(this.j(0, v1));
    }

    @Override  // ByteString
    protected final int i(int v, int v1, int v2) {
        return hfup.c(v, this.a, this.c() + v1, v2);
    }

    @Override  // ByteString
    public final ByteString j(int v, int v1) {
        int v2 = hfsb.q(v, v1, this.size());
        return v2 == 0 ? ByteString.b : new hfrx(this.a, this.c() + v, v2);
    }

    @Override  // ByteString
    public final hfsl k() {
        int v = this.size();
        return hfsl.S(this.a, this.c(), v, true);
    }

    @Override  // ByteString
    public final InputStream newInput() {
        int v = this.size();
        return new ByteArrayInputStream(this.a, this.c(), v);
    }

    @Override  // ByteString
    protected final String m(Charset charset0) {
        int v = this.size();
        return new String(this.a, this.c(), v, charset0);
    }

    @Override  // ByteString
    public final ByteBuffer n() {
        int v = this.size();
        return ByteBuffer.wrap(this.a, this.c(), v).asReadOnlyBuffer();
    }

    @Override  // ByteString
    public final void o(hfrt hfrt0) {
        int v = this.size();
        hfrt0.b(this.a, this.c(), v);
    }

    @Override  // ByteString
    public final void p(OutputStream outputStream0) {
        outputStream0.write(((ByteString)this).toByteArray());
    }
}

