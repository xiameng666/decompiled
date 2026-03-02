import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;

public final class akxi implements Runnable {
    public final String a;
    public final cuwu b;

    public akxi(String s, cuwu cuwu0) {
        this.a = s;
        this.b = cuwu0;
    }

    @Override
    public final void run() {
        akyf akyf0 = akyf.c(AppContextProvider.a());
        ByteString hfsf0 = ByteString.copyFrom(this.b.k);
        try {
            akyf0.e();
            akyf0.a(this.a).g(this.a, hfsf0);
        }
        catch(ywm ywm0) {
            a.ae(akyf.a.j(), "processReceivedMessage error", ywm0);
        }
    }
}

