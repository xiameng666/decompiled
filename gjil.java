public enum gjil implements hfub {
    PIX_ADD_BANK_ACCOUNT_FLOW_ENTRY_POINT_UNKNOWN(0),
    @Deprecated
    ZERO_STATE_CARD(1),
    PAYMENT_METHODS_PAGE(2),
    ADD_TO_WALLET_PAGE(3),
    PIX_BANK_SPECIFIC_WELCOME_TIP(20),
    PIX_WELCOME_TIP(4),
    PIX_WELCOME_BOTTOM_SHEET(5),
    PIX_KYC_PASSED_CALLOUT(6),
    PIX_PARTNER_BANK_APP(7),
    PIX_KYC_PENDING_CALLOUT(8),
    WALLET_NOTIFICATION(9),
    WALLET_DEEPLINK(10),
    PIX_AREA_LINKED_ACCOUNTS_SECTION(11),
    CARD_QR_SCANNER_ERROR_SHEET(12),
    PIX_AREA_ONBOARDING_ZERO_STATE_CARD(13),
    PIX_AREA_ONBOARDING_INFO_REQUIRED_CARD(14),
    PIX_AREA_ONBOARDING_COMPLETE_CARD(15),
    HOME_ONBOARDING_ZERO_STATE_CARD(16),
    HOME_ONBOARDING_INFO_REQUIRED_CARD(17),
    HOME_ONBOARDING_COMPLETE_CARD(18),
    PIX_CHECKLIST(19),
    PIX_NIGHT_MODE_SETTINGS_DIALOG(21),
    PIX_PIN_MODE_SETTINGS_DIALOG(22),
    PIX_FOP_SELECTOR_PAGE(23),
    PIX_PAYMENT_AMOUNT_SCREEN(24),
    UNRECOGNIZED(-1);

    private final int B;

    private gjil(int v1) {
        this.B = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gjil.z) {
            return this.B;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static gjil b(int v) {
        switch(v) {
            case 0: {
                return gjil.a;
            }
            case 1: {
                return gjil.b;
            }
            case 2: {
                return gjil.c;
            }
            case 3: {
                return gjil.d;
            }
            case 4: {
                return gjil.f;
            }
            case 5: {
                return gjil.g;
            }
            case 6: {
                return gjil.h;
            }
            case 7: {
                return gjil.i;
            }
            case 8: {
                return gjil.j;
            }
            case 9: {
                return gjil.k;
            }
            case 10: {
                return gjil.l;
            }
            case 11: {
                return gjil.m;
            }
            case 12: {
                return gjil.n;
            }
            case 13: {
                return gjil.o;
            }
            case 14: {
                return gjil.p;
            }
            case 15: {
                return gjil.q;
            }
            case 16: {
                return gjil.r;
            }
            case 17: {
                return gjil.s;
            }
            case 18: {
                return gjil.t;
            }
            case 19: {
                return gjil.u;
            }
            case 20: {
                return gjil.e;
            }
            case 21: {
                return gjil.v;
            }
            case 22: {
                return gjil.w;
            }
            case 23: {
                return gjil.x;
            }
            case 24: {
                return gjil.y;
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

