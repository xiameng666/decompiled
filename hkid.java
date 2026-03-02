public enum hkid implements hfub {
    UNKNOWN_ACTION_TYPE(0),
    TOKENIZE_AND_ADD_CARD(1),
    ADD_PAYPAL(15),
    LEGACY_TOKENIZE_PAYPAL(2),
    LINK_VISA_CHECKOUT(3),
    ADD_BANK_ACCOUNT(4),
    TOKENIZE_EXISTING_CARD(5),
    TOKENIZE_EXISTING_PAYPAL(16),
    LEGACY_TOKENIZE_EXISTING_PAYPAL(13),
    EDIT(6),
    REQUIRE_FIX(7),
    DELETE(8),
    REMOVE_TOKEN(9),
    MAKE_P2P_DEFAULT(10),
    SETTLE_BALANCE(11),
    CASH_OUT(12),
    VIEW_SIGNATURE(14),
    EDIT_EXISTING_NICKNAME(17),
    ADD_NEW_NICKNAME(18),
    ADD_PAYCACHE(19),
    TOKENIZE_EXISTING_PAYCACHE(20),
    INITIATE_KYC(21),
    ISSUE_STORED_VALUE_OPEN_LOOP_CARD(22),
    TOKENIZE_EXISTING_STORED_VALUE_OPEN_LOOP_CARD(23),
    INITIATE_IDV(24),
    UNRECOGNIZED(-1);

    private final int B;

    private hkid(int v1) {
        this.B = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hkid.z) {
            return this.B;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hkid b(int v) {
        switch(v) {
            case 0: {
                return hkid.a;
            }
            case 1: {
                return hkid.b;
            }
            case 2: {
                return hkid.d;
            }
            case 3: {
                return hkid.e;
            }
            case 4: {
                return hkid.f;
            }
            case 5: {
                return hkid.g;
            }
            case 6: {
                return hkid.j;
            }
            case 7: {
                return hkid.k;
            }
            case 8: {
                return hkid.l;
            }
            case 9: {
                return hkid.m;
            }
            case 10: {
                return hkid.n;
            }
            case 11: {
                return hkid.o;
            }
            case 12: {
                return hkid.p;
            }
            case 13: {
                return hkid.i;
            }
            case 14: {
                return hkid.q;
            }
            case 15: {
                return hkid.c;
            }
            case 16: {
                return hkid.h;
            }
            case 17: {
                return hkid.r;
            }
            case 18: {
                return hkid.s;
            }
            case 19: {
                return hkid.t;
            }
            case 20: {
                return hkid.u;
            }
            case 21: {
                return hkid.v;
            }
            case 22: {
                return hkid.w;
            }
            case 23: {
                return hkid.x;
            }
            case 24: {
                return hkid.y;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.B);
    }
}

