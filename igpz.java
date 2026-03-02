import java.math.BigInteger;
import java.util.Hashtable;

public abstract class igpz {
    protected static final igpv[] a;
    protected igps b;
    protected igpv c;
    protected igpv d;
    protected igpv[] e;
    protected boolean f;
    protected Hashtable g;

    static {
        igpz.a = new igpv[0];
    }

    protected igpz(igps igps0, igpv igpv0, igpv igpv1) {
        igpv[] arr_igpv;
        int v = igps0 == null ? 0 : igps0.i;
        if(v != 0 && v != 5) {
            igpv igpv2 = igps0.f(igpo.c);
            switch(v) {
                case 3: {
                    arr_igpv = new igpv[]{igpv2, igpv2, igpv2};
                    break;
                }
                case 4: {
                    arr_igpv = new igpv[]{igpv2, igps0.e};
                    break;
                }
                case 1: 
                case 2: 
                case 6: {
                    arr_igpv = new igpv[]{igpv2};
                    break;
                }
                default: {
                    throw new IllegalArgumentException("unknown coordinate system");
                }
            }
        }
        else {
            arr_igpv = igpz.a;
        }
        this(igps0, igpv0, igpv1, arr_igpv);
    }

    protected igpz(igps igps0, igpv igpv0, igpv igpv1, igpv[] arr_igpv) {
        this.g = null;
        this.b = igps0;
        this.c = igpv0;
        this.d = igpv1;
        this.e = arr_igpv;
    }

    public final igpv A() {
        return this.e.length > 0 ? this.e[0] : null;
    }

    public igpz b(igpv igpv0) {
        return this.v() ? this : this.b.i(this.c.h(igpv0), this.d, this.e, this.f);
    }

    public igpz c(igpv igpv0) {
        return this.v() ? this : this.b.i(this.c, this.d.h(igpv0), this.e, this.f);
    }

    protected abstract boolean d();

    public igpv e() {
        return this.d;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof igpz)) {
            return false;
        }
        igpz igpz0 = (igpz)object0;
        if(igpz0 == null) {
            return false;
        }
        igps igps0 = this.b;
        igps igps1 = igpz0.b;
        boolean z = igps1 == null;
        boolean z1 = this.v();
        boolean z2 = igpz0.v();
        if(!z1 && !z2) {
            if(igps0 != null) {
            label_16:
                if(igps0 == null) {
                    igpz0 = igpz0.t();
                    return this.c.equals(igpz0.c) ? this.e().equals(igpz0.e()) : false;
                }
                if(z) {
                    this = this.t();
                    return this.c.equals(igpz0.c) ? this.e().equals(igpz0.e()) : false;
                }
                if(!igps0.w(igps1)) {
                    return false;
                }
                igpz[] arr_igpz = {this, igps0.x(igpz0)};
                igps0.t(arr_igpz);
                igpz0 = arr_igpz[1];
                this = arr_igpz[0];
            }
            else if(!z) {
                z = false;
                goto label_16;
            }
            return this.c.equals(igpz0.c) ? this.e().equals(igpz0.e()) : false;
        }
        if(z1 && z2) {
            return igps0 == null || z ? true : igps0.w(igps1);
        }
        return false;
    }

    public abstract igpz f(igpz arg1);

    public abstract igpz g();

    public abstract igpz h();

    @Override
    public final int hashCode() {
        int v = this.b == null ? 0 : ~this.b.hashCode();
        if(!this.v()) {
            igpz igpz0 = this.t();
            int v1 = v ^ igpz0.c.hashCode() * 17;
            return igpz0.e().hashCode() * 0x101 ^ v1;
        }
        return v;
    }

    public igpz i(igpz igpz0) {
        throw null;
    }

    protected abstract boolean j();

    public igpz l() {
        return this.i(this);
    }

    public igpz m(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("\'e\' cannot be negative");
        }
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            this = this.h();
        }
        return this;
    }

    protected final int q() {
        return this.b == null ? 0 : this.b.i;
    }

    protected final igpz r(igpv igpv0, igpv igpv1) {
        return this.b.h(this.c.h(igpv0), this.d.h(igpv1), this.f);
    }

    public final igpz s(BigInteger bigInteger0) {
        return this.b.n().a(this, bigInteger0);
    }

    public final igpz t() {
        if(!this.v() && (this.q() != 0 && this.q() != 5)) {
            igpv igpv0 = this.A();
            return igpv0.r() ? this : this.u(igpv0.g());
        }
        return this;
    }

    @Override
    public final String toString() {
        if(this.v()) {
            return "INF";
        }
        StringBuffer stringBuffer0 = new StringBuffer("(");
        stringBuffer0.append(this.c);
        stringBuffer0.append(',');
        stringBuffer0.append(this.d);
        for(int v = 0; v < this.e.length; ++v) {
            stringBuffer0.append(',');
            stringBuffer0.append(this.e[v]);
        }
        stringBuffer0.append(')');
        return stringBuffer0.toString();
    }

    final igpz u(igpv igpv0) {
        switch(this.q()) {
            case 2: 
            case 3: 
            case 4: {
                igpv igpv1 = igpv0.m();
                return this.r(igpv1, igpv1.h(igpv0));
            }
            case 1: 
            case 6: {
                return this.r(igpv0, igpv0);
            }
            default: {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
    }

    public final boolean v() {
        return this.c == null || this.d == null ? true : this.e.length > 0 && this.e[0].s();
    }

    public final boolean w() {
        return this.q() == 0 || this.q() == 5 || this.v() || this.e[0].r();
    }

    public final boolean x() {
        if(!this.v() && this.b != null) {
            return this.d() ? this.y() : false;
        }
        return true;
    }

    protected final boolean y() {
        BigInteger bigInteger0 = this.b.h;
        if(bigInteger0 != null && !bigInteger0.equals(igpo.c)) {
            BigInteger bigInteger1 = bigInteger0.abs();
            igpz igpz0 = this.b.k();
            int v = bigInteger1.bitLength();
            if(v > 0) {
                if(bigInteger1.testBit(0)) {
                    igpz0 = this;
                }
                for(int v1 = 1; v1 < v; ++v1) {
                    this = this.h();
                    if(bigInteger1.testBit(v1)) {
                        igpz0 = igpz0.f(this);
                    }
                }
            }
            if(bigInteger0.signum() < 0) {
                igpz0 = igpz0.g();
            }
            return !igpz0.v();
        }
        return true;
    }

    public final byte[] z() {
        if(this.v()) {
            return new byte[1];
        }
        igpz igpz0 = this.t();
        igpv igpv0 = igpz0.c;
        int v = igpv0.b() + 7;
        byte[] arr_b = igpv0.c().toByteArray();
        if(arr_b.length != v / 8) {
            int v1 = arr_b[0] == 0 ? 1 : 0;
            int v2 = arr_b.length - v1;
            if(v2 > v / 8) {
                throw new IllegalArgumentException("standard length exceeded for value");
            }
            byte[] arr_b1 = new byte[v / 8];
            System.arraycopy(arr_b, v1, arr_b1, v / 8 - v2, v2);
            arr_b = arr_b1;
        }
        byte[] arr_b2 = new byte[arr_b.length + 1];
        arr_b2[0] = igpz0.j() ? 3 : 2;
        System.arraycopy(arr_b, 0, arr_b2, 1, arr_b.length);
        return arr_b2;
    }
}

