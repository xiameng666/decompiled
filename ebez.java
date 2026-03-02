public final class ebez {
    private final edmh a;

    public ebez(edmh edmh0) {
        this.a = edmh0;
    }

    public final gfnx a(gfnw gfnw0) {
        gfnu gfnu0;
        ibuq.f(gfnw0, "request");
        int v = gfnw0.b;
        int v1 = gfnv.a(v);
        if(v1 != 0) {
            switch(v1 - 1) {
                case 0: {
                    edmh edmh0 = this.a;
                    if(v == 2) {
                        gfnu0 = gfnu.b(((Integer)gfnw0.c).intValue());
                        if(gfnu0 == null) {
                            gfnu0 = gfnu.d;
                        }
                    }
                    else {
                        gfnu0 = gfnu.a;
                    }
                    edmh0.d(new edly(gfnu0));
                    ibuq.e(gfnx.a, "getDefaultInstance(...)");
                    return gfnx.a;
                }
                case 1: {
                    gfnu gfnu1 = gfnu.b(this.a.a().k);
                    if(gfnu1 == null) {
                        gfnu1 = gfnu.d;
                    }
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gfnx.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gfnx gfnx0 = (gfnx)hftp0.b_message;
                    gfnx0.c = gfnu1.a();
                    gfnx0.b = 1;
                    ProtoLiteMessage hftv0 = hftp0.N_build();
                    ibuq.e(hftv0, "build(...)");
                    return (gfnx)hftv0;
                }
                default: {
                    throw new cjuh(13, null);
                }
            }
        }
        throw null;
    }
}

