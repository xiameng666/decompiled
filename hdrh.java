public enum hdrh implements hfub {
    RELATIVE_ALIGNMENT_UNKNOWN(0),
    RELATIVE_ALIGNMENT_PARENT_START(1),
    RELATIVE_ALIGNMENT_PARENT_CENTER(3),
    RELATIVE_ALIGNMENT_PARENT_END(2);

    public final int e;

    private hdrh(int v1) {
        this.e = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.e;
    }

    public static hdrh b(int v) {
        switch(v) {
            case 0: {
                return hdrh.a;
            }
            case 1: {
                return hdrh.b;
            }
            case 2: {
                return hdrh.d;
            }
            case 3: {
                return hdrh.c;
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

