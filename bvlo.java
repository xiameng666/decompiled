public final class bvlo {
    public final buyi a;
    public final String b;
    public final int c;

    public bvlo(buyi buyi0, String s, int v) {
        ibuq.f(buyi0, "id");
        ibuq.f(s, "title");
        super();
        this.a = buyi0;
        this.b = s;
        this.c = v;
    }

    public static bvlo a(bvlo bvlo0, int v) {
        ibuq.f(bvlo0.a, "id");
        ibuq.f(bvlo0.b, "title");
        return new bvlo(bvlo0.a, bvlo0.b, v);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bvlo)) {
            return false;
        }
        if(this.a != ((bvlo)object0).a) {
            return false;
        }
        return ibuq.m(this.b, ((bvlo)object0).b) ? this.c == ((bvlo)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c;
    }

    @Override
    public final String toString() {
        return "SettingsCategoryInfo(id=" + this.a + ", title=" + this.b + ", priority=" + this.c + ")";
    }
}

