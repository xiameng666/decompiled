import java.util.List;

public final class dnfj {
    public final fryv a;
    public final fryv b;
    public final List c;
    public final fryv d;
    public final Integer e;
    public final ibth f;

    public dnfj() {
        fryu fryu0 = new fryu("");
        fryu fryu1 = new fryu("");
        fryu fryu2 = new fryu("");
        dnfi dnfi0 = new dnfi();
        this(fryu0, fryu1, ibps.a, fryu2, null, dnfi0);
    }

    public dnfj(fryv fryv0, fryv fryv1, List list0, fryv fryv2, Integer integer0, ibth ibth0) {
        this.a = fryv0;
        this.b = fryv1;
        this.c = list0;
        this.d = fryv2;
        this.e = integer0;
        this.f = ibth0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dnfj)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dnfj)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((dnfj)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((dnfj)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((dnfj)object0).d)) {
            return false;
        }
        return ibuq.m(this.e, ((dnfj)object0).e) ? ibuq.m(this.f, ((dnfj)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
        return this.e == null ? v * 0x1F * 0x1F + this.f.hashCode() : (v * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode();
    }

    @Override
    public final String toString() {
        return "FopCardRecentActivityViewState(title=" + this.a + ", subtitle=" + this.b + ", transactions=" + this.c + ", actionText=" + this.d + ", emptyStateDrawable=" + this.e + ", onClick=" + this.f + ")";
    }
}

