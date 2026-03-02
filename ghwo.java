public enum ghwo implements hfub {
    EVENT_TYPE_UNSPECIFIED(0),
    REQUEST_RECEIVED(1),
    API_ERROR(2),
    USER_CONSENT_REQUEST_RECEIVED(3),
    USER_CONSENT_GRANTED(4),
    USER_CONSENT_DENIED(5),
    TELEPHONY_VERIFICATION_API_CALLED(6),
    TELEPHONY_API_SUCCESS_CALLBACK_CALLED(7),
    TELEPHONY_API_FAILURE_CALLBACK_CALLED(8),
    USER_CONSENT_INTENT_SENT(9),
    USER_CONSENT_DIALOG_SHOWN(10),
    TELEPHONY_API_CALLING_FAILED(11),
    VERIFICATION_STARTED_WITHOUT_CONSENT(12);

    public final int n;

    private ghwo(int v1) {
        this.n = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.n;
    }

    public static ghwo b(int v) {
        switch(v) {
            case 0: {
                return ghwo.a;
            }
            case 1: {
                return ghwo.b;
            }
            case 2: {
                return ghwo.c;
            }
            case 3: {
                return ghwo.d;
            }
            case 4: {
                return ghwo.e;
            }
            case 5: {
                return ghwo.f;
            }
            case 6: {
                return ghwo.g;
            }
            case 7: {
                return ghwo.h;
            }
            case 8: {
                return ghwo.i;
            }
            case 9: {
                return ghwo.j;
            }
            case 10: {
                return ghwo.k;
            }
            case 11: {
                return ghwo.l;
            }
            case 12: {
                return ghwo.m;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.n);
    }
}

