public final class dxxo extends gfsd {
    @Override  // gfsd
    protected final Object a(Object object0) {
        switch(((dydq)object0).ordinal()) {
            case 0: {
                return guvs.a;
            }
            case 1: {
                return guvs.b;
            }
            case 2: {
                return guvs.c;
            }
            default: {
                throw new IllegalArgumentException("unknown enum value: " + ((dydq)object0).toString());
            }
        }
    }

    @Override  // gfsd
    protected final Object b(Object object0) {
        switch(((guvs)object0).ordinal()) {
            case 0: {
                return dydq.a;
            }
            case 1: {
                return dydq.b;
            }
            case 2: {
                return dydq.c;
            }
            default: {
                throw new IllegalArgumentException("unknown enum value: " + ((guvs)object0).toString());
            }
        }
    }
}

