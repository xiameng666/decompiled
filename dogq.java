public final class dogq implements dohd {
    public final fsyk a;
    private final boolean b;
    private final String c;

    public dogq(fsyk fsyk0) {
        ibuq.f(fsyk0, "closedLoopCard");
        super();
        this.a = fsyk0;
        this.b = false;
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
        return 22;
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
        return false;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof dogq) ? ibuq.m(this.a, ((dogq)object0).a) : false;
    }

    @Override  // edxb
    public final boolean g(edxb edxb0) {
        return edxa.a(this, edxb0);
    }

    @Override
    public final int hashCode() {
        fsyk fsyk0 = this.a;
        if(((ProtoLiteMessage)fsyk0).isImmutable()) {
            return ((ProtoLiteMessage)fsyk0).s() * 0x1F + 0x4D5;
        }
        int v = fsyk0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)fsyk0).s();
            fsyk0.memoizedHashCode = v;
        }
        return v * 0x1F + 0x4D5;
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
        return "AccessCardItem(closedLoopCard=" + this.a + ", canBeDraggedToReorder=false)";
    }
}

