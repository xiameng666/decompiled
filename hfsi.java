import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

final class hfsi extends hfsl {
    private final Iterable a;
    private final Iterator h;
    private ByteBuffer i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private long q;
    private long r;
    private long s;
    private long t;

    public hfsi(Iterable iterable0, int v) {
        this.m = 0x7FFFFFFF;
        this.k = v;
        this.a = iterable0;
        this.h = iterable0.iterator();
        this.o = 0;
        this.p = 0;
        if(v == 0) {
            this.i = hfup.c;
            this.q = 0L;
            this.r = 0L;
            this.t = 0L;
            this.s = 0L;
            return;
        }
        this.ad();
    }

    @Override  // hfsl
    public final void A(int v) {
        this.m = v;
        this.ac();
    }

    @Override  // hfsl
    public final void B() {
        this.p = (int)(((long)this.o) + this.q - this.r);
    }

    @Override  // hfsl
    public final void C(int v) {
        if(v < 0 || ((long)v) > ((long)(this.k - this.o)) - this.q + this.r) {
            throw v >= 0 ? new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.") : new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        while(v > 0) {
            if(this.Z() == 0L) {
                this.ab();
            }
            int v1 = Math.min(v, ((int)this.Z()));
            v -= v1;
            this.q += (long)v1;
        }
    }

    @Override  // hfsl
    public final boolean D() {
        return ((long)this.o) + this.q - this.r == ((long)this.k);
    }

    @Override  // hfsl
    public final boolean E() {
        return this.r() != 0L;
    }

    @Override  // hfsl
    public final boolean F(int v) {
        switch(v & 7) {
            case 0: {
                for(int v1 = 0; v1 < 10; ++v1) {
                    if(this.a() >= 0) {
                        return true;
                    }
                }
                throw new hfur("CodedInputStream encountered a malformed varint.");
            }
            case 1: {
                this.C(8);
                return true;
            }
            default: {
                if((v & 7) != 2) {
                    switch(v & 7) {
                        case 3: {
                            this.V();
                            this.z(hfxg.c(v >>> 3, 4));
                            return true;
                        }
                        case 4: {
                            this.U();
                            return false;
                        }
                        default: {
                            if((v & 7) != 5) {
                                throw new hfuq("Protocol message tag had invalid wire type.");
                            }
                            this.C(4);
                            return true;
                        }
                    }
                }
                this.C(this.j());
                return true;
            }
        }
    }

    @Override  // hfsl
    public final boolean G(int v, CodedOutputStream hfsq0) {
        switch(v & 7) {
            case 0: {
                long v3 = this.r();
                hfsq0.writeRawVarint32(v);
                hfsq0.writeRawVarint64(v3);
                return true;
            }
            case 1: {
                long v4 = this.q();
                hfsq0.writeRawVarint32(v);
                hfsq0.s(v4);
                return true;
            }
            default: {
                if((v & 7) != 2) {
                    switch(v & 7) {
                        case 3: {
                            hfsq0.writeRawVarint32(v);
                            this.W(hfsq0);
                            int v2 = hfxg.c(v >>> 3, 4);
                            this.z(v2);
                            hfsq0.writeRawVarint32(v2);
                            return true;
                        }
                        case 4: {
                            this.U();
                            return false;
                        }
                        default: {
                            if((v & 7) != 5) {
                                throw new hfuq("Protocol message tag had invalid wire type.");
                            }
                            int v1 = this.i();
                            hfsq0.writeRawVarint32(v);
                            hfsq0.q(v1);
                            return true;
                        }
                    }
                }
                ByteString hfsf0 = this.w();
                hfsq0.writeRawVarint32(v);
                hfsq0.o(hfsf0);
                return true;
            }
        }
    }

    @Override  // hfsl
    public final byte[] H() {
        return this.I(this.j());
    }

    @Override  // hfsl
    public final byte[] I(int v) {
        if(v >= 0 && ((long)v) <= this.Z()) {
            byte[] arr_b = new byte[v];
            hfwy.k(this.q, arr_b, 0L, v);
            this.q += (long)v;
            return arr_b;
        }
        if(v >= 0 && v <= this.Y()) {
            byte[] arr_b1 = new byte[v];
            this.ae(arr_b1, v);
            return arr_b1;
        }
        if(v > 0) {
            throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if(v == 0) {
            return hfup.b;
        }
        throw new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override  // hfsl
    public final void J() {
        this.j = true;
    }

    private final int Y() {
        return (int)(((long)(this.k - this.o)) - this.q + this.r);
    }

    private final long Z() {
        return this.t - this.q;
    }

    @Override  // hfsl
    public final byte a() {
        if(this.Z() == 0L) {
            this.ab();
        }
        long v = this.q;
        this.q = 1L + v;
        return hfwy.a(v);
    }

    private final ByteBuffer aa(int v, int v1) {
        ByteBuffer byteBuffer1;
        ByteBuffer byteBuffer0;
        int v4;
        int v3;
        try {
            v3 = this.i.position();
            v4 = this.i.limit();
            byteBuffer0 = this.i;
            byteBuffer0.position(v);
            byteBuffer0.limit(v1);
            byteBuffer1 = this.i.slice();
        }
        catch(IllegalArgumentException unused_ex) {
            throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        finally {
            byteBuffer0.position(v3);
            byteBuffer0.limit(v4);
        }
        return byteBuffer1;
    }

    private final void ab() {
        if(!this.h.hasNext()) {
            throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.ad();
    }

    private final void ac() {
        int v = this.k + this.l;
        this.k = v;
        int v1 = v - this.p;
        int v2 = this.m;
        if(v1 > v2) {
            int v3 = v1 - v2;
            this.l = v3;
            this.k = v - v3;
            return;
        }
        this.l = 0;
    }

    private final void ad() {
        Object object0 = this.h.next();
        ByteBuffer byteBuffer0 = (ByteBuffer)object0;
        this.i = byteBuffer0;
        this.o += (int)(this.q - this.r);
        long v = (long)byteBuffer0.position();
        this.q = v;
        this.r = v;
        this.t = (long)this.i.limit();
        long v1 = hfwy.e(this.i);
        this.s = v1;
        this.q += v1;
        this.r += v1;
        this.t += v1;
    }

    private final void ae(byte[] arr_b, int v) {
        if(v <= this.Y()) {
            int v1 = v;
            while(v1 > 0) {
                if(this.Z() == 0L) {
                    this.ab();
                }
                int v2 = Math.min(v1, ((int)this.Z()));
                hfwy.k(this.q, arr_b, v - v1, v2);
                v1 -= v2;
                this.q += (long)v2;
            }
            return;
        }
        if(v <= 0) {
            return;
        }
        throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override  // hfsl
    public final double b() {
        return Double.longBitsToDouble(this.q());
    }

    @Override  // hfsl
    public final float c() {
        return Float.intBitsToFloat(this.i());
    }

    @Override  // hfsl
    public final int d() {
        return (int)(((long)(this.o - this.p)) + this.q - this.r);
    }

    @Override  // hfsl
    public final int e(int v) {
        if(v < 0) {
            throw new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int v1 = v + this.d();
        int v2 = this.m;
        if(v1 > v2) {
            throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.m = v1;
        this.ac();
        return v2;
    }

    @Override  // hfsl
    public final int f() {
        return this.j();
    }

    @Override  // hfsl
    public final int g() {
        return this.i();
    }

    @Override  // hfsl
    public final int h() {
        return this.j();
    }

    public final int i() {
        if(this.Z() >= 4L) {
            long v = this.q;
            this.q = 4L + v;
            return hfwy.a(v) & 0xFF | (hfwy.a(1L + v) & 0xFF) << 8 | (hfwy.a(2L + v) & 0xFF) << 16 | (hfwy.a(v + 3L) & 0xFF) << 24;
        }
        int v1 = this.a() & 0xFF;
        int v2 = (this.a() & 0xFF) << 8;
        int v3 = (this.a() & 0xFF) << 16;
        return (this.a() & 0xFF) << 24 | (v1 | v2 | v3);
    }

    @Override  // hfsl
    public final int j() {
        int v4;
        long v = this.q;
        if(this.t != v) {
            int v1 = hfwy.a(v);
            if(v1 >= 0) {
                ++this.q;
                return v1;
            }
            if(this.t - this.q >= 10L) {
                long v2 = 2L + v;
                int v3 = hfwy.a(v + 1L) << 7 ^ v1;
                if(v3 < 0) {
                    v4 = v3 ^ 0xFFFFFF80;
                    this.q = v2;
                    return v4;
                }
                long v5 = 3L + v;
                int v6 = hfwy.a(v2) << 14 ^ v3;
                if(v6 >= 0) {
                    v4 = v6 ^ 0x3F80;
                    v2 = v5;
                    this.q = v2;
                    return v4;
                }
                long v7 = 4L + v;
                int v8 = v6 ^ hfwy.a(v5) << 21;
                if(v8 < 0) {
                    v4 = 0xFFE03F80 ^ v8;
                    v2 = v7;
                    this.q = v2;
                    return v4;
                }
                v5 = 5L + v;
                int v9 = hfwy.a(v7);
                int v10 = v8 ^ v9 << 28 ^ 0xFE03F80;
                if(v9 >= 0) {
                    v2 = v5;
                    this.q = v2;
                    return v10;
                }
                v7 = 6L + v;
                if(hfwy.a(v5) >= 0) {
                    v2 = v7;
                    this.q = v2;
                    return v10;
                }
                v5 = 7L + v;
                if(hfwy.a(v7) >= 0) {
                    v2 = v5;
                    this.q = v2;
                    return v10;
                }
                v7 = 8L + v;
                if(hfwy.a(v5) >= 0) {
                    v2 = v7;
                    this.q = v2;
                    return v10;
                }
                v5 = 9L + v;
                if(hfwy.a(v7) >= 0) {
                    v2 = v5;
                    this.q = v2;
                    return v10;
                }
                if(hfwy.a(v5) >= 0) {
                    v2 = v + 10L;
                    this.q = v2;
                    return v10;
                }
            }
        }
        return (int)this.s();
    }

    @Override  // hfsl
    public final int k() {
        return this.i();
    }

    @Override  // hfsl
    public final int l() {
        return hfsi.K(this.j());
    }

    @Override  // hfsl
    public final int m() {
        if(this.D()) {
            this.n = 0;
            return 0;
        }
        int v = this.j();
        this.n = v;
        if(v >>> 3 != 0) {
            return v;
        }
        throw new hfur("Protocol message contained an invalid tag (zero).");
    }

    @Override  // hfsl
    public final int n() {
        return this.j();
    }

    @Override  // hfsl
    public final long o() {
        return this.q();
    }

    @Override  // hfsl
    public final long p() {
        return this.r();
    }

    public final long q() {
        if(Long.compare(this.Z(), 8L) >= 0) {
            long v = this.q;
            this.q = 8L + v;
            return ((long)hfwy.a(v)) & 0xFFL | (((long)hfwy.a(1L + v)) & 0xFFL) << 8 | (((long)hfwy.a(2L + v)) & 0xFFL) << 16 | (((long)hfwy.a(3L + v)) & 0xFFL) << 24 | (((long)hfwy.a(v + 4L)) & 0xFFL) << 0x20 | (((long)hfwy.a(5L + v)) & 0xFFL) << 40 | (((long)hfwy.a(v + 6L)) & 0xFFL) << 0x30 | (((long)hfwy.a(v + 7L)) & 0xFFL) << 56;
        }
        long v1 = ((long)this.a()) & 0xFFL;
        long v2 = (((long)this.a()) & 0xFFL) << 8;
        long v3 = (((long)this.a()) & 0xFFL) << 16;
        long v4 = (((long)this.a()) & 0xFFL) << 24;
        long v5 = (((long)this.a()) & 0xFFL) << 0x20;
        long v6 = (((long)this.a()) & 0xFFL) << 40;
        long v7 = (((long)this.a()) & 0xFFL) << 0x30;
        return (((long)this.a()) & 0xFFL) << 56 | (v1 | v2 | v3 | v4 | v5 | v6 | v7);
    }

    @Override  // hfsl
    public final long r() {
        long v11;
        long v4;
        long v = this.q;
        if(this.t != v) {
            int v1 = hfwy.a(v);
            if(v1 >= 0) {
                ++this.q;
                return (long)v1;
            }
            if(this.t - this.q >= 10L) {
                long v2 = 2L + v;
                int v3 = hfwy.a(v + 1L) << 7 ^ v1;
                if(v3 < 0) {
                    v4 = (long)(v3 ^ 0xFFFFFF80);
                    this.q = v2;
                    return v4;
                }
                long v5 = 3L + v;
                int v6 = hfwy.a(v2) << 14 ^ v3;
                if(v6 >= 0) {
                    v4 = (long)(v6 ^ 0x3F80);
                    v2 = v5;
                    this.q = v2;
                    return v4;
                }
                int v7 = v6 ^ hfwy.a(v5) << 21;
                if(v7 < 0) {
                    v4 = (long)(0xFFE03F80 ^ v7);
                    v2 = 4L + v;
                    this.q = v2;
                    return v4;
                }
                v5 = 5L + v;
                long v8 = ((long)hfwy.a(4L + v)) << 28 ^ ((long)v7);
                if(v8 >= 0L) {
                    v4 = 0xFE03F80L ^ v8;
                    v2 = v5;
                    this.q = v2;
                    return v4;
                }
                long v9 = 6L + v;
                long v10 = v8 ^ ((long)hfwy.a(v5)) << 35;
                if(v10 < 0L) {
                    v11 = 0xFFFFFFF80FE03F80L;
                    v4 = v11 ^ v10;
                    v2 = v9;
                    this.q = v2;
                    return v4;
                }
                long v12 = 7L + v;
                long v13 = v10 ^ ((long)hfwy.a(v9)) << 42;
                if(v13 >= 0L) {
                    v4 = 0x3F80FE03F80L ^ v13;
                    v2 = v12;
                    this.q = v2;
                    return v4;
                }
                v9 = 8L + v;
                v10 = v13 ^ ((long)hfwy.a(v12)) << 49;
                if(v10 < 0L) {
                    v11 = 0xFFFE03F80FE03F80L;
                    v4 = v11 ^ v10;
                    v2 = v9;
                    this.q = v2;
                    return v4;
                }
                v12 = 9L + v;
                long v14 = v10 ^ ((long)hfwy.a(v9)) << 56 ^ 0xFE03F80FE03F80L;
                if(v14 >= 0L) {
                    v2 = v12;
                    this.q = v2;
                    return v14;
                }
                if(((long)hfwy.a(v12)) >= 0L) {
                    v2 = v + 10L;
                    this.q = v2;
                    return v14;
                }
            }
        }
        return this.s();
    }

    final long s() {
        long v = 0L;
        for(int v1 = 0; v1 < 0x40; v1 += 7) {
            int v2 = this.a();
            v |= ((long)(v2 & 0x7F)) << v1;
            if((v2 & 0x80) == 0) {
                return v;
            }
        }
        throw new hfur("CodedInputStream encountered a malformed varint.");
    }

    @Override  // hfsl
    public final long t() {
        return this.q();
    }

    @Override  // hfsl
    public final long u() {
        return hfsi.M(this.r());
    }

    @Override  // hfsl
    public final long v() {
        return this.r();
    }

    @Override  // hfsl
    public final ByteString w() {
        int v = this.j();
        if(v > 0) {
            long v1 = this.q;
            if(((long)v) <= this.t - v1) {
                if(this.j) {
                    int v2 = (int)(v1 - this.s);
                    ByteString hfsf0 = ByteString.E(this.aa(v2, v + v2));
                    this.q += (long)v;
                    return hfsf0;
                }
                byte[] arr_b = new byte[v];
                hfwy.k(v1, arr_b, 0L, v);
                this.q += (long)v;
                return new hfsb(arr_b);
            }
        }
        if(v > 0 && v <= this.Y()) {
            if(this.j) {
                ArrayList arrayList0 = new ArrayList();
                while(v > 0) {
                    if(this.Z() == 0L) {
                        this.ab();
                    }
                    int v3 = Math.min(v, ((int)this.Z()));
                    int v4 = (int)(this.q - this.s);
                    arrayList0.add(ByteString.E(this.aa(v4, v4 + v3)));
                    v -= v3;
                    this.q += (long)v3;
                }
                return ByteString.u(arrayList0);
            }
            byte[] arr_b1 = new byte[v];
            this.ae(arr_b1, v);
            return new hfsb(arr_b1);
        }
        if(v == 0) {
            return ByteString.b;
        }
        throw v >= 0 ? new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.") : new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override  // hfsl
    public final String x() {
        int v = this.j();
        if(v > 0) {
            long v1 = this.q;
            if(((long)v) <= this.t - v1) {
                byte[] arr_b = new byte[v];
                hfwy.k(v1, arr_b, 0L, v);
                this.q += (long)v;
                return new String(arr_b, hfup.a);
            }
        }
        if(v > 0 && v <= this.Y()) {
            byte[] arr_b1 = new byte[v];
            this.ae(arr_b1, v);
            return new String(arr_b1, hfup.a);
        }
        if(v == 0) {
            return "";
        }
        throw v >= 0 ? new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.") : new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override  // hfsl
    public final String y() {
        int v = this.j();
        if(v > 0) {
            long v1 = this.q;
            if(((long)v) <= this.t - v1) {
                String s = hfxc.d(this.i, ((int)(v1 - this.r)), v);
                this.q += (long)v;
                return s;
            }
        }
        if(v >= 0 && v <= this.Y()) {
            byte[] arr_b = new byte[v];
            this.ae(arr_b, v);
            return hfxa.b(arr_b, 0, v);
        }
        if(v == 0) {
            return "";
        }
        throw v > 0 ? new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.") : new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override  // hfsl
    public final void z(int v) {
        if(this.n == v) {
            return;
        }
        throw new hfur("Protocol message end-group tag did not match expected tag.");
    }
}

