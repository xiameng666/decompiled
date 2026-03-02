import java.util.TimeZone;

public final class dvgj {
    private final dmkl a;
    private final dmhi b;
    private final ggfp c;
    private final String d;

    public dvgj(dmkl dmkl0, dmhi dmhi0, ggfp ggfp0, String s) {
        this.a = dmkl0;
        this.b = dmhi0;
        this.c = ggfp0;
        this.d = s;
    }

    public final void a(guzt guzt0, gged_interceptors gged0, dpug dpug0, dpuf dpuf0) {
        dmhi dmhi0 = this.b;
        guym guym0 = edkv.a(dmhi0.d, gfta.b(this.d));
        guyr guyr0 = (guyr)((ProtoLiteMessage)guys.a).v_newBuilder();
        if(!guyr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)guyr0).ensureMutable();
        }
        ((guys)guyr0.b_message).d = guzt0;
        ((guys)guyr0.b_message).c = 10;
        guyr0.k(gged0);
        guyr0.a(this.c);
        String s = TimeZone.getDefault().getID();
        if(!guyr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)guyr0).ensureMutable();
        }
        guys guys0 = (guys)guyr0.b_message;
        s.getClass();
        guys0.f = s;
        if(!guyr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)guyr0).ensureMutable();
        }
        guys guys1 = (guys)guyr0.b_message;
        guym0.getClass();
        guys1.g = guym0;
        guys1.b |= 2;
        String s1 = this.a.c();
        if(!guyr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)guyr0).ensureMutable();
        }
        guys guys2 = (guys)guyr0.b_message;
        s1.getClass();
        guys2.i = s1;
        guys guys3 = (guys)((ProtoLiteBuilder)guyr0).N_build();
        dptv.m(dmhi0, dpuj.be, ((MessageLite)guys3), ((MessageLite)guyt.a), dpug0, dpuf0);
    }

    public final void b(guzt guzt0, dpug dpug0, dpuf dpuf0) {
        dmhi dmhi0 = this.b;
        guym guym0 = edkv.a(dmhi0.d, gfta.b(this.d));
        guyu guyu0 = (guyu)((ProtoLiteMessage)guyv.a).v_newBuilder();
        if(!guyu0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)guyu0).ensureMutable();
        }
        ((guyv)guyu0.b_message).d = guzt0;
        ((guyv)guyu0.b_message).c = 8;
        guyu0.a(this.c);
        String s = TimeZone.getDefault().getID();
        if(!guyu0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)guyu0).ensureMutable();
        }
        guyv guyv0 = (guyv)guyu0.b_message;
        s.getClass();
        guyv0.f = s;
        if(!guyu0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)guyu0).ensureMutable();
        }
        ((guyv)guyu0.b_message).g = 6;
        if(!guyu0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)guyu0).ensureMutable();
        }
        guyv guyv1 = (guyv)guyu0.b_message;
        guym0.getClass();
        guyv1.h = guym0;
        guyv1.b |= 1;
        guyv guyv2 = (guyv)((ProtoLiteBuilder)guyu0).N_build();
        dptv.m(dmhi0, dpuj.bo, ((MessageLite)guyv2), ((MessageLite)guyw.a), dpug0, dpuf0);
    }
}

