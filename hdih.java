public enum hdih implements hfub {
    EMBEDDED_IMAGE_UNKNOWN(0),
    EMBEDDED_IMAGE_CREDIT_CARD_VISA_LOGO(1),
    EMBEDDED_IMAGE_CREDIT_CARD_AMEX_LOGO(7),
    EMBEDDED_IMAGE_CREDIT_CARD_MASTERCARD_LOGO(8),
    EMBEDDED_IMAGE_CREDIT_CARD_DISCOVER_LOGO(9),
    EMBEDDED_IMAGE_CREDIT_CARD_GENERIC_LOGO(10),
    EMBEDDED_IMAGE_CREDIT_CARD_CVC_HINT_FRONT(2),
    EMBEDDED_IMAGE_CREDIT_CARD_CVC_HINT_BACK(3),
    EMBEDDED_IMAGE_CLOSE_ICON(4),
    EMBEDDED_IMAGE_BACK_ICON(5),
    EMBEDDED_IMAGE_RADIO_BUTTON_CHECKED(11),
    EMBEDDED_IMAGE_RADIO_BUTTON_UNCHECKED(12),
    EMBEDDED_IMAGE_PAYPAL_LOGO_FULL(6),
    EMBEDDED_IMAGE_KEY(13),
    EMBEDDED_CHECK_BOX_CHECKED(14),
    EMBEDDED_CHECK_BOX_UNCHECKED(15),
    EMBEDDED_CHECK_BOX_INDETERMINATE(16),
    EMBEDDED_IMAGE_GPAY_LOGO_LIGHT(17),
    EMBEDDED_IMAGE_GPAY_LOGO_DARK(18),
    EMBEDDED_IMAGE_GPAY_LOGO_DYNAMIC_COLOR(22),
    EMBEDDED_IMAGE_FLASH_AUTO(19),
    EMBEDDED_IMAGE_FLASH_ON(20),
    EMBEDDED_IMAGE_FLASH_OFF(21),
    EMBEDDED_IMAGE_TAP_TO_ADD_CARD(23),
    EMBEDDED_IMAGE_LENS_CAMERA(24),
    EMBEDDED_IMAGE_KEYBOARD(25),
    EMBEDDED_IMAGE_CONTACTLESS(26);

    public final int B;

    private hdih(int v1) {
        this.B = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.B;
    }

    public static hdih b(int v) {
        switch(v) {
            case 0: {
                return hdih.a;
            }
            case 1: {
                return hdih.b;
            }
            case 2: {
                return hdih.g;
            }
            case 3: {
                return hdih.h;
            }
            case 4: {
                return hdih.i;
            }
            case 5: {
                return hdih.j;
            }
            case 6: {
                return hdih.m;
            }
            case 7: {
                return hdih.c;
            }
            case 8: {
                return hdih.d;
            }
            case 9: {
                return hdih.e;
            }
            case 10: {
                return hdih.f;
            }
            case 11: {
                return hdih.k;
            }
            case 12: {
                return hdih.l;
            }
            case 13: {
                return hdih.n;
            }
            case 14: {
                return hdih.o;
            }
            case 15: {
                return hdih.p;
            }
            case 16: {
                return hdih.q;
            }
            case 17: {
                return hdih.r;
            }
            case 18: {
                return hdih.s;
            }
            case 19: {
                return hdih.u;
            }
            case 20: {
                return hdih.v;
            }
            case 21: {
                return hdih.w;
            }
            case 22: {
                return hdih.t;
            }
            case 23: {
                return hdih.x;
            }
            case 24: {
                return hdih.y;
            }
            case 25: {
                return hdih.z;
            }
            case 26: {
                return hdih.A;
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

