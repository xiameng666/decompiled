public enum hkxq implements hfub {
    AUTH_NETWORK_REQUEST_FLOW_UNKNOWN(0),
    AUTH_NETWORK_REQUEST_ACCOUNT_ID_OP(1),
    AUTH_NETWORK_REQUEST_ACCOUNT_STATE_FETCH(2),
    AUTH_NETWORK_REQUEST_APP_CERT_REQ(3),
    AUTH_NETWORK_REQUEST_AUTH_CODE_FST(4),
    @Deprecated
    AUTH_NETWORK_REQUEST_AUTH_CODE_TO_LST(5),
    AUTH_NETWORK_REQUEST_AUTH_MANAGED_FETCH_MDM(6),
    @Deprecated
    AUTH_NETWORK_REQUEST_BG_REFRESH(7),
    AUTH_NETWORK_REQUEST_CAPTCHA_CHALLENGE(8),
    @Deprecated
    AUTH_NETWORK_REQUEST_CHECK_FRP_COMPL(9),
    AUTH_NETWORK_REQUEST_CHECK_TOKEN_HANDLE(10),
    AUTH_NETWORK_REQUEST_DM_WIPE_CONFIRM(11),
    AUTH_NETWORK_REQUEST_GADS_FETCH_MDM_APP(12),
    @Deprecated
    AUTH_NETWORK_REQUEST_GET_TOKEN_HANDLE(13),
    AUTH_NETWORK_REQUEST_LEGACYSETUP(14),
    @Deprecated
    AUTH_NETWORK_REQUEST_REAUTH(15),
    AUTH_NETWORK_REQUEST_REQUEST_ACCESS_TOKEN(16),
    AUTH_NETWORK_REQUEST_UPDATE_CREDS(17),
    @Deprecated
    AUTH_NETWORK_REQUEST_VALIDATE_CREDS(18),
    AUTH_NETWORK_REQUEST_ACCOUNT_RENAME_ACCOUNT_ID_SYNC(19),
    AUTH_NETWORK_REQUEST_PERIODIC_ACCOUNT_ID_SYNC(20),
    AUTH_NETWORK_REQUEST_EXT_CALLER_ACCOUNT_ID_SYNC(21),
    @Deprecated
    AUTH_NETWORK_REQUEST_PERIODIC_ACCOUNT_STATE_SYNC(22),
    @Deprecated
    AUTH_NETWORK_REQUEST_NEW_ACCOUNT_STATE_SYNC(23),
    @Deprecated
    AUTH_NETWORK_REQUEST_GAIA_SERVICES_FORCE_SYNC(24),
    @Deprecated
    AUTH_NETWORK_REQUEST_PERIODIC_GAIA_SERVICES_SYNC(25),
    AUTH_NETWORK_REQUEST_CREDENTIAL_STATE_SYNC(26),
    AUTH_NETWORK_REQUEST_CONFIRM_CREDENTIALS(27),
    AUTH_NETWORK_REQUEST_UPGRADE_LST_BINDING(28),
    AUTH_NETWORK_REQUEST_GET_TOKEN_GMS_NETWORK_STACK(29),
    AUTH_NETWORK_REQUEST_REAUTH_GMS_NETWORK_STACK(30),
    AUTH_NETWORK_REQUEST_BG_REFRESH_GMS_NETWORK_STACK(0x1F),
    AUTH_NETWORK_REQUEST_ACCOUNT_STATE_GMS_NETWORK_STACK(0x20),
    AUTH_NETWORK_REQUEST_PERIODIC_ACCOUNT_STATE_SYNC_GMS_NETWORK_STACK(33),
    AUTH_NETWORK_REQUEST_PERIODIC_GAIA_SERVICES_SYNC_GMS_NETWORK_STACK(34),
    AUTH_NETWORK_REQUEST_NEW_ACCOUNT_STATE_SYNC_GMS_NETWORK_STACK(35),
    AUTH_NETWORK_REQUEST_GAIA_SERVICES_FORCE_SYNC_GMS_NETWORK_STACK(36),
    AUTH_NETWORK_REQUEST_CHECK_FRP_COMPL_GMS_NETWORK_STACK(37),
    @Deprecated
    AUTH_NETWORK_REQUEST_UPDATE_CREDS_GMS_NETWORK_STACK(38),
    @Deprecated
    AUTH_NETWORK_REQUEST_CHECK_TOKEN_HANDLE_GMS_NETWORK_STACK(39),
    AUTH_NETWORK_REQUEST_VALIDATE_CREDS_GMS_NETWORK_STACK(40),
    @Deprecated
    AUTH_NETWORK_REQUEST_CAPTCHA_CHALLENGE_GMS_NETWORK_STACK(41),
    AUTH_NETWORK_REQUEST_AUTH_CODE_TO_LST_GMS_NETWORK_STACK(42),
    AUTH_NETWORK_REQUEST_GET_TOKEN_HANDLE_GMS_NETWORK_STACK(43),
    AUTH_NETWORK_REQUEST_KIDS_MODULE_SUPERVISION_EXIT_FLOW(44),
    AUTH_NETWORK_REQUEST_ACCOUNT_RENAME_ACCOUNT_ID_SYNC_OCTARINE(45),
    AUTH_NETWORK_REQUEST_SERVER_TRIGGERED_ACCOUNT_STATE_SYNC(46),
    UNRECOGNIZED(-1);

    private final int X;

    private hkxq(int v1) {
        this.X = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hkxq.V) {
            return this.X;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hkxq b(int v) {
        switch(v) {
            case 0: {
                return hkxq.a;
            }
            case 1: {
                return hkxq.b;
            }
            case 2: {
                return hkxq.c;
            }
            case 3: {
                return hkxq.d;
            }
            case 4: {
                return hkxq.e;
            }
            case 5: {
                return hkxq.f;
            }
            case 6: {
                return hkxq.g;
            }
            case 7: {
                return hkxq.h;
            }
            case 8: {
                return hkxq.i;
            }
            case 9: {
                return hkxq.j;
            }
            case 10: {
                return hkxq.k;
            }
            case 11: {
                return hkxq.l;
            }
            case 12: {
                return hkxq.m;
            }
            case 13: {
                return hkxq.n;
            }
            case 14: {
                return hkxq.o;
            }
            case 15: {
                return hkxq.p;
            }
            case 16: {
                return hkxq.q;
            }
            case 17: {
                return hkxq.r;
            }
            case 18: {
                return hkxq.s;
            }
            case 19: {
                return hkxq.t;
            }
            case 20: {
                return hkxq.u;
            }
            case 21: {
                return hkxq.v;
            }
            case 22: {
                return hkxq.w;
            }
            case 23: {
                return hkxq.x;
            }
            case 24: {
                return hkxq.y;
            }
            case 25: {
                return hkxq.z;
            }
            case 26: {
                return hkxq.A;
            }
            case 27: {
                return hkxq.B;
            }
            case 28: {
                return hkxq.C;
            }
            case 29: {
                return hkxq.D;
            }
            case 30: {
                return hkxq.E;
            }
            case 0x1F: {
                return hkxq.F;
            }
            case 0x20: {
                return hkxq.G;
            }
            case 33: {
                return hkxq.H;
            }
            case 34: {
                return hkxq.I;
            }
            case 35: {
                return hkxq.J;
            }
            case 36: {
                return hkxq.K;
            }
            case 37: {
                return hkxq.L;
            }
            case 38: {
                return hkxq.M;
            }
            case 39: {
                return hkxq.N;
            }
            case 40: {
                return hkxq.O;
            }
            case 41: {
                return hkxq.P;
            }
            case 42: {
                return hkxq.Q;
            }
            case 43: {
                return hkxq.R;
            }
            case 44: {
                return hkxq.S;
            }
            case 45: {
                return hkxq.T;
            }
            case 46: {
                return hkxq.U;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.X);
    }
}

