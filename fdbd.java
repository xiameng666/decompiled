import android.util.Log;

public final class fdbd implements evpo {
    public final fdbf a;

    public fdbd(fdbf fdbf0) {
        this.a = fdbf0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        if(evql0.n()) {
            if(Log.isLoggable("wearable.ConsentRecord", 3)) {
                Log.d("wearable.ConsentRecord", "Read Watch specific consents successfully");
            }
            return evrg.d(((ffco)evql0.j()));
        }
        if(((evqu)evql0).d) {
            if(Log.isLoggable("wearable.ConsentRecord", 5)) {
                Log.w("wearable.ConsentRecord", "readOptinConsent cancelled");
            }
            return evrg.b();
        }
        if(Log.isLoggable("wearable.ConsentRecord", 5)) {
            Log.w("wearable.ConsentRecord", "Failed to read Watch specific consent, falling back to global consents", evql0.i());
        }
        return this.a.a();
    }
}

