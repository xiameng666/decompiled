import java.util.TimeZone;

public final class dvgc {
    private final dmkl a;
    private final dmhi b;
    private final ggfp c;
    private final String d;

    public dvgc(dmkl dmkl0, dmhi dmhi0, ggfp ggfp0, String s) {
        this.a = dmkl0;
        this.b = dmhi0;
        this.c = ggfp0;
        this.d = s;
    }

    public final void a(String s, gged_interceptors gged0, dpug dpug0, dpuf dpuf0) {
        dmhi dmhi0 = this.b;
        guym guym0 = edkv.a(dmhi0.d, gfta.b(this.d));
        guyr guyr0 = (guyr)((ProtoLiteMessage)guys.a).v_newBuilder();
        if(!guyr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)guyr0).ensureMutable();
        }
        guys guys0 = (guys)guyr0.b_message;
        s.getClass();
        guys0.c = 1;
        guys0.d = s;
        guyr0.k(gged0);
        guyr0.a(this.c);
        String s1 = TimeZone.getDefault().getID();
        if(!guyr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)guyr0).ensureMutable();
        }
        guys guys1 = (guys)guyr0.b_message;
        s1.getClass();
        guys1.f = s1;
        if(!guyr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)guyr0).ensureMutable();
        }
        guys guys2 = (guys)guyr0.b_message;
        guym0.getClass();
        guys2.g = guym0;
        guys2.b |= 2;
        String s2 = this.a.c();
        if(!guyr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)guyr0).ensureMutable();
        }
        guys guys3 = (guys)guyr0.b_message;
        s2.getClass();
        guys3.i = s2;
        guys guys4 = (guys)((ProtoLiteBuilder)guyr0).N_build();
        dptv.m(dmhi0, dpuj.be, ((MessageLite)guys4), ((MessageLite)guyt.a), dpug0, dpuf0);
    }

    public final void b(String s, dpug dpug0, dpuf dpuf0) {
        dmhi dmhi0 = this.b;
        guym guym0 = edkv.a(dmhi0.d, gfta.b(this.d));
        guyu guyu0 = (guyu)((ProtoLiteMessage)guyv.a).v_newBuilder();
        if(!guyu0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)guyu0).ensureMutable();
        }
        guyv guyv0 = (guyv)guyu0.b_message;
        s.getClass();
        guyv0.c = 1;
        guyv0.d = s;
        guyu0.a(this.c);
        String s1 = TimeZone.getDefault().getID();
        if(!guyu0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)guyu0).ensureMutable();
        }
        guyv guyv1 = (guyv)guyu0.b_message;
        s1.getClass();
        guyv1.f = s1;
        if(!guyu0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)guyu0).ensureMutable();
        }
        ((guyv)guyu0.b_message).g = 6;
        if(!guyu0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)guyu0).ensureMutable();
        }
        guyv guyv2 = (guyv)guyu0.b_message;
        guym0.getClass();
        guyv2.h = guym0;
        guyv2.b |= 1;
        guyv guyv3 = (guyv)((ProtoLiteBuilder)guyu0).N_build();
        dptv.m(dmhi0, dpuj.bo, ((MessageLite)guyv3), ((MessageLite)guyw.a), dpug0, dpuf0);
    }
}

