import java.math.BigInteger;
import java.util.Random;

public final class igpp extends igps {
    public int a;
    private BigInteger[] b;
    private int c;
    private int l;
    private int m;
    private igpx n;

    protected igpp(int v, int v1, int v2, int v3) {
        igqr igqr0;
        if(v1 == 0) {
            throw new IllegalArgumentException("k1 must be > 0");
        }
        if(v2 == 0) {
            if(v3 != 0) {
                throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
            }
            igqr0 = igqp.a(new int[]{0, v1, v});
            super(igqr0);
            this.b = null;
            return;
        }
        if(v2 <= v1) {
            throw new IllegalArgumentException("k2 must be > k1");
        }
        if(v3 <= v2) {
            throw new IllegalArgumentException("k3 must be > k2");
        }
        igqr0 = igqp.a(new int[]{0, v1, v2, v3, v});
        super(igqr0);
        this.b = null;
    }

    protected igpp(int v, int v1, int v2, int v3, igpv igpv0, igpv igpv1, BigInteger bigInteger0, BigInteger bigInteger1) {
        this(v, v1, v2, v3);
        this.a = v;
        this.c = v1;
        this.l = v2;
        this.m = v3;
        this.g = bigInteger0;
        this.h = bigInteger1;
        this.n = new igpx(this);
        this.e = igpv0;
        this.f = igpv1;
        this.i = 6;
    }

    public igpp(int v, int v1, int v2, int v3, BigInteger bigInteger0, BigInteger bigInteger1, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(v, v1, v2, v3);
        this.a = v;
        this.c = v1;
        this.l = v2;
        this.m = v3;
        this.g = bigInteger2;
        this.h = bigInteger3;
        this.n = new igpx(this);
        this.e = this.f(bigInteger0);
        this.f = this.f(bigInteger1);
        this.i = 6;
    }

    public igpp(int v, int v1, BigInteger bigInteger0, BigInteger bigInteger1, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(v, v1, 0, 0, bigInteger0, bigInteger1, bigInteger2, bigInteger3);
    }

    @Override  // igps
    public final igpz a(BigInteger bigInteger0, BigInteger bigInteger1, boolean z) {
        igpv igpv0 = this.f(bigInteger0);
        igpv igpv1 = this.f(bigInteger1);
        if(this.i == 5 || this.i == 6) {
            if(!igpv0.s()) {
                igpv1 = igpv1.f(igpv0).d(igpv0);
            }
            else if(!igpv1.m().equals(this.f)) {
                throw new IllegalArgumentException();
            }
        }
        return new igpx(this, igpv0, igpv1, z);
    }

    public final boolean b() {
        return this.g == null || this.h == null || !this.f.r() ? false : this.e.s() || this.e.r();
    }

    final BigInteger[] c() {
        int v4;
        synchronized(this) {
            if(this.b == null) {
                if(!this.b()) {
                    throw new IllegalArgumentException("si is defined for Koblitz curves only");
                }
                int v1 = this.a;
                int v2 = this.e.c().intValue();
                int v3 = igqf.a(v2);
                BigInteger bigInteger0 = this.h;
                if(bigInteger0 == null) {
                    throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
                }
                if(bigInteger0.equals(igpo.d)) {
                    v4 = 1;
                    goto label_14;
                }
                else {
                    if(!bigInteger0.equals(igpo.f)) {
                        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
                    }
                    v4 = 2;
                label_14:
                    BigInteger[] arr_bigInteger = igqf.b(((byte)v3), v1 + 3 - v2, ((byte)false));
                    if(v3 == 1) {
                        arr_bigInteger[0] = arr_bigInteger[0].negate();
                        arr_bigInteger[1] = arr_bigInteger[1].negate();
                    }
                    this.b = new BigInteger[]{igpo.c.add(arr_bigInteger[1]).shiftRight(v4), igpo.c.add(arr_bigInteger[0]).shiftRight(v4).negate()};
                    return this.b;
                }
            }
        }
        return this.b;
    }

    @Override  // igps
    public final int d() {
        return this.a;
    }

    @Override  // igps
    public final igps e() {
        return new igpp(this.a, this.c, this.l, this.m, this.e, this.f, this.g, this.h);
    }

    @Override  // igps
    public final igpv f(BigInteger bigInteger0) {
        return new igpt(this.a, this.c, this.l, this.m, bigInteger0);
    }

    @Override  // igps
    protected final igpw g() {
        return this.b() ? new igqj() : super.g();
    }

    @Override  // igps
    protected final igpz h(igpv igpv0, igpv igpv1, boolean z) {
        return new igpx(this, igpv0, igpv1, z);
    }

    @Override  // igps
    protected final igpz i(igpv igpv0, igpv igpv1, igpv[] arr_igpv, boolean z) {
        return new igpx(this, igpv0, igpv1, arr_igpv, z);
    }

    @Override  // igps
    protected final igpz j(int v, BigInteger bigInteger0) {
        igpv igpv1;
        igpv igpv0 = this.f(bigInteger0);
        if(igpv0.s()) {
            igpv1 = this.f.l();
        }
        else {
            igpv igpv2 = igpv0.m().g().h(this.f).d(this.e).d(igpv0);
            if(igpv2.s()) {
            label_25:
                if(igpv2 == null) {
                    igpv1 = null;
                }
                else {
                    if(igpv2.t() != v) {
                        igpv2 = igpv2.e();
                    }
                    igpv1 = this.i != 5 && this.i != 6 ? igpv2.h(igpv0) : igpv2.d(igpv0);
                }
            }
            else {
                igpv igpv3 = this.f(igpo.b);
                Random random0 = new Random();
                while(true) {
                    igpv igpv4 = this.f(new BigInteger(this.a, random0));
                    igpv igpv5 = igpv2;
                    igpv igpv6 = igpv3;
                    for(int v1 = 1; v1 < this.a; ++v1) {
                        igpv igpv7 = igpv5.m();
                        igpv6 = igpv6.m().d(igpv7.h(igpv4));
                        igpv5 = igpv7.d(igpv2);
                    }
                    if(!igpv5.s()) {
                        igpv2 = null;
                        goto label_25;
                    }
                    else if(igpv6.m().d(igpv6).s()) {
                        continue;
                    }
                    else {
                        igpv2 = igpv6;
                        goto label_25;
                    }
                    break;
                }
            }
        }
        if(igpv1 != null) {
            return new igpx(this, igpv0, igpv1, true);
        }
        throw new IllegalArgumentException("Invalid point compression");
    }

    @Override  // igps
    public final igpz k() {
        return this.n;
    }

    @Override  // igps
    public final boolean l(int v) {
        return v == 0 || v == 1 || v == 6;
    }
}

