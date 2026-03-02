public final class htdb implements htda {
    @Deprecated
    public static final fpnz a;
    @Deprecated
    public static final fpnz b;
    @Deprecated
    public static final fpnz c;

    static {
        htdb.a = htcp.a.i("TidepoolFeature__enable_instant_hotspot", false);
        htdb.b = htcp.a.i("TidepoolFeature__enable_instant_wifi", true);
        htdb.c = htcp.a.i("TidepoolFeature__enable_tidepool_eligibility_checker", false);
    }

    @Override  // htda
    public final boolean a(fppj fppj0) {
        return ((Boolean)htdb.a.mt(fppj0)).booleanValue();
    }

    @Override  // htda
    public final boolean b(fppj fppj0) {
        return ((Boolean)htdb.b.mt(fppj0)).booleanValue();
    }

    @Override  // htda
    public final boolean c(fppj fppj0) {
        return ((Boolean)htdb.c.mt(fppj0)).booleanValue();
    }
}

