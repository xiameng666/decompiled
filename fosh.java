import android.os.health.HealthStats;

final class fosh extends fosi {
    public static final fosh a;

    static {
        fosh.a = new fosh();
    }

    @Override  // fosi
    public final MessageLite a(String s, Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)iczk.a).v_newBuilder();
        long v = fosl.a(((HealthStats)object0), 30001);
        if(v != 0L) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            iczk iczk0 = (iczk)hftp0.b_message;
            iczk0.b |= 1;
            iczk0.c = v;
        }
        long v1 = fosl.a(((HealthStats)object0), 30002);
        if(v1 != 0L) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            iczk iczk1 = (iczk)hftp0.b_message;
            iczk1.b |= 2;
            iczk1.d = v1;
        }
        long v2 = fosl.a(((HealthStats)object0), 30003);
        if(v2 != 0L) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            iczk iczk2 = (iczk)hftp0.b_message;
            iczk2.b |= 4;
            iczk2.e = v2;
        }
        long v3 = fosl.a(((HealthStats)object0), 30004);
        if(v3 != 0L) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            iczk iczk3 = (iczk)hftp0.b_message;
            iczk3.b |= 8;
            iczk3.f = v3;
        }
        long v4 = fosl.a(((HealthStats)object0), 30005);
        if(v4 != 0L) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            iczk iczk4 = (iczk)hftp0.b_message;
            iczk4.b |= 16;
            iczk4.g = v4;
        }
        long v5 = fosl.a(((HealthStats)object0), 30006);
        if(v5 != 0L) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            iczk iczk5 = (iczk)hftp0.b_message;
            iczk5.b |= 0x20;
            iczk5.h = v5;
        }
        if(s != null) {
            iczg iczg0 = fosl.d(s);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            iczk iczk6 = (iczk)hftp0.b_message;
            iczg0.getClass();
            iczk6.i = iczg0;
            iczk6.b |= 0x40;
        }
        MessageLite hfvm0 = (iczk)hftp0.N_build();
        return fosl.j(((iczk)hfvm0)) ? null : hfvm0;
    }

    @Override  // fosi
    public final MessageLite b(MessageLite hfvm0, MessageLite hfvm1) {
        if(((iczk)hfvm0) != null && ((iczk)hfvm1) != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)iczk.a).v_newBuilder();
            if((((iczk)hfvm0).b & 1) != 0) {
                long v = ((iczk)hfvm0).c - ((iczk)hfvm1).c;
                if(v != 0L) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    iczk iczk0 = (iczk)hftp0.b_message;
                    iczk0.b |= 1;
                    iczk0.c = v;
                }
            }
            if((((iczk)hfvm0).b & 2) != 0) {
                long v1 = ((iczk)hfvm0).d - ((iczk)hfvm1).d;
                if(v1 != 0L) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    iczk iczk1 = (iczk)hftp0.b_message;
                    iczk1.b |= 2;
                    iczk1.d = v1;
                }
            }
            if((((iczk)hfvm0).b & 4) != 0) {
                long v2 = ((iczk)hfvm0).e - ((iczk)hfvm1).e;
                if(v2 != 0L) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    iczk iczk2 = (iczk)hftp0.b_message;
                    iczk2.b |= 4;
                    iczk2.e = v2;
                }
            }
            if((((iczk)hfvm0).b & 8) != 0) {
                long v3 = ((iczk)hfvm0).f - ((iczk)hfvm1).f;
                if(v3 != 0L) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    iczk iczk3 = (iczk)hftp0.b_message;
                    iczk3.b |= 8;
                    iczk3.f = v3;
                }
            }
            if((((iczk)hfvm0).b & 16) != 0) {
                long v4 = ((iczk)hfvm0).g - ((iczk)hfvm1).g;
                if(v4 != 0L) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    iczk iczk4 = (iczk)hftp0.b_message;
                    iczk4.b |= 16;
                    iczk4.g = v4;
                }
            }
            if((((iczk)hfvm0).b & 0x20) != 0) {
                long v5 = ((iczk)hfvm0).h - ((iczk)hfvm1).h;
                if(v5 != 0L) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    iczk iczk5 = (iczk)hftp0.b_message;
                    iczk5.b |= 0x20;
                    iczk5.h = v5;
                }
            }
            iczg iczg0 = ((iczk)hfvm0).i;
            if(iczg0 == null) {
                iczg0 = iczg.a;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            iczk iczk6 = (iczk)hftp0.b_message;
            iczg0.getClass();
            iczk6.i = iczg0;
            iczk6.b |= 0x40;
            MessageLite hfvm2 = (iczk)hftp0.N_build();
            return fosl.j(((iczk)hfvm2)) ? null : hfvm2;
        }
        return (iczk)hfvm0;
    }

    @Override  // fosi
    public final String c(MessageLite hfvm0) {
        iczg iczg0 = ((iczk)hfvm0).i;
        if(iczg0 == null) {
            iczg0 = iczg.a;
        }
        return iczg0.d;
    }
}

