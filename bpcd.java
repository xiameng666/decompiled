final class bpcd {
    public final gfsx a;
    public final gfsx b;
    public final gfsx c;

    public bpcd() {
        throw null;
    }

    public bpcd(gfsx gfsx0, gfsx gfsx1, gfsx gfsx2) {
        this.a = gfsx0;
        this.b = gfsx1;
        this.c = gfsx2;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bpcd) && this.a.equals(((bpcd)object0).a) && this.b.equals(((bpcd)object0).b) && this.c.equals(((bpcd)object0).c);
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "EidOrCanonicDeviceId{eid=" + this.a.toString() + ", canonicDeviceId=" + this.b.toString() + ", account=" + this.c.toString() + "}";
    }
}

