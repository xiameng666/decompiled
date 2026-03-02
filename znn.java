public final class znn extends aaex {
    public final znl a;
    public final zhr b;
    public final String c;
    public final zne d;
    public final gged_interceptors e;
    public final zoh f;
    public final boolean g;
    private final grxw i;
    private final boolean j;

    public znn(grxw grxw0, znl znl0, zhr zhr0, String s, zne zne0, gged_interceptors gged0, zoh zoh0, boolean z, boolean z1) {
        ibuq.f(grxw0, "resourceKey");
        ibuq.f(s, "title");
        ibuq.f(gged0, "buttonUnitItems");
        ibuq.f(zoh0, "stackPosition");
        super(grxw0);
        this.i = grxw0;
        this.a = znl0;
        this.b = zhr0;
        this.c = s;
        this.d = zne0;
        this.e = gged0;
        this.f = zoh0;
        this.g = z;
        this.j = z1;
    }

    @Override  // aaem
    public final int a() {
        return 9;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof znn)) {
            return false;
        }
        if(!ibuq.m(this.i, ((znn)object0).i)) {
            return false;
        }
        if(!ibuq.m(this.a, ((znn)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((znn)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((znn)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((znn)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((znn)object0).e)) {
            return false;
        }
        if(this.f != ((znn)object0).f) {
            return false;
        }
        return this.g == ((znn)object0).g ? this.j == ((znn)object0).j : false;
    }

    @Override
    public final int hashCode() {
        int v;
        grxw grxw0 = this.i;
        if(((ProtoLiteMessage)grxw0).isImmutable()) {
            v = ((ProtoLiteMessage)grxw0).s();
        }
        else {
            int v1 = grxw0.memoizedHashCode;
            if(v1 == 0) {
                v1 = ((ProtoLiteMessage)grxw0).s();
                grxw0.memoizedHashCode = v1;
            }
            v = v1;
        }
        int v2 = 0;
        int v3 = (((v * 0x1F + this.a.hashCode()) * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + this.c.hashCode()) * 0x1F;
        zne zne0 = this.d;
        if(zne0 != null) {
            v2 = zne0.hashCode();
        }
        return ((((v3 + v2) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + zmz.a(this.g)) * 0x1F + zmz.a(this.j);
    }

    @Override
    public final String toString() {
        return "AdviceCardListItem(resourceKey=" + this.i + ", severity=" + this.a + ", icon=" + this.b + ", title=" + this.c + ", contentUnit=" + this.d + ", buttonUnitItems=" + this.e + ", stackPosition=" + this.f + ", isExpanded=" + this.g + ", animateOnAdd=" + this.j + ")";
    }
}

