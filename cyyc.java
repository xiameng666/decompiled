public final class cyyc {
    public static final Object a(kba kba0, kaz kaz0) {
        int v = (int)hvpg.a.aY().eL();
        if(v > 1) {
            int v1 = 0;
            while(v1 < v) {
                Object object0 = kba0.a();
                if(kaz0.a(object0)) {
                    return object0;
                }
                ++v1;
                ((ggtj)cyjh.a.d().ar(0x2069)).z("WearApiRetryWrapper: retry#%s", v1);
            }
            return null;
        }
        return kba0.a();
    }
}

