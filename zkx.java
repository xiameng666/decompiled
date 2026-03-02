import j..util.Objects;

public final class zkx {
    public final String a;
    public final String b;
    public final grxw c;
    public final boolean d;
    public final String e;
    public final int f;
    public final zho g;

    public zkx(String s, String s1, grxw grxw0, boolean z, String s2, int v, zho zho0) {
        this.a = s;
        this.b = s1;
        this.c = grxw0;
        this.d = z;
        this.g = zho0;
        this.e = s2;
        this.f = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof zkx) ? this.d == ((zkx)object0).d && this.f == ((zkx)object0).f && Objects.equals(this.e, ((zkx)object0).e) && Objects.equals(this.a, ((zkx)object0).a) && Objects.equals(this.b, ((zkx)object0).b) && Objects.equals(this.c, ((zkx)object0).c) && Objects.equals(this.g, ((zkx)object0).g) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d), this.e, ((int)this.f), this.g});
    }
}

