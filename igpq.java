import java.math.BigInteger;

public final class igpq extends igps {
    public BigInteger a;
    BigInteger b;
    igpy c;

    protected igpq(BigInteger bigInteger0) {
        igqo igqo0;
        int v = bigInteger0.bitLength();
        if(bigInteger0.signum() <= 0 || v < 2) {
            throw new IllegalArgumentException("\'characteristic\' must be >= 2");
        }
        if(v < 3) {
            switch(bigInteger0.intValue()) {
                case 2: {
                    igqo0 = igqp.a;
                    break;
                }
                case 3: {
                    igqo0 = igqp.b;
                    break;
                }
                default: {
                    igqo0 = new igqs(bigInteger0);
                }
            }
        }
        else {
            igqo0 = new igqs(bigInteger0);
        }
        super(igqo0);
    }

    protected igpq(BigInteger bigInteger0, BigInteger bigInteger1, igpv igpv0, igpv igpv1, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger0);
        this.a = bigInteger0;
        this.b = bigInteger1;
        this.c = new igpy(this);
        this.e = igpv0;
        this.f = igpv1;
        this.g = bigInteger2;
        this.h = bigInteger3;
        this.i = 4;
    }

    public igpq(BigInteger bigInteger0, BigInteger bigInteger1, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this(bigInteger0);
        this.a = bigInteger0;
        int v = bigInteger0.bitLength();
        this.b = v < 0x60 || bigInteger0.shiftRight(v - 0x40).longValue() != -1L ? null : igpu.c.shiftLeft(v).subtract(bigInteger0);
        this.c = new igpy(this);
        this.e = this.f(bigInteger1);
        this.f = this.f(bigInteger2);
        this.g = bigInteger3;
        this.h = bigInteger4;
        this.i = 4;
    }

    @Override  // igps
    public final int d() {
        return this.a.bitLength();
    }

    @Override  // igps
    public final igps e() {
        return new igpq(this.a, this.b, this.e, this.f, this.g, this.h);
    }

    @Override  // igps
    public final igpv f(BigInteger bigInteger0) {
        return new igpu(this.a, this.b, bigInteger0);
    }

    @Override  // igps
    protected final igpz h(igpv igpv0, igpv igpv1, boolean z) {
        return new igpy(this, igpv0, igpv1, z);
    }

    @Override  // igps
    protected final igpz i(igpv igpv0, igpv igpv1, igpv[] arr_igpv, boolean z) {
        return new igpy(this, igpv0, igpv1, arr_igpv, z);
    }

    @Override  // igps
    protected final igpz j(int v, BigInteger bigInteger0) {
        igpv igpv0 = this.f(bigInteger0);
        igpv igpv1 = igpv0.m().d(this.e).h(igpv0).d(this.f).l();
        if(igpv1 == null) {
            throw new IllegalArgumentException("Invalid point compression");
        }
        if(igpv1.t() != v) {
            igpv1 = igpv1.k();
        }
        return new igpy(this, igpv0, igpv1, true);
    }

    @Override  // igps
    public final igpz k() {
        return this.c;
    }

    @Override  // igps
    public final boolean l(int v) {
        return v == 0 || v == 1 || (v == 2 || v == 4);
    }

    @Override  // igps
    public final igpz x(igpz igpz0) {
        return this != igpz0.b && this.i == 2 && !igpz0.v() && (igpz0.b.i == 2 || igpz0.b.i == 3 || igpz0.b.i == 4) ? new igpy(this, this.f(igpz0.c.c()), this.f(igpz0.d.c()), new igpv[]{this.f(igpz0.e[0].c())}, igpz0.f) : super.x(igpz0);
    }
}

