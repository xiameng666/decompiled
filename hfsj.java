import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class hfsj extends hfsl {
    private final InputStream a;
    private final byte[] h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;

    public hfsj(InputStream inputStream0, int v) {
        this.n = 0x7FFFFFFF;
        this.a = inputStream0;
        this.h = new byte[v];
        this.i = 0;
        this.k = 0;
        this.m = 0;
    }

    @Override  // hfsl
    public final void A(int v) {
        this.n = v;
        this.aa();
    }

    @Override  // hfsl
    public final void B() {
        this.m = -this.k;
    }

    @Override  // hfsl
    public final void C(int v) {
        int v10;
        long v7;
        int v1 = this.k;
        int v2 = this.i - v1;
        if(v <= v2 && v >= 0) {
            this.k = v1 + v;
            return;
        }
        if(v < 0) {
            throw new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int v3 = this.m;
        int v4 = v3 + v1;
        int v5 = this.n;
        if(v4 + v <= v5) {
            this.m = v4;
            this.i = 0;
            this.k = 0;
            while(v2 < v) {
                try {
                    long v6 = (long)(v - v2);
                    try {
                        v7 = this.a.skip(v6);
                        int v8 = Long.compare(v7, 0L);
                    }
                    catch(hfur hfur0) {
                        hfur0.a();
                        throw hfur0;
                    }
                    if(v8 < 0 || v7 > v6) {
                        throw new IllegalStateException(this.a.getClass() + "#skip returned invalid result: " + v7 + "\nThe InputStream implementation is buggy.");
                    }
                    if(v8 == 0) {
                        break;
                    }
                    v2 += (int)v7;
                    continue;
                }
                catch(Throwable throwable0) {
                    this.m += v2;
                    this.aa();
                    throw throwable0;
                }
            }
            this.m += v2;
            this.aa();
            if(v2 < v) {
                int v9 = this.i - this.k;
                this.k = this.i;
                this.ab(1);
                while(true) {
                    v10 = v - v9;
                    int v11 = this.i;
                    if(v10 <= v11) {
                        break;
                    }
                    v9 += v11;
                    this.k = v11;
                    this.ab(1);
                }
                this.k = v10;
            }
            return;
        }
        this.C(v5 - v3 - v1);
        throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override  // hfsl
    public final boolean D() {
        return this.k == this.i && !this.ac(1);
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
                        if(this.h[v2] >= 0) {
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
        int v = this.j();
        int v1 = this.k;
        if(v <= this.i - v1 && v > 0) {
            byte[] arr_b = Arrays.copyOfRange(this.h, v1, v1 + v);
            this.k += v;
            return arr_b;
        }
        if(v >= 0) {
            return this.ae(v);
        }
        throw new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override  // hfsl
    public final byte[] I(int v) {
        int v1 = this.k;
        if(v <= this.i - v1 && v > 0) {
            int v2 = v + v1;
            this.k = v2;
            return Arrays.copyOfRange(this.h, v1, v2);
        }
        return this.ae(v);
    }

    @Override  // hfsl
    public final void J() {
    }

    private static int Y(InputStream inputStream0, byte[] arr_b, int v, int v1) {
        try {
            return inputStream0.read(arr_b, v, v1);
        }
        catch(hfur hfur0) {
            hfur0.a();
            throw hfur0;
        }
    }

    private final List Z(int v) {
        List list0 = new ArrayList();
        while(v > 0) {
            int v1 = Math.min(v, 0x1000);
            byte[] arr_b = new byte[v1];
            int v2 = 0;
            while(v2 < v1) {
                int v3 = this.a.read(arr_b, v2, v1 - v2);
                if(v3 == -1) {
                    throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.m += v3;
                v2 += v3;
                continue;
            }
            v -= v1;
            list0.add(arr_b);
        }
        return list0;
    }

    @Override  // hfsl
    public final byte a() {
        if(this.k == this.i) {
            this.ab(1);
        }
        int v = this.k;
        this.k = v + 1;
        return this.h[v];
    }

    private final void aa() {
        int v = this.i + this.j;
        this.i = v;
        int v1 = this.m + v;
        int v2 = this.n;
        if(v1 > v2) {
            int v3 = v1 - v2;
            this.j = v3;
            this.i = v - v3;
            return;
        }
        this.j = 0;
    }

    private final void ab(int v) {
        if(!this.ac(v)) {
            throw v <= this.e - this.m - this.k ? new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.") : new hfur("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
    }

    private final boolean ac(int v) {
        int v1 = this.k;
        int v2 = this.i;
        if(v1 + v <= v2) {
            throw new IllegalStateException(a.f(v, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int v3 = this.m;
        if(v > this.e - v3 - v1) {
            return false;
        }
        if(v3 + v1 + v > this.n) {
            return false;
        }
        if(v1 > 0) {
            if(v2 > v1) {
                System.arraycopy(this.h, v1, this.h, 0, v2 - v1);
            }
            v3 = this.m + v1;
            this.m = v3;
            v2 = this.i - v1;
            this.i = v2;
            this.k = 0;
        }
        InputStream inputStream0 = this.a;
        int v4 = hfsj.Y(inputStream0, this.h, v2, Math.min(this.h.length - v2, this.e - v3 - v2));
        if(v4 == 0 || v4 < -1 || v4 > this.h.length) {
            throw new IllegalStateException(inputStream0.getClass() + "#read(byte[]) returned invalid result: " + v4 + "\nThe InputStream implementation is buggy.");
        }
        if(v4 > 0) {
            this.i += v4;
            this.aa();
            return this.i >= v || this.ac(v);
        }
        return false;
    }

    private final byte[] ad(int v) {
        if(v == 0) {
            return hfup.b;
        }
        if(v < 0) {
            throw new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int v1 = this.m;
        int v2 = this.k;
        int v3 = v1 + v2 + v;
        if(v3 - this.e > 0) {
            throw new hfur("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int v4 = this.n;
        if(v3 <= v4) {
            int v5 = this.i - v2;
            int v6 = v - v5;
            if(v6 >= 0x1000) {
                try {
                    if(v6 > this.a.available()) {
                        return null;
                    }
                    goto label_18;
                }
                catch(hfur hfur0) {
                    hfur0.a();
                    throw hfur0;
                }
                return null;
            }
        label_18:
            byte[] arr_b = new byte[v];
            System.arraycopy(this.h, this.k, arr_b, 0, v5);
            this.m += this.i;
            this.k = 0;
            this.i = 0;
            while(v5 < v) {
                int v7 = hfsj.Y(this.a, arr_b, v5, v - v5);
                if(v7 == -1) {
                    throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.m += v7;
                v5 += v7;
                continue;
            }
            return arr_b;
        }
        this.C(v4 - v1 - v2);
        throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    private final byte[] ae(int v) {
        byte[] arr_b = this.ad(v);
        if(arr_b != null) {
            return arr_b;
        }
        int v1 = this.k;
        int v2 = this.i - v1;
        this.m += this.i;
        this.k = 0;
        this.i = 0;
        List list0 = this.Z(v - v2);
        byte[] arr_b1 = new byte[v];
        System.arraycopy(this.h, v1, arr_b1, 0, v2);
        for(Object object0: list0) {
            System.arraycopy(((byte[])object0), 0, arr_b1, v2, ((byte[])object0).length);
            v2 += ((byte[])object0).length;
        }
        return arr_b1;
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
        return this.m + this.k;
    }

    @Override  // hfsl
    public final int e(int v) {
        if(v < 0) {
            throw new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int v1 = v + (this.m + this.k);
        if(v1 < 0) {
            throw new hfur("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int v2 = this.n;
        if(v1 > v2) {
            throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.n = v1;
        this.aa();
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
            this.ab(4);
            v = this.k;
        }
        this.k = v + 4;
        return this.h[v] & 0xFF | (this.h[v + 1] & 0xFF) << 8 | (this.h[v + 2] & 0xFF) << 16 | (this.h[v + 3] & 0xFF) << 24;
    }

    @Override  // hfsl
    public final int j() {
        int v5;
        int v = this.k;
        int v1 = this.i;
        if(v1 != v) {
            byte[] arr_b = this.h;
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
        return hfsj.K(this.j());
    }

    @Override  // hfsl
    public final int m() {
        if(this.D()) {
            this.l = 0;
            return 0;
        }
        int v = this.j();
        this.l = v;
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
            this.ab(8);
            v = this.k;
        }
        this.k = v + 8;
        return (((long)this.h[v + 6]) & 0xFFL) << 0x30 | (((long)this.h[v]) & 0xFFL | (((long)this.h[v + 1]) & 0xFFL) << 8 | (((long)this.h[v + 2]) & 0xFFL) << 16 | (((long)this.h[v + 3]) & 0xFFL) << 24 | (((long)this.h[v + 4]) & 0xFFL) << 0x20 | (((long)this.h[v + 5]) & 0xFFL) << 40) | (((long)this.h[v + 7]) & 0xFFL) << 56;
    }

    @Override  // hfsl
    public final long r() {
        long v11;
        long v5;
        int v = this.k;
        int v1 = this.i;
        if(v1 != v) {
            byte[] arr_b = this.h;
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
        return hfsj.M(this.r());
    }

    @Override  // hfsl
    public final long v() {
        return this.r();
    }

    @Override  // hfsl
    public final ByteString w() {
        int v = this.j();
        int v1 = this.k;
        if(v <= this.i - v1 && v > 0) {
            ByteString hfsf0 = ByteString.z(this.h, v1, v);
            this.k += v;
            return hfsf0;
        }
        if(v == 0) {
            return ByteString.b;
        }
        if(v < 0) {
            throw new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] arr_b = this.ad(v);
        if(arr_b != null) {
            return ByteString.copyFrom(arr_b);
        }
        int v2 = this.k;
        int v3 = this.i - v2;
        this.m += this.i;
        this.k = 0;
        this.i = 0;
        List list0 = this.Z(v - v3);
        byte[] arr_b1 = new byte[v];
        System.arraycopy(this.h, v2, arr_b1, 0, v3);
        for(Object object0: list0) {
            System.arraycopy(((byte[])object0), 0, arr_b1, v3, ((byte[])object0).length);
            v3 += ((byte[])object0).length;
        }
        return new hfsb(arr_b1);
    }

    @Override  // hfsl
    public final String x() {
        int v = this.j();
        if(v > 0) {
            int v1 = this.k;
            if(v <= this.i - v1) {
                String s = new String(this.h, v1, v, hfup.a);
                this.k += v;
                return s;
            }
        }
        if(v == 0) {
            return "";
        }
        if(v < 0) {
            throw new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if(v <= this.i) {
            this.ab(v);
            String s1 = new String(this.h, this.k, v, hfup.a);
            this.k += v;
            return s1;
        }
        return new String(this.ae(v), hfup.a);
    }

    @Override  // hfsl
    public final String y() {
        int v = this.j();
        int v1 = this.k;
        int v2 = this.i;
        if(v <= v2 - v1 && v > 0) {
            this.k = v1 + v;
            return hfxa.b(this.h, v1, v);
        }
        if(v == 0) {
            return "";
        }
        if(v < 0) {
            throw new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if(v <= v2) {
            this.ab(v);
            this.k = v;
            return hfxa.b(this.h, v1, v);
        }
        return hfxa.b(this.ae(v), v1, v);
    }

    @Override  // hfsl
    public final void z(int v) {
        if(this.l == v) {
            return;
        }
        throw new hfur("Protocol message end-group tag did not match expected tag.");
    }
}

