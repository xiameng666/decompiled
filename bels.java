public final class bels implements ibts {
    public final belv a;

    public bels(belv belv0) {
        this.a = belv0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((bedv)object0), "it");
        gfsx gfsx0 = this.a.c.b();
        if(!gfsx0.i()) {
            ((ggtj)belv.a.j()).x("Could not determine whether userRequiresPrivacyPreservation");
        }
        return ((Boolean)gfsx0.f(Boolean.valueOf(true))).booleanValue() ? ((bedv)object0).a(new belr()) : ((bedv)object0);
    }
}

