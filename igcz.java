final class igcz extends igda {
    private final byte n;
    private static final long serialVersionUID = 0x1C563F5AE6D3L;

    public igcz(String s, byte b) {
        super(s);
        this.n = b;
    }

    @Override  // igda
    public final igcy a(igcm igcm0) {
        igcm igcm1 = igct.d(igcm0);
        switch(this.n) {
            case 1: {
                return igcm1.E();
            }
            case 2: {
                return igcm1.C();
            }
            case 3: {
                return igcm1.M();
            }
            case 4: {
                return igcm1.N();
            }
            case 5: {
                return igcm1.J();
            }
            case 6: {
                return igcm1.L();
            }
            case 7: {
                return igcm1.D();
            }
            case 8: {
                return igcm1.F();
            }
            case 9: {
                return igcm1.G();
            }
            case 10: {
                return igcm1.I();
            }
            case 11: {
                return igcm1.K();
            }
            default: {
                return igcm1.H();
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof igcz) && this.n == ((igcz)object0).n;
    }

    @Override
    public final int hashCode() {
        return 1 << this.n;
    }

    private Object readResolve() {
        switch(this.n) {
            case 1: {
                return igcz.a;
            }
            case 2: {
                return igcz.b;
            }
            case 3: {
                return igcz.c;
            }
            case 4: {
                return igcz.d;
            }
            case 5: {
                return igcz.e;
            }
            case 6: {
                return igcz.f;
            }
            case 7: {
                return igcz.g;
            }
            case 8: {
                return igcz.h;
            }
            case 9: {
                return igcz.i;
            }
            case 10: {
                return igcz.j;
            }
            case 11: {
                return igcz.k;
            }
            default: {
                return igcz.l;
            }
        }
    }
}

