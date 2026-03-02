public final class acxy implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        adrh adrh0 = ((adre)object0).e;
        if(adrh0 == null) {
            adrh0 = adrh.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)adrh0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)adrh0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((adrh)hftp0.b_message).d = 0L;
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((adre)object0))).jf(5, null);
        hftp1.X(((ProtoLiteMessage)(((adre)object0))));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        adre adre0 = (adre)hftp1.b_message;
        adrh adrh1 = (adrh)hftp0.N_build();
        adrh1.getClass();
        adre0.e = adrh1;
        adre0.b |= 1;
        return (adre)hftp1.N_build();
    }
}

