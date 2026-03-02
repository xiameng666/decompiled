public enum hobg implements hfub {
    UNKNOWN_CLIENT(0),
    CONSTELLATION(1),
    RCS(2),
    ONE_TIME_VERIFICATION(3),
    UNRECOGNIZED(-1);

    private final int g;

    private hobg(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hobg.e) {
            return this.g;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hobg b(int v) {
        switch(v) {
            case 0: {
                return hobg.a;
            }
            case 1: {
                return hobg.b;
            }
            case 2: {
                return hobg.c;
            }
            case 3: {
                return hobg.d;
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

