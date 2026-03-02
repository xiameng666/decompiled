public enum ghxn implements hfub {
    UNKNOWN_ACTION(0),
    CLICK_AGREE(1),
    CLICK_CANCEL(2);

    public final int d;

    private ghxn(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static ghxn b(int v) {
        switch(v) {
            case 0: {
                return ghxn.a;
            }
            case 1: {
                return ghxn.b;
            }
            case 2: {
                return ghxn.c;
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

