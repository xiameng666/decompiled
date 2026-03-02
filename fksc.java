public final class fksc {
    private final hhff a;
    private final hfta b;

    public fksc() {
        throw null;
    }

    public fksc(hhff hhff0, hfta hfta0) {
        if(hhff0 == null) {
            throw new NullPointerException("Null moonLanderData");
        }
        this.a = hhff0;
        if(hfta0 == null) {
            throw new NullPointerException("Null extension");
        }
        this.b = hfta0;
    }

    public final Object a() {
        hhff hhff0 = this.a;
        hfta hfta0 = this.b;
        hhff0.f(hfta0);
        hftu hftu0 = hfta0.d;
        if(!hhff0.s.m(hftu0)) {
            throw new fkru("Missing MoonLanderData extension");
        }
        hhff0.f(hfta0);
        Object object0 = hhff0.s.k(hftu0);
        return object0 == null ? ((MessageLite)hfta0.b) : ((MessageLite)hfta0.d(object0));
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fksc) && ((ProtoLiteMessage)this.a).equals(((fksc)object0).a) && this.b.equals(((fksc)object0).b);
    }

    @Override
    public final int hashCode() {
        hhff hhff0 = this.a;
        if(((ProtoLiteMessage)hhff0).isImmutable()) {
            int v = ((ProtoLiteMessage)hhff0).s();
            return this.b.hashCode() ^ (v ^ 1000003) * 1000003;
        }
        int v1 = hhff0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)hhff0).s();
            hhff0.memoizedHashCode = v1;
        }
        return this.b.hashCode() ^ (v1 ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "ProtoMoonLanderDataWrapper{moonLanderData=" + this.a.toString() + ", extension=" + this.b + "}";
    }
}

