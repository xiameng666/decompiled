final class fosf extends fosi {
    public static final fosf a;

    static {
        fosf.a = new fosf();
    }

    @Override  // fosi
    public final MessageLite a(String s, Object object0) {
        int v = ((Long)object0).intValue();
        if(v == 0) {
            return null;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)iczf.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        iczf iczf0 = (iczf)hftp0.b_message;
        iczf0.b |= 1;
        iczf0.c = v;
        if(s != null) {
            iczg iczg0 = fosl.d(s);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            iczf iczf1 = (iczf)hftp0.b_message;
            iczg0.getClass();
            iczf1.d = iczg0;
            iczf1.b |= 2;
        }
        return (iczf)hftp0.N_build();
    }

    @Override  // fosi
    public final MessageLite b(MessageLite hfvm0, MessageLite hfvm1) {
        if(((iczf)hfvm0) != null && ((iczf)hfvm1) != null) {
            if((((iczf)hfvm0).b & 1) != 0) {
                int v = ((iczf)hfvm0).c - ((iczf)hfvm1).c;
                if(v == 0) {
                    return null;
                }
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)iczf.a).v_newBuilder();
                if((((iczf)hfvm0).b & 2) != 0) {
                    iczg iczg0 = ((iczf)hfvm0).d;
                    if(iczg0 == null) {
                        iczg0 = iczg.a;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    iczf iczf0 = (iczf)hftp0.b_message;
                    iczg0.getClass();
                    iczf0.d = iczg0;
                    iczf0.b |= 2;
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                iczf iczf1 = (iczf)hftp0.b_message;
                iczf1.b |= 1;
                iczf1.c = v;
                return (iczf)hftp0.N_build();
            }
            return null;
        }
        return (iczf)hfvm0;
    }

    @Override  // fosi
    public final String c(MessageLite hfvm0) {
        iczg iczg0 = ((iczf)hfvm0).d;
        if(iczg0 == null) {
            iczg0 = iczg.a;
        }
        return iczg0.d;
    }
}

