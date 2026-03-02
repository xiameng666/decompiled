public final class atox implements ibts {
    public final String a;
    public final String b;

    public atox(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ProtoLiteBuilder hftp1;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((atph)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((atph)object0))));
        ibuq.e(hftp0, "toBuilder(...)");
        String s = this.a;
        atpg atpg0 = atpg.a;
        s.getClass();
        atpg atpg1 = (atpg)((atph)object0).b.get(s);
        if(atpg1 == null) {
            atpg1 = atpg0;
        }
        if(atpg1 == null) {
            hftp1 = ((ProtoLiteMessage)atpg0).v_newBuilder();
        }
        else {
            hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)atpg1).jf(5, null);
            hftp1.X(((ProtoLiteMessage)atpg1));
        }
        ibuq.c(hftp1);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((atpg)hftv0).b |= 4;
        ((atpg)hftv0).e = true;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        atpg atpg2 = (atpg)hftp1.b_message;
        this.b.getClass();
        atpg2.b |= 1;
        atpg2.c = this.b;
        hftp0.cW(s, ((atpg)hftp1.N_build()));
        return (atph)hftp0.N_build();
    }
}

