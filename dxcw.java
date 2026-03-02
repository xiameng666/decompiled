public final class dxcw {
    public final int a;
    public String b;
    public String c;
    public final String d;
    public final gvca e;
    public boolean f;
    public boolean g;
    public String h;
    public String i;
    public final gvcb j;
    public gvbh k;
    public gvbj l;
    private final String m;

    public dxcw(String s, int v, String s1, String s2, String s3, gvca gvca0, boolean z, boolean z1, gvcb gvcb0, gvbh gvbh0, gvbj gvbj0, int v1) {
        if((v1 & 0x20) != 0) {
            gvca0 = gvca.a;
        }
        if((v1 & 0x400) != 0) {
            gvcb0 = gvcb.a;
        }
        if((v1 & 0x800) != 0) {
            gvbh0 = gvbh.a;
        }
        if((v1 & 0x1000) != 0) {
            gvbj0 = gvbj.a;
        }
        ibuq.f(s, "dedupKey");
        ibuq.f(s1, "label");
        ibuq.f(s2, "value");
        ibuq.f(s3, "suggestedValue");
        ibuq.f(gvca0, "fieldPlacement");
        ibuq.f(gvcb0, "inputType");
        ibuq.f(gvbh0, "localDateInput");
        ibuq.f(gvbj0, "localTimeInput");
        super();
        this.m = s;
        this.a = v;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = gvca0;
        this.f = ((int)z) & ((v1 & 0x40) == 0 ? 1 : 0);
        this.g = ((int)z1) & ((v1 & 0x80) == 0 ? 1 : 0);
        this.h = null;
        this.i = null;
        this.j = gvcb0;
        this.k = gvbh0;
        this.l = gvbj0;
    }

    public final void a(String s) {
        ibuq.f(s, "<set-?>");
        this.b = s;
    }

    public final void b(String s) {
        ibuq.f(s, "<set-?>");
        this.c = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dxcw)) {
            return false;
        }
        if(!ibuq.m(this.m, ((dxcw)object0).m)) {
            return false;
        }
        if(this.a != ((dxcw)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((dxcw)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((dxcw)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((dxcw)object0).d)) {
            return false;
        }
        if(this.e != ((dxcw)object0).e) {
            return false;
        }
        if(this.f != ((dxcw)object0).f) {
            return false;
        }
        if(this.g != ((dxcw)object0).g) {
            return false;
        }
        if(!ibuq.m(this.h, ((dxcw)object0).h)) {
            return false;
        }
        if(!ibuq.m(this.i, ((dxcw)object0).i)) {
            return false;
        }
        if(this.j != ((dxcw)object0).j) {
            return false;
        }
        return ibuq.m(this.k, ((dxcw)object0).k) ? ibuq.m(this.l, ((dxcw)object0).l) : false;
    }

    @Override
    public final int hashCode() {
        int v6;
        int v = ((((this.m.hashCode() * 0x1F + this.a) * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode();
        int v1 = dxcv.a(this.f);
        int v2 = dxcv.a(this.g);
        int v3 = 0;
        int v4 = this.h == null ? 0 : this.h.hashCode();
        String s = this.i;
        if(s != null) {
            v3 = s.hashCode();
        }
        int v5 = (((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v4) * 0x1F + v3) * 0x1F + this.j.hashCode()) * 0x1F;
        gvbh gvbh0 = this.k;
        if(((ProtoLiteMessage)gvbh0).isImmutable()) {
            v6 = ((ProtoLiteMessage)gvbh0).s();
        }
        else {
            int v7 = gvbh0.memoizedHashCode;
            if(v7 == 0) {
                v7 = ((ProtoLiteMessage)gvbh0).s();
                gvbh0.memoizedHashCode = v7;
            }
            v6 = v7;
        }
        gvbj gvbj0 = this.l;
        if(((ProtoLiteMessage)gvbj0).isImmutable()) {
            return (v5 + v6) * 0x1F + ((ProtoLiteMessage)gvbj0).s();
        }
        int v8 = gvbj0.memoizedHashCode;
        if(v8 == 0) {
            v8 = ((ProtoLiteMessage)gvbj0).s();
            gvbj0.memoizedHashCode = v8;
        }
        return (v5 + v6) * 0x1F + v8;
    }

    @Override
    public final String toString() {
        return "UcpInputItem(dedupKey=" + this.m + ", semanticTagValue=" + this.a + ", label=" + this.b + ", value=" + this.c + ", suggestedValue=" + this.d + ", fieldPlacement=" + this.e + ", collapsed=" + this.f + ", autoFocusOnTitle=" + this.g + ", titleValidationError=" + this.h + ", descriptionValidationError=" + this.i + ", inputType=" + this.j + ", localDateInput=" + this.k + ", localTimeInput=" + this.l + ")";
    }
}

