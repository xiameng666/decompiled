public final class fmjo {
    public final fmjm a;
    public final String b;
    public final gfsx c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public fmjo() {
        throw null;
    }

    public fmjo(fmjm fmjm0, String s, gfsx gfsx0, int v, int v1, int v2, int v3) {
        this.a = fmjm0;
        this.b = s;
        this.c = gfsx0;
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.g = v3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof fmjo)) {
            fmjm fmjm0 = this.a;
            if(fmjm0 != null) {
                if(fmjm0.equals(((fmjo)object0).a)) {
                label_8:
                    String s = this.b;
                    if(s == null) {
                        return ((fmjo)object0).b == null ? this.c.equals(((fmjo)object0).c) && this.d == ((fmjo)object0).d && this.e == ((fmjo)object0).e && this.f == ((fmjo)object0).f && this.g == ((fmjo)object0).g : false;
                    }
                    return s.equals(((fmjo)object0).b) ? this.c.equals(((fmjo)object0).c) && this.d == ((fmjo)object0).d && this.e == ((fmjo)object0).e && this.f == ((fmjo)object0).f && this.g == ((fmjo)object0).g : false;
                }
            }
            else if(((fmjo)object0).a == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        String s = this.b;
        if(s != null) {
            v = s.hashCode();
        }
        return this.g ^ ((((((v1 ^ 1000003) * 1000003 ^ v) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d) * 1000003 ^ this.e) * 1000003 ^ this.f) * 1000003;
    }

    @Override
    public final String toString() {
        return "PhotoData{mediaId=" + this.a + ", localURI=" + this.b + ", thumbnail=" + this.c + ", width=" + this.d + ", height=" + this.e + ", size=" + this.f + ", downloadStatus=" + this.g + "}";
    }
}

