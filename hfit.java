public enum hfit implements hfub {
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    TEZ_CODE(16);

    public final int q;

    private hfit(int v1) {
        this.q = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.q;
    }

    public static hfit b(int v) {
        switch(v) {
            case 0: {
                return hfit.a;
            }
            case 1: {
                return hfit.b;
            }
            case 2: {
                return hfit.c;
            }
            case 3: {
                return hfit.d;
            }
            case 4: {
                return hfit.e;
            }
            case 5: {
                return hfit.f;
            }
            case 6: {
                return hfit.g;
            }
            case 7: {
                return hfit.h;
            }
            case 8: {
                return hfit.i;
            }
            case 9: {
                return hfit.j;
            }
            case 10: {
                return hfit.k;
            }
            case 11: {
                return hfit.l;
            }
            case 12: {
                return hfit.m;
            }
            case 13: {
                return hfit.n;
            }
            case 14: {
                return hfit.o;
            }
            case 16: {
                return hfit.p;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.q);
    }
}

