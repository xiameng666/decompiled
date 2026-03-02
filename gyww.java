public enum gyww implements hfub {
    UNKNOWN_CONNECTION_ATTEMPT_TYPE(0),
    INITIAL(1),
    UPGRADE(2),
    RECONNECT(3);

    public final int e;

    private gyww(int v1) {
        this.e = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.e;
    }

    public static gyww b(int v) {
        switch(v) {
            case 0: {
                return gyww.a;
            }
            case 1: {
                return gyww.b;
            }
            case 2: {
                return gyww.c;
            }
            case 3: {
                return gyww.d;
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

