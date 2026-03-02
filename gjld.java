public enum gjld implements hfub {
    DEFAULT(0),
    HEADLESS(1),
    RESTORE_ANYTIME(2),
    COSMIC_RAY(3),
    OS_MIGRATION(4);

    public final int f;

    private gjld(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static gjld b(int v) {
        switch(v) {
            case 0: {
                return gjld.a;
            }
            case 1: {
                return gjld.b;
            }
            case 2: {
                return gjld.c;
            }
            case 3: {
                return gjld.d;
            }
            case 4: {
                return gjld.e;
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

