final class eaeg extends ibsl implements ibtw {
    int a;
    final eaeh b;

    public eaeg(eaeh eaeh0, ibrl ibrl0) {
        this.b = eaeh0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eaeg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eaeg(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        dygo dygo0;
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            eaeh eaeh0 = this.b;
            if(eaeh0.d) {
                eaeh0.a(new eaef(dygo.a));
                return ibom.a;
            }
            dyfx dyfx0 = dyfw.a(((ProtoLiteMessage)dyfv.a).v_newBuilder());
            dyfx0.b(eaeh0.c);
            hfsw hfsw0 = hfsx.a(((ProtoLiteMessage)hfsw.a).v_newBuilder()).a();
            ibuq.f(hfsw0, "value");
            ProtoLiteBuilder hftp0 = dyfx0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dyfv dyfv0 = (dyfv)hftp0.b_message;
            hfsw0.getClass();
            dyfv0.c = hfsw0;
            dyfv0.b = 4;
            byte[] arr_b = dyfx0.a().toBytesArray();
            evql evql0 = eaeh0.e.ba(arr_b);
            this.a = 1;
            object2 = fsdk.a(evql0, this);
            if(object2 == object1) {
                return object1;
            }
        }
        else {
            object2 = ((ibnw)object0).a;
        }
        eaeh eaeh1 = this.b;
        if(ibnw.b(object2)) {
            byte[] arr_b1 = (byte[])object2;
            ibuq.c(arr_b1);
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dyfy.a), arr_b1, 0, arr_b1.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                if(((dyfy)hftv0).b == 3) {
                    switch(((int)(((Integer)((dyfy)hftv0).c)))) {
                        case 0: {
                            dygo0 = dygo.a;
                            break;
                        }
                        case 1: {
                            dygo0 = dygo.b;
                            break;
                        }
                        default: {
                            dygo0 = null;
                        }
                    }
                    if(dygo0 == null) {
                        dygo0 = dygo.c;
                    }
                }
                else {
                    dygo0 = dygo.a;
                }
            }
            catch(hfur hfur0) {
                a.ae(eaeh.a.i(), "%s: Failed to parse EmoneyCardOperationResponse.", hfur0);
                dygo0 = dygo.a;
            }
            ibuq.c(dygo0);
            eaeh1.a(new eaef(dygo0));
        }
        eaeh eaeh2 = this.b;
        Throwable throwable0 = ibnw.a(object2);
        if(throwable0 != null) {
            eaeh2.a(new eaef(dygo.a));
            a.ae(eaeh.a.i(), "Failed to get SE chip issuer from Pay Api.", throwable0);
        }
        return ibom.a;
    }
}

