import android.os.health.HealthStats;

final class fosj extends fosi {
    public static final fosj a;

    static {
        fosj.a = new fosj();
    }

    @Override  // fosi
    public final MessageLite a(String s, Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)iczl.a).v_newBuilder();
        int v = (int)fosl.a(((HealthStats)object0), 50001);
        if(v != 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            iczl iczl0 = (iczl)hftp0.b_message;
            iczl0.b |= 1;
            iczl0.c = v;
        }
        int v1 = (int)fosl.a(((HealthStats)object0), 50002);
        if(v1 != 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            iczl iczl1 = (iczl)hftp0.b_message;
            iczl1.b |= 2;
            iczl1.d = v1;
        }
        if(s != null) {
            iczg iczg0 = fosl.d(s);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            iczl iczl2 = (iczl)hftp0.b_message;
            iczg0.getClass();
            iczl2.e = iczg0;
            iczl2.b |= 4;
        }
        MessageLite hfvm0 = (iczl)hftp0.N_build();
        return fosl.k(((iczl)hfvm0)) ? null : hfvm0;
    }

    @Override  // fosi
    public final MessageLite b(MessageLite hfvm0, MessageLite hfvm1) {
        if(((iczl)hfvm0) != null && ((iczl)hfvm1) != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)iczl.a).v_newBuilder();
            if((((iczl)hfvm0).b & 1) != 0) {
                int v = ((iczl)hfvm0).c - ((iczl)hfvm1).c;
                if(v != 0) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    iczl iczl0 = (iczl)hftp0.b_message;
                    iczl0.b |= 1;
                    iczl0.c = v;
                }
            }
            if((((iczl)hfvm0).b & 2) != 0) {
                int v1 = ((iczl)hfvm0).d - ((iczl)hfvm1).d;
                if(v1 != 0) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    iczl iczl1 = (iczl)hftp0.b_message;
                    iczl1.b |= 2;
                    iczl1.d = v1;
                }
            }
            iczg iczg0 = ((iczl)hfvm0).e;
            if(iczg0 == null) {
                iczg0 = iczg.a;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            iczl iczl2 = (iczl)hftp0.b_message;
            iczg0.getClass();
            iczl2.e = iczg0;
            iczl2.b |= 4;
            MessageLite hfvm2 = (iczl)hftp0.N_build();
            return fosl.k(((iczl)hfvm2)) ? null : hfvm2;
        }
        return (iczl)hfvm0;
    }

    @Override  // fosi
    public final String c(MessageLite hfvm0) {
        iczg iczg0 = ((iczl)hfvm0).e;
        if(iczg0 == null) {
            iczg0 = iczg.a;
        }
        return iczg0.d;
    }
}

