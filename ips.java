final class ips extends ibur implements ibts {
    final ipt a;

    public ips(ipt ipt0) {
        this.a = ipt0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ((jgt)object0).b();
        ipt ipt0 = this.a;
        gwq gwq0 = ipt0.c;
        Object[] arr_object = gwq0.a;
        int v = gwq0.b;
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= v) {
                v1 = -1;
                break;
            }
            if(ibuq.m(((ijp)arr_object[v1]), ((jgt)object0))) {
                break;
            }
        }
        if(v1 >= 0) {
            gwq0.c(v1);
        }
        if(gwq0.b == 0) {
            ipt0.a.a();
        }
        return ibom.a;
    }
}

