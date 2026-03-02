public enum gzqw implements hfub {
    UNSPECIFIED_FINALIZATION_STATUS(0),
    STABILIZED(1),
    FINALIZED(2),
    USER_EDITED(3),
    BACKFILLED(4);

    public final int f;

    private gzqw(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static gzqw b(int v) {
        switch(v) {
            case 0: {
                return gzqw.a;
            }
            case 1: {
                return gzqw.b;
            }
            case 2: {
                return gzqw.c;
            }
            case 3: {
                return gzqw.d;
            }
            case 4: {
                return gzqw.e;
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

