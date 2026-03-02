public enum cqgx implements hfub {
    UNKNOWN(0),
    PROFILE_SYNC(1),
    WIPEOUT(2),
    @Deprecated
    GIS_SYNC(3);

    public final int e;

    private cqgx(int v1) {
        this.e = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.e;
    }

    public static cqgx b(int v) {
        switch(v) {
            case 0: {
                return cqgx.a;
            }
            case 1: {
                return cqgx.b;
            }
            case 2: {
                return cqgx.c;
            }
            case 3: {
                return cqgx.d;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}

