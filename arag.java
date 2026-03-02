public enum arag implements hfub {
    CHUNK_ORDERING_TYPE_UNSPECIFIED(0),
    EXPLICIT_STARTS(1),
    INLINE_LENGTHS(2);

    public final int d;

    private arag(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static arag b(int v) {
        switch(v) {
            case 0: {
                return arag.a;
            }
            case 1: {
                return arag.b;
            }
            case 2: {
                return arag.c;
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

