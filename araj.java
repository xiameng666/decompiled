public enum araj implements hfub {
    UNKNOWN_CIPHER_TYPE(0),
    AES_256_GCM(1);

    public final int c;

    private araj(int v1) {
        this.c = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.c;
    }

    public static araj b(int v) {
        switch(v) {
            case 0: {
                return araj.a;
            }
            case 1: {
                return araj.b;
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

