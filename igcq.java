public final class igcq extends igcr {
    public final transient igda a;
    private static final long serialVersionUID = 0xFFFFF6F623875386L;
    private final byte z;

    public igcq(String s, byte b, igda igda0) {
        super(s);
        this.z = b;
        this.a = igda0;
    }

    @Override  // igcr
    public final igcp a(igcm igcm0) {
        igcm igcm1 = igct.d(igcm0);
        switch(this.z) {
            case 1: {
                return igcm1.k();
            }
            case 2: {
                return igcm1.A();
            }
            case 3: {
                return igcm1.e();
            }
            case 4: {
                return igcm1.z();
            }
            case 5: {
                return igcm1.y();
            }
            case 6: {
                return igcm1.j();
            }
            case 7: {
                return igcm1.s();
            }
            case 8: {
                return igcm1.h();
            }
            case 9: {
                return igcm1.x();
            }
            case 10: {
                return igcm1.w();
            }
            case 11: {
                return igcm1.v();
            }
            case 12: {
                return igcm1.i();
            }
            case 13: {
                return igcm1.l();
            }
            case 14: {
                return igcm1.n();
            }
            case 15: {
                return igcm1.g();
            }
            case 16: {
                return igcm1.f();
            }
            case 17: {
                return igcm1.m();
            }
            case 18: {
                return igcm1.q();
            }
            case 19: {
                return igcm1.r();
            }
            case 20: {
                return igcm1.t();
            }
            case 21: {
                return igcm1.u();
            }
            case 22: {
                return igcm1.o();
            }
            default: {
                return igcm1.p();
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof igcq) && this.z == ((igcq)object0).z;
    }

    @Override
    public final int hashCode() {
        return 1 << this.z;
    }

    private Object readResolve() {
        switch(this.z) {
            case 1: {
                return igcr.b;
            }
            case 2: {
                return igcr.c;
            }
            case 3: {
                return igcr.d;
            }
            case 4: {
                return igcr.e;
            }
            case 5: {
                return igcr.f;
            }
            case 6: {
                return igcr.g;
            }
            case 7: {
                return igcr.h;
            }
            case 8: {
                return igcr.i;
            }
            case 9: {
                return igcr.j;
            }
            case 10: {
                return igcr.k;
            }
            case 11: {
                return igcr.l;
            }
            case 12: {
                return igcr.m;
            }
            case 13: {
                return igcr.n;
            }
            case 14: {
                return igcr.o;
            }
            case 15: {
                return igcr.p;
            }
            case 16: {
                return igcr.q;
            }
            case 17: {
                return igcr.r;
            }
            case 18: {
                return igcr.s;
            }
            case 19: {
                return igcr.t;
            }
            case 20: {
                return igcr.u;
            }
            case 21: {
                return igcr.v;
            }
            case 22: {
                return igcr.w;
            }
            default: {
                return igcr.x;
            }
        }
    }
}

