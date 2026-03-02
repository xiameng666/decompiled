import java.io.InputStream;
import java.nio.ByteBuffer;

public abstract class hfsl {
    private static volatile int a = 100;
    int b;
    int c;
    final int d;
    public int e;
    Object f;
    public static final int g;

    static {
    }

    public hfsl() {
        this.d = hfsl.a;
        this.e = 0x7FFFFFFF;
    }

    public abstract void A(int arg1);

    public abstract void B();

    public abstract void C(int arg1);

    public abstract boolean D();

    public abstract boolean E();

    public abstract boolean F(int arg1);

    @Deprecated
    public abstract boolean G(int arg1, CodedOutputStream arg2);

    public abstract byte[] H();

    public abstract byte[] I(int arg1);

    public abstract void J();

    public static int K(int v) {
        return v >>> 1 ^ -(v & 1);
    }

    public static int L(int v, InputStream inputStream0) {
        if((v & 0x80) == 0) {
            return v;
        }
        int v1 = v & 0x7F;
        int v2 = 7;
        while(v2 < 0x20) {
            int v3 = inputStream0.read();
            if(v3 == -1) {
                throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            v1 |= (v3 & 0x7F) << v2;
            if((v3 & 0x80) == 0) {
                return v1;
            }
            v2 += 7;
            continue;
        }
        while(v2 < 0x40) {
            int v4 = inputStream0.read();
            if(v4 == -1) {
                throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if((v4 & 0x80) == 0) {
                return v1;
            }
            v2 += 7;
            continue;
        }
        throw new hfur("CodedInputStream encountered a malformed varint.");
    }

    public static long M(long v) {
        return v >>> 1 ^ -(1L & v);
    }

    public static hfsl N(InputStream inputStream0) {
        return hfsl.Q(inputStream0, 0x1000);
    }

    public static hfsl O(ByteBuffer byteBuffer0) {
        return hfsl.R(byteBuffer0, false);
    }

    public static hfsl P(byte[] arr_b) {
        return hfsl.X(arr_b, arr_b.length);
    }

    public static hfsl Q(InputStream inputStream0, int v) {
        if(v > 0) {
            return inputStream0 == null ? hfsl.P(hfup.b) : new hfsj(inputStream0, v);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    static hfsl R(ByteBuffer byteBuffer0, boolean z) {
        if(byteBuffer0.hasArray()) {
            return hfsl.S(byteBuffer0.array(), byteBuffer0.arrayOffset() + byteBuffer0.position(), byteBuffer0.remaining(), z);
        }
        if(byteBuffer0.isDirect() && hfwy.a) {
            return new hfsk(byteBuffer0, z);
        }
        int v = byteBuffer0.remaining();
        byte[] arr_b = new byte[v];
        byteBuffer0.duplicate().get(arr_b);
        return hfsl.S(arr_b, 0, v, true);
    }

    static hfsl S(byte[] arr_b, int v, int v1, boolean z) {
        hfsl hfsl0 = new hfsh(arr_b, v, v1, z);
        try {
            ((hfsh)hfsl0).e(v1);
            return hfsl0;
        }
        catch(hfur hfur0) {
            throw new IllegalArgumentException(hfur0);
        }
    }

    public final void T() {
        if(this.b + this.c < this.d) {
            return;
        }
        throw new hfur("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public final void U() {
        if(this.c == 0) {
            this.z(0);
        }
    }

    public final void V() {
        do {
            int v = this.m();
            if(v == 0) {
                break;
            }
            this.T();
            ++this.c;
            boolean z = this.F(v);
            --this.c;
        }
        while(z);
    }

    public final void W(CodedOutputStream hfsq0) {
        do {
            int v = this.m();
            if(v == 0) {
                break;
            }
            this.T();
            ++this.c;
            boolean z = this.G(v, hfsq0);
            --this.c;
        }
        while(z);
    }

    public static hfsl X(byte[] arr_b, int v) {
        return hfsl.S(arr_b, 0, v, false);
    }

    public abstract byte a();

    public abstract double b();

    public abstract float c();

    public abstract int d();

    public abstract int e(int arg1);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract long p();

    public abstract long r();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract ByteString w();

    public abstract String x();

    public abstract String y();

    public abstract void z(int arg1);
}

