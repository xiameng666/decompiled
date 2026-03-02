public enum gszv implements hfub {
    BEACON_TYPE_DEFAULT_TAG(0),
    BEACON_TYPE_EMBEDDED(1),
    BEACON_TYPE_SELF_REPORT_ONLY(2),
    BEACON_TYPE_SELF_REPORT_OR_ADVERTISING(3),
    BEACON_TYPE_NON_ADVERTISING_ACCESSORY(4),
    BEACON_TYPE_WEAR_ADVERTISING(5),
    BEACON_TYPE_WEAR_NON_ADVERTISING(6),
    UNRECOGNIZED(-1);

    private final int j;

    private gszv(int v1) {
        this.j = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gszv.h) {
            return this.j;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static gszv b(int v) {
        switch(v) {
            case 0: {
                return gszv.a;
            }
            case 1: {
                return gszv.b;
            }
            case 2: {
                return gszv.c;
            }
            case 3: {
                return gszv.d;
            }
            case 4: {
                return gszv.e;
            }
            case 5: {
                return gszv.f;
            }
            case 6: {
                return gszv.g;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.j);
    }
}

