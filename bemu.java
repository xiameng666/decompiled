public final class bemu implements beok {
    @Override  // beok
    public final Object a(Object object0, Object object1) {
        boolean z = false;
        if(bedv.d(((bedv)object0))) {
            Boolean boolean0 = Boolean.valueOf(false);
            if(ibuq.m(((bedv)object0).b, boolean0) && bedv.d(((bedv)object1)) && ibuq.m(((bedv)object1).b, boolean0)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}

