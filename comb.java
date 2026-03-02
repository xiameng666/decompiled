import j..util.DesugarCollections;

public final class comb implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = Boolean.valueOf(false);
        if(!((gfsx)object0).i()) {
            return object1;
        }
        for(Object object2: DesugarCollections.unmodifiableMap(((cogp)((gfsx)object0).d()).b).values()) {
            cogs cogs0 = (cogs)object2;
            if((cogs0.b & 0x20) != 0 && cogr.a(cogs0.h) == 2) {
                return Boolean.valueOf(true);
            }
        }
        return object1;
    }
}

