import j..util.DesugarCollections;
import java.util.List;

public final class gbox {
    public static final hcqv a(gbot gbot0, long v, int v1) {
        hcqu hcqu0 = hcqt.a(((hftr)((ProtoLiteMessage)hcqv.a).v_newBuilder()));
        hcqu0.b(gbot0.a());
        hcqu0.e();
        hcqu0.d(v);
        hfta hfta0 = hdtr.f;
        ibuq.e(hfta0, "oneOfDataConditionExtension");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hdtr.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        hdtq hdtq0 = hdtq.b;
        ibuq.f(hdtq0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdtr)hftp0.b_message).e = hdtq0.c;
        ((hdtr)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hdto.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hdto hdto0 = (hdto)hftp1.b_message;
        hdto0.b |= 1;
        hdto0.c = v1;
        ProtoLiteMessage hftv0 = hftp1.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((hdto)hftv0), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdtr hdtr0 = (hdtr)hftp0.b_message;
        ((hdto)hftv0).getClass();
        hdtr0.d = (hdto)hftv0;
        hdtr0.c = 2;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        hcqu0.c(hfta0, ((hdtr)hftv1));
        return hcqu0.a();
    }

    public static final hdrl b(gbot gbot0, int v, hdrl hdrl0, hcnu hcnu0) {
        ibuq.f(hdrl0, "child");
        ibuq.f(hcnu0, "oneOfData");
        hdrk hdrk0 = hdrj.a(((hftr)((ProtoLiteMessage)hdrl.a).v_newBuilder()));
        hdrk0.f(gbot0.e());
        hdrk0.b((hcnu0.c == null ? hcos.a : hcnu0.c).c);
        hfta hfta0 = hdua.e;
        hdrk0.d(hfta0.a());
        ibuq.e(hfta0, "oneOfNodeExtension");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hdua.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdua hdua0 = (hdua)hftp0.b_message;
        hdua0.b |= 1;
        hdua0.c = v;
        List list0 = DesugarCollections.unmodifiableList(hdua0.d);
        ibuq.e(list0, "getChildList(...)");
        new hfxu(list0);
        ibuq.f(hdrl0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdua hdua1 = (hdua)hftp0.b_message;
        hdrl0.getClass();
        hdua1.b();
        hdua1.d.add(hdrl0);
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        hdrk0.c(hfta0, ((hdua)hftv0));
        return hdrk0.a();
    }

    public static final hdud c(int v, long v1) {
        hftr hftr0 = (hftr)((ProtoLiteMessage)hdud.a).v_newBuilder();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hdud hdud0 = (hdud)hftr0.b_message;
        hdud0.b |= 1;
        hdud0.c = v;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hdud hdud1 = (hdud)hftr0.b_message;
        hfui hfui0 = hdud1.d;
        if(!hfui0.c()) {
            hdud1.d = ProtoLiteMessage.D(hfui0);
        }
        hdud1.d.g(v1);
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)hftr0).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdud)hftv0;
    }

    public static final void d(hftr hftr0, int v) {
        hfta hfta0 = hdty.f;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hdty.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdty)hftp0.b_message).e = 2;
        ((hdty)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hdtw.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hdtw hdtw0 = (hdtw)hftp1.b_message;
        hdtw0.b |= 1;
        hdtw0.c = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdty hdty0 = (hdty)hftp0.b_message;
        hdtw hdtw1 = (hdtw)hftp1.N_build();
        hdtw1.getClass();
        hdty0.d = hdtw1;
        hdty0.c = 3;
        hftr0.n(hfta0, hftp0.N_build());
    }

    public static final void e(hftr hftr0, int v, List list0) {
        ibuq.f(list0, "oneOfOptions");
        hcos hcos0 = ((hcnu)hftr0.b_message).c;
        if(hcos0 == null) {
            hcos0 = hcos.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcos0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hcos0));
        hfta hfta0 = hdtz.d;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hdtz.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hdtz hdtz0 = (hdtz)hftp1.b_message;
        hdtz0.b |= 1;
        hdtz0.c = v;
        ((hftr)hftp0).n(hfta0, hftp1.N_build());
        hcos hcos1 = (hcos)((ProtoLiteBuilder)(((hftr)hftp0))).N_build();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcnu hcnu0 = (hcnu)hftr0.b_message;
        hcos1.getClass();
        hcnu0.c = hcos1;
        hcnu0.b |= 1;
        hfta hfta1 = hdtt.c;
        int v1 = hfta1.a();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcnu hcnu1 = (hcnu)hftr0.b_message;
        hcnu1.b |= 8;
        hcnu1.i = v1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hdtt.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hdtt hdtt0 = (hdtt)hftp2.b_message;
        hdtt0.b();
        hfrj.E(list0, hdtt0.b);
        hftr0.n(hfta1, hftp2.N_build());
    }
}

