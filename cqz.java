public final class cqz extends hfb implements iew, iid, ije {
    public long a;
    public hlf b;
    public float c;
    public hmu d;
    public hmg e;
    private long f;
    private jlm g;
    private hmg h;
    private hmu i;

    public cqz(long v, hlf hlf0, hmu hmu0) {
        this.a = v;
        this.b = hlf0;
        this.c = 1.0f;
        this.d = hmu0;
        this.f = 0x7FC000007FC00000L;
    }

    @Override  // ije
    public final void dJ(ivj ivj0) {
        ivf.q(ivj0, this.d);
    }

    @Override  // iew
    public final void dU() {
    }

    @Override  // iew
    public final void dW(igb igb0) {
        hmg hmg0;
        if(this.d == hmp.a) {
            if(!ibog.c(this.a, hll.i)) {
                hpc.m(igb0, this.a, 0L, 0L, 0.0f, null, 0x7E);
            }
            hlf hlf0 = this.b;
            if(hlf0 != null) {
                hpc.g(igb0, hlf0, 0L, 0L, this.c, null, 0, 0x76);
            }
        }
        else {
            if(hkf.g(igb0.o(), this.f) && igb0.q() == this.g && ibuq.m(this.i, this.d)) {
                hmg0 = this.h;
                ibuq.c(hmg0);
            }
            else {
                iie.a(this, new cqy(this, igb0));
                hmg0 = this.e;
                this.e = null;
            }
            this.h = hmg0;
            this.f = igb0.o();
            this.g = igb0.q();
            this.i = this.d;
            ibuq.c(hmg0);
            if(!ibog.c(this.a, hll.i)) {
                hmh.e(igb0, hmg0, this.a);
            }
            hlf hlf1 = this.b;
            if(hlf1 != null) {
                float f = this.c;
                hpg hpg0 = hpg.a;
                if((hmg0 instanceof hme)) {
                    igb0.w(hlf1, hmh.c(((hme)hmg0).a), hmh.a(((hme)hmg0).a), f, hpg0, 3);
                }
                else if((hmg0 instanceof hmf)) {
                    hks hks0 = ((hmf)hmg0).b;
                    if(hks0 == null) {
                        float f1 = Float.intBitsToFloat(((int)(((hmf)hmg0).a.h >> 0x20)));
                        igb0.D(hlf1, hmh.d(((hmf)hmg0).a), hmh.b(((hmf)hmg0).a), ((long)Float.floatToRawIntBits(f1)) << 0x20 | ((long)Float.floatToRawIntBits(f1)) & 0xFFFFFFFFL, f, hpg0);
                    }
                    else {
                        igb0.x(hks0, hlf1, f, hpg0, 3);
                    }
                }
                else {
                    if(!(hmg0 instanceof hmd)) {
                        throw new ibnq();
                    }
                    igb0.x(((hmd)hmg0).a, hlf1, f, hpg0, 3);
                }
            }
        }
        igb0.p();
    }

    @Override  // iid
    public final void o() {
        this.f = 0x7FC000007FC00000L;
        this.g = null;
        this.h = null;
        this.i = null;
        iex.a(this);
    }

    @Override  // hfb
    public final boolean v() {
        return false;
    }

    @Override  // ije
    public final boolean w() {
        return false;
    }

    @Override  // ije
    public final boolean x() {
        return false;
    }

    @Override  // ije
    public final boolean y() {
        return false;
    }
}

