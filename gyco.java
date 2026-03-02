public enum gyco implements hfub {
    UNKNOWN_FRAME_TYPE(0),
    CONNECTION_REQUEST(1),
    CONNECTION_RESPONSE(2),
    PAYLOAD_TRANSFER(3),
    BANDWIDTH_UPGRADE_NEGOTIATION(4),
    KEEP_ALIVE(5),
    DISCONNECTION(6),
    PAIRED_KEY_ENCRYPTION(7),
    AUTHENTICATION_MESSAGE(8),
    AUTHENTICATION_RESULT(9),
    AUTO_RESUME(10),
    AUTO_RECONNECT(11),
    BANDWIDTH_UPGRADE_RETRY(12);

    public final int n;

    private gyco(int v1) {
        this.n = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.n;
    }

    public static gyco b(int v) {
        switch(v) {
            case 0: {
                return gyco.a;
            }
            case 1: {
                return gyco.b;
            }
            case 2: {
                return gyco.c;
            }
            case 3: {
                return gyco.d;
            }
            case 4: {
                return gyco.e;
            }
            case 5: {
                return gyco.f;
            }
            case 6: {
                return gyco.g;
            }
            case 7: {
                return gyco.h;
            }
            case 8: {
                return gyco.i;
            }
            case 9: {
                return gyco.j;
            }
            case 10: {
                return gyco.k;
            }
            case 11: {
                return gyco.l;
            }
            case 12: {
                return gyco.m;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.n);
    }
}

