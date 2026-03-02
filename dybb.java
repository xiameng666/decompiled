public final class dybb implements gftc {
    public final ggeo a;

    public dybb(ggeo ggeo0) {
        this.a = ggeo0;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        if(((dydu)object0).b == 3 && !((dydr)((dydu)object0).c).c.isEmpty()) {
            ggeo ggeo0 = this.a;
            if(ggeo0.containsKey((((dydu)object0).b == 3 ? ((dydr)((dydu)object0).c) : dydr.a).c)) {
                guvs guvs0 = (guvs)ggeo0.getOrDefault((((dydu)object0).b == 3 ? ((dydr)((dydu)object0).c) : dydr.a).c, guvs.a);
                gfsd gfsd0 = dyav.a.ic();
                dydr dydr0 = ((dydu)object0).b == 3 ? ((dydr)((dydu)object0).c) : dydr.a;
                return guvs0.equals(gfsd0.kt((dydq.b(dydr0.d) == null ? dydq.c : dydq.b(dydr0.d))));
            }
        }
        return false;
    }
}

