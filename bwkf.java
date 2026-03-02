import android.content.Context;

public final class bwkf extends bwzp {
    public bwkf() {
        super(gltq.d, 2);
    }

    @Override  // bwzp
    protected final Object a() {
        if(!huar.f()) {
            bwne.k("App history upload disabled by flag.");
        }
        return null;
    }

    public static void b(Context context0) {
        cljp cljp0 = cljp.a(context0);
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.icing.service.IcingGcmTaskService";
        clkn0.t("app-history-upload");
        clkn0.v(0);
        clkn0.e(huar.a.d().c(), huar.a.d().b());
        if(hubu.l()) {
            clkn0.f(0, 1);
        }
        else {
            clkn0.i(huar.k());
        }
        cljp0.f(clkn0.a());
    }
}

