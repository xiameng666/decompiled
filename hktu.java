public enum hktu implements hfub {
    PAYMENT_NETWORK_UNKNOWN(0),
    PAYMENT_NETWORK_VISA(1),
    PAYMENT_NETWORK_MASTERCARD(2),
    PAYMENT_NETWORK_AMERICAN_EXPRESS(3),
    PAYMENT_NETWORK_DISCOVER(4),
    PAYMENT_NETWORK_INTERAC(5),
    PAYMENT_NETWORK_EFTPOS(6),
    PAYMENT_NETWORK_MAESTRO(7),
    PAYMENT_NETWORK_ELO(8),
    PAYMENT_NETWORK_JCB(9),
    PAYMENT_NETWORK_RUPAY(13),
    PAYMENT_NETWORK_MIR(14),
    PAYMENT_NETWORK_BANCOMAT(15),
    PAYMENT_NETWORK_EBT(16),
    PAYMENT_NETWORK_TICKET(17),
    PAYMENT_NETWORK_ALELO(18),
    PAYMENT_NETWORK_MADA(19),
    PAYMENT_NETWORK_JAYWAN(20),
    PAYMENT_NETWORK_GIRO(21),
    PAYMENT_NETWORK_PLUXEE(22),
    PAYMENT_NETWORK_POSTFINANCE(23),
    PAYMENT_NETWORK_CARTES_BANCAIRES(24),
    PAYMENT_NETWORK_CABAL(25),
    PAYMENT_NETWORK_CONECS(26),
    PAYMENT_NETWORK_HIMYAN(27),
    PAYMENT_NETWORK_PAYNET(28),
    PAYMENT_NETWORK_PRIVATE_LABEL(10),
    PAYMENT_NETWORK_ID(11),
    PAYMENT_NETWORK_QUICPAY(12),
    UNRECOGNIZED(-1);

    private final int F;

    private hktu(int v1) {
        this.F = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hktu.D) {
            return this.F;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hktu b(int v) {
        switch(v) {
            case 0: {
                return hktu.a;
            }
            case 1: {
                return hktu.b;
            }
            case 2: {
                return hktu.c;
            }
            case 3: {
                return hktu.d;
            }
            case 4: {
                return hktu.e;
            }
            case 5: {
                return hktu.f;
            }
            case 6: {
                return hktu.g;
            }
            case 7: {
                return hktu.h;
            }
            case 8: {
                return hktu.i;
            }
            case 9: {
                return hktu.j;
            }
            case 10: {
                return hktu.A;
            }
            case 11: {
                return hktu.B;
            }
            case 12: {
                return hktu.C;
            }
            case 13: {
                return hktu.k;
            }
            case 14: {
                return hktu.l;
            }
            case 15: {
                return hktu.m;
            }
            case 16: {
                return hktu.n;
            }
            case 17: {
                return hktu.o;
            }
            case 18: {
                return hktu.p;
            }
            case 19: {
                return hktu.q;
            }
            case 20: {
                return hktu.r;
            }
            case 21: {
                return hktu.s;
            }
            case 22: {
                return hktu.t;
            }
            case 23: {
                return hktu.u;
            }
            case 24: {
                return hktu.v;
            }
            case 25: {
                return hktu.w;
            }
            case 26: {
                return hktu.x;
            }
            case 27: {
                return hktu.y;
            }
            case 28: {
                return hktu.z;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.F);
    }
}

