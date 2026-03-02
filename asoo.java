import java.util.concurrent.Callable;

public final class asoo implements Callable {
    public final asop a;

    public asoo(asop asop0) {
        this.a = asop0;
    }

    @Override
    public final Object call() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ccnn.a).v_newBuilder();
        asop asop0 = this.a;
        ccol ccol0 = asop0.c;
        if(ccol0.b) {
            int v = asop0.b == null ? asop0.a.f() : ((asxl)asop0.a).h(asop0.b);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ccnn)hftp0.b_message).c = v - 2;
        }
        int v1 = 3;
        if(ccol0.c) {
            int v2 = 5;
            switch(((fpwn)((asxl)asop0.a).b.mr()).c().ordinal()) {
                case 0: {
                    v2 = 8;
                    break;
                }
                case 1: {
                    v2 = 4;
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    v2 = 6;
                    break;
                }
                case 4: {
                    v2 = 7;
                    break;
                }
                case 5: {
                    v2 = 9;
                    break;
                }
                default: {
                    throw new RuntimeException(null, null);
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ccnn)hftp0.b_message).e = v2 - 2;
        }
        if(ccol0.d) {
            gfsx gfsx0 = asop0.a.c();
            if(gfsx0.i()) {
                arzs arzs0 = (arzs)gfsx0.d();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ccnm.a).v_newBuilder();
                long v3 = arzs0.c;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((ccnm)hftv0).b = v3;
                long v4 = arzs0.d;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((ccnm)hftp1.b_message).c = v4;
                if((arzs0.b & 4) == 0) {
                    v1 = 2;
                }
                else {
                    arzt arzt0 = arzs0.e == null ? arzt.a : arzs0.e;
                    switch((arzr.a(arzt0.c) == 0 ? 1 : arzr.a(arzt0.c)) - 1) {
                        case 1: {
                            break;
                        }
                        case 2: {
                            v1 = 4;
                            break;
                        }
                        default: {
                            v1 = 2;
                        }
                    }
                }
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((ccnm)hftp1.b_message).d = v1 - 2;
                ccnm ccnm0 = (ccnm)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ccnn ccnn0 = (ccnn)hftp0.b_message;
                ccnm0.getClass();
                ccnn0.d = ccnm0;
                ccnn0.b |= 1;
            }
        }
        ccnn ccnn1 = (ccnn)hftp0.N_build();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ccnw.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ccnw ccnw0 = (ccnw)hftp2.b_message;
        ccnn1.getClass();
        ccnw0.c = ccnn1;
        ccnw0.b = 2;
        return (ccnw)hftp2.N_build();
    }
}

