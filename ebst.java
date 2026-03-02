import java.util.Set;

public final class ebst {
    public static final Set a;
    public final fhwb b;

    static {
        ebst.a = ibqg.c(new String[]{"com.google.android.gms.pay.sidecar", "com.felicanetworks.mfc", "com.felicanetworks.mfm.main"});
    }

    public ebst(fhwb fhwb0) {
        ibuq.f(fhwb0, "semanticLogger");
        super();
        this.b = fhwb0;
    }

    public final void a(String s, int v) {
        ibuq.f(s, "accountName");
        fhvz fhvz0 = fhwa.a(v);
        fhvz0.c(fhwp.b(s));
        fhwa fhwa0 = fhvz0.a();
        this.b.a(fhwa0);
    }

    public final void b(String s, int v, long v1, int v2, String s1) {
        ibuq.f(s, "accountName");
        fhvz fhvz0 = fhwa.a(v);
        fhvz0.c(fhwp.b(s));
        fhvz0.b(ebss.a(v1, v2, s1));
        fhwa fhwa0 = fhvz0.a();
        this.b.a(fhwa0);
    }

    public final void c(int v, long v1, int v2, String s) {
        fhvz fhvz0 = fhwa.a(v);
        fhvz0.c(fhwp.c());
        fhvz0.b(ebss.a(v1, v2, s));
        fhwa fhwa0 = fhvz0.a();
        this.b.a(fhwa0);
    }

    public final void d(String s, int v, long v1, int v2, gtni gtni0, gurm gurm0) {
        ibuq.f(s, "accountName");
        ibuq.f(gtni0, "loggableServiceProvider");
        ibuq.f(gurm0, "origin");
        fhvz fhvz0 = fhwa.a(v);
        fhvz0.c(fhwp.b(s));
        fhvz0.b(ebss.c(v1, v2, 4));
        ibuq.f(gtni0, "loggableServiceProvider");
        ibuq.f(gurm0, "origin");
        gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
        gjca0.i();
        gjlo gjlo0 = gjln.a(((ProtoLiteMessage)gjma.a).v_newBuilder());
        gjlo0.c(gtni0);
        gjlo0.b(gurm0);
        gjca0.h(gjlo0.a());
        gjce gjce0 = gjca0.a();
        fhvz0.b(new fhvu(gjdq.a, gjce0));
        fhwa fhwa0 = fhvz0.a();
        this.b.a(fhwa0);
    }

    public static void e(ebst ebst0, String s, int v, long v1, int v2, int v3) {
        if((v3 & 8) != 0) {
            v2 = 0;
        }
        ebst0.b(s, v, v1, v2, null);
    }

    public static void f(ebst ebst0, int v, long v1, int v2) {
        ebst0.c(v, v1, v2, null);
    }
}

