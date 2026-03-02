public final class ajak {
    public final int a;
    public final ajaj b;

    public ajak() {
        throw null;
    }

    public ajak(int v, ajaj ajaj0) {
        this.a = v;
        this.b = ajaj0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ajak) && this.a == ((ajak)object0).a && this.b.equals(((ajak)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "RestoreOptions{restoreType=" + this.a + ", writeOption=" + this.b + "}";
    }
}

