import android.net.Uri;

public final class cbin implements ibts {
    public final int a;
    public final String b;

    public cbin(int v, String s) {
        this.a = v;
        this.b = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((gvhy)object0), "$this$logEvent");
        gvlf gvlf0 = gvle.a(((ProtoLiteMessage)gvhw.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvld.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvld gvld0 = (gvld)hftp0.b_message;
        gvld0.b |= 1;
        gvld0.c = this.a;
        String s = cbir.d(Uri.parse(this.b));
        ibuq.f(s, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvld gvld1 = (gvld)hftp0.b_message;
        s.getClass();
        gvld1.b |= 2;
        gvld1.d = s;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gvld)hftv0), "value");
        ProtoLiteBuilder hftp1 = gvlf0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gvhw gvhw0 = (gvhw)hftp1.b_message;
        ((gvld)hftv0).getClass();
        gvhw0.g = (gvld)hftv0;
        gvhw0.b |= 1;
        ((gvhy)object0).f(gvlf0.a());
        return ibom.a;
    }
}

