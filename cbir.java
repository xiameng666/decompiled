import android.net.Uri.Builder;
import android.net.Uri;

public final class cbir {
    public String a;
    private final String b;
    private final gvkw c;
    private final gvku d;

    public cbir(String s, gvkw gvkw0, gvku gvku0, int v) {
        ibuq.f(s, "sessionId");
        super();
        this.b = s;
        this.a = null;
        if((v & 8) != 0) {
            gvkw0 = null;
        }
        this.c = gvkw0;
        if((v & 16) != 0) {
            gvku0 = null;
        }
        this.d = gvku0;
    }

    public final void a(gvkq gvkq0, ibts ibts0) {
        ibuq.f(gvkq0, "eventType");
        gvib gvib0 = gvia.a(((hftr)((ProtoLiteMessage)gvij.a).v_newBuilder()));
        gvhy gvhy0 = gvhx.a(((ProtoLiteMessage)gvhl.a).v_newBuilder());
        gvkw gvkw0 = this.c;
        if(gvkw0 != null) {
            gvhy0.d(gvkw0);
        }
        gvhy0.c(this.b);
        gvku gvku0 = this.d;
        if(gvku0 != null) {
            ProtoLiteBuilder hftp0 = gvhy0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gvhl)hftp0.b_message).h = gvku0.i;
            ((gvhl)hftp0.b_message).b |= 0x20;
        }
        ibts0.a(gvhy0);
        gvib0.b(gvhy0.a());
        gvij gvij0 = gvib0.a();
        if(this.a != null) {
            cczb cczb0 = cfvq.v().c(((ProtoLiteMessage)gvij0));
            cczb0.b = this.a;
            cczb0.c = (int)gvkq0.er;
            cczb0.a();
            return;
        }
        cczb cczb1 = cfvm.v().c(((ProtoLiteMessage)gvij0));
        cczb1.c = (int)gvkq0.er;
        cczb1.a();
    }

    public final void b() {
        cbir.e(this, gvkq.at);
    }

    public final void c(gvky gvky0) {
        ibuq.f(gvky0, "fragmentId");
        cbiq cbiq0 = new cbiq(gvky0);
        this.a(gvkq.au, cbiq0);
    }

    public static final String d(Uri uri0) {
        String s = new Uri.Builder().scheme(uri0.getScheme()).authority(uri0.getAuthority()).path(uri0.getPath()).build().toString();
        ibuq.e(s, "toString(...)");
        return s;
    }

    public static void e(cbir cbir0, gvkq gvkq0) {
        cbir0.a(gvkq0, new cbik());
    }
}

