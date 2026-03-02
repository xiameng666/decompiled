import java.math.BigInteger;
import java.util.Hashtable;

public abstract class igps {
    public final igqo d;
    public igpv e;
    public igpv f;
    protected BigInteger g;
    protected BigInteger h;
    public int i;
    public igpw j;
    public igqm k;

    protected igps(igqo igqo0) {
        this.i = 0;
        this.k = null;
        this.j = null;
        this.d = igqo0;
    }

    public igpz a(BigInteger bigInteger0, BigInteger bigInteger1, boolean z) {
        return this.h(this.f(bigInteger0), this.f(bigInteger1), z);
    }

    public abstract int d();

    public abstract igps e();

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof igps) && this.w(((igps)object0));
    }

    public abstract igpv f(BigInteger arg1);

    protected igpw g() {
        igqm igqm0 = this.k;
        return (igqm0 instanceof igqm) ? new igqa(this, igqm0) : new igqg();
    }

    protected abstract igpz h(igpv arg1, igpv arg2, boolean arg3);

    @Override
    public final int hashCode() {
        int v = Integer.rotateLeft(this.e.c().hashCode(), 8);
        return Integer.rotateLeft(this.f.c().hashCode(), 16) ^ (this.d.hashCode() ^ v);
    }

    protected abstract igpz i(igpv arg1, igpv arg2, igpv[] arg3, boolean arg4);

    protected abstract igpz j(int arg1, BigInteger arg2);

    public abstract igpz k();

    public boolean l(int v) {
        throw null;
    }

    public final igpr m() {
        igpr igpr0;
        synchronized(this) {
            igpr0 = new igpr(this, this.i, this.k, this.j);
        }
        return igpr0;
    }

    public final igpw n() {
        synchronized(this) {
            if(this.j == null) {
                this.j = this.g();
            }
        }
        return this.j;
    }

    public final igpz o(BigInteger bigInteger0, BigInteger bigInteger1) {
        return this.a(bigInteger0, bigInteger1, false);
    }

    public final igpz p(byte[] arr_b) {
        igpz igpz0;
        int v = this.d() + 7;
        boolean z = false;
        int v1 = arr_b[0];
        int v2 = v / 8;
        switch(v1) {
            case 0: {
                goto label_18;
            }
            case 2: 
            case 3: {
                goto label_22;
            }
            case 4: {
                goto label_27;
            }
        }
        if(v1 != 6 && v1 != 7) {
            throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(v1, 16));
        }
        if(arr_b.length != v2 + v2 + 1) {
            throw new IllegalArgumentException("Incorrect length for hybrid encoding");
        }
        BigInteger bigInteger0 = igqx.a(arr_b, 1, v2);
        BigInteger bigInteger1 = igqx.a(arr_b, v2 + 1, v2);
        boolean z1 = bigInteger1.testBit(0);
        if(v1 == 7) {
            z = true;
        }
        if(z1 != z) {
            throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
        }
        igpz0 = this.q(bigInteger0, bigInteger1);
        goto label_29;
    label_18:
        if(arr_b.length != 1) {
            throw new IllegalArgumentException("Incorrect length for infinity encoding");
        }
        igpz0 = this.k();
        goto label_29;
    label_22:
        if(arr_b.length != v2 + 1) {
            throw new IllegalArgumentException("Incorrect length for compressed encoding");
        }
        igpz0 = this.j(v1 & 1, igqx.a(arr_b, 1, v2));
        if(!igpz0.y()) {
            throw new IllegalArgumentException("Invalid point");
        label_27:
            if(arr_b.length != v2 + v2 + 1) {
                throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
            }
            igpz0 = this.q(igqx.a(arr_b, 1, v2), igqx.a(arr_b, v2 + 1, v2));
        }
    label_29:
        if(v1 != 0 && igpz0.v()) {
            throw new IllegalArgumentException("Invalid infinity encoding");
        }
        return igpz0;
    }

    public final igpz q(BigInteger bigInteger0, BigInteger bigInteger1) {
        igpz igpz0 = this.o(bigInteger0, bigInteger1);
        if(igpz0.x()) {
            return igpz0;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public final igqc r(igpz igpz0, String s) {
        igqc igqc0;
        this.s(igpz0);
        synchronized(igpz0) {
            igqc0 = igpz0.g == null ? null : ((igqc)igpz0.g.get(s));
        }
        return igqc0;
    }

    protected final void s(igpz igpz0) {
        if(this == igpz0.b) {
            return;
        }
        throw new IllegalArgumentException("\'point\' must be non-null and on this curve");
    }

    public final void t(igpz[] arr_igpz) {
        this.u(arr_igpz, 0, arr_igpz.length, null);
    }

    public final void u(igpz[] arr_igpz, int v, int v1, igpv igpv0) {
        if(v1 < 0 || v > arr_igpz.length - v1) {
            throw new IllegalArgumentException("invalid range specified for \'points\'");
        }
        for(int v3 = 0; v3 < v1; ++v3) {
            igpz igpz0 = arr_igpz[v + v3];
            if(igpz0 != null && this != igpz0.b) {
                throw new IllegalArgumentException("\'points\' entries must be null or on this curve");
            }
        }
        if(this.i != 0 && this.i != 5) {
            igpv[] arr_igpv = new igpv[v1];
            int[] arr_v = new int[v1];
            int v5 = 0;
            for(int v4 = 0; v4 < v1; ++v4) {
                int v6 = v + v4;
                igpz igpz1 = arr_igpz[v6];
                if(igpz1 != null && (igpv0 != null || !igpz1.w())) {
                    arr_igpv[v5] = igpz1.A();
                    arr_v[v5] = v6;
                    ++v5;
                }
            }
            if(v5 == 0) {
                return;
            }
            igpv[] arr_igpv1 = new igpv[v5];
            arr_igpv1[0] = arr_igpv[0];
            int v7;
            for(v7 = 0; v7 + 1 < v5; ++v7) {
                arr_igpv1[v7 + 1] = arr_igpv1[v7].h(arr_igpv[v7 + 1]);
            }
            if(igpv0 != null) {
                arr_igpv1[v7] = arr_igpv1[v7].h(igpv0);
            }
            igpv igpv1 = arr_igpv1[v7].g();
            while(v7 > 0) {
                igpv igpv2 = arr_igpv[v7];
                arr_igpv[v7] = arr_igpv1[v7 - 1].h(igpv1);
                igpv1 = igpv1.h(igpv2);
                --v7;
            }
            arr_igpv[0] = igpv1;
            for(int v2 = 0; v2 < v5; ++v2) {
                int v8 = arr_v[v2];
                arr_igpz[v8] = arr_igpz[v8].u(arr_igpv[v2]);
            }
            return;
        }
        if(igpv0 == null) {
            return;
        }
        throw new IllegalArgumentException("\'iso\' not valid for affine coordinates");
    }

    public final void v(igpz igpz0, String s, igqc igqc0) {
        this.s(igpz0);
        synchronized(igpz0) {
            Hashtable hashtable0 = igpz0.g;
            if(hashtable0 == null) {
                hashtable0 = new Hashtable(4);
                igpz0.g = hashtable0;
            }
            hashtable0.put(s, igqc0);
        }
    }

    public final boolean w(igps igps0) {
        return this == igps0 ? true : igps0 != null && this.d.equals(igps0.d) && this.e.c().equals(igps0.e.c()) && this.f.c().equals(igps0.f.c());
    }

    public igpz x(igpz igpz0) {
        if(this == igpz0.b) {
            return igpz0;
        }
        if(igpz0.v()) {
            return this.k();
        }
        igpz igpz1 = igpz0.t();
        igpz igpz2 = this.a(igpz1.c.c(), igpz1.e().c(), igpz1.f);
        if(igpz2.x()) {
            return igpz2;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }
}

