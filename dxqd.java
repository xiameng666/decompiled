final class dxqd extends ibsl implements ibtw {
    int a;
    final dxqi b;

    public dxqd(dxqi dxqi0, ibrl ibrl0) {
        this.b = dxqi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dxqd)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dxqd(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dxqi dxqi0 = this.b;
            dyfx dyfx0 = dyfw.a(((ProtoLiteMessage)dyfv.a).v_newBuilder());
            String s = dxqi0.j.name;
            ibuq.e(s, "name");
            dyfx0.b(s);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dyfb.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            dyna dyna0 = dyna.b;
            ibuq.f(dyna0, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dyfb dyfb0 = (dyfb)hftp0.b_message;
            dyfb0.b = dyna0.a();
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            ibuq.f(((dyfb)hftv0), "value");
            ProtoLiteBuilder hftp1 = dyfx0.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            dyfv dyfv0 = (dyfv)hftp1.b_message;
            ((dyfb)hftv0).getClass();
            dyfv0.c = (dyfb)hftv0;
            dyfv0.b = 10;
            byte[] arr_b = dyfx0.a().toBytesArray();
            evql evql0 = dxqi0.n.ba(arr_b);
            this.a = 1;
            object2 = fsdk.a(evql0, this);
            if(object2 == object1) {
                return object1;
            }
        }
        else {
            object2 = ((ibnw)object0).a;
        }
        dxqi dxqi1 = this.b;
        if(ibnw.b(object2)) {
            byte[] arr_b1 = (byte[])object2;
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dyfy.a), arr_b1, 0, arr_b1.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv1);
                ibuq.e(((dyfy)hftv1), "parseFrom(...)");
                if(((dyfy)hftv1).b == 9 && ((Boolean)((dyfy)hftv1).c).booleanValue()) {
                    icck icck0 = lsc.a(dxqi1);
                    dxqf dxqf0 = new dxqf(dxqi1, null);
                    icbb.b(icck0, dxqi1.l, null, dxqf0, 2);
                }
                else {
                    ((ggtj)dxqi.i.j()).x("Edy top-up failed because the chip balance and server balance did not match, but the chip balance did not need to be updated.");
                    dxmj.m(dxqi1, null, 3);
                }
            }
            catch(hfur hfur0) {
                a.ae(dxqi.i.i(), "Failed to parse EmoneyCardOperationResponse", hfur0);
                dxmj.m(dxqi1, null, 3);
            }
        }
        dxqi dxqi2 = this.b;
        Throwable throwable0 = ibnw.a(object2);
        if(throwable0 != null) {
            a.ae(dxqi.i.i(), "Failed to confirm the balance of this edy card.", throwable0);
            dxmj.m(dxqi2, dxsy.f(throwable0), 2);
        }
        return ibom.a;
    }
}

