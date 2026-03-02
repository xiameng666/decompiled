public final class fltf {
    public final gfsx a;
    public final boolean b;
    public final gfsx c;

    public fltf() {
        throw null;
    }

    public fltf(gfsx gfsx0, boolean z, gfsx gfsx1) {
        this.a = gfsx0;
        this.b = z;
        this.c = gfsx1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fltf) && this.a.equals(((fltf)object0).a) && this.b == ((fltf)object0).b && this.c.equals(((fltf)object0).c);
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        return this.b ? this.c.hashCode() ^ (v * 1000003 ^ 0x4CF) * 1000003 : this.c.hashCode() ^ (v * 1000003 ^ 0x4D5) * 1000003;
    }

    @Override
    public final String toString() {
        return "ChangeGroupProfile{conversationId=" + this.a + ", syncBlockStatus=" + this.b + ", profileInfo=" + this.c + "}";
    }
}

