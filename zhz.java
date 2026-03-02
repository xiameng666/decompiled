import j..util.DesugarCollections;
import java.util.Map;

public final class zhz {
    public static final zht a(grwp grwp0) {
        if(grwp0 != null && zhz.c(grwp0)) {
            int v = (grwp0.c == null ? grxw.a : grwp0.c).c;
            Map map0 = DesugarCollections.unmodifiableMap((grwp0.c == null ? grxw.a : grwp0.c).d);
            ibuq.e(map0, "getResourceParamsMap(...)");
            zhv zhv0 = new zhv(v, map0);
            String s = (grwp0.d == null ? grum.a : grwp0.d).c;
            ibuq.e(s, "getAnchor(...)");
            zhs zhs0 = new zhs(s);
            String s1 = grwp0.f;
            ibuq.e(s1, "getAriaLabel(...)");
            return new zht(zhv0, zhs0, s1);
        }
        return null;
    }

    public static final grwp b(zht zht0) {
        if(zht0 == null) {
            return null;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grwp.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        grxy grxy0 = grxx.a(((grxu)((ProtoLiteMessage)grxw.a).v_newBuilder()));
        grxy0.b(zht0.a.a);
        grxy0.d();
        grxy0.c(zht0.a.b);
        grxw grxw0 = grxy0.a();
        ibuq.f(grxw0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grwp grwp0 = (grwp)hftp0.b_message;
        grxw0.getClass();
        grwp0.c = grxw0;
        grwp0.b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grum.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        String s = zht0.b.a;
        ibuq.f(s, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grum grum0 = (grum)hftp1.b_message;
        s.getClass();
        grum0.b |= 1;
        grum0.c = s;
        ProtoLiteMessage hftv0 = hftp1.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((grum)hftv0), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grwp grwp1 = (grwp)hftp0.b_message;
        ((grum)hftv0).getClass();
        grwp1.d = (grum)hftv0;
        grwp1.b |= 2;
        String s1 = zht0.c;
        ibuq.f(s1, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grwp grwp2 = (grwp)hftp0.b_message;
        s1.getClass();
        grwp2.b |= 8;
        grwp2.f = s1;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        return (grwp)hftv1;
    }

    public static final boolean c(grwp grwp0) {
        return grwp0 == null ? false : (grwp0.c == null ? grxw.a : grwp0.c).c != 0 || ((grwp0.d == null ? grum.a : grwp0.d).b & 1) != 0;
    }
}

