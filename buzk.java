public final class buzk implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ccoe)object0), "$this$getDirection");
        ccnn ccnn0 = ((ccoe)object0).d;
        if(ccnn0 == null) {
            ccnn0 = ccnn.a;
        }
        int v = 2;
        switch(ccnn0.c) {
            case 0: {
                break;
            }
            case 1: {
                v = 3;
                break;
            }
            case 2: {
                v = 4;
                break;
            }
            case 3: {
                v = 5;
                break;
            }
            default: {
                v = 0;
            }
        }
        if(v == 0) {
            return Boolean.valueOf(false);
        }
        return v == 3 ? Boolean.valueOf(true) : Boolean.valueOf(false);
    }
}

