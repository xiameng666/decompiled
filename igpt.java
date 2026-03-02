import java.math.BigInteger;

public final class igpt extends igpv {
    private int a;
    private int g;
    private int[] h;
    private igqb i;

    public igpt(int v, int v1, int v2, int v3, BigInteger bigInteger0) {
        if(bigInteger0 == null || bigInteger0.signum() < 0 || bigInteger0.bitLength() > v) {
            throw new IllegalArgumentException("x value invalid in F2m field element");
        }
        if(v2 == 0 && v3 == 0) {
            this.a = 2;
            this.h = new int[]{v1};
            this.g = v;
            this.i = new igqb(bigInteger0);
            return;
        }
        if(v2 >= v3) {
            throw new IllegalArgumentException("k2 must be smaller than k3");
        }
        if(v2 <= 0) {
            throw new IllegalArgumentException("k2 must be larger than 0");
        }
        this.a = 3;
        this.h = new int[]{v1, v2, v3};
        this.g = v;
        this.i = new igqb(bigInteger0);
    }

    private igpt(int v, int[] arr_v, igqb igqb0) {
        this.g = v;
        this.a = arr_v.length == 1 ? 2 : 3;
        this.h = arr_v;
        this.i = igqb0;
    }

    @Override  // igpv
    public final int a() {
        return this.i.a();
    }

    @Override  // igpv
    public final int b() {
        return this.g;
    }

    @Override  // igpv
    public final BigInteger c() {
        igqb igqb0 = this.i;
        int v = igqb0.c();
        if(v == 0) {
            return igpo.b;
        }
        long v1 = igqb0.b[v - 1];
        byte[] arr_b = new byte[8];
        int v3 = 0;
        boolean z = false;
        for(int v4 = 7; v4 >= 0; --v4) {
            byte b = (byte)(((int)(v1 >>> v4 * 8)));
            if(!z && b == 0) {
                z = false;
            }
            else {
                arr_b[v3] = b;
                ++v3;
                z = true;
            }
        }
        byte[] arr_b1 = new byte[(v - 1) * 8 + v3];
        for(int v2 = 0; v2 < v3; ++v2) {
            arr_b1[v2] = arr_b[v2];
        }
        for(int v5 = v - 2; v5 >= 0; --v5) {
            long v6 = igqb0.b[v5];
            int v7 = 7;
            while(v7 >= 0) {
                arr_b1[v3] = (byte)(((int)(v6 >>> v7 * 8)));
                --v7;
                ++v3;
            }
        }
        return new BigInteger(1, arr_b1);
    }

    @Override  // igpv
    public final igpv d(igpv igpv0) {
        Object object0 = this.i.clone();
        igqb igqb0 = ((igpt)igpv0).i;
        igqb igqb1 = (igqb)object0;
        igqb1.m(igqb0);
        return new igpt(this.g, this.h, igqb1);
    }

    @Override  // igpv
    public final igpv e() {
        int v = this.g;
        int[] arr_v = this.h;
        igqb igqb0 = this.i;
        if(igqb0.b.length == 0) {
            return new igpt(v, arr_v, new igqb(new long[]{1L}));
        }
        long[] arr_v1 = igqb0.l(Math.max(1, igqb0.c()));
        arr_v1[0] ^= 1L;
        return new igpt(v, arr_v, new igqb(arr_v1));
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof igpt) ? this.g == ((igpt)object0).g && this.a == ((igpt)object0).a && igqw.d(this.h, ((igpt)object0).h) && this.i.equals(((igpt)object0).i) : false;
    }

    @Override  // igpv
    public final igpv f(igpv igpv0) {
        return this.h(igpv0.g());
    }

    @Override  // igpv
    public final igpv g() {
        int v = 1;
        int v1 = this.g;
        int[] arr_v = this.h;
        igqb igqb0 = this.i;
        int v2 = igqb0.a();
        switch(v2) {
            case 0: {
                throw new IllegalStateException();
            }
            case 1: {
                return new igpt(v1, arr_v, igqb0);
            }
            default: {
                Object object0 = igqb0.clone();
                int v3 = v1 + 0x3F >>> 6;
                igqb igqb1 = new igqb(v3);
                igqb.p(igqb1.b, v1, v1, arr_v);
                igqb igqb2 = new igqb(v3);
                int v4 = 0;
                igqb2.b[0] = 1L;
                igqb igqb3 = new igqb(v3);
                int[] arr_v1 = new int[2];
                arr_v1[0] = v2;
                int v5 = v1 + 1;
                arr_v1[1] = v5;
                igqb[] arr_igqb = {((igqb)object0), igqb1};
                int[] arr_v2 = {1, 0};
                igqb[] arr_igqb1 = {igqb2, igqb3};
                int v6 = v5 - arr_v1[0];
                while(true) {
                    if(v6 < 0) {
                        v6 = -v6;
                        arr_v1[v] = v5;
                        arr_v2[v] = v4;
                        int v7 = arr_v1[1 - v];
                        v4 = arr_v2[1 - v];
                        v = 1 - v;
                        v5 = v7;
                    }
                    arr_igqb[v].h(arr_igqb[1 - v], arr_v1[1 - v], v6);
                    int v8 = arr_igqb[v].b(v5);
                    if(v8 == 0) {
                        break;
                    }
                    int v9 = arr_v2[1 - v];
                    arr_igqb1[v].h(arr_igqb1[1 - v], v9, v6);
                    int v10 = v9 + v6;
                    if(v10 > v4) {
                        v4 = v10;
                    }
                    else if(v10 == v4) {
                        v4 = arr_igqb1[v].b(v4);
                    }
                    v6 += v8 - v5;
                    v5 = v8;
                }
                return new igpt(v1, arr_v, arr_igqb1[1 - v]);
            }
        }
    }

    @Override  // igpv
    public final igpv h(igpv igpv0) {
        int v = this.g;
        int[] arr_v = this.h;
        igqb igqb0 = this.i;
        igqb igqb1 = ((igpt)igpv0).i;
        int v1 = igqb0.a();
        if(v1 != 0) {
            int v2 = igqb1.a();
            if(v2 == 0) {
                return new igpt(v, arr_v, igqb1);
            }
            igqb igqb2 = v1 <= v2 ? igqb1 : igqb0;
            if(v1 > v2) {
                igqb0 = igqb1;
            }
            int v3 = v1 <= v2 ? v2 : v1;
            if(v1 > v2) {
                v1 = v2;
            }
            int v4 = v1 + 0x3F >>> 6;
            int v5 = v1 + v3 + 62 >>> 6;
            int v6 = v3 + 0x3F >>> 6;
            int v7 = 0;
            if(v4 == 1) {
                long v8 = igqb0.b[0];
                if(v8 != 1L) {
                    long[] arr_v1 = new long[v5];
                    igqb.o(v8, igqb2.b, v6, arr_v1);
                    return new igpt(v, arr_v, igqb.r(arr_v1, v5, v, arr_v));
                }
                return new igpt(v, arr_v, igqb2);
            }
            int v9 = v3 + 70 >>> 6;
            int v10 = v9 << 4;
            int[] arr_v2 = new int[16];
            long[] arr_v3 = new long[v10];
            arr_v2[1] = v9;
            System.arraycopy(igqb2.b, 0, arr_v3, v9, v6);
            int v11 = v9;
            int v12 = 2;
            while(v12 < 16) {
                int v13 = v11 + v9;
                arr_v2[v12] = v13;
                if((v12 & 1) == 0) {
                    igqb.s(arr_v3, v13 >>> 1, arr_v3, v13, v9, 1);
                    v9 = v9;
                }
                else {
                    igqb.f(arr_v3, v9, arr_v3, v13 - v9, arr_v3, v13, v9);
                    v13 = v13;
                }
                ++v12;
                v11 = v13;
            }
            long[] arr_v4 = new long[v10];
            igqb.s(arr_v3, 0, arr_v4, 0, v10, 4);
            long[] arr_v5 = igqb0.b;
            int v14 = v5 << 3;
            long[] arr_v6 = new long[v14];
            while(v7 < v4) {
                long v15 = arr_v5[v7];
                int v16 = v9;
                int v17 = v7;
                while(true) {
                    igqb.g(arr_v6, v17, arr_v3, arr_v2[((int)v15) & 15], arr_v4, arr_v2[((int)(v15 >>> 4)) & 15], v16);
                    arr_v3 = arr_v3;
                    v9 = v16;
                    v15 >>>= 8;
                    if(v15 == 0L) {
                        break;
                    }
                    v4 = v4;
                    v16 = v9;
                    v17 += v5;
                    v14 = v14;
                }
                ++v7;
                v4 = v4;
                v14 = v14;
            }
            int v18;
            while((v18 = v14 - v5) != 0) {
                igqb.d(arr_v6, v18 - v5, arr_v6, v18, v5, 8);
                v14 = v18;
            }
            igqb0 = igqb.r(arr_v6, v5, v, arr_v);
        }
        return new igpt(v, arr_v, igqb0);
    }

    @Override
    public final int hashCode() {
        return igqw.b(this.h) ^ (this.i.hashCode() ^ this.g);
    }

    @Override  // igpv
    public final igpv i(igpv igpv0, igpv igpv1, igpv igpv2) {
        return this.j(igpv0, igpv1, igpv2);
    }

    @Override  // igpv
    public final igpv j(igpv igpv0, igpv igpv1, igpv igpv2) {
        igqb igqb0 = this.i;
        igqb igqb1 = ((igpt)igpv0).i;
        igqb igqb2 = ((igpt)igpv1).i;
        igqb igqb3 = ((igpt)igpv2).i;
        Object object0 = igqb0.n(igqb1);
        igqb igqb4 = igqb2.n(igqb3);
        if(object0 == igqb0 || object0 == igqb1) {
            object0 = ((igqb)object0).clone();
        }
        ((igqb)object0).m(igqb4);
        ((igqb)object0).i(this.g, this.h);
        return new igpt(this.g, this.h, ((igqb)object0));
    }

    @Override  // igpv
    public final igpv k() {
        return this;
    }

    @Override  // igpv
    public final igpv l() {
        return !this.i.k() && !this.i.j() ? this.o(this.g - 1) : this;
    }

    @Override  // igpv
    public final igpv m() {
        int v = this.g;
        int[] arr_v = this.h;
        igqb igqb0 = this.i;
        int v1 = igqb0.c();
        if(v1 != 0) {
            int v2 = v1 + v1;
            long[] arr_v1 = new long[v2];
            for(int v3 = 0; v3 < v2; v3 += 2) {
                long v4 = igqb0.b[v3 >>> 1];
                arr_v1[v3] = igqb.e(((int)v4));
                arr_v1[v3 + 1] = igqb.e(((int)(v4 >>> 0x20)));
            }
            igqb0 = new igqb(arr_v1, igqb.q(arr_v1, v2, v, arr_v));
        }
        return new igpt(v, arr_v, igqb0);
    }

    @Override  // igpv
    public final igpv n(igpv igpv0, igpv igpv1) {
        Object object0;
        igqb igqb0 = this.i;
        igqb igqb1 = ((igpt)igpv0).i;
        igqb igqb2 = ((igpt)igpv1).i;
        int v = igqb0.c();
        if(v == 0) {
            object0 = igqb0;
        }
        else {
            int v1 = v + v;
            long[] arr_v = new long[v1];
            for(int v2 = 0; v2 < v1; v2 += 2) {
                long v3 = igqb0.b[v2 >>> 1];
                arr_v[v2] = igqb.e(((int)v3));
                arr_v[v2 + 1] = igqb.e(((int)(v3 >>> 0x20)));
            }
            object0 = new igqb(arr_v, v1);
        }
        igqb igqb3 = igqb1.n(igqb2);
        if(object0 == igqb0) {
            object0 = ((igqb)object0).clone();
        }
        ((igqb)object0).m(igqb3);
        ((igqb)object0).i(this.g, this.h);
        return new igpt(this.g, this.h, ((igqb)object0));
    }

    @Override  // igpv
    public final igpv o(int v) {
        if(v <= 0) {
            return this;
        }
        int v1 = this.g;
        int[] arr_v = this.h;
        igqb igqb0 = this.i;
        int v2 = igqb0.c();
        if(v2 != 0) {
            int v3 = v1 + 0x3F >>> 6;
            int v4 = v3 + v3;
            long[] arr_v1 = new long[v4];
            System.arraycopy(igqb0.b, 0, arr_v1, 0, v2);
            while(true) {
                --v;
                if(v < 0) {
                    break;
                }
                int v5 = v2 + v2;
                while(true) {
                    --v2;
                    if(v2 < 0) {
                        break;
                    }
                    long v6 = arr_v1[v2];
                    arr_v1[v5 - 1] = igqb.e(((int)(v6 >>> 0x20)));
                    v5 += -2;
                    arr_v1[v5] = igqb.e(((int)v6));
                }
                v2 = igqb.q(arr_v1, v4, v1, arr_v);
            }
            igqb0 = new igqb(arr_v1, v2);
        }
        return new igpt(v1, arr_v, igqb0);
    }

    @Override  // igpv
    public final igpv p(igpv igpv0) {
        return this.d(igpv0);
    }

    public static void q(igpv igpv0, igpv igpv1) {
        if(!(igpv0 instanceof igpt) || !(igpv1 instanceof igpt)) {
            throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
        }
        if(((igpt)igpv0).a != ((igpt)igpv1).a) {
            throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
        }
        if(((igpt)igpv0).g == ((igpt)igpv1).g && igqw.d(((igpt)igpv0).h, ((igpt)igpv1).h)) {
            return;
        }
        throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
    }

    @Override  // igpv
    public final boolean r() {
        return this.i.j();
    }

    @Override  // igpv
    public final boolean s() {
        return this.i.k();
    }

    @Override  // igpv
    public final boolean t() {
        long[] arr_v = this.i.b;
        return arr_v.length > 0 && (arr_v[0] & 1L) != 0L;
    }
}

