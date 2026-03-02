public enum gqqm implements hfub {
    OOB_REQ_TYPE_UNSPECIFIED(0),
    PASSWORD_RESET(1),
    @Deprecated
    OLD_EMAIL_AGREE(2),
    @Deprecated
    NEW_EMAIL_ACCEPT(3),
    VERIFY_EMAIL(4),
    RECOVER_EMAIL(5),
    EMAIL_SIGNIN(6),
    VERIFY_AND_CHANGE_EMAIL(7),
    REVERT_SECOND_FACTOR_ADDITION(8),
    HOSTED_UI_PIN_CODE(9),
    HOSTED_UI_ONBOARDING_EMAIL_SIGNIN(10),
    HOSTED_UI_VERIFY_EMAIL(11),
    HOSTED_UI_PASSWORD_RESET(12),
    HOSTED_UI_RECOVERY_EMAIL_SIGNIN(13),
    HOSTED_UI_TING_V2_PIN_CODE(14);

    public final int p;

    private gqqm(int v1) {
        this.p = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.p;
    }

    public static gqqm b(int v) {
        switch(v) {
            case 0: {
                return gqqm.a;
            }
            case 1: {
                return gqqm.b;
            }
            case 2: {
                return gqqm.c;
            }
            case 3: {
                return gqqm.d;
            }
            case 4: {
                return gqqm.e;
            }
            case 5: {
                return gqqm.f;
            }
            case 6: {
                return gqqm.g;
            }
            case 7: {
                return gqqm.h;
            }
            case 8: {
                return gqqm.i;
            }
            case 9: {
                return gqqm.j;
            }
            case 10: {
                return gqqm.k;
            }
            case 11: {
                return gqqm.l;
            }
            case 12: {
                return gqqm.m;
            }
            case 13: {
                return gqqm.n;
            }
            case 14: {
                return gqqm.o;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.p);
    }
}

