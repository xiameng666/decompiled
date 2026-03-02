public enum hdhk implements hfub {
    LAYOUT_MODE_UNKNOWN(0),
    LAYOUT_MODE_RELATIVE(1),
    LAYOUT_MODE_FLEX(2),
    LAYOUT_MODE_FLEX_DEPRECATED(5),
    LAYOUT_MODE_GRID(3),
    LAYOUT_MODE_FLOAT(4),
    LAYOUT_MODE_GLIF_ICON_CONTAINER(6),
    LAYOUT_MODE_GLIF_HEADER_CONTAINER(7);

    public final int i;

    private hdhk(int v1) {
        this.i = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.i;
    }

    public static hdhk b(int v) {
        switch(v) {
            case 0: {
                return hdhk.a;
            }
            case 1: {
                return hdhk.b;
            }
            case 2: {
                return hdhk.c;
            }
            case 3: {
                return hdhk.e;
            }
            case 4: {
                return hdhk.f;
            }
            case 5: {
                return hdhk.d;
            }
            case 6: {
                return hdhk.g;
            }
            case 7: {
                return hdhk.h;
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

