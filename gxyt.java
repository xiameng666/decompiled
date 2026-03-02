public enum gxyt implements hfub {
    UNKNOWN_FRAME_TYPE(0),
    DEVICE_CAPABILITY_REQUEST(1),
    DEVICE_CAPABILITY_RESPONSE(2),
    DEVICE_INFO_REQUEST(3),
    DEVICE_INFO_RESPONSE(4),
    WIFI_CREDENTIAL_REQUEST(5),
    WIFI_CREDENTIAL_RESPONSE(6),
    MEDIUM_NEGOTIATION_REQUEST(7),
    MEDIUM_NEGOTIATION_RESPONSE(8),
    MEDIUM_CLOSURE_REQUEST(9),
    MEDIUM_CLOSURE_RESPONSE(10),
    DISCONNECTION_REQUEST(11),
    DISCONNECTION_RESPONSE(12),
    PAYLOAD(13),
    DEVICE_INTEGRITY_START_REQUEST(14),
    DEVICE_INTEGRITY_START_RESPONSE(15),
    DEVICE_INTEGRITY_ATTESTATION(16),
    DEVICE_INTEGRITY_ATTESTATION_ACK(17),
    UNRECOGNIZED(-1);

    private final int u;

    private gxyt(int v1) {
        this.u = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gxyt.s) {
            return this.u;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static gxyt b(int v) {
        switch(v) {
            case 0: {
                return gxyt.a;
            }
            case 1: {
                return gxyt.b;
            }
            case 2: {
                return gxyt.c;
            }
            case 3: {
                return gxyt.d;
            }
            case 4: {
                return gxyt.e;
            }
            case 5: {
                return gxyt.f;
            }
            case 6: {
                return gxyt.g;
            }
            case 7: {
                return gxyt.h;
            }
            case 8: {
                return gxyt.i;
            }
            case 9: {
                return gxyt.j;
            }
            case 10: {
                return gxyt.k;
            }
            case 11: {
                return gxyt.l;
            }
            case 12: {
                return gxyt.m;
            }
            case 13: {
                return gxyt.n;
            }
            case 14: {
                return gxyt.o;
            }
            case 15: {
                return gxyt.p;
            }
            case 16: {
                return gxyt.q;
            }
            case 17: {
                return gxyt.r;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.u);
    }
}

