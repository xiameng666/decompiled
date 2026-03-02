public final class zoo extends aaem {
    public final zhr a;
    public final String b;
    public final String c;
    public final zoh d;
    public final zht e;

    public zoo(zhr zhr0, String s, String s1, zoh zoh0, zht zht0) {
        ibuq.f(s, "title");
        ibuq.f(s1, "description");
        ibuq.f(zoh0, "position");
        super();
        this.a = zhr0;
        this.b = s;
        this.c = s1;
        this.d = zoh0;
        this.e = zht0;
    }

    @Override  // aaem
    public final int a() {
        return 5;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zoo)) {
            return false;
        }
        if(!ibuq.m(this.a, ((zoo)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((zoo)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((zoo)object0).c)) {
            return false;
        }
        return this.d == ((zoo)object0).d ? ibuq.m(this.e, ((zoo)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((this.a == null ? 0 : this.a.hashCode()) * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
        zht zht0 = this.e;
        if(zht0 != null) {
            v = zht0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "SearchResultListItem(image=" + this.a + ", title=" + this.b + ", description=" + this.c + ", position=" + this.d + ", link=" + this.e + ")";
    }
}

