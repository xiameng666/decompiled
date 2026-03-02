public enum ctec implements hfub {
    SETTING_STATUS_UNSPECIFIED(0),
    DEFAULT_ENABLED(1),
    USER_ENABLED(2),
    DEFAULT_DISABLED(3),
    USER_DISABLED(4),
    UNRECOGNIZED(-1);

    private final int h;

    private ctec(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != ctec.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static ctec b(int v) {
        switch(v) {
            case 0: {
                return ctec.a;
            }
            case 1: {
                return ctec.b;
            }
            case 2: {
                return ctec.c;
            }
            case 3: {
                return ctec.d;
            }
            case 4: {
                return ctec.e;
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

