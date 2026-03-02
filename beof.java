public final class beof implements beok {
    public final beok a;

    public beof(beok beok0) {
        this.a = beok0;
    }

    @Override  // beok
    public final Object a(Object object0, Object object1) {
        bedu bedu0 = ((bedv)object0).a;
        bedu bedu1 = ((bedv)object1).a;
        bedu bedu2 = bedu.a;
        if(bedu0 == bedu2 && bedu1 == bedu2) {
            gftb.check(((bedv)object0).b);
            gftb.check(((bedv)object1).b);
            return new bedv(bedu2, this.a.a(((bedv)object0).b, ((bedv)object1).b), null);
        }
        return ((int)beos.d(bedu1)) <= ((int)beos.d(bedu0)) ? beos.c(((bedv)object0)) : beos.c(((bedv)object1));
    }
}

