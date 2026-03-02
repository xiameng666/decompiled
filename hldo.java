public enum hldo implements hfub {
    RAW(0),
    DERIVED(1),
    @Deprecated
    CLEANED(2),
    @Deprecated
    CONVERTED(3);

    public final int e;

    private hldo(int v1) {
        this.e = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.e;
    }

    public static hldo b(int v) {
        switch(v) {
            case 0: {
                return hldo.a;
            }
            case 1: {
                return hldo.b;
            }
            case 2: {
                return hldo.c;
            }
            case 3: {
                return hldo.d;
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

