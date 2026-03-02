public final class aarq extends aalp {
    public final grut a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public aarq(grut grut0, boolean z, boolean z1, boolean z2) {
        ibuq.f(grut0, "appBar");
        super();
        this.a = grut0;
        this.b = z;
        this.c = z1;
        this.d = z2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof aarq)) {
            return false;
        }
        if(!ibuq.m(this.a, ((aarq)object0).a)) {
            return false;
        }
        if(this.b != ((aarq)object0).b) {
            return false;
        }
        return this.c == ((aarq)object0).c ? this.d == ((aarq)object0).d : false;
    }

    @Override
    public final int hashCode() {
        grut grut0 = this.a;
        if(((ProtoLiteMessage)grut0).isImmutable()) {
            return ((((ProtoLiteMessage)grut0).s() * 0x1F + aarp.a(this.b)) * 0x1F + aarp.a(this.c)) * 0x1F + aarp.a(this.d);
        }
        int v = grut0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)grut0).s();
            grut0.memoizedHashCode = v;
        }
        return ((v * 0x1F + aarp.a(this.b)) * 0x1F + aarp.a(this.c)) * 0x1F + aarp.a(this.d);
    }

    @Override
    public final String toString() {
        return "AppBarBlueprint(appBar=" + this.a + ", isPlaceholder=" + this.b + ", isTrampoline=" + this.c + ", animateParticleDisc=" + this.d + ")";
    }
}

