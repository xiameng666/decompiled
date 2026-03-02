public enum ffrv implements hfub {
    BUILD_TYPE_UNKNOWN(0),
    BUILD_TYPE_PROD(1),
    BUILD_TYPE_INTERNAL(2),
    BUILD_TYPE_PRODLMP(3),
    BUILD_TYPE_THINGS(4),
    BUILD_TYPE_PRODMNC(5),
    BUILD_TYPE_WEARABLE(6),
    BUILD_TYPE_AUTO(7),
    BUILD_TYPE_ATV(9),
    BUILD_TYPE_PRODPIX(10),
    BUILD_TYPE_PRODPI(11),
    BUILD_TYPE_PRODGO(12),
    BUILD_TYPE_PRODQT(13),
    BUILD_TYPE_PRODNEXT(15),
    BUILD_TYPE_PRODRVC(16),
    BUILD_TYPE_BSTAR(17),
    BUILD_TYPE_PRODGOR(18),
    BUILD_TYPE_ATVR(19),
    BUILD_TYPE_PRODSC(20),
    BUILD_TYPE_PRODGOS(21),
    BUILD_TYPE_ATVS(22),
    BUILD_TYPE_WEARABLERVC(23),
    BUILD_TYPE_AUTORVC(24),
    BUILD_TYPE_WEARABLETM(25),
    BUILD_TYPE_XRSC(26),
    BUILD_TYPE_PRODVIC(27),
    BUILD_TYPE_ATVV(28),
    BUILD_TYPE_AUTOVIC(29),
    BUILD_TYPE_PRODSCMERGED(30);

    public final int D;

    private ffrv(int v1) {
        this.D = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.D;
    }

    public static ffrv b(int v) {
        switch(v) {
            case 0: {
                return ffrv.a;
            }
            case 1: {
                return ffrv.b;
            }
            case 2: {
                return ffrv.c;
            }
            case 3: {
                return ffrv.d;
            }
            case 4: {
                return ffrv.e;
            }
            case 5: {
                return ffrv.f;
            }
            case 6: {
                return ffrv.g;
            }
            case 7: {
                return ffrv.h;
            }
            case 9: {
                return ffrv.i;
            }
            case 10: {
                return ffrv.j;
            }
            case 11: {
                return ffrv.k;
            }
            case 12: {
                return ffrv.l;
            }
            case 13: {
                return ffrv.m;
            }
            case 15: {
                return ffrv.n;
            }
            case 16: {
                return ffrv.o;
            }
            case 17: {
                return ffrv.p;
            }
            case 18: {
                return ffrv.q;
            }
            case 19: {
                return ffrv.r;
            }
            case 20: {
                return ffrv.s;
            }
            case 21: {
                return ffrv.t;
            }
            case 22: {
                return ffrv.u;
            }
            case 23: {
                return ffrv.v;
            }
            case 24: {
                return ffrv.w;
            }
            case 25: {
                return ffrv.x;
            }
            case 26: {
                return ffrv.y;
            }
            case 27: {
                return ffrv.z;
            }
            case 28: {
                return ffrv.A;
            }
            case 29: {
                return ffrv.B;
            }
            case 30: {
                return ffrv.C;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.D);
    }
}

