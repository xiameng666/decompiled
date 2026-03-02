public enum gyun implements hfub {
    UNKNOWN_FRAME_TYPE(0),
    HOST_NETWORK(1),
    NETWORK_AVAILABLE(2),
    IP_AVAILABLE(3),
    CANCELLATION(4);

    public final int f;

    private gyun(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static gyun b(int v) {
        switch(v) {
            case 0: {
                return gyun.a;
            }
            case 1: {
                return gyun.b;
            }
            case 2: {
                return gyun.c;
            }
            case 3: {
                return gyun.d;
            }
            case 4: {
                return gyun.e;
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

