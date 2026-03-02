import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

final class hfrx extends hfsb {
    private final int e;
    private final int f;
    private static final long serialVersionUID = 1L;

    public hfrx(byte[] arr_b, int v, int v1) {
        super(arr_b);
        hfrx.q(v, v + v1, arr_b.length);
        this.e = v;
        this.f = v1;
    }

    @Override  // hfsb
    public final byte a(int v) {
        hfrx.I(v, this.f);
        return this.a[this.e + v];
    }

    @Override  // hfsb
    public final byte b(int v) {
        return this.a[this.e + v];
    }

    @Override  // hfsb
    protected final int c() {
        return this.e;
    }

    @Override  // hfsb
    public final int size() {
        return this.f;
    }

    @Override  // hfsb
    protected final void e(byte[] arr_b, int v, int v1, int v2) {
        System.arraycopy(this.a, this.e + v, arr_b, v1, v2);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    Object writeReplace() {
        return new hfsb(((ByteString)this).toByteArray());
    }
}

