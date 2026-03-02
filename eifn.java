public final class eifn {
    public static final int a;
    private static final ggeo b;

    static {
        ggek ggek0 = new ggek();
        ggek0.i(gwgu.c, eifm.a);
        ggek0.i(gwgu.e, eifm.a);
        ggek0.i(gwgu.f, eifm.a);
        ggek0.i(gwgu.d, eifm.b);
        ggek0.i(gwgu.b, eifm.c);
        eifn.b = ggek0.b();
    }

    static eifm a(gwgu gwgu0) {
        return eifn.b.containsKey(gwgu0) ? ((eifm)eifn.b.get(gwgu0)) : eifm.d;
    }

    public static String b(gwgu gwgu0) {
        switch(gwgu0.ordinal()) {
            case 1: {
                return "BLS-A";
            }
            case 2: {
                return "BLS-M";
            }
            case 3: {
                return "BLS-PA";
            }
            case 4: {
                return "BLS-PR";
            }
            case 5: {
                return "BLS-FD";
            }
            default: {
                return "BLS-U";
            }
        }
    }
}

