import android.content.Context;
import android.util.Pair;
import com.google.android.gms.auth.api.credentials.fido.operations.chromesync.PasskeysUpdatedIntentOperation;
import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;
import j..util.Comparator.-CC;
import java.util.HashMap;

public final class afwt implements gmbg {
    @Override  // gmbg
    public final void a(Throwable throwable0) {
        a.ae(PasskeysUpdatedIntentOperation.a.j(), "Failed to update passkeys cache", throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        String s = (String)((Pair)object0).first;
        gged_interceptors gged0 = (gged_interceptors)((Pair)object0).second;
        Context context0 = AppContextProvider.a();
        gged_interceptors gged1 = ggch.j(gged0).o(Comparator.-CC.comparing(new afls()));
        HashMap hashMap0 = new HashMap();
        gpgf gpgf0 = new gpgf();
        int v = gged1.size();
        int[] arr_v = new int[v];
        int v1 = 0;
        while(v1 < gged1.size()) {
            afoo afoo0 = (afoo)gged1.get(v1);
            int v2 = aflt.b(gpgf0, afoo0.c.g, hashMap0);
            int v3 = aflt.b(gpgf0, afoo0.c.l, hashMap0);
            int v4 = gpgf0.a(afoo0.c.f.toByteArray());
            int v5 = aflt.b(gpgf0, afoo0.d.name, hashMap0);
            long v6 = afoo0.c.j;
            long v7 = afoo0.c.n;
            gpgf0.w(9);
            gpgf0.k(7, v7, 0L);
            gpgf0.k(6, v6, 0L);
            gpgf0.D(8, v5);
            gpgf0.D(4, gpgf0.a(afoo0.h().toByteArray()));
            gpgf0.D(3, v3);
            gpgf0.D(2, aflt.b(gpgf0, afoo0.j(), hashMap0));
            gpgf0.D(1, v2);
            gpgf0.D(0, v4);
            gpgf0.A(5, afoo0.k());
            int v8 = gpgf0.d();
            gpgf0.u(v8, 4);
            gpgf0.u(v8, 6);
            gpgf0.u(v8, 8);
            gpgf0.u(v8, 10);
            gpgf0.u(v8, 12);
            gpgf0.u(v8, 20);
            arr_v[v1] = v8;
            ++v1;
            hashMap0 = hashMap0;
            context0 = context0;
            arr_v = arr_v;
            gged1 = gged1;
        }
        gpgf0.r();
        gpgf0.x(4, v, 4);
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            gpgf0.l(arr_v[v]);
        }
        int v9 = gpgf0.e();
        int v10 = gpgf0.b(s);
        gpgf0.w(3);
        gpgf0.D(1, v10);
        gpgf0.D(0, v9);
        gpgf0.E(2, 1);
        int v11 = gpgf0.d();
        gpgf0.u(v11, 4);
        gpgf0.o(v11, "pskc");
        if(!aflt.h(context0, gpgf0.g())) {
            ((ggtj)PasskeysUpdatedIntentOperation.a.i()).x("Failed to write passkeys cache");
        }
    }
}

