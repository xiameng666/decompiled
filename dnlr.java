public final class dnlr {
    public final fryv a;
    public final fryv b;
    public final fryv c;
    public final fryv d;
    public final ibth e;
    public final boolean f;

    public dnlr() {
        this(new fryu(""), new fryu(""), new fryu(""), new fryu(""), new dnlq(), false);
    }

    public dnlr(fryv fryv0, fryv fryv1, fryv fryv2, fryv fryv3, ibth ibth0, boolean z) {
        this.a = fryv0;
        this.b = fryv1;
        this.c = fryv2;
        this.d = fryv3;
        this.e = ibth0;
        this.f = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dnlr)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dnlr)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((dnlr)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((dnlr)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((dnlr)object0).d)) {
            return false;
        }
        return ibuq.m(this.e, ((dnlr)object0).e) ? this.f == ((dnlr)object0).f : false;
    }

    @Override
    public final int hashCode() {
        int v = (((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode();
        return this.f ? v * 0x1F + 0x4CF : v * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "CardRewardsPreviewContainerViewState(title=" + this.a + ", description=" + this.b + ", actionText=" + this.c + ", footer=" + this.d + ", onClick=" + this.e + ", bc25=" + this.f + ")";
    }
}

