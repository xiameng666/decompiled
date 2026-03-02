public final class foan {
    public final gfsx a;
    public final gfsx b;
    public final gfsx c;
    public final gfsx d;
    public final gfsx e;
    public final gfsx f;
    public final foau g;
    public final boolean h;
    public final foam i;

    public foan() {
        throw null;
    }

    public foan(gfsx gfsx0, gfsx gfsx1, gfsx gfsx2, gfsx gfsx3, gfsx gfsx4, gfsx gfsx5, foau foau0, boolean z, foam foam0) {
        this.a = gfsx0;
        this.b = gfsx1;
        this.c = gfsx2;
        this.d = gfsx3;
        this.e = gfsx4;
        this.f = gfsx5;
        this.g = foau0;
        this.h = z;
        this.i = foam0;
    }

    public static foal a() {
        foal foal0 = new foal(null);
        foal0.a = gfsx.m(new foap(new foao()));
        foal0.d = true;
        foal0.f = 1;
        foal0.e = new foak();
        foal0.c = new foau();
        return foal0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof foan) && this.a.equals(((foan)object0).a) && this.b.equals(((foan)object0).b) && this.c.equals(((foan)object0).c) && this.d.equals(((foan)object0).d) && this.e.equals(((foan)object0).e) && this.f.equals(((foan)object0).f) && this.g.equals(((foan)object0).g) && this.h == ((foan)object0).h && this.i.equals(((foan)object0).i);
    }

    @Override
    public final int hashCode() {
        int v = ((((this.c.hashCode() ^ 0x323404A3) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ 2040732332) * 1000003 ^ this.g.hashCode();
        return this.h ? this.i.hashCode() ^ (v * 1000003 ^ 0x4CF) * 1000003 : this.i.hashCode() ^ (v * 1000003 ^ 0x4D5) * 1000003;
    }

    @Override
    public final String toString() {
        return "ExpressSignInFeatures{signInWithoutAccountFeature=" + this.a + ", disclaimerFeature=" + this.b + ", customHeaderContentFeature=" + this.c + ", logoViewFeature=" + this.d + ", cancelableFeature=" + this.e + ", materialVersion=" + this.f + ", secondaryButtonStyleFeature=" + this.g + ", supportAccountSwitching=" + this.h + ", customContinueButtonTextsFactory=" + this.i + "}";
    }
}

