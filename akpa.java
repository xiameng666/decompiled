import android.app.Application;
import android.os.Bundle;
import android.os.HandlerThread;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class akpa extends lny {
    public final clht a;
    final akky b;
    public final akjl c;
    public final lqi d;
    private final HandlerThread e;
    private final ScheduledExecutorService f;

    public akpa(Application application0) {
        super(application0);
        HandlerThread handlerThread0 = new HandlerThread("AuthManaged-PauseAppUpdates");
        this.e = handlerThread0;
        this.d = new lqi(akoz.a);
        handlerThread0.start();
        this.a = new clht(handlerThread0.getLooper());
        bbll bbll0 = new bbll(1, 9);
        this.f = bbll0;
        this.b = new akky(application0, bbll0);
        ibuq.f(application0, "context");
        this.c = new akjr(application0, bbll0);
    }

    public final void b() {
        Bundle bundle0 = akpa.f();
        Log.i("Auth", "[AuthManaged, PlaySetupServiceV2Proxy] Pausing app updates");
        gmcd gmcd0 = glzd.g(this.b.c(), new akkr(this.b, bundle0), this.b.b);
        try {
            Integer integer0 = (Integer)((glyq)gmcd0).v(hpxu.a.d().c(), TimeUnit.MILLISECONDS);
            Log.i("Auth", "[AuthManaged, PauseAppUpdatesViewModel] Pause app update result: " + integer0);
            if(((int)integer0) == 0) {
                Log.i("Auth", "[AuthManaged, PauseAppUpdatesViewModel] App updates paused");
                this.d.ii(akoz.b);
                return;
            }
            if(((int)integer0) == 2) {
                Log.i("Auth", "[AuthManaged, PauseAppUpdatesViewModel] App updates pause cancelled");
                this.d.ii(akoz.c);
                return;
            }
            this.d.ii(akoz.c);
            Log.i("Auth", "[AuthManaged, PauseAppUpdatesViewModel] Pause app updates result: " + integer0);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            Log.i("Auth", "[AuthManaged, PauseAppUpdatesViewModel] Pause app updates exception: ", exception0);
            this.d.ii(akoz.c);
        }
    }

    public final void e() {
        if(hpxu.g()) {
            this.c.b();
            this.d.ii(akoz.d);
            return;
        }
        if(this.d.ij() == akoz.d) {
            return;
        }
        akov akov0 = () -> {
            Bundle bundle0 = akpa.f();
            Log.i("Auth", "[AuthManaged, PlaySetupServiceV2Proxy] Resuming app updates");
            gmcd gmcd0 = glzd.g(this.b.c(), new akks(this.b, bundle0), this.b.b);
            try {
                ((glyq)gmcd0).v(hpxu.a.d().e(), TimeUnit.MILLISECONDS);
                this.d.ii(akoz.d);
                Log.i("Auth", "[AuthManaged, PauseAppUpdatesViewModel] Resume app update completed.");
            }
            catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                Log.i("Auth", "[AuthManaged, PauseAppUpdatesViewModel] Resume app updates exception: ", exception0);
                this.d.ii(akoz.e);
            }
        };
        this.a.post(akov0);
    }

    private static final Bundle f() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("caller_id", "AuthManaged");
        return bundle0;
    }
}

