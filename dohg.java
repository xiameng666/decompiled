public final class dohg implements dohd {
    public final fsyk a;
    private final boolean b;
    private final String c;

    public dohg(fsyk fsyk0, boolean z) {
        ibuq.f(fsyk0, "closedLoopCard");
        super();
        this.a = fsyk0;
        this.b = z;
        String s = (fsyk0.e == null ? gtkg.a : fsyk0.e).e;
        ibuq.e(s, "getDisplayCardId(...)");
        this.c = s;
    }

    @Override  // edxb
    public final int a(edxb edxb0) {
        return dohc.a(edxb0);
    }

    @Override  // edxb
    public final int b() {
        return 1;
    }

    @Override  // edxb
    public final long c() {
        return 0x7FFFFFFFFFFFFFFFL;
    }

    @Override  // edxb
    public final String d() {
        return this.c;
    }

    @Override  // edxb
    public final boolean e() {
        return this.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dohg)) {
            return false;
        }
        return ibuq.m(this.a, ((dohg)object0).a) ? this.b == ((dohg)object0).b : false;
    }

    @Override  // edxb
    public final boolean g(edxb edxb0) {
        return edxa.a(this, edxb0);
    }

    @Override
    public final int hashCode() {
        fsyk fsyk0 = this.a;
        if(((ProtoLiteMessage)fsyk0).isImmutable()) {
            int v = ((ProtoLiteMessage)fsyk0).s();
            return this.b ? v * 0x1F + 0x4CF : v * 0x1F + 0x4D5;
        }
        int v1 = fsyk0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)fsyk0).s();
            fsyk0.memoizedHashCode = v1;
        }
        return this.b ? v1 * 0x1F + 0x4CF : v1 * 0x1F + 0x4D5;
    }

    @Override  // dohd
    public final long k() {
        return 0L;
    }

    @Override  // dohd
    public final boolean l() {
        return false;
    }

    @Override
    public final String toString() {
        return "TicketCentricItem(closedLoopCard=" + this.a + ", canBeDraggedToReorder=" + this.b + ")";
    }
}

