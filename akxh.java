import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;

public final class akxh implements Runnable {
    public final String a;

    public akxh(String s) {
        this.a = s;
    }

    @Override
    public final void run() {
        akyf akyf0 = akyf.c(AppContextProvider.a());
        try {
            akyf0.e();
            akyf0.a(this.a).d(this.a);
        }
        catch(ywm ywm0) {
            a.ae(akyf.a.j(), "onConnectionSuccess error", ywm0);
        }
    }
}

