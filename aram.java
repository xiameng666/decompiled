public enum aram implements hfub {
    COMPRESSION_UNSPECIFIED(0),
    NONE(1),
    DEFLATE(2);

    public final int d;

    private aram(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static aram b(int v) {
        switch(v) {
            case 0: {
                return aram.a;
            }
            case 1: {
                return aram.b;
            }
            case 2: {
                return aram.c;
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

