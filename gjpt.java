public enum gjpt implements hfub {
    UNKNOWN_SPAMTYPE(0),
    INCOMING_CALL_ANSWERED(1),
    MISSED_CALL(2),
    VOICEMAIL(3),
    OUTGOING_CALL(4),
    REJECTED_CALL(5),
    BLOCKED_CALL(6),
    ANSWERED_EXTERNALLY(7),
    INCOMING_MESSAGE(8),
    OUTGOING_MESSAGE(9),
    BLOCKED_MESSAGE(10);

    public final int l;

    private gjpt(int v1) {
        this.l = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.l;
    }

    public static gjpt b(int v) {
        switch(v) {
            case 0: {
                return gjpt.a;
            }
            case 1: {
                return gjpt.b;
            }
            case 2: {
                return gjpt.c;
            }
            case 3: {
                return gjpt.d;
            }
            case 4: {
                return gjpt.e;
            }
            case 5: {
                return gjpt.f;
            }
            case 6: {
                return gjpt.g;
            }
            case 7: {
                return gjpt.h;
            }
            case 8: {
                return gjpt.i;
            }
            case 9: {
                return gjpt.j;
            }
            case 10: {
                return gjpt.k;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.l);
    }
}

