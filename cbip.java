import android.net.Uri;

public final class cbip implements ibts {
    public final String a;

    public cbip(String s) {
        this.a = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((gvhy)object0), "$this$logEvent");
        gvlf gvlf0 = gvle.a(((ProtoLiteMessage)gvhw.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvla.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        String s = cbir.d(Uri.parse(this.a));
        ibuq.f(s, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvla gvla0 = (gvla)hftp0.b_message;
        s.getClass();
        gvla0.b |= 1;
        gvla0.c = s;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gvla)hftv0), "value");
        ProtoLiteBuilder hftp1 = gvlf0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gvhw gvhw0 = (gvhw)hftp1.b_message;
        ((gvla)hftv0).getClass();
        gvhw0.d = (gvla)hftv0;
        gvhw0.c = 2;
        ((gvhy)object0).f(gvlf0.a());
        return ibom.a;
    }
}

