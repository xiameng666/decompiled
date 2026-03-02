public enum gywt implements hfub {
    UNKNOWN_CONNECTION_ATTEMPT_DIRECTION(0),
    INCOMING(1),
    OUTGOING(2);

    public final int d;

    private gywt(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static gywt b(int v) {
        switch(v) {
            case 0: {
                return gywt.a;
            }
            case 1: {
                return gywt.b;
            }
            case 2: {
                return gywt.c;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}

