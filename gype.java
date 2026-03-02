public enum gype implements hfub {
    PAIRING_TYPE_UNSPECIFIED(0),
    INITIAL(1),
    SUBSEQUENT(2),
    RETROACTIVE(3),
    INCREMENTAL(4);

    public final int f;

    private gype(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static gype b(int v) {
        switch(v) {
            case 0: {
                return gype.a;
            }
            case 1: {
                return gype.b;
            }
            case 2: {
                return gype.c;
            }
            case 3: {
                return gype.d;
            }
            case 4: {
                return gype.e;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

