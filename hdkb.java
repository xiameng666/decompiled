public enum hdkb implements hfub {
    RESULTING_ACTION_TYPE_UNKNOWN(0),
    RESULTING_ACTION_TYPE_NEW_STATE(1),
    RESULTING_ACTION_TYPE_PLAY_TO_PROGRESS(2);

    public final int d;

    private hdkb(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static hdkb b(int v) {
        switch(v) {
            case 0: {
                return hdkb.a;
            }
            case 1: {
                return hdkb.b;
            }
            case 2: {
                return hdkb.c;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}

