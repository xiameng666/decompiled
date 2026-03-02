public final class gptx {
    public static final int a;

    static {
        gptx.b(fuxh.c);
        gptx.b(fuxh.a);
        gptx.b(fuxh.b);
        gptx.b(fuxh.e);
        gptx.b(fuxh.d);
    }

    public static motionState a(fuxg fuxg0) {
        switch(fuxg0.b().a.ordinal()) {
            case 0: {
                return motionState.IN_VEHICLE;
            }
            case 1: {
                return motionState.ON_BICYCLE;
            }
            case 2: {
                return motionState.ON_FOOT;
            }
            case 3: {
                return motionState.STILL;
            }
            default: {
                return motionState.UNKNOWN;
            }
        }
    }

    private static void b(fuxh fuxh0) {
        new fuxg(gged_interceptors.l(new fuxi(fuxh0, 100)), 0L, 0L, 0);
    }
}

