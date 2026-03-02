public final class fkto {
    public final hfub a;
    public final gmcd b;
    public final int c;

    public fkto() {
        throw null;
    }

    public fkto(hfub hfub0, int v, gmcd gmcd0) {
        this.a = hfub0;
        this.c = v;
        this.b = gmcd0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fkto) && this.a.equals(((fkto)object0).a) && this.c == ((fkto)object0).c && this.b.equals(((fkto)object0).b);
    }

    @Override
    public final int hashCode() {
        return (this.c ^ (this.a.hashCode() ^ 1000003) * 1000003) * 1000003 ^ this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "MultiSyncResult{syncId=" + this.a.toString() + ", syncContextType=" + fkts.a(this.c) + ", syncResults=" + this.b + "}";
    }
}

