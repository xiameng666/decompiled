final class bvho implements ibum, icih {
    final bvkk a;

    public bvho(bvkk bvkk0) {
        this.a = bvkk0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bvgb bvgb0;
        do {
            bvkk bvkk0 = this.a;
            icnl icnl0 = bvkk0.t;
            Object object1 = icnl0.b();
            bvge bvge0 = null;
            if(((String)object0) == null) {
                bvgb0 = null;
            }
            else {
                cmhx cmhx0 = bvhi.d(0x36714, null, null, null, 14);
                bvfm bvfm0 = new bvfm(bvkk0.s, cmhx0);
                if(bvkk0.h) {
                    bvge0 = new bvge(bvkk0.r.b(0x7F1507E4), new bvim(bvkk0), bvhi.d(223017, null, null, null, 14));  // string:common_asm_manage_google_account_title "Manage your Google Account"
                }
                bvgb0 = new bvgb(bvfm0, bvge0);
            }
        }
        while(!icnl0.h(object1, bvgx.a(((bvgx)object1), null, null, bvgb0, null, 27)));
        return ibom.a;
    }

    @Override  // ibum
    public final ibnk b() {
        return new ibue(2, this.a, bvkk.class, "updateAccountSelector", "updateAccountSelector(Ljava/lang/String;)V", 4);
    }

    @Override
    public final boolean equals(Object object0) {
        return !(object0 instanceof icih) || !(object0 instanceof ibum) ? false : ibuq.m(this.b(), ((ibum)object0).b());
    }

    @Override
    public final int hashCode() {
        return this.b().hashCode();
    }
}

