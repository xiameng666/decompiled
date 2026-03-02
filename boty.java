public final class boty implements gfsi {
    public final boul a;
    public final ByteString b;
    public final hfwn c;

    public boty(boul boul0, ByteString hfsf0, hfwn hfwn0) {
        this.a = boul0;
        this.b = hfsf0;
        this.c = hfwn0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fqyq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ByteString hfsf0 = this.b;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((fqyq)hftv0).b |= 1;
        ((fqyq)hftv0).c = hfsf0;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        fqyq fqyq0 = (fqyq)hftp0.b_message;
        this.c.getClass();
        fqyq0.d = this.c;
        fqyq0.b |= 2;
        fqyq fqyq1 = (fqyq)hftp0.N_build();
        fqyg fqyg0 = this.a.a(((fqzl)object0), gfqx.a);
        hfwn hfwn0 = hfyn.b;
        int v1 = -1;
        for(int v = 0; v < ((fqzl)fqyg0.b_message).o.size(); ++v) {
            if(fqyg0.a(v).c.equals(hfsf0)) {
                fqyg0.o(v, fqyq1);
                return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
            }
            hfwn hfwn1 = fqyg0.a(v).d;
            if(hfwn1 == null) {
                hfwn1 = hfwn.a;
            }
            if(hfym.a(hfwn1, hfwn0) < 0) {
                hfwn0 = fqyg0.a(v).d;
                if(hfwn0 == null) {
                    hfwn0 = hfwn.a;
                }
                v1 = v;
            }
        }
        if(((fqzl)fqyg0.b_message).o.size() == 0x30) {
            fqyg0.o(v1, fqyq1);
            return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
        }
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        fqzl fqzl0 = (fqzl)fqyg0.b_message;
        fqyq1.getClass();
        fqzl0.d();
        fqzl0.o.add(fqyq1);
        return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
    }
}

