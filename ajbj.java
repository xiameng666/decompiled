public enum ajbj implements hfub {
    UNKNOWN(0),
    NOTIFIED(1);

    public final int c;

    private ajbj(int v1) {
        this.c = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.c;
    }

    public static ajbj b(int v) {
        switch(v) {
            case 0: {
                return ajbj.a;
            }
            case 1: {
                return ajbj.b;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.c);
    }
}

