public enum gjuf implements hfub {
    UNKNOWN_TAP_PATH(0),
    VISA_MSD(1),
    VISA_QVSDC(2),
    MC_MSD(3),
    MC_EMV(4),
    AMEX_MSD(5),
    AMEX_EMV(6),
    DISCOVER_ZIP(7),
    DISCOVER_DPAS(8),
    OPEN_APPLET(9);

    public final int k;

    private gjuf(int v1) {
        this.k = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.k;
    }

    public static gjuf b(int v) {
        switch(v) {
            case 0: {
                return gjuf.a;
            }
            case 1: {
                return gjuf.b;
            }
            case 2: {
                return gjuf.c;
            }
            case 3: {
                return gjuf.d;
            }
            case 4: {
                return gjuf.e;
            }
            case 5: {
                return gjuf.f;
            }
            case 6: {
                return gjuf.g;
            }
            case 7: {
                return gjuf.h;
            }
            case 8: {
                return gjuf.i;
            }
            case 9: {
                return gjuf.j;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.k);
    }
}

