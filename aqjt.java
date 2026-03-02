public final class aqjt implements gfsi {
    public final String a;
    public final long b;

    public aqjt(String s, long v) {
        this.a = s;
        this.b = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        String s = this.a;
        aqhn aqhn0 = aqhn.a;
        s.getClass();
        aqhn aqhn1 = (aqhn)((aqhp)object0).b.get(s);
        if(aqhn1 != null) {
            aqhn0 = aqhn1;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)aqhn0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)aqhn0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqhn aqhn2 = (aqhn)hftp0.b_message;
        aqhn2.b |= 2;
        aqhn2.d = this.b;
        aqhn aqhn3 = (aqhn)hftp0.N_build();
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((aqhp)object0))).jf(5, null);
        hftp1.X(((ProtoLiteMessage)(((aqhp)object0))));
        hftp1.cP(s, aqhn3);
        return (aqhp)hftp1.N_build();
    }
}

