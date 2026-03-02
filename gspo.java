public enum gspo implements hfub {
    PLAN_TYPE_UNSPECIFIED(0),
    GENERIC(1),
    VDP(2),
    COMPOSITE(3),
    GOOGLE_ONE_MEMBERSHIP(4),
    QOE_METRICS(5),
    UNRECOGNIZED(-1);

    private final int i;

    private gspo(int v1) {
        this.i = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gspo.g) {
            return this.i;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static gspo b(int v) {
        switch(v) {
            case 0: {
                return gspo.a;
            }
            case 1: {
                return gspo.b;
            }
            case 2: {
                return gspo.c;
            }
            case 3: {
                return gspo.d;
            }
            case 4: {
                return gspo.e;
            }
            case 5: {
                return gspo.f;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }
}

