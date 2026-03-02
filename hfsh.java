import java.util.Arrays;

public final class hfsh extends hfsl {
    private final byte[] a;
    private final boolean h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private int o;

    public hfsh(byte[] arr_b, int v, int v1, boolean z) {
        this.o = 0x7FFFFFFF;
        this.a = arr_b;
        this.i = v1 + v;
        this.k = v;
        this.l = v;
        this.h = z;
    }

    @Override  // hfsl
    public final void A(int v) {
        this.o = v;
        this.Y();
    }

    @Override  // hfsl
    public final void B() {
        this.l = this.k;
    }

    @Override  // hfsl
    public final void C(int v) {
        if(v >= 0) {
            int v1 = this.k;
            if(v <= this.i - v1) {
                this.k = v1 + v;
                return;
            }
        }
        throw v >= 0 ? new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.") : new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override  // hfsl
    public final boolean D() {
        return this.k == this.i;
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
                if(this.i - this.k >= 10) {
                    while(v1 < 10) {
                        int v2 = this.k;
                        this.k = v2 + 1;
                        if(this.a[v2] >= 0) {
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
        if(v > 0) {
            int v1 = this.k;
            if(v <= this.i - v1) {
                int v2 = v + v1;
                this.k = v2;
                return Arrays.copyOfRange(this.a, v1, v2);
            }
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
        this.n = true;
    }

    private final void Y() {
        int v = this.i + this.j;
        this.i = v;
        int v1 = v - this.l;
        int v2 = this.o;
        if(v1 > v2) {
            int v3 = v1 - v2;
            this.j = v3;
            this.i = v - v3;
            return;
        }
        this.j = 0;
    }

    @Override  // hfsl
    public final byte a() {
        int v = this.k;
        if(v == this.i) {
            throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.k = v + 1;
        return this.a[v];
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
        return this.k - this.l;
    }

    @Override  // hfsl
    public final int e(int v) {
        if(v < 0) {
            throw new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int v1 = v + this.d();
        if(v1 < 0) {
            throw new hfur("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int v2 = this.o;
        if(v1 > v2) {
            throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.o = v1;
        this.Y();
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
        int v = this.k;
        if(this.i - v < 4) {
            throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.k = v + 4;
        return this.a[v] & 0xFF | (this.a[v + 1] & 0xFF) << 8 | (this.a[v + 2] & 0xFF) << 16 | (this.a[v + 3] & 0xFF) << 24;
    }

    @Override  // hfsl
    public final int j() {
        int v5;
        int v = this.k;
        int v1 = this.i;
        if(v1 != v) {
            byte[] arr_b = this.a;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.k = v + 1;
                return v2;
            }
            if(v1 - (v + 1) >= 9) {
                int v3 = v + 2;
                int v4 = arr_b[v + 1] << 7 ^ v2;
                if(v4 < 0) {
                    v5 = v4 ^ 0xFFFFFF80;
                    this.k = v3;
                    return v5;
                }
                int v6 = v + 3;
                int v7 = arr_b[v3] << 14 ^ v4;
                if(v7 >= 0) {
                    v5 = v7 ^ 0x3F80;
                    v3 = v6;
                    this.k = v3;
                    return v5;
                }
                int v8 = v + 4;
                int v9 = v7 ^ arr_b[v6] << 21;
                if(v9 < 0) {
                    v5 = 0xFFE03F80 ^ v9;
                    v3 = v8;
                    this.k = v3;
                    return v5;
                }
                v6 = v + 5;
                int v10 = arr_b[v8];
                int v11 = v9 ^ v10 << 28 ^ 0xFE03F80;
                if(v10 >= 0) {
                    v3 = v6;
                    this.k = v3;
                    return v11;
                }
                v8 = v + 6;
                if(arr_b[v6] >= 0) {
                    v3 = v8;
                    this.k = v3;
                    return v11;
                }
                v6 = v + 7;
                if(arr_b[v8] >= 0) {
                    v3 = v6;
                    this.k = v3;
                    return v11;
                }
                v8 = v + 8;
                if(arr_b[v6] >= 0) {
                    v3 = v8;
                    this.k = v3;
                    return v11;
                }
                v6 = v + 9;
                if(arr_b[v8] >= 0) {
                    v3 = v6;
                    this.k = v3;
                    return v11;
                }
                if(arr_b[v6] >= 0) {
                    v3 = v + 10;
                    this.k = v3;
                    return v11;
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
        return hfsh.K(this.j());
    }

    @Override  // hfsl
    public final int m() {
        if(this.D()) {
            this.m = 0;
            return 0;
        }
        int v = this.j();
        this.m = v;
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
        int v = this.k;
        if(this.i - v < 8) {
            throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.k = v + 8;
        return (((long)this.a[v + 6]) & 0xFFL) << 0x30 | (((long)this.a[v]) & 0xFFL | (((long)this.a[v + 1]) & 0xFFL) << 8 | (((long)this.a[v + 2]) & 0xFFL) << 16 | (((long)this.a[v + 3]) & 0xFFL) << 24 | (((long)this.a[v + 4]) & 0xFFL) << 0x20 | (((long)this.a[v + 5]) & 0xFFL) << 40) | (((long)this.a[v + 7]) & 0xFFL) << 56;
    }

    @Override  // hfsl
    public final long r() {
        long v11;
        long v5;
        int v = this.k;
        int v1 = this.i;
        if(v1 != v) {
            byte[] arr_b = this.a;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.k = v + 1;
                return (long)v2;
            }
            if(v1 - (v + 1) >= 9) {
                int v3 = v + 2;
                int v4 = arr_b[v + 1] << 7 ^ v2;
                if(v4 < 0) {
                    v5 = (long)(v4 ^ 0xFFFFFF80);
                    this.k = v3;
                    return v5;
                }
                int v6 = v + 3;
                int v7 = arr_b[v3] << 14 ^ v4;
                if(v7 >= 0) {
                    v5 = (long)(v7 ^ 0x3F80);
                    v3 = v6;
                    this.k = v3;
                    return v5;
                }
                int v8 = v7 ^ arr_b[v6] << 21;
                if(v8 < 0) {
                    v3 = v + 4;
                    v5 = (long)(0xFFE03F80 ^ v8);
                    this.k = v3;
                    return v5;
                }
                v6 = v + 5;
                long v9 = ((long)arr_b[v + 4]) << 28 ^ ((long)v8);
                if(v9 >= 0L) {
                    v5 = v9 ^ 0xFE03F80L;
                    v3 = v6;
                    this.k = v3;
                    return v5;
                }
                v3 = v + 6;
                long v10 = ((long)arr_b[v6]) << 35 ^ v9;
                if(v10 < 0L) {
                    v11 = 0xFFFFFFF80FE03F80L;
                    v5 = v10 ^ v11;
                    this.k = v3;
                    return v5;
                }
                int v12 = v + 7;
                long v13 = v10 ^ ((long)arr_b[v3]) << 42;
                if(v13 >= 0L) {
                    v5 = v13 ^ 0x3F80FE03F80L;
                    v3 = v12;
                    this.k = v3;
                    return v5;
                }
                v3 = v + 8;
                v10 = v13 ^ ((long)arr_b[v12]) << 49;
                if(v10 < 0L) {
                    v11 = 0xFFFE03F80FE03F80L;
                    v5 = v10 ^ v11;
                    this.k = v3;
                    return v5;
                }
                v12 = v + 9;
                long v14 = v10 ^ ((long)arr_b[v3]) << 56 ^ 0xFE03F80FE03F80L;
                if(v14 >= 0L) {
                    v3 = v12;
                    this.k = v3;
                    return v14;
                }
                v3 = v + 10;
                if(((long)arr_b[v12]) >= 0L) {
                    this.k = v3;
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
        return hfsh.M(this.r());
    }

    @Override  // hfsl
    public final long v() {
        return this.r();
    }

    @Override  // hfsl
    public final ByteString w() {
        int v = this.j();
        if(v > 0) {
            int v1 = this.k;
            if(v <= this.i - v1) {
                ByteString hfsf0 = this.h && this.n ? new hfrx(this.a, v1, v) : ByteString.z(this.a, v1, v);
                this.k += v;
                return hfsf0;
            }
        }
        return v == 0 ? ByteString.b : new hfsb(this.I(v));
    }

    @Override  // hfsl
    public final String x() {
        int v = this.j();
        if(v > 0) {
            int v1 = this.k;
            if(v <= this.i - v1) {
                String s = new String(this.a, v1, v, hfup.a);
                this.k += v;
                return s;
            }
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
            int v1 = this.k;
            if(v <= this.i - v1) {
                String s = hfxa.b(this.a, v1, v);
                this.k += v;
                return s;
            }
        }
        if(v == 0) {
            return "";
        }
        throw v > 0 ? new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.") : new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override  // hfsl
    public final void z(int v) {
        if(this.m == v) {
            return;
        }
        throw new hfur("Protocol message end-group tag did not match expected tag.");
    }
}

