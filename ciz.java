public final class ciz implements ibth {
    public final Object a;
    public final cit b;
    public final Object c;
    public final cir d;

    public ciz(Object object0, cit cit0, Object object1, cir cir0) {
        this.a = object0;
        this.b = cit0;
        this.c = object1;
        this.d = cir0;
    }

    @Override  // ibth
    public final Object a() {
        cit cit0 = this.b;
        Object object0 = this.a;
        boolean z = ibuq.m(object0, cit0.a);
        Object object1 = this.c;
        if(!z || !ibuq.m(object1, cit0.b)) {
            cit0.a = object0;
            cit0.b = object1;
            cit0.c = this.d;
            cit0.d = new ckv(this.d, cit0.i, object0, object1);
            cit0.h.a(true);
            cit0.e = false;
            cit0.f = true;
        }
        return ibom.a;
    }
}

