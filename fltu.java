public final class fltu {
    public final String a;
    public final fltt b;

    public fltu() {
        throw null;
    }

    public fltu(String s, fltt fltt0) {
        this.a = s;
        this.b = fltt0;
    }

    public final flsn a() {
        return this.b.a();
    }

    public final flsn b() {
        return this.b.f();
    }

    public final fltf c() {
        return this.b.d();
    }

    public final fltk d() {
        return this.b.e();
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fltu) && this.a.equals(((fltu)object0).a) && this.b.equals(((fltu)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "Push{pushId=" + this.a + ", oneOfType=" + this.b + "}";
    }
}

