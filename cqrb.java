import android.content.Context;
import j..util.Optional;

public final class cqrb {
    public static gmcd a(Context context0, hgzp hgzp0) {
        return glzd.f(cqrb.e(context0), new cqqx(hgzp0), gmap.a);
    }

    public static hgzq b(hgzp hgzp0, hgzi hgzi0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgzq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgzq)hftp0.b_message).c = hgzp0.fh;
        ((hgzq)hftp0.b_message).b |= 2;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgzn.a).v_newBuilder();
        hgzk hgzk0 = hgzk.e;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hgzn)hftv0).c = hgzk0.i;
        ((hgzn)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        hgzn.b(((hgzn)hftp1.b_message));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgzq hgzq0 = (hgzq)hftp0.b_message;
        hgzn hgzn0 = (hgzn)hftp1.N_build();
        hgzn0.getClass();
        hgzq0.f = hgzn0;
        hgzq0.b |= 16;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hgzb.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hgzb hgzb0 = (hgzb)hftp2.b_message;
        hgzi0.getClass();
        hgzb0.d = hgzi0;
        hgzb0.b |= 0x80;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgzq hgzq1 = (hgzq)hftp0.b_message;
        hgzb hgzb1 = (hgzb)hftp2.N_build();
        hgzb1.getClass();
        hgzq1.d = hgzb1;
        hgzq1.b |= 4;
        return (hgzq)hftp0.N_build();
    }

    public static gmcd c(Context context0, int v) {
        return glzd.f(cqrb.e(context0), new cqqy(v), gmap.a);
    }

    public static gmcd d(Context context0, hgzp hgzp0, int v, Optional optional0) {
        return glzd.f(cqrb.e(context0), new cqqv(v, optional0, hgzp0), gmap.a);
    }

    private static gmcd e(Context context0) {
        int v;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgzi.a).v_newBuilder();
        Boolean boolean0 = cqix.p.c();
        if(boolean0 != null) {
            v = boolean0.booleanValue() ? 4 : 5;
        }
        else if(hxwm.r()) {
            v = 2;
        }
        else {
            v = 3;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgzi)hftp0.b_message).d = v - 1;
        ((hgzi)hftp0.b_message).b |= 2;
        return hxwm.j() ? glzd.f(glzd.f(cqjh.a(context0).c(), new cqqz(), gmap.a), new cqqw(hftp0), gmap.a) : gmbu.i(hftp0);
    }
}

