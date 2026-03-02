public enum hcbx implements hfub {
    EVENT_NAME_UNKNOWN(0),
    EVENT_NAME_SESSION_START(1),
    EVENT_NAME_SESSION_END(2),
    EVENT_NAME_CONTEXT_START(3),
    EVENT_NAME_CONTEXT_END(4),
    EVENT_NAME_CONTEXT_RESUMED(11),
    EVENT_NAME_FIELD_FOCUSED_START(5),
    EVENT_NAME_FIELD_FOCUSED_END(6),
    EVENT_NAME_EXPANDED_START(7),
    EVENT_NAME_EXPANDED_END(8),
    EVENT_NAME_API_REQUEST_START(9),
    EVENT_NAME_API_REQUEST_END(10),
    EVENT_NAME_WEB_VIEW_PAGE_LOAD_START(12),
    EVENT_NAME_WEB_VIEW_PAGE_LOAD_END(13),
    EVENT_NAME_APP_VALIDATION_START(14),
    EVENT_NAME_APP_VALIDATION_END(15),
    EVENT_XPC_CALL_START(16),
    EVENT_XPC_CALL_END(17),
    EVENT_NAME_CONFIGURATION(1000),
    EVENT_NAME_IMPRESSION(1001),
    EVENT_NAME_CLICK(1002),
    EVENT_NAME_FIELD_VALUE_CHANGED(1003),
    EVENT_NAME_FIELD_CLIENT_VALIDATION_ERROR(1004),
    EVENT_NAME_FIELD_SERVER_VALIDATION_ERROR(1005),
    EVENT_NAME_LANDING_MESSAGE_JAVASCRIPT_INJECTED(1006),
    EVENT_NAME_LANDING_MESSAGE_CALLBACK_RECEIVED(1007),
    EVENT_NAME_UNHANDLED_ERROR(0x3F0),
    EVENT_NAME_PREFETCHED_INITIALIZE(1009),
    EVENT_NAME_REDIRECT_FORM_START(1020),
    EVENT_NAME_REDIRECT_FORM_END(0x3FD),
    EVENT_NAME_REDIRECT_FORM_HOST_KILLED(1010),
    EVENT_XPC_CALL_SINGLE(0x3F3),
    EVENT_NAME_WEB_VIEW_AUTH(0x3F4),
    EVENT_NAME_DATA_URI_IMAGE_DECODED(0x3F5),
    EVENT_NAME_IMPRESSION_NOT_CALCULATED(0x3F6),
    EVENT_NAME_FINGERPRINT_AUTH(0x3F7),
    EVENT_NAME_TEST_CODE(0x3F8),
    EVENT_NAME_DOCUMENT_UPLOAD_MULTIPLE_PDFS(0x3F9),
    EVENT_NAME_DOCUMENT_UPLOAD_DIFFERENT_FILE_TYPES(0x3FA),
    EVENT_NAME_DOCUMENT_UPLOAD_SUCCESSFUL(0x3FB),
    EVENT_NAME_WALLET_BACKGROUND_EVENT(0x3FE);

    public final int P;

    private hcbx(int v1) {
        this.P = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.P;
    }

    public static hcbx b(int v) {
        switch(v) {
            case 0: {
                return hcbx.a;
            }
            case 1: {
                return hcbx.b;
            }
            case 2: {
                return hcbx.c;
            }
            case 3: {
                return hcbx.d;
            }
            case 4: {
                return hcbx.e;
            }
            case 5: {
                return hcbx.g;
            }
            case 6: {
                return hcbx.h;
            }
            case 7: {
                return hcbx.i;
            }
            case 8: {
                return hcbx.j;
            }
            case 9: {
                return hcbx.k;
            }
            case 10: {
                return hcbx.l;
            }
            case 11: {
                return hcbx.f;
            }
            case 12: {
                return hcbx.m;
            }
            case 13: {
                return hcbx.n;
            }
            case 14: {
                return hcbx.o;
            }
            case 15: {
                return hcbx.p;
            }
            case 16: {
                return hcbx.q;
            }
            case 17: {
                return hcbx.r;
            }
            case 1000: {
                return hcbx.s;
            }
            case 1001: {
                return hcbx.t;
            }
            case 1002: {
                return hcbx.u;
            }
            case 1003: {
                return hcbx.v;
            }
            case 1004: {
                return hcbx.w;
            }
            case 1005: {
                return hcbx.x;
            }
            case 1006: {
                return hcbx.y;
            }
            case 1007: {
                return hcbx.z;
            }
            case 0x3F0: {
                return hcbx.A;
            }
            case 1009: {
                return hcbx.B;
            }
            case 1010: {
                return hcbx.E;
            }
            case 0x3F3: {
                return hcbx.F;
            }
            case 0x3F4: {
                return hcbx.G;
            }
            case 0x3F5: {
                return hcbx.H;
            }
            case 0x3F6: {
                return hcbx.I;
            }
            case 0x3F7: {
                return hcbx.J;
            }
            case 0x3F8: {
                return hcbx.K;
            }
            case 0x3F9: {
                return hcbx.L;
            }
            case 0x3FA: {
                return hcbx.M;
            }
            case 0x3FB: {
                return hcbx.N;
            }
            case 1020: {
                return hcbx.C;
            }
            case 0x3FD: {
                return hcbx.D;
            }
            case 0x3FE: {
                return hcbx.O;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.P);
    }
}

