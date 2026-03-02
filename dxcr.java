import java.util.List;

final class dxcr extends ibuo implements ibtw {
    public dxcr(Object object0) {
        super(2, object0, dxct.class, "onCustomFieldFocusChange", "onCustomFieldFocusChange(Lcom/google/android/gms/pay/pass/valuable/view/ucp/UcpInputItem;Z)V", 0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        boolean z = ((Boolean)object1).booleanValue();
        ibuq.f(((dxcw)object0), "p0");
        dxct dxct0 = (dxct)this.e;
        List list0 = dxct0.f;
        if(list0 == null) {
            ibuq.j("customFieldList");
            list0 = null;
        }
        int v = 0;
        int v1 = list0.indexOf(((dxcw)object0));
        if(v1 >= 0) {
            if(!z) {
                dxct0.M(((dxcw)object0), v1);
                if(((dxcw)object0).h == null && ((dxcw)object0).i == null && !ibzk.D(((dxcw)object0).b) && !ibzk.D(((dxcw)object0).c)) {
                    v = 1;
                }
            }
            if(((dxcw)object0).f != v) {
                ((dxcw)object0).g = v ^ 1;
                ((dxcw)object0).f = v;
                dxct0.r(dxct0.n() + v1);
            }
        }
        return ibom.a;
    }
}

