import java.nio.ByteBuffer;

final class hfsk extends hfsl {
    public static final int a;
    private final ByteBuffer h;
    private final boolean i;
    private final long j;
    private long k;
    private long l;
    private long m;
    private int n;
    private int o;
    private boolean p;
    private int q;

    public hfsk(ByteBuffer byteBuffer0, boolean z) {
        this.q = 0x7FFFFFFF;
        this.h = byteBuffer0.duplicate();
        long v = hfwy.e(byteBuffer0);
        this.j = v;
        this.k = ((long)byteBuffer0.limit()) + v;
        long v1 = v + ((long)byteBuffer0.position());
        this.l = v1;
        this.m = v1;
        this.i = z;
    }

    @Override  // hfsl
    public final void A(int v) {
        this.q = v;
        this.ab();
    }

    @Override  // hfsl
    public final void B() {
        this.m = this.l;
    }

    @Override  // hfsl
    public final void C(int v) {
        if(v < 0 || v > this.Z()) {
            throw v >= 0 ? new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.") : new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        this.l += (long)v;
    }

    @Override  // hfsl
    public final boolean D() {
        return this.l == this.k;
    }

    @Override  // hfsl
    public final boolean E() {
        return this.r() != 0L;
    }

    @Override  // hfsl
    public final boolean F(int v) {
        int v1 = 0;
        switch(v & 7) {
            case 0: {
                if(this.Z() >= 10) {
                    while(v1 < 10) {
                        long v2 = this.l;
                        this.l = 1L + v2;
                        if(hfwy.a(v2) >= 0) {
                            return true;
                        }
                        ++v1;
                    }
                    throw new hfur("CodedInputStream encountered a malformed varint.");
                }
                else {
                    while(true) {
                        if(v1 >= 10) {
                            throw new hfur("CodedInputStream encountered a malformed varint.");
                        }
                        if(this.a() >= 0) {
                            break;
                        }
                        ++v1;
                    }
                }
                return true;
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
        if(v >= 0 && v <= this.Z()) {
            byte[] arr_b = new byte[v];
            this.aa(this.l, this.l + ((long)v)).get(arr_b);
            this.l += (long)v;
            return arr_b;
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
        this.p = true;
    }

    private final int Y(long v) {
        return (int)(v - this.j);
    }

    private final int Z() {
        return (int)(this.k - this.l);
    }

    @Override  // hfsl
    public final byte a() {
        long v = this.l;
        if(v == this.k) {
            throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.l = 1L + v;
        return hfwy.a(v);
    }

    private final ByteBuffer aa(long v, long v1) {
        ByteBuffer byteBuffer0;
        try {
            this.h.position(this.Y(v));
            this.h.limit(this.Y(v1));
            byteBuffer0 = this.h.slice();
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            hfur hfur0 = new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            hfur0.initCause(illegalArgumentException0);
            throw hfur0;
        }
        finally {
            this.h.position(this.h.position());
            this.h.limit(this.h.limit());
        }
        return byteBuffer0;
    }

    private final void ab() {
        long v = this.k + ((long)this.n);
        this.k = v;
        int v1 = (int)(v - this.m);
        int v2 = this.q;
        if(v1 > v2) {
            int v3 = v1 - v2;
            this.n = v3;
            this.k = v - ((long)v3);
            return;
        }
        this.n = 0;
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
        return (int)(this.l - this.m);
    }

    @Override  // hfsl
    public final int e(int v) {
        if(v < 0) {
            throw new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int v1 = v + this.d();
        int v2 = this.q;
        if(v1 > v2) {
            throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.q = v1;
        this.ab();
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
        long v = this.l;
        if(this.k - v < 4L) {
            throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.l = 4L + v;
        return hfwy.a(v) & 0xFF | (hfwy.a(1L + v) & 0xFF) << 8 | (hfwy.a(2L + v) & 0xFF) << 16 | (hfwy.a(v + 3L) & 0xFF) << 24;
    }

    @Override  // hfsl
    public final int j() {
        int v4;
        long v = this.l;
        if(this.k != v) {
            int v1 = hfwy.a(v);
            if(v1 >= 0) {
                this.l = 1L + v;
                return v1;
            }
            if(this.k - (1L + v) >= 9L) {
                long v2 = 2L + v;
                int v3 = hfwy.a(1L + v) << 7 ^ v1;
                if(v3 < 0) {
                    v4 = v3 ^ 0xFFFFFF80;
                    this.l = v2;
                    return v4;
                }
                long v5 = 3L + v;
                int v6 = v3 ^ hfwy.a(v2) << 14;
                if(v6 >= 0) {
                    v4 = v6 ^ 0x3F80;
                    v2 = v5;
                    this.l = v2;
                    return v4;
                }
                v2 = 4L + v;
                int v7 = v6 ^ hfwy.a(v5) << 21;
                if(v7 < 0) {
                    v4 = 0xFFE03F80 ^ v7;
                    this.l = v2;
                    return v4;
                }
                v5 = 5L + v;
                int v8 = hfwy.a(v2);
                int v9 = v7 ^ v8 << 28 ^ 0xFE03F80;
                if(v8 >= 0) {
                    v2 = v5;
                    this.l = v2;
                    return v9;
                }
                v2 = 6L + v;
                if(hfwy.a(v5) >= 0) {
                    this.l = v2;
                    return v9;
                }
                v5 = 7L + v;
                if(hfwy.a(v2) >= 0) {
                    v2 = v5;
                    this.l = v2;
                    return v9;
                }
                v2 = 8L + v;
                if(hfwy.a(v5) >= 0) {
                    this.l = v2;
                    return v9;
                }
                v5 = v + 9L;
                if(hfwy.a(v2) >= 0) {
                    v2 = v5;
                    this.l = v2;
                    return v9;
                }
                v2 = 10L + v;
                if(hfwy.a(v5) >= 0) {
                    this.l = v2;
                    return v9;
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
        return hfsk.K(this.j());
    }

    @Override  // hfsl
    public final int m() {
        if(this.D()) {
            this.o = 0;
            return 0;
        }
        int v = this.j();
        this.o = v;
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
        long v = this.l;
        if(this.k - v < 8L) {
            throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.l = 8L + v;
        long v1 = (long)hfwy.a(v);
        long v2 = (long)hfwy.a(1L + v);
        long v3 = (long)hfwy.a(2L + v);
        long v4 = (long)hfwy.a(3L + v);
        long v5 = (long)hfwy.a(4L + v);
        long v6 = (long)hfwy.a(5L + v);
        long v7 = (long)hfwy.a(6L + v);
        return (((long)hfwy.a(v + 7L)) & 0xFFL) << 56 | (v1 & 0xFFL | (v2 & 0xFFL) << 8 | (v3 & 0xFFL) << 16 | (v4 & 0xFFL) << 24 | (v5 & 0xFFL) << 0x20 | (v6 & 0xFFL) << 40 | (v7 & 0xFFL) << 0x30);
    }

    @Override  // hfsl
    public final long r() {
        long v12;
        long v7;
        int v4;
        long v = this.l;
        if(this.k != v) {
            int v1 = hfwy.a(v);
            if(v1 >= 0) {
                this.l = 1L + v;
                return (long)v1;
            }
            if(this.k - (1L + v) >= 9L) {
                long v2 = 2L + v;
                int v3 = hfwy.a(1L + v) << 7 ^ v1;
                if(v3 < 0) {
                    v4 = v3 ^ 0xFFFFFF80;
                    this.l = v2;
                    return (long)v4;
                }
                long v5 = 3L + v;
                int v6 = v3 ^ hfwy.a(v2) << 14;
                if(v6 >= 0) {
                    v7 = (long)(v6 ^ 0x3F80);
                    v2 = v5;
                    this.l = v2;
                    return v7;
                }
                v2 = 4L + v;
                int v8 = v6 ^ hfwy.a(v5) << 21;
                if(v8 < 0) {
                    v4 = 0xFFE03F80 ^ v8;
                    this.l = v2;
                    return (long)v4;
                }
                v5 = 5L + v;
                long v9 = ((long)hfwy.a(v2)) << 28 ^ ((long)v8);
                if(v9 >= 0L) {
                    v7 = 0xFE03F80L ^ v9;
                    v2 = v5;
                    this.l = v2;
                    return v7;
                }
                long v10 = 6L + v;
                long v11 = ((long)hfwy.a(v5)) << 35 ^ v9;
                if(v11 < 0L) {
                    v12 = 0xFFFFFFF80FE03F80L;
                    v7 = v12 ^ v11;
                    v2 = v10;
                    this.l = v2;
                    return v7;
                }
                v2 = v + 7L;
                long v13 = v11 ^ ((long)hfwy.a(v10)) << 42;
                if(v13 >= 0L) {
                    v7 = 0x3F80FE03F80L ^ v13;
                    this.l = v2;
                    return v7;
                }
                v10 = 8L + v;
                v11 = v13 ^ ((long)hfwy.a(v2)) << 49;
                if(v11 < 0L) {
                    v12 = 0xFFFE03F80FE03F80L;
                    v7 = v12 ^ v11;
                    v2 = v10;
                    this.l = v2;
                    return v7;
                }
                v2 = v + 9L;
                long v14 = v11 ^ ((long)hfwy.a(v10)) << 56 ^ 0xFE03F80FE03F80L;
                if(v14 >= 0L) {
                    this.l = v2;
                    return v14;
                }
                if(((long)hfwy.a(v2)) >= 0L) {
                    v2 = v + 10L;
                    this.l = v2;
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
        return hfsk.M(this.r());
    }

    @Override  // hfsl
    public final long v() {
        return this.r();
    }

    @Override  // hfsl
    public final ByteString w() {
        int v = this.j();
        if(v > 0 && v <= this.Z()) {
            if(this.i && this.p) {
                ByteBuffer byteBuffer0 = this.aa(this.l, this.l + ((long)v));
                this.l += (long)v;
                return ByteString.E(byteBuffer0);
            }
            byte[] arr_b = new byte[v];
            hfwy.k(this.l, arr_b, 0L, v);
            this.l += (long)v;
            return new hfsb(arr_b);
        }
        if(v == 0) {
            return ByteString.b;
        }
        throw v >= 0 ? new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.") : new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override  // hfsl
    public final String x() {
        int v = this.j();
        if(v > 0 && v <= this.Z()) {
            byte[] arr_b = new byte[v];
            hfwy.k(this.l, arr_b, 0L, v);
            this.l += (long)v;
            return new String(arr_b, hfup.a);
        }
        if(v == 0) {
            return "";
        }
        throw v >= 0 ? new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.") : new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override  // hfsl
    public final String y() {
        int v = this.j();
        if(v > 0 && v <= this.Z()) {
            String s = hfxc.d(this.h, this.Y(this.l), v);
            this.l += (long)v;
            return s;
        }
        if(v == 0) {
            return "";
        }
        throw v > 0 ? new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.") : new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override  // hfsl
    public final void z(int v) {
        if(this.o == v) {
            return;
        }
        throw new hfur("Protocol message end-group tag did not match expected tag.");
    }
}

