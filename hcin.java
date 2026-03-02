public enum hcin implements hfub {
    COMPRESSION_TYPE_UNKNOWN(0),
    COMPRESSION_TYPE_IDENTITY(1),
    COMPRESSION_TYPE_ZSTD(2),
    COMPRESSION_TYPE_BROTLI(3),
    UNRECOGNIZED(-1);

    private final int g;

    private hcin(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hcin.e) {
            return this.g;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hcin b(int v) {
        switch(v) {
            case 0: {
                return hcin.a;
            }
            case 1: {
                return hcin.b;
            }
            case 2: {
                return hcin.c;
            }
            case 3: {
                return hcin.d;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}

