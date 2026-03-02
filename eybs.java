public final class eybs {
    public final exjx a;
    public final exjy b;
    public final exjy c;
    public final exjr d;
    public final boolean e;
    public final boolean f;

    public eybs(exjx exjx0, exjy exjy0, exjy exjy1, exjr exjr0, boolean z, boolean z1) {
        ibuq.f(exjx0, "rangingMethod");
        ibuq.f(exjy0, "pdAvailability");
        ibuq.f(exjy1, "adAvailability");
        ibuq.f(exjr0, "adDefaultState");
        super();
        this.a = exjx0;
        this.b = exjy0;
        this.c = exjy1;
        this.d = exjr0;
        this.e = z;
        this.f = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eybs)) {
            return false;
        }
        if(this.a != ((eybs)object0).a) {
            return false;
        }
        if(this.b != ((eybs)object0).b) {
            return false;
        }
        if(this.c != ((eybs)object0).c) {
            return false;
        }
        if(this.d != ((eybs)object0).d) {
            return false;
        }
        return this.e == ((eybs)object0).e ? this.f == ((eybs)object0).f : false;
    }

    @Override
    public final int hashCode() {
        return ((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + eybr.a(this.e)) * 0x1F + eybr.a(this.f);
    }

    @Override
    public final String toString() {
        return "RangingMethodDecision(rangingMethod=" + this.a + ", pdAvailability=" + this.b + ", adAvailability=" + this.c + ", adDefaultState=" + this.d + ", downgradable=" + this.e + ", upgradable=" + this.f + ")";
    }
}

