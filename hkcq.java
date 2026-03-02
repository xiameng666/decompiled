public enum hkcq implements hfub {
    UNKNOWN_REASON(0),
    NOT_TURNED_DOWN(1),
    KEYGUARD_NOT_SET(2),
    PHENOTYPE_SYNC_FAILURE(3),
    RPC_FAILURE(4),
    NOT_TAP_AND_PAY_COUNTRY(5),
    HCE_NOT_SUPPORTED(6),
    FLAG_TURNED_DOWN(7),
    CHILD_USER(8),
    UNRECOGNIZED(-1);

    private final int l;

    private hkcq(int v1) {
        this.l = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hkcq.j) {
            return this.l;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hkcq b(int v) {
        switch(v) {
            case 0: {
                return hkcq.a;
            }
            case 1: {
                return hkcq.b;
            }
            case 2: {
                return hkcq.c;
            }
            case 3: {
                return hkcq.d;
            }
            case 4: {
                return hkcq.e;
            }
            case 5: {
                return hkcq.f;
            }
            case 6: {
                return hkcq.g;
            }
            case 7: {
                return hkcq.h;
            }
            case 8: {
                return hkcq.i;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.l);
    }
}

