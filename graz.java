public enum graz implements hfub {
    UNKNOWN(0),
    COMPROMISED(1),
    WEAK(2),
    REUSE(3);

    public final int e;

    private graz(int v1) {
        this.e = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.e;
    }

    public static graz b(int v) {
        switch(v) {
            case 0: {
                return graz.a;
            }
            case 1: {
                return graz.b;
            }
            case 2: {
                return graz.c;
            }
            case 3: {
                return graz.d;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}

