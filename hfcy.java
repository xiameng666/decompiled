public enum hfcy implements hfub {
    UNKNOWN(0),
    DISCONNECTED(1),
    CONNECTED_USB(2),
    CONNECTED_AC(3),
    CONNECTED_WIRELESS(4);

    public final int f;

    private hfcy(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static hfcy b(int v) {
        switch(v) {
            case 0: {
                return hfcy.a;
            }
            case 1: {
                return hfcy.b;
            }
            case 2: {
                return hfcy.c;
            }
            case 3: {
                return hfcy.d;
            }
            case 4: {
                return hfcy.e;
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

