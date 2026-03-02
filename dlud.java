public enum dlud implements hfub {
    UNKNOWN_ACTION(0),
    IMPRESSION(1),
    DISMISS(2),
    CLICK(3),
    ACKNOWLEDGE(4),
    UNRECOGNIZED(-1);

    private final int h;

    private dlud(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != dlud.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static dlud b(int v) {
        switch(v) {
            case 0: {
                return dlud.a;
            }
            case 1: {
                return dlud.b;
            }
            case 2: {
                return dlud.c;
            }
            case 3: {
                return dlud.d;
            }
            case 4: {
                return dlud.e;
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

