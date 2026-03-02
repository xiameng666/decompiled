final class atot extends ibsl implements ibtw {
    int a;
    final atpb b;
    final String c;
    final String d;

    public atot(atpb atpb0, String s, String s1, ibrl ibrl0) {
        this.b = atpb0;
        this.c = s;
        this.d = s1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((atot)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new atot(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            atpb atpb0 = this.b;
            if(atpb0 == null) {
                ((ggtj)atou.b.i()).x("BankAppScamDetectionManager not set");
            }
            else {
                this.a = 1;
                if(atpb0.b(this.c, this.d, this) == object1) {
                    return object1;
                }
            }
        }
        return ibom.a;
    }
}

