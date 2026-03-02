public enum gzrc implements hfub {
    UNSPECIFIED_TIMELINE_DISPLAY_MODE(0),
    DEFAULT_UI(1),
    CONFIRM_UI(2),
    NEIGHBORHOOD_UI(3),
    PLATINUM_EDIT_UI(4);

    public final int f;

    private gzrc(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static gzrc b(int v) {
        switch(v) {
            case 0: {
                return gzrc.a;
            }
            case 1: {
                return gzrc.b;
            }
            case 2: {
                return gzrc.c;
            }
            case 3: {
                return gzrc.d;
            }
            case 4: {
                return gzrc.e;
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

