public enum hnsv implements hfub {
    UNKNOWN(0),
    CUSTOM_VALUE(1),
    TEXT(2),
    PHOTO(3),
    AUDIO(4),
    VIDEO(5),
    EVENT(6),
    RICH_TEXT(7),
    CHIPS_ONLY(8),
    RICH_CARD(9),
    UNRECOGNIZED(-1);

    private final int m;

    private hnsv(int v1) {
        this.m = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hnsv.k) {
            return this.m;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hnsv b(int v) {
        switch(v) {
            case 0: {
                return hnsv.a;
            }
            case 1: {
                return hnsv.b;
            }
            case 2: {
                return hnsv.c;
            }
            case 3: {
                return hnsv.d;
            }
            case 4: {
                return hnsv.e;
            }
            case 5: {
                return hnsv.f;
            }
            case 6: {
                return hnsv.g;
            }
            case 7: {
                return hnsv.h;
            }
            case 8: {
                return hnsv.i;
            }
            case 9: {
                return hnsv.j;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.m);
    }
}

