public enum gymt implements hfub {
    DUPLICATE_ACCEPTING_CONNECTION_REQUESTED(0x1F),
    OPEN_GATT_SERVER_FAILED(0x20),
    ACCEPT_GATT_CONNECTION_FAILED(33),
    ACCEPT_L2CAP_CONNECTION_FAILED(34),
    CREATE_GATT_SERVER_SOCKET_NOT_READY(35),
    ACCEPT_CONNECTION_FAILED(36),
    CREATE_SERVER_SOCKET_FAILED(37),
    UNKNOWN_START_LISTENING_INCOMING_CONNECTION_ERROR(38),
    ACCEPT_SEND_AWARE_L2_MESSAGE_FAILED(39),
    ACCEPT_RECEIVE_AWARE_L2_MESSAGE_FAILED(40);

    public final int k;

    private gymt(int v1) {
        this.k = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.k;
    }

    public static gymt b(int v) {
        switch(v) {
            case 0x1F: {
                return gymt.a;
            }
            case 0x20: {
                return gymt.b;
            }
            case 33: {
                return gymt.c;
            }
            case 34: {
                return gymt.d;
            }
            case 35: {
                return gymt.e;
            }
            case 36: {
                return gymt.f;
            }
            case 37: {
                return gymt.g;
            }
            case 38: {
                return gymt.h;
            }
            case 39: {
                return gymt.i;
            }
            case 40: {
                return gymt.j;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.k);
    }
}

