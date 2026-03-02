public enum hkhm implements hfub {
    UNKNOWN_TYPE(0),
    CARD(1),
    SECURE_ELEMENT_CARD(2),
    BANK_ACCOUNT(3),
    PAYPAL(4),
    STORED_VALUE_CLOSED_LOOP(6),
    STORED_VALUE_OPEN_LOOP(9),
    PAYCACHE(7),
    PAYNOW(8),
    OTHER(5),
    UNRECOGNIZED(-1);

    private final int m;

    private hkhm(int v1) {
        this.m = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hkhm.k) {
            return this.m;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hkhm b(int v) {
        switch(v) {
            case 0: {
                return hkhm.a;
            }
            case 1: {
                return hkhm.b;
            }
            case 2: {
                return hkhm.c;
            }
            case 3: {
                return hkhm.d;
            }
            case 4: {
                return hkhm.e;
            }
            case 5: {
                return hkhm.j;
            }
            case 6: {
                return hkhm.f;
            }
            case 7: {
                return hkhm.h;
            }
            case 8: {
                return hkhm.i;
            }
            case 9: {
                return hkhm.g;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.m);
    }
}

