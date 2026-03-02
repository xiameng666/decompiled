public enum ascs implements hfub {
    WALLET_DATA_TYPE_UNSPECIFIED(0),
    TRANSIT(1),
    FELICA_TRANSIT(2);

    public final int d;

    private ascs(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static ascs b(int v) {
        switch(v) {
            case 0: {
                return ascs.a;
            }
            case 1: {
                return ascs.b;
            }
            case 2: {
                return ascs.c;
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

