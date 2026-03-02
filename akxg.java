import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;

public final class akxg implements Runnable {
    public final String a;

    public akxg(String s) {
        this.a = s;
    }

    @Override
    public final void run() {
        akyf akyf0 = akyf.c(AppContextProvider.a());
        try {
            akyf0.e();
            akyf0.a(this.a).b(this.a);
        }
        catch(ywm ywm0) {
            a.ae(akyf.a.j(), "onConnectionFailed error", ywm0);
        }
    }
}

