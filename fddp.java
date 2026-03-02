import android.util.Log;

public final class fddp implements evpz {
    public final fddr a;

    public fddp(fddr fddr0) {
        this.a = fddr0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        if(Log.isLoggable("wearable.Consents", 4)) {
            Log.i("wearable.Consents", "[ConsentFragment] marking activity successful");
        }
        fdds fdds0 = this.a.e;
        fdak fdak0 = fdds0.a;
        if(fdak0 != null) {
            fdak0.setResult(-1);
            fdds0.a.finish();
        }
    }
}

