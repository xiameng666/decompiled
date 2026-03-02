public enum gycb implements hfub {
    UNKNOWN_EVENT_TYPE(0),
    PAYLOAD_ERROR(1),
    PAYLOAD_CANCELED(2),
    @Deprecated
    PAYLOAD_RECEIVED_ACK(3);

    public final int e;

    private gycb(int v1) {
        this.e = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.e;
    }

    public static gycb b(int v) {
        switch(v) {
            case 0: {
                return gycb.a;
            }
            case 1: {
                return gycb.b;
            }
            case 2: {
                return gycb.c;
            }
            case 3: {
                return gycb.d;
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

