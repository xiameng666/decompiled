final class duwk extends ibsl implements ibtw {
    final duxk a;
    final duwt b;

    public duwk(duxk duxk0, duwt duwt0, ibrl ibrl0) {
        this.a = duxk0;
        this.b = duwt0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((duwk)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new duwk(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        gtxg gtxg0 = this.a.d;
        if(gtxg0 != null) {
            duwt duwt0 = this.b;
            gtxb gtxb0 = gtxb.b(fshl.a(gtxg0).c);
            if(gtxb0 == null) {
                gtxb0 = gtxb.n;
            }
            switch(gtxb0.ordinal()) {
                case 7: 
                case 8: {
                    fyju fyju2 = duwt0.A();
                    fyju2.G(duwt0.getString(0x7F151DA7), new duvz(duwt0, gtxg0));  // string:pay_drivers_license_view_id "View ID"
                    fyju2.create();
                    fyju2.a();
                    break;
                }
                case 2: 
                case 3: 
                case 4: 
                case 10: {
                    fyju fyju0 = duwt0.A();
                    fyju0.G(duwt0.getString(0x7F151DA8), new duvw(duwt0, gtxg0));  // string:pay_drivers_license_view_pending_id "View pending request"
                    fyju0.create();
                    fyju0.a();
                    break;
                }
                case 5: 
                case 6: 
                case 12: {
                    fyju fyju1 = duwt0.A();
                    fyju1.G(duwt0.getString(0x7F151DA7), new duvv(duwt0, gtxg0));  // string:pay_drivers_license_view_id "View ID"
                    fyju1.create();
                    fyju1.a();
                }
            }
            duwt0.z().i();
        }
        return ibom.a;
    }
}

