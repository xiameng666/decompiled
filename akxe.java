import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;

public final class akxe implements Runnable {
    public final String a;

    public akxe(String s) {
        this.a = s;
    }

    @Override
    public final void run() {
        akyf akyf0 = akyf.c(AppContextProvider.a());
        try {
            akyf0.e();
            akyf0.a(this.a).e(this.a);
        }
        catch(ywm ywm0) {
            a.ae(akyf.a.j(), "onDisconnected error", ywm0);
        }
    }
}

