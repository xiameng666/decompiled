public enum gzgn implements hfub {
    UNKNOWN_TYPE(0),
    HOME(1),
    WORK(2),
    ALIASED_LOCATION(3),
    USER_TOP_PLACE(4);

    public final int f;

    private gzgn(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static gzgn b(int v) {
        switch(v) {
            case 0: {
                return gzgn.a;
            }
            case 1: {
                return gzgn.b;
            }
            case 2: {
                return gzgn.c;
            }
            case 3: {
                return gzgn.d;
            }
            case 4: {
                return gzgn.e;
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

