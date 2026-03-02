public final class bgfa {
    public final bgfe a;
    public final String b;
    public final Integer c;
    public final boolean d;
    public final String e;
    public final bgbd f;

    public bgfa(bgfe bgfe0, String s, Integer integer0, boolean z, String s1, bgbd bgbd0) {
        ibuq.f(s, "title");
        super();
        this.a = bgfe0;
        this.b = s;
        this.c = integer0;
        this.d = z;
        this.e = s1;
        this.f = bgbd0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bgfa)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bgfa)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((bgfa)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((bgfa)object0).c)) {
            return false;
        }
        if(this.d != ((bgfa)object0).d) {
            return false;
        }
        return ibuq.m(this.e, ((bgfa)object0).e) ? ibuq.m(this.f, ((bgfa)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
        int v1 = this.e.hashCode();
        return this.d ? ((v * 0x1F + 0x4CF) * 0x1F + v1) * 0x1F + this.f.hashCode() : ((v * 0x1F + 0x4D5) * 0x1F + v1) * 0x1F + this.f.hashCode();
    }

    @Override
    public final String toString() {
        return "UiCredential(image=" + this.a + ", title=" + this.b + ", nrAccounts=" + this.c + ", truncateStart=" + this.d + ", signOnRealm=" + this.e + ", credentialTypes=" + this.f + ")";
    }
}

