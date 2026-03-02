@Deprecated
public enum hkim implements hfub {
    UNKNOWN(0),
    VISA(1),
    MASTERCARD(2),
    AMERICAN_EXPRESS(3),
    DISCOVER(4),
    INTERAC(5),
    EFTPOS(7),
    MAESTRO(8),
    ELO(9),
    JCB(12),
    RUPAY(13),
    MIR(14),
    BANCOMAT(15),
    POSTFINANCE(16),
    PRIVATE_LABEL(6),
    ID(10),
    QUICPAY(11),
    UNRECOGNIZED(-1);

    private final int t;

    private hkim(int v1) {
        this.t = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hkim.r) {
            return this.t;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hkim b(int v) {
        switch(v) {
            case 0: {
                return hkim.a;
            }
            case 1: {
                return hkim.b;
            }
            case 2: {
                return hkim.c;
            }
            case 3: {
                return hkim.d;
            }
            case 4: {
                return hkim.e;
            }
            case 5: {
                return hkim.f;
            }
            case 6: {
                return hkim.o;
            }
            case 7: {
                return hkim.g;
            }
            case 8: {
                return hkim.h;
            }
            case 9: {
                return hkim.i;
            }
            case 10: {
                return hkim.p;
            }
            case 11: {
                return hkim.q;
            }
            case 12: {
                return hkim.j;
            }
            case 13: {
                return hkim.k;
            }
            case 14: {
                return hkim.l;
            }
            case 15: {
                return hkim.m;
            }
            case 16: {
                return hkim.n;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.t);
    }
}

