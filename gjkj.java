public enum gjkj implements hfub {
    UNKNOWN_SOURCE_EVENT(0),
    TRIGGER(1),
    SHOW_LOCATION_PROMPT(24),
    LOCATION_PROMPT_CONFIRMED(26),
    LOCATION_PROMPT_DENIED(25),
    SHOW_PERMISSIONS_PROMPT(38),
    PERMISSIONS_PROMPT_CONFIRMED(39),
    PERMISSIONS_PROMPT_DENIED(40),
    PROTOCOL_VERSION_CHECK(28),
    CONNECT(2),
    FOUND_TARGET_ENDPOINT(27),
    LAUNCH_QR_SCANNER(3),
    PIN_FALLBACK_TRIGGERED(29),
    CANCEL_QR_SCANNER(18),
    PIN_NOT_MATCH(30),
    CONTINUE_OUT_OF_BAND(4),
    CONTINUE_WITH_PIN(20),
    CONNECTED(5),
    DETERMINE_USER_VERIFICATION_METHOD(23),
    RESTORE_ANYTIME_NOT_SUPPORTED(37),
    ATTEMPT_BUILD_BACKUP_BT_CONNECTION(43),
    BACKUP_BT_CONNECTION_ESTABLISHED(44),
    RECEIVED_WIFI_REQUEST(6),
    SHOW_WIFI_PICKER(36),
    SEND_WIFI(7),
    TARGET_REQUIRES_FORCED_UPDATE(34),
    READY_TO_RECONNECT_WITH_BACKUP_BT_CONNECTION(45),
    RECONNECT(8),
    RECONNECTED(9),
    SHOW_USER_VERIFICATION_PROMPT(10),
    USER_VERIFIED(11),
    USER_VERIFICATION_UNAVAILABLE(12),
    USER_VERIFICATION_SKIPPED(13),
    LSKF_GUESS(33),
    PROCESS_BOOTSTRAP_OPTIONS(19),
    SHOW_ACCOUNT_PICKER(0x1F),
    START_FIDO(14),
    SEND_BLOCK_STORE(22),
    SEND_FOLSOM_DATA(42),
    FIDO_FINISHED(15),
    SHOW_FALLBACK_CHALLENGES(0x20),
    ACCOUNT_TRANSFER_SUCCESS(16),
    ERROR(17),
    DISCONNECTED(21),
    RECEIVED_OTA_UPDATE_NOTIFICATION(35),
    BT_OFF_BROADCAST_RECEIVED(41),
    SOMETHING_WENT_WRONG(46);

    public final int V;

    private gjkj(int v1) {
        this.V = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.V;
    }

    public static gjkj b(int v) {
        switch(v) {
            case 0: {
                return gjkj.a;
            }
            case 1: {
                return gjkj.b;
            }
            case 2: {
                return gjkj.j;
            }
            case 3: {
                return gjkj.l;
            }
            case 4: {
                return gjkj.p;
            }
            case 5: {
                return gjkj.r;
            }
            case 6: {
                return gjkj.w;
            }
            case 7: {
                return gjkj.y;
            }
            case 8: {
                return gjkj.B;
            }
            case 9: {
                return gjkj.C;
            }
            case 10: {
                return gjkj.D;
            }
            case 11: {
                return gjkj.E;
            }
            case 12: {
                return gjkj.F;
            }
            case 13: {
                return gjkj.G;
            }
            case 14: {
                return gjkj.K;
            }
            case 15: {
                return gjkj.N;
            }
            case 16: {
                return gjkj.P;
            }
            case 17: {
                return gjkj.Q;
            }
            case 18: {
                return gjkj.n;
            }
            case 19: {
                return gjkj.I;
            }
            case 20: {
                return gjkj.q;
            }
            case 21: {
                return gjkj.R;
            }
            case 22: {
                return gjkj.L;
            }
            case 23: {
                return gjkj.s;
            }
            case 24: {
                return gjkj.c;
            }
            case 25: {
                return gjkj.e;
            }
            case 26: {
                return gjkj.d;
            }
            case 27: {
                return gjkj.k;
            }
            case 28: {
                return gjkj.i;
            }
            case 29: {
                return gjkj.m;
            }
            case 30: {
                return gjkj.o;
            }
            case 0x1F: {
                return gjkj.J;
            }
            case 0x20: {
                return gjkj.O;
            }
            case 33: {
                return gjkj.H;
            }
            case 34: {
                return gjkj.z;
            }
            case 35: {
                return gjkj.S;
            }
            case 36: {
                return gjkj.x;
            }
            case 37: {
                return gjkj.t;
            }
            case 38: {
                return gjkj.f;
            }
            case 39: {
                return gjkj.g;
            }
            case 40: {
                return gjkj.h;
            }
            case 41: {
                return gjkj.T;
            }
            case 42: {
                return gjkj.M;
            }
            case 43: {
                return gjkj.u;
            }
            case 44: {
                return gjkj.v;
            }
            case 45: {
                return gjkj.A;
            }
            case 46: {
                return gjkj.U;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.V);
    }
}

