public final class fmut {
    public static final fmut a;
    public final gfsx b;
    public final gfsx c;

    static {
        fmut.a = new fmut(gfqx.a, gfqx.a);
    }

    public fmut() {
        throw null;
    }

    public fmut(gfsx gfsx0, gfsx gfsx1) {
        this.b = gfsx0;
        this.c = gfsx1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmut) && this.b.equals(((fmut)object0).b) && this.c.equals(((fmut)object0).c);
    }

    @Override
    public final int hashCode() {
        return 0x4AAFE21;
    }

    @Override
    public final String toString() {
        return "ConversationPresenterOptions{otherParticipant=" + this.b + ", deleteLocalConversationDescription=" + this.c + "}";
    }
}

