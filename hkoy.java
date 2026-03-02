public enum hkoy implements hfub {
    WALLET_NOTIFICATION_ID_UNKNOWN(0),
    TEST_NOTIFICATION_ID(1),
    AUTH_SETTING_UPDATE_CHANGE_VERIFICATION_SETTING(2),
    AUTH_SETTING_UPDATE_OPEN_HELP_CENTER(3),
    AUTH_SETTING_UPDATE(4),
    PENDING_SE_PROVISIONING_PREPARING_DEVICE(5),
    PENDING_SE_PROVISIONING_IN_PROGRESS(6),
    PENDING_SE_PROVISIONING_SUCCESS(7),
    PENDING_SE_PROVISIONING_ERROR(8),
    DOWNLOAD_PAY_MODULE_SUCCESS(9),
    DOWNLOAD_PAY_MODULE_PROGRESS(12),
    DOWNLOAD_PAY_MODULE_RETRYABLE_FAILURE(13),
    DOWNLOAD_PAY_MODULE_NON_RETRYABLE_FAILURE(14),
    @Deprecated
    CARD_ADDED_FLOW(10),
    @Deprecated
    TRANSACTION(11),
    @Deprecated
    WEB_PUSH_PROVISIONING(15),
    TOKENIZATION_PROMPT(16),
    @Deprecated
    TOKENIZED_USER_ACTIVATION(27),
    RETOKENIZATION(44),
    DEFERRED_YELLOW_PATH(17),
    HOSPITALITY(18),
    MDL(24),
    MDL_WAS_UPDATED(19),
    MDL_UPDATE(20),
    MDL_READY(21),
    MDL_REJECTED(22),
    MDL_DELETED(23),
    INSUFFICIENT_SECURITY(25),
    INSECURE_ID(26),
    SMART_CHARGE_LOW_BALANCE(28),
    SMART_CHARGE_AUTO_CHARGE_SUCCESS(29),
    SMART_CHARGE_SETTINGS_ERROR(30),
    PASSES(0x1F),
    PASSES_LOYALTY_CARD_GENERIC_FIELD_UPDATE(0x20),
    PASSES_LOYALTY_CARD_GENERIC_TIME_BASED(45),
    PASSES_LOYALTY_CARD_NEXT_REWARD(46),
    PASSES_LOYALTY_CARD_DEVICE_HANDOFF(0x2F),
    PASSES_LOYALTY_CARD_ADD_ISSUER_MESSAGE(0x30),
    PASSES_LOYALTY_CARD_AUTO_ADDED_LINKED_PASS(49),
    PASSES_LOYALTY_CARD_GEOFENCE(91),
    PASSES_LOYALTY_CARD_PVAO(102),
    PASSES_GIFT_CARD_GENERIC_FIELD_UPDATE(33),
    PASSES_GIFT_CARD_GENERIC_TIME_BASED(50),
    PASSES_GIFT_CARD_DEVICE_HANDOFF(51),
    PASSES_GIFT_CARD_ADD_ISSUER_MESSAGE(52),
    PASSES_GIFT_CARD_AUTO_ADDED_LINKED_PASS(53),
    PASSES_GIFT_CARD_GEOFENCE(92),
    PASSES_GIFT_CARD_PVAO(103),
    PASSES_OFFER_GENERIC_FIELD_UPDATE(34),
    PASSES_OFFER_GENERIC_TIME_BASED(54),
    PASSES_OFFER_DEVICE_HANDOFF(55),
    PASSES_OFFER_ADD_ISSUER_MESSAGE(56),
    PASSES_OFFER_AUTO_ADDED_LINKED_PASS(57),
    PASSES_OFFER_GEOFENCE(93),
    PASSES_OFFER_PVAO(104),
    PASSES_EVENT_TICKET_GENERIC_FIELD_UPDATE(35),
    PASSES_EVENT_TICKET_GENERIC_TIME_BASED(58),
    PASSES_EVENT_TICKET_DEVICE_HANDOFF(59),
    PASSES_EVENT_TICKET_ADD_ISSUER_MESSAGE(60),
    PASSES_EVENT_TICKET_AUTO_ADDED_LINKED_PASS(61),
    PASSES_EVENT_TICKET_GEOFENCE(94),
    PASSES_EVENT_TICKET_PVAO(105),
    PASSES_FLIGHT_GENERIC_FIELD_UPDATE(36),
    PASSES_FLIGHT_GENERIC_TIME_BASED(62),
    PASSES_FLIGHT_DEVICE_HANDOFF(0x3F),
    PASSES_FLIGHT_ADD_ISSUER_MESSAGE(0x40),
    PASSES_FLIGHT_AUTO_ADDED_LINKED_PASS(65),
    PASSES_FLIGHT_GEOFENCE(0x5F),
    PASSES_FLIGHT_PVAO(106),
    PASSES_FLIGHT_RESERVATION_CHECK_IN(0x73),
    PASSES_TRANSIT_CARD_GENERIC_FIELD_UPDATE(37),
    PASSES_TRANSIT_CARD_GENERIC_TIME_BASED(66),
    PASSES_TRANSIT_CARD_DEVICE_HANDOFF(67),
    PASSES_TRANSIT_CARD_CLOSED_LOOP_MOVE_STATUS_UPDATE(68),
    PASSES_TRANSIT_CARD_ADD_ISSUER_MESSAGE(69),
    PASSES_TRANSIT_CARD_AUTO_ADDED_LINKED_PASS(70),
    PASSES_TRANSIT_CARD_GEOFENCE(0x60),
    PASSES_TRANSIT_CARD_PVAO(107),
    PASSES_HEALTH_CARD_GENERIC_FIELD_UPDATE(38),
    PASSES_HEALTH_CARD_GENERIC_TIME_BASED(71),
    PASSES_HEALTH_CARD_DEVICE_HANDOFF(72),
    PASSES_HEALTH_CARD_ADD_ISSUER_MESSAGE(73),
    PASSES_HEALTH_CARD_GEOFENCE(97),
    PASSES_HEALTH_CARD_PVAO(108),
    PASSES_GENERIC_CARD_GENERIC_FIELD_UPDATE(39),
    PASSES_GENERIC_CARD_GENERIC_TIME_BASED(74),
    PASSES_GENERIC_CARD_DEVICE_HANDOFF(75),
    PASSES_GENERIC_CARD_ADD_ISSUER_MESSAGE(76),
    PASSES_GENERIC_CARD_AUTO_ADDED_LINKED_PASS(77),
    PASSES_GENERIC_CARD_GEOFENCE(98),
    PASSES_GENERIC_CARD_PVAO(109),
    PASSES_GENERIC_PRIVATE_PASS_GENERIC_FIELD_UPDATE(40),
    PASSES_GENERIC_PRIVATE_PASS_GENERIC_TIME_BASED(78),
    PASSES_GENERIC_PRIVATE_PASS_DEVICE_HANDOFF(0x4F),
    PASSES_GENERIC_PRIVATE_PASS_ADD_ISSUER_MESSAGE(80),
    PASSES_GENERIC_PRIVATE_PASS_GEOFENCE(99),
    PASSES_GENERIC_PRIVATE_PASS_PVAO(110),
    PASSES_USER_GENERIC_SENSITIVE_PASS_GENERIC_FIELD_UPDATE(41),
    PASSES_USER_GENERIC_SENSITIVE_PASS_GENERIC_TIME_BASED(81),
    PASSES_USER_GENERIC_SENSITIVE_PASS_DEVICE_HANDOFF(82),
    PASSES_USER_GENERIC_SENSITIVE_PASS_ADD_ISSUER_MESSAGE(83),
    PASSES_USER_GENERIC_SENSITIVE_PASS_AUTO_ADDED_LINKED_PASS(84),
    PASSES_USER_GENERIC_SENSITIVE_PASS_GEOFENCE(100),
    PASSES_USER_GENERIC_SENSITIVE_PASS_PVAO(0x6F),
    PASSES_LOCAL_RESOURCE_PASS_GENERIC_FIELD_UPDATE(42),
    PASSES_LOCAL_RESOURCE_PASS_GENERIC_TIME_BASED(85),
    PASSES_LOCAL_RESOURCE_PASS_DEVICE_HANDOFF(86),
    PASSES_LOCAL_RESOURCE_PASS_ADD_ISSUER_MESSAGE(87),
    PASSES_LOCAL_RESOURCE_PASS_AUTO_ADDED_LINKED_PASS(88),
    PASSES_LOCAL_RESOURCE_PASS_GEOFENCE(101),
    PASSES_LOCAL_RESOURCE_PASS_PVAO(0x70),
    PASSES_BULK_IMPORT_SCAN_IN_PROGRESS(89),
    PASSES_BULK_IMPORT_SCAN_COMPLETED(90),
    PASSES_BULK_IMPORT_PASS_FOUND(0x72),
    REMIND_ME_LATER(43),
    WEAR_OPEN_LOOP(0x71),
    SUPERVISED_STORED_VALUE(0x74),
    APP_LOCATION_SERVICE_FOREGROUND(0x75),
    COMMUTER_PASS_RENEWAL_FIRST(0x76),
    COMMUTER_PASS_RENEWAL_LAST(0x77),
    MY_COMMUTE_LOW_BALANCE(120),
    UNRECOGNIZED(-1);

    private final int bt;

    private hkoy(int v1) {
        this.bt = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hkoy.br) {
            return this.bt;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hkoy b(int v) {
        switch(v) {
            case 0: {
                return hkoy.a;
            }
            case 1: {
                return hkoy.b;
            }
            case 2: {
                return hkoy.c;
            }
            case 3: {
                return hkoy.d;
            }
            case 4: {
                return hkoy.e;
            }
            case 5: {
                return hkoy.f;
            }
            case 6: {
                return hkoy.g;
            }
            case 7: {
                return hkoy.h;
            }
            case 8: {
                return hkoy.i;
            }
            case 9: {
                return hkoy.j;
            }
            case 10: {
                return hkoy.n;
            }
            case 11: {
                return hkoy.o;
            }
            case 12: {
                return hkoy.k;
            }
            case 13: {
                return hkoy.l;
            }
            case 14: {
                return hkoy.m;
            }
            case 15: {
                return hkoy.p;
            }
            case 16: {
                return hkoy.q;
            }
            case 17: {
                return hkoy.t;
            }
            case 18: {
                return hkoy.u;
            }
            case 19: {
                return hkoy.w;
            }
            case 20: {
                return hkoy.x;
            }
            case 21: {
                return hkoy.y;
            }
            case 22: {
                return hkoy.z;
            }
            case 23: {
                return hkoy.A;
            }
            case 24: {
                return hkoy.v;
            }
            case 25: {
                return hkoy.B;
            }
            case 26: {
                return hkoy.C;
            }
            case 27: {
                return hkoy.r;
            }
            case 28: {
                return hkoy.D;
            }
            case 29: {
                return hkoy.E;
            }
            case 30: {
                return hkoy.F;
            }
            case 0x1F: {
                return hkoy.G;
            }
            case 0x20: {
                return hkoy.H;
            }
            case 33: {
                return hkoy.P;
            }
            case 34: {
                return hkoy.W;
            }
            case 35: {
                return hkoy.ad;
            }
            case 36: {
                return hkoy.ak;
            }
            case 37: {
                return hkoy.as;
            }
            case 38: {
                return hkoy.aA;
            }
            case 39: {
                return hkoy.aG;
            }
            case 40: {
                return hkoy.aN;
            }
            case 41: {
                return hkoy.aT;
            }
            case 42: {
                return hkoy.ba;
            }
            case 43: {
                return hkoy.bk;
            }
            case 44: {
                return hkoy.s;
            }
            case 45: {
                return hkoy.I;
            }
            case 46: {
                return hkoy.J;
            }
            case 0x2F: {
                return hkoy.K;
            }
            case 0x30: {
                return hkoy.L;
            }
            case 49: {
                return hkoy.M;
            }
            case 50: {
                return hkoy.Q;
            }
            case 51: {
                return hkoy.R;
            }
            case 52: {
                return hkoy.S;
            }
            case 53: {
                return hkoy.T;
            }
            case 54: {
                return hkoy.X;
            }
            case 55: {
                return hkoy.Y;
            }
            case 56: {
                return hkoy.Z;
            }
            case 57: {
                return hkoy.aa;
            }
            case 58: {
                return hkoy.ae;
            }
            case 59: {
                return hkoy.af;
            }
            case 60: {
                return hkoy.ag;
            }
            case 61: {
                return hkoy.ah;
            }
            case 62: {
                return hkoy.al;
            }
            case 0x3F: {
                return hkoy.am;
            }
            case 0x40: {
                return hkoy.an;
            }
            case 65: {
                return hkoy.ao;
            }
            case 66: {
                return hkoy.at;
            }
            case 67: {
                return hkoy.au;
            }
            case 68: {
                return hkoy.av;
            }
            case 69: {
                return hkoy.aw;
            }
            case 70: {
                return hkoy.ax;
            }
            case 71: {
                return hkoy.aB;
            }
            case 72: {
                return hkoy.aC;
            }
            case 73: {
                return hkoy.aD;
            }
            case 74: {
                return hkoy.aH;
            }
            case 75: {
                return hkoy.aI;
            }
            case 76: {
                return hkoy.aJ;
            }
            case 77: {
                return hkoy.aK;
            }
            case 78: {
                return hkoy.aO;
            }
            case 0x4F: {
                return hkoy.aP;
            }
            case 80: {
                return hkoy.aQ;
            }
            case 81: {
                return hkoy.aU;
            }
            case 82: {
                return hkoy.aV;
            }
            case 83: {
                return hkoy.aW;
            }
            case 84: {
                return hkoy.aX;
            }
            case 85: {
                return hkoy.bb;
            }
            case 86: {
                return hkoy.bc;
            }
            case 87: {
                return hkoy.bd;
            }
            case 88: {
                return hkoy.be;
            }
            case 89: {
                return hkoy.bh;
            }
            case 90: {
                return hkoy.bi;
            }
            case 91: {
                return hkoy.N;
            }
            case 92: {
                return hkoy.U;
            }
            case 93: {
                return hkoy.ab;
            }
            case 94: {
                return hkoy.ai;
            }
            case 0x5F: {
                return hkoy.ap;
            }
            case 0x60: {
                return hkoy.ay;
            }
            case 97: {
                return hkoy.aE;
            }
            case 98: {
                return hkoy.aL;
            }
            case 99: {
                return hkoy.aR;
            }
            case 100: {
                return hkoy.aY;
            }
            case 101: {
                return hkoy.bf;
            }
            case 102: {
                return hkoy.O;
            }
            case 103: {
                return hkoy.V;
            }
            case 104: {
                return hkoy.ac;
            }
            case 105: {
                return hkoy.aj;
            }
            case 106: {
                return hkoy.aq;
            }
            case 107: {
                return hkoy.az;
            }
            case 108: {
                return hkoy.aF;
            }
            case 109: {
                return hkoy.aM;
            }
            case 110: {
                return hkoy.aS;
            }
            case 0x6F: {
                return hkoy.aZ;
            }
            case 0x70: {
                return hkoy.bg;
            }
            case 0x71: {
                return hkoy.bl;
            }
            case 0x72: {
                return hkoy.bj;
            }
            case 0x73: {
                return hkoy.ar;
            }
            case 0x74: {
                return hkoy.bm;
            }
            case 0x75: {
                return hkoy.bn;
            }
            case 0x76: {
                return hkoy.bo;
            }
            case 0x77: {
                return hkoy.bp;
            }
            case 120: {
                return hkoy.bq;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.bt);
    }
}

