public enum gjwv implements hfub {
    UNKNOWN_PROMPT_TYPE(0),
    ENABLE_ADM(1),
    ENABLE_NFC(2),
    VERIFICATION_RPC_RETRY(3),
    ADD_VISA_CARD(4),
    AUTOFILL_CODE(5),
    TOKENIZE_RETRY(6),
    WEAR_PROXY_RETRY(7),
    WEAR_PROXY_ADD_ACCOUNT(8),
    SHOW_SECURITY_DEVICE_ADMIN(9),
    SHOW_SECURITY_SECURE_KEYGUARD(10),
    CONFIRM_NFC(11),
    DELETE_PROMPT(12),
    VERIFICATION_PROMPT_ERROR(13),
    LINK_VISA_ERROR(14),
    WEAR_NON_RETRYABLE_ERROR(15),
    SELECT_VERIFICATION_ERROR(16),
    TOKENIZE_NON_RETRYABLE(17),
    DIFFERENT_PHONE_NUMBER(18),
    CHECK_SECURE_ELEMENT_PROMPT(19),
    CHECK_SECURE_ELEMENT_INSTALL_MFI_PROMPT(20),
    NOTIFICATION_SETTINGS_NO_NETWORK(21),
    SELECT_ACCOUNT_ERROR(22),
    ACCOUNT_SETUP_ERROR(23);

    public final int y;

    private gjwv(int v1) {
        this.y = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.y;
    }

    public static gjwv b(int v) {
        switch(v) {
            case 0: {
                return gjwv.a;
            }
            case 1: {
                return gjwv.b;
            }
            case 2: {
                return gjwv.c;
            }
            case 3: {
                return gjwv.d;
            }
            case 4: {
                return gjwv.e;
            }
            case 5: {
                return gjwv.f;
            }
            case 6: {
                return gjwv.g;
            }
            case 7: {
                return gjwv.h;
            }
            case 8: {
                return gjwv.i;
            }
            case 9: {
                return gjwv.j;
            }
            case 10: {
                return gjwv.k;
            }
            case 11: {
                return gjwv.l;
            }
            case 12: {
                return gjwv.m;
            }
            case 13: {
                return gjwv.n;
            }
            case 14: {
                return gjwv.o;
            }
            case 15: {
                return gjwv.p;
            }
            case 16: {
                return gjwv.q;
            }
            case 17: {
                return gjwv.r;
            }
            case 18: {
                return gjwv.s;
            }
            case 19: {
                return gjwv.t;
            }
            case 20: {
                return gjwv.u;
            }
            case 21: {
                return gjwv.v;
            }
            case 22: {
                return gjwv.w;
            }
            case 23: {
                return gjwv.x;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.y);
    }
}

