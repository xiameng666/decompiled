public enum hkua implements hfub {
    UNKNOWN_TICKET_TYPE(0),
    VALUE_ON_CARD(1),
    SINGLE_USE_TICKET(2),
    MULTIPLE_USE_TICKET(3),
    CARNET(4),
    TICKET_TYPE_SINGLE_USE_TICKET_UPGRADE(5),
    TICKET_TYPE_NFC_P2V(6),
    UNRECOGNIZED(-1);

    private final int j;

    private hkua(int v1) {
        this.j = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hkua.h) {
            return this.j;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hkua b(int v) {
        switch(v) {
            case 0: {
                return hkua.a;
            }
            case 1: {
                return hkua.b;
            }
            case 2: {
                return hkua.c;
            }
            case 3: {
                return hkua.d;
            }
            case 4: {
                return hkua.e;
            }
            case 5: {
                return hkua.f;
            }
            case 6: {
                return hkua.g;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.j);
    }
}

