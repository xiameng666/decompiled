public enum res implements hfub {
    UNKNOWN_PERIOD(0),
    EVERY_24_HOURS(5),
    EVERY_4_HOURS(1),
    EVERY_1_HOUR(2),
    EVERY_30_MINUTES(3),
    EVERY_10_MINUTES(4),
    NEVER(6);

    public final int h;

    private res(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.h;
    }

    public static res b(int v) {
        switch(v) {
            case 0: {
                return res.a;
            }
            case 1: {
                return res.c;
            }
            case 2: {
                return res.d;
            }
            case 3: {
                return res.e;
            }
            case 4: {
                return res.f;
            }
            case 5: {
                return res.b;
            }
            case 6: {
                return res.g;
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

