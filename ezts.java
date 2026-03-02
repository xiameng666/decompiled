import android.content.Context;
import java.util.Random;

public final class ezts {
    private final ayud a;
    private final ayvm b;

    static {
        new Random(System.currentTimeMillis());
    }

    public ezts(Context context0, String s) {
        ayud ayud0 = new ayud(context0, "IDENTITY_FRONTEND", s);
        super();
        this.a = ayud0;
        this.b = fhbe.b(context0, new gqvw());
    }

    public final void a(String s, String s1, long v, int v1, boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
        hftr hftr0 = (hftr)((ProtoLiteMessage)gqxs.a).v_newBuilder();
        gqsp gqsp0 = gqsp.dV;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((gqxs)hftr0.b_message).c = gqsp0.fJ;
        ((gqxs)hftr0.b_message).b |= 1;
        gqsm gqsm0 = z ? gqsm.pW : gqsm.pX;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((gqxs)hftr0.b_message).e = gqsm0.UH;
        ((gqxs)hftr0.b_message).b |= 4;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs.b(((gqxs)hftr0.b_message));
        gqwe gqwe0 = ezts.c(s, s1, v, Integer.toString(v1));
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs gqxs0 = (gqxs)hftr0.b_message;
        gqwe0.getClass();
        gqxs0.j = gqwe0;
        gqxs0.b |= 0x200;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqxt gqxt0 = (gqxt)hftp0.b_message;
        gqxs gqxs1 = (gqxs)((ProtoLiteBuilder)hftr0).N_build();
        gqxs1.getClass();
        gqxt0.c = gqxs1;
        gqxt0.b |= 1;
        this.b(((gqxt)hftp0.N_build()));
    }

    public final void b(gqxt gqxt0) {
        if(hzdj.a.l().E()) {
            ciof.v().c(((ProtoLiteMessage)gqxt0)).a();
            return;
        }
        this.a.j(((MessageLite)gqxt0), this.b).d();
    }

    public static final gqwe c(String s, String s1, long v, String s2) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqwe.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gqwe)hftv0).b |= 1;
        ((gqwe)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gqwe)hftv1).b |= 2;
        ((gqwe)hftv1).d = s1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gqwe)hftv2).b |= 4;
        ((gqwe)hftv2).e = (int)v;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqwe gqwe0 = (gqwe)hftp0.b_message;
        s2.getClass();
        gqwe0.b |= 8;
        gqwe0.f = s2;
        return (gqwe)hftp0.N_build();
    }
}

