public enum hobl implements hfub {
    UNKNOWN(0),
    MO_SMS(1),
    MT_SMS(2),
    CARRIER_ID(3),
    IMSI_LOOKUP(5),
    REGISTERED_SMS(7),
    FLASH_CALL(8),
    TS43(11),
    UNRECOGNIZED(-1);

    private final int k;

    private hobl(int v1) {
        this.k = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hobl.i) {
            return this.k;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hobl b(int v) {
        switch(v) {
            case 0: {
                return hobl.a;
            }
            case 1: {
                return hobl.b;
            }
            case 2: {
                return hobl.c;
            }
            case 3: {
                return hobl.d;
            }
            case 5: {
                return hobl.e;
            }
            case 7: {
                return hobl.f;
            }
            case 8: {
                return hobl.g;
            }
            case 11: {
                return hobl.h;
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

