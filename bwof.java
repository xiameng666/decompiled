public enum bwof implements hfub {
    UNSET(0),
    DISABLED(1),
    ENABLED(2);

    public final int d;

    private bwof(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static bwof b(int v) {
        switch(v) {
            case 0: {
                return bwof.a;
            }
            case 1: {
                return bwof.b;
            }
            case 2: {
                return bwof.c;
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

