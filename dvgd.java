import java.util.TimeZone;

public final class dvgd {
    private final dmkl a;
    private final dmhi b;
    private final ggfp c;

    static {
        bboh.b("Pay", bbcu.cZ);
    }

    public dvgd(dmkl dmkl0, dmhi dmhi0, ggfp ggfp0) {
        this.a = dmkl0;
        this.b = dmhi0;
        this.c = ggfp0;
    }

    public final void a(String s, dpug dpug0, dpuf dpuf0) {
        if(gfta.c(s)) {
            dpuf0.a(new dpui("Invalid valuable ID for fetch."));
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvas.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gvas)hftv0).b |= 1;
        ((gvas)hftv0).c = s;
        ggfp ggfp0 = this.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvas gvas0 = (gvas)hftp0.b_message;
        hfuf hfuf0 = gvas0.d;
        if(!hfuf0.c()) {
            gvas0.d = ProtoLiteMessage.C(hfuf0);
        }
        for(Object object0: ggfp0) {
            gvas0.d.i(((guwh)object0).a());
        }
        gvas gvas1 = (gvas)hftp0.N_build();
        dptv.m(this.b, dpuj.aY, ((MessageLite)gvas1), ((MessageLite)gvat.a), dpug0, dpuf0);
    }

    public final void b(String s, gged_interceptors gged0, dpug dpug0, dpuf dpuf0) {
        if(gfta.c(s)) {
            dpuf0.a(new dpui("Invalid JWT for save."));
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvam.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gvam)hftv0).b = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvam gvam0 = (gvam)hftp0.b_message;
        hfuo hfuo0 = gvam0.g;
        if(!hfuo0.c()) {
            gvam0.g = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(gged0, gvam0.g);
        ggfp ggfp0 = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvam gvam1 = (gvam)hftp0.b_message;
        hfuf hfuf0 = gvam1.c;
        if(!hfuf0.c()) {
            gvam1.c = ProtoLiteMessage.C(hfuf0);
        }
        for(Object object0: ggfp0) {
            gvam1.c.i(((guwh)object0).a());
        }
        String s1 = this.a.c();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvam gvam2 = (gvam)hftp0.b_message;
        s1.getClass();
        gvam2.d = s1;
        String s2 = TimeZone.getDefault().getID();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        s2.getClass();
        ((gvam)hftv1).e = s2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvam)hftp0.b_message).f = 6;
        gvam gvam3 = (gvam)hftp0.N_build();
        dptv.m(this.b, dpuj.cx, ((MessageLite)gvam3), ((MessageLite)gvan.a), dpug0, dpuf0);
    }

    public final void c(String s, dpug dpug0, dpuf dpuf0) {
        if(gfta.c(s)) {
            dpuf0.a(new dpui("Invalid JWT for fetch."));
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvao.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gvao)hftv0).b = s;
        ggfp ggfp0 = this.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvao gvao0 = (gvao)hftp0.b_message;
        hfuf hfuf0 = gvao0.c;
        if(!hfuf0.c()) {
            gvao0.c = ProtoLiteMessage.C(hfuf0);
        }
        for(Object object0: ggfp0) {
            gvao0.c.i(((guwh)object0).a());
        }
        String s1 = TimeZone.getDefault().getID();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        s1.getClass();
        ((gvao)hftv1).d = s1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvao)hftp0.b_message).e = 6;
        gvao gvao1 = (gvao)hftp0.N_build();
        dptv.m(this.b, dpuj.cy, ((MessageLite)gvao1), ((MessageLite)gvap.a), dpug0, dpuf0);
    }
}

