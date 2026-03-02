public enum hknk implements hfub {
    UNKNOWN_TIME_PRECISION(0),
    SECOND(1),
    DAY(2),
    MONTH(3),
    UNRECOGNIZED(-1);

    private final int g;

    private hknk(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hknk.e) {
            return this.g;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hknk b(int v) {
        switch(v) {
            case 0: {
                return hknk.a;
            }
            case 1: {
                return hknk.b;
            }
            case 2: {
                return hknk.c;
            }
            case 3: {
                return hknk.d;
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

