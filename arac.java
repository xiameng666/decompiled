public enum arac implements hfub {
    UNKNOWN_CHECKSUM_TYPE(0),
    SHA_256(1);

    public final int c;

    private arac(int v1) {
        this.c = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.c;
    }

    public static arac b(int v) {
        switch(v) {
            case 0: {
                return arac.a;
            }
            case 1: {
                return arac.b;
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

