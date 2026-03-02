public enum gjjm implements hfub {
    UNKNOWN_EVENT(0),
    SHOW_INSTRUCTION(1),
    START_INITIAL_ADVERTISING(2),
    SHOW_QR_FOR_PAIRING(3),
    SHOW_PIN_FOR_PAIRING(35),
    SHOW_PIN_FALLBACK(46),
    PROCEED_TO_QR(4),
    CONNECTION_INITIATED(5),
    CONNECTED(6),
    PROCESS_HANDSHAKE(49),
    DETERMINE_USER_VERIFICATION_METHOD(41),
    SHOW_LSKF_PROMPT(45),
    USER_VERIFICATION_COMPLETED(0x1F),
    LSKF_NOT_SET(0x20),
    TARGET_LSKF_SKIPPED(42),
    REQUEST_WIFI(7),
    RECEIVED_WIFI(8),
    INFORM_WIFI_CONNECTION_RESULT(51),
    RETRY_WIFI_ON_SOURCE(52),
    @Deprecated
    NO_SUPPORTED_WIFI(9),
    @Deprecated
    NO_WIFI(10),
    SHOW_SKIP_PAIR_CONFIRMATION(0x2F),
    PROCEED_TO_IOS(11),
    SKIP_PAIR(12),
    SKIP_IN_QR(13),
    SKIP_PROGRAMMATICALLY(37),
    RETURN_TO_SUW(14),
    USER_CANCEL(15),
    RESTORE_ANYTIME_NOT_SUPPORTED(50),
    NOTIFY_OTA_UPDATE(0x30),
    START_SECONDARY_ADVERTISING(16),
    RECONNECTION_INITIATED(17),
    RECONNECTED(18),
    BACKUP_CONNECTION_SERVICE_BIND_FAILED(54),
    NOTIFY_SOURCE_RECONNECT_VIA_BACKUP_CONNECTION(55),
    SEND_BOOTSTRAP_OPTIONS(19),
    PROCESS_BOOTSTRAP_CONFIGURATIONS(20),
    PROCESS_SECOND_DEVICE_AUTH_PAYLOAD(44),
    GET_CHALLENGE(21),
    START_FIDO(22),
    START_SESSION(23),
    SEND_SOURCE_FALLBACK(24),
    PROCESS_TARGET_FALLBACK(25),
    CONTINUE_SESSION(26),
    SETUP_MANAGED_ACCOUNT(39),
    STORE_BLOCK_STORE(40),
    STORE_FOLSOM_DATA(53),
    BUILD_AND_RETURN_RESULTS_TO_SUW(43),
    ACCOUNT_CHALLENGE_COMPLETED(33),
    ACCOUNT_TRANSFER_COMPLETED(27),
    PARTIAL_ACCOUNT_TRANSFER_FAILED(38),
    SKIP_TO_MINUTE_MAID(28),
    ERROR(29),
    PROCESS_START_SESSION_RESPONSE(30),
    BACK(34),
    DISCONNECTED(36);

    public final int ae;

    private gjjm(int v1) {
        this.ae = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.ae;
    }

    public static gjjm b(int v) {
        switch(v) {
            case 0: {
                return gjjm.a;
            }
            case 1: {
                return gjjm.b;
            }
            case 2: {
                return gjjm.c;
            }
            case 3: {
                return gjjm.d;
            }
            case 4: {
                return gjjm.g;
            }
            case 5: {
                return gjjm.h;
            }
            case 6: {
                return gjjm.i;
            }
            case 7: {
                return gjjm.p;
            }
            case 8: {
                return gjjm.q;
            }
            case 9: {
                return gjjm.t;
            }
            case 10: {
                return gjjm.u;
            }
            case 11: {
                return gjjm.w;
            }
            case 12: {
                return gjjm.x;
            }
            case 13: {
                return gjjm.y;
            }
            case 14: {
                return gjjm.A;
            }
            case 15: {
                return gjjm.B;
            }
            case 16: {
                return gjjm.E;
            }
            case 17: {
                return gjjm.F;
            }
            case 18: {
                return gjjm.G;
            }
            case 19: {
                return gjjm.J;
            }
            case 20: {
                return gjjm.K;
            }
            case 21: {
                return gjjm.M;
            }
            case 22: {
                return gjjm.N;
            }
            case 23: {
                return gjjm.O;
            }
            case 24: {
                return gjjm.P;
            }
            case 25: {
                return gjjm.Q;
            }
            case 26: {
                return gjjm.R;
            }
            case 27: {
                return gjjm.X;
            }
            case 28: {
                return gjjm.Z;
            }
            case 29: {
                return gjjm.aa;
            }
            case 30: {
                return gjjm.ab;
            }
            case 0x1F: {
                return gjjm.m;
            }
            case 0x20: {
                return gjjm.n;
            }
            case 33: {
                return gjjm.W;
            }
            case 34: {
                return gjjm.ac;
            }
            case 35: {
                return gjjm.e;
            }
            case 36: {
                return gjjm.ad;
            }
            case 37: {
                return gjjm.z;
            }
            case 38: {
                return gjjm.Y;
            }
            case 39: {
                return gjjm.S;
            }
            case 40: {
                return gjjm.T;
            }
            case 41: {
                return gjjm.k;
            }
            case 42: {
                return gjjm.o;
            }
            case 43: {
                return gjjm.V;
            }
            case 44: {
                return gjjm.L;
            }
            case 45: {
                return gjjm.l;
            }
            case 46: {
                return gjjm.f;
            }
            case 0x2F: {
                return gjjm.v;
            }
            case 0x30: {
                return gjjm.D;
            }
            case 49: {
                return gjjm.j;
            }
            case 50: {
                return gjjm.C;
            }
            case 51: {
                return gjjm.r;
            }
            case 52: {
                return gjjm.s;
            }
            case 53: {
                return gjjm.U;
            }
            case 54: {
                return gjjm.H;
            }
            case 55: {
                return gjjm.I;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.ae);
    }
}

