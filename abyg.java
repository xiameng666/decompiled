public enum abyg implements hfub {
    UNKNOWN(0),
    STARTUP(1),
    TELEDOCTOR(2),
    UNRECOGNIZED(-1);

    private final int f;

    private abyg(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != abyg.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static abyg b(int v) {
        switch(v) {
            case 0: {
                return abyg.a;
            }
            case 1: {
                return abyg.b;
            }
            case 2: {
                return abyg.c;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

