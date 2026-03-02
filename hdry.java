public enum hdry implements hfub {
    NODE_STATE_UNKNOWN(0),
    NODE_STATE_DISABLED(1),
    NODE_STATE_FOCUSED(2),
    NODE_STATE_HOVER(4),
    NODE_STATE_TOUCHED(8),
    NODE_STATE_INVALID(16);

    public final int g;

    private hdry(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.g;
    }

    public static hdry b(int v) {
        switch(v) {
            case 0: {
                return hdry.a;
            }
            case 1: {
                return hdry.b;
            }
            case 2: {
                return hdry.c;
            }
            case 4: {
                return hdry.d;
            }
            case 8: {
                return hdry.e;
            }
            case 16: {
                return hdry.f;
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

