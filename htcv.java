public final class htcv implements htcu {
    @Deprecated
    public static final fpnz a;

    static {
        htcv.a = htcp.a.i("PayModuleGaiaFeature__octopus_card_enabled", false);
    }

    @Override  // htcu
    public final boolean a(fppj fppj0) {
        return ((Boolean)htcv.a.mt(fppj0)).booleanValue();
    }
}

