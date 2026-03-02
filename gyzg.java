public enum gyzg implements hfub {
    UNKNOWN_ATTACHMENT_TRANSMISSION_STATUS(0),
    COMPLETE_ATTACHMENT_TRANSMISSION_STATUS(1),
    CANCELED_ATTACHMENT_TRANSMISSION_STATUS(2),
    FAILED_ATTACHMENT_TRANSMISSION_STATUS(3),
    @Deprecated
    REJECTED_ATTACHMENT(4),
    @Deprecated
    TIMED_OUT_ATTACHMENT(5),
    @Deprecated
    AWAITING_REMOTE_ACCEPTANCE_FAILED_ATTACHMENT(6),
    @Deprecated
    NOT_ENOUGH_SPACE_ATTACHMENT(7),
    @Deprecated
    FAILED_NO_TRANSFER_UPDATE_CALLBACK(8),
    @Deprecated
    MEDIA_UNAVAILABLE_ATTACHMENT(9),
    @Deprecated
    UNSUPPORTED_ATTACHMENT_TYPE_ATTACHMENT(10),
    @Deprecated
    NO_ATTACHMENT_FOUND(11),
    @Deprecated
    FAILED_NO_SHARE_TARGET_ENDPOINT(12),
    @Deprecated
    FAILED_PAIRED_KEYHANDSHAKE(13),
    @Deprecated
    FAILED_NULL_CONNECTION(14),
    @Deprecated
    FAILED_NO_PAYLOAD(15),
    @Deprecated
    FAILED_WRITE_INTRODUCTION(16),
    @Deprecated
    FAILED_UNKNOWN_REMOTE_RESPONSE(17),
    FAILED_NULL_CONNECTION_INIT_OUTGOING(18),
    FAILED_NULL_CONNECTION_DISCONNECTED(19),
    @Deprecated
    FAILED_NULL_CONNECTION_LOST_CONNECTIVITY(20),
    @Deprecated
    FAILED_NULL_CONNECTION_FAILURE(21),
    REJECTED_ATTACHMENT_TRANSMISSION_STATUS(22),
    TIMED_OUT_ATTACHMENT_TRANSMISSION_STATUS(23),
    NOT_ENOUGH_SPACE_ATTACHMENT_TRANSMISSION_STATUS(24),
    UNSUPPORTED_ATTACHMENT_TYPE_ATTACHMENT_TRANSMISSION_STATUS(25),
    FAILED_UNKNOWN_REMOTE_RESPONSE_TRANSMISSION_STATUS(26),
    @Deprecated
    NO_RESPONSE_FRAME_CONNECTION_CLOSED_LOST_CONNECTIVITY_TRANSMISSION_STATUS(27),
    NO_RESPONSE_FRAME_CONNECTION_CLOSED_TRANSMISSION_STATUS(28),
    LOST_CONNECTIVITY_TRANSMISSION_STATUS(29),
    FAILED_DISALLOWED_MEDIUM(30);

    public final int F;

    private gyzg(int v1) {
        this.F = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.F;
    }

    public static gyzg b(int v) {
        switch(v) {
            case 0: {
                return gyzg.a;
            }
            case 1: {
                return gyzg.b;
            }
            case 2: {
                return gyzg.c;
            }
            case 3: {
                return gyzg.d;
            }
            case 4: {
                return gyzg.e;
            }
            case 5: {
                return gyzg.f;
            }
            case 6: {
                return gyzg.g;
            }
            case 7: {
                return gyzg.h;
            }
            case 8: {
                return gyzg.i;
            }
            case 9: {
                return gyzg.j;
            }
            case 10: {
                return gyzg.k;
            }
            case 11: {
                return gyzg.l;
            }
            case 12: {
                return gyzg.m;
            }
            case 13: {
                return gyzg.n;
            }
            case 14: {
                return gyzg.o;
            }
            case 15: {
                return gyzg.p;
            }
            case 16: {
                return gyzg.q;
            }
            case 17: {
                return gyzg.r;
            }
            case 18: {
                return gyzg.s;
            }
            case 19: {
                return gyzg.t;
            }
            case 20: {
                return gyzg.u;
            }
            case 21: {
                return gyzg.v;
            }
            case 22: {
                return gyzg.w;
            }
            case 23: {
                return gyzg.x;
            }
            case 24: {
                return gyzg.y;
            }
            case 25: {
                return gyzg.z;
            }
            case 26: {
                return gyzg.A;
            }
            case 27: {
                return gyzg.B;
            }
            case 28: {
                return gyzg.C;
            }
            case 29: {
                return gyzg.D;
            }
            case 30: {
                return gyzg.E;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.F);
    }
}

