public enum gtas implements hfub {
    FMDN_DISABLED_DEFAULT(0),
    FMDN_CONTRIBUTOR_HIGH_TRAFFIC(3),
    FMDN_CONTRIBUTOR_ALL_LOCATIONS(4),
    FMDN_HIGH_TRAFFIC(1),
    FMDN_ALL_LOCATIONS(2),
    UNRECOGNIZED(-1);

    private final int h;

    private gtas(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gtas.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static gtas b(int v) {
        switch(v) {
            case 0: {
                return gtas.a;
            }
            case 1: {
                return gtas.d;
            }
            case 2: {
                return gtas.e;
            }
            case 3: {
                return gtas.b;
            }
            case 4: {
                return gtas.c;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}

