public enum ftrb implements hfub {
    STATUS_UNSPECIFIED(0),
    STATUS_SUCCESS(1),
    STATUS_PIN_INCORRECT(2),
    STATUS_PASSWORD_INCORRECT(3),
    STATUS_PIN_NO_MORE_TRIES(4),
    STATUS_PASSWORD_NO_MORE_TRIES(5),
    STATUS_NFC_IO_ERROR(6),
    STATUS_CARD_CERTIFICATE_INVALID(7),
    STATUS_CARD_CORRUPTED(8),
    STATUS_SERVICE_IMPL_UNAVAILABLE(9),
    STATUS_APDU_EXCEPTION(10),
    STATUS_OPERATION_TIMEOUT(11),
    STATUS_GENERIC_ERROR(0xFF),
    UNRECOGNIZED(-1);

    private final int p;

    private ftrb(int v1) {
        this.p = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != ftrb.n) {
            return this.p;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static ftrb b(int v) {
        if(v != 0xFF) {
            switch(v) {
                case 0: {
                    return ftrb.a;
                }
                case 1: {
                    return ftrb.b;
                }
                case 2: {
                    return ftrb.c;
                }
                case 3: {
                    return ftrb.d;
                }
                case 4: {
                    return ftrb.e;
                }
                case 5: {
                    return ftrb.f;
                }
                case 6: {
                    return ftrb.g;
                }
                case 7: {
                    return ftrb.h;
                }
                case 8: {
                    return ftrb.i;
                }
                case 9: {
                    return ftrb.j;
                }
                case 10: {
                    return ftrb.k;
                }
                case 11: {
                    return ftrb.l;
                }
                default: {
                    return null;
                }
            }
        }
        return ftrb.m;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.p);
    }
}

