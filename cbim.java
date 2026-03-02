import android.net.Uri;

public final class cbim implements ibts {
    public final String a;

    public cbim(String s) {
        this.a = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((gvhy)object0), "$this$logEvent");
        gvlf gvlf0 = gvle.a(((ProtoLiteMessage)gvhw.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvkz.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        String s = cbir.d(Uri.parse(this.a));
        ibuq.f(s, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvkz gvkz0 = (gvkz)hftp0.b_message;
        s.getClass();
        gvkz0.b |= 1;
        gvkz0.c = s;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gvkz)hftv0), "value");
        ProtoLiteBuilder hftp1 = gvlf0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gvhw gvhw0 = (gvhw)hftp1.b_message;
        ((gvkz)hftv0).getClass();
        gvhw0.d = (gvkz)hftv0;
        gvhw0.c = 1;
        ((gvhy)object0).f(gvlf0.a());
        return ibom.a;
    }
}

