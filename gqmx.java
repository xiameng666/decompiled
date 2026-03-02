import java.util.Collection;
import java.util.Map.Entry;

public final class gqmx implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Collection collection0 = (Collection)((Map.Entry)object0).getValue();
        ggfp ggfp0 = ggch.j(collection0).l(new gqlu()).p();
        gftb.b(ggfp0.size() == 1, "All sign on realms of the provided credentials need to be equal and the list must not be empty.");
        String s = (String)ggfp0.om().next();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhyf.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhyf hhyf0 = (hhyf)hftp0.b_message;
        s.getClass();
        hhyf0.b |= 1;
        hhyf0.c = s;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hhyd.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s.getClass();
        ((hhyd)hftv0).b |= 1;
        ((hhyd)hftv0).c = s;
        hhyc hhyc0 = hhyc.c;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        int v = hhyc0.d;
        ((hhyd)hftp1.b_message).d = v;
        ((hhyd)hftp1.b_message).b |= 2;
        hhyd hhyd0 = (hhyd)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhyf hhyf1 = (hhyf)hftp0.b_message;
        hhyd0.getClass();
        hhyf1.d = hhyd0;
        hhyf1.b |= 2;
        gged_interceptors gged0 = gged_interceptors.l(((hhyf)hftp0.N_build()));
        String s1 = gqmp.a(gged0);
        gged_interceptors gged1 = ggch.j(collection0).l(new gqlv(s1, gged0)).n();
        gqls gqls0 = gqlt.a();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hhyo.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        s.getClass();
        ((hhyo)hftv1).b |= 1;
        ((hhyo)hftv1).c = s;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        ((hhyo)hftv2).d = v;
        ((hhyo)hftv2).b |= 2;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        hhyo.b(((hhyo)hftp2.b_message));
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hhyo.c(((hhyo)hftp2.b_message));
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hhyo hhyo0 = (hhyo)hftp2.b_message;
        hhyo0.b |= 4;
        hhyo0.e = "https://t1.gstatic.com/faviconV2?client=PASSWORD_MANAGER&type=FAVICON&fallback_opts=TYPE,SIZE,URL&size=32&nfrp=3";
        gqls0.c(((hhyo)hftp2.N_build()));
        gqls0.b(gged1);
        gqls0.b = s1;
        return gqls0.a();
    }
}

