public final class bedk {
    public final int a;
    public final int b;
    public final gfsx c;

    public bedk() {
        throw null;
    }

    public bedk(int v, int v1, gfsx gfsx0) {
        this.a = v;
        this.b = v1;
        this.c = gfsx0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bedk) && this.a == ((bedk)object0).a && this.b == ((bedk)object0).b && this.c.equals(((bedk)object0).c);
    }

    @Override
    public final int hashCode() {
        return (this.b ^ (this.a ^ 1000003) * 1000003) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "ErrorEvent{titleResId=" + this.a + ", descriptionResId=" + this.b + ", actionResId=" + this.c + "}";
    }
}

