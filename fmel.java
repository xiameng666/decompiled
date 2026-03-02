public final class fmel {
    public final fmga a;
    public final gfsx b;
    public final gfsx c;
    private final gged_interceptors d;

    public fmel() {
        throw null;
    }

    public fmel(fmga fmga0, gged_interceptors gged0, gfsx gfsx0, gfsx gfsx1) {
        this.a = fmga0;
        this.d = gged0;
        this.b = gfsx0;
        this.c = gfsx1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmel) && this.a.equals(((fmel)object0).a) && ggia.i(this.d, ((fmel)object0).d) && this.b.equals(((fmel)object0).b) && this.c.equals(((fmel)object0).c);
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.b.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "CloudMessage{message=" + this.a + ", annotations=" + this.d + ", needsDeliveryReceipt=" + this.b + ", suggestionList=" + this.c + "}";
    }
}

