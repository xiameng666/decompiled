import android.accounts.Account;
import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class ajgr {
    public final ianj_grpcChannel a;
    private final Account b;
    private final Context c;
    private final ajit d;
    private static final baun e;

    static {
        ajgr.e = new baun(new String[]{"CryptauthGrpcClient"}, null);
    }

    public ajgr(Context context0, Account account0, ajit ajit0, String s) {
        batl.s(account0);
        this.b = account0;
        this.c = context0;
        ibgx ibgx0 = new ibgx(s, ((int)hpta.a.g().d()));
        ibgx0.m(new bbft(0x40F));
        this.a = ibgx0.a();
        this.d = ajit0;
    }

    final iakr a() {
        String s2;
        adgg adgg0 = new adgg(this.c);
        String s = hpta.a.g().j();
        String s1 = adgg0.b(this.c, this.b, s);
        this.d.c = 0L;
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(new iaqk(this.c, s1, true));
        try {
            s2 = new aiga(this.c).b("com.google.android.gms");
        }
        catch(IOException | acse exception0) {
            ajgr.e.n("Exception while trying to retrieve appCert.", exception0, new Object[0]);
            s2 = null;
        }
        if(s2 != null) {
            arrayList0.add(new iaqd(s2));
        }
        iaof_metadata iaof0 = new iaof_metadata();
        iaof0.i(new iant("X-Goog-Api-Key", iaof_metadata.c), "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        iaof0.i(new iant("X-Android-Package", iaof_metadata.c), "com.google.android.gms");
        iaof0.i(new iant("X-Android-Cert", iaof_metadata.c), bbmq.l(this.c, "com.google.android.gms"));
        arrayList0.add(new ibjz(iaof0));
        return iala.a(this.a, arrayList0);
    }

    public final void b() {
        ianj_grpcChannel ianj0 = this.a;
        if(!ianj0.i()) {
            ianj0.d();
            try {
                ianj0.h(1L, TimeUnit.SECONDS);
            }
            catch(InterruptedException unused_ex) {
            }
        }
    }

    public final gmjx c() {
        iakr iakr0 = this.a();
        return (gmjx)((gmjx)gmjx.k(new gmjw(), iakr0)).o(hpta.f(), TimeUnit.SECONDS);
    }

    public final gmks d() {
        iakr iakr0 = this.a();
        return (gmks)((gmks)gmks.k(new gmkr(), iakr0)).o(hpta.f(), TimeUnit.SECONDS);
    }
}

