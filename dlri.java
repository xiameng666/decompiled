final class dlri implements ibtw {
    final dlrl a;

    public dlri(dlrl dlrl0) {
        this.a = dlrl0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        fhxi fhxi0 = (fhxi)((goz)object0).h(fsdq.a);
        dlrl dlrl0 = this.a;
        fhvp[] arr_fhvp = new fhvp[1];
        gjdt gjdt0 = gjds.a(((ProtoLiteMessage)gjdw.a).v_newBuilder());
        gjin gjin0 = gjim.a(((ProtoLiteMessage)gjdx.a).v_newBuilder());
        dxev dxev0 = dlrl0.aj;
        String s = null;
        if(dxev0 != null) {
            hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
            if(hkhr0 != null) {
                hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
                if(hkhh0 != null) {
                    hkgs hkgs0 = hkhh0.h == null ? hkgs.a : hkhh0.h;
                    if(hkgs0 != null) {
                        s = hkgs0.c;
                    }
                }
            }
        }
        if(s == null) {
            s = "";
        }
        gjin0.b(s);
        gjdt0.d(gjin0.a());
        arr_fhvp[0] = douf.b(gjdt0.a());
        fhxi0.c(0x2EB1E, arr_fhvp, null, null, gzf.e(0xB05F02CC, new dlrh(dlrl0), ((goz)object0)), ((goz)object0), 0xC00006, 0x7C);
        return ibom.a;
    }
}

