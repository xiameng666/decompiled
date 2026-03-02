public enum gzex implements hfub {
    ASSISTANT_SUPPORTED_LEA_CAPABILITY_UNSPECIFIED(0),
    LEA_ALLOWLISTED(1),
    LEA_SUPPORTED(2),
    LEA_NOT_SUPPORTED(3),
    UNRECOGNIZED(-1);

    private final int g;

    private gzex(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gzex.e) {
            return this.g;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static gzex b(int v) {
        switch(v) {
            case 0: {
                return gzex.a;
            }
            case 1: {
                return gzex.b;
            }
            case 2: {
                return gzex.c;
            }
            case 3: {
                return gzex.d;
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

