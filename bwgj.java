public enum bwgj implements hfub {
    UNKNOWN(0),
    FAR(1),
    CLOSE(2),
    IN(3),
    DWELL(4);

    public final int f;

    private bwgj(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static bwgj b(int v) {
        switch(v) {
            case 0: {
                return bwgj.a;
            }
            case 1: {
                return bwgj.b;
            }
            case 2: {
                return bwgj.c;
            }
            case 3: {
                return bwgj.d;
            }
            case 4: {
                return bwgj.e;
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

