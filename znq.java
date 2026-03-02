public final class znq {
    public final zhr a;
    public final String b;
    public final zht c;

    public znq(zhr zhr0, String s, zht zht0) {
        ibuq.f(s, "text");
        super();
        this.a = zhr0;
        this.b = s;
        this.c = zht0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof znq)) {
            return false;
        }
        if(!ibuq.m(this.a, ((znq)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((znq)object0).b) ? ibuq.m(this.c, ((znq)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (this.a == null ? 0 : this.a.hashCode()) * 0x1F + this.b.hashCode();
        zht zht0 = this.c;
        if(zht0 != null) {
            v = zht0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "ActionChip(icon=" + this.a + ", text=" + this.b + ", link=" + this.c + ")";
    }
}

