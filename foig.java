public final class foig {
    public final foik a;
    public final foij b;
    public final foii c;
    public final fodo d;
    public final fnxp e;
    public final int f;

    public foig() {
        throw null;
    }

    public foig(foik foik0, foij foij0, foii foii0, fodo fodo0, fnxp fnxp0) {
        this.a = foik0;
        this.b = foij0;
        this.c = foii0;
        this.d = fodo0;
        this.f = 1;
        this.e = fnxp0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof foig) && this.a.equals(((foig)object0).a) && this.b.equals(((foig)object0).b) && this.c.equals(((foig)object0).c) && this.d.equals(((foig)object0).d)) {
            int v = ((foig)object0).f;
            if(this.f != 0) {
                return v == 1 && this.e.equals(((foig)object0).e);
            }
            throw null;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        foim.b(this.f);
        return this.e.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ 0x4D5) * 1000003 ^ 1) * 1000003;
    }

    @Override
    public final String toString() {
        return "Configuration{onViewCreatedCallback=" + this.a + ", onDismissCallback=" + this.b + ", onDestroyCallback=" + this.c + ", visualElements=" + this.d + ", isExperimental=false, largeScreenDialogAlignment=" + foim.a(this.f) + ", materialVersion=" + this.e + "}";
    }
}

