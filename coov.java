import j..util.DesugarCollections;

public final class coov implements glzn {
    @Override  // glzn
    public final gmcd a(Object object0) {
        if(!((gfsx)object0).i()) {
            return gmbx.a;
        }
        long v = System.currentTimeMillis();
        for(Object object1: DesugarCollections.unmodifiableMap(((cogp)((gfsx)object0).d()).b).values()) {
            cogs cogs0 = (cogs)object1;
            long v1 = cogs0.d;
            coga coga0 = cogs0.e == null ? coga.a : cogs0.e;
            cofw cofw0 = coga0.f == null ? cofw.a : coga0.f;
            if(!cofw0.d && cofv.a(cofw0.c) == 3) {
                cong.i((huzk.K() ? cogs0.f : null), v - v1);
            }
        }
        return gmbx.a;
    }
}

