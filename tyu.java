public final class tyu implements ibtx {
    public final tzn a;

    public tyu(tzn tzn0) {
        this.a = tzn0;
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ibuq.f(((iax)object0), "$this$layout");
        ibuq.f(((ias)object1), "measurable");
        long v = ((jkp)object2).a;
        int v1 = 0x80000000;
        int v2 = jkp.j(v) ? jkp.b(v) : 0x80000000;
        if(jkp.i(v)) {
            v1 = jkp.a(v);
        }
        uae uae0 = !uqq.m(v2) || !uqq.m(v1) ? null : new uae(v2, v1);
        if(uae0 != null) {
            this.a.a.V(uae0);
        }
        ibq ibq0 = ((ias)object1).e(v);
        return iaw.b(((iax)object0), ibq0.a, ibq0.b, new tyt(ibq0));
    }
}

