public enum cyjn implements hfub {
    CONNECTION_STATE_UNKNOWN(0),
    CONNECTION_STATE_NO_CONNECTION(1),
    CONNECTION_STATE_PAGING(2),
    CONNECTION_STATE_CONNECTED_IDLE(3),
    CONNECTION_STATE_CONNECTED_DATA_TRANSFER(4),
    CONNECTION_STATE_A2DP_ONLY(5),
    CONNECTION_STATE_A2DP_WITH_AVRCP(6),
    CONNECTION_STATE_HFP(7),
    CONNECTION_STATE_LE_MEDIA_WITHOUT_CONTROL(8),
    CONNECTION_STATE_LE_MEDIA(9),
    CONNECTION_STATE_LE_CALL(10),
    CONNECTION_STATE_LE_BIS(11),
    CONNECTION_STATE_DISABLE(12),
    @Deprecated
    CONNECTION_STATE_KEY_IS_MOST_RECENTLY_CONNECTED(13);

    public final int o;

    private cyjn(int v1) {
        this.o = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.o;
    }

    public static cyjn b(int v) {
        switch(v) {
            case 0: {
                return cyjn.a;
            }
            case 1: {
                return cyjn.b;
            }
            case 2: {
                return cyjn.c;
            }
            case 3: {
                return cyjn.d;
            }
            case 4: {
                return cyjn.e;
            }
            case 5: {
                return cyjn.f;
            }
            case 6: {
                return cyjn.g;
            }
            case 7: {
                return cyjn.h;
            }
            case 8: {
                return cyjn.i;
            }
            case 9: {
                return cyjn.j;
            }
            case 10: {
                return cyjn.k;
            }
            case 11: {
                return cyjn.l;
            }
            case 12: {
                return cyjn.m;
            }
            case 13: {
                return cyjn.n;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.o);
    }
}

