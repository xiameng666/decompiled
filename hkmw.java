public enum hkmw implements hfub {
    UNKNOWN(0),
    NO_DISCLAIMER(1),
    TOKENIZED(2),
    PLASTIC(3),
    UNRECOGNIZED(-1);

    private final int g;

    private hkmw(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hkmw.e) {
            return this.g;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hkmw b(int v) {
        switch(v) {
            case 0: {
                return hkmw.a;
            }
            case 1: {
                return hkmw.b;
            }
            case 2: {
                return hkmw.c;
            }
            case 3: {
                return hkmw.d;
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

