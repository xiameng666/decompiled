public enum gsgk implements hfub {
    RETENTION_WINDOW_DAYS_UNSPECIFIED(0),
    RETENTION_WINDOW_DAYS_30(30),
    RETENTION_WINDOW_DAYS_90(90),
    RETENTION_WINDOW_DAYS_540(540),
    RETENTION_WINDOW_DAYS_1080(1080),
    RETENTION_WINDOW_DAYS_INDEFINITE(0x7FFFFFFF);

    public final int g;

    private gsgk(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.g;
    }

    public static gsgk b(int v) {
        switch(v) {
            case 0: {
                return gsgk.a;
            }
            case 30: {
                return gsgk.b;
            }
            case 90: {
                return gsgk.c;
            }
            case 540: {
                return gsgk.d;
            }
            case 1080: {
                return gsgk.e;
            }
            case 0x7FFFFFFF: {
                return gsgk.f;
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

