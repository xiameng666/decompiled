public final class zol extends aaem {
    public final aaby a;
    public final zhr b;
    public final String c;
    public final String d;
    public final zok e;

    public zol(aaby aaby0, zhr zhr0, String s, String s1, zok zok0) {
        this.a = aaby0;
        this.b = zhr0;
        this.c = s;
        this.d = s1;
        this.e = zok0;
    }

    @Override  // aaem
    public final int a() {
        return 1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zol)) {
            return false;
        }
        if(!ibuq.m(this.a, ((zol)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((zol)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((zol)object0).c)) {
            return false;
        }
        return ibuq.m(this.d, ((zol)object0).d) ? ibuq.m(this.e, ((zol)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
        int v1 = 0;
        int v2 = this.d == null ? 0 : this.d.hashCode();
        zok zok0 = this.e;
        if(zok0 != null) {
            v1 = zok0.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "ErrorBannerListItem(message=" + this.a + ", image=" + this.b + ", title=" + this.c + ", description=" + this.d + ", action=" + this.e + ")";
    }
}

