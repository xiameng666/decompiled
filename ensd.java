public final class ensd implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fjau.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((fjau)hftv0).b |= 0x20;
        ((fjau)hftv0).d = "GddOdlhFaRegions";
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        fjau fjau0 = (fjau)hftp0.b_message;
        fjau0.b |= 0x40;
        fjau0.e = "semanticlocationhistory-region-data";
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fjat.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fjat fjat0 = (fjat)hftp1.b_message;
        hfui hfui0 = fjat0.b;
        if(!hfui0.c()) {
            fjat0.b = ProtoLiteMessage.D(hfui0);
        }
        hfrj.E(((gged_interceptors)object0), fjat0.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fjau fjau1 = (fjau)hftp0.b_message;
        fjat fjat1 = (fjat)hftp1.N_build();
        fjat1.getClass();
        fjau1.g = fjat1;
        fjau1.b |= 0x40000;
        return (fjau)hftp0.N_build();
    }
}

