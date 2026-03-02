public enum gyxw implements hfub {
    UNKNOWN_SESSION_ROLE(0),
    ADVERTISER(1),
    DISCOVERER(2);

    public final int d;

    private gyxw(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static gyxw b(int v) {
        switch(v) {
            case 0: {
                return gyxw.a;
            }
            case 1: {
                return gyxw.b;
            }
            case 2: {
                return gyxw.c;
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

