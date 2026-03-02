public final class ekam implements gfsi {
    public final String a;
    public final long b;

    public ekam(String s, long v) {
        this.a = s;
        this.b = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        String s;
        int v1 = -1;
        for(int v = 0; true; ++v) {
            s = this.a;
            if(v >= ((ejyo)object0).t.size()) {
                break;
            }
            if(((ejxr)((ejyo)object0).t.get(v)).c.equals(s)) {
                v1 = v;
            }
        }
        long v2 = this.b;
        if(v1 != -1) {
            ejxr ejxr0 = (ejxr)((ejyo)object0).t.get(v1);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ejxr0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)ejxr0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ejxr ejxr1 = (ejxr)hftp0.b_message;
            ejxr1.b |= 2;
            ejxr1.d = v2;
            ejxr ejxr2 = (ejxr)hftp0.N_build();
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ejyo)object0))).jf(5, null);
            hftp1.X(((ProtoLiteMessage)(((ejyo)object0))));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ejyo ejyo0 = (ejyo)hftp1.b_message;
            ejxr2.getClass();
            ejyo0.c();
            ejyo0.t.set(v1, ejxr2);
            return (ejyo)hftp1.N_build();
        }
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ejyo)object0))).jf(5, null);
        hftp2.X(((ProtoLiteMessage)(((ejyo)object0))));
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)ejxr.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp3.b_message;
        s.getClass();
        ((ejxr)hftv0).b |= 1;
        ((ejxr)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp3.ensureMutable();
        }
        ejxr ejxr3 = (ejxr)hftp3.b_message;
        ejxr3.b |= 2;
        ejxr3.d = v2;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ejyo ejyo1 = (ejyo)hftp2.b_message;
        ejxr ejxr4 = (ejxr)hftp3.N_build();
        ejxr4.getClass();
        ejyo1.c();
        ejyo1.t.add(ejxr4);
        return (ejyo)hftp2.N_build();
    }
}

