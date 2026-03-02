public enum fmft {
    INVALID(0),
    INCOMING_RECEIVED(1),
    INCOMING_READ(2),
    INCOMING_READ_RECEIPT_SENT(3),
    OUTGOING_PENDING_SEND(4),
    OUTGOING_SENDING(5),
    OUTGOING_FAILED_SEND(6),
    OUTGOING_SENT(7),
    OUTGOING_DELIVERED(8),
    OUTGOING_READ(9),
    OUTGOING_FAILED_TO_DELIVER(10),
    LOCAL(11);

    public static final gged_interceptors m;
    public static final Integer[] n;
    public final int o;

    static {
        fmft.m = gged_interceptors.o(fmft.e, fmft.f, fmft.g, fmft.h);
        ggfp.O(fmft.e, fmft.f, fmft.g, fmft.h, fmft.i, fmft.j, new fmft[]{fmft.k, fmft.l});
        fmft.n = new Integer[]{((int)fmft.e.o), ((int)fmft.f.o), ((int)fmft.g.o), ((int)fmft.l.o)};
    }

    private fmft(int v1) {
        this.o = v1;
    }

    public static fmft a(int v) {
        return (fmft)ggch.k(fmft.values()).c(new fmfs(v)).f(fmft.a);
    }
}

