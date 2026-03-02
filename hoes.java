public enum hoes implements hfub {
    UNSPECIFIED(0),
    LEGACY_DPNV(1),
    PNVR(2),
    NOT_ALLOWED(3),
    UNRECOGNIZED(-1);

    private final int g;

    private hoes(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hoes.e) {
            return this.g;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hoes b(int v) {
        switch(v) {
            case 0: {
                return hoes.a;
            }
            case 1: {
                return hoes.b;
            }
            case 2: {
                return hoes.c;
            }
            case 3: {
                return hoes.d;
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

