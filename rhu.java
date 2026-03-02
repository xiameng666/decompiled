public final class rhu {
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final gged_interceptors e;
    public final String f;

    public rhu() {
        throw null;
    }

    public rhu(int v, String s, int v1, String s1, gged_interceptors gged0, String s2) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = s1;
        this.e = gged0;
        this.f = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof rhu) && this.a == ((rhu)object0).a && this.b.equals(((rhu)object0).b) && this.c == ((rhu)object0).c && this.d.equals(((rhu)object0).d) && ggia.i(this.e, ((rhu)object0).e) && this.f.equals(((rhu)object0).f);
    }

    @Override
    public final int hashCode() {
        return this.f.hashCode() ^ (((((this.a ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "HttpResponse{contentType=" + this.a + ", body=" + this.b + ", responseCode=" + this.c + ", responseMessage=" + this.d + ", cookies=" + this.e + ", location=" + this.f + "}";
    }
}

