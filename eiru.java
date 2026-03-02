public final class eiru implements fpku {
    @Override  // fpku
    public final Object a(hfsl hfsl0) {
        goap goap1;
        gggc gggc0 = fpkx.d(hfsl0).b;
        ggdy ggdy0 = gged_interceptors.e(gggc0.size());
        ggqj ggqj0 = gggc0.om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            fpkw fpkw0 = (fpkw)object0;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)goap.a).v_newBuilder();
            String s = fpkw0.h();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s.getClass();
            ((goap)hftv0).b |= 1;
            ((goap)hftv0).c = s;
            int v = fpkw0.c;
            switch(v) {
                case 0: {
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    ((goap)hftv1).i = 2;
                    ((goap)hftv1).b |= 0x40;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    goap goap2 = (goap)hftp0.b_message;
                    goap2.b |= 4;
                    goap2.e = false;
                    goap1 = (goap)hftp0.N_build();
                    break;
                }
                case 1: {
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp0.b_message;
                    ((goap)hftv2).i = 2;
                    ((goap)hftv2).b |= 0x40;
                    if(!hftv2.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    goap goap3 = (goap)hftp0.b_message;
                    goap3.b |= 4;
                    goap3.e = true;
                    goap1 = (goap)hftp0.N_build();
                    break;
                }
                case 2: {
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp0.b_message;
                    ((goap)hftv3).i = 1;
                    ((goap)hftv3).b |= 0x40;
                    long v1 = fpkw0.d;
                    if(!hftv3.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    goap goap4 = (goap)hftp0.b_message;
                    goap4.b |= 2;
                    goap4.d = v1;
                    goap1 = (goap)hftp0.N_build();
                    break;
                }
                case 3: {
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((goap)hftp0.b_message).i = 3;
                    ((goap)hftp0.b_message).b |= 0x40;
                    double f = Double.longBitsToDouble(fpkw0.d);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    goap goap5 = (goap)hftp0.b_message;
                    goap5.b |= 8;
                    goap5.f = f;
                    goap1 = (goap)hftp0.N_build();
                    break;
                }
                case 4: {
                    Object object1 = fpkw0.e;
                    gftb.check(object1);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv4 = hftp0.b_message;
                    ((goap)hftv4).i = 4;
                    ((goap)hftv4).b |= 0x40;
                    if(!hftv4.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    goap goap6 = (goap)hftp0.b_message;
                    ((String)object1).getClass();
                    goap6.b |= 16;
                    goap6.g = (String)object1;
                    goap1 = (goap)hftp0.N_build();
                    break;
                }
                default: {
                    if(v != 5) {
                        throw new AssertionError("Impossible, this was validated when parsed or created");
                    }
                    gftb.check(fpkw0.e);
                    ByteString hfsf0 = (fpkw0.e instanceof byte[]) ? ByteString.copyFrom(((byte[])fpkw0.e)) : ((ByteString)fpkw0.e);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((goap)hftp0.b_message).i = 5;
                    ((goap)hftp0.b_message).b |= 0x40;
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)goam.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    goam goam0 = (goam)hftp1.b_message;
                    hfsf0.getClass();
                    goam0.b |= 1;
                    goam0.c = hfsf0;
                    goam goam1 = (goam)hftp1.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    goap goap0 = (goap)hftp0.b_message;
                    goam1.getClass();
                    goap0.h = goam1;
                    goap0.b |= 0x20;
                    goap1 = (goap)hftp0.N_build();
                    break;
                }
            }
            ggdy0.i(goap1);
        }
        return ggdy0.h();
    }
}

