import j..util.Objects;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public final class ggym implements ggzt, Serializable, Comparable {
    public static final ggym a;
    public static final ggym[] b;
    public final long c;
    private static final int[] d;
    private static final int[] e;
    private static final gfrx f;

    static {
        ggym.d = new int[0x400];
        ggym.e = new int[0x400];
        ggym.a = new ggym(0L);
        ggym.af(0, 0, 0, 0, 0, 0);
        ggym.af(0, 0, 0, 1, 0, 1);
        ggym.af(0, 0, 0, 2, 0, 2);
        ggym.af(0, 0, 0, 3, 0, 3);
        ggym.b = new ggym[6];
        for(int v = 0; v < 6; ++v) {
            ggym.b[v] = ggym.x(v);
        }
        ggym.f = new gfrn('0');
    }

    public ggym() {
        this(0L);
    }

    public ggym(long v) {
        this.c = v;
    }

    public static ggym A(ggzv ggzv0) {
        return ggym.B(ggzv0.k());
    }

    public static ggym B(ghae ghae0) {
        int v = ghbj.f(ghae0);
        ghbh ghbh0 = ghbj.n(v);
        return ggym.y(v, ghbj.e(ghbj.d(ghbh0.a(ghae0.h, ghae0.i, ghae0.j))), ghbj.e(ghbj.d(ghbh0.b(ghae0.h, ghae0.i, ghae0.j))));
    }

    public final ggym C() {
        long v = this.o();
        return new ggym(this.c + (v + v));
    }

    public final ggym D() {
        return new ggym(ggym.q(this.c));
    }

    public final ggym E(int v) {
        long v1 = ggym.p(v);
        return new ggym(this.c & -v1 | v1);
    }

    public final ggym F() {
        return new ggym(ggym.r(this.c));
    }

    public final ggym G() {
        return new ggym(ggym.s(this.c));
    }

    public final ggzv H() {
        return new ggzv(this.J());
    }

    public final ghae I() {
        return ghae.q(this.J());
    }

    public final ghae J() {
        long v = this.m();
        return ghbj.h(this.b(), ((long)ggym.g(v)), ((long)(((int)v))));
    }

    public final String K() {
        long v = this.c;
        if(v == ggym.a.c) {
            return "X";
        }
        String s = gfuk.c(gfqz.c(Long.toHexString(v)), 16);
        gfrx gfrx0 = ggym.f;
        int v1 = s.length();
        while(true) {
            --v1;
            if(v1 < 0) {
                break;
            }
            if(!gfrx0.c(s.charAt(v1))) {
                return s.subSequence(0, v1 + 1).toString();
            }
        }
        return "";
    }

    public final void L(int v, List list0) {
        boolean z;
        Objects.requireNonNull(list0);
        gftb.checkTrue(v >= this.j());
        long v1 = this.t();
        int v2 = ggym.d(v1);
        int v3 = this.h();
        int v4 = ggym.e(v1);
        int v5 = this.b();
        int v6 = ggym.i(v);
        int v7 = -v6;
        while(true) {
            int v8 = v4 & -v3;
            int v9 = v2 & -v3;
            if(v7 >= 0) {
                if(v7 < v3) {
                    int v10 = v9 + v7;
                    if(!ggyj.a(ggym.z(v5, v10, v8 - v6, v8 - v3 >= 0).E(v), list0)) {
                        break;
                    }
                    int v11 = v8 + v3;
                    if(ggyj.a(ggym.z(v5, v10, v11, v11 < 0x40000000).E(v), list0)) {
                        goto label_23;
                    }
                    break;
                }
                else if(v8 + v7 >= 0x40000000) {
                    z = false;
                    goto label_24;
                }
            }
            else if(v8 + v7 < 0) {
                z = false;
                goto label_24;
            }
        label_23:
            z = true;
        label_24:
            int v12 = v8 + v7;
            if(!ggyj.a(ggym.z(v5, v9 - v6, v12, z && v9 - v3 >= 0).E(v), list0)) {
                break;
            }
            int v13 = v9 + v3;
            if(!ggyj.a(ggym.z(v5, v13, v12, z && v13 < 0x40000000).E(v), list0) || v7 >= v3) {
                break;
            }
            v7 += v6;
        }
    }

    public final void M(int v, Collection collection0) {
        boolean z2;
        int v6;
        boolean z1;
        long v1 = this.t();
        int v2 = ggym.d(v1);
        int v3 = ggym.e(v1);
        int v4 = ggym.i(v + 1);
        int v5 = v4 + v4;
        boolean z = false;
        if((v2 & v4) == 0) {
            v6 = -v5;
            z1 = v2 - v5 >= 0;
        }
        else {
            z1 = v2 + v5 < 0x40000000;
            v6 = v5;
        }
        if((v4 & v3) == 0) {
            boolean z3 = v3 - v5 >= 0;
            v5 = -v5;
            z2 = z3;
        }
        else if(v3 + v5 < 0x40000000) {
            z2 = true;
        }
        else {
            z2 = false;
        }
        int v7 = this.b();
        collection0.add(this.E(v));
        int v8 = v6 + v2;
        collection0.add(ggym.z(v7, v8, v3, z1).E(v));
        int v9 = v3 + v5;
        collection0.add(ggym.z(v7, v2, v9, z2).E(v));
        if(!z1) {
            if(z2) {
                z2 = true;
                goto label_32;
            }
            return;
        }
    label_32:
        if(z1 && z2) {
            z = true;
        }
        collection0.add(ggym.z(v7, v8, v9, z).E(v));
    }

    public static void N(int v, int v1, ggxl ggxl0) {
        ggxl0.f(ghbj.a(v, v1), ghbj.a(v + v1, v1));
    }

    public final boolean O(ggym ggym0) {
        return ggym.X(ggym0.c, ggym.s(this.c)) && ggym.Z(ggym0.c, ggym.r(this.c));
    }

    public final boolean P(ggym ggym0) {
        return ggym.X(this.c, ggym0.c);
    }

    public final boolean Q(ggym ggym0) {
        return ggym.Y(this.c, ggym0.c);
    }

    public final boolean R() {
        return ggym.S(this.c);
    }

    public static boolean S(long v) {
        return (v & 0xFFFFFFFFFFFFFFFL) == 0L;
    }

    public final boolean T() {
        return (((int)this.c) & 1) != 0;
    }

    public static boolean U(long v) {
        return ((int)(v >>> 61)) < 6 && (Long.lowestOneBit(v) & 1537228672809129301L) != 0L;
    }

    public final boolean V(ggym ggym0) {
        return ggym.Z(this.c, ggym0.c);
    }

    public final boolean W(ggym ggym0) {
        return ggym.aa(this.c, ggym0.c);
    }

    public static boolean X(long v, long v1) {
        return v + 0x8000000000000000L >= v1 + 0x8000000000000000L;
    }

    public static boolean Y(long v, long v1) {
        return v + 0x8000000000000000L > v1 + 0x8000000000000000L;
    }

    public static boolean Z(long v, long v1) {
        return v + 0x8000000000000000L <= v1 + 0x8000000000000000L;
    }

    public final int a(ggym ggym0) {
        long v = this.c;
        long v1 = ggym0.c;
        if(ggym.aa(v, v1)) {
            return -1;
        }
        return ggym.Y(v, v1) ? 1 : 0;
    }

    public static boolean aa(long v, long v1) {
        return v + 0x8000000000000000L < v1 + 0x8000000000000000L;
    }

    public static ggym ab(String s) {
        if(s != null && !s.isEmpty() && !s.equals("X")) {
            if(s.toLowerCase(Locale.ROOT).startsWith("0x")) {
                s = s.substring(2);
            }
            int v = s.length();
            if(v <= 16) {
                long v2 = 0L;
                for(int v1 = 0; v1 < v; ++v1) {
                    int v3 = Character.digit(s.charAt(v1), 16);
                    if(v3 == -1) {
                        return ggym.a;
                    }
                    v2 = v2 * 16L + ((long)v3);
                }
                return new ggym(v2 << (16 - v) * 4);
            }
        }
        return ggym.a;
    }

    private static final int ac(int v, int v1, int v2, int v3) {
        int v4 = v2 * 4;
        return ggym.d[v3 + ((v >> v4 & 15) << 6) + ((v1 >> v4 & 15) << 2)];
    }

    private static final int ad(int v) {
        return v & 3;
    }

    private static final long ae(long v, int v1, int v2) {
        int v3 = v1 & 3;
        return v | ((long)v2) >> 2 << (v3 + v3) * 4;
    }

    private static void af(int v, int v1, int v2, int v3, int v4, int v5) {
        if(v == 4) {
            int v6 = (v1 << 4) + v2 << 2;
            ggym.d[v6 + v3] = (v4 << 2) + v5;
            ggym.e[(v4 << 2) + v3] = v6 + v5;
            return;
        }
        for(int v7 = 0; v7 < 4; ++v7) {
            int v8 = ggxv.d(v5, v7);
            ggym.af(v + 1, (v8 >>> 1) + (v1 + v1), (v8 & 1) + (v2 + v2), v3, (v4 << 2) + v7, v5 ^ ggxv.e(v7));
        }
    }

    public final int b() {
        return (int)(this.c >>> 61);
    }

    public final int c(ggym ggym0) {
        long[] arr_v = {this.c ^ ggym0.c, this.o(), ggym0.o()};
        long v = arr_v[0] ^ 0x8000000000000000L;
        for(int v1 = 1; v1 < 3; ++v1) {
            long v2 = glxm.b(arr_v[v1]);
            if(v2 > v) {
                v = v2;
            }
        }
        return Math.max(Long.numberOfLeadingZeros(v ^ 0x8000000000000000L) - 3, -1) >> 1;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.a(((ggym)object0));
    }

    public static int d(long v) {
        return (int)(v >>> 33);
    }

    public static int e(long v) {
        return (int)(v >>> 2 & 0x7FFFFFFFL);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ggym) ? this.c == ((ggym)object0).c : false;
    }

    static int f(long v) {
        return (int)(v & 3L);
    }

    static int g(long v) {
        return (int)(v >> 0x20);
    }

    public final int h() {
        return ggym.i(this.j());
    }

    @Override
    public final int hashCode() {
        return (int)((this.c >>> 0x20) + this.c);
    }

    public static int i(int v) {
        return 1 << 30 - v;
    }

    public final int j() {
        return this.T() ? 30 : 30 - (Long.numberOfTrailingZeros(this.c) >> 1);
    }

    static long k(long v, int v1) {
        return v - Long.lowestOneBit(v) + ggym.p(v1);
    }

    public static long l(int v) {
        return (((long)v) << 61) + 0x1000000000000000L;
    }

    public final long m() {
        long v = this.t();
        int v1 = ggym.d(v);
        int v2 = ggym.e(v);
        int v3 = 1;
        if(!this.T()) {
            if(((((int)this.c) >>> 2 ^ v1) & 1) != 0) {
                return ((long)(v1 + v1 + 2)) << 0x20 | ((long)(v2 + v2 + 2)) & 0xFFFFFFFFL;
            }
            v3 = 0;
        }
        return ((long)(v1 + v1 + v3)) << 0x20 | ((long)(v2 + v2 + v3)) & 0xFFFFFFFFL;
    }

    @Override  // ggzt
    public final long n() {
        return this.c;
    }

    public final long o() {
        return Long.lowestOneBit(this.c);
    }

    // String Decryptor: 2 succeeded, 0 failed
    public static long p(int v) {
        int v1 = 30 - v;
        return 1L << v1 + v1;
    }

    static long q(long v) {
        long v1 = Long.lowestOneBit(v) << 2;
        return v & -v1 | v1;
    }

    static long r(long v) {
        return v + (Long.lowestOneBit(v) - 1L);
    }

    static long s(long v) {
        return v - (Long.lowestOneBit(v) - 1L);
    }

    public final long t() {
        int v = this.b() & 1;
        int v1 = 0;
        int v2 = 0;
        for(int v3 = 7; v3 >= 0; --v3) {
            int v4 = v3 == 7 ? 2 : 4;
            int v5 = ggym.e[v + (((1 << v4 + v4) - 1 & ((int)(this.c >>> (v3 + v3) * 4 + 1))) << 2)];
            v1 += v5 >> 6 << v3 * 4;
            v2 += (v5 >> 2 & 15) << v3 * 4;
            v = v5 & 3;
        }
        if((this.o() & 0x1111111111111110L) != 0L) {
            v ^= 1;
        }
        return ((long)v1) << 33 | ((long)v2) << 2 | ((long)v);
    }

    @Override
    public final String toString() {
        return "(face=" + this.b() + ", pos=" + Long.toHexString(this.c & 0x1FFFFFFFFFFFFFFFL) + ", level=" + this.j() + ")";
    }

    public final ggym u(int v) {
        return new ggym(this.c + ((long)(v + v - 3)) * (this.o() >>> 2));
    }

    public final ggym v(int v) {
        return new ggym(ggym.k(this.c, v));
    }

    public final ggym w(int v) {
        return new ggym(this.c + Long.lowestOneBit(this.c) + ggym.p(v));
    }

    public static ggym x(int v) {
        return new ggym(ggym.l(v));
    }

    public static ggym y(int v, int v1, int v2) {
        int v3 = v & 1;
        long v4 = ((long)v) << 28;
        for(int v5 = 7; v5 >= 4; --v5) {
            int v6 = ggym.ac(v1, v2, v5, v3);
            v4 = ggym.ae(v4, v5, v6);
            v3 = ggym.ad(v6);
        }
        long v7 = 0L;
        for(int v8 = 3; v8 >= 0; --v8) {
            int v9 = ggym.ac(v1, v2, v8, v3);
            v7 = ggym.ae(v7, v8, v9);
            v3 = ggym.ad(v9);
        }
        long v10 = (v4 << 0x20) + v7;
        return new ggym(v10 + v10 + 1L);
    }

    public static ggym z(int v, int v1, int v2, boolean z) {
        if(z) {
            return ggym.y(v, v1, v2);
        }
        int v3 = Math.max(-1, Math.min(0x40000000, v1));
        int v4 = Math.max(-1, Math.min(0x40000000, v2));
        double f = Math.max(-1.0, Math.min(1.0, ((double)(v3 + v3 - 0x3FFFFFFF)) * 9.313226E-10));
        double f1 = Math.max(-1.0, Math.min(1.0, ((double)(v4 + v4 - 0x3FFFFFFF)) * 9.313226E-10));
        ghbi ghbi0 = ghbj.o(v);
        double f2 = ghbi0.a(f, f1);
        double f3 = ghbi0.b(f, f1);
        double f4 = ghbi0.c(f, f1);
        int v5 = ghbj.g(f2, f3, f4);
        ghbh ghbh0 = ghbj.n(v5);
        return ggym.y(v5, ghbj.e((ghbh0.a(f2, f3, f4) + 1.0) * 0.5), ghbj.e((ghbh0.b(f2, f3, f4) + 1.0) * 0.5));
    }
}

