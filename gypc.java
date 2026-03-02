public enum gypc implements hfub {
    FP_UNKNOWN(0),
    FP_BT_CONNECT_GATT(1),
    FP_KEY_BASED_PAIRING(2),
    FP_DEVICE_ACTION_FOR_GROUP(3),
    FP_BT_CREATE_BOND(4),
    FP_BT_PAIRING_REQUEST(5),
    FP_PASSKEY(6),
    FP_BT_BONDED(7),
    FP_ACCOUNT_KEY(8),
    FP_BT_CSIS_AVAILABLE(9),
    FP_PAIR_SUMMARY(10);

    public final int l;

    private gypc(int v1) {
        this.l = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.l;
    }

    public static gypc b(int v) {
        switch(v) {
            case 0: {
                return gypc.a;
            }
            case 1: {
                return gypc.b;
            }
            case 2: {
                return gypc.c;
            }
            case 3: {
                return gypc.d;
            }
            case 4: {
                return gypc.e;
            }
            case 5: {
                return gypc.f;
            }
            case 6: {
                return gypc.g;
            }
            case 7: {
                return gypc.h;
            }
            case 8: {
                return gypc.i;
            }
            case 9: {
                return gypc.j;
            }
            case 10: {
                return gypc.k;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.l);
    }
}

