public final class aqwi {
    public static ProtoLiteBuilder a(long v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aqfa.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqfa.b(((aqfa)hftp0.b_message));
        if(hqix.a.c().e()) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)aqez.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((aqez)hftv0).b |= 1;
            ((aqez)hftv0).c = 1;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            aqez aqez0 = (aqez)hftp1.b_message;
            aqez0.b |= 2;
            aqez0.d = 2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aqfa aqfa0 = (aqfa)hftp0.b_message;
            aqez aqez1 = (aqez)hftp1.N_build();
            aqez1.getClass();
            aqfa0.e = aqez1;
            aqfa0.b |= 0x400;
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)aqfe.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        aqfe aqfe0 = (aqfe)hftp2.b_message;
        aqfa aqfa1 = (aqfa)hftp0.N_build();
        aqfa1.getClass();
        aqfe0.m = aqfa1;
        aqfe0.b |= 0x1000;
        if(hqhk.c()) {
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            aqfe aqfe1 = (aqfe)hftp2.b_message;
            aqfe1.b |= 2;
            aqfe1.d = v;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            aqfe aqfe2 = (aqfe)hftp2.b_message;
            aqfe2.b |= 1;
            aqfe2.c = 0L;
            return hftp2;
        }
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        aqfe aqfe3 = (aqfe)hftp2.b_message;
        aqfe3.b |= 1;
        aqfe3.c = v;
        return hftp2;
    }
}

