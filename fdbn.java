import android.util.Log;

public final class fdbn implements Runnable {
    public final fdch a;

    public fdbn(fdch fdch0) {
        this.a = fdch0;
    }

    @Override
    public final void run() {
        boolean z = fdci.a(ffgp.m());
        fdch fdch0 = this.a;
        if(z) {
            if(Log.isLoggable("wearable.Consents", 4)) {
                Log.i("wearable.Consents", "ConsentPerWatch feature is enabled, adding capability to local node");
            }
            if(hzvd.f()) {
                int v = fdch0.l.b(fdch0.e, fdqi.a, "consents_per_watch");
                if(!Log.isLoggable("wearable.Consents", 4)) {
                    return;
                }
                Log.i("wearable.Consents", "ConsentsPerWatchFeature feature is enabled. Added local capability: " + fcfp.a(v) + " (" + v + ")");
                return;
            }
            ffnc.b(fdch0.m.f("consents_per_watch").c(new ffmw()).g(new fdca()));
            return;
        }
        if(Log.isLoggable("wearable.Consents", 4)) {
            Log.i("wearable.Consents", "ConsentPerWatch feature is not enabled, removing capability from local node");
        }
        if(hzvd.f()) {
            int v1 = fdch0.l.c(fdch0.e, fdqi.a, "consents_per_watch");
            if(Log.isLoggable("wearable.Consents", 4)) {
                Log.i("wearable.Consents", "ConsentPerWatch feature is not enabled, status of removing capability from local node: " + fcfp.a(v1));
            }
            return;
        }
        ffnc.b(fdch0.m.i("consents_per_watch").c(new ffmy()).g(new fdcb()));
    }
}

