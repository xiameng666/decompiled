public enum hodo implements hfub {
    UNKNOWN(0),
    CONSENTED(1),
    NO_CONSENT(2),
    EXPIRED(3),
    UNRECOGNIZED(-1);

    private final int g;

    private hodo(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hodo.e) {
            return this.g;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hodo b(int v) {
        switch(v) {
            case 0: {
                return hodo.a;
            }
            case 1: {
                return hodo.b;
            }
            case 2: {
                return hodo.c;
            }
            case 3: {
                return hodo.d;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}

