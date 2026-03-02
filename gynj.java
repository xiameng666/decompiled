public enum gynj implements hfub {
    ENTRY_UNKNOWN(0),
    ENTRY_FAST_PAIR(1),
    ENTRY_SETTINGS(2);

    public final int d;

    private gynj(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static gynj b(int v) {
        switch(v) {
            case 0: {
                return gynj.a;
            }
            case 1: {
                return gynj.b;
            }
            case 2: {
                return gynj.c;
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

