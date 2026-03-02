public enum gjze implements hfub {
    UNKNOWN_ACTIVATION_METHOD_TYPE(0),
    SMS(1),
    EMAIL(2),
    PLACE_CALL(3),
    RECEIVE_CALL(4),
    WEB_URL(5),
    APP(6),
    ISSUER_STATEMENT(7);

    public final int i;

    private gjze(int v1) {
        this.i = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.i;
    }

    public static gjze b(int v) {
        switch(v) {
            case 0: {
                return gjze.a;
            }
            case 1: {
                return gjze.b;
            }
            case 2: {
                return gjze.c;
            }
            case 3: {
                return gjze.d;
            }
            case 4: {
                return gjze.e;
            }
            case 5: {
                return gjze.f;
            }
            case 6: {
                return gjze.g;
            }
            case 7: {
                return gjze.h;
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

