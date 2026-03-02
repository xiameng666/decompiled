import android.content.Context;

public final class cqil {
    public static hgzq a(hgzp hgzp0, Context context0) {
        ibuq.f(hgzp0, "logEventType");
        ibuq.f(context0, "context");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgzq.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgzn.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        hgzk hgzk0 = hgzk.e;
        ibuq.f(hgzk0, "value");
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
        ProtoLiteMessage hftv1 = hftp1.N_build();
        ibuq.e(hftv1, "build(...)");
        ibuq.f(((hgzn)hftv1), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgzq hgzq0 = (hgzq)hftp0.b_message;
        ((hgzn)hftv1).getClass();
        hgzq0.f = (hgzn)hftv1;
        hgzq0.b |= 16;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hgzt.a).v_newBuilder();
        ibuq.f(hftp2, "builder");
        boolean z = fhcd.g(context0);
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hgzt hgzt0 = (hgzt)hftp2.b_message;
        hgzt0.b |= 0x100;
        hgzt0.c = z;
        ProtoLiteMessage hftv2 = hftp2.N_build();
        ibuq.e(hftv2, "build(...)");
        ibuq.f(((hgzt)hftv2), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgzq hgzq1 = (hgzq)hftp0.b_message;
        ((hgzt)hftv2).getClass();
        hgzq1.h = (hgzt)hftv2;
        hgzq1.b |= 0x40;
        ibuq.f(hgzp0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgzq)hftp0.b_message).c = hgzp0.fh;
        ((hgzq)hftp0.b_message).b |= 2;
        ProtoLiteMessage hftv3 = hftp0.N_build();
        ibuq.e(hftv3, "build(...)");
        return (hgzq)hftv3;
    }
}

