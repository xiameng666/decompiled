public final class ekad implements gfsi {
    public final String a;
    public final String b;
    public final long c;

    public ekad(String s, String s1, long v) {
        this.a = s;
        this.b = s1;
        this.c = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        String s1;
        String s;
        int v1 = -1;
        for(int v = 0; true; ++v) {
            s = this.b;
            s1 = this.a;
            if(v >= ((ejyo)object0).s.size()) {
                break;
            }
            ejxm ejxm0 = (ejxm)((ejyo)object0).s.get(v);
            if(ejxm0.c.equals(s1) && ejxm0.d.equals(s)) {
                v1 = v;
            }
        }
        long v2 = this.c;
        if(v1 != -1) {
            ejxm ejxm1 = (ejxm)((ejyo)object0).s.get(v1);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ejxm1).jf(5, null);
            hftp0.X(((ProtoLiteMessage)ejxm1));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ejxm ejxm2 = (ejxm)hftp0.b_message;
            ejxm2.b |= 4;
            ejxm2.e = v2;
            ejxm ejxm3 = (ejxm)hftp0.N_build();
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ejyo)object0))).jf(5, null);
            hftp1.X(((ProtoLiteMessage)(((ejyo)object0))));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ejyo ejyo0 = (ejyo)hftp1.b_message;
            ejxm3.getClass();
            ejyo0.b();
            ejyo0.s.set(v1, ejxm3);
            return (ejyo)hftp1.N_build();
        }
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ejyo)object0))).jf(5, null);
        hftp2.X(((ProtoLiteMessage)(((ejyo)object0))));
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)ejxm.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp3.b_message;
        s1.getClass();
        ((ejxm)hftv0).b |= 1;
        ((ejxm)hftv0).c = s1;
        if(!hftv0.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp3.b_message;
        s.getClass();
        ((ejxm)hftv1).b |= 2;
        ((ejxm)hftv1).d = s;
        if(!hftv1.isImmutable()) {
            hftp3.ensureMutable();
        }
        ejxm ejxm4 = (ejxm)hftp3.b_message;
        ejxm4.b |= 4;
        ejxm4.e = v2;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ejyo ejyo1 = (ejyo)hftp2.b_message;
        ejxm ejxm5 = (ejxm)hftp3.N_build();
        ejxm5.getClass();
        ejyo1.b();
        ejyo1.s.add(ejxm5);
        return (ejyo)hftp2.N_build();
    }
}

