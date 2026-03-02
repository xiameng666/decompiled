final class icp extends ibur implements ibtw {
    final icq a;

    public icp(icq icq0) {
        this.a = icq0;
        super(2);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        icq icq0 = (icq)object1;
        iag iag0 = ((ify)object0).w;
        icq icq1 = this.a;
        if(iag0 == null) {
            iag iag1 = new iag(((ify)object0), icq1.a);
            ((ify)object0).w = iag1;
            iag0 = iag1;
        }
        icq1.b = iag0;
        icq1.a().j();
        iag iag2 = icq1.a();
        ict ict0 = icq1.a;
        if(iag2.c != ict0) {
            iag2.c = ict0;
            iag2.k(false);
            ify.ax(iag2.a, false, 7);
        }
        return ibom.a;
    }
}

