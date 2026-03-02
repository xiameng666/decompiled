final class bouw implements frhy {
    static final bouw a;

    static {
        bouw.a = new bouw();
    }

    @Override  // frhy
    public final gmcd a() {
        return gmbx.a;
    }

    @Override  // frhy
    public final gmcd b(MessageLite hfvm0) {
        fqys fqys0;
        if(((fqzl)hfvm0).c == 26) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqzl)hfvm0))).jf(5, null);
            hftp0.X(((ProtoLiteMessage)(((fqzl)hfvm0))));
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fqyt.a).v_newBuilder();
            if(((fqzl)hfvm0).c == 26) {
                fqys0 = fqys.b(((Integer)((fqzl)hfvm0).d).intValue());
                if(fqys0 == null) {
                    fqys0 = fqys.a;
                }
            }
            else {
                fqys0 = fqys.a;
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((fqyt)hftp1.b_message).c = fqys0.o;
            ((fqyt)hftp1.b_message).b |= 1;
            fqyt fqyt0 = (fqyt)hftp1.N_build();
            if(!((fqyg)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((fqyg)hftp0))).ensureMutable();
            }
            fqzl fqzl0 = (fqzl)((fqyg)hftp0).b_message;
            fqyt0.getClass();
            fqzl0.d = fqyt0;
            fqzl0.c = 0x1F;
            return gmbu.i(((fqzl)((ProtoLiteBuilder)(((fqyg)hftp0))).N_build()));
        }
        return gmbu.i(((fqzl)hfvm0));
    }

    @Override  // frhy
    public final gmcd c() {
        return gmbu.i(Boolean.valueOf(true));
    }
}

