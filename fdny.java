public final class fdny {
    public static void a(fdoc fdoc0) {
        fdny.c(fdoc0, null, null);
    }

    public static void b(fdoc fdoc0, String s) {
        fdny.c(fdoc0, s, null);
    }

    public static void c(fdoc fdoc0, String s, String s1) {
        fdny.d(fdoc0, s, s1, 1);
    }

    public static void d(fdoc fdoc0, String s, String s1, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gikz.a).v_newBuilder();
        if(!gfta.c(s)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gikz gikz0 = (gikz)hftp0.b_message;
            s.getClass();
            gikz0.b |= 2;
            gikz0.d = s;
        }
        if(!gfta.c(s1)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gikz gikz1 = (gikz)hftp0.b_message;
            s1.getClass();
            gikz1.b |= 1;
            gikz1.c = s1;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gilb.a).v_newBuilder();
        gikz gikz2 = (gikz)hftp0.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gilb gilb0 = (gilb)hftp1.b_message;
        gikz2.getClass();
        gilb0.c = gikz2;
        gilb0.b |= 1;
        gilb gilb1 = (gilb)hftp1.N_build();
        if(hzxv.a.d().g()) {
            ccyt ccyt0 = fdob.b().b.c(fdoc0.a());
            ccyv ccyv0 = ccyv.a(((MessageLite)gilb1));
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ccwq.a).v_newBuilder();
            String s2 = ccyt0.a;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            s2.getClass();
            ((ccwq)hftv0).b |= 1;
            ((ccwq)hftv0).c = s2;
            ccwp ccwp0 = ccwp.b;
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp2.b_message;
            ((ccwq)hftv1).d = ccwp0.g;
            ((ccwq)hftv1).b |= 2;
            if(!hftv1.isImmutable()) {
                hftp2.ensureMutable();
            }
            ccwq ccwq0 = (ccwq)hftp2.b_message;
            ccwq0.b |= 0x20;
            ccwq0.h = (long)v;
            ccyt0.a(hftp2, ccyv0);
            return;
        }
        fdob.b().a(fdoc0).a(0L, ((long)v), ayuy.a(((MessageLite)gilb1)));
    }
}

