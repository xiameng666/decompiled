final class dxbn extends ibuo implements ibtw {
    public dxbn(Object object0) {
        super(2, object0, dxbp.class, "onCustomFieldFocusChange", "onCustomFieldFocusChange(Lcom/google/android/gms/pay/pass/valuable/view/ucp/UcpInputItem;Z)V", 0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        int v = 0;
        boolean z = ((Boolean)object1).booleanValue();
        ibuq.f(((dxcw)object0), "p0");
        dxbp dxbp0 = (dxbp)this.e;
        int v1 = dxbp0.f.indexOf(((dxcw)object0));
        if(v1 >= 0) {
            if(!z) {
                dxbp0.L(((dxcw)object0), v1);
                if(((dxcw)object0).h == null && ((dxcw)object0).i == null && !ibzk.D(((dxcw)object0).b) && !ibzk.D(((dxcw)object0).c)) {
                    v = 1;
                }
            }
            if(((dxcw)object0).f != v) {
                ((dxcw)object0).g = v ^ 1;
                ((dxcw)object0).f = v;
                dxbp0.r(dxbp0.n() + v1);
            }
        }
        return ibom.a;
    }
}

