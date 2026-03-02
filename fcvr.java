final class fcvr implements ibtx {
    final fcvm[] a;
    final fcvw b;
    final dgg[] c;

    public fcvr(fcvm[] arr_fcvm, fcvw fcvw0, dgg[] arr_dgg) {
        this.a = arr_fcvm;
        this.b = fcvw0;
        this.c = arr_dgg;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((pmf)object0), "$this$ButtonGroup");
        fcvm[] arr_fcvm = this.a;
        for(int v1 = 0; v1 < arr_fcvm.length; ++v1) {
            this.b.d(((pmf)object0), arr_fcvm[v1], this.c[v1], this.b.b[v1], ((goz)object1), v & 14);
        }
        return ibom.a;
    }
}

