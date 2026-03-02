final class fwxj extends gfsd {
    @Override  // gfsd
    protected final Object a(Object object0) {
        gwis gwis0 = (gwis)object0;
        throw new UnsupportedOperationException("converting from ActivityRecognitionProto to CHRE ActivityResultDiagnostics is not supported!");
    }

    @Override  // gfsd
    protected final Object b(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwis.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwis)hftp0.b_message).c = 2;
        ((gwis)hftp0.b_message).b |= 1;
        for(Object object1: ((gwxc)object0).b) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwiy.a).v_newBuilder();
            int v = gwxk.a(((gwxr)object1).d);
            if(v == 0) {
                v = 1;
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            int v1 = gwiv.a(v - 1);
            if(v1 == 0) {
                throw null;
            }
            ((gwiy)hftv0).f = v1 - 1;
            ((gwiy)hftv0).b |= 8;
            int v2 = gwxq.a(((gwxr)object1).b);
            if(v2 == 0) {
                v2 = 1;
            }
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            int v3 = gwix.a(v2 - 1);
            gwiy gwiy0 = (gwiy)hftp1.b_message;
            if(v3 == 0) {
                throw null;
            }
            gwiy0.c = v3 - 1;
            gwiy0.b |= 1;
            long v4 = System.currentTimeMillis();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((gwiy)hftv1).b |= 4;
            ((gwiy)hftv1).e = v4;
            long v5 = ((gwxr)object1).c;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwiy gwiy1 = (gwiy)hftp1.b_message;
            gwiy1.b |= 2;
            gwiy1.d = v5;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwja.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwja gwja0 = (gwja)hftp2.b_message;
            gwja0.b |= 2;
            gwja0.c = 100.0f;
            gwxi gwxi0 = gwxi.b(((gwxr)object1).e);
            if(gwxi0 == null) {
                gwxi0 = gwxi.a;
            }
            Integer integer0 = fwxc.b(gwxi0);
            if(integer0 != null) {
                int v6 = (int)integer0;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gwja gwja1 = (gwja)hftp2.b_message;
                gwja1.b |= 4;
                gwja1.d = v6;
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwiy gwiy2 = (gwiy)hftp1.b_message;
            gwja gwja2 = (gwja)hftp2.N_build();
            gwja2.getClass();
            gwiy2.g = gwja2;
            gwiy2.b |= 16;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwis gwis0 = (gwis)hftp0.b_message;
            gwiy gwiy3 = (gwiy)hftp1.N_build();
            gwiy3.getClass();
            hfuo hfuo0 = gwis0.d;
            if(!hfuo0.c()) {
                gwis0.d = ProtoLiteMessage.E(hfuo0);
            }
            gwis0.d.add(gwiy3);
            continue;
        }
        return (gwis)hftp0.N_build();
    }
}

