import android.net.Uri;
import java.util.Objects;
import java.util.UUID;

public final class bcpe extends lsb implements bcoh {
    public static final baun a;
    public final lqi b;
    public final lqd c;
    public final lqd d;
    public bcqx e;
    public Uri f;
    private final lqi g;

    static {
        bcpe.a = bcrh.a("c11n_web_view_model");
    }

    public bcpe() {
        lqi lqi0 = new lqi();
        this.g = lqi0;
        lqi lqi1 = new lqi();
        this.b = lqi1;
        this.c = lqi0;
        this.d = lqi1;
    }

    @Override  // bcoh
    public final void a(bcog bcog0) {
        bcqx bcqx4;
        baun baun0 = bcpe.a;
        Objects.toString(bcog0);
        baun0.d("onReceiveJsCallback: " + bcog0.toString(), new Object[0]);
        bcqx bcqx0 = null;
        if((bcog0 instanceof bcof)) {
            baun0.d("onReceiveJsCallback: trigger", new Object[0]);
            bcqx bcqx1 = this.e;
            if(bcqx1 == null) {
                ibuq.j("usageStatistics");
            }
            else {
                bcqx0 = bcqx1;
            }
            this.h(bcqx0, gmhn.b);
            return;
        }
        if((bcog0 instanceof bcoe)) {
            baun0.d("onReceiveJsCallback: success", new Object[0]);
            this.g.l(((bcoe)bcog0).b);
            bcqx bcqx2 = this.e;
            if(bcqx2 == null) {
                ibuq.j("usageStatistics");
            }
            else {
                bcqx0 = bcqx2;
            }
            this.g(bcqx0, gmhn.b, ((bcoe)bcog0).a);
            return;
        }
        if(!(bcog0 instanceof bcod)) {
            throw new ibnq();
        }
        int v = ((bcod)bcog0).a;
        baun0.d("onReceiveJsCallback: failure " + v, new Object[0]);
        this.g.l(((bcod)bcog0).d);
        bcqx bcqx3 = this.e;
        if(bcqx3 == null) {
            ibuq.j("usageStatistics");
            bcqx4 = null;
        }
        else {
            bcqx4 = bcqx3;
        }
        bcpe.c(this, bcqx4, ((bcod)bcog0).b, Integer.valueOf(v), gmhn.b, ((bcod)bcog0).c);
    }

    public final void b(bcpd bcpd0) {
        bcqx bcqx4;
        bcqx bcqx0 = null;
        if((bcpd0 instanceof bcpc)) {
            bcpe.a.d("onWebViewClientResult: success", new Object[0]);
            bcqx bcqx1 = this.e;
            if(bcqx1 == null) {
                ibuq.j("usageStatistics");
                bcqx1 = null;
            }
            this.g(bcqx1, gmhn.c, null);
            return;
        }
        if((bcpd0 instanceof bcpb)) {
            bcpe.a.d("onWebViewClientResult: loading", new Object[0]);
            bcqx bcqx2 = this.e;
            if(bcqx2 == null) {
                ibuq.j("usageStatistics");
            }
            else {
                bcqx0 = bcqx2;
            }
            this.h(bcqx0, gmhn.c);
            return;
        }
        if(!(bcpd0 instanceof bcpa)) {
            throw new ibnq();
        }
        bcpe.a.d("onWebViewClientResult: error", new Object[0]);
        bcqx bcqx3 = this.e;
        if(bcqx3 == null) {
            ibuq.j("usageStatistics");
            bcqx4 = null;
        }
        else {
            bcqx4 = bcqx3;
        }
        bcpe.c(this, bcqx4, ((bcpa)bcpd0).a, ((bcpa)bcpd0).b, gmhn.c, ((bcpa)bcpd0).c);
    }

    static void c(bcpe bcpe0, bcqx bcqx0, gmfx gmfx0, Integer integer0, gmhn gmhn0, String s) {
        gmfn gmfn0 = bcpe.i(gmhn0, gmhl.d, bcpe0.f, s, gmfx0, integer0);
        gmif gmif0 = gmie.a(((ProtoLiteMessage)gmes.a).v_newBuilder());
        gmif0.b(gmgb.m);
        gmif0.d(gmfn0);
        gmes gmes0 = gmif0.a();
        bcqx0.y(new bcrd(bcpe0.f()), gmes0);
    }

    static gmfn e(gmhn gmhn0, gmhl gmhl0, Uri uri0, String s, int v) {
        if((v & 8) != 0) {
            s = null;
        }
        return bcpe.i(gmhn0, gmhl0, uri0, s, null, null);
    }

    private final String f() {
        Uri uri0 = this.f;
        if(uri0 != null) {
            String s = uri0.getQueryParameter("request_id");
            if(s != null) {
                return s;
            }
        }
        String s1 = UUID.randomUUID().toString();
        ibuq.e(s1, "toString(...)");
        return s1;
    }

    private final void g(bcqx bcqx0, gmhn gmhn0, String s) {
        gmfn gmfn0 = bcpe.e(gmhn0, gmhl.c, this.f, s, 0x70);
        gmif gmif0 = gmie.a(((ProtoLiteMessage)gmes.a).v_newBuilder());
        gmif0.b(gmgb.m);
        gmif0.d(gmfn0);
        gmes gmes0 = gmif0.a();
        bcqx0.y(new bcrd(this.f()), gmes0);
    }

    private final void h(bcqx bcqx0, gmhn gmhn0) {
        gmfn gmfn0 = bcpe.e(gmhn0, gmhl.b, this.f, null, 120);
        gmif gmif0 = gmie.a(((ProtoLiteMessage)gmes.a).v_newBuilder());
        gmif0.b(gmgb.m);
        gmif0.d(gmfn0);
        gmes gmes0 = gmif0.a();
        bcqx0.y(new bcrd(this.f()), gmes0);
    }

    private static final gmfn i(gmhn gmhn0, gmhl gmhl0, Uri uri0, String s, gmfx gmfx0, Integer integer0) {
        String s1;
        hfwn hfwn0 = bcql.c(System.currentTimeMillis());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmfn.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(gmhl0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmfn gmfn0 = (gmfn)hftp0.b_message;
        gmfn0.d = gmhl0.a();
        gmfn0.b |= 2;
        ibuq.f(gmhn0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmfn gmfn1 = (gmfn)hftp0.b_message;
        gmfn1.e = gmhn0.a();
        gmfn1.b |= 4;
        if(uri0 == null) {
            s1 = "";
        }
        else {
            s1 = uri0.toString();
            if(s1 == null) {
                s1 = "";
            }
        }
        ibuq.f(s1, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmfn gmfn2 = (gmfn)hftp0.b_message;
        s1.getClass();
        gmfn2.b |= 1;
        gmfn2.c = s1;
        ibuq.c(hfwn0);
        ibuq.f(hfwn0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hfwn0.getClass();
        ((gmfn)hftv0).i = hfwn0;
        ((gmfn)hftv0).b |= 0x40;
        if(gmfx0 != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gmfn gmfn3 = (gmfn)hftp0.b_message;
            gmfn3.g = gmfx0.a();
            gmfn3.b |= 16;
        }
        if(s != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gmfn gmfn4 = (gmfn)hftp0.b_message;
            gmfn4.b |= 8;
            gmfn4.f = s;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gmfn gmfn5 = (gmfn)hftp0.b_message;
            gmfn5.b |= 0x20;
            gmfn5.h = v;
        }
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        return (gmfn)hftv1;
    }
}

