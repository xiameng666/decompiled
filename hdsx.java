public enum hdsx implements hfub {
    FONT_WEIGHT_UNKNOWN(0),
    FONT_WEIGHT_LIGHT(1),
    FONT_WEIGHT_NORMAL(2),
    FONT_WEIGHT_LIGHT_BOLD(3),
    FONT_WEIGHT_SEMI_BOLD(7),
    FONT_WEIGHT_BOLD(4),
    FONT_WEIGHT_DARK_BOLD(5),
    FONT_WEIGHT_DARKEST_BOLD(6);

    public final int i;

    private hdsx(int v1) {
        this.i = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.i;
    }

    public static hdsx b(int v) {
        switch(v) {
            case 0: {
                return hdsx.a;
            }
            case 1: {
                return hdsx.b;
            }
            case 2: {
                return hdsx.c;
            }
            case 3: {
                return hdsx.d;
            }
            case 4: {
                return hdsx.f;
            }
            case 5: {
                return hdsx.g;
            }
            case 6: {
                return hdsx.h;
            }
            case 7: {
                return hdsx.e;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }
}

