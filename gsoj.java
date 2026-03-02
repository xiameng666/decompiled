public enum gsoj implements hfub {
    GCORE_MSG_TYPE_UNSPECIFIED(0),
    GCORE_MSG_TYPE_PLAN_STATUS_UPDATED(1),
    GCORE_MSG_TYPE_UPSELL_OFFER(2),
    GCORE_MSG_TYPE_ACCOUNT_ALERT(3),
    GCORE_MSG_TYPE_OUT_OF_DATA(4),
    GCORE_MSG_TYPE_EXPIRATION_REMINDER(5),
    GCORE_MSG_TYPE_BALANCE_UPDATE(6),
    GCORE_MSG_TYPE_PURCHASE(7),
    GCORE_MSG_TYPE_SETUP(8),
    GCORE_MSG_TYPE_DAILY_UPDATE(9),
    GCORE_MSG_TYPE_PAYGO(10),
    GCORE_MSG_TYPE_OTHER(100),
    GCORE_MSG_TYPE_HIDDEN(101),
    GCORE_MSG_TYPE_SUBGRAPH_SDK_NOTIFICATION(102),
    GCORE_MSG_TYPE_ESIM_CODE(103),
    GCORE_MSG_TYPE_ESIM_ACCOUNT(104),
    UNRECOGNIZED(-1);

    private final int s;

    private gsoj(int v1) {
        this.s = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gsoj.q) {
            return this.s;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static gsoj b(int v) {
        switch(v) {
            case 0: {
                return gsoj.a;
            }
            case 1: {
                return gsoj.b;
            }
            case 2: {
                return gsoj.c;
            }
            case 3: {
                return gsoj.d;
            }
            case 4: {
                return gsoj.e;
            }
            case 5: {
                return gsoj.f;
            }
            case 6: {
                return gsoj.g;
            }
            case 7: {
                return gsoj.h;
            }
            case 8: {
                return gsoj.i;
            }
            case 9: {
                return gsoj.j;
            }
            case 10: {
                return gsoj.k;
            }
            case 100: {
                return gsoj.l;
            }
            case 101: {
                return gsoj.m;
            }
            case 102: {
                return gsoj.n;
            }
            case 103: {
                return gsoj.o;
            }
            case 104: {
                return gsoj.p;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.s);
    }
}

